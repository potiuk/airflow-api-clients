# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.openapi_server.models.base_model_ import Model
from app.openapi_server.models.config_option import ConfigOption  # noqa: F401,E501
from openapi_server import util


class ConfigSection(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, name: str=None, options: List[ConfigOption]=None):  # noqa: E501
        """ConfigSection - a model defined in Swagger

        :param name: The name of this ConfigSection.  # noqa: E501
        :type name: str
        :param options: The options of this ConfigSection.  # noqa: E501
        :type options: List[ConfigOption]
        """
        self.swagger_types = {
            'name': str,
            'options': List[ConfigOption]
        }

        self.attribute_map = {
            'name': 'name',
            'options': 'options'
        }

        self._name = name
        self._options = options

    @classmethod
    def from_dict(cls, dikt) -> 'ConfigSection':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ConfigSection of this ConfigSection.  # noqa: E501
        :rtype: ConfigSection
        """
        return util.deserialize_model(dikt, cls)

    @property
    def name(self) -> str:
        """Gets the name of this ConfigSection.


        :return: The name of this ConfigSection.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this ConfigSection.


        :param name: The name of this ConfigSection.
        :type name: str
        """

        self._name = name

    @property
    def options(self) -> List[ConfigOption]:
        """Gets the options of this ConfigSection.


        :return: The options of this ConfigSection.
        :rtype: List[ConfigOption]
        """
        return self._options

    @options.setter
    def options(self, options: List[ConfigOption]):
        """Sets the options of this ConfigSection.


        :param options: The options of this ConfigSection.
        :type options: List[ConfigOption]
        """

        self._options = options
