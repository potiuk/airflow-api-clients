/**
 * Airflow API (Stable)
 * Apache Airflow management API.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: dev@airflow.apache.org
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package org.openapitools.client.api;

import org.openapitools.client.model.DAGRun;
import org.openapitools.client.model.DAGRunCollection;
import java.util.Date;
import org.openapitools.client.model.Error;
import org.openapitools.client.model.ListDagRunsForm;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import org.eclipse.microprofile.rest.client.RestClientBuilder;

import java.net.URL;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



/**
 * Airflow API (Stable) Test
 *
 * API tests for DagRunApi 
 */
public class DagRunApiTest {

    private DagRunApi client;
    private String baseUrl = "http://localhost:9080";
    
    @Before
    public void setup() throws MalformedURLException {
        client = RestClientBuilder.newBuilder()
                        .baseUrl(new URL(baseUrl))
                        .register(ApiException.class)
                        .build(DagRunApi.class);
    }

    
    /**
     * Trigger a DAG Run
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createDagRunTest() {
    	// TODO: test validations
        String dagId = null;
        String dagRunId = null;
        DAGRun daGRun = null;
        //DAGRun response = api.createDagRun(dagId, dagRunId, daGRun);
        //assertNotNull(response);
        
        
    }
    
    /**
     * Delete a DAG Run
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteDagRunTest() {
    	// TODO: test validations
        String dagId = null;
        String dagRunId = null;
        //void response = api.deleteDagRun(dagId, dagRunId);
        //assertNotNull(response);
        
        
    }
    
    /**
     * Get a DAG Run
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDagRunTest() {
    	// TODO: test validations
        String dagId = null;
        String dagRunId = null;
        //DAGRun response = api.getDagRun(dagId, dagRunId);
        //assertNotNull(response);
        
        
    }
    
    /**
     * Get all DAG Runs
     *
     * This endpoint allows specifying &#x60;~&#x60; as the dag_id to retrieve DAG Runs for all DAGs. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDagRunsTest() {
    	// TODO: test validations
        String dagId = null;
        Integer limit = null;
        Integer offset = null;
        Date executionDateGte = null;
        Date executionDateLte = null;
        Date startDateGte = null;
        Date startDateLte = null;
        Date endDateGte = null;
        Date endDateLte = null;
        //DAGRunCollection response = api.getDagRuns(dagId, limit, offset, executionDateGte, executionDateLte, startDateGte, startDateLte, endDateGte, endDateLte);
        //assertNotNull(response);
        
        
    }
    
    /**
     * Get all DAG Runs from aall DAGs.
     *
     * This endpoint is a POST to allow filtering across a large number of DAG IDs, where as a GET it would run in to maximum HTTP request URL lengthlimits 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDagRunsBatchTest() {
    	// TODO: test validations
        ListDagRunsForm listDagRunsForm = null;
        //DAGRunCollection response = api.getDagRunsBatch(listDagRunsForm);
        //assertNotNull(response);
        
        
    }
    
    /**
     * Update a DAG Run
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateDagRunTest() {
    	// TODO: test validations
        String dagId = null;
        String dagRunId = null;
        DAGRun daGRun = null;
        List<String> updateMask = null;
        //DAGRun response = api.updateDagRun(dagId, dagRunId, daGRun, updateMask);
        //assertNotNull(response);
        
        
    }
    
}
