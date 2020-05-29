# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model_ import Model
from openapi_server.models.class_reference import ClassReference
from openapi_server import util

from openapi_server.models.class_reference import ClassReference  # noqa: E501

class TaskExtraLinks(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, class_ref=None):  # noqa: E501
        """TaskExtraLinks - a model defined in OpenAPI

        :param class_ref: The class_ref of this TaskExtraLinks.  # noqa: E501
        :type class_ref: ClassReference
        """
        self.openapi_types = {
            'class_ref': ClassReference
        }

        self.attribute_map = {
            'class_ref': 'class_ref'
        }

        self._class_ref = class_ref

    @classmethod
    def from_dict(cls, dikt) -> 'TaskExtraLinks':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The Task_extra_links of this TaskExtraLinks.  # noqa: E501
        :rtype: TaskExtraLinks
        """
        return util.deserialize_model(dikt, cls)

    @property
    def class_ref(self):
        """Gets the class_ref of this TaskExtraLinks.


        :return: The class_ref of this TaskExtraLinks.
        :rtype: ClassReference
        """
        return self._class_ref

    @class_ref.setter
    def class_ref(self, class_ref):
        """Sets the class_ref of this TaskExtraLinks.


        :param class_ref: The class_ref of this TaskExtraLinks.
        :type class_ref: ClassReference
        """

        self._class_ref = class_ref