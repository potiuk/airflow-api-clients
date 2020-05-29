# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.openapi_server.models.base_model_ import Model
from openapi_server import util


class ListDagRunsForm(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, page_offset: int=None, page_limit: int=100, dag_ids: List[str]=None, execution_date_gte: datetime=None, execution_date_lte: datetime=None, start_date_gte: datetime=None, start_date_lte: datetime=None, end_date_gte: datetime=None, end_date_lte: datetime=None):  # noqa: E501
        """ListDagRunsForm - a model defined in Swagger

        :param page_offset: The page_offset of this ListDagRunsForm.  # noqa: E501
        :type page_offset: int
        :param page_limit: The page_limit of this ListDagRunsForm.  # noqa: E501
        :type page_limit: int
        :param dag_ids: The dag_ids of this ListDagRunsForm.  # noqa: E501
        :type dag_ids: List[str]
        :param execution_date_gte: The execution_date_gte of this ListDagRunsForm.  # noqa: E501
        :type execution_date_gte: datetime
        :param execution_date_lte: The execution_date_lte of this ListDagRunsForm.  # noqa: E501
        :type execution_date_lte: datetime
        :param start_date_gte: The start_date_gte of this ListDagRunsForm.  # noqa: E501
        :type start_date_gte: datetime
        :param start_date_lte: The start_date_lte of this ListDagRunsForm.  # noqa: E501
        :type start_date_lte: datetime
        :param end_date_gte: The end_date_gte of this ListDagRunsForm.  # noqa: E501
        :type end_date_gte: datetime
        :param end_date_lte: The end_date_lte of this ListDagRunsForm.  # noqa: E501
        :type end_date_lte: datetime
        """
        self.swagger_types = {
            'page_offset': int,
            'page_limit': int,
            'dag_ids': List[str],
            'execution_date_gte': datetime,
            'execution_date_lte': datetime,
            'start_date_gte': datetime,
            'start_date_lte': datetime,
            'end_date_gte': datetime,
            'end_date_lte': datetime
        }

        self.attribute_map = {
            'page_offset': 'page_offset',
            'page_limit': 'page_limit',
            'dag_ids': 'dag_ids',
            'execution_date_gte': 'execution_date_gte',
            'execution_date_lte': 'execution_date_lte',
            'start_date_gte': 'start_date_gte',
            'start_date_lte': 'start_date_lte',
            'end_date_gte': 'end_date_gte',
            'end_date_lte': 'end_date_lte'
        }

        self._page_offset = page_offset
        self._page_limit = page_limit
        self._dag_ids = dag_ids
        self._execution_date_gte = execution_date_gte
        self._execution_date_lte = execution_date_lte
        self._start_date_gte = start_date_gte
        self._start_date_lte = start_date_lte
        self._end_date_gte = end_date_gte
        self._end_date_lte = end_date_lte

    @classmethod
    def from_dict(cls, dikt) -> 'ListDagRunsForm':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ListDagRunsForm of this ListDagRunsForm.  # noqa: E501
        :rtype: ListDagRunsForm
        """
        return util.deserialize_model(dikt, cls)

    @property
    def page_offset(self) -> int:
        """Gets the page_offset of this ListDagRunsForm.

        The number of items to skip before starting to collect the result set.  # noqa: E501

        :return: The page_offset of this ListDagRunsForm.
        :rtype: int
        """
        return self._page_offset

    @page_offset.setter
    def page_offset(self, page_offset: int):
        """Sets the page_offset of this ListDagRunsForm.

        The number of items to skip before starting to collect the result set.  # noqa: E501

        :param page_offset: The page_offset of this ListDagRunsForm.
        :type page_offset: int
        """
        if page_offset is not None and page_offset < 0:  # noqa: E501
            raise ValueError("Invalid value for `page_offset`, must be a value greater than or equal to `0`")  # noqa: E501

        self._page_offset = page_offset

    @property
    def page_limit(self) -> int:
        """Gets the page_limit of this ListDagRunsForm.

        The numbers of items to return.  # noqa: E501

        :return: The page_limit of this ListDagRunsForm.
        :rtype: int
        """
        return self._page_limit

    @page_limit.setter
    def page_limit(self, page_limit: int):
        """Sets the page_limit of this ListDagRunsForm.

        The numbers of items to return.  # noqa: E501

        :param page_limit: The page_limit of this ListDagRunsForm.
        :type page_limit: int
        """
        if page_limit is not None and page_limit < 1:  # noqa: E501
            raise ValueError("Invalid value for `page_limit`, must be a value greater than or equal to `1`")  # noqa: E501

        self._page_limit = page_limit

    @property
    def dag_ids(self) -> List[str]:
        """Gets the dag_ids of this ListDagRunsForm.

        Return objects with specific DAG IDs. The value can be repeated to retrieve multiple matching values (OR condition).  # noqa: E501

        :return: The dag_ids of this ListDagRunsForm.
        :rtype: List[str]
        """
        return self._dag_ids

    @dag_ids.setter
    def dag_ids(self, dag_ids: List[str]):
        """Sets the dag_ids of this ListDagRunsForm.

        Return objects with specific DAG IDs. The value can be repeated to retrieve multiple matching values (OR condition).  # noqa: E501

        :param dag_ids: The dag_ids of this ListDagRunsForm.
        :type dag_ids: List[str]
        """

        self._dag_ids = dag_ids

    @property
    def execution_date_gte(self) -> datetime:
        """Gets the execution_date_gte of this ListDagRunsForm.

        Returns objects greater or equal to the specified date. This can be combined with execution_date_lte key to receive only the selected period.   # noqa: E501

        :return: The execution_date_gte of this ListDagRunsForm.
        :rtype: datetime
        """
        return self._execution_date_gte

    @execution_date_gte.setter
    def execution_date_gte(self, execution_date_gte: datetime):
        """Sets the execution_date_gte of this ListDagRunsForm.

        Returns objects greater or equal to the specified date. This can be combined with execution_date_lte key to receive only the selected period.   # noqa: E501

        :param execution_date_gte: The execution_date_gte of this ListDagRunsForm.
        :type execution_date_gte: datetime
        """

        self._execution_date_gte = execution_date_gte

    @property
    def execution_date_lte(self) -> datetime:
        """Gets the execution_date_lte of this ListDagRunsForm.

        Returns objects less than or equal to the specified date. This can be combined with execution_date_gte key to receive only the selected period.   # noqa: E501

        :return: The execution_date_lte of this ListDagRunsForm.
        :rtype: datetime
        """
        return self._execution_date_lte

    @execution_date_lte.setter
    def execution_date_lte(self, execution_date_lte: datetime):
        """Sets the execution_date_lte of this ListDagRunsForm.

        Returns objects less than or equal to the specified date. This can be combined with execution_date_gte key to receive only the selected period.   # noqa: E501

        :param execution_date_lte: The execution_date_lte of this ListDagRunsForm.
        :type execution_date_lte: datetime
        """

        self._execution_date_lte = execution_date_lte

    @property
    def start_date_gte(self) -> datetime:
        """Gets the start_date_gte of this ListDagRunsForm.

        Returns objects greater or equal the specified date. This can be combined with start_date_lte key to receive only the selected period.   # noqa: E501

        :return: The start_date_gte of this ListDagRunsForm.
        :rtype: datetime
        """
        return self._start_date_gte

    @start_date_gte.setter
    def start_date_gte(self, start_date_gte: datetime):
        """Sets the start_date_gte of this ListDagRunsForm.

        Returns objects greater or equal the specified date. This can be combined with start_date_lte key to receive only the selected period.   # noqa: E501

        :param start_date_gte: The start_date_gte of this ListDagRunsForm.
        :type start_date_gte: datetime
        """

        self._start_date_gte = start_date_gte

    @property
    def start_date_lte(self) -> datetime:
        """Gets the start_date_lte of this ListDagRunsForm.

        Returns objects less or equal the specified date. This can be combined with start_date_gte parameter to receive only the selected period   # noqa: E501

        :return: The start_date_lte of this ListDagRunsForm.
        :rtype: datetime
        """
        return self._start_date_lte

    @start_date_lte.setter
    def start_date_lte(self, start_date_lte: datetime):
        """Sets the start_date_lte of this ListDagRunsForm.

        Returns objects less or equal the specified date. This can be combined with start_date_gte parameter to receive only the selected period   # noqa: E501

        :param start_date_lte: The start_date_lte of this ListDagRunsForm.
        :type start_date_lte: datetime
        """

        self._start_date_lte = start_date_lte

    @property
    def end_date_gte(self) -> datetime:
        """Gets the end_date_gte of this ListDagRunsForm.

        Returns objects greater or equal the specified date. This can be combined with end_date_lte parameter to receive only the selected period.   # noqa: E501

        :return: The end_date_gte of this ListDagRunsForm.
        :rtype: datetime
        """
        return self._end_date_gte

    @end_date_gte.setter
    def end_date_gte(self, end_date_gte: datetime):
        """Sets the end_date_gte of this ListDagRunsForm.

        Returns objects greater or equal the specified date. This can be combined with end_date_lte parameter to receive only the selected period.   # noqa: E501

        :param end_date_gte: The end_date_gte of this ListDagRunsForm.
        :type end_date_gte: datetime
        """

        self._end_date_gte = end_date_gte

    @property
    def end_date_lte(self) -> datetime:
        """Gets the end_date_lte of this ListDagRunsForm.

        Returns objects less than or equal to the specified date. This can be combined with end_date_gte parameter to receive only the selected period.   # noqa: E501

        :return: The end_date_lte of this ListDagRunsForm.
        :rtype: datetime
        """
        return self._end_date_lte

    @end_date_lte.setter
    def end_date_lte(self, end_date_lte: datetime):
        """Sets the end_date_lte of this ListDagRunsForm.

        Returns objects less than or equal to the specified date. This can be combined with end_date_gte parameter to receive only the selected period.   # noqa: E501

        :param end_date_lte: The end_date_lte of this ListDagRunsForm.
        :type end_date_lte: datetime
        """

        self._end_date_lte = end_date_lte
