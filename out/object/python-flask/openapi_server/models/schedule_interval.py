# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model_ import Model
from openapi_server.models.cron_expression import CronExpression
from openapi_server.models.relative_delta import RelativeDelta
from openapi_server.models.time_delta import TimeDelta
from openapi_server import util

from openapi_server.models.cron_expression import CronExpression  # noqa: E501
from openapi_server.models.relative_delta import RelativeDelta  # noqa: E501
from openapi_server.models.time_delta import TimeDelta  # noqa: E501

class ScheduleInterval(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, type=None, days=None, seconds=None, microsecond=None, years=None, months=None, leapdays=None, hours=None, minutes=None, microseconds=None, year=None, month=None, day=None, hour=None, minute=None, second=None, value=None):  # noqa: E501
        """ScheduleInterval - a model defined in OpenAPI

        :param type: The type of this ScheduleInterval.  # noqa: E501
        :type type: str
        :param days: The days of this ScheduleInterval.  # noqa: E501
        :type days: int
        :param seconds: The seconds of this ScheduleInterval.  # noqa: E501
        :type seconds: int
        :param microsecond: The microsecond of this ScheduleInterval.  # noqa: E501
        :type microsecond: int
        :param years: The years of this ScheduleInterval.  # noqa: E501
        :type years: int
        :param months: The months of this ScheduleInterval.  # noqa: E501
        :type months: int
        :param leapdays: The leapdays of this ScheduleInterval.  # noqa: E501
        :type leapdays: int
        :param hours: The hours of this ScheduleInterval.  # noqa: E501
        :type hours: int
        :param minutes: The minutes of this ScheduleInterval.  # noqa: E501
        :type minutes: int
        :param microseconds: The microseconds of this ScheduleInterval.  # noqa: E501
        :type microseconds: int
        :param year: The year of this ScheduleInterval.  # noqa: E501
        :type year: int
        :param month: The month of this ScheduleInterval.  # noqa: E501
        :type month: int
        :param day: The day of this ScheduleInterval.  # noqa: E501
        :type day: int
        :param hour: The hour of this ScheduleInterval.  # noqa: E501
        :type hour: int
        :param minute: The minute of this ScheduleInterval.  # noqa: E501
        :type minute: int
        :param second: The second of this ScheduleInterval.  # noqa: E501
        :type second: int
        :param value: The value of this ScheduleInterval.  # noqa: E501
        :type value: str
        """
        self.openapi_types = {
            'type': str,
            'days': int,
            'seconds': int,
            'microsecond': int,
            'years': int,
            'months': int,
            'leapdays': int,
            'hours': int,
            'minutes': int,
            'microseconds': int,
            'year': int,
            'month': int,
            'day': int,
            'hour': int,
            'minute': int,
            'second': int,
            'value': str
        }

        self.attribute_map = {
            'type': '__type',
            'days': 'days',
            'seconds': 'seconds',
            'microsecond': 'microsecond',
            'years': 'years',
            'months': 'months',
            'leapdays': 'leapdays',
            'hours': 'hours',
            'minutes': 'minutes',
            'microseconds': 'microseconds',
            'year': 'year',
            'month': 'month',
            'day': 'day',
            'hour': 'hour',
            'minute': 'minute',
            'second': 'second',
            'value': 'value'
        }

        self._type = type
        self._days = days
        self._seconds = seconds
        self._microsecond = microsecond
        self._years = years
        self._months = months
        self._leapdays = leapdays
        self._hours = hours
        self._minutes = minutes
        self._microseconds = microseconds
        self._year = year
        self._month = month
        self._day = day
        self._hour = hour
        self._minute = minute
        self._second = second
        self._value = value

    @classmethod
    def from_dict(cls, dikt) -> 'ScheduleInterval':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ScheduleInterval of this ScheduleInterval.  # noqa: E501
        :rtype: ScheduleInterval
        """
        return util.deserialize_model(dikt, cls)

    @property
    def type(self):
        """Gets the type of this ScheduleInterval.


        :return: The type of this ScheduleInterval.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type):
        """Sets the type of this ScheduleInterval.


        :param type: The type of this ScheduleInterval.
        :type type: str
        """
        if type is None:
            raise ValueError("Invalid value for `type`, must not be `None`")  # noqa: E501

        self._type = type

    @property
    def days(self):
        """Gets the days of this ScheduleInterval.


        :return: The days of this ScheduleInterval.
        :rtype: int
        """
        return self._days

    @days.setter
    def days(self, days):
        """Sets the days of this ScheduleInterval.


        :param days: The days of this ScheduleInterval.
        :type days: int
        """

        self._days = days

    @property
    def seconds(self):
        """Gets the seconds of this ScheduleInterval.


        :return: The seconds of this ScheduleInterval.
        :rtype: int
        """
        return self._seconds

    @seconds.setter
    def seconds(self, seconds):
        """Sets the seconds of this ScheduleInterval.


        :param seconds: The seconds of this ScheduleInterval.
        :type seconds: int
        """

        self._seconds = seconds

    @property
    def microsecond(self):
        """Gets the microsecond of this ScheduleInterval.


        :return: The microsecond of this ScheduleInterval.
        :rtype: int
        """
        return self._microsecond

    @microsecond.setter
    def microsecond(self, microsecond):
        """Sets the microsecond of this ScheduleInterval.


        :param microsecond: The microsecond of this ScheduleInterval.
        :type microsecond: int
        """

        self._microsecond = microsecond

    @property
    def years(self):
        """Gets the years of this ScheduleInterval.


        :return: The years of this ScheduleInterval.
        :rtype: int
        """
        return self._years

    @years.setter
    def years(self, years):
        """Sets the years of this ScheduleInterval.


        :param years: The years of this ScheduleInterval.
        :type years: int
        """

        self._years = years

    @property
    def months(self):
        """Gets the months of this ScheduleInterval.


        :return: The months of this ScheduleInterval.
        :rtype: int
        """
        return self._months

    @months.setter
    def months(self, months):
        """Sets the months of this ScheduleInterval.


        :param months: The months of this ScheduleInterval.
        :type months: int
        """

        self._months = months

    @property
    def leapdays(self):
        """Gets the leapdays of this ScheduleInterval.


        :return: The leapdays of this ScheduleInterval.
        :rtype: int
        """
        return self._leapdays

    @leapdays.setter
    def leapdays(self, leapdays):
        """Sets the leapdays of this ScheduleInterval.


        :param leapdays: The leapdays of this ScheduleInterval.
        :type leapdays: int
        """

        self._leapdays = leapdays

    @property
    def hours(self):
        """Gets the hours of this ScheduleInterval.


        :return: The hours of this ScheduleInterval.
        :rtype: int
        """
        return self._hours

    @hours.setter
    def hours(self, hours):
        """Sets the hours of this ScheduleInterval.


        :param hours: The hours of this ScheduleInterval.
        :type hours: int
        """

        self._hours = hours

    @property
    def minutes(self):
        """Gets the minutes of this ScheduleInterval.


        :return: The minutes of this ScheduleInterval.
        :rtype: int
        """
        return self._minutes

    @minutes.setter
    def minutes(self, minutes):
        """Sets the minutes of this ScheduleInterval.


        :param minutes: The minutes of this ScheduleInterval.
        :type minutes: int
        """

        self._minutes = minutes

    @property
    def microseconds(self):
        """Gets the microseconds of this ScheduleInterval.


        :return: The microseconds of this ScheduleInterval.
        :rtype: int
        """
        return self._microseconds

    @microseconds.setter
    def microseconds(self, microseconds):
        """Sets the microseconds of this ScheduleInterval.


        :param microseconds: The microseconds of this ScheduleInterval.
        :type microseconds: int
        """

        self._microseconds = microseconds

    @property
    def year(self):
        """Gets the year of this ScheduleInterval.


        :return: The year of this ScheduleInterval.
        :rtype: int
        """
        return self._year

    @year.setter
    def year(self, year):
        """Sets the year of this ScheduleInterval.


        :param year: The year of this ScheduleInterval.
        :type year: int
        """

        self._year = year

    @property
    def month(self):
        """Gets the month of this ScheduleInterval.


        :return: The month of this ScheduleInterval.
        :rtype: int
        """
        return self._month

    @month.setter
    def month(self, month):
        """Sets the month of this ScheduleInterval.


        :param month: The month of this ScheduleInterval.
        :type month: int
        """

        self._month = month

    @property
    def day(self):
        """Gets the day of this ScheduleInterval.


        :return: The day of this ScheduleInterval.
        :rtype: int
        """
        return self._day

    @day.setter
    def day(self, day):
        """Sets the day of this ScheduleInterval.


        :param day: The day of this ScheduleInterval.
        :type day: int
        """

        self._day = day

    @property
    def hour(self):
        """Gets the hour of this ScheduleInterval.


        :return: The hour of this ScheduleInterval.
        :rtype: int
        """
        return self._hour

    @hour.setter
    def hour(self, hour):
        """Sets the hour of this ScheduleInterval.


        :param hour: The hour of this ScheduleInterval.
        :type hour: int
        """

        self._hour = hour

    @property
    def minute(self):
        """Gets the minute of this ScheduleInterval.


        :return: The minute of this ScheduleInterval.
        :rtype: int
        """
        return self._minute

    @minute.setter
    def minute(self, minute):
        """Sets the minute of this ScheduleInterval.


        :param minute: The minute of this ScheduleInterval.
        :type minute: int
        """

        self._minute = minute

    @property
    def second(self):
        """Gets the second of this ScheduleInterval.


        :return: The second of this ScheduleInterval.
        :rtype: int
        """
        return self._second

    @second.setter
    def second(self, second):
        """Sets the second of this ScheduleInterval.


        :param second: The second of this ScheduleInterval.
        :type second: int
        """

        self._second = second

    @property
    def value(self):
        """Gets the value of this ScheduleInterval.


        :return: The value of this ScheduleInterval.
        :rtype: str
        """
        return self._value

    @value.setter
    def value(self, value):
        """Sets the value of this ScheduleInterval.


        :param value: The value of this ScheduleInterval.
        :type value: str
        """

        self._value = value
