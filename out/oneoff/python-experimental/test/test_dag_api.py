# coding: utf-8

"""
    Airflow API (Stable)

    Apache Airflow management API.  # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Contact: dev@airflow.apache.org
    Generated by: https://openapi-generator.tech
"""


from __future__ import absolute_import

import unittest

import openapi_client
from openapi_client.api.dag_api import DAGApi  # noqa: E501
from openapi_client.rest import ApiException


class TestDAGApi(unittest.TestCase):
    """DAGApi unit test stubs"""

    def setUp(self):
        self.api = openapi_client.api.dag_api.DAGApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_clear_task_instance(self):
        """Test case for clear_task_instance

        Clears a set of task instances associated with the DAG for a specified date range.  # noqa: E501
        """
        pass

    def test_get_dag(self):
        """Test case for get_dag

        Get basic information about a DAG  # noqa: E501
        """
        pass

    def test_get_dag_detail(self):
        """Test case for get_dag_detail

        Get a simplified representation of DAG.  # noqa: E501
        """
        pass

    def test_get_dag_source(self):
        """Test case for get_dag_source

        Get source code using file token  # noqa: E501
        """
        pass

    def test_get_dags(self):
        """Test case for get_dags

        Get all DAGs  # noqa: E501
        """
        pass

    def test_get_task(self):
        """Test case for get_task

        Get simplified representation of a task.  # noqa: E501
        """
        pass

    def test_get_tasks(self):
        """Test case for get_tasks

        Get tasks for DAG  # noqa: E501
        """
        pass

    def test_update_dag(self):
        """Test case for update_dag

        Update a DAG  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()
