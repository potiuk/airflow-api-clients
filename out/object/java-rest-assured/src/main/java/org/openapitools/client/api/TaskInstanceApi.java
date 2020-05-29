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

import com.google.gson.reflect.TypeToken;
import java.math.BigDecimal;
import org.openapitools.client.model.Error;
import org.openapitools.client.model.ExtraLinkCollection;
import org.openapitools.client.model.InlineResponse200;
import org.openapitools.client.model.ListTaskInstanceForm;
import org.threeten.bp.OffsetDateTime;
import org.openapitools.client.model.TaskInstance;
import org.openapitools.client.model.TaskInstanceCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.swagger.annotations.*;

import java.lang.reflect.Type;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import org.openapitools.client.JSON;
import static io.restassured.http.Method.*;

@Api(value = "TaskInstance")
public class TaskInstanceApi {

    private Supplier<RequestSpecBuilder> reqSpecSupplier;
    private Consumer<RequestSpecBuilder> reqSpecCustomizer;

    private TaskInstanceApi(Supplier<RequestSpecBuilder> reqSpecSupplier) {
        this.reqSpecSupplier = reqSpecSupplier;
    }

    public static TaskInstanceApi taskInstance(Supplier<RequestSpecBuilder> reqSpecSupplier) {
        return new TaskInstanceApi(reqSpecSupplier);
    }

    private RequestSpecBuilder createReqSpec() {
        RequestSpecBuilder reqSpec = reqSpecSupplier.get();
        if(reqSpecCustomizer != null) {
            reqSpecCustomizer.accept(reqSpec);
        }
        return reqSpec;
    }

    public List<Oper> getAllOperations() {
        return Arrays.asList(
                getExtraLinks(),
                getLogs(),
                getTaskInstance(),
                getTaskInstances(),
                getTaskInstancesBatch()
        );
    }

    @ApiOperation(value = "Get extra links for task instance",
            notes = "",
            nickname = "getExtraLinks",
            tags = { "TaskInstance" })
    @ApiResponses(value = { 
            @ApiResponse(code = 200, message = "Successful response.") ,
            @ApiResponse(code = 401, message = "Request not authenticated due to missing, invalid, authentication info.") ,
            @ApiResponse(code = 403, message = "Client does not have sufficient permission.") ,
            @ApiResponse(code = 404, message = "A specified resource is not found.")  })
    public GetExtraLinksOper getExtraLinks() {
        return new GetExtraLinksOper(createReqSpec());
    }

    @ApiOperation(value = "Get logs for a task instance",
            notes = "Get logs for a specific task instance and its try number",
            nickname = "getLogs",
            tags = { "TaskInstance" })
    @ApiResponses(value = { 
            @ApiResponse(code = 200, message = "Content of logs.") ,
            @ApiResponse(code = 400, message = "Client specified an invalid argument.") ,
            @ApiResponse(code = 401, message = "Request not authenticated due to missing, invalid, authentication info.") ,
            @ApiResponse(code = 403, message = "Client does not have sufficient permission.") ,
            @ApiResponse(code = 404, message = "A specified resource is not found.")  })
    public GetLogsOper getLogs() {
        return new GetLogsOper(createReqSpec());
    }

    @ApiOperation(value = "Get a task instance",
            notes = "",
            nickname = "getTaskInstance",
            tags = { "TaskInstance" })
    @ApiResponses(value = { 
            @ApiResponse(code = 200, message = "Successful response.") ,
            @ApiResponse(code = 401, message = "Request not authenticated due to missing, invalid, authentication info.") ,
            @ApiResponse(code = 403, message = "Client does not have sufficient permission.") ,
            @ApiResponse(code = 404, message = "A specified resource is not found.")  })
    public GetTaskInstanceOper getTaskInstance() {
        return new GetTaskInstanceOper(createReqSpec());
    }

    @ApiOperation(value = "Get a list of task instance of DAG.",
            notes = "This endpoint allows specifying `~` as the dag_id, dag_run_id to retrieve DAG Runs for all DAGs and DAG Runs. ",
            nickname = "getTaskInstances",
            tags = { "TaskInstance" })
    @ApiResponses(value = { 
            @ApiResponse(code = 200, message = "List of task instances.") ,
            @ApiResponse(code = 401, message = "Request not authenticated due to missing, invalid, authentication info.") ,
            @ApiResponse(code = 403, message = "Client does not have sufficient permission.")  })
    public GetTaskInstancesOper getTaskInstances() {
        return new GetTaskInstancesOper(createReqSpec());
    }

    @ApiOperation(value = "Get list of task instances from all DAGs and DAG Runs.",
            notes = "This endpoint is a POST to allow filtering across a large number of DAG IDs, where as a GET it would run in to maximum HTTP request URL lengthlimits ",
            nickname = "getTaskInstancesBatch",
            tags = { "TaskInstance" })
    @ApiResponses(value = { 
            @ApiResponse(code = 200, message = "List of task instances.") ,
            @ApiResponse(code = 401, message = "Request not authenticated due to missing, invalid, authentication info.") ,
            @ApiResponse(code = 403, message = "Client does not have sufficient permission.") ,
            @ApiResponse(code = 404, message = "A specified resource is not found.")  })
    public GetTaskInstancesBatchOper getTaskInstancesBatch() {
        return new GetTaskInstancesBatchOper(createReqSpec());
    }

    /**
     * Customize request specification
     * @param reqSpecCustomizer consumer to modify the RequestSpecBuilder
     * @return api
     */
    public TaskInstanceApi reqSpec(Consumer<RequestSpecBuilder> reqSpecCustomizer) {
        this.reqSpecCustomizer = reqSpecCustomizer;
        return this;
    }

    /**
     * Get extra links for task instance
     * 
     *
     * @see #dagIdPath The DAG ID. (required)
     * @see #dagRunIdPath The DAG Run ID. (required)
     * @see #taskIdPath The Task ID. (required)
     * return ExtraLinkCollection
     */
    public static class GetExtraLinksOper implements Oper {

        public static final Method REQ_METHOD = GET;
        public static final String REQ_URI = "/dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/links";

        private RequestSpecBuilder reqSpec;
        private ResponseSpecBuilder respSpec;

        public GetExtraLinksOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * GET /dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/links
         * @param handler handler
         * @param <T> type
         * @return type
         */
        @Override
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(REQ_METHOD, REQ_URI));
        }

        /**
         * GET /dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/links
         * @param handler handler
         * @return ExtraLinkCollection
         */
        public ExtraLinkCollection executeAs(Function<Response, Response> handler) {
            Type type = new TypeToken<ExtraLinkCollection>(){}.getType();
            return execute(handler).as(type);
        }

        public static final String DAG_ID_PATH = "dag_id";

        /**
         * @param dagId (String) The DAG ID. (required)
         * @return operation
         */
        public GetExtraLinksOper dagIdPath(Object dagId) {
            reqSpec.addPathParam(DAG_ID_PATH, dagId);
            return this;
        }

        public static final String DAG_RUN_ID_PATH = "dag_run_id";

        /**
         * @param dagRunId (String) The DAG Run ID. (required)
         * @return operation
         */
        public GetExtraLinksOper dagRunIdPath(Object dagRunId) {
            reqSpec.addPathParam(DAG_RUN_ID_PATH, dagRunId);
            return this;
        }

        public static final String TASK_ID_PATH = "task_id";

        /**
         * @param taskId (String) The Task ID. (required)
         * @return operation
         */
        public GetExtraLinksOper taskIdPath(Object taskId) {
            reqSpec.addPathParam(TASK_ID_PATH, taskId);
            return this;
        }

        /**
         * Customize request specification
         * @param reqSpecCustomizer consumer to modify the RequestSpecBuilder
         * @return operation
         */
        public GetExtraLinksOper reqSpec(Consumer<RequestSpecBuilder> reqSpecCustomizer) {
            reqSpecCustomizer.accept(reqSpec);
            return this;
        }

        /**
         * Customize response specification
         * @param respSpecCustomizer consumer to modify the ResponseSpecBuilder
         * @return operation
         */
        public GetExtraLinksOper respSpec(Consumer<ResponseSpecBuilder> respSpecCustomizer) {
            respSpecCustomizer.accept(respSpec);
            return this;
        }
    }
    /**
     * Get logs for a task instance
     * Get logs for a specific task instance and its try number
     *
     * @see #dagIdPath The DAG ID. (required)
     * @see #dagRunIdPath The DAG Run ID. (required)
     * @see #taskIdPath The Task ID. (required)
     * @see #taskTryNumberPath The Task Try Number. (required)
     * @see #fullContentQuery A full content will be returned. By default, only the first fragment will be returned.  (optional)
     * @see #tokenQuery A token that allows you to continue fetching logs. If passed, it will specify the location from which the download should be continued.  (optional)
     * return InlineResponse200
     */
    public static class GetLogsOper implements Oper {

        public static final Method REQ_METHOD = GET;
        public static final String REQ_URI = "/dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/logs/{task_try_number}";

        private RequestSpecBuilder reqSpec;
        private ResponseSpecBuilder respSpec;

        public GetLogsOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * GET /dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/logs/{task_try_number}
         * @param handler handler
         * @param <T> type
         * @return type
         */
        @Override
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(REQ_METHOD, REQ_URI));
        }

        /**
         * GET /dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/logs/{task_try_number}
         * @param handler handler
         * @return InlineResponse200
         */
        public InlineResponse200 executeAs(Function<Response, Response> handler) {
            Type type = new TypeToken<InlineResponse200>(){}.getType();
            return execute(handler).as(type);
        }

        public static final String DAG_ID_PATH = "dag_id";

        /**
         * @param dagId (String) The DAG ID. (required)
         * @return operation
         */
        public GetLogsOper dagIdPath(Object dagId) {
            reqSpec.addPathParam(DAG_ID_PATH, dagId);
            return this;
        }

        public static final String DAG_RUN_ID_PATH = "dag_run_id";

        /**
         * @param dagRunId (String) The DAG Run ID. (required)
         * @return operation
         */
        public GetLogsOper dagRunIdPath(Object dagRunId) {
            reqSpec.addPathParam(DAG_RUN_ID_PATH, dagRunId);
            return this;
        }

        public static final String TASK_ID_PATH = "task_id";

        /**
         * @param taskId (String) The Task ID. (required)
         * @return operation
         */
        public GetLogsOper taskIdPath(Object taskId) {
            reqSpec.addPathParam(TASK_ID_PATH, taskId);
            return this;
        }

        public static final String TASK_TRY_NUMBER_PATH = "task_try_number";

        /**
         * @param taskTryNumber (Integer) The Task Try Number. (required)
         * @return operation
         */
        public GetLogsOper taskTryNumberPath(Object taskTryNumber) {
            reqSpec.addPathParam(TASK_TRY_NUMBER_PATH, taskTryNumber);
            return this;
        }

        public static final String FULL_CONTENT_QUERY = "full_content";

        /**
         * @param fullContent (Boolean) A full content will be returned. By default, only the first fragment will be returned.  (optional)
         * @return operation
         */
        public GetLogsOper fullContentQuery(Object... fullContent) {
            reqSpec.addQueryParam(FULL_CONTENT_QUERY, fullContent);
            return this;
        }

        public static final String TOKEN_QUERY = "token";

        /**
         * @param token (String) A token that allows you to continue fetching logs. If passed, it will specify the location from which the download should be continued.  (optional)
         * @return operation
         */
        public GetLogsOper tokenQuery(Object... token) {
            reqSpec.addQueryParam(TOKEN_QUERY, token);
            return this;
        }

        /**
         * Customize request specification
         * @param reqSpecCustomizer consumer to modify the RequestSpecBuilder
         * @return operation
         */
        public GetLogsOper reqSpec(Consumer<RequestSpecBuilder> reqSpecCustomizer) {
            reqSpecCustomizer.accept(reqSpec);
            return this;
        }

        /**
         * Customize response specification
         * @param respSpecCustomizer consumer to modify the ResponseSpecBuilder
         * @return operation
         */
        public GetLogsOper respSpec(Consumer<ResponseSpecBuilder> respSpecCustomizer) {
            respSpecCustomizer.accept(respSpec);
            return this;
        }
    }
    /**
     * Get a task instance
     * 
     *
     * @see #dagIdPath The DAG ID. (required)
     * @see #dagRunIdPath The DAG Run ID. (required)
     * @see #taskIdPath The Task ID. (required)
     * return TaskInstance
     */
    public static class GetTaskInstanceOper implements Oper {

        public static final Method REQ_METHOD = GET;
        public static final String REQ_URI = "/dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}";

        private RequestSpecBuilder reqSpec;
        private ResponseSpecBuilder respSpec;

        public GetTaskInstanceOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * GET /dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}
         * @param handler handler
         * @param <T> type
         * @return type
         */
        @Override
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(REQ_METHOD, REQ_URI));
        }

        /**
         * GET /dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}
         * @param handler handler
         * @return TaskInstance
         */
        public TaskInstance executeAs(Function<Response, Response> handler) {
            Type type = new TypeToken<TaskInstance>(){}.getType();
            return execute(handler).as(type);
        }

        public static final String DAG_ID_PATH = "dag_id";

        /**
         * @param dagId (String) The DAG ID. (required)
         * @return operation
         */
        public GetTaskInstanceOper dagIdPath(Object dagId) {
            reqSpec.addPathParam(DAG_ID_PATH, dagId);
            return this;
        }

        public static final String DAG_RUN_ID_PATH = "dag_run_id";

        /**
         * @param dagRunId (String) The DAG Run ID. (required)
         * @return operation
         */
        public GetTaskInstanceOper dagRunIdPath(Object dagRunId) {
            reqSpec.addPathParam(DAG_RUN_ID_PATH, dagRunId);
            return this;
        }

        public static final String TASK_ID_PATH = "task_id";

        /**
         * @param taskId (String) The Task ID. (required)
         * @return operation
         */
        public GetTaskInstanceOper taskIdPath(Object taskId) {
            reqSpec.addPathParam(TASK_ID_PATH, taskId);
            return this;
        }

        /**
         * Customize request specification
         * @param reqSpecCustomizer consumer to modify the RequestSpecBuilder
         * @return operation
         */
        public GetTaskInstanceOper reqSpec(Consumer<RequestSpecBuilder> reqSpecCustomizer) {
            reqSpecCustomizer.accept(reqSpec);
            return this;
        }

        /**
         * Customize response specification
         * @param respSpecCustomizer consumer to modify the ResponseSpecBuilder
         * @return operation
         */
        public GetTaskInstanceOper respSpec(Consumer<ResponseSpecBuilder> respSpecCustomizer) {
            respSpecCustomizer.accept(respSpec);
            return this;
        }
    }
    /**
     * Get a list of task instance of DAG.
     * This endpoint allows specifying &#x60;~&#x60; as the dag_id, dag_run_id to retrieve DAG Runs for all DAGs and DAG Runs. 
     *
     * @see #dagIdPath The DAG ID. (required)
     * @see #dagRunIdPath The DAG Run ID. (required)
     * @see #executionDateGteQuery Returns objects greater or equal to the specified date. This can be combined with execution_date_lte parameter to receive only the selected period.  (optional)
     * @see #executionDateLteQuery Returns objects less than or equal to the specified date. This can be combined with execution_date_gte parameter to receive only the selected period.  (optional)
     * @see #startDateGteQuery Returns objects greater or equal the specified date. This can be combined with startd_ate_lte parameter to receive only the selected period.  (optional)
     * @see #startDateLteQuery Returns objects less or equal the specified date. This can be combined with start_date_gte parameter to receive only the selected period.  (optional)
     * @see #endDateGteQuery Returns objects greater or equal the specified date. This can be combined with start_date_lte parameter to receive only the selected period.  (optional)
     * @see #endDateLteQuery Returns objects less than or equal to the specified date. This can be combined with start_date_gte parameter to receive only the selected period.  (optional)
     * @see #durationGteQuery Returns objects greater than or equal to the specified values. This can be combined with duration_lte parameter to receive only the selected period.  (optional)
     * @see #durationLteQuery Returns objects less than or equal to the specified values. This can be combined with duration_gte parameter to receive only the selected range.  (optional)
     * @see #stateQuery The value can be repeated to retrieve multiple matching values (OR condition). (optional, default to new ArrayList&lt;String&gt;())
     * @see #poolQuery The value can be repeated to retrieve multiple matching values (OR condition). (optional, default to new ArrayList&lt;String&gt;())
     * @see #queueQuery The value can be repeated to retrieve multiple matching values (OR condition). (optional, default to new ArrayList&lt;String&gt;())
     * @see #limitQuery The numbers of items to return. (optional, default to 100)
     * @see #offsetQuery The number of items to skip before starting to collect the result set. (optional)
     * return TaskInstanceCollection
     */
    public static class GetTaskInstancesOper implements Oper {

        public static final Method REQ_METHOD = GET;
        public static final String REQ_URI = "/dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances";

        private RequestSpecBuilder reqSpec;
        private ResponseSpecBuilder respSpec;

        public GetTaskInstancesOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * GET /dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances
         * @param handler handler
         * @param <T> type
         * @return type
         */
        @Override
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(REQ_METHOD, REQ_URI));
        }

        /**
         * GET /dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances
         * @param handler handler
         * @return TaskInstanceCollection
         */
        public TaskInstanceCollection executeAs(Function<Response, Response> handler) {
            Type type = new TypeToken<TaskInstanceCollection>(){}.getType();
            return execute(handler).as(type);
        }

        public static final String DAG_ID_PATH = "dag_id";

        /**
         * @param dagId (String) The DAG ID. (required)
         * @return operation
         */
        public GetTaskInstancesOper dagIdPath(Object dagId) {
            reqSpec.addPathParam(DAG_ID_PATH, dagId);
            return this;
        }

        public static final String DAG_RUN_ID_PATH = "dag_run_id";

        /**
         * @param dagRunId (String) The DAG Run ID. (required)
         * @return operation
         */
        public GetTaskInstancesOper dagRunIdPath(Object dagRunId) {
            reqSpec.addPathParam(DAG_RUN_ID_PATH, dagRunId);
            return this;
        }

        public static final String EXECUTION_DATE_GTE_QUERY = "execution_date_gte";

        /**
         * @param executionDateGte (OffsetDateTime) Returns objects greater or equal to the specified date. This can be combined with execution_date_lte parameter to receive only the selected period.  (optional)
         * @return operation
         */
        public GetTaskInstancesOper executionDateGteQuery(Object... executionDateGte) {
            reqSpec.addQueryParam(EXECUTION_DATE_GTE_QUERY, executionDateGte);
            return this;
        }

        public static final String EXECUTION_DATE_LTE_QUERY = "execution_date_lte";

        /**
         * @param executionDateLte (OffsetDateTime) Returns objects less than or equal to the specified date. This can be combined with execution_date_gte parameter to receive only the selected period.  (optional)
         * @return operation
         */
        public GetTaskInstancesOper executionDateLteQuery(Object... executionDateLte) {
            reqSpec.addQueryParam(EXECUTION_DATE_LTE_QUERY, executionDateLte);
            return this;
        }

        public static final String START_DATE_GTE_QUERY = "start_date_gte";

        /**
         * @param startDateGte (OffsetDateTime) Returns objects greater or equal the specified date. This can be combined with startd_ate_lte parameter to receive only the selected period.  (optional)
         * @return operation
         */
        public GetTaskInstancesOper startDateGteQuery(Object... startDateGte) {
            reqSpec.addQueryParam(START_DATE_GTE_QUERY, startDateGte);
            return this;
        }

        public static final String START_DATE_LTE_QUERY = "start_date_lte";

        /**
         * @param startDateLte (OffsetDateTime) Returns objects less or equal the specified date. This can be combined with start_date_gte parameter to receive only the selected period.  (optional)
         * @return operation
         */
        public GetTaskInstancesOper startDateLteQuery(Object... startDateLte) {
            reqSpec.addQueryParam(START_DATE_LTE_QUERY, startDateLte);
            return this;
        }

        public static final String END_DATE_GTE_QUERY = "end_date_gte";

        /**
         * @param endDateGte (OffsetDateTime) Returns objects greater or equal the specified date. This can be combined with start_date_lte parameter to receive only the selected period.  (optional)
         * @return operation
         */
        public GetTaskInstancesOper endDateGteQuery(Object... endDateGte) {
            reqSpec.addQueryParam(END_DATE_GTE_QUERY, endDateGte);
            return this;
        }

        public static final String END_DATE_LTE_QUERY = "end_date_lte";

        /**
         * @param endDateLte (OffsetDateTime) Returns objects less than or equal to the specified date. This can be combined with start_date_gte parameter to receive only the selected period.  (optional)
         * @return operation
         */
        public GetTaskInstancesOper endDateLteQuery(Object... endDateLte) {
            reqSpec.addQueryParam(END_DATE_LTE_QUERY, endDateLte);
            return this;
        }

        public static final String DURATION_GTE_QUERY = "duration_gte";

        /**
         * @param durationGte (BigDecimal) Returns objects greater than or equal to the specified values. This can be combined with duration_lte parameter to receive only the selected period.  (optional)
         * @return operation
         */
        public GetTaskInstancesOper durationGteQuery(Object... durationGte) {
            reqSpec.addQueryParam(DURATION_GTE_QUERY, durationGte);
            return this;
        }

        public static final String DURATION_LTE_QUERY = "duration_lte";

        /**
         * @param durationLte (BigDecimal) Returns objects less than or equal to the specified values. This can be combined with duration_gte parameter to receive only the selected range.  (optional)
         * @return operation
         */
        public GetTaskInstancesOper durationLteQuery(Object... durationLte) {
            reqSpec.addQueryParam(DURATION_LTE_QUERY, durationLte);
            return this;
        }

        public static final String STATE_QUERY = "state";

        /**
         * @param state (List&lt;String&gt;) The value can be repeated to retrieve multiple matching values (OR condition). (optional, default to new ArrayList&lt;String&gt;())
         * @return operation
         */
        public GetTaskInstancesOper stateQuery(Object... state) {
            reqSpec.addQueryParam(STATE_QUERY, state);
            return this;
        }

        public static final String POOL_QUERY = "pool";

        /**
         * @param pool (List&lt;String&gt;) The value can be repeated to retrieve multiple matching values (OR condition). (optional, default to new ArrayList&lt;String&gt;())
         * @return operation
         */
        public GetTaskInstancesOper poolQuery(Object... pool) {
            reqSpec.addQueryParam(POOL_QUERY, pool);
            return this;
        }

        public static final String QUEUE_QUERY = "Queue";

        /**
         * @param queue (List&lt;String&gt;) The value can be repeated to retrieve multiple matching values (OR condition). (optional, default to new ArrayList&lt;String&gt;())
         * @return operation
         */
        public GetTaskInstancesOper queueQuery(Object... queue) {
            reqSpec.addQueryParam(QUEUE_QUERY, queue);
            return this;
        }

        public static final String LIMIT_QUERY = "limit";

        /**
         * @param limit (Integer) The numbers of items to return. (optional, default to 100)
         * @return operation
         */
        public GetTaskInstancesOper limitQuery(Object... limit) {
            reqSpec.addQueryParam(LIMIT_QUERY, limit);
            return this;
        }

        public static final String OFFSET_QUERY = "offset";

        /**
         * @param offset (Integer) The number of items to skip before starting to collect the result set. (optional)
         * @return operation
         */
        public GetTaskInstancesOper offsetQuery(Object... offset) {
            reqSpec.addQueryParam(OFFSET_QUERY, offset);
            return this;
        }

        /**
         * Customize request specification
         * @param reqSpecCustomizer consumer to modify the RequestSpecBuilder
         * @return operation
         */
        public GetTaskInstancesOper reqSpec(Consumer<RequestSpecBuilder> reqSpecCustomizer) {
            reqSpecCustomizer.accept(reqSpec);
            return this;
        }

        /**
         * Customize response specification
         * @param respSpecCustomizer consumer to modify the ResponseSpecBuilder
         * @return operation
         */
        public GetTaskInstancesOper respSpec(Consumer<ResponseSpecBuilder> respSpecCustomizer) {
            respSpecCustomizer.accept(respSpec);
            return this;
        }
    }
    /**
     * Get list of task instances from all DAGs and DAG Runs.
     * This endpoint is a POST to allow filtering across a large number of DAG IDs, where as a GET it would run in to maximum HTTP request URL lengthlimits 
     *
     * @see #body  (required)
     * return TaskInstanceCollection
     */
    public static class GetTaskInstancesBatchOper implements Oper {

        public static final Method REQ_METHOD = POST;
        public static final String REQ_URI = "/dags/~/dagRuns/~/taskInstances/list";

        private RequestSpecBuilder reqSpec;
        private ResponseSpecBuilder respSpec;

        public GetTaskInstancesBatchOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setContentType("application/json");
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * POST /dags/~/dagRuns/~/taskInstances/list
         * @param handler handler
         * @param <T> type
         * @return type
         */
        @Override
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(REQ_METHOD, REQ_URI));
        }

        /**
         * POST /dags/~/dagRuns/~/taskInstances/list
         * @param handler handler
         * @return TaskInstanceCollection
         */
        public TaskInstanceCollection executeAs(Function<Response, Response> handler) {
            Type type = new TypeToken<TaskInstanceCollection>(){}.getType();
            return execute(handler).as(type);
        }

         /**
         * @param listTaskInstanceForm (ListTaskInstanceForm)  (required)
         * @return operation
         */
        public GetTaskInstancesBatchOper body(ListTaskInstanceForm listTaskInstanceForm) {
            reqSpec.setBody(listTaskInstanceForm);
            return this;
        }

        /**
         * Customize request specification
         * @param reqSpecCustomizer consumer to modify the RequestSpecBuilder
         * @return operation
         */
        public GetTaskInstancesBatchOper reqSpec(Consumer<RequestSpecBuilder> reqSpecCustomizer) {
            reqSpecCustomizer.accept(reqSpec);
            return this;
        }

        /**
         * Customize response specification
         * @param respSpecCustomizer consumer to modify the ResponseSpecBuilder
         * @return operation
         */
        public GetTaskInstancesBatchOper respSpec(Consumer<ResponseSpecBuilder> respSpecCustomizer) {
            respSpecCustomizer.accept(respSpec);
            return this;
        }
    }
}
