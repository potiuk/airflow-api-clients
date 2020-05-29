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


class DAGRun(object):
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
        'dag_run_id': 'str',
        'dag_id': 'str',
        'execution_date': 'datetime',
        'start_date': 'datetime',
        'end_date': 'datetime',
        'state': 'DagState',
        'external_trigger': 'bool',
        'conf': 'object'
    }

    attribute_map = {
        'dag_run_id': 'dag_run_id',
        'dag_id': 'dag_id',
        'execution_date': 'execution_date',
        'start_date': 'start_date',
        'end_date': 'end_date',
        'state': 'state',
        'external_trigger': 'external_trigger',
        'conf': 'conf'
    }

    def __init__(self, dag_run_id=None, dag_id=None, execution_date=None, start_date=None, end_date=None, state=None, external_trigger=True, conf=None, local_vars_configuration=None):  # noqa: E501
        """DAGRun - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration()
        self.local_vars_configuration = local_vars_configuration

        self._dag_run_id = None
        self._dag_id = None
        self._execution_date = None
        self._start_date = None
        self._end_date = None
        self._state = None
        self._external_trigger = None
        self._conf = None
        self.discriminator = None

        if dag_run_id is not None:
            self.dag_run_id = dag_run_id
        self.dag_id = dag_id
        if execution_date is not None:
            self.execution_date = execution_date
        if start_date is not None:
            self.start_date = start_date
        if end_date is not None:
            self.end_date = end_date
        if state is not None:
            self.state = state
        if external_trigger is not None:
            self.external_trigger = external_trigger
        if conf is not None:
            self.conf = conf

    @property
    def dag_run_id(self):
        """Gets the dag_run_id of this DAGRun.  # noqa: E501

        Run ID. The value of this field can be set only when creating the object. If you try to modify the field of an existing object, the request fails with an BAD_REQUEST error. If not provided, a value will be generated based on execution_date. If the specified dag_run_id is in use, the creation request fails with an ALREADY_EXISTS error. This together with DAG_ID are a unique key.   # noqa: E501

        :return: The dag_run_id of this DAGRun.  # noqa: E501
        :rtype: str
        """
        return self._dag_run_id

    @dag_run_id.setter
    def dag_run_id(self, dag_run_id):
        """Sets the dag_run_id of this DAGRun.

        Run ID. The value of this field can be set only when creating the object. If you try to modify the field of an existing object, the request fails with an BAD_REQUEST error. If not provided, a value will be generated based on execution_date. If the specified dag_run_id is in use, the creation request fails with an ALREADY_EXISTS error. This together with DAG_ID are a unique key.   # noqa: E501

        :param dag_run_id: The dag_run_id of this DAGRun.  # noqa: E501
        :type: str
        """

        self._dag_run_id = dag_run_id

    @property
    def dag_id(self):
        """Gets the dag_id of this DAGRun.  # noqa: E501


        :return: The dag_id of this DAGRun.  # noqa: E501
        :rtype: str
        """
        return self._dag_id

    @dag_id.setter
    def dag_id(self, dag_id):
        """Sets the dag_id of this DAGRun.


        :param dag_id: The dag_id of this DAGRun.  # noqa: E501
        :type: str
        """
        if self.local_vars_configuration.client_side_validation and dag_id is None:  # noqa: E501
            raise ValueError("Invalid value for `dag_id`, must not be `None`")  # noqa: E501

        self._dag_id = dag_id

    @property
    def execution_date(self):
        """Gets the execution_date of this DAGRun.  # noqa: E501

        The execution date. This is the time when the DAG run should be started according to the DAG definition. The value of this field can be set only when creating the object. If you try to modify the field of an existing object, the request fails with an BAD_REQUEST error. This together with DAG_ID are a unique key.   # noqa: E501

        :return: The execution_date of this DAGRun.  # noqa: E501
        :rtype: datetime
        """
        return self._execution_date

    @execution_date.setter
    def execution_date(self, execution_date):
        """Sets the execution_date of this DAGRun.

        The execution date. This is the time when the DAG run should be started according to the DAG definition. The value of this field can be set only when creating the object. If you try to modify the field of an existing object, the request fails with an BAD_REQUEST error. This together with DAG_ID are a unique key.   # noqa: E501

        :param execution_date: The execution_date of this DAGRun.  # noqa: E501
        :type: datetime
        """

        self._execution_date = execution_date

    @property
    def start_date(self):
        """Gets the start_date of this DAGRun.  # noqa: E501

        The start time. The time when DAG Run was actually created..   # noqa: E501

        :return: The start_date of this DAGRun.  # noqa: E501
        :rtype: datetime
        """
        return self._start_date

    @start_date.setter
    def start_date(self, start_date):
        """Sets the start_date of this DAGRun.

        The start time. The time when DAG Run was actually created..   # noqa: E501

        :param start_date: The start_date of this DAGRun.  # noqa: E501
        :type: datetime
        """

        self._start_date = start_date

    @property
    def end_date(self):
        """Gets the end_date of this DAGRun.  # noqa: E501


        :return: The end_date of this DAGRun.  # noqa: E501
        :rtype: datetime
        """
        return self._end_date

    @end_date.setter
    def end_date(self, end_date):
        """Sets the end_date of this DAGRun.


        :param end_date: The end_date of this DAGRun.  # noqa: E501
        :type: datetime
        """

        self._end_date = end_date

    @property
    def state(self):
        """Gets the state of this DAGRun.  # noqa: E501


        :return: The state of this DAGRun.  # noqa: E501
        :rtype: DagState
        """
        return self._state

    @state.setter
    def state(self, state):
        """Sets the state of this DAGRun.


        :param state: The state of this DAGRun.  # noqa: E501
        :type: DagState
        """

        self._state = state

    @property
    def external_trigger(self):
        """Gets the external_trigger of this DAGRun.  # noqa: E501


        :return: The external_trigger of this DAGRun.  # noqa: E501
        :rtype: bool
        """
        return self._external_trigger

    @external_trigger.setter
    def external_trigger(self, external_trigger):
        """Sets the external_trigger of this DAGRun.


        :param external_trigger: The external_trigger of this DAGRun.  # noqa: E501
        :type: bool
        """

        self._external_trigger = external_trigger

    @property
    def conf(self):
        """Gets the conf of this DAGRun.  # noqa: E501


        :return: The conf of this DAGRun.  # noqa: E501
        :rtype: object
        """
        return self._conf

    @conf.setter
    def conf(self, conf):
        """Sets the conf of this DAGRun.


        :param conf: The conf of this DAGRun.  # noqa: E501
        :type: object
        """

        self._conf = conf

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
        if not isinstance(other, DAGRun):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, DAGRun):
            return True

        return self.to_dict() != other.to_dict()