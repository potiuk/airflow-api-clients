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

import org.openapitools.client.ApiException;
import java.math.BigDecimal;
import org.openapitools.client.model.Error;
import org.openapitools.client.model.ExtraLinkCollection;
import org.openapitools.client.model.InlineResponse200;
import org.openapitools.client.model.ListTaskInstanceForm;
import java.time.OffsetDateTime;
import org.openapitools.client.model.TaskInstance;
import org.openapitools.client.model.TaskInstanceCollection;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TaskInstanceApi
 */
public class TaskInstanceApiTest {

    private final TaskInstanceApi api = new TaskInstanceApi();

    /**
     * Get extra links for task instance
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getExtraLinksTest() throws ApiException {
        //
        //String dagId = null;
        //
        //String dagRunId = null;
        //
        //String taskId = null;
        //
        //ExtraLinkCollection response = api.getExtraLinks(dagId, dagRunId, taskId);

        // TODO: test validations
    }
    /**
     * Get logs for a task instance
     *
     * Get logs for a specific task instance and its try number
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLogsTest() throws ApiException {
        //
        //String dagId = null;
        //
        //String dagRunId = null;
        //
        //String taskId = null;
        //
        //Integer taskTryNumber = null;
        //
        //Boolean fullContent = null;
        //
        //String token = null;
        //
        //InlineResponse200 response = api.getLogs(dagId, dagRunId, taskId, taskTryNumber, fullContent, token);

        // TODO: test validations
    }
    /**
     * Get a task instance
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTaskInstanceTest() throws ApiException {
        //
        //String dagId = null;
        //
        //String dagRunId = null;
        //
        //String taskId = null;
        //
        //TaskInstance response = api.getTaskInstance(dagId, dagRunId, taskId);

        // TODO: test validations
    }
    /**
     * Get a list of task instance of DAG.
     *
     * This endpoint allows specifying &#x60;~&#x60; as the dag_id, dag_run_id to retrieve DAG Runs for all DAGs and DAG Runs. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTaskInstancesTest() throws ApiException {
        //
        //String dagId = null;
        //
        //String dagRunId = null;
        //
        //OffsetDateTime executionDateGte = null;
        //
        //OffsetDateTime executionDateLte = null;
        //
        //OffsetDateTime startDateGte = null;
        //
        //OffsetDateTime startDateLte = null;
        //
        //OffsetDateTime endDateGte = null;
        //
        //OffsetDateTime endDateLte = null;
        //
        //BigDecimal durationGte = null;
        //
        //BigDecimal durationLte = null;
        //
        //List<String> state = null;
        //
        //List<String> pool = null;
        //
        //List<String> queue = null;
        //
        //Integer limit = null;
        //
        //Integer offset = null;
        //
        //TaskInstanceCollection response = api.getTaskInstances(dagId, dagRunId, executionDateGte, executionDateLte, startDateGte, startDateLte, endDateGte, endDateLte, durationGte, durationLte, state, pool, queue, limit, offset);

        // TODO: test validations
    }
    /**
     * Get list of task instances from all DAGs and DAG Runs.
     *
     * This endpoint is a POST to allow filtering across a large number of DAG IDs, where as a GET it would run in to maximum HTTP request URL lengthlimits 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTaskInstancesBatchTest() throws ApiException {
        //
        //ListTaskInstanceForm listTaskInstanceForm = null;
        //
        //TaskInstanceCollection response = api.getTaskInstancesBatch(listTaskInstanceForm);

        // TODO: test validations
    }
}
