# coding: utf-8

"""
    Airflow API (Stable)

    Apache Airflow management API.  # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Contact: dev@airflow.apache.org
    Generated by: https://openapi-generator.tech
"""


import pprint
import re  # noqa: F401

import six

from airflow_client.configuration import Configuration


class ListDagRunsForm(object):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    """
    Attributes:
      openapi_types (dict): The key is attribute name
                            and the value is attribute type.
      attribute_map (dict): The key is attribute name
                            and the value is json key in definition.
    """
    openapi_types = {
        'page_offset': 'int',
        'page_limit': 'int',
        'dag_ids': 'list[str]',
        'execution_date_gte': 'datetime',
        'execution_date_lte': 'datetime',
        'start_date_gte': 'datetime',
        'start_date_lte': 'datetime',
        'end_date_gte': 'datetime',
        'end_date_lte': 'datetime'
    }

    attribute_map = {
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

    def __init__(self, page_offset=None, page_limit=100, dag_ids=None, execution_date_gte=None, execution_date_lte=None, start_date_gte=None, start_date_lte=None, end_date_gte=None, end_date_lte=None, local_vars_configuration=None):  # noqa: E501
        """ListDagRunsForm - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration()
        self.local_vars_configuration = local_vars_configuration

        self._page_offset = None
        self._page_limit = None
        self._dag_ids = None
        self._execution_date_gte = None
        self._execution_date_lte = None
        self._start_date_gte = None
        self._start_date_lte = None
        self._end_date_gte = None
        self._end_date_lte = None
        self.discriminator = None

        if page_offset is not None:
            self.page_offset = page_offset
        if page_limit is not None:
            self.page_limit = page_limit
        if dag_ids is not None:
            self.dag_ids = dag_ids
        if execution_date_gte is not None:
            self.execution_date_gte = execution_date_gte
        if execution_date_lte is not None:
            self.execution_date_lte = execution_date_lte
        if start_date_gte is not None:
            self.start_date_gte = start_date_gte
        if start_date_lte is not None:
            self.start_date_lte = start_date_lte
        if end_date_gte is not None:
            self.end_date_gte = end_date_gte
        if end_date_lte is not None:
            self.end_date_lte = end_date_lte

    @property
    def page_offset(self):
        """Gets the page_offset of this ListDagRunsForm.  # noqa: E501

        The number of items to skip before starting to collect the result set.  # noqa: E501

        :return: The page_offset of this ListDagRunsForm.  # noqa: E501
        :rtype: int
        """
        return self._page_offset

    @page_offset.setter
    def page_offset(self, page_offset):
        """Sets the page_offset of this ListDagRunsForm.

        The number of items to skip before starting to collect the result set.  # noqa: E501

        :param page_offset: The page_offset of this ListDagRunsForm.  # noqa: E501
        :type: int
        """
        if (self.local_vars_configuration.client_side_validation and
                page_offset is not None and page_offset < 0):  # noqa: E501
            raise ValueError("Invalid value for `page_offset`, must be a value greater than or equal to `0`")  # noqa: E501

        self._page_offset = page_offset

    @property
    def page_limit(self):
        """Gets the page_limit of this ListDagRunsForm.  # noqa: E501

        The numbers of items to return.  # noqa: E501

        :return: The page_limit of this ListDagRunsForm.  # noqa: E501
        :rtype: int
        """
        return self._page_limit

    @page_limit.setter
    def page_limit(self, page_limit):
        """Sets the page_limit of this ListDagRunsForm.

        The numbers of items to return.  # noqa: E501

        :param page_limit: The page_limit of this ListDagRunsForm.  # noqa: E501
        :type: int
        """
        if (self.local_vars_configuration.client_side_validation and
                page_limit is not None and page_limit < 1):  # noqa: E501
            raise ValueError("Invalid value for `page_limit`, must be a value greater than or equal to `1`")  # noqa: E501

        self._page_limit = page_limit

    @property
    def dag_ids(self):
        """Gets the dag_ids of this ListDagRunsForm.  # noqa: E501

        Return objects with specific DAG IDs. The value can be repeated to retrieve multiple matching values (OR condition).  # noqa: E501

        :return: The dag_ids of this ListDagRunsForm.  # noqa: E501
        :rtype: list[str]
        """
        return self._dag_ids

    @dag_ids.setter
    def dag_ids(self, dag_ids):
        """Sets the dag_ids of this ListDagRunsForm.

        Return objects with specific DAG IDs. The value can be repeated to retrieve multiple matching values (OR condition).  # noqa: E501

        :param dag_ids: The dag_ids of this ListDagRunsForm.  # noqa: E501
        :type: list[str]
        """

        self._dag_ids = dag_ids

    @property
    def execution_date_gte(self):
        """Gets the execution_date_gte of this ListDagRunsForm.  # noqa: E501

        Returns objects greater or equal to the specified date. This can be combined with execution_date_lte key to receive only the selected period.   # noqa: E501

        :return: The execution_date_gte of this ListDagRunsForm.  # noqa: E501
        :rtype: datetime
        """
        return self._execution_date_gte

    @execution_date_gte.setter
    def execution_date_gte(self, execution_date_gte):
        """Sets the execution_date_gte of this ListDagRunsForm.

        Returns objects greater or equal to the specified date. This can be combined with execution_date_lte key to receive only the selected period.   # noqa: E501

        :param execution_date_gte: The execution_date_gte of this ListDagRunsForm.  # noqa: E501
        :type: datetime
        """

        self._execution_date_gte = execution_date_gte

    @property
    def execution_date_lte(self):
        """Gets the execution_date_lte of this ListDagRunsForm.  # noqa: E501

        Returns objects less than or equal to the specified date. This can be combined with execution_date_gte key to receive only the selected period.   # noqa: E501

        :return: The execution_date_lte of this ListDagRunsForm.  # noqa: E501
        :rtype: datetime
        """
        return self._execution_date_lte

    @execution_date_lte.setter
    def execution_date_lte(self, execution_date_lte):
        """Sets the execution_date_lte of this ListDagRunsForm.

        Returns objects less than or equal to the specified date. This can be combined with execution_date_gte key to receive only the selected period.   # noqa: E501

        :param execution_date_lte: The execution_date_lte of this ListDagRunsForm.  # noqa: E501
        :type: datetime
        """

        self._execution_date_lte = execution_date_lte

    @property
    def start_date_gte(self):
        """Gets the start_date_gte of this ListDagRunsForm.  # noqa: E501

        Returns objects greater or equal the specified date. This can be combined with start_date_lte key to receive only the selected period.   # noqa: E501

        :return: The start_date_gte of this ListDagRunsForm.  # noqa: E501
        :rtype: datetime
        """
        return self._start_date_gte

    @start_date_gte.setter
    def start_date_gte(self, start_date_gte):
        """Sets the start_date_gte of this ListDagRunsForm.

        Returns objects greater or equal the specified date. This can be combined with start_date_lte key to receive only the selected period.   # noqa: E501

        :param start_date_gte: The start_date_gte of this ListDagRunsForm.  # noqa: E501
        :type: datetime
        """

        self._start_date_gte = start_date_gte

    @property
    def start_date_lte(self):
        """Gets the start_date_lte of this ListDagRunsForm.  # noqa: E501

        Returns objects less or equal the specified date. This can be combined with start_date_gte parameter to receive only the selected period   # noqa: E501

        :return: The start_date_lte of this ListDagRunsForm.  # noqa: E501
        :rtype: datetime
        """
        return self._start_date_lte

    @start_date_lte.setter
    def start_date_lte(self, start_date_lte):
        """Sets the start_date_lte of this ListDagRunsForm.

        Returns objects less or equal the specified date. This can be combined with start_date_gte parameter to receive only the selected period   # noqa: E501

        :param start_date_lte: The start_date_lte of this ListDagRunsForm.  # noqa: E501
        :type: datetime
        """

        self._start_date_lte = start_date_lte

    @property
    def end_date_gte(self):
        """Gets the end_date_gte of this ListDagRunsForm.  # noqa: E501

        Returns objects greater or equal the specified date. This can be combined with end_date_lte parameter to receive only the selected period.   # noqa: E501

        :return: The end_date_gte of this ListDagRunsForm.  # noqa: E501
        :rtype: datetime
        """
        return self._end_date_gte

    @end_date_gte.setter
    def end_date_gte(self, end_date_gte):
        """Sets the end_date_gte of this ListDagRunsForm.

        Returns objects greater or equal the specified date. This can be combined with end_date_lte parameter to receive only the selected period.   # noqa: E501

        :param end_date_gte: The end_date_gte of this ListDagRunsForm.  # noqa: E501
        :type: datetime
        """

        self._end_date_gte = end_date_gte

    @property
    def end_date_lte(self):
        """Gets the end_date_lte of this ListDagRunsForm.  # noqa: E501

        Returns objects less than or equal to the specified date. This can be combined with end_date_gte parameter to receive only the selected period.   # noqa: E501

        :return: The end_date_lte of this ListDagRunsForm.  # noqa: E501
        :rtype: datetime
        """
        return self._end_date_lte

    @end_date_lte.setter
    def end_date_lte(self, end_date_lte):
        """Sets the end_date_lte of this ListDagRunsForm.

        Returns objects less than or equal to the specified date. This can be combined with end_date_gte parameter to receive only the selected period.   # noqa: E501

        :param end_date_lte: The end_date_lte of this ListDagRunsForm.  # noqa: E501
        :type: datetime
        """

        self._end_date_lte = end_date_lte

    def to_dict(self):
        """Returns the model properties as a dict"""
        result = {}

        for attr, _ in six.iteritems(self.openapi_types):
            value = getattr(self, attr)
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: x.to_dict() if hasattr(x, "to_dict") else x,
                    value
                ))
            elif hasattr(value, "to_dict"):
                result[attr] = value.to_dict()
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], item[1].to_dict())
                    if hasattr(item[1], "to_dict") else item,
                    value.items()
                ))
            else:
                result[attr] = value

        return result

    def to_str(self):
        """Returns the string representation of the model"""
        return pprint.pformat(self.to_dict())

    def __repr__(self):
        """For `print` and `pprint`"""
        return self.to_str()

    def __eq__(self, other):
        """Returns true if both objects are equal"""
        if not isinstance(other, ListDagRunsForm):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, ListDagRunsForm):
            return True

        return self.to_dict() != other.to_dict()
