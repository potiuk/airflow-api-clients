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

/**
 * ClearTaskInstance
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-05-29T12:05:13.583Z[GMT]")
public class ClearTaskInstance {
  public static final String SERIALIZED_NAME_DRY_RUN = "dry_run";
  @SerializedName(SERIALIZED_NAME_DRY_RUN)
  private Boolean dryRun = true;

  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private String startDate;

  public static final String SERIALIZED_NAME_END_DATE = "end_date";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private String endDate;

  public static final String SERIALIZED_NAME_ONLY_FAILED = "only_failed";
  @SerializedName(SERIALIZED_NAME_ONLY_FAILED)
  private String onlyFailed;

  public static final String SERIALIZED_NAME_ONLY_RUNNING = "only_running";
  @SerializedName(SERIALIZED_NAME_ONLY_RUNNING)
  private String onlyRunning;

  public static final String SERIALIZED_NAME_INCLUDE_SUBDAGS = "include_subdags";
  @SerializedName(SERIALIZED_NAME_INCLUDE_SUBDAGS)
  private Boolean includeSubdags;

  public static final String SERIALIZED_NAME_INCLUDE_PARENTDAG = "include_parentdag";
  @SerializedName(SERIALIZED_NAME_INCLUDE_PARENTDAG)
  private Boolean includeParentdag;

  public static final String SERIALIZED_NAME_RESET_DAG_RUNS = "reset_dag_runs";
  @SerializedName(SERIALIZED_NAME_RESET_DAG_RUNS)
  private Boolean resetDagRuns;


  public ClearTaskInstance dryRun(Boolean dryRun) {
    
    this.dryRun = dryRun;
    return this;
  }

   /**
   * If set, don&#39;t actually run this operation. The response will contain a list of task instances planned to be cleaned, but not modified in any way. 
   * @return dryRun
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If set, don't actually run this operation. The response will contain a list of task instances planned to be cleaned, but not modified in any way. ")

  public Boolean getDryRun() {
    return dryRun;
  }


  public void setDryRun(Boolean dryRun) {
    this.dryRun = dryRun;
  }


  public ClearTaskInstance startDate(String startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * The minimum execution date to clear.
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The minimum execution date to clear.")

  public String getStartDate() {
    return startDate;
  }


  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }


  public ClearTaskInstance endDate(String endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * The maximum execution date to clear.
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The maximum execution date to clear.")

  public String getEndDate() {
    return endDate;
  }


  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }


  public ClearTaskInstance onlyFailed(String onlyFailed) {
    
    this.onlyFailed = onlyFailed;
    return this;
  }

   /**
   * Only clear failed tasks.
   * @return onlyFailed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Only clear failed tasks.")

  public String getOnlyFailed() {
    return onlyFailed;
  }


  public void setOnlyFailed(String onlyFailed) {
    this.onlyFailed = onlyFailed;
  }


  public ClearTaskInstance onlyRunning(String onlyRunning) {
    
    this.onlyRunning = onlyRunning;
    return this;
  }

   /**
   * Only clear running tasks.
   * @return onlyRunning
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Only clear running tasks.")

  public String getOnlyRunning() {
    return onlyRunning;
  }


  public void setOnlyRunning(String onlyRunning) {
    this.onlyRunning = onlyRunning;
  }


  public ClearTaskInstance includeSubdags(Boolean includeSubdags) {
    
    this.includeSubdags = includeSubdags;
    return this;
  }

   /**
   * Clear tasks in subdags and clear external tasks indicated by ExternalTaskMarker.
   * @return includeSubdags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Clear tasks in subdags and clear external tasks indicated by ExternalTaskMarker.")

  public Boolean getIncludeSubdags() {
    return includeSubdags;
  }


  public void setIncludeSubdags(Boolean includeSubdags) {
    this.includeSubdags = includeSubdags;
  }


  public ClearTaskInstance includeParentdag(Boolean includeParentdag) {
    
    this.includeParentdag = includeParentdag;
    return this;
  }

   /**
   * Clear tasks in the parent dag of the subdag.
   * @return includeParentdag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Clear tasks in the parent dag of the subdag.")

  public Boolean getIncludeParentdag() {
    return includeParentdag;
  }


  public void setIncludeParentdag(Boolean includeParentdag) {
    this.includeParentdag = includeParentdag;
  }


  public ClearTaskInstance resetDagRuns(Boolean resetDagRuns) {
    
    this.resetDagRuns = resetDagRuns;
    return this;
  }

   /**
   * Set state of DAG Runs to RUNNING.
   * @return resetDagRuns
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Set state of DAG Runs to RUNNING.")

  public Boolean getResetDagRuns() {
    return resetDagRuns;
  }


  public void setResetDagRuns(Boolean resetDagRuns) {
    this.resetDagRuns = resetDagRuns;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClearTaskInstance clearTaskInstance = (ClearTaskInstance) o;
    return Objects.equals(this.dryRun, clearTaskInstance.dryRun) &&
        Objects.equals(this.startDate, clearTaskInstance.startDate) &&
        Objects.equals(this.endDate, clearTaskInstance.endDate) &&
        Objects.equals(this.onlyFailed, clearTaskInstance.onlyFailed) &&
        Objects.equals(this.onlyRunning, clearTaskInstance.onlyRunning) &&
        Objects.equals(this.includeSubdags, clearTaskInstance.includeSubdags) &&
        Objects.equals(this.includeParentdag, clearTaskInstance.includeParentdag) &&
        Objects.equals(this.resetDagRuns, clearTaskInstance.resetDagRuns);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dryRun, startDate, endDate, onlyFailed, onlyRunning, includeSubdags, includeParentdag, resetDagRuns);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClearTaskInstance {\n");
    sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    onlyFailed: ").append(toIndentedString(onlyFailed)).append("\n");
    sb.append("    onlyRunning: ").append(toIndentedString(onlyRunning)).append("\n");
    sb.append("    includeSubdags: ").append(toIndentedString(includeSubdags)).append("\n");
    sb.append("    includeParentdag: ").append(toIndentedString(includeParentdag)).append("\n");
    sb.append("    resetDagRuns: ").append(toIndentedString(resetDagRuns)).append("\n");
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

