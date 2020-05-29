# Go API client for openapi

Apache Airflow management API.

## Overview
This API client was generated by the [OpenAPI Generator](https://openapi-generator.tech) project.  By using the [OpenAPI-spec](https://www.openapis.org/) from a remote server, you can easily generate an API client.

- API version: 1.0.0
- Package version: 1.0.0
- Build package: org.openapitools.codegen.languages.GoClientCodegen
For more information, please visit [https://airflow.apache.org](https://airflow.apache.org)

## Installation

Install the following dependencies:

```shell
go get github.com/stretchr/testify/assert
go get golang.org/x/oauth2
go get golang.org/x/net/context
go get github.com/antihax/optional
```

Put the package under your project folder and add the following in import:

```golang
import "./openapi"
```

## Documentation for API Endpoints

All URIs are relative to *http://localhost/api/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ConfigApi* | [**GetConfig**](docs/ConfigApi.md#getconfig) | **Get** /config | Get current configuration
*ConnectionApi* | [**CreateConnection**](docs/ConnectionApi.md#createconnection) | **Post** /connections | Create connection entry
*ConnectionApi* | [**DeleteConnection**](docs/ConnectionApi.md#deleteconnection) | **Delete** /connections/{connection_id} | Delete a connection entry
*ConnectionApi* | [**GetConnection**](docs/ConnectionApi.md#getconnection) | **Get** /connections/{connection_id} | Get a connection entry
*ConnectionApi* | [**GetConnections**](docs/ConnectionApi.md#getconnections) | **Get** /connections | Get all connection entries
*ConnectionApi* | [**UpdateConnection**](docs/ConnectionApi.md#updateconnection) | **Patch** /connections/{connection_id} | Update a connection entry
*DAGApi* | [**ClearTaskInstance**](docs/DAGApi.md#cleartaskinstance) | **Post** /dags/{dag_id}/clearTaskInstances | Clears a set of task instances associated with the DAG for a specified date range.
*DAGApi* | [**GetDag**](docs/DAGApi.md#getdag) | **Get** /dags/{dag_id} | Get basic information about a DAG
*DAGApi* | [**GetDagDetail**](docs/DAGApi.md#getdagdetail) | **Get** /dags/{dag_id}/details | Get a simplified representation of DAG.
*DAGApi* | [**GetDagSource**](docs/DAGApi.md#getdagsource) | **Get** /dagSources/{file_token} | Get source code using file token
*DAGApi* | [**GetDags**](docs/DAGApi.md#getdags) | **Get** /dags | Get all DAGs
*DAGApi* | [**GetTask**](docs/DAGApi.md#gettask) | **Get** /dags/{dag_id}/tasks/{task_id} | Get simplified representation of a task.
*DAGApi* | [**GetTasks**](docs/DAGApi.md#gettasks) | **Get** /dags/{dag_id}/tasks | Get tasks for DAG
*DAGApi* | [**UpdateDag**](docs/DAGApi.md#updatedag) | **Patch** /dags/{dag_id} | Update a DAG
*DAGRunApi* | [**CreateDagRun**](docs/DAGRunApi.md#createdagrun) | **Post** /dags/{dag_id}/dagRuns/{dag_run_id} | Trigger a DAG Run
*DAGRunApi* | [**DeleteDagRun**](docs/DAGRunApi.md#deletedagrun) | **Delete** /dags/{dag_id}/dagRuns/{dag_run_id} | Delete a DAG Run
*DAGRunApi* | [**GetDagRun**](docs/DAGRunApi.md#getdagrun) | **Get** /dags/{dag_id}/dagRuns/{dag_run_id} | Get a DAG Run
*DAGRunApi* | [**GetDagRuns**](docs/DAGRunApi.md#getdagruns) | **Get** /dags/{dag_id}/dagRuns | Get all DAG Runs
*DAGRunApi* | [**GetDagRunsBatch**](docs/DAGRunApi.md#getdagrunsbatch) | **Post** /dags/~/dagRuns/list | Get all DAG Runs from aall DAGs.
*DAGRunApi* | [**UpdateDagRun**](docs/DAGRunApi.md#updatedagrun) | **Patch** /dags/{dag_id}/dagRuns/{dag_run_id} | Update a DAG Run
*EventLogApi* | [**GetEventLog**](docs/EventLogApi.md#geteventlog) | **Get** /eventLogs | Get all log entries from event log
*EventLogApi* | [**GetEventLogEntry**](docs/EventLogApi.md#geteventlogentry) | **Get** /eventLogs/{event_log_id} | Get a log entry
*ImportErrorApi* | [**DeleteImportError**](docs/ImportErrorApi.md#deleteimporterror) | **Delete** /importErrors/{import_error_id} | Delete an import error
*ImportErrorApi* | [**GetImportError**](docs/ImportErrorApi.md#getimporterror) | **Get** /importErrors/{import_error_id} | Get an import error
*ImportErrorApi* | [**GetImportErrors**](docs/ImportErrorApi.md#getimporterrors) | **Get** /importErrors | Get all import errors
*PoolApi* | [**CreatePool**](docs/PoolApi.md#createpool) | **Post** /pools | Create a pool
*PoolApi* | [**DeletePool**](docs/PoolApi.md#deletepool) | **Delete** /pools/{pool_name} | Delete a pool
*PoolApi* | [**GetPool**](docs/PoolApi.md#getpool) | **Get** /pools/{pool_name} | Get a pool
*PoolApi* | [**GetPools**](docs/PoolApi.md#getpools) | **Get** /pools | Get all pools
*PoolApi* | [**UpdatePool**](docs/PoolApi.md#updatepool) | **Patch** /pools/{pool_name} | Update a pool
*TaskInstanceApi* | [**GetExtraLinks**](docs/TaskInstanceApi.md#getextralinks) | **Get** /dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/links | Get extra links for task instance
*TaskInstanceApi* | [**GetLogs**](docs/TaskInstanceApi.md#getlogs) | **Get** /dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/logs/{task_try_number} | Get logs for a task instance
*TaskInstanceApi* | [**GetTaskInstance**](docs/TaskInstanceApi.md#gettaskinstance) | **Get** /dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id} | Get a task instance
*TaskInstanceApi* | [**GetTaskInstances**](docs/TaskInstanceApi.md#gettaskinstances) | **Get** /dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances | Get a list of task instance of DAG.
*TaskInstanceApi* | [**GetTaskInstancesBatch**](docs/TaskInstanceApi.md#gettaskinstancesbatch) | **Post** /dags/~/dagRuns/~/taskInstances/list | Get list of task instances from all DAGs and DAG Runs.
*VariableApi* | [**CreateVariable**](docs/VariableApi.md#createvariable) | **Post** /variables | Create a variable
*VariableApi* | [**DeleteVariable**](docs/VariableApi.md#deletevariable) | **Delete** /variables/{variable_key} | Delete variable
*VariableApi* | [**GetVariable**](docs/VariableApi.md#getvariable) | **Get** /variables/{variable_key} | Get a variable by key
*VariableApi* | [**GetVariables**](docs/VariableApi.md#getvariables) | **Get** /variables | Get all variables
*VariableApi* | [**UpdateVariable**](docs/VariableApi.md#updatevariable) | **Patch** /variables/{variable_key} | Update a variable by key
*XComApi* | [**DeleteXComValue**](docs/XComApi.md#deletexcomvalue) | **Delete** /dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/xcomEntries/{key} | Delete an XCom entry
*XComApi* | [**GetXComEntry**](docs/XComApi.md#getxcomentry) | **Get** /dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/xcomEntries | Get all XCom entries
*XComApi* | [**GetXComValue**](docs/XComApi.md#getxcomvalue) | **Get** /dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/xcomEntries/{key} | Get an XCom entry
*XComApi* | [**UpdateXComEntry**](docs/XComApi.md#updatexcomentry) | **Post** /dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/xcomEntries | Create an XCom entry
*XComApi* | [**UpdateXComValue**](docs/XComApi.md#updatexcomvalue) | **Patch** /dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/xcomEntries/{key} | Update an XCom entry


## Documentation For Models

 - [ClassReference](docs/ClassReference.md)
 - [ClearTaskInstance](docs/ClearTaskInstance.md)
 - [CollectionInfo](docs/CollectionInfo.md)
 - [Config](docs/Config.md)
 - [ConfigOption](docs/ConfigOption.md)
 - [ConfigSection](docs/ConfigSection.md)
 - [Connection](docs/Connection.md)
 - [ConnectionAllOf](docs/ConnectionAllOf.md)
 - [ConnectionCollection](docs/ConnectionCollection.md)
 - [ConnectionCollectionItem](docs/ConnectionCollectionItem.md)
 - [CronExpression](docs/CronExpression.md)
 - [Dag](docs/Dag.md)
 - [DagCollection](docs/DagCollection.md)
 - [DagDetail](docs/DagDetail.md)
 - [DagDetailAllOf](docs/DagDetailAllOf.md)
 - [DagRun](docs/DagRun.md)
 - [DagRunCollection](docs/DagRunCollection.md)
 - [DagState](docs/DagState.md)
 - [Error](docs/Error.md)
 - [EventLog](docs/EventLog.md)
 - [EventLogCollection](docs/EventLogCollection.md)
 - [ExtraLink](docs/ExtraLink.md)
 - [ExtraLinkCollection](docs/ExtraLinkCollection.md)
 - [ImportError](docs/ImportError.md)
 - [ImportErrorCollection](docs/ImportErrorCollection.md)
 - [InlineResponse200](docs/InlineResponse200.md)
 - [InlineResponse2001](docs/InlineResponse2001.md)
 - [ListDagRunsForm](docs/ListDagRunsForm.md)
 - [ListTaskInstanceForm](docs/ListTaskInstanceForm.md)
 - [Pool](docs/Pool.md)
 - [PoolCollection](docs/PoolCollection.md)
 - [RelativeDelta](docs/RelativeDelta.md)
 - [ScheduleInterval](docs/ScheduleInterval.md)
 - [SlaMiss](docs/SlaMiss.md)
 - [SlaMissCollection](docs/SlaMissCollection.md)
 - [Tag](docs/Tag.md)
 - [Task](docs/Task.md)
 - [TaskCollection](docs/TaskCollection.md)
 - [TaskExtraLinks](docs/TaskExtraLinks.md)
 - [TaskFail](docs/TaskFail.md)
 - [TaskInstance](docs/TaskInstance.md)
 - [TaskInstanceCollection](docs/TaskInstanceCollection.md)
 - [TaskInstanceReference](docs/TaskInstanceReference.md)
 - [TaskInstanceReferenceCollection](docs/TaskInstanceReferenceCollection.md)
 - [TaskState](docs/TaskState.md)
 - [TimeDelta](docs/TimeDelta.md)
 - [TriggerRule](docs/TriggerRule.md)
 - [Variable](docs/Variable.md)
 - [VariableAllOf](docs/VariableAllOf.md)
 - [VariableCollection](docs/VariableCollection.md)
 - [VariableCollectionItem](docs/VariableCollectionItem.md)
 - [WeightRule](docs/WeightRule.md)
 - [XCom](docs/XCom.md)
 - [XComCollection](docs/XComCollection.md)
 - [XComCollectionItem](docs/XComCollectionItem.md)


## Documentation For Authorization

 Endpoints do not require authorization.



## Author

dev@airflow.apache.org
