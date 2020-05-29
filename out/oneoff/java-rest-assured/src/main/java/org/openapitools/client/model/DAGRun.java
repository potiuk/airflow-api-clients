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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.openapitools.client.model.DagState;
import org.openapitools.client.model.OneOfobjectstring;
import org.threeten.bp.OffsetDateTime;

/**
 * DAGRun
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-05-29T12:10:55.733Z[GMT]")
public class DAGRun {
  public static final String SERIALIZED_NAME_DAG_RUN_ID = "dag_run_id";
  @SerializedName(SERIALIZED_NAME_DAG_RUN_ID)
  private String dagRunId;

  public static final String SERIALIZED_NAME_DAG_ID = "dag_id";
  @SerializedName(SERIALIZED_NAME_DAG_ID)
  private String dagId;

  public static final String SERIALIZED_NAME_EXECUTION_DATE = "execution_date";
  @SerializedName(SERIALIZED_NAME_EXECUTION_DATE)
  private OffsetDateTime executionDate;

  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private OffsetDateTime startDate;

  public static final String SERIALIZED_NAME_END_DATE = "end_date";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private OffsetDateTime endDate;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private DagState state;

  public static final String SERIALIZED_NAME_EXTERNAL_TRIGGER = "external_trigger";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_TRIGGER)
  private Boolean externalTrigger = true;

  public static final String SERIALIZED_NAME_CONF = "conf";
  @SerializedName(SERIALIZED_NAME_CONF)
  private OneOfobjectstring conf = null;


  public DAGRun dagRunId(String dagRunId) {
    
    this.dagRunId = dagRunId;
    return this;
  }

   /**
   * Run ID. The value of this field can be set only when creating the object. If you try to modify the field of an existing object, the request fails with an BAD_REQUEST error. If not provided, a value will be generated based on execution_date. If the specified dag_run_id is in use, the creation request fails with an ALREADY_EXISTS error. This together with DAG_ID are a unique key. 
   * @return dagRunId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Run ID. The value of this field can be set only when creating the object. If you try to modify the field of an existing object, the request fails with an BAD_REQUEST error. If not provided, a value will be generated based on execution_date. If the specified dag_run_id is in use, the creation request fails with an ALREADY_EXISTS error. This together with DAG_ID are a unique key. ")

  public String getDagRunId() {
    return dagRunId;
  }


  public void setDagRunId(String dagRunId) {
    this.dagRunId = dagRunId;
  }


   /**
   * Get dagId
   * @return dagId
  **/
  @ApiModelProperty(required = true, value = "")

  public String getDagId() {
    return dagId;
  }




  public DAGRun executionDate(OffsetDateTime executionDate) {
    
    this.executionDate = executionDate;
    return this;
  }

   /**
   * The execution date. This is the time when the DAG run should be started according to the DAG definition. The value of this field can be set only when creating the object. If you try to modify the field of an existing object, the request fails with an BAD_REQUEST error. This together with DAG_ID are a unique key. 
   * @return executionDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The execution date. This is the time when the DAG run should be started according to the DAG definition. The value of this field can be set only when creating the object. If you try to modify the field of an existing object, the request fails with an BAD_REQUEST error. This together with DAG_ID are a unique key. ")

  public OffsetDateTime getExecutionDate() {
    return executionDate;
  }


  public void setExecutionDate(OffsetDateTime executionDate) {
    this.executionDate = executionDate;
  }


   /**
   * The start time. The time when DAG Run was actually created.. 
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The start time. The time when DAG Run was actually created.. ")

  public OffsetDateTime getStartDate() {
    return startDate;
  }




   /**
   * Get endDate
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getEndDate() {
    return endDate;
  }




  public DAGRun state(DagState state) {
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DagState getState() {
    return state;
  }


  public void setState(DagState state) {
    this.state = state;
  }


   /**
   * Get externalTrigger
   * @return externalTrigger
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getExternalTrigger() {
    return externalTrigger;
  }




  public DAGRun conf(OneOfobjectstring conf) {
    
    this.conf = conf;
    return this;
  }

   /**
   * Get conf
   * @return conf
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OneOfobjectstring getConf() {
    return conf;
  }


  public void setConf(OneOfobjectstring conf) {
    this.conf = conf;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DAGRun daGRun = (DAGRun) o;
    return Objects.equals(this.dagRunId, daGRun.dagRunId) &&
        Objects.equals(this.dagId, daGRun.dagId) &&
        Objects.equals(this.executionDate, daGRun.executionDate) &&
        Objects.equals(this.startDate, daGRun.startDate) &&
        Objects.equals(this.endDate, daGRun.endDate) &&
        Objects.equals(this.state, daGRun.state) &&
        Objects.equals(this.externalTrigger, daGRun.externalTrigger) &&
        Objects.equals(this.conf, daGRun.conf);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dagRunId, dagId, executionDate, startDate, endDate, state, externalTrigger, conf);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DAGRun {\n");
    sb.append("    dagRunId: ").append(toIndentedString(dagRunId)).append("\n");
    sb.append("    dagId: ").append(toIndentedString(dagId)).append("\n");
    sb.append("    executionDate: ").append(toIndentedString(executionDate)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    externalTrigger: ").append(toIndentedString(externalTrigger)).append("\n");
    sb.append("    conf: ").append(toIndentedString(conf)).append("\n");
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
