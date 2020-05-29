# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model_ import Model
from openapi_server.models.event_log import EventLog
from openapi_server import util

from openapi_server.models.event_log import EventLog  # noqa: E501

class EventLogCollection(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, event_logs=None):  # noqa: E501
        """EventLogCollection - a model defined in OpenAPI

        :param event_logs: The event_logs of this EventLogCollection.  # noqa: E501
        :type event_logs: List[EventLog]
        """
        self.openapi_types = {
            'event_logs': List[EventLog]
        }

        self.attribute_map = {
            'event_logs': 'event_logs'
        }

        self._event_logs = event_logs

    @classmethod
    def from_dict(cls, dikt) -> 'EventLogCollection':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The EventLogCollection of this EventLogCollection.  # noqa: E501
        :rtype: EventLogCollection
        """
        return util.deserialize_model(dikt, cls)

    @property
    def event_logs(self):
        """Gets the event_logs of this EventLogCollection.


        :return: The event_logs of this EventLogCollection.
        :rtype: List[EventLog]
        """
        return self._event_logs

    @event_logs.setter
    def event_logs(self, event_logs):
        """Sets the event_logs of this EventLogCollection.


        :param event_logs: The event_logs of this EventLogCollection.
        :type event_logs: List[EventLog]
        """

        self._event_logs = event_logs