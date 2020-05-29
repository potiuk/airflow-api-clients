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
import org.openapitools.client.model.Error;
import org.openapitools.client.model.Variable;
import org.openapitools.client.model.VariableCollection;

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

@Api(value = "Variable")
public class VariableApi {

    private Supplier<RequestSpecBuilder> reqSpecSupplier;
    private Consumer<RequestSpecBuilder> reqSpecCustomizer;

    private VariableApi(Supplier<RequestSpecBuilder> reqSpecSupplier) {
        this.reqSpecSupplier = reqSpecSupplier;
    }

    public static VariableApi variable(Supplier<RequestSpecBuilder> reqSpecSupplier) {
        return new VariableApi(reqSpecSupplier);
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
                createVariable(),
                deleteVariable(),
                getVariable(),
                getVariables(),
                updateVariable()
        );
    }

    @ApiOperation(value = "Create a variable",
            notes = "",
            nickname = "createVariable",
            tags = { "Variable" })
    @ApiResponses(value = { 
            @ApiResponse(code = 200, message = "Successful response.") ,
            @ApiResponse(code = 400, message = "Client specified an invalid argument.") ,
            @ApiResponse(code = 401, message = "Request not authenticated due to missing, invalid, authentication info.") ,
            @ApiResponse(code = 403, message = "Client does not have sufficient permission.")  })
    public CreateVariableOper createVariable() {
        return new CreateVariableOper(createReqSpec());
    }

    @ApiOperation(value = "Delete variable",
            notes = "",
            nickname = "deleteVariable",
            tags = { "Variable" })
    @ApiResponses(value = { 
            @ApiResponse(code = 204, message = "No content.") ,
            @ApiResponse(code = 400, message = "Client specified an invalid argument.") ,
            @ApiResponse(code = 401, message = "Request not authenticated due to missing, invalid, authentication info.") ,
            @ApiResponse(code = 403, message = "Client does not have sufficient permission.")  })
    public DeleteVariableOper deleteVariable() {
        return new DeleteVariableOper(createReqSpec());
    }

    @ApiOperation(value = "Get a variable by key",
            notes = "",
            nickname = "getVariable",
            tags = { "Variable" })
    @ApiResponses(value = { 
            @ApiResponse(code = 200, message = "Successful response.") ,
            @ApiResponse(code = 401, message = "Request not authenticated due to missing, invalid, authentication info.") ,
            @ApiResponse(code = 403, message = "Client does not have sufficient permission.") ,
            @ApiResponse(code = 404, message = "A specified resource is not found.")  })
    public GetVariableOper getVariable() {
        return new GetVariableOper(createReqSpec());
    }

    @ApiOperation(value = "Get all variables",
            notes = "The collection does not contain data. To get data, you must get a single entity.",
            nickname = "getVariables",
            tags = { "Variable" })
    @ApiResponses(value = { 
            @ApiResponse(code = 200, message = "List of variables.") ,
            @ApiResponse(code = 401, message = "Request not authenticated due to missing, invalid, authentication info.") ,
            @ApiResponse(code = 403, message = "Client does not have sufficient permission.")  })
    public GetVariablesOper getVariables() {
        return new GetVariablesOper(createReqSpec());
    }

    @ApiOperation(value = "Update a variable by key",
            notes = "",
            nickname = "updateVariable",
            tags = { "Variable" })
    @ApiResponses(value = { 
            @ApiResponse(code = 200, message = "Successful response.") ,
            @ApiResponse(code = 400, message = "Client specified an invalid argument.") ,
            @ApiResponse(code = 401, message = "Request not authenticated due to missing, invalid, authentication info.") ,
            @ApiResponse(code = 403, message = "Client does not have sufficient permission.") ,
            @ApiResponse(code = 404, message = "A specified resource is not found.")  })
    public UpdateVariableOper updateVariable() {
        return new UpdateVariableOper(createReqSpec());
    }

    /**
     * Customize request specification
     * @param reqSpecCustomizer consumer to modify the RequestSpecBuilder
     * @return api
     */
    public VariableApi reqSpec(Consumer<RequestSpecBuilder> reqSpecCustomizer) {
        this.reqSpecCustomizer = reqSpecCustomizer;
        return this;
    }

    /**
     * Create a variable
     * 
     *
     * @see #body  (required)
     * return Variable
     */
    public static class CreateVariableOper implements Oper {

        public static final Method REQ_METHOD = POST;
        public static final String REQ_URI = "/variables";

        private RequestSpecBuilder reqSpec;
        private ResponseSpecBuilder respSpec;

        public CreateVariableOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setContentType("application/json");
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * POST /variables
         * @param handler handler
         * @param <T> type
         * @return type
         */
        @Override
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(REQ_METHOD, REQ_URI));
        }

        /**
         * POST /variables
         * @param handler handler
         * @return Variable
         */
        public Variable executeAs(Function<Response, Response> handler) {
            Type type = new TypeToken<Variable>(){}.getType();
            return execute(handler).as(type);
        }

         /**
         * @param variable (Variable)  (required)
         * @return operation
         */
        public CreateVariableOper body(Variable variable) {
            reqSpec.setBody(variable);
            return this;
        }

        /**
         * Customize request specification
         * @param reqSpecCustomizer consumer to modify the RequestSpecBuilder
         * @return operation
         */
        public CreateVariableOper reqSpec(Consumer<RequestSpecBuilder> reqSpecCustomizer) {
            reqSpecCustomizer.accept(reqSpec);
            return this;
        }

        /**
         * Customize response specification
         * @param respSpecCustomizer consumer to modify the ResponseSpecBuilder
         * @return operation
         */
        public CreateVariableOper respSpec(Consumer<ResponseSpecBuilder> respSpecCustomizer) {
            respSpecCustomizer.accept(respSpec);
            return this;
        }
    }
    /**
     * Delete variable
     * 
     *
     * @see #variableKeyPath The Variable Key. (required)
     */
    public static class DeleteVariableOper implements Oper {

        public static final Method REQ_METHOD = DELETE;
        public static final String REQ_URI = "/variables/{variable_key}";

        private RequestSpecBuilder reqSpec;
        private ResponseSpecBuilder respSpec;

        public DeleteVariableOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * DELETE /variables/{variable_key}
         * @param handler handler
         * @param <T> type
         * @return type
         */
        @Override
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(REQ_METHOD, REQ_URI));
        }

        public static final String VARIABLE_KEY_PATH = "variable_key";

        /**
         * @param variableKey (String) The Variable Key. (required)
         * @return operation
         */
        public DeleteVariableOper variableKeyPath(Object variableKey) {
            reqSpec.addPathParam(VARIABLE_KEY_PATH, variableKey);
            return this;
        }

        /**
         * Customize request specification
         * @param reqSpecCustomizer consumer to modify the RequestSpecBuilder
         * @return operation
         */
        public DeleteVariableOper reqSpec(Consumer<RequestSpecBuilder> reqSpecCustomizer) {
            reqSpecCustomizer.accept(reqSpec);
            return this;
        }

        /**
         * Customize response specification
         * @param respSpecCustomizer consumer to modify the ResponseSpecBuilder
         * @return operation
         */
        public DeleteVariableOper respSpec(Consumer<ResponseSpecBuilder> respSpecCustomizer) {
            respSpecCustomizer.accept(respSpec);
            return this;
        }
    }
    /**
     * Get a variable by key
     * 
     *
     * @see #variableKeyPath The Variable Key. (required)
     * return Variable
     */
    public static class GetVariableOper implements Oper {

        public static final Method REQ_METHOD = GET;
        public static final String REQ_URI = "/variables/{variable_key}";

        private RequestSpecBuilder reqSpec;
        private ResponseSpecBuilder respSpec;

        public GetVariableOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * GET /variables/{variable_key}
         * @param handler handler
         * @param <T> type
         * @return type
         */
        @Override
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(REQ_METHOD, REQ_URI));
        }

        /**
         * GET /variables/{variable_key}
         * @param handler handler
         * @return Variable
         */
        public Variable executeAs(Function<Response, Response> handler) {
            Type type = new TypeToken<Variable>(){}.getType();
            return execute(handler).as(type);
        }

        public static final String VARIABLE_KEY_PATH = "variable_key";

        /**
         * @param variableKey (String) The Variable Key. (required)
         * @return operation
         */
        public GetVariableOper variableKeyPath(Object variableKey) {
            reqSpec.addPathParam(VARIABLE_KEY_PATH, variableKey);
            return this;
        }

        /**
         * Customize request specification
         * @param reqSpecCustomizer consumer to modify the RequestSpecBuilder
         * @return operation
         */
        public GetVariableOper reqSpec(Consumer<RequestSpecBuilder> reqSpecCustomizer) {
            reqSpecCustomizer.accept(reqSpec);
            return this;
        }

        /**
         * Customize response specification
         * @param respSpecCustomizer consumer to modify the ResponseSpecBuilder
         * @return operation
         */
        public GetVariableOper respSpec(Consumer<ResponseSpecBuilder> respSpecCustomizer) {
            respSpecCustomizer.accept(respSpec);
            return this;
        }
    }
    /**
     * Get all variables
     * The collection does not contain data. To get data, you must get a single entity.
     *
     * @see #limitQuery The numbers of items to return. (optional, default to 100)
     * @see #offsetQuery The number of items to skip before starting to collect the result set. (optional)
     * return VariableCollection
     */
    public static class GetVariablesOper implements Oper {

        public static final Method REQ_METHOD = GET;
        public static final String REQ_URI = "/variables";

        private RequestSpecBuilder reqSpec;
        private ResponseSpecBuilder respSpec;

        public GetVariablesOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * GET /variables
         * @param handler handler
         * @param <T> type
         * @return type
         */
        @Override
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(REQ_METHOD, REQ_URI));
        }

        /**
         * GET /variables
         * @param handler handler
         * @return VariableCollection
         */
        public VariableCollection executeAs(Function<Response, Response> handler) {
            Type type = new TypeToken<VariableCollection>(){}.getType();
            return execute(handler).as(type);
        }

        public static final String LIMIT_QUERY = "limit";

        /**
         * @param limit (Integer) The numbers of items to return. (optional, default to 100)
         * @return operation
         */
        public GetVariablesOper limitQuery(Object... limit) {
            reqSpec.addQueryParam(LIMIT_QUERY, limit);
            return this;
        }

        public static final String OFFSET_QUERY = "offset";

        /**
         * @param offset (Integer) The number of items to skip before starting to collect the result set. (optional)
         * @return operation
         */
        public GetVariablesOper offsetQuery(Object... offset) {
            reqSpec.addQueryParam(OFFSET_QUERY, offset);
            return this;
        }

        /**
         * Customize request specification
         * @param reqSpecCustomizer consumer to modify the RequestSpecBuilder
         * @return operation
         */
        public GetVariablesOper reqSpec(Consumer<RequestSpecBuilder> reqSpecCustomizer) {
            reqSpecCustomizer.accept(reqSpec);
            return this;
        }

        /**
         * Customize response specification
         * @param respSpecCustomizer consumer to modify the ResponseSpecBuilder
         * @return operation
         */
        public GetVariablesOper respSpec(Consumer<ResponseSpecBuilder> respSpecCustomizer) {
            respSpecCustomizer.accept(respSpec);
            return this;
        }
    }
    /**
     * Update a variable by key
     * 
     *
     * @see #variableKeyPath The Variable Key. (required)
     * @see #body  (required)
     * @see #updateMaskQuery The fields to update on the connection (connection, pool etc). If absent or empty, all modifiable fields are updated. A comma-separated list of fully qualified names of fields.  (optional, default to new ArrayList&lt;String&gt;())
     * return Variable
     */
    public static class UpdateVariableOper implements Oper {

        public static final Method REQ_METHOD = PATCH;
        public static final String REQ_URI = "/variables/{variable_key}";

        private RequestSpecBuilder reqSpec;
        private ResponseSpecBuilder respSpec;

        public UpdateVariableOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setContentType("application/json");
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * PATCH /variables/{variable_key}
         * @param handler handler
         * @param <T> type
         * @return type
         */
        @Override
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(REQ_METHOD, REQ_URI));
        }

        /**
         * PATCH /variables/{variable_key}
         * @param handler handler
         * @return Variable
         */
        public Variable executeAs(Function<Response, Response> handler) {
            Type type = new TypeToken<Variable>(){}.getType();
            return execute(handler).as(type);
        }

         /**
         * @param variable (Variable)  (required)
         * @return operation
         */
        public UpdateVariableOper body(Variable variable) {
            reqSpec.setBody(variable);
            return this;
        }

        public static final String VARIABLE_KEY_PATH = "variable_key";

        /**
         * @param variableKey (String) The Variable Key. (required)
         * @return operation
         */
        public UpdateVariableOper variableKeyPath(Object variableKey) {
            reqSpec.addPathParam(VARIABLE_KEY_PATH, variableKey);
            return this;
        }

        public static final String UPDATE_MASK_QUERY = "update_mask";

        /**
         * @param updateMask (List&lt;String&gt;) The fields to update on the connection (connection, pool etc). If absent or empty, all modifiable fields are updated. A comma-separated list of fully qualified names of fields.  (optional, default to new ArrayList&lt;String&gt;())
         * @return operation
         */
        public UpdateVariableOper updateMaskQuery(Object... updateMask) {
            reqSpec.addQueryParam(UPDATE_MASK_QUERY, updateMask);
            return this;
        }

        /**
         * Customize request specification
         * @param reqSpecCustomizer consumer to modify the RequestSpecBuilder
         * @return operation
         */
        public UpdateVariableOper reqSpec(Consumer<RequestSpecBuilder> reqSpecCustomizer) {
            reqSpecCustomizer.accept(reqSpec);
            return this;
        }

        /**
         * Customize response specification
         * @param respSpecCustomizer consumer to modify the ResponseSpecBuilder
         * @return operation
         */
        public UpdateVariableOper respSpec(Consumer<ResponseSpecBuilder> respSpecCustomizer) {
            respSpecCustomizer.accept(respSpec);
            return this;
        }
    }
}
