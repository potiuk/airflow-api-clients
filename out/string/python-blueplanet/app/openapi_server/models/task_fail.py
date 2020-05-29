# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.openapi_server.models.base_model_ import Model
from openapi_server import util


class TaskFail(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, task_id: str=None, dag_id: str=None, execution_date: str=None, start_date: str=None, end_date: str=None, duration: int=None):  # noqa: E501
        """TaskFail - a model defined in Swagger

        :param task_id: The task_id of this TaskFail.  # noqa: E501
        :type task_id: str
        :param dag_id: The dag_id of this TaskFail.  # noqa: E501
        :type dag_id: str
        :param execution_date: The execution_date of this TaskFail.  # noqa: E501
        :type execution_date: str
        :param start_date: The start_date of this TaskFail.  # noqa: E501
        :type start_date: str
        :param end_date: The end_date of this TaskFail.  # noqa: E501
        :type end_date: str
        :param duration: The duration of this TaskFail.  # noqa: E501
        :type duration: int
        """
        self.swagger_types = {
            'task_id': str,
            'dag_id': str,
            'execution_date': str,
            'start_date': str,
            'end_date': str,
            'duration': int
        }

        self.attribute_map = {
            'task_id': 'task_id',
            'dag_id': 'dag_id',
            'execution_date': 'execution_date',
            'start_date': 'start_date',
            'end_date': 'end_date',
            'duration': 'duration'
        }

        self._task_id = task_id
        self._dag_id = dag_id
        self._execution_date = execution_date
        self._start_date = start_date
        self._end_date = end_date
        self._duration = duration

    @classmethod
    def from_dict(cls, dikt) -> 'TaskFail':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The TaskFail of this TaskFail.  # noqa: E501
        :rtype: TaskFail
        """
        return util.deserialize_model(dikt, cls)

    @property
    def task_id(self) -> str:
        """Gets the task_id of this TaskFail.


        :return: The task_id of this TaskFail.
        :rtype: str
        """
        return self._task_id

    @task_id.setter
    def task_id(self, task_id: str):
        """Sets the task_id of this TaskFail.


        :param task_id: The task_id of this TaskFail.
        :type task_id: str
        """

        self._task_id = task_id

    @property
    def dag_id(self) -> str:
        """Gets the dag_id of this TaskFail.


        :return: The dag_id of this TaskFail.
        :rtype: str
        """
        return self._dag_id

    @dag_id.setter
    def dag_id(self, dag_id: str):
        """Sets the dag_id of this TaskFail.


        :param dag_id: The dag_id of this TaskFail.
        :type dag_id: str
        """

        self._dag_id = dag_id

    @property
    def execution_date(self) -> str:
        """Gets the execution_date of this TaskFail.


        :return: The execution_date of this TaskFail.
        :rtype: str
        """
        return self._execution_date

    @execution_date.setter
    def execution_date(self, execution_date: str):
        """Sets the execution_date of this TaskFail.


        :param execution_date: The execution_date of this TaskFail.
        :type execution_date: str
        """

        self._execution_date = execution_date

    @property
    def start_date(self) -> str:
        """Gets the start_date of this TaskFail.


        :return: The start_date of this TaskFail.
        :rtype: str
        """
        return self._start_date

    @start_date.setter
    def start_date(self, start_date: str):
        """Sets the start_date of this TaskFail.


        :param start_date: The start_date of this TaskFail.
        :type start_date: str
        """

        self._start_date = start_date

    @property
    def end_date(self) -> str:
        """Gets the end_date of this TaskFail.


        :return: The end_date of this TaskFail.
        :rtype: str
        """
        return self._end_date

    @end_date.setter
    def end_date(self, end_date: str):
        """Sets the end_date of this TaskFail.


        :param end_date: The end_date of this TaskFail.
        :type end_date: str
        """

        self._end_date = end_date

    @property
    def duration(self) -> int:
        """Gets the duration of this TaskFail.


        :return: The duration of this TaskFail.
        :rtype: int
        """
        return self._duration

    @duration.setter
    def duration(self, duration: int):
        """Sets the duration of this TaskFail.


        :param duration: The duration of this TaskFail.
        :type duration: int
        """

        self._duration = duration
