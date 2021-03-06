# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.openapi_server.models.base_model_ import Model
from openapi_server import util


class ClearTaskInstance(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, dry_run: bool=True, start_date: str=None, end_date: str=None, only_failed: str=None, only_running: str=None, include_subdags: bool=None, include_parentdag: bool=None, reset_dag_runs: bool=None):  # noqa: E501
        """ClearTaskInstance - a model defined in Swagger

        :param dry_run: The dry_run of this ClearTaskInstance.  # noqa: E501
        :type dry_run: bool
        :param start_date: The start_date of this ClearTaskInstance.  # noqa: E501
        :type start_date: str
        :param end_date: The end_date of this ClearTaskInstance.  # noqa: E501
        :type end_date: str
        :param only_failed: The only_failed of this ClearTaskInstance.  # noqa: E501
        :type only_failed: str
        :param only_running: The only_running of this ClearTaskInstance.  # noqa: E501
        :type only_running: str
        :param include_subdags: The include_subdags of this ClearTaskInstance.  # noqa: E501
        :type include_subdags: bool
        :param include_parentdag: The include_parentdag of this ClearTaskInstance.  # noqa: E501
        :type include_parentdag: bool
        :param reset_dag_runs: The reset_dag_runs of this ClearTaskInstance.  # noqa: E501
        :type reset_dag_runs: bool
        """
        self.swagger_types = {
            'dry_run': bool,
            'start_date': str,
            'end_date': str,
            'only_failed': str,
            'only_running': str,
            'include_subdags': bool,
            'include_parentdag': bool,
            'reset_dag_runs': bool
        }

        self.attribute_map = {
            'dry_run': 'dry_run',
            'start_date': 'start_date',
            'end_date': 'end_date',
            'only_failed': 'only_failed',
            'only_running': 'only_running',
            'include_subdags': 'include_subdags',
            'include_parentdag': 'include_parentdag',
            'reset_dag_runs': 'reset_dag_runs'
        }

        self._dry_run = dry_run
        self._start_date = start_date
        self._end_date = end_date
        self._only_failed = only_failed
        self._only_running = only_running
        self._include_subdags = include_subdags
        self._include_parentdag = include_parentdag
        self._reset_dag_runs = reset_dag_runs

    @classmethod
    def from_dict(cls, dikt) -> 'ClearTaskInstance':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ClearTaskInstance of this ClearTaskInstance.  # noqa: E501
        :rtype: ClearTaskInstance
        """
        return util.deserialize_model(dikt, cls)

    @property
    def dry_run(self) -> bool:
        """Gets the dry_run of this ClearTaskInstance.

        If set, don't actually run this operation. The response will contain a list of task instances planned to be cleaned, but not modified in any way.   # noqa: E501

        :return: The dry_run of this ClearTaskInstance.
        :rtype: bool
        """
        return self._dry_run

    @dry_run.setter
    def dry_run(self, dry_run: bool):
        """Sets the dry_run of this ClearTaskInstance.

        If set, don't actually run this operation. The response will contain a list of task instances planned to be cleaned, but not modified in any way.   # noqa: E501

        :param dry_run: The dry_run of this ClearTaskInstance.
        :type dry_run: bool
        """

        self._dry_run = dry_run

    @property
    def start_date(self) -> str:
        """Gets the start_date of this ClearTaskInstance.

        The minimum execution date to clear.  # noqa: E501

        :return: The start_date of this ClearTaskInstance.
        :rtype: str
        """
        return self._start_date

    @start_date.setter
    def start_date(self, start_date: str):
        """Sets the start_date of this ClearTaskInstance.

        The minimum execution date to clear.  # noqa: E501

        :param start_date: The start_date of this ClearTaskInstance.
        :type start_date: str
        """

        self._start_date = start_date

    @property
    def end_date(self) -> str:
        """Gets the end_date of this ClearTaskInstance.

        The maximum execution date to clear.  # noqa: E501

        :return: The end_date of this ClearTaskInstance.
        :rtype: str
        """
        return self._end_date

    @end_date.setter
    def end_date(self, end_date: str):
        """Sets the end_date of this ClearTaskInstance.

        The maximum execution date to clear.  # noqa: E501

        :param end_date: The end_date of this ClearTaskInstance.
        :type end_date: str
        """

        self._end_date = end_date

    @property
    def only_failed(self) -> str:
        """Gets the only_failed of this ClearTaskInstance.

        Only clear failed tasks.  # noqa: E501

        :return: The only_failed of this ClearTaskInstance.
        :rtype: str
        """
        return self._only_failed

    @only_failed.setter
    def only_failed(self, only_failed: str):
        """Sets the only_failed of this ClearTaskInstance.

        Only clear failed tasks.  # noqa: E501

        :param only_failed: The only_failed of this ClearTaskInstance.
        :type only_failed: str
        """

        self._only_failed = only_failed

    @property
    def only_running(self) -> str:
        """Gets the only_running of this ClearTaskInstance.

        Only clear running tasks.  # noqa: E501

        :return: The only_running of this ClearTaskInstance.
        :rtype: str
        """
        return self._only_running

    @only_running.setter
    def only_running(self, only_running: str):
        """Sets the only_running of this ClearTaskInstance.

        Only clear running tasks.  # noqa: E501

        :param only_running: The only_running of this ClearTaskInstance.
        :type only_running: str
        """

        self._only_running = only_running

    @property
    def include_subdags(self) -> bool:
        """Gets the include_subdags of this ClearTaskInstance.

        Clear tasks in subdags and clear external tasks indicated by ExternalTaskMarker.  # noqa: E501

        :return: The include_subdags of this ClearTaskInstance.
        :rtype: bool
        """
        return self._include_subdags

    @include_subdags.setter
    def include_subdags(self, include_subdags: bool):
        """Sets the include_subdags of this ClearTaskInstance.

        Clear tasks in subdags and clear external tasks indicated by ExternalTaskMarker.  # noqa: E501

        :param include_subdags: The include_subdags of this ClearTaskInstance.
        :type include_subdags: bool
        """

        self._include_subdags = include_subdags

    @property
    def include_parentdag(self) -> bool:
        """Gets the include_parentdag of this ClearTaskInstance.

        Clear tasks in the parent dag of the subdag.  # noqa: E501

        :return: The include_parentdag of this ClearTaskInstance.
        :rtype: bool
        """
        return self._include_parentdag

    @include_parentdag.setter
    def include_parentdag(self, include_parentdag: bool):
        """Sets the include_parentdag of this ClearTaskInstance.

        Clear tasks in the parent dag of the subdag.  # noqa: E501

        :param include_parentdag: The include_parentdag of this ClearTaskInstance.
        :type include_parentdag: bool
        """

        self._include_parentdag = include_parentdag

    @property
    def reset_dag_runs(self) -> bool:
        """Gets the reset_dag_runs of this ClearTaskInstance.

        Set state of DAG Runs to RUNNING.  # noqa: E501

        :return: The reset_dag_runs of this ClearTaskInstance.
        :rtype: bool
        """
        return self._reset_dag_runs

    @reset_dag_runs.setter
    def reset_dag_runs(self, reset_dag_runs: bool):
        """Sets the reset_dag_runs of this ClearTaskInstance.

        Set state of DAG Runs to RUNNING.  # noqa: E501

        :param reset_dag_runs: The reset_dag_runs of this ClearTaskInstance.
        :type reset_dag_runs: bool
        """

        self._reset_dag_runs = reset_dag_runs
