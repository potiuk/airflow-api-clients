# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.openapi_server.models.base_model_ import Model
from app.openapi_server.models.import_error import ImportError  # noqa: F401,E501
from openapi_server import util


class ImportErrorCollection(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, import_errors: List[ImportError]=None):  # noqa: E501
        """ImportErrorCollection - a model defined in Swagger

        :param import_errors: The import_errors of this ImportErrorCollection.  # noqa: E501
        :type import_errors: List[ImportError]
        """
        self.swagger_types = {
            'import_errors': List[ImportError]
        }

        self.attribute_map = {
            'import_errors': 'import_errors'
        }

        self._import_errors = import_errors

    @classmethod
    def from_dict(cls, dikt) -> 'ImportErrorCollection':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ImportErrorCollection of this ImportErrorCollection.  # noqa: E501
        :rtype: ImportErrorCollection
        """
        return util.deserialize_model(dikt, cls)

    @property
    def import_errors(self) -> List[ImportError]:
        """Gets the import_errors of this ImportErrorCollection.


        :return: The import_errors of this ImportErrorCollection.
        :rtype: List[ImportError]
        """
        return self._import_errors

    @import_errors.setter
    def import_errors(self, import_errors: List[ImportError]):
        """Sets the import_errors of this ImportErrorCollection.


        :param import_errors: The import_errors of this ImportErrorCollection.
        :type import_errors: List[ImportError]
        """

        self._import_errors = import_errors
