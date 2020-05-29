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

import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Pair;

import java.math.BigDecimal;
import org.openapitools.client.model.Error;
import org.openapitools.client.model.ExtraLinkCollection;
import org.openapitools.client.model.InlineResponse200;
import org.openapitools.client.model.ListTaskInstanceForm;
import java.time.OffsetDateTime;
import org.openapitools.client.model.TaskInstance;
import org.openapitools.client.model.TaskInstanceCollection;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.function.Consumer;

import java.util.ArrayList;
import java.util.StringJoiner;
import java.util.List;
import java.util.Map;


@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-05-29T12:06:56.947Z[GMT]")
public class TaskInstanceApi {
  private final HttpClient memberVarHttpClient;
  private final ObjectMapper memberVarObjectMapper;
  private final String memberVarBaseUri;
  private final Consumer<HttpRequest.Builder> memberVarInterceptor;
  private final Duration memberVarReadTimeout;
  private final Consumer<HttpResponse<InputStream>> memberVarResponseInterceptor;
  
  public TaskInstanceApi() {
    this(new ApiClient());
  }

  public TaskInstanceApi(ApiClient apiClient) {
    memberVarHttpClient = apiClient.getHttpClient();
    memberVarObjectMapper = apiClient.getObjectMapper();
    memberVarBaseUri = apiClient.getBaseUri();
    memberVarInterceptor = apiClient.getRequestInterceptor();
    memberVarReadTimeout = apiClient.getReadTimeout();
    memberVarResponseInterceptor = apiClient.getResponseInterceptor();
  }

  /**
   * Get extra links for task instance
   * 
   * @param dagId The DAG ID. (required)
   * @param dagRunId The DAG Run ID. (required)
   * @param taskId The Task ID. (required)
   * @return ExtraLinkCollection
   * @throws ApiException if fails to make API call
   */
  public ExtraLinkCollection getExtraLinks (String dagId, String dagRunId, String taskId) throws ApiException {
    // verify the required parameter 'dagId' is set
    if (dagId == null) {
        throw new ApiException(400, "Missing the required parameter 'dagId' when calling getExtraLinks");
    }
    // verify the required parameter 'dagRunId' is set
    if (dagRunId == null) {
        throw new ApiException(400, "Missing the required parameter 'dagRunId' when calling getExtraLinks");
    }
    // verify the required parameter 'taskId' is set
    if (taskId == null) {
        throw new ApiException(400, "Missing the required parameter 'taskId' when calling getExtraLinks");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/links"
        .replace("{dag_id}", ApiClient.urlEncode(dagId.toString()))
        .replace("{dag_run_id}", ApiClient.urlEncode(dagRunId.toString()))
        .replace("{task_id}", ApiClient.urlEncode(taskId.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Accept", "application/json");

    try {
      localVarRequestBuilder.method("GET", HttpRequest.BodyPublishers.noBody());
      if (memberVarReadTimeout != null) {
        localVarRequestBuilder.timeout(memberVarReadTimeout);
      }
      if (memberVarInterceptor != null) {
        memberVarInterceptor.accept(localVarRequestBuilder);
      }
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
      localVarRequestBuilder.build(),
      HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }          
      if (localVarResponse.statusCode()/ 100 != 2) {
          throw new ApiException(localVarResponse.statusCode(),
              "getExtraLinks call received non-success response",
              localVarResponse.headers(),
              localVarResponse.body() == null ? null : new String(localVarResponse.body().readAllBytes()));
      }
      return memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<ExtraLinkCollection>() {});
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }
  /**
   * Get logs for a task instance
   * Get logs for a specific task instance and its try number
   * @param dagId The DAG ID. (required)
   * @param dagRunId The DAG Run ID. (required)
   * @param taskId The Task ID. (required)
   * @param taskTryNumber The Task Try Number. (required)
   * @param fullContent A full content will be returned. By default, only the first fragment will be returned.  (optional)
   * @param token A token that allows you to continue fetching logs. If passed, it will specify the location from which the download should be continued.  (optional)
   * @return InlineResponse200
   * @throws ApiException if fails to make API call
   */
  public InlineResponse200 getLogs (String dagId, String dagRunId, String taskId, Integer taskTryNumber, Boolean fullContent, String token) throws ApiException {
    // verify the required parameter 'dagId' is set
    if (dagId == null) {
        throw new ApiException(400, "Missing the required parameter 'dagId' when calling getLogs");
    }
    // verify the required parameter 'dagRunId' is set
    if (dagRunId == null) {
        throw new ApiException(400, "Missing the required parameter 'dagRunId' when calling getLogs");
    }
    // verify the required parameter 'taskId' is set
    if (taskId == null) {
        throw new ApiException(400, "Missing the required parameter 'taskId' when calling getLogs");
    }
    // verify the required parameter 'taskTryNumber' is set
    if (taskTryNumber == null) {
        throw new ApiException(400, "Missing the required parameter 'taskTryNumber' when calling getLogs");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/logs/{task_try_number}"
        .replace("{dag_id}", ApiClient.urlEncode(dagId.toString()))
        .replace("{dag_run_id}", ApiClient.urlEncode(dagRunId.toString()))
        .replace("{task_id}", ApiClient.urlEncode(taskId.toString()))
        .replace("{task_try_number}", ApiClient.urlEncode(taskTryNumber.toString()));

    List<Pair> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(ApiClient.parameterToPairs("full_content", fullContent));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("token", token));

    if (!localVarQueryParams.isEmpty()) {
      StringJoiner queryJoiner = new StringJoiner("&");
      localVarQueryParams.forEach(p -> queryJoiner.add(p.getName() + '=' + p.getValue()));
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath + '?' + queryJoiner.toString()));
    } else {
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));
    }

    localVarRequestBuilder.header("Accept", "application/json");

    try {
      localVarRequestBuilder.method("GET", HttpRequest.BodyPublishers.noBody());
      if (memberVarReadTimeout != null) {
        localVarRequestBuilder.timeout(memberVarReadTimeout);
      }
      if (memberVarInterceptor != null) {
        memberVarInterceptor.accept(localVarRequestBuilder);
      }
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
      localVarRequestBuilder.build(),
      HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }          
      if (localVarResponse.statusCode()/ 100 != 2) {
          throw new ApiException(localVarResponse.statusCode(),
              "getLogs call received non-success response",
              localVarResponse.headers(),
              localVarResponse.body() == null ? null : new String(localVarResponse.body().readAllBytes()));
      }
      return memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<InlineResponse200>() {});
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }
  /**
   * Get a task instance
   * 
   * @param dagId The DAG ID. (required)
   * @param dagRunId The DAG Run ID. (required)
   * @param taskId The Task ID. (required)
   * @return TaskInstance
   * @throws ApiException if fails to make API call
   */
  public TaskInstance getTaskInstance (String dagId, String dagRunId, String taskId) throws ApiException {
    // verify the required parameter 'dagId' is set
    if (dagId == null) {
        throw new ApiException(400, "Missing the required parameter 'dagId' when calling getTaskInstance");
    }
    // verify the required parameter 'dagRunId' is set
    if (dagRunId == null) {
        throw new ApiException(400, "Missing the required parameter 'dagRunId' when calling getTaskInstance");
    }
    // verify the required parameter 'taskId' is set
    if (taskId == null) {
        throw new ApiException(400, "Missing the required parameter 'taskId' when calling getTaskInstance");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}"
        .replace("{dag_id}", ApiClient.urlEncode(dagId.toString()))
        .replace("{dag_run_id}", ApiClient.urlEncode(dagRunId.toString()))
        .replace("{task_id}", ApiClient.urlEncode(taskId.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Accept", "application/json");

    try {
      localVarRequestBuilder.method("GET", HttpRequest.BodyPublishers.noBody());
      if (memberVarReadTimeout != null) {
        localVarRequestBuilder.timeout(memberVarReadTimeout);
      }
      if (memberVarInterceptor != null) {
        memberVarInterceptor.accept(localVarRequestBuilder);
      }
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
      localVarRequestBuilder.build(),
      HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }          
      if (localVarResponse.statusCode()/ 100 != 2) {
          throw new ApiException(localVarResponse.statusCode(),
              "getTaskInstance call received non-success response",
              localVarResponse.headers(),
              localVarResponse.body() == null ? null : new String(localVarResponse.body().readAllBytes()));
      }
      return memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<TaskInstance>() {});
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }
  /**
   * Get a list of task instance of DAG.
   * This endpoint allows specifying &#x60;~&#x60; as the dag_id, dag_run_id to retrieve DAG Runs for all DAGs and DAG Runs. 
   * @param dagId The DAG ID. (required)
   * @param dagRunId The DAG Run ID. (required)
   * @param executionDateGte Returns objects greater or equal to the specified date. This can be combined with execution_date_lte parameter to receive only the selected period.  (optional)
   * @param executionDateLte Returns objects less than or equal to the specified date. This can be combined with execution_date_gte parameter to receive only the selected period.  (optional)
   * @param startDateGte Returns objects greater or equal the specified date. This can be combined with startd_ate_lte parameter to receive only the selected period.  (optional)
   * @param startDateLte Returns objects less or equal the specified date. This can be combined with start_date_gte parameter to receive only the selected period.  (optional)
   * @param endDateGte Returns objects greater or equal the specified date. This can be combined with start_date_lte parameter to receive only the selected period.  (optional)
   * @param endDateLte Returns objects less than or equal to the specified date. This can be combined with start_date_gte parameter to receive only the selected period.  (optional)
   * @param durationGte Returns objects greater than or equal to the specified values. This can be combined with duration_lte parameter to receive only the selected period.  (optional)
   * @param durationLte Returns objects less than or equal to the specified values. This can be combined with duration_gte parameter to receive only the selected range.  (optional)
   * @param state The value can be repeated to retrieve multiple matching values (OR condition). (optional
   * @param pool The value can be repeated to retrieve multiple matching values (OR condition). (optional
   * @param queue The value can be repeated to retrieve multiple matching values (OR condition). (optional
   * @param limit The numbers of items to return. (optional, default to 100)
   * @param offset The number of items to skip before starting to collect the result set. (optional)
   * @return TaskInstanceCollection
   * @throws ApiException if fails to make API call
   */
  public TaskInstanceCollection getTaskInstances (String dagId, String dagRunId, OffsetDateTime executionDateGte, OffsetDateTime executionDateLte, OffsetDateTime startDateGte, OffsetDateTime startDateLte, OffsetDateTime endDateGte, OffsetDateTime endDateLte, BigDecimal durationGte, BigDecimal durationLte, List<String> state, List<String> pool, List<String> queue, Integer limit, Integer offset) throws ApiException {
    // verify the required parameter 'dagId' is set
    if (dagId == null) {
        throw new ApiException(400, "Missing the required parameter 'dagId' when calling getTaskInstances");
    }
    // verify the required parameter 'dagRunId' is set
    if (dagRunId == null) {
        throw new ApiException(400, "Missing the required parameter 'dagRunId' when calling getTaskInstances");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances"
        .replace("{dag_id}", ApiClient.urlEncode(dagId.toString()))
        .replace("{dag_run_id}", ApiClient.urlEncode(dagRunId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(ApiClient.parameterToPairs("execution_date_gte", executionDateGte));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("execution_date_lte", executionDateLte));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("start_date_gte", startDateGte));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("start_date_lte", startDateLte));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("end_date_gte", endDateGte));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("end_date_lte", endDateLte));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("duration_gte", durationGte));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("duration_lte", durationLte));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("multi", "state", state));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("multi", "pool", pool));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("multi", "Queue", queue));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("limit", limit));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("offset", offset));

    if (!localVarQueryParams.isEmpty()) {
      StringJoiner queryJoiner = new StringJoiner("&");
      localVarQueryParams.forEach(p -> queryJoiner.add(p.getName() + '=' + p.getValue()));
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath + '?' + queryJoiner.toString()));
    } else {
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));
    }

    localVarRequestBuilder.header("Accept", "application/json");

    try {
      localVarRequestBuilder.method("GET", HttpRequest.BodyPublishers.noBody());
      if (memberVarReadTimeout != null) {
        localVarRequestBuilder.timeout(memberVarReadTimeout);
      }
      if (memberVarInterceptor != null) {
        memberVarInterceptor.accept(localVarRequestBuilder);
      }
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
      localVarRequestBuilder.build(),
      HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }          
      if (localVarResponse.statusCode()/ 100 != 2) {
          throw new ApiException(localVarResponse.statusCode(),
              "getTaskInstances call received non-success response",
              localVarResponse.headers(),
              localVarResponse.body() == null ? null : new String(localVarResponse.body().readAllBytes()));
      }
      return memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<TaskInstanceCollection>() {});
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }
  /**
   * Get list of task instances from all DAGs and DAG Runs.
   * This endpoint is a POST to allow filtering across a large number of DAG IDs, where as a GET it would run in to maximum HTTP request URL lengthlimits 
   * @param listTaskInstanceForm  (required)
   * @return TaskInstanceCollection
   * @throws ApiException if fails to make API call
   */
  public TaskInstanceCollection getTaskInstancesBatch (ListTaskInstanceForm listTaskInstanceForm) throws ApiException {
    // verify the required parameter 'listTaskInstanceForm' is set
    if (listTaskInstanceForm == null) {
        throw new ApiException(400, "Missing the required parameter 'listTaskInstanceForm' when calling getTaskInstancesBatch");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/dags/~/dagRuns/~/taskInstances/list";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(listTaskInstanceForm);
      localVarRequestBuilder.method("POST", HttpRequest.BodyPublishers.ofByteArray(localVarPostBody));
      if (memberVarReadTimeout != null) {
        localVarRequestBuilder.timeout(memberVarReadTimeout);
      }
      if (memberVarInterceptor != null) {
        memberVarInterceptor.accept(localVarRequestBuilder);
      }
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
      localVarRequestBuilder.build(),
      HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }          
      if (localVarResponse.statusCode()/ 100 != 2) {
          throw new ApiException(localVarResponse.statusCode(),
              "getTaskInstancesBatch call received non-success response",
              localVarResponse.headers(),
              localVarResponse.body() == null ? null : new String(localVarResponse.body().readAllBytes()));
      }
      return memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<TaskInstanceCollection>() {});
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }
}
