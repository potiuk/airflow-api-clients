# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.openapi_server.models.base_model_ import Model
from openapi_server import util


class SLAMiss(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, task_id: str=None, dag_id: str=None, execution_date: str=None, email_sent: bool=None, timestamp: str=None, description: str=None, notification_sent: bool=None):  # noqa: E501
        """SLAMiss - a model defined in Swagger

        :param task_id: The task_id of this SLAMiss.  # noqa: E501
        :type task_id: str
        :param dag_id: The dag_id of this SLAMiss.  # noqa: E501
        :type dag_id: str
        :param execution_date: The execution_date of this SLAMiss.  # noqa: E501
        :type execution_date: str
        :param email_sent: The email_sent of this SLAMiss.  # noqa: E501
        :type email_sent: bool
        :param timestamp: The timestamp of this SLAMiss.  # noqa: E501
        :type timestamp: str
        :param description: The description of this SLAMiss.  # noqa: E501
        :type description: str
        :param notification_sent: The notification_sent of this SLAMiss.  # noqa: E501
        :type notification_sent: bool
        """
        self.swagger_types = {
            'task_id': str,
            'dag_id': str,
            'execution_date': str,
            'email_sent': bool,
            'timestamp': str,
            'description': str,
            'notification_sent': bool
        }

        self.attribute_map = {
            'task_id': 'task_id',
            'dag_id': 'dag_id',
            'execution_date': 'execution_date',
            'email_sent': 'email_sent',
            'timestamp': 'timestamp',
            'description': 'description',
            'notification_sent': 'notification_sent'
        }

        self._task_id = task_id
        self._dag_id = dag_id
        self._execution_date = execution_date
        self._email_sent = email_sent
        self._timestamp = timestamp
        self._description = description
        self._notification_sent = notification_sent

    @classmethod
    def from_dict(cls, dikt) -> 'SLAMiss':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The SLAMiss of this SLAMiss.  # noqa: E501
        :rtype: SLAMiss
        """
        return util.deserialize_model(dikt, cls)

    @property
    def task_id(self) -> str:
        """Gets the task_id of this SLAMiss.


        :return: The task_id of this SLAMiss.
        :rtype: str
        """
        return self._task_id

    @task_id.setter
    def task_id(self, task_id: str):
        """Sets the task_id of this SLAMiss.


        :param task_id: The task_id of this SLAMiss.
        :type task_id: str
        """

        self._task_id = task_id

    @property
    def dag_id(self) -> str:
        """Gets the dag_id of this SLAMiss.


        :return: The dag_id of this SLAMiss.
        :rtype: str
        """
        return self._dag_id

    @dag_id.setter
    def dag_id(self, dag_id: str):
        """Sets the dag_id of this SLAMiss.


        :param dag_id: The dag_id of this SLAMiss.
        :type dag_id: str
        """

        self._dag_id = dag_id

    @property
    def execution_date(self) -> str:
        """Gets the execution_date of this SLAMiss.


        :return: The execution_date of this SLAMiss.
        :rtype: str
        """
        return self._execution_date

    @execution_date.setter
    def execution_date(self, execution_date: str):
        """Sets the execution_date of this SLAMiss.


        :param execution_date: The execution_date of this SLAMiss.
        :type execution_date: str
        """

        self._execution_date = execution_date

    @property
    def email_sent(self) -> bool:
        """Gets the email_sent of this SLAMiss.


        :return: The email_sent of this SLAMiss.
        :rtype: bool
        """
        return self._email_sent

    @email_sent.setter
    def email_sent(self, email_sent: bool):
        """Sets the email_sent of this SLAMiss.


        :param email_sent: The email_sent of this SLAMiss.
        :type email_sent: bool
        """

        self._email_sent = email_sent

    @property
    def timestamp(self) -> str:
        """Gets the timestamp of this SLAMiss.


        :return: The timestamp of this SLAMiss.
        :rtype: str
        """
        return self._timestamp

    @timestamp.setter
    def timestamp(self, timestamp: str):
        """Sets the timestamp of this SLAMiss.


        :param timestamp: The timestamp of this SLAMiss.
        :type timestamp: str
        """

        self._timestamp = timestamp

    @property
    def description(self) -> str:
        """Gets the description of this SLAMiss.


        :return: The description of this SLAMiss.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description: str):
        """Sets the description of this SLAMiss.


        :param description: The description of this SLAMiss.
        :type description: str
        """

        self._description = description

    @property
    def notification_sent(self) -> bool:
        """Gets the notification_sent of this SLAMiss.


        :return: The notification_sent of this SLAMiss.
        :rtype: bool
        """
        return self._notification_sent

    @notification_sent.setter
    def notification_sent(self, notification_sent: bool):
        """Sets the notification_sent of this SLAMiss.


        :param notification_sent: The notification_sent of this SLAMiss.
        :type notification_sent: bool
        """

        self._notification_sent = notification_sent