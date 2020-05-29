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


class Connection(object):
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
        'connection_id': 'str',
        'conn_type': 'str',
        'host': 'str',
        'login': 'str',
        'schema': 'str',
        'port': 'int',
        'password': 'str',
        'extra': 'str'
    }

    attribute_map = {
        'connection_id': 'connection_id',
        'conn_type': 'conn_type',
        'host': 'host',
        'login': 'login',
        'schema': 'schema',
        'port': 'port',
        'password': 'password',
        'extra': 'extra'
    }

    def __init__(self, connection_id=None, conn_type=None, host=None, login=None, schema=None, port=None, password=None, extra=None, local_vars_configuration=None):  # noqa: E501
        """Connection - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration()
        self.local_vars_configuration = local_vars_configuration

        self._connection_id = None
        self._conn_type = None
        self._host = None
        self._login = None
        self._schema = None
        self._port = None
        self._password = None
        self._extra = None
        self.discriminator = None

        if connection_id is not None:
            self.connection_id = connection_id
        if conn_type is not None:
            self.conn_type = conn_type
        if host is not None:
            self.host = host
        if login is not None:
            self.login = login
        if schema is not None:
            self.schema = schema
        if port is not None:
            self.port = port
        if password is not None:
            self.password = password
        if extra is not None:
            self.extra = extra

    @property
    def connection_id(self):
        """Gets the connection_id of this Connection.  # noqa: E501


        :return: The connection_id of this Connection.  # noqa: E501
        :rtype: str
        """
        return self._connection_id

    @connection_id.setter
    def connection_id(self, connection_id):
        """Sets the connection_id of this Connection.


        :param connection_id: The connection_id of this Connection.  # noqa: E501
        :type: str
        """

        self._connection_id = connection_id

    @property
    def conn_type(self):
        """Gets the conn_type of this Connection.  # noqa: E501


        :return: The conn_type of this Connection.  # noqa: E501
        :rtype: str
        """
        return self._conn_type

    @conn_type.setter
    def conn_type(self, conn_type):
        """Sets the conn_type of this Connection.


        :param conn_type: The conn_type of this Connection.  # noqa: E501
        :type: str
        """

        self._conn_type = conn_type

    @property
    def host(self):
        """Gets the host of this Connection.  # noqa: E501


        :return: The host of this Connection.  # noqa: E501
        :rtype: str
        """
        return self._host

    @host.setter
    def host(self, host):
        """Sets the host of this Connection.


        :param host: The host of this Connection.  # noqa: E501
        :type: str
        """

        self._host = host

    @property
    def login(self):
        """Gets the login of this Connection.  # noqa: E501


        :return: The login of this Connection.  # noqa: E501
        :rtype: str
        """
        return self._login

    @login.setter
    def login(self, login):
        """Sets the login of this Connection.


        :param login: The login of this Connection.  # noqa: E501
        :type: str
        """

        self._login = login

    @property
    def schema(self):
        """Gets the schema of this Connection.  # noqa: E501


        :return: The schema of this Connection.  # noqa: E501
        :rtype: str
        """
        return self._schema

    @schema.setter
    def schema(self, schema):
        """Sets the schema of this Connection.


        :param schema: The schema of this Connection.  # noqa: E501
        :type: str
        """

        self._schema = schema

    @property
    def port(self):
        """Gets the port of this Connection.  # noqa: E501


        :return: The port of this Connection.  # noqa: E501
        :rtype: int
        """
        return self._port

    @port.setter
    def port(self, port):
        """Sets the port of this Connection.


        :param port: The port of this Connection.  # noqa: E501
        :type: int
        """

        self._port = port

    @property
    def password(self):
        """Gets the password of this Connection.  # noqa: E501


        :return: The password of this Connection.  # noqa: E501
        :rtype: str
        """
        return self._password

    @password.setter
    def password(self, password):
        """Sets the password of this Connection.


        :param password: The password of this Connection.  # noqa: E501
        :type: str
        """

        self._password = password

    @property
    def extra(self):
        """Gets the extra of this Connection.  # noqa: E501


        :return: The extra of this Connection.  # noqa: E501
        :rtype: str
        """
        return self._extra

    @extra.setter
    def extra(self, extra):
        """Sets the extra of this Connection.


        :param extra: The extra of this Connection.  # noqa: E501
        :type: str
        """

        self._extra = extra

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
        if not isinstance(other, Connection):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, Connection):
            return True

        return self.to_dict() != other.to_dict()
