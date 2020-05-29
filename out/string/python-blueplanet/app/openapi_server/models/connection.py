# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.openapi_server.models.base_model_ import Model
from app.openapi_server.models.connection_all_of import ConnectionAllOf  # noqa: F401,E501
from app.openapi_server.models.connection_collection_item import ConnectionCollectionItem  # noqa: F401,E501
from openapi_server import util


class Connection(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, connection_id: str=None, conn_type: str=None, host: str=None, login: str=None, schema: str=None, port: int=None, password: str=None, extra: str=None):  # noqa: E501
        """Connection - a model defined in Swagger

        :param connection_id: The connection_id of this Connection.  # noqa: E501
        :type connection_id: str
        :param conn_type: The conn_type of this Connection.  # noqa: E501
        :type conn_type: str
        :param host: The host of this Connection.  # noqa: E501
        :type host: str
        :param login: The login of this Connection.  # noqa: E501
        :type login: str
        :param schema: The schema of this Connection.  # noqa: E501
        :type schema: str
        :param port: The port of this Connection.  # noqa: E501
        :type port: int
        :param password: The password of this Connection.  # noqa: E501
        :type password: str
        :param extra: The extra of this Connection.  # noqa: E501
        :type extra: str
        """
        self.swagger_types = {
            'connection_id': str,
            'conn_type': str,
            'host': str,
            'login': str,
            'schema': str,
            'port': int,
            'password': str,
            'extra': str
        }

        self.attribute_map = {
            'connection_id': 'connection_id',
            'conn_type': 'conn_type',
            'host': 'host',
            'login': 'login',
            'schema': 'schema',
            'port': 'port',
            'password': 'password',
            'extra': 'extra'
        }

        self._connection_id = connection_id
        self._conn_type = conn_type
        self._host = host
        self._login = login
        self._schema = schema
        self._port = port
        self._password = password
        self._extra = extra

    @classmethod
    def from_dict(cls, dikt) -> 'Connection':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The Connection of this Connection.  # noqa: E501
        :rtype: Connection
        """
        return util.deserialize_model(dikt, cls)

    @property
    def connection_id(self) -> str:
        """Gets the connection_id of this Connection.


        :return: The connection_id of this Connection.
        :rtype: str
        """
        return self._connection_id

    @connection_id.setter
    def connection_id(self, connection_id: str):
        """Sets the connection_id of this Connection.


        :param connection_id: The connection_id of this Connection.
        :type connection_id: str
        """

        self._connection_id = connection_id

    @property
    def conn_type(self) -> str:
        """Gets the conn_type of this Connection.


        :return: The conn_type of this Connection.
        :rtype: str
        """
        return self._conn_type

    @conn_type.setter
    def conn_type(self, conn_type: str):
        """Sets the conn_type of this Connection.


        :param conn_type: The conn_type of this Connection.
        :type conn_type: str
        """

        self._conn_type = conn_type

    @property
    def host(self) -> str:
        """Gets the host of this Connection.


        :return: The host of this Connection.
        :rtype: str
        """
        return self._host

    @host.setter
    def host(self, host: str):
        """Sets the host of this Connection.


        :param host: The host of this Connection.
        :type host: str
        """

        self._host = host

    @property
    def login(self) -> str:
        """Gets the login of this Connection.


        :return: The login of this Connection.
        :rtype: str
        """
        return self._login

    @login.setter
    def login(self, login: str):
        """Sets the login of this Connection.


        :param login: The login of this Connection.
        :type login: str
        """

        self._login = login

    @property
    def schema(self) -> str:
        """Gets the schema of this Connection.


        :return: The schema of this Connection.
        :rtype: str
        """
        return self._schema

    @schema.setter
    def schema(self, schema: str):
        """Sets the schema of this Connection.


        :param schema: The schema of this Connection.
        :type schema: str
        """

        self._schema = schema

    @property
    def port(self) -> int:
        """Gets the port of this Connection.


        :return: The port of this Connection.
        :rtype: int
        """
        return self._port

    @port.setter
    def port(self, port: int):
        """Sets the port of this Connection.


        :param port: The port of this Connection.
        :type port: int
        """

        self._port = port

    @property
    def password(self) -> str:
        """Gets the password of this Connection.


        :return: The password of this Connection.
        :rtype: str
        """
        return self._password

    @password.setter
    def password(self, password: str):
        """Sets the password of this Connection.


        :param password: The password of this Connection.
        :type password: str
        """

        self._password = password

    @property
    def extra(self) -> str:
        """Gets the extra of this Connection.


        :return: The extra of this Connection.
        :rtype: str
        """
        return self._extra

    @extra.setter
    def extra(self, extra: str):
        """Sets the extra of this Connection.


        :param extra: The extra of this Connection.
        :type extra: str
        """

        self._extra = extra
