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

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
import org.apache.cxf.jaxrs.ext.multipart.*;

import org.eclipse.microprofile.rest.client.annotation.RegisterProvider;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

/**
 * Airflow API (Stable)
 *
 * <p>Apache Airflow management API.
 *
 */

@RegisterRestClient
@RegisterProvider(ApiExceptionMapper.class)
@Path("/")
public interface VariableApi  {

    /**
     * Create a variable
     *
     */
    @POST
    @Path("/variables")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    public Variable createVariable(Variable variable) throws ApiException, ProcessingException;

    /**
     * Delete variable
     *
     */
    @DELETE
    @Path("/variables/{variable_key}")
    @Produces({ "application/json" })
    public void deleteVariable(@PathParam("variable_key") String variableKey) throws ApiException, ProcessingException;

    /**
     * Get a variable by key
     *
     */
    @GET
    @Path("/variables/{variable_key}")
    @Produces({ "application/json" })
    public Variable getVariable(@PathParam("variable_key") String variableKey) throws ApiException, ProcessingException;

    /**
     * Get all variables
     *
     * The collection does not contain data. To get data, you must get a single entity.
     *
     */
    @GET
    @Path("/variables")
    @Produces({ "application/json" })
    public VariableCollection getVariables(@QueryParam("limit") @DefaultValue("100") Integer limit, @QueryParam("offset") Integer offset) throws ApiException, ProcessingException;

    /**
     * Update a variable by key
     *
     */
    @PATCH
    @Path("/variables/{variable_key}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    public Variable updateVariable(@PathParam("variable_key") String variableKey, Variable variable, @QueryParam("update_mask") List<String> updateMask) throws ApiException, ProcessingException;
}

