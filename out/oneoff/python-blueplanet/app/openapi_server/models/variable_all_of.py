# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.openapi_server.models.base_model_ import Model
from openapi_server import util


class VariableAllOf(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, value: str=None):  # noqa: E501
        """VariableAllOf - a model defined in Swagger

        :param value: The value of this VariableAllOf.  # noqa: E501
        :type value: str
        """
        self.swagger_types = {
            'value': str
        }

        self.attribute_map = {
            'value': 'value'
        }

        self._value = value

    @classmethod
    def from_dict(cls, dikt) -> 'VariableAllOf':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The Variable_allOf of this VariableAllOf.  # noqa: E501
        :rtype: VariableAllOf
        """
        return util.deserialize_model(dikt, cls)

    @property
    def value(self) -> str:
        """Gets the value of this VariableAllOf.


        :return: The value of this VariableAllOf.
        :rtype: str
        """
        return self._value

    @value.setter
    def value(self, value: str):
        """Sets the value of this VariableAllOf.


        :param value: The value of this VariableAllOf.
        :type value: str
        """

        self._value = value