# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.openapi_server.models.base_model_ import Model
from app.openapi_server.models.config_section import ConfigSection  # noqa: F401,E501
from openapi_server import util


class Config(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, sections: List[ConfigSection]=None):  # noqa: E501
        """Config - a model defined in Swagger

        :param sections: The sections of this Config.  # noqa: E501
        :type sections: List[ConfigSection]
        """
        self.swagger_types = {
            'sections': List[ConfigSection]
        }

        self.attribute_map = {
            'sections': 'sections'
        }

        self._sections = sections

    @classmethod
    def from_dict(cls, dikt) -> 'Config':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The Config of this Config.  # noqa: E501
        :rtype: Config
        """
        return util.deserialize_model(dikt, cls)

    @property
    def sections(self) -> List[ConfigSection]:
        """Gets the sections of this Config.


        :return: The sections of this Config.
        :rtype: List[ConfigSection]
        """
        return self._sections

    @sections.setter
    def sections(self, sections: List[ConfigSection]):
        """Sets the sections of this Config.


        :param sections: The sections of this Config.
        :type sections: List[ConfigSection]
        """

        self._sections = sections
