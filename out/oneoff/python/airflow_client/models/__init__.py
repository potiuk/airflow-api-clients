# coding: utf-8

# flake8: noqa
"""
    Airflow API (Stable)

    Apache Airflow management API.  # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Contact: dev@airflow.apache.org
    Generated by: https://openapi-generator.tech
"""


from __future__ import absolute_import

# import models into model package
from airflow_client.models.class_reference import ClassReference
from airflow_client.models.clear_task_instance import ClearTaskInstance
from airflow_client.models.collection_info import CollectionInfo
from airflow_client.models.config import Config
from airflow_client.models.config_option import ConfigOption
from airflow_client.models.config_section import ConfigSection
from airflow_client.models.connection import Connection
from airflow_client.models.connection_all_of import ConnectionAllOf
from airflow_client.models.connection_collection import ConnectionCollection
from airflow_client.models.connection_collection_item import ConnectionCollectionItem
from airflow_client.models.cron_expression import CronExpression
from airflow_client.models.dag import DAG
from airflow_client.models.dag_collection import DAGCollection
from airflow_client.models.dag_detail import DAGDetail
from airflow_client.models.dag_detail_all_of import DAGDetailAllOf
from airflow_client.models.dag_run import DAGRun
from airflow_client.models.dag_run_collection import DAGRunCollection
from airflow_client.models.dag_state import DagState
from airflow_client.models.error import Error
from airflow_client.models.event_log import EventLog
from airflow_client.models.event_log_collection import EventLogCollection
from airflow_client.models.extra_link import ExtraLink
from airflow_client.models.extra_link_collection import ExtraLinkCollection
from airflow_client.models.import_error import ImportError
from airflow_client.models.import_error_collection import ImportErrorCollection
from airflow_client.models.inline_response200 import InlineResponse200
from airflow_client.models.inline_response2001 import InlineResponse2001
from airflow_client.models.list_dag_runs_form import ListDagRunsForm
from airflow_client.models.list_task_instance_form import ListTaskInstanceForm
from airflow_client.models.pool import Pool
from airflow_client.models.pool_collection import PoolCollection
from airflow_client.models.relative_delta import RelativeDelta
from airflow_client.models.sla_miss import SLAMiss
from airflow_client.models.sla_miss_collection import SLAMissCollection
from airflow_client.models.schedule_interval import ScheduleInterval
from airflow_client.models.tag import Tag
from airflow_client.models.task import Task
from airflow_client.models.task_collection import TaskCollection
from airflow_client.models.task_extra_links import TaskExtraLinks
from airflow_client.models.task_fail import TaskFail
from airflow_client.models.task_instance import TaskInstance
from airflow_client.models.task_instance_collection import TaskInstanceCollection
from airflow_client.models.task_instance_reference import TaskInstanceReference
from airflow_client.models.task_instance_reference_collection import TaskInstanceReferenceCollection
from airflow_client.models.task_state import TaskState
from airflow_client.models.time_delta import TimeDelta
from airflow_client.models.trigger_rule import TriggerRule
from airflow_client.models.variable import Variable
from airflow_client.models.variable_all_of import VariableAllOf
from airflow_client.models.variable_collection import VariableCollection
from airflow_client.models.variable_collection_item import VariableCollectionItem
from airflow_client.models.weight_rule import WeightRule
from airflow_client.models.x_com import XCom
from airflow_client.models.x_com_collection import XComCollection
from airflow_client.models.x_com_collection_item import XComCollectionItem
