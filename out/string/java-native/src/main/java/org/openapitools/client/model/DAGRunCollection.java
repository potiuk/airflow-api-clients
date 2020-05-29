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
import org.openapitools.client.model.DAGRun;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * DAGRunCollection
 */
@JsonPropertyOrder({
  DAGRunCollection.JSON_PROPERTY_DAG_RUNS
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-05-29T12:02:20.939Z[GMT]")
public class DAGRunCollection {
  public static final String JSON_PROPERTY_DAG_RUNS = "dag_runs";
  private List<DAGRun> dagRuns = null;


  public DAGRunCollection dagRuns(List<DAGRun> dagRuns) {
    
    this.dagRuns = dagRuns;
    return this;
  }

  public DAGRunCollection addDagRunsItem(DAGRun dagRunsItem) {
    if (this.dagRuns == null) {
      this.dagRuns = new ArrayList<>();
    }
    this.dagRuns.add(dagRunsItem);
    return this;
  }

   /**
   * Get dagRuns
   * @return dagRuns
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DAG_RUNS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DAGRun> getDagRuns() {
    return dagRuns;
  }


  public void setDagRuns(List<DAGRun> dagRuns) {
    this.dagRuns = dagRuns;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DAGRunCollection daGRunCollection = (DAGRunCollection) o;
    return Objects.equals(this.dagRuns, daGRunCollection.dagRuns);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dagRuns);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DAGRunCollection {\n");
    sb.append("    dagRuns: ").append(toIndentedString(dagRuns)).append("\n");
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

