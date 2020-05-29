# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.openapi_server.models.base_model_ import Model
from openapi_server import util


class ListTaskInstanceForm(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, dag_ids: List[str]=None, execution_date_gte: datetime=None, execution_date_lte: datetime=None, start_date_gte: datetime=None, start_date_lte: datetime=None, end_date_gte: datetime=None, end_date_lte: datetime=None, duration_gte: float=None, duration_lte: float=None, state: List[str]=None, pool: List[str]=None, queue: List[str]=None):  # noqa: E501
        """ListTaskInstanceForm - a model defined in Swagger

        :param dag_ids: The dag_ids of this ListTaskInstanceForm.  # noqa: E501
        :type dag_ids: List[str]
        :param execution_date_gte: The execution_date_gte of this ListTaskInstanceForm.  # noqa: E501
        :type execution_date_gte: datetime
        :param execution_date_lte: The execution_date_lte of this ListTaskInstanceForm.  # noqa: E501
        :type execution_date_lte: datetime
        :param start_date_gte: The start_date_gte of this ListTaskInstanceForm.  # noqa: E501
        :type start_date_gte: datetime
        :param start_date_lte: The start_date_lte of this ListTaskInstanceForm.  # noqa: E501
        :type start_date_lte: datetime
        :param end_date_gte: The end_date_gte of this ListTaskInstanceForm.  # noqa: E501
        :type end_date_gte: datetime
        :param end_date_lte: The end_date_lte of this ListTaskInstanceForm.  # noqa: E501
        :type end_date_lte: datetime
        :param duration_gte: The duration_gte of this ListTaskInstanceForm.  # noqa: E501
        :type duration_gte: float
        :param duration_lte: The duration_lte of this ListTaskInstanceForm.  # noqa: E501
        :type duration_lte: float
        :param state: The state of this ListTaskInstanceForm.  # noqa: E501
        :type state: List[str]
        :param pool: The pool of this ListTaskInstanceForm.  # noqa: E501
        :type pool: List[str]
        :param queue: The queue of this ListTaskInstanceForm.  # noqa: E501
        :type queue: List[str]
        """
        self.swagger_types = {
            'dag_ids': List[str],
            'execution_date_gte': datetime,
            'execution_date_lte': datetime,
            'start_date_gte': datetime,
            'start_date_lte': datetime,
            'end_date_gte': datetime,
            'end_date_lte': datetime,
            'duration_gte': float,
            'duration_lte': float,
            'state': List[str],
            'pool': List[str],
            'queue': List[str]
        }

        self.attribute_map = {
            'dag_ids': 'dag_ids',
            'execution_date_gte': 'execution_date_gte',
            'execution_date_lte': 'execution_date_lte',
            'start_date_gte': 'start_date_gte',
            'start_date_lte': 'start_date_lte',
            'end_date_gte': 'end_date_gte',
            'end_date_lte': 'end_date_lte',
            'duration_gte': 'duration_gte',
            'duration_lte': 'duration_lte',
            'state': 'State',
            'pool': 'Pool',
            'queue': 'Queue'
        }

        self._dag_ids = dag_ids
        self._execution_date_gte = execution_date_gte
        self._execution_date_lte = execution_date_lte
        self._start_date_gte = start_date_gte
        self._start_date_lte = start_date_lte
        self._end_date_gte = end_date_gte
        self._end_date_lte = end_date_lte
        self._duration_gte = duration_gte
        self._duration_lte = duration_lte
        self._state = state
        self._pool = pool
        self._queue = queue

    @classmethod
    def from_dict(cls, dikt) -> 'ListTaskInstanceForm':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ListTaskInstanceForm of this ListTaskInstanceForm.  # noqa: E501
        :rtype: ListTaskInstanceForm
        """
        return util.deserialize_model(dikt, cls)

    @property
    def dag_ids(self) -> List[str]:
        """Gets the dag_ids of this ListTaskInstanceForm.

        Return objects with specific DAG IDs. The value can be repeated to retrieve multiple matching values (OR condition).  # noqa: E501

        :return: The dag_ids of this ListTaskInstanceForm.
        :rtype: List[str]
        """
        return self._dag_ids

    @dag_ids.setter
    def dag_ids(self, dag_ids: List[str]):
        """Sets the dag_ids of this ListTaskInstanceForm.

        Return objects with specific DAG IDs. The value can be repeated to retrieve multiple matching values (OR condition).  # noqa: E501

        :param dag_ids: The dag_ids of this ListTaskInstanceForm.
        :type dag_ids: List[str]
        """

        self._dag_ids = dag_ids

    @property
    def execution_date_gte(self) -> datetime:
        """Gets the execution_date_gte of this ListTaskInstanceForm.

        Returns objects greater or equal to the specified date. This can be combined with execution_date_lte parameter to receive only the selected period.   # noqa: E501

        :return: The execution_date_gte of this ListTaskInstanceForm.
        :rtype: datetime
        """
        return self._execution_date_gte

    @execution_date_gte.setter
    def execution_date_gte(self, execution_date_gte: datetime):
        """Sets the execution_date_gte of this ListTaskInstanceForm.

        Returns objects greater or equal to the specified date. This can be combined with execution_date_lte parameter to receive only the selected period.   # noqa: E501

        :param execution_date_gte: The execution_date_gte of this ListTaskInstanceForm.
        :type execution_date_gte: datetime
        """

        self._execution_date_gte = execution_date_gte

    @property
    def execution_date_lte(self) -> datetime:
        """Gets the execution_date_lte of this ListTaskInstanceForm.

        Returns objects less than or equal to the specified date. This can be combined with execution_date_gte parameter to receive only the selected period.   # noqa: E501

        :return: The execution_date_lte of this ListTaskInstanceForm.
        :rtype: datetime
        """
        return self._execution_date_lte

    @execution_date_lte.setter
    def execution_date_lte(self, execution_date_lte: datetime):
        """Sets the execution_date_lte of this ListTaskInstanceForm.

        Returns objects less than or equal to the specified date. This can be combined with execution_date_gte parameter to receive only the selected period.   # noqa: E501

        :param execution_date_lte: The execution_date_lte of this ListTaskInstanceForm.
        :type execution_date_lte: datetime
        """

        self._execution_date_lte = execution_date_lte

    @property
    def start_date_gte(self) -> datetime:
        """Gets the start_date_gte of this ListTaskInstanceForm.

        Returns objects greater or equal the specified date. This can be combined with startd_ate_lte parameter to receive only the selected period.   # noqa: E501

        :return: The start_date_gte of this ListTaskInstanceForm.
        :rtype: datetime
        """
        return self._start_date_gte

    @start_date_gte.setter
    def start_date_gte(self, start_date_gte: datetime):
        """Sets the start_date_gte of this ListTaskInstanceForm.

        Returns objects greater or equal the specified date. This can be combined with startd_ate_lte parameter to receive only the selected period.   # noqa: E501

        :param start_date_gte: The start_date_gte of this ListTaskInstanceForm.
        :type start_date_gte: datetime
        """

        self._start_date_gte = start_date_gte

    @property
    def start_date_lte(self) -> datetime:
        """Gets the start_date_lte of this ListTaskInstanceForm.

        Returns objects less or equal the specified date. This can be combined with start_date_gte parameter to receive only the selected period.   # noqa: E501

        :return: The start_date_lte of this ListTaskInstanceForm.
        :rtype: datetime
        """
        return self._start_date_lte

    @start_date_lte.setter
    def start_date_lte(self, start_date_lte: datetime):
        """Sets the start_date_lte of this ListTaskInstanceForm.

        Returns objects less or equal the specified date. This can be combined with start_date_gte parameter to receive only the selected period.   # noqa: E501

        :param start_date_lte: The start_date_lte of this ListTaskInstanceForm.
        :type start_date_lte: datetime
        """

        self._start_date_lte = start_date_lte

    @property
    def end_date_gte(self) -> datetime:
        """Gets the end_date_gte of this ListTaskInstanceForm.

        Returns objects greater or equal the specified date. This can be combined with start_date_lte parameter to receive only the selected period.   # noqa: E501

        :return: The end_date_gte of this ListTaskInstanceForm.
        :rtype: datetime
        """
        return self._end_date_gte

    @end_date_gte.setter
    def end_date_gte(self, end_date_gte: datetime):
        """Sets the end_date_gte of this ListTaskInstanceForm.

        Returns objects greater or equal the specified date. This can be combined with start_date_lte parameter to receive only the selected period.   # noqa: E501

        :param end_date_gte: The end_date_gte of this ListTaskInstanceForm.
        :type end_date_gte: datetime
        """

        self._end_date_gte = end_date_gte

    @property
    def end_date_lte(self) -> datetime:
        """Gets the end_date_lte of this ListTaskInstanceForm.

        Returns objects less than or equal to the specified date. This can be combined with start_date_gte parameter to receive only the selected period.   # noqa: E501

        :return: The end_date_lte of this ListTaskInstanceForm.
        :rtype: datetime
        """
        return self._end_date_lte

    @end_date_lte.setter
    def end_date_lte(self, end_date_lte: datetime):
        """Sets the end_date_lte of this ListTaskInstanceForm.

        Returns objects less than or equal to the specified date. This can be combined with start_date_gte parameter to receive only the selected period.   # noqa: E501

        :param end_date_lte: The end_date_lte of this ListTaskInstanceForm.
        :type end_date_lte: datetime
        """

        self._end_date_lte = end_date_lte

    @property
    def duration_gte(self) -> float:
        """Gets the duration_gte of this ListTaskInstanceForm.

        Returns objects greater than or equal to the specified values. This can be combined with duration_lte parameter to receive only the selected period.   # noqa: E501

        :return: The duration_gte of this ListTaskInstanceForm.
        :rtype: float
        """
        return self._duration_gte

    @duration_gte.setter
    def duration_gte(self, duration_gte: float):
        """Sets the duration_gte of this ListTaskInstanceForm.

        Returns objects greater than or equal to the specified values. This can be combined with duration_lte parameter to receive only the selected period.   # noqa: E501

        :param duration_gte: The duration_gte of this ListTaskInstanceForm.
        :type duration_gte: float
        """

        self._duration_gte = duration_gte

    @property
    def duration_lte(self) -> float:
        """Gets the duration_lte of this ListTaskInstanceForm.

        Returns objects less than or equal to the specified values. This can be combined with duration_gte parameter to receive only the selected range.   # noqa: E501

        :return: The duration_lte of this ListTaskInstanceForm.
        :rtype: float
        """
        return self._duration_lte

    @duration_lte.setter
    def duration_lte(self, duration_lte: float):
        """Sets the duration_lte of this ListTaskInstanceForm.

        Returns objects less than or equal to the specified values. This can be combined with duration_gte parameter to receive only the selected range.   # noqa: E501

        :param duration_lte: The duration_lte of this ListTaskInstanceForm.
        :type duration_lte: float
        """

        self._duration_lte = duration_lte

    @property
    def state(self) -> List[str]:
        """Gets the state of this ListTaskInstanceForm.

        The value can be repeated to retrieve multiple matching values (OR condition).  # noqa: E501

        :return: The state of this ListTaskInstanceForm.
        :rtype: List[str]
        """
        return self._state

    @state.setter
    def state(self, state: List[str]):
        """Sets the state of this ListTaskInstanceForm.

        The value can be repeated to retrieve multiple matching values (OR condition).  # noqa: E501

        :param state: The state of this ListTaskInstanceForm.
        :type state: List[str]
        """

        self._state = state

    @property
    def pool(self) -> List[str]:
        """Gets the pool of this ListTaskInstanceForm.

        The value can be repeated to retrieve multiple matching values (OR condition).  # noqa: E501

        :return: The pool of this ListTaskInstanceForm.
        :rtype: List[str]
        """
        return self._pool

    @pool.setter
    def pool(self, pool: List[str]):
        """Sets the pool of this ListTaskInstanceForm.

        The value can be repeated to retrieve multiple matching values (OR condition).  # noqa: E501

        :param pool: The pool of this ListTaskInstanceForm.
        :type pool: List[str]
        """

        self._pool = pool

    @property
    def queue(self) -> List[str]:
        """Gets the queue of this ListTaskInstanceForm.

        The value can be repeated to retrieve multiple matching values (OR condition).  # noqa: E501

        :return: The queue of this ListTaskInstanceForm.
        :rtype: List[str]
        """
        return self._queue

    @queue.setter
    def queue(self, queue: List[str]):
        """Sets the queue of this ListTaskInstanceForm.

        The value can be repeated to retrieve multiple matching values (OR condition).  # noqa: E501

        :param queue: The queue of this ListTaskInstanceForm.
        :type queue: List[str]
        """

        self._queue = queue