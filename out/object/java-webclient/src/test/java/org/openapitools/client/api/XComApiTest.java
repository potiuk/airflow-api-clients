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

import org.openapitools.client.model.Error;
import org.openapitools.client.model.XCom;
import org.openapitools.client.model.XComCollection;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for XComApi
 */
@Ignore
public class XComApiTest {

    private final XComApi api = new XComApi();

    
    /**
     * Delete an XCom entry
     *
     * 
     */
    @Test
    public void deleteXComValueTest()  {
        String dagId = null;
        String dagRunId = null;
        String taskId = null;
        String key = null;
        api.deleteXComValue(dagId, dagRunId, taskId, key).block();

        // TODO: test validations
    }
    
    /**
     * Get all XCom entries
     *
     * This endpoint allows specifying &#x60;~&#x60; as the dag_id, dag_run_id, task_id to retrieve XCOM entries for for all DAGs, DAG Runs and task instances.
     */
    @Test
    public void getXComEntryTest()  {
        String dagId = null;
        String dagRunId = null;
        String taskId = null;
        Integer limit = null;
        Integer offset = null;
        XComCollection response = api.getXComEntry(dagId, dagRunId, taskId, limit, offset).block();

        // TODO: test validations
    }
    
    /**
     * Get an XCom entry
     *
     * 
     */
    @Test
    public void getXComValueTest()  {
        String dagId = null;
        String dagRunId = null;
        String taskId = null;
        String key = null;
        XCom response = api.getXComValue(dagId, dagRunId, taskId, key).block();

        // TODO: test validations
    }
    
    /**
     * Create an XCom entry
     *
     * 
     */
    @Test
    public void updateXComEntryTest()  {
        String dagId = null;
        String dagRunId = null;
        String taskId = null;
        XCom xcom = null;
        XCom response = api.updateXComEntry(dagId, dagRunId, taskId, xcom).block();

        // TODO: test validations
    }
    
    /**
     * Update an XCom entry
     *
     * 
     */
    @Test
    public void updateXComValueTest()  {
        String dagId = null;
        String dagRunId = null;
        String taskId = null;
        String key = null;
        XCom xcom = null;
        List<String> updateMask = null;
        XCom response = api.updateXComValue(dagId, dagRunId, taskId, key, xcom, updateMask).block();

        // TODO: test validations
    }
    
}
