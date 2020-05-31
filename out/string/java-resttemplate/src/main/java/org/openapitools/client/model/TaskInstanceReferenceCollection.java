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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.TaskInstanceReference;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * TaskInstanceReferenceCollection
 */
@JsonPropertyOrder({
  TaskInstanceReferenceCollection.JSON_PROPERTY_TASK_INSTANCES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-05-31T07:37:16.815Z[GMT]")
public class TaskInstanceReferenceCollection {
  public static final String JSON_PROPERTY_TASK_INSTANCES = "task_instances";
  private List<TaskInstanceReference> taskInstances = null;


  public TaskInstanceReferenceCollection taskInstances(List<TaskInstanceReference> taskInstances) {
    
    this.taskInstances = taskInstances;
    return this;
  }

  public TaskInstanceReferenceCollection addTaskInstancesItem(TaskInstanceReference taskInstancesItem) {
    if (this.taskInstances == null) {
      this.taskInstances = new ArrayList<TaskInstanceReference>();
    }
    this.taskInstances.add(taskInstancesItem);
    return this;
  }

   /**
   * Get taskInstances
   * @return taskInstances
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TASK_INSTANCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TaskInstanceReference> getTaskInstances() {
    return taskInstances;
  }


  public void setTaskInstances(List<TaskInstanceReference> taskInstances) {
    this.taskInstances = taskInstances;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskInstanceReferenceCollection taskInstanceReferenceCollection = (TaskInstanceReferenceCollection) o;
    return Objects.equals(this.taskInstances, taskInstanceReferenceCollection.taskInstances);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taskInstances);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskInstanceReferenceCollection {\n");
    sb.append("    taskInstances: ").append(toIndentedString(taskInstances)).append("\n");
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

