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

import org.openapitools.client.model.ClearTaskInstance;
import org.openapitools.client.model.DAG;
import org.openapitools.client.model.DAGCollection;
import org.openapitools.client.model.DAGDetail;
import org.openapitools.client.model.Error;
import org.openapitools.client.model.InlineResponse2001;
import org.openapitools.client.model.Task;
import org.openapitools.client.model.TaskCollection;
import org.openapitools.client.model.TaskInstanceReferenceCollection;

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
public interface DagApi  {

    /**
     * Clears a set of task instances associated with the DAG for a specified date range.
     *
     */
    @POST
    @Path("/dags/{dag_id}/clearTaskInstances")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    public TaskInstanceReferenceCollection clearTaskInstance(@PathParam("dag_id") String dagId, ClearTaskInstance clearTaskInstance) throws ApiException, ProcessingException;

    /**
     * Get basic information about a DAG
     *
     * Presents only information available in database (DAGModel). If you need detailed information, consider using GET /dags/{dag_id}/detail. 
     *
     */
    @GET
    @Path("/dags/{dag_id}")
    @Produces({ "application/json" })
    public DAG getDag(@PathParam("dag_id") String dagId) throws ApiException, ProcessingException;

    /**
     * Get a simplified representation of DAG.
     *
     * The response contains many DAG attributes, so the response can be large. If possible, consider using GET /dags/{dag_id}. 
     *
     */
    @GET
    @Path("/dags/{dag_id}/details")
    @Produces({ "application/json" })
    public DAGDetail getDagDetail(@PathParam("dag_id") String dagId) throws ApiException, ProcessingException;

    /**
     * Get source code using file token
     *
     */
    @GET
    @Path("/dagSources/{file_token}")
    @Produces({ "application/json" })
    public InlineResponse2001 getDagSource(@PathParam("file_token") String fileToken) throws ApiException, ProcessingException;

    /**
     * Get all DAGs
     *
     */
    @GET
    @Path("/dags")
    @Produces({ "application/json" })
    public DAGCollection getDags(@QueryParam("limit") @DefaultValue("100") Integer limit, @QueryParam("offset") Integer offset) throws ApiException, ProcessingException;

    /**
     * Get simplified representation of a task.
     *
     */
    @GET
    @Path("/dags/{dag_id}/tasks/{task_id}")
    @Produces({ "application/json" })
    public Task getTask(@PathParam("dag_id") String dagId, @PathParam("task_id") String taskId) throws ApiException, ProcessingException;

    /**
     * Get tasks for DAG
     *
     */
    @GET
    @Path("/dags/{dag_id}/tasks")
    @Produces({ "application/json" })
    public TaskCollection getTasks(@PathParam("dag_id") String dagId) throws ApiException, ProcessingException;

    /**
     * Update a DAG
     *
     */
    @PATCH
    @Path("/dags/{dag_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    public DAG updateDag(@PathParam("dag_id") String dagId, DAG DAG) throws ApiException, ProcessingException;
}
