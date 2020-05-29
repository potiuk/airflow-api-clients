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

import org.openapitools.client.model.Error;
import org.openapitools.client.model.Variable;
import org.openapitools.client.model.VariableCollection;
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
 * API tests for VariableApi 
 */
public class VariableApiTest {

    private VariableApi client;
    private String baseUrl = "http://localhost:9080";
    
    @Before
    public void setup() throws MalformedURLException {
        client = RestClientBuilder.newBuilder()
                        .baseUrl(new URL(baseUrl))
                        .register(ApiException.class)
                        .build(VariableApi.class);
    }

    
    /**
     * Create a variable
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createVariableTest() {
    	// TODO: test validations
        Variable variable = null;
        //Variable response = api.createVariable(variable);
        //assertNotNull(response);
        
        
    }
    
    /**
     * Delete variable
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteVariableTest() {
    	// TODO: test validations
        String variableKey = null;
        //void response = api.deleteVariable(variableKey);
        //assertNotNull(response);
        
        
    }
    
    /**
     * Get a variable by key
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getVariableTest() {
    	// TODO: test validations
        String variableKey = null;
        //Variable response = api.getVariable(variableKey);
        //assertNotNull(response);
        
        
    }
    
    /**
     * Get all variables
     *
     * The collection does not contain data. To get data, you must get a single entity.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getVariablesTest() {
    	// TODO: test validations
        Integer limit = null;
        Integer offset = null;
        //VariableCollection response = api.getVariables(limit, offset);
        //assertNotNull(response);
        
        
    }
    
    /**
     * Update a variable by key
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateVariableTest() {
    	// TODO: test validations
        String variableKey = null;
        Variable variable = null;
        List<String> updateMask = null;
        //Variable response = api.updateVariable(variableKey, variable, updateMask);
        //assertNotNull(response);
        
        
    }
    
}
