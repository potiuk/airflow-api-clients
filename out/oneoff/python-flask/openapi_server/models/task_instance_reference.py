# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model_ import Model
from openapi_server import util


class TaskInstanceReference(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, task_id=None, dag_id=None, execution_date=None, dag_run_id=None):  # noqa: E501
        """TaskInstanceReference - a model defined in OpenAPI

        :param task_id: The task_id of this TaskInstanceReference.  # noqa: E501
        :type task_id: str
        :param dag_id: The dag_id of this TaskInstanceReference.  # noqa: E501
        :type dag_id: str
        :param execution_date: The execution_date of this TaskInstanceReference.  # noqa: E501
        :type execution_date: str
        :param dag_run_id: The dag_run_id of this TaskInstanceReference.  # noqa: E501
        :type dag_run_id: str
        """
        self.openapi_types = {
            'task_id': str,
            'dag_id': str,
            'execution_date': str,
            'dag_run_id': str
        }

        self.attribute_map = {
            'task_id': 'task_id',
            'dag_id': 'dag_id',
            'execution_date': 'execution_date',
            'dag_run_id': 'dag_run_id'
        }

        self._task_id = task_id
        self._dag_id = dag_id
        self._execution_date = execution_date
        self._dag_run_id = dag_run_id

    @classmethod
    def from_dict(cls, dikt) -> 'TaskInstanceReference':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The TaskInstanceReference of this TaskInstanceReference.  # noqa: E501
        :rtype: TaskInstanceReference
        """
        return util.deserialize_model(dikt, cls)

    @property
    def task_id(self):
        """Gets the task_id of this TaskInstanceReference.


        :return: The task_id of this TaskInstanceReference.
        :rtype: str
        """
        return self._task_id

    @task_id.setter
    def task_id(self, task_id):
        """Sets the task_id of this TaskInstanceReference.


        :param task_id: The task_id of this TaskInstanceReference.
        :type task_id: str
        """

        self._task_id = task_id

    @property
    def dag_id(self):
        """Gets the dag_id of this TaskInstanceReference.


        :return: The dag_id of this TaskInstanceReference.
        :rtype: str
        """
        return self._dag_id

    @dag_id.setter
    def dag_id(self, dag_id):
        """Sets the dag_id of this TaskInstanceReference.


        :param dag_id: The dag_id of this TaskInstanceReference.
        :type dag_id: str
        """

        self._dag_id = dag_id

    @property
    def execution_date(self):
        """Gets the execution_date of this TaskInstanceReference.


        :return: The execution_date of this TaskInstanceReference.
        :rtype: str
        """
        return self._execution_date

    @execution_date.setter
    def execution_date(self, execution_date):
        """Sets the execution_date of this TaskInstanceReference.


        :param execution_date: The execution_date of this TaskInstanceReference.
        :type execution_date: str
        """

        self._execution_date = execution_date

    @property
    def dag_run_id(self):
        """Gets the dag_run_id of this TaskInstanceReference.


        :return: The dag_run_id of this TaskInstanceReference.
        :rtype: str
        """
        return self._dag_run_id

    @dag_run_id.setter
    def dag_run_id(self, dag_run_id):
        """Sets the dag_run_id of this TaskInstanceReference.


        :param dag_run_id: The dag_run_id of this TaskInstanceReference.
        :type dag_run_id: str
        """

        self._dag_run_id = dag_run_id
