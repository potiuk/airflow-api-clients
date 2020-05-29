# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.openapi_server.models.base_model_ import Model
from openapi_server import util


class TimeDelta(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, type: str=None, days: int=None, seconds: int=None, microsecond: int=None):  # noqa: E501
        """TimeDelta - a model defined in Swagger

        :param type: The type of this TimeDelta.  # noqa: E501
        :type type: str
        :param days: The days of this TimeDelta.  # noqa: E501
        :type days: int
        :param seconds: The seconds of this TimeDelta.  # noqa: E501
        :type seconds: int
        :param microsecond: The microsecond of this TimeDelta.  # noqa: E501
        :type microsecond: int
        """
        self.swagger_types = {
            'type': str,
            'days': int,
            'seconds': int,
            'microsecond': int
        }

        self.attribute_map = {
            'type': '__type',
            'days': 'days',
            'seconds': 'seconds',
            'microsecond': 'microsecond'
        }

        self._type = type
        self._days = days
        self._seconds = seconds
        self._microsecond = microsecond

    @classmethod
    def from_dict(cls, dikt) -> 'TimeDelta':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The TimeDelta of this TimeDelta.  # noqa: E501
        :rtype: TimeDelta
        """
        return util.deserialize_model(dikt, cls)

    @property
    def type(self) -> str:
        """Gets the type of this TimeDelta.


        :return: The type of this TimeDelta.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type: str):
        """Sets the type of this TimeDelta.


        :param type: The type of this TimeDelta.
        :type type: str
        """
        if type is None:
            raise ValueError("Invalid value for `type`, must not be `None`")  # noqa: E501

        self._type = type

    @property
    def days(self) -> int:
        """Gets the days of this TimeDelta.


        :return: The days of this TimeDelta.
        :rtype: int
        """
        return self._days

    @days.setter
    def days(self, days: int):
        """Sets the days of this TimeDelta.


        :param days: The days of this TimeDelta.
        :type days: int
        """

        self._days = days

    @property
    def seconds(self) -> int:
        """Gets the seconds of this TimeDelta.


        :return: The seconds of this TimeDelta.
        :rtype: int
        """
        return self._seconds

    @seconds.setter
    def seconds(self, seconds: int):
        """Sets the seconds of this TimeDelta.


        :param seconds: The seconds of this TimeDelta.
        :type seconds: int
        """

        self._seconds = seconds

    @property
    def microsecond(self) -> int:
        """Gets the microsecond of this TimeDelta.


        :return: The microsecond of this TimeDelta.
        :rtype: int
        """
        return self._microsecond

    @microsecond.setter
    def microsecond(self, microsecond: int):
        """Sets the microsecond of this TimeDelta.


        :param microsecond: The microsecond of this TimeDelta.
        :type microsecond: int
        """

        self._microsecond = microsecond
