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
import org.openapitools.client.model.ImportError;
import org.openapitools.client.model.ImportErrorCollection;
import org.openapitools.client.ApiClient;
import org.openapitools.client.api.ImportErrorApi;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.ErrorLoggingFilter;
import org.junit.Before;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import static io.restassured.config.ObjectMapperConfig.objectMapperConfig;
import static io.restassured.config.RestAssuredConfig.config;
import static org.openapitools.client.GsonObjectMapper.gson;

/**
 * API tests for ImportErrorApi
 */
@Ignore
public class ImportErrorApiTest {

    private ImportErrorApi api;

    @Before
    public void createApi() {
        api = ApiClient.api(ApiClient.Config.apiConfig().reqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setConfig(config().objectMapperConfig(objectMapperConfig().defaultObjectMapper(gson())))
                        .addFilter(new ErrorLoggingFilter())
                        .setBaseUri("http://localhost/api/v1"))).importError();
    }

    /**
     * No content.
     */
    @Test
    public void shouldSee204AfterDeleteImportError() {
        Integer importErrorId = null;
        api.deleteImportError()
                .importErrorIdPath(importErrorId).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Client specified an invalid argument.
     */
    @Test
    public void shouldSee400AfterDeleteImportError() {
        Integer importErrorId = null;
        api.deleteImportError()
                .importErrorIdPath(importErrorId).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Request not authenticated due to missing, invalid, authentication info.
     */
    @Test
    public void shouldSee401AfterDeleteImportError() {
        Integer importErrorId = null;
        api.deleteImportError()
                .importErrorIdPath(importErrorId).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Client does not have sufficient permission.
     */
    @Test
    public void shouldSee403AfterDeleteImportError() {
        Integer importErrorId = null;
        api.deleteImportError()
                .importErrorIdPath(importErrorId).execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * Successful response.
     */
    @Test
    public void shouldSee200AfterGetImportError() {
        Integer importErrorId = null;
        api.getImportError()
                .importErrorIdPath(importErrorId).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Request not authenticated due to missing, invalid, authentication info.
     */
    @Test
    public void shouldSee401AfterGetImportError() {
        Integer importErrorId = null;
        api.getImportError()
                .importErrorIdPath(importErrorId).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Client does not have sufficient permission.
     */
    @Test
    public void shouldSee403AfterGetImportError() {
        Integer importErrorId = null;
        api.getImportError()
                .importErrorIdPath(importErrorId).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * A specified resource is not found.
     */
    @Test
    public void shouldSee404AfterGetImportError() {
        Integer importErrorId = null;
        api.getImportError()
                .importErrorIdPath(importErrorId).execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * List of import errors.
     */
    @Test
    public void shouldSee200AfterGetImportErrors() {
        Integer limit = null;
        Integer offset = null;
        api.getImportErrors().execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Request not authenticated due to missing, invalid, authentication info.
     */
    @Test
    public void shouldSee401AfterGetImportErrors() {
        Integer limit = null;
        Integer offset = null;
        api.getImportErrors().execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Client does not have sufficient permission.
     */
    @Test
    public void shouldSee403AfterGetImportErrors() {
        Integer limit = null;
        Integer offset = null;
        api.getImportErrors().execute(r -> r.prettyPeek());
        // TODO: test validations
    }

}