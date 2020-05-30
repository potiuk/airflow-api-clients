# coding: utf-8

"""
    Airflow API (Stable)

    Apache Airflow management API.  # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Contact: dev@airflow.apache.org
    Generated by: https://openapi-generator.tech
"""


from __future__ import absolute_import

import re  # noqa: F401

# python 2 and python 3 compatibility library
import six

from openapi_client.api_client import ApiClient
from openapi_client.exceptions import (  # noqa: F401
    ApiTypeError,
    ApiValueError
)


class XComApi(object):
    """NOTE: This class is auto generated by OpenAPI Generator
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client

    def delete_x_com_value(self, dag_id, dag_run_id, task_id, xcom_key, **kwargs):  # noqa: E501
        """Delete an XCom entry  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.delete_x_com_value(dag_id, dag_run_id, task_id, xcom_key, async_req=True)
        >>> result = thread.get()

        :param async_req bool: execute request asynchronously
        :param str dag_id: The DAG ID. (required)
        :param str dag_run_id: The DAG Run ID. (required)
        :param str task_id: The Task ID. (required)
        :param str xcom_key: The XCom Key. (required)
        :param _preload_content: if False, the urllib3.HTTPResponse object will
                                 be returned without reading/decoding response
                                 data. Default is True.
        :param _request_timeout: timeout setting for this request. If one
                                 number provided, it will be total request
                                 timeout. It can also be a pair (tuple) of
                                 (connection, read) timeouts.
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        return self.delete_x_com_value_with_http_info(dag_id, dag_run_id, task_id, xcom_key, **kwargs)  # noqa: E501

    def delete_x_com_value_with_http_info(self, dag_id, dag_run_id, task_id, xcom_key, **kwargs):  # noqa: E501
        """Delete an XCom entry  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.delete_x_com_value_with_http_info(dag_id, dag_run_id, task_id, xcom_key, async_req=True)
        >>> result = thread.get()

        :param async_req bool: execute request asynchronously
        :param str dag_id: The DAG ID. (required)
        :param str dag_run_id: The DAG Run ID. (required)
        :param str task_id: The Task ID. (required)
        :param str xcom_key: The XCom Key. (required)
        :param _return_http_data_only: response data without head status code
                                       and headers
        :param _preload_content: if False, the urllib3.HTTPResponse object will
                                 be returned without reading/decoding response
                                 data. Default is True.
        :param _request_timeout: timeout setting for this request. If one
                                 number provided, it will be total request
                                 timeout. It can also be a pair (tuple) of
                                 (connection, read) timeouts.
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        local_var_params = locals()

        all_params = [
            'dag_id',
            'dag_run_id',
            'task_id',
            'xcom_key'
        ]
        all_params.extend(
            [
                'async_req',
                '_return_http_data_only',
                '_preload_content',
                '_request_timeout'
            ]
        )

        for key, val in six.iteritems(local_var_params['kwargs']):
            if key not in all_params:
                raise ApiTypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method delete_x_com_value" % key
                )
            local_var_params[key] = val
        del local_var_params['kwargs']
        # verify the required parameter 'dag_id' is set
        if self.api_client.client_side_validation and ('dag_id' not in local_var_params or  # noqa: E501
                                                        local_var_params['dag_id'] is None):  # noqa: E501
            raise ApiValueError("Missing the required parameter `dag_id` when calling `delete_x_com_value`")  # noqa: E501
        # verify the required parameter 'dag_run_id' is set
        if self.api_client.client_side_validation and ('dag_run_id' not in local_var_params or  # noqa: E501
                                                        local_var_params['dag_run_id'] is None):  # noqa: E501
            raise ApiValueError("Missing the required parameter `dag_run_id` when calling `delete_x_com_value`")  # noqa: E501
        # verify the required parameter 'task_id' is set
        if self.api_client.client_side_validation and ('task_id' not in local_var_params or  # noqa: E501
                                                        local_var_params['task_id'] is None):  # noqa: E501
            raise ApiValueError("Missing the required parameter `task_id` when calling `delete_x_com_value`")  # noqa: E501
        # verify the required parameter 'xcom_key' is set
        if self.api_client.client_side_validation and ('xcom_key' not in local_var_params or  # noqa: E501
                                                        local_var_params['xcom_key'] is None):  # noqa: E501
            raise ApiValueError("Missing the required parameter `xcom_key` when calling `delete_x_com_value`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'dag_id' in local_var_params:
            path_params['dag_id'] = local_var_params['dag_id']  # noqa: E501
        if 'dag_run_id' in local_var_params:
            path_params['dag_run_id'] = local_var_params['dag_run_id']  # noqa: E501
        if 'task_id' in local_var_params:
            path_params['task_id'] = local_var_params['task_id']  # noqa: E501
        if 'xcom_key' in local_var_params:
            path_params['xcom_key'] = local_var_params['xcom_key']  # noqa: E501

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = []  # noqa: E501

        return self.api_client.call_api(
            '/dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/xcomEntries/{key}', 'DELETE',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type=None,  # noqa: E501
            auth_settings=auth_settings,
            async_req=local_var_params.get('async_req'),
            _return_http_data_only=local_var_params.get('_return_http_data_only'),  # noqa: E501
            _preload_content=local_var_params.get('_preload_content', True),
            _request_timeout=local_var_params.get('_request_timeout'),
            collection_formats=collection_formats)

    def get_x_com_entry(self, dag_id, dag_run_id, task_id, **kwargs):  # noqa: E501
        """Get all XCom entries  # noqa: E501

        This endpoint allows specifying `~` as the dag_id, dag_run_id, task_id to retrieve XCOM entries for for all DAGs, DAG Runs and task instances.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_x_com_entry(dag_id, dag_run_id, task_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool: execute request asynchronously
        :param str dag_id: The DAG ID. (required)
        :param str dag_run_id: The DAG Run ID. (required)
        :param str task_id: The Task ID. (required)
        :param int limit: The numbers of items to return.
        :param int offset: The number of items to skip before starting to collect the result set.
        :param _preload_content: if False, the urllib3.HTTPResponse object will
                                 be returned without reading/decoding response
                                 data. Default is True.
        :param _request_timeout: timeout setting for this request. If one
                                 number provided, it will be total request
                                 timeout. It can also be a pair (tuple) of
                                 (connection, read) timeouts.
        :return: XComCollection
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        return self.get_x_com_entry_with_http_info(dag_id, dag_run_id, task_id, **kwargs)  # noqa: E501

    def get_x_com_entry_with_http_info(self, dag_id, dag_run_id, task_id, **kwargs):  # noqa: E501
        """Get all XCom entries  # noqa: E501

        This endpoint allows specifying `~` as the dag_id, dag_run_id, task_id to retrieve XCOM entries for for all DAGs, DAG Runs and task instances.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_x_com_entry_with_http_info(dag_id, dag_run_id, task_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool: execute request asynchronously
        :param str dag_id: The DAG ID. (required)
        :param str dag_run_id: The DAG Run ID. (required)
        :param str task_id: The Task ID. (required)
        :param int limit: The numbers of items to return.
        :param int offset: The number of items to skip before starting to collect the result set.
        :param _return_http_data_only: response data without head status code
                                       and headers
        :param _preload_content: if False, the urllib3.HTTPResponse object will
                                 be returned without reading/decoding response
                                 data. Default is True.
        :param _request_timeout: timeout setting for this request. If one
                                 number provided, it will be total request
                                 timeout. It can also be a pair (tuple) of
                                 (connection, read) timeouts.
        :return: tuple(XComCollection, status_code(int), headers(HTTPHeaderDict))
                 If the method is called asynchronously,
                 returns the request thread.
        """

        local_var_params = locals()

        all_params = [
            'dag_id',
            'dag_run_id',
            'task_id',
            'limit',
            'offset'
        ]
        all_params.extend(
            [
                'async_req',
                '_return_http_data_only',
                '_preload_content',
                '_request_timeout'
            ]
        )

        for key, val in six.iteritems(local_var_params['kwargs']):
            if key not in all_params:
                raise ApiTypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_x_com_entry" % key
                )
            local_var_params[key] = val
        del local_var_params['kwargs']
        # verify the required parameter 'dag_id' is set
        if self.api_client.client_side_validation and ('dag_id' not in local_var_params or  # noqa: E501
                                                        local_var_params['dag_id'] is None):  # noqa: E501
            raise ApiValueError("Missing the required parameter `dag_id` when calling `get_x_com_entry`")  # noqa: E501
        # verify the required parameter 'dag_run_id' is set
        if self.api_client.client_side_validation and ('dag_run_id' not in local_var_params or  # noqa: E501
                                                        local_var_params['dag_run_id'] is None):  # noqa: E501
            raise ApiValueError("Missing the required parameter `dag_run_id` when calling `get_x_com_entry`")  # noqa: E501
        # verify the required parameter 'task_id' is set
        if self.api_client.client_side_validation and ('task_id' not in local_var_params or  # noqa: E501
                                                        local_var_params['task_id'] is None):  # noqa: E501
            raise ApiValueError("Missing the required parameter `task_id` when calling `get_x_com_entry`")  # noqa: E501

        if self.api_client.client_side_validation and 'limit' in local_var_params and local_var_params['limit'] < 1:  # noqa: E501
            raise ApiValueError("Invalid value for parameter `limit` when calling `get_x_com_entry`, must be a value greater than or equal to `1`")  # noqa: E501
        if self.api_client.client_side_validation and 'offset' in local_var_params and local_var_params['offset'] < 0:  # noqa: E501
            raise ApiValueError("Invalid value for parameter `offset` when calling `get_x_com_entry`, must be a value greater than or equal to `0`")  # noqa: E501
        collection_formats = {}

        path_params = {}
        if 'dag_id' in local_var_params:
            path_params['dag_id'] = local_var_params['dag_id']  # noqa: E501
        if 'dag_run_id' in local_var_params:
            path_params['dag_run_id'] = local_var_params['dag_run_id']  # noqa: E501
        if 'task_id' in local_var_params:
            path_params['task_id'] = local_var_params['task_id']  # noqa: E501

        query_params = []
        if 'limit' in local_var_params and local_var_params['limit'] is not None:  # noqa: E501
            query_params.append(('limit', local_var_params['limit']))  # noqa: E501
        if 'offset' in local_var_params and local_var_params['offset'] is not None:  # noqa: E501
            query_params.append(('offset', local_var_params['offset']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = []  # noqa: E501

        return self.api_client.call_api(
            '/dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/xcomEntries', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='XComCollection',  # noqa: E501
            auth_settings=auth_settings,
            async_req=local_var_params.get('async_req'),
            _return_http_data_only=local_var_params.get('_return_http_data_only'),  # noqa: E501
            _preload_content=local_var_params.get('_preload_content', True),
            _request_timeout=local_var_params.get('_request_timeout'),
            collection_formats=collection_formats)

    def get_x_com_value(self, dag_id, dag_run_id, task_id, xcom_key, **kwargs):  # noqa: E501
        """Get an XCom entry  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_x_com_value(dag_id, dag_run_id, task_id, xcom_key, async_req=True)
        >>> result = thread.get()

        :param async_req bool: execute request asynchronously
        :param str dag_id: The DAG ID. (required)
        :param str dag_run_id: The DAG Run ID. (required)
        :param str task_id: The Task ID. (required)
        :param str xcom_key: The XCom Key. (required)
        :param _preload_content: if False, the urllib3.HTTPResponse object will
                                 be returned without reading/decoding response
                                 data. Default is True.
        :param _request_timeout: timeout setting for this request. If one
                                 number provided, it will be total request
                                 timeout. It can also be a pair (tuple) of
                                 (connection, read) timeouts.
        :return: XCom
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        return self.get_x_com_value_with_http_info(dag_id, dag_run_id, task_id, xcom_key, **kwargs)  # noqa: E501

    def get_x_com_value_with_http_info(self, dag_id, dag_run_id, task_id, xcom_key, **kwargs):  # noqa: E501
        """Get an XCom entry  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_x_com_value_with_http_info(dag_id, dag_run_id, task_id, xcom_key, async_req=True)
        >>> result = thread.get()

        :param async_req bool: execute request asynchronously
        :param str dag_id: The DAG ID. (required)
        :param str dag_run_id: The DAG Run ID. (required)
        :param str task_id: The Task ID. (required)
        :param str xcom_key: The XCom Key. (required)
        :param _return_http_data_only: response data without head status code
                                       and headers
        :param _preload_content: if False, the urllib3.HTTPResponse object will
                                 be returned without reading/decoding response
                                 data. Default is True.
        :param _request_timeout: timeout setting for this request. If one
                                 number provided, it will be total request
                                 timeout. It can also be a pair (tuple) of
                                 (connection, read) timeouts.
        :return: tuple(XCom, status_code(int), headers(HTTPHeaderDict))
                 If the method is called asynchronously,
                 returns the request thread.
        """

        local_var_params = locals()

        all_params = [
            'dag_id',
            'dag_run_id',
            'task_id',
            'xcom_key'
        ]
        all_params.extend(
            [
                'async_req',
                '_return_http_data_only',
                '_preload_content',
                '_request_timeout'
            ]
        )

        for key, val in six.iteritems(local_var_params['kwargs']):
            if key not in all_params:
                raise ApiTypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_x_com_value" % key
                )
            local_var_params[key] = val
        del local_var_params['kwargs']
        # verify the required parameter 'dag_id' is set
        if self.api_client.client_side_validation and ('dag_id' not in local_var_params or  # noqa: E501
                                                        local_var_params['dag_id'] is None):  # noqa: E501
            raise ApiValueError("Missing the required parameter `dag_id` when calling `get_x_com_value`")  # noqa: E501
        # verify the required parameter 'dag_run_id' is set
        if self.api_client.client_side_validation and ('dag_run_id' not in local_var_params or  # noqa: E501
                                                        local_var_params['dag_run_id'] is None):  # noqa: E501
            raise ApiValueError("Missing the required parameter `dag_run_id` when calling `get_x_com_value`")  # noqa: E501
        # verify the required parameter 'task_id' is set
        if self.api_client.client_side_validation and ('task_id' not in local_var_params or  # noqa: E501
                                                        local_var_params['task_id'] is None):  # noqa: E501
            raise ApiValueError("Missing the required parameter `task_id` when calling `get_x_com_value`")  # noqa: E501
        # verify the required parameter 'xcom_key' is set
        if self.api_client.client_side_validation and ('xcom_key' not in local_var_params or  # noqa: E501
                                                        local_var_params['xcom_key'] is None):  # noqa: E501
            raise ApiValueError("Missing the required parameter `xcom_key` when calling `get_x_com_value`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'dag_id' in local_var_params:
            path_params['dag_id'] = local_var_params['dag_id']  # noqa: E501
        if 'dag_run_id' in local_var_params:
            path_params['dag_run_id'] = local_var_params['dag_run_id']  # noqa: E501
        if 'task_id' in local_var_params:
            path_params['task_id'] = local_var_params['task_id']  # noqa: E501
        if 'xcom_key' in local_var_params:
            path_params['xcom_key'] = local_var_params['xcom_key']  # noqa: E501

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = []  # noqa: E501

        return self.api_client.call_api(
            '/dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/xcomEntries/{key}', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='XCom',  # noqa: E501
            auth_settings=auth_settings,
            async_req=local_var_params.get('async_req'),
            _return_http_data_only=local_var_params.get('_return_http_data_only'),  # noqa: E501
            _preload_content=local_var_params.get('_preload_content', True),
            _request_timeout=local_var_params.get('_request_timeout'),
            collection_formats=collection_formats)

    def update_x_com_entry(self, dag_id, dag_run_id, task_id, x_com, **kwargs):  # noqa: E501
        """Create an XCom entry  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.update_x_com_entry(dag_id, dag_run_id, task_id, x_com, async_req=True)
        >>> result = thread.get()

        :param async_req bool: execute request asynchronously
        :param str dag_id: The DAG ID. (required)
        :param str dag_run_id: The DAG Run ID. (required)
        :param str task_id: The Task ID. (required)
        :param XCom x_com: (required)
        :param _preload_content: if False, the urllib3.HTTPResponse object will
                                 be returned without reading/decoding response
                                 data. Default is True.
        :param _request_timeout: timeout setting for this request. If one
                                 number provided, it will be total request
                                 timeout. It can also be a pair (tuple) of
                                 (connection, read) timeouts.
        :return: XCom
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        return self.update_x_com_entry_with_http_info(dag_id, dag_run_id, task_id, x_com, **kwargs)  # noqa: E501

    def update_x_com_entry_with_http_info(self, dag_id, dag_run_id, task_id, x_com, **kwargs):  # noqa: E501
        """Create an XCom entry  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.update_x_com_entry_with_http_info(dag_id, dag_run_id, task_id, x_com, async_req=True)
        >>> result = thread.get()

        :param async_req bool: execute request asynchronously
        :param str dag_id: The DAG ID. (required)
        :param str dag_run_id: The DAG Run ID. (required)
        :param str task_id: The Task ID. (required)
        :param XCom x_com: (required)
        :param _return_http_data_only: response data without head status code
                                       and headers
        :param _preload_content: if False, the urllib3.HTTPResponse object will
                                 be returned without reading/decoding response
                                 data. Default is True.
        :param _request_timeout: timeout setting for this request. If one
                                 number provided, it will be total request
                                 timeout. It can also be a pair (tuple) of
                                 (connection, read) timeouts.
        :return: tuple(XCom, status_code(int), headers(HTTPHeaderDict))
                 If the method is called asynchronously,
                 returns the request thread.
        """

        local_var_params = locals()

        all_params = [
            'dag_id',
            'dag_run_id',
            'task_id',
            'x_com'
        ]
        all_params.extend(
            [
                'async_req',
                '_return_http_data_only',
                '_preload_content',
                '_request_timeout'
            ]
        )

        for key, val in six.iteritems(local_var_params['kwargs']):
            if key not in all_params:
                raise ApiTypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method update_x_com_entry" % key
                )
            local_var_params[key] = val
        del local_var_params['kwargs']
        # verify the required parameter 'dag_id' is set
        if self.api_client.client_side_validation and ('dag_id' not in local_var_params or  # noqa: E501
                                                        local_var_params['dag_id'] is None):  # noqa: E501
            raise ApiValueError("Missing the required parameter `dag_id` when calling `update_x_com_entry`")  # noqa: E501
        # verify the required parameter 'dag_run_id' is set
        if self.api_client.client_side_validation and ('dag_run_id' not in local_var_params or  # noqa: E501
                                                        local_var_params['dag_run_id'] is None):  # noqa: E501
            raise ApiValueError("Missing the required parameter `dag_run_id` when calling `update_x_com_entry`")  # noqa: E501
        # verify the required parameter 'task_id' is set
        if self.api_client.client_side_validation and ('task_id' not in local_var_params or  # noqa: E501
                                                        local_var_params['task_id'] is None):  # noqa: E501
            raise ApiValueError("Missing the required parameter `task_id` when calling `update_x_com_entry`")  # noqa: E501
        # verify the required parameter 'x_com' is set
        if self.api_client.client_side_validation and ('x_com' not in local_var_params or  # noqa: E501
                                                        local_var_params['x_com'] is None):  # noqa: E501
            raise ApiValueError("Missing the required parameter `x_com` when calling `update_x_com_entry`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'dag_id' in local_var_params:
            path_params['dag_id'] = local_var_params['dag_id']  # noqa: E501
        if 'dag_run_id' in local_var_params:
            path_params['dag_run_id'] = local_var_params['dag_run_id']  # noqa: E501
        if 'task_id' in local_var_params:
            path_params['task_id'] = local_var_params['task_id']  # noqa: E501

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        if 'x_com' in local_var_params:
            body_params = local_var_params['x_com']
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.select_header_content_type(  # noqa: E501
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = []  # noqa: E501

        return self.api_client.call_api(
            '/dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/xcomEntries', 'POST',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='XCom',  # noqa: E501
            auth_settings=auth_settings,
            async_req=local_var_params.get('async_req'),
            _return_http_data_only=local_var_params.get('_return_http_data_only'),  # noqa: E501
            _preload_content=local_var_params.get('_preload_content', True),
            _request_timeout=local_var_params.get('_request_timeout'),
            collection_formats=collection_formats)

    def update_x_com_value(self, dag_id, dag_run_id, task_id, xcom_key, x_com, **kwargs):  # noqa: E501
        """Update an XCom entry  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.update_x_com_value(dag_id, dag_run_id, task_id, xcom_key, x_com, async_req=True)
        >>> result = thread.get()

        :param async_req bool: execute request asynchronously
        :param str dag_id: The DAG ID. (required)
        :param str dag_run_id: The DAG Run ID. (required)
        :param str task_id: The Task ID. (required)
        :param str xcom_key: The XCom Key. (required)
        :param XCom x_com: (required)
        :param list[str] update_mask: The fields to update on the connection (connection, pool etc). If absent or empty, all modifiable fields are updated. A comma-separated list of fully qualified names of fields. 
        :param _preload_content: if False, the urllib3.HTTPResponse object will
                                 be returned without reading/decoding response
                                 data. Default is True.
        :param _request_timeout: timeout setting for this request. If one
                                 number provided, it will be total request
                                 timeout. It can also be a pair (tuple) of
                                 (connection, read) timeouts.
        :return: XCom
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        return self.update_x_com_value_with_http_info(dag_id, dag_run_id, task_id, xcom_key, x_com, **kwargs)  # noqa: E501

    def update_x_com_value_with_http_info(self, dag_id, dag_run_id, task_id, xcom_key, x_com, **kwargs):  # noqa: E501
        """Update an XCom entry  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.update_x_com_value_with_http_info(dag_id, dag_run_id, task_id, xcom_key, x_com, async_req=True)
        >>> result = thread.get()

        :param async_req bool: execute request asynchronously
        :param str dag_id: The DAG ID. (required)
        :param str dag_run_id: The DAG Run ID. (required)
        :param str task_id: The Task ID. (required)
        :param str xcom_key: The XCom Key. (required)
        :param XCom x_com: (required)
        :param list[str] update_mask: The fields to update on the connection (connection, pool etc). If absent or empty, all modifiable fields are updated. A comma-separated list of fully qualified names of fields. 
        :param _return_http_data_only: response data without head status code
                                       and headers
        :param _preload_content: if False, the urllib3.HTTPResponse object will
                                 be returned without reading/decoding response
                                 data. Default is True.
        :param _request_timeout: timeout setting for this request. If one
                                 number provided, it will be total request
                                 timeout. It can also be a pair (tuple) of
                                 (connection, read) timeouts.
        :return: tuple(XCom, status_code(int), headers(HTTPHeaderDict))
                 If the method is called asynchronously,
                 returns the request thread.
        """

        local_var_params = locals()

        all_params = [
            'dag_id',
            'dag_run_id',
            'task_id',
            'xcom_key',
            'x_com',
            'update_mask'
        ]
        all_params.extend(
            [
                'async_req',
                '_return_http_data_only',
                '_preload_content',
                '_request_timeout'
            ]
        )

        for key, val in six.iteritems(local_var_params['kwargs']):
            if key not in all_params:
                raise ApiTypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method update_x_com_value" % key
                )
            local_var_params[key] = val
        del local_var_params['kwargs']
        # verify the required parameter 'dag_id' is set
        if self.api_client.client_side_validation and ('dag_id' not in local_var_params or  # noqa: E501
                                                        local_var_params['dag_id'] is None):  # noqa: E501
            raise ApiValueError("Missing the required parameter `dag_id` when calling `update_x_com_value`")  # noqa: E501
        # verify the required parameter 'dag_run_id' is set
        if self.api_client.client_side_validation and ('dag_run_id' not in local_var_params or  # noqa: E501
                                                        local_var_params['dag_run_id'] is None):  # noqa: E501
            raise ApiValueError("Missing the required parameter `dag_run_id` when calling `update_x_com_value`")  # noqa: E501
        # verify the required parameter 'task_id' is set
        if self.api_client.client_side_validation and ('task_id' not in local_var_params or  # noqa: E501
                                                        local_var_params['task_id'] is None):  # noqa: E501
            raise ApiValueError("Missing the required parameter `task_id` when calling `update_x_com_value`")  # noqa: E501
        # verify the required parameter 'xcom_key' is set
        if self.api_client.client_side_validation and ('xcom_key' not in local_var_params or  # noqa: E501
                                                        local_var_params['xcom_key'] is None):  # noqa: E501
            raise ApiValueError("Missing the required parameter `xcom_key` when calling `update_x_com_value`")  # noqa: E501
        # verify the required parameter 'x_com' is set
        if self.api_client.client_side_validation and ('x_com' not in local_var_params or  # noqa: E501
                                                        local_var_params['x_com'] is None):  # noqa: E501
            raise ApiValueError("Missing the required parameter `x_com` when calling `update_x_com_value`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'dag_id' in local_var_params:
            path_params['dag_id'] = local_var_params['dag_id']  # noqa: E501
        if 'dag_run_id' in local_var_params:
            path_params['dag_run_id'] = local_var_params['dag_run_id']  # noqa: E501
        if 'task_id' in local_var_params:
            path_params['task_id'] = local_var_params['task_id']  # noqa: E501
        if 'xcom_key' in local_var_params:
            path_params['xcom_key'] = local_var_params['xcom_key']  # noqa: E501

        query_params = []
        if 'update_mask' in local_var_params and local_var_params['update_mask'] is not None:  # noqa: E501
            query_params.append(('update_mask', local_var_params['update_mask']))  # noqa: E501
            collection_formats['update_mask'] = 'csv'  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        if 'x_com' in local_var_params:
            body_params = local_var_params['x_com']
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.select_header_content_type(  # noqa: E501
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = []  # noqa: E501

        return self.api_client.call_api(
            '/dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/xcomEntries/{key}', 'PATCH',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='XCom',  # noqa: E501
            auth_settings=auth_settings,
            async_req=local_var_params.get('async_req'),
            _return_http_data_only=local_var_params.get('_return_http_data_only'),  # noqa: E501
            _preload_content=local_var_params.get('_preload_content', True),
            _request_timeout=local_var_params.get('_request_timeout'),
            collection_formats=collection_formats)
