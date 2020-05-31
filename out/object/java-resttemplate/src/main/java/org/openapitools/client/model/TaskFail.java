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


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * TaskFail
 */
@JsonPropertyOrder({
  TaskFail.JSON_PROPERTY_TASK_ID,
  TaskFail.JSON_PROPERTY_DAG_ID,
  TaskFail.JSON_PROPERTY_EXECUTION_DATE,
  TaskFail.JSON_PROPERTY_START_DATE,
  TaskFail.JSON_PROPERTY_END_DATE,
  TaskFail.JSON_PROPERTY_DURATION
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-05-31T07:53:11.814Z[GMT]")
public class TaskFail {
  public static final String JSON_PROPERTY_TASK_ID = "task_id";
  private String taskId;

  public static final String JSON_PROPERTY_DAG_ID = "dag_id";
  private String dagId;

  public static final String JSON_PROPERTY_EXECUTION_DATE = "execution_date";
  private String executionDate;

  public static final String JSON_PROPERTY_START_DATE = "start_date";
  private String startDate;

  public static final String JSON_PROPERTY_END_DATE = "end_date";
  private String endDate;

  public static final String JSON_PROPERTY_DURATION = "duration";
  private Integer duration;


  public TaskFail taskId(String taskId) {
    
    this.taskId = taskId;
    return this;
  }

   /**
   * Get taskId
   * @return taskId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TASK_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTaskId() {
    return taskId;
  }


  public void setTaskId(String taskId) {
    this.taskId = taskId;
  }


  public TaskFail dagId(String dagId) {
    
    this.dagId = dagId;
    return this;
  }

   /**
   * Get dagId
   * @return dagId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DAG_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDagId() {
    return dagId;
  }


  public void setDagId(String dagId) {
    this.dagId = dagId;
  }


  public TaskFail executionDate(String executionDate) {
    
    this.executionDate = executionDate;
    return this;
  }

   /**
   * Get executionDate
   * @return executionDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EXECUTION_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExecutionDate() {
    return executionDate;
  }


  public void setExecutionDate(String executionDate) {
    this.executionDate = executionDate;
  }


  public TaskFail startDate(String startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStartDate() {
    return startDate;
  }


  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }


  public TaskFail endDate(String endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * Get endDate
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEndDate() {
    return endDate;
  }


  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }


  public TaskFail duration(Integer duration) {
    
    this.duration = duration;
    return this;
  }

   /**
   * Get duration
   * @return duration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getDuration() {
    return duration;
  }


  public void setDuration(Integer duration) {
    this.duration = duration;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskFail taskFail = (TaskFail) o;
    return Objects.equals(this.taskId, taskFail.taskId) &&
        Objects.equals(this.dagId, taskFail.dagId) &&
        Objects.equals(this.executionDate, taskFail.executionDate) &&
        Objects.equals(this.startDate, taskFail.startDate) &&
        Objects.equals(this.endDate, taskFail.endDate) &&
        Objects.equals(this.duration, taskFail.duration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taskId, dagId, executionDate, startDate, endDate, duration);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskFail {\n");
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
    sb.append("    dagId: ").append(toIndentedString(dagId)).append("\n");
    sb.append("    executionDate: ").append(toIndentedString(executionDate)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

