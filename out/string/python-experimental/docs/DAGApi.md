# openapi_client.DAGApi

All URIs are relative to *http://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**clear_task_instance**](DAGApi.md#clear_task_instance) | **POST** /dags/{dag_id}/clearTaskInstances | Clears a set of task instances associated with the DAG for a specified date range.
[**get_dag**](DAGApi.md#get_dag) | **GET** /dags/{dag_id} | Get basic information about a DAG
[**get_dag_detail**](DAGApi.md#get_dag_detail) | **GET** /dags/{dag_id}/details | Get a simplified representation of DAG.
[**get_dag_source**](DAGApi.md#get_dag_source) | **GET** /dagSources/{file_token} | Get source code using file token
[**get_dags**](DAGApi.md#get_dags) | **GET** /dags | Get all DAGs
[**get_task**](DAGApi.md#get_task) | **GET** /dags/{dag_id}/tasks/{task_id} | Get simplified representation of a task.
[**get_tasks**](DAGApi.md#get_tasks) | **GET** /dags/{dag_id}/tasks | Get tasks for DAG
[**update_dag**](DAGApi.md#update_dag) | **PATCH** /dags/{dag_id} | Update a DAG


# **clear_task_instance**
> task_instance_reference_collection.TaskInstanceReferenceCollection clear_task_instance(dag_id, clear_task_instance_clear_task_instance)

Clears a set of task instances associated with the DAG for a specified date range.

### Example

```python
from __future__ import print_function
import time
import openapi_client
from pprint import pprint
# Defining the host is optional and defaults to http://localhost/api/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://localhost/api/v1"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DAGApi(api_client)
    dag_id = 'dag_id_example' # str | The DAG ID.
    clear_task_instance_clear_task_instance = openapi_client.ClearTaskInstance() # clear_task_instance.ClearTaskInstance | Parameters of action
    
    # example passing only required values which don't have defaults set
    try:
        # Clears a set of task instances associated with the DAG for a specified date range.
        api_response = api_instance.clear_task_instance(dag_id, clear_task_instance_clear_task_instance)
        pprint(api_response)
    except openapi_client.ApiException as e:
        print("Exception when calling DAGApi->clear_task_instance: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dag_id** | **str**| The DAG ID. |
 **clear_task_instance_clear_task_instance** | [**clear_task_instance.ClearTaskInstance**](ClearTaskInstance.md)| Parameters of action |

### Return type

[**task_instance_reference_collection.TaskInstanceReferenceCollection**](TaskInstanceReferenceCollection.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A list of cleared task references |  -  |
**401** | Request not authenticated due to missing, invalid, authentication info. |  -  |
**403** | Client does not have sufficient permission. |  -  |
**404** | A specified resource is not found. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_dag**
> dag.DAG get_dag(dag_id)

Get basic information about a DAG

Presents only information available in database (DAGModel). If you need detailed information, consider using GET /dags/{dag_id}/detail. 

### Example

```python
from __future__ import print_function
import time
import openapi_client
from pprint import pprint
# Defining the host is optional and defaults to http://localhost/api/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://localhost/api/v1"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DAGApi(api_client)
    dag_id = 'dag_id_example' # str | The DAG ID.
    
    # example passing only required values which don't have defaults set
    try:
        # Get basic information about a DAG
        api_response = api_instance.get_dag(dag_id)
        pprint(api_response)
    except openapi_client.ApiException as e:
        print("Exception when calling DAGApi->get_dag: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dag_id** | **str**| The DAG ID. |

### Return type

[**dag.DAG**](DAG.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response. |  -  |
**401** | Request not authenticated due to missing, invalid, authentication info. |  -  |
**403** | Client does not have sufficient permission. |  -  |
**404** | A specified resource is not found. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_dag_detail**
> dag_detail.DAGDetail get_dag_detail(dag_id)

Get a simplified representation of DAG.

The response contains many DAG attributes, so the response can be large. If possible, consider using GET /dags/{dag_id}. 

### Example

```python
from __future__ import print_function
import time
import openapi_client
from pprint import pprint
# Defining the host is optional and defaults to http://localhost/api/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://localhost/api/v1"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DAGApi(api_client)
    dag_id = 'dag_id_example' # str | The DAG ID.
    
    # example passing only required values which don't have defaults set
    try:
        # Get a simplified representation of DAG.
        api_response = api_instance.get_dag_detail(dag_id)
        pprint(api_response)
    except openapi_client.ApiException as e:
        print("Exception when calling DAGApi->get_dag_detail: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dag_id** | **str**| The DAG ID. |

### Return type

[**dag_detail.DAGDetail**](DAGDetail.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response. |  -  |
**401** | Request not authenticated due to missing, invalid, authentication info. |  -  |
**403** | Client does not have sufficient permission. |  -  |
**404** | A specified resource is not found. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_dag_source**
> inline_response2001.InlineResponse2001 get_dag_source(file_token)

Get source code using file token

### Example

```python
from __future__ import print_function
import time
import openapi_client
from pprint import pprint
# Defining the host is optional and defaults to http://localhost/api/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://localhost/api/v1"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DAGApi(api_client)
    file_token = 'file_token_example' # str | The key containing the encrypted path to the file. Encryption and decryption take place only on the server. This prevents the client from reading an non-DAG file. This also ensures API extensibility, because the format of encrypted data may change. 
    
    # example passing only required values which don't have defaults set
    try:
        # Get source code using file token
        api_response = api_instance.get_dag_source(file_token)
        pprint(api_response)
    except openapi_client.ApiException as e:
        print("Exception when calling DAGApi->get_dag_source: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file_token** | **str**| The key containing the encrypted path to the file. Encryption and decryption take place only on the server. This prevents the client from reading an non-DAG file. This also ensures API extensibility, because the format of encrypted data may change.  |

### Return type

[**inline_response2001.InlineResponse2001**](InlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response. |  -  |
**401** | Request not authenticated due to missing, invalid, authentication info. |  -  |
**403** | Client does not have sufficient permission. |  -  |
**404** | A specified resource is not found. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_dags**
> dag_collection.DAGCollection get_dags()

Get all DAGs

### Example

```python
from __future__ import print_function
import time
import openapi_client
from pprint import pprint
# Defining the host is optional and defaults to http://localhost/api/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://localhost/api/v1"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DAGApi(api_client)
    limit = 100 # int | The numbers of items to return. (optional) if omitted the server will use the default value of 100
offset = 56 # int | The number of items to skip before starting to collect the result set. (optional)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Get all DAGs
        api_response = api_instance.get_dags(limit=limit, offset=offset)
        pprint(api_response)
    except openapi_client.ApiException as e:
        print("Exception when calling DAGApi->get_dags: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **int**| The numbers of items to return. | [optional] if omitted the server will use the default value of 100
 **offset** | **int**| The number of items to skip before starting to collect the result set. | [optional]

### Return type

[**dag_collection.DAGCollection**](DAGCollection.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List of DAGs. |  -  |
**401** | Request not authenticated due to missing, invalid, authentication info. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_task**
> task.Task get_task(dag_id, task_id)

Get simplified representation of a task.

### Example

```python
from __future__ import print_function
import time
import openapi_client
from pprint import pprint
# Defining the host is optional and defaults to http://localhost/api/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://localhost/api/v1"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DAGApi(api_client)
    dag_id = 'dag_id_example' # str | The DAG ID.
    task_id = 'task_id_example' # str | The Task ID.
    
    # example passing only required values which don't have defaults set
    try:
        # Get simplified representation of a task.
        api_response = api_instance.get_task(dag_id, task_id)
        pprint(api_response)
    except openapi_client.ApiException as e:
        print("Exception when calling DAGApi->get_task: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dag_id** | **str**| The DAG ID. |
 **task_id** | **str**| The Task ID. |

### Return type

[**task.Task**](Task.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response. |  -  |
**401** | Request not authenticated due to missing, invalid, authentication info. |  -  |
**403** | Client does not have sufficient permission. |  -  |
**404** | A specified resource is not found. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_tasks**
> task_collection.TaskCollection get_tasks(dag_id)

Get tasks for DAG

### Example

```python
from __future__ import print_function
import time
import openapi_client
from pprint import pprint
# Defining the host is optional and defaults to http://localhost/api/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://localhost/api/v1"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DAGApi(api_client)
    dag_id = 'dag_id_example' # str | The DAG ID.
    
    # example passing only required values which don't have defaults set
    try:
        # Get tasks for DAG
        api_response = api_instance.get_tasks(dag_id)
        pprint(api_response)
    except openapi_client.ApiException as e:
        print("Exception when calling DAGApi->get_tasks: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dag_id** | **str**| The DAG ID. |

### Return type

[**task_collection.TaskCollection**](TaskCollection.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response. |  -  |
**401** | Request not authenticated due to missing, invalid, authentication info. |  -  |
**403** | Client does not have sufficient permission. |  -  |
**404** | A specified resource is not found. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_dag**
> dag.DAG update_dag(dag_id, dag_dag)

Update a DAG

### Example

```python
from __future__ import print_function
import time
import openapi_client
from pprint import pprint
# Defining the host is optional and defaults to http://localhost/api/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://localhost/api/v1"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DAGApi(api_client)
    dag_id = 'dag_id_example' # str | The DAG ID.
    dag_dag = openapi_client.DAG() # dag.DAG | 
    
    # example passing only required values which don't have defaults set
    try:
        # Update a DAG
        api_response = api_instance.update_dag(dag_id, dag_dag)
        pprint(api_response)
    except openapi_client.ApiException as e:
        print("Exception when calling DAGApi->update_dag: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dag_id** | **str**| The DAG ID. |
 **dag_dag** | [**dag.DAG**](DAG.md)|  |

### Return type

[**dag.DAG**](DAG.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response. |  -  |
**401** | Request not authenticated due to missing, invalid, authentication info. |  -  |
**403** | Client does not have sufficient permission. |  -  |
**404** | A specified resource is not found. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

