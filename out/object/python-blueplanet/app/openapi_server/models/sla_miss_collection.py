# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.openapi_server.models.base_model_ import Model
from app.openapi_server.models.sla_miss import SLAMiss  # noqa: F401,E501
from openapi_server import util


class SLAMissCollection(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, sla_misses: List[SLAMiss]=None):  # noqa: E501
        """SLAMissCollection - a model defined in Swagger

        :param sla_misses: The sla_misses of this SLAMissCollection.  # noqa: E501
        :type sla_misses: List[SLAMiss]
        """
        self.swagger_types = {
            'sla_misses': List[SLAMiss]
        }

        self.attribute_map = {
            'sla_misses': 'sla_misses'
        }

        self._sla_misses = sla_misses

    @classmethod
    def from_dict(cls, dikt) -> 'SLAMissCollection':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The SLAMissCollection of this SLAMissCollection.  # noqa: E501
        :rtype: SLAMissCollection
        """
        return util.deserialize_model(dikt, cls)

    @property
    def sla_misses(self) -> List[SLAMiss]:
        """Gets the sla_misses of this SLAMissCollection.


        :return: The sla_misses of this SLAMissCollection.
        :rtype: List[SLAMiss]
        """
        return self._sla_misses

    @sla_misses.setter
    def sla_misses(self, sla_misses: List[SLAMiss]):
        """Sets the sla_misses of this SLAMissCollection.


        :param sla_misses: The sla_misses of this SLAMissCollection.
        :type sla_misses: List[SLAMiss]
        """

        self._sla_misses = sla_misses
