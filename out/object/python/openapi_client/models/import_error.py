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

from openapi_client.configuration import Configuration


class ImportError(object):
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
        'import_error_id': 'int',
        'timestamp': 'str',
        'filename': 'str',
        'stack_trace': 'str'
    }

    attribute_map = {
        'import_error_id': 'import_error_id',
        'timestamp': 'timestamp',
        'filename': 'filename',
        'stack_trace': 'stack_trace'
    }

    def __init__(self, import_error_id=None, timestamp=None, filename=None, stack_trace=None, local_vars_configuration=None):  # noqa: E501
        """ImportError - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration()
        self.local_vars_configuration = local_vars_configuration

        self._import_error_id = None
        self._timestamp = None
        self._filename = None
        self._stack_trace = None
        self.discriminator = None

        if import_error_id is not None:
            self.import_error_id = import_error_id
        if timestamp is not None:
            self.timestamp = timestamp
        if filename is not None:
            self.filename = filename
        if stack_trace is not None:
            self.stack_trace = stack_trace

    @property
    def import_error_id(self):
        """Gets the import_error_id of this ImportError.  # noqa: E501


        :return: The import_error_id of this ImportError.  # noqa: E501
        :rtype: int
        """
        return self._import_error_id

    @import_error_id.setter
    def import_error_id(self, import_error_id):
        """Sets the import_error_id of this ImportError.


        :param import_error_id: The import_error_id of this ImportError.  # noqa: E501
        :type: int
        """

        self._import_error_id = import_error_id

    @property
    def timestamp(self):
        """Gets the timestamp of this ImportError.  # noqa: E501


        :return: The timestamp of this ImportError.  # noqa: E501
        :rtype: str
        """
        return self._timestamp

    @timestamp.setter
    def timestamp(self, timestamp):
        """Sets the timestamp of this ImportError.


        :param timestamp: The timestamp of this ImportError.  # noqa: E501
        :type: str
        """

        self._timestamp = timestamp

    @property
    def filename(self):
        """Gets the filename of this ImportError.  # noqa: E501


        :return: The filename of this ImportError.  # noqa: E501
        :rtype: str
        """
        return self._filename

    @filename.setter
    def filename(self, filename):
        """Sets the filename of this ImportError.


        :param filename: The filename of this ImportError.  # noqa: E501
        :type: str
        """

        self._filename = filename

    @property
    def stack_trace(self):
        """Gets the stack_trace of this ImportError.  # noqa: E501


        :return: The stack_trace of this ImportError.  # noqa: E501
        :rtype: str
        """
        return self._stack_trace

    @stack_trace.setter
    def stack_trace(self, stack_trace):
        """Sets the stack_trace of this ImportError.


        :param stack_trace: The stack_trace of this ImportError.  # noqa: E501
        :type: str
        """

        self._stack_trace = stack_trace

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
        if not isinstance(other, ImportError):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, ImportError):
            return True

        return self.to_dict() != other.to_dict()
