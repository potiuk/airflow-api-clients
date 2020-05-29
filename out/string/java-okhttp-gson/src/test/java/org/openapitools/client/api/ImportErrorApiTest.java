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
import org.openapitools.client.model.Error;
import org.openapitools.client.model.ImportError;
import org.openapitools.client.model.ImportErrorCollection;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ImportErrorApi
 */
@Ignore
public class ImportErrorApiTest {

    private final ImportErrorApi api = new ImportErrorApi();

    
    /**
     * Delete an import error
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteImportErrorTest() throws ApiException {
        Integer importErrorId = null;
        api.deleteImportError(importErrorId);

        // TODO: test validations
    }
    
    /**
     * Get an import error
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getImportErrorTest() throws ApiException {
        Integer importErrorId = null;
        ImportError response = api.getImportError(importErrorId);

        // TODO: test validations
    }
    
    /**
     * Get all import errors
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getImportErrorsTest() throws ApiException {
        Integer limit = null;
        Integer offset = null;
        ImportErrorCollection response = api.getImportErrors(limit, offset);

        // TODO: test validations
    }
    
}
