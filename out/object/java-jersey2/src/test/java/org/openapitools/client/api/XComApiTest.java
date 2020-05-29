/*
 * Airflow API (Stable)
 * Apache Airflow management API.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: dev@airflow.apache.org
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.*;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.Error;
import org.openapitools.client.model.XCom;
import org.openapitools.client.model.XComCollection;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for XComApi
 */
public class XComApiTest {

    private final XComApi api = new XComApi();

    /**
     * Delete an XCom entry
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteXComValueTest() throws ApiException {
        //String dagId = null;
        //String dagRunId = null;
        //String taskId = null;
        //String key = null;
        //api.deleteXComValue(dagId, dagRunId, taskId, key);
        // TODO: test validations
    }

    /**
     * Get all XCom entries
     *
     * This endpoint allows specifying &#x60;~&#x60; as the dag_id, dag_run_id, task_id to retrieve XCOM entries for for all DAGs, DAG Runs and task instances.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getXComEntryTest() throws ApiException {
        //String dagId = null;
        //String dagRunId = null;
        //String taskId = null;
        //Integer limit = null;
        //Integer offset = null;
        //XComCollection response = api.getXComEntry(dagId, dagRunId, taskId, limit, offset);
        // TODO: test validations
    }

    /**
     * Get an XCom entry
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getXComValueTest() throws ApiException {
        //String dagId = null;
        //String dagRunId = null;
        //String taskId = null;
        //String key = null;
        //XCom response = api.getXComValue(dagId, dagRunId, taskId, key);
        // TODO: test validations
    }

    /**
     * Create an XCom entry
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateXComEntryTest() throws ApiException {
        //String dagId = null;
        //String dagRunId = null;
        //String taskId = null;
        //XCom xcom = null;
        //XCom response = api.updateXComEntry(dagId, dagRunId, taskId, xcom);
        // TODO: test validations
    }

    /**
     * Update an XCom entry
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateXComValueTest() throws ApiException {
        //String dagId = null;
        //String dagRunId = null;
        //String taskId = null;
        //String key = null;
        //XCom xcom = null;
        //List<String> updateMask = null;
        //XCom response = api.updateXComValue(dagId, dagRunId, taskId, key, xcom, updateMask);
        // TODO: test validations
    }

}
