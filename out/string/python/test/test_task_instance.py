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
import datetime

import airflow_client
from airflow_client.models.task_instance import TaskInstance  # noqa: E501
from airflow_client.rest import ApiException

class TestTaskInstance(unittest.TestCase):
    """TaskInstance unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional):
        """Test TaskInstance
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # model = airflow_client.models.task_instance.TaskInstance()  # noqa: E501
        if include_optional :
            return TaskInstance(
                task_id = '0', 
                dag_id = '0', 
                execution_date = '0', 
                start_date = '0', 
                end_date = '0', 
                duration = 1.337, 
                state = 'succcess', 
                try_number = 56, 
                max_tries = 56, 
                hostname = '0', 
                unixname = '0', 
                pool = '0', 
                pool_slots = 56, 
                queue = '0', 
                priority_weight = 56, 
                operator = '0', 
                queued_when = '0', 
                pid = 56, 
                executor_config = '0', 
                sla_miss = airflow_client.models.sla_miss.SLAMiss(
                    task_id = '0', 
                    dag_id = '0', 
                    execution_date = '0', 
                    email_sent = True, 
                    timestamp = '0', 
                    description = '0', 
                    notification_sent = True, )
            )
        else :
            return TaskInstance(
        )

    def testTaskInstance(self):
        """Test TaskInstance"""
        inst_req_only = self.make_instance(include_optional=False)
        inst_req_and_optional = self.make_instance(include_optional=True)


if __name__ == '__main__':
    unittest.main()
