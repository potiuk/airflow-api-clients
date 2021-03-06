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
from airflow_client.models.schedule_interval import ScheduleInterval  # noqa: E501
from airflow_client.rest import ApiException

class TestScheduleInterval(unittest.TestCase):
    """ScheduleInterval unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional):
        """Test ScheduleInterval
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # model = airflow_client.models.schedule_interval.ScheduleInterval()  # noqa: E501
        if include_optional :
            return ScheduleInterval(
                type = '0', 
                days = 56, 
                seconds = 56, 
                microsecond = 56, 
                years = 56, 
                months = 56, 
                leapdays = 56, 
                hours = 56, 
                minutes = 56, 
                microseconds = 56, 
                year = 56, 
                month = 56, 
                day = 56, 
                hour = 56, 
                minute = 56, 
                second = 56, 
                value = '0'
            )
        else :
            return ScheduleInterval(
                type = '0',
        )

    def testScheduleInterval(self):
        """Test ScheduleInterval"""
        inst_req_only = self.make_instance(include_optional=False)
        inst_req_and_optional = self.make_instance(include_optional=True)


if __name__ == '__main__':
    unittest.main()
