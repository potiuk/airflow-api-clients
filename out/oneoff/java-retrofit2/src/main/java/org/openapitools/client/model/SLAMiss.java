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
 * SLAMiss
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-05-30T18:48:14.686Z[GMT]")
public class SLAMiss {
  public static final String SERIALIZED_NAME_TASK_ID = "task_id";
  @SerializedName(SERIALIZED_NAME_TASK_ID)
  private String taskId;

  public static final String SERIALIZED_NAME_DAG_ID = "dag_id";
  @SerializedName(SERIALIZED_NAME_DAG_ID)
  private String dagId;

  public static final String SERIALIZED_NAME_EXECUTION_DATE = "execution_date";
  @SerializedName(SERIALIZED_NAME_EXECUTION_DATE)
  private String executionDate;

  public static final String SERIALIZED_NAME_EMAIL_SENT = "email_sent";
  @SerializedName(SERIALIZED_NAME_EMAIL_SENT)
  private Boolean emailSent;

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private String timestamp;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_NOTIFICATION_SENT = "notification_sent";
  @SerializedName(SERIALIZED_NAME_NOTIFICATION_SENT)
  private Boolean notificationSent;


   /**
   * Get taskId
   * @return taskId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTaskId() {
    return taskId;
  }




  public SLAMiss dagId(String dagId) {
    
    this.dagId = dagId;
    return this;
  }

   /**
   * Get dagId
   * @return dagId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDagId() {
    return dagId;
  }


  public void setDagId(String dagId) {
    this.dagId = dagId;
  }


  public SLAMiss executionDate(String executionDate) {
    
    this.executionDate = executionDate;
    return this;
  }

   /**
   * Get executionDate
   * @return executionDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getExecutionDate() {
    return executionDate;
  }


  public void setExecutionDate(String executionDate) {
    this.executionDate = executionDate;
  }


  public SLAMiss emailSent(Boolean emailSent) {
    
    this.emailSent = emailSent;
    return this;
  }

   /**
   * Get emailSent
   * @return emailSent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getEmailSent() {
    return emailSent;
  }


  public void setEmailSent(Boolean emailSent) {
    this.emailSent = emailSent;
  }


  public SLAMiss timestamp(String timestamp) {
    
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Get timestamp
   * @return timestamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTimestamp() {
    return timestamp;
  }


  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }


  public SLAMiss description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public SLAMiss notificationSent(Boolean notificationSent) {
    
    this.notificationSent = notificationSent;
    return this;
  }

   /**
   * Get notificationSent
   * @return notificationSent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getNotificationSent() {
    return notificationSent;
  }


  public void setNotificationSent(Boolean notificationSent) {
    this.notificationSent = notificationSent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SLAMiss slAMiss = (SLAMiss) o;
    return Objects.equals(this.taskId, slAMiss.taskId) &&
        Objects.equals(this.dagId, slAMiss.dagId) &&
        Objects.equals(this.executionDate, slAMiss.executionDate) &&
        Objects.equals(this.emailSent, slAMiss.emailSent) &&
        Objects.equals(this.timestamp, slAMiss.timestamp) &&
        Objects.equals(this.description, slAMiss.description) &&
        Objects.equals(this.notificationSent, slAMiss.notificationSent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taskId, dagId, executionDate, emailSent, timestamp, description, notificationSent);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SLAMiss {\n");
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
    sb.append("    dagId: ").append(toIndentedString(dagId)).append("\n");
    sb.append("    executionDate: ").append(toIndentedString(executionDate)).append("\n");
    sb.append("    emailSent: ").append(toIndentedString(emailSent)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    notificationSent: ").append(toIndentedString(notificationSent)).append("\n");
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

