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


package org.openapitools.client;

import org.openapitools.client.api.*;

import io.restassured.builder.RequestSpecBuilder;
import java.util.function.Consumer;
import java.util.function.Supplier;

import static io.restassured.config.ObjectMapperConfig.objectMapperConfig;
import static io.restassured.config.RestAssuredConfig.config;
import static org.openapitools.client.GsonObjectMapper.gson;


public class ApiClient {
    public static final String BASE_URI = "http://localhost/api/v1";

    private final Config config;

    private ApiClient(Config config) {
        this.config = config;
    }

    public static ApiClient api(Config config) {
        return new ApiClient(config);
    }

    public ConfigApi config() {
        return ConfigApi.config(config.reqSpecSupplier);
    }
    public ConnectionApi connection() {
        return ConnectionApi.connection(config.reqSpecSupplier);
    }
    public DagApi dag() {
        return DagApi.dag(config.reqSpecSupplier);
    }
    public DagRunApi dagRun() {
        return DagRunApi.dagRun(config.reqSpecSupplier);
    }
    public EventLogApi eventLog() {
        return EventLogApi.eventLog(config.reqSpecSupplier);
    }
    public ImportErrorApi importError() {
        return ImportErrorApi.importError(config.reqSpecSupplier);
    }
    public PoolApi pool() {
        return PoolApi.pool(config.reqSpecSupplier);
    }
    public TaskInstanceApi taskInstance() {
        return TaskInstanceApi.taskInstance(config.reqSpecSupplier);
    }
    public VariableApi variable() {
        return VariableApi.variable(config.reqSpecSupplier);
    }
    public XComApi xCom() {
        return XComApi.xCom(config.reqSpecSupplier);
    }

    public static class Config {
        private Supplier<RequestSpecBuilder> reqSpecSupplier = () -> new RequestSpecBuilder()
                .setBaseUri(BASE_URI)
                .setConfig(config().objectMapperConfig(objectMapperConfig().defaultObjectMapper(gson())));

        /**
         * Use common specification for all operations
         * @param supplier supplier
         * @return configuration
         */
        public Config reqSpecSupplier(Supplier<RequestSpecBuilder> supplier) {
            this.reqSpecSupplier = supplier;
            return this;
        }

        public static Config apiConfig() {
            return new Config();
        }
    }
}