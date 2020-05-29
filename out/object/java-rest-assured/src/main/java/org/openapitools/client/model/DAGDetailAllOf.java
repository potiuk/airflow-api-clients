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
import java.math.BigDecimal;
import org.openapitools.client.model.TimeDelta;
import org.threeten.bp.OffsetDateTime;

/**
 * DAGDetailAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-05-29T12:06:49.093Z[GMT]")
public class DAGDetailAllOf {
  public static final String SERIALIZED_NAME_TIMEZONE = "timezone";
  @SerializedName(SERIALIZED_NAME_TIMEZONE)
  private String timezone;

  public static final String SERIALIZED_NAME_CATCHUP = "catchup";
  @SerializedName(SERIALIZED_NAME_CATCHUP)
  private Boolean catchup;

  public static final String SERIALIZED_NAME_ORIENTATION = "orientation";
  @SerializedName(SERIALIZED_NAME_ORIENTATION)
  private String orientation;

  public static final String SERIALIZED_NAME_CONCURRENCY = "concurrency";
  @SerializedName(SERIALIZED_NAME_CONCURRENCY)
  private BigDecimal concurrency;

  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private OffsetDateTime startDate;

  public static final String SERIALIZED_NAME_DAG_RUN_TIMEOUT = "dag_run_timeout";
  @SerializedName(SERIALIZED_NAME_DAG_RUN_TIMEOUT)
  private TimeDelta dagRunTimeout;

  public static final String SERIALIZED_NAME_DOC_MD = "doc_md";
  @SerializedName(SERIALIZED_NAME_DOC_MD)
  private String docMd;

  public static final String SERIALIZED_NAME_DEFAULT_VIEW = "default_view";
  @SerializedName(SERIALIZED_NAME_DEFAULT_VIEW)
  private String defaultView;


  public DAGDetailAllOf timezone(String timezone) {
    
    this.timezone = timezone;
    return this;
  }

   /**
   * Get timezone
   * @return timezone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTimezone() {
    return timezone;
  }


  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }


   /**
   * Get catchup
   * @return catchup
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getCatchup() {
    return catchup;
  }




   /**
   * Get orientation
   * @return orientation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOrientation() {
    return orientation;
  }




   /**
   * Get concurrency
   * @return concurrency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getConcurrency() {
    return concurrency;
  }




   /**
   * Get startDate
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getStartDate() {
    return startDate;
  }




  public DAGDetailAllOf dagRunTimeout(TimeDelta dagRunTimeout) {
    
    this.dagRunTimeout = dagRunTimeout;
    return this;
  }

   /**
   * Get dagRunTimeout
   * @return dagRunTimeout
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TimeDelta getDagRunTimeout() {
    return dagRunTimeout;
  }


  public void setDagRunTimeout(TimeDelta dagRunTimeout) {
    this.dagRunTimeout = dagRunTimeout;
  }


   /**
   * Get docMd
   * @return docMd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDocMd() {
    return docMd;
  }




   /**
   * Get defaultView
   * @return defaultView
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDefaultView() {
    return defaultView;
  }




  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DAGDetailAllOf daGDetailAllOf = (DAGDetailAllOf) o;
    return Objects.equals(this.timezone, daGDetailAllOf.timezone) &&
        Objects.equals(this.catchup, daGDetailAllOf.catchup) &&
        Objects.equals(this.orientation, daGDetailAllOf.orientation) &&
        Objects.equals(this.concurrency, daGDetailAllOf.concurrency) &&
        Objects.equals(this.startDate, daGDetailAllOf.startDate) &&
        Objects.equals(this.dagRunTimeout, daGDetailAllOf.dagRunTimeout) &&
        Objects.equals(this.docMd, daGDetailAllOf.docMd) &&
        Objects.equals(this.defaultView, daGDetailAllOf.defaultView);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timezone, catchup, orientation, concurrency, startDate, dagRunTimeout, docMd, defaultView);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DAGDetailAllOf {\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    catchup: ").append(toIndentedString(catchup)).append("\n");
    sb.append("    orientation: ").append(toIndentedString(orientation)).append("\n");
    sb.append("    concurrency: ").append(toIndentedString(concurrency)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    dagRunTimeout: ").append(toIndentedString(dagRunTimeout)).append("\n");
    sb.append("    docMd: ").append(toIndentedString(docMd)).append("\n");
    sb.append("    defaultView: ").append(toIndentedString(defaultView)).append("\n");
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

