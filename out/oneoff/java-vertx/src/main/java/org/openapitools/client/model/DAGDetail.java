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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.DAG;
import org.openapitools.client.model.DAGDetailAllOf;
import org.openapitools.client.model.OneOfScheduleInterval;
import org.openapitools.client.model.Tag;
import org.openapitools.client.model.TimeDelta;
import org.threeten.bp.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * DAGDetail
 */
@JsonPropertyOrder({
  DAGDetail.JSON_PROPERTY_DAG_ID,
  DAGDetail.JSON_PROPERTY_ROOT_DAG_ID,
  DAGDetail.JSON_PROPERTY_IS_PAUSED,
  DAGDetail.JSON_PROPERTY_IS_SUBDAG,
  DAGDetail.JSON_PROPERTY_FILELOC,
  DAGDetail.JSON_PROPERTY_FILE_TOKEN,
  DAGDetail.JSON_PROPERTY_OWNERS,
  DAGDetail.JSON_PROPERTY_DESCRIPTION,
  DAGDetail.JSON_PROPERTY_SCHEDULE_INTERVAL,
  DAGDetail.JSON_PROPERTY_TAGS,
  DAGDetail.JSON_PROPERTY_TIMEZONE,
  DAGDetail.JSON_PROPERTY_CATCHUP,
  DAGDetail.JSON_PROPERTY_ORIENTATION,
  DAGDetail.JSON_PROPERTY_CONCURRENCY,
  DAGDetail.JSON_PROPERTY_START_DATE,
  DAGDetail.JSON_PROPERTY_DAG_RUN_TIMEOUT,
  DAGDetail.JSON_PROPERTY_DOC_MD,
  DAGDetail.JSON_PROPERTY_DEFAULT_VIEW
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-05-29T12:10:30.163Z[GMT]")
public class DAGDetail {
  public static final String JSON_PROPERTY_DAG_ID = "dag_id";
  private String dagId;

  public static final String JSON_PROPERTY_ROOT_DAG_ID = "root_dag_id";
  private String rootDagId;

  public static final String JSON_PROPERTY_IS_PAUSED = "is_paused";
  private Boolean isPaused;

  public static final String JSON_PROPERTY_IS_SUBDAG = "is_subdag";
  private Boolean isSubdag;

  public static final String JSON_PROPERTY_FILELOC = "fileloc";
  private String fileloc;

  public static final String JSON_PROPERTY_FILE_TOKEN = "file_token";
  private String fileToken;

  public static final String JSON_PROPERTY_OWNERS = "owners";
  private List<String> owners = null;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_SCHEDULE_INTERVAL = "schedule_interval";
  private OneOfScheduleInterval scheduleInterval = null;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<Tag> tags = null;

  public static final String JSON_PROPERTY_TIMEZONE = "timezone";
  private String timezone;

  public static final String JSON_PROPERTY_CATCHUP = "catchup";
  private Boolean catchup;

  public static final String JSON_PROPERTY_ORIENTATION = "orientation";
  private String orientation;

  public static final String JSON_PROPERTY_CONCURRENCY = "concurrency";
  private BigDecimal concurrency;

  public static final String JSON_PROPERTY_START_DATE = "start_date";
  private OffsetDateTime startDate;

  public static final String JSON_PROPERTY_DAG_RUN_TIMEOUT = "dag_run_timeout";
  private TimeDelta dagRunTimeout;

  public static final String JSON_PROPERTY_DOC_MD = "doc_md";
  private String docMd;

  public static final String JSON_PROPERTY_DEFAULT_VIEW = "default_view";
  private String defaultView;


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




   /**
   * Get rootDagId
   * @return rootDagId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ROOT_DAG_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRootDagId() {
    return rootDagId;
  }




  public DAGDetail isPaused(Boolean isPaused) {
    
    this.isPaused = isPaused;
    return this;
  }

   /**
   * Get isPaused
   * @return isPaused
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_PAUSED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsPaused() {
    return isPaused;
  }


  public void setIsPaused(Boolean isPaused) {
    this.isPaused = isPaused;
  }


   /**
   * Get isSubdag
   * @return isSubdag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_SUBDAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsSubdag() {
    return isSubdag;
  }




   /**
   * Get fileloc
   * @return fileloc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FILELOC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFileloc() {
    return fileloc;
  }




   /**
   * The key containing the encrypted path to the file. Encryption and decryption take place only on the server. This prevents the client from reading an non-DAG file. This also ensures API extensibility, because the format of encrypted data may change. 
   * @return fileToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The key containing the encrypted path to the file. Encryption and decryption take place only on the server. This prevents the client from reading an non-DAG file. This also ensures API extensibility, because the format of encrypted data may change. ")
  @JsonProperty(JSON_PROPERTY_FILE_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFileToken() {
    return fileToken;
  }




   /**
   * Get owners
   * @return owners
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OWNERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getOwners() {
    return owners;
  }




   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }




   /**
   * Get scheduleInterval
   * @return scheduleInterval
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SCHEDULE_INTERVAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OneOfScheduleInterval getScheduleInterval() {
    return scheduleInterval;
  }




   /**
   * Get tags
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Tag> getTags() {
    return tags;
  }




  public DAGDetail timezone(String timezone) {
    
    this.timezone = timezone;
    return this;
  }

   /**
   * Get timezone
   * @return timezone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TIMEZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

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
  @JsonProperty(JSON_PROPERTY_CATCHUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCatchup() {
    return catchup;
  }




   /**
   * Get orientation
   * @return orientation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ORIENTATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOrientation() {
    return orientation;
  }




   /**
   * Get concurrency
   * @return concurrency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONCURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getConcurrency() {
    return concurrency;
  }




   /**
   * Get startDate
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getStartDate() {
    return startDate;
  }




  public DAGDetail dagRunTimeout(TimeDelta dagRunTimeout) {
    
    this.dagRunTimeout = dagRunTimeout;
    return this;
  }

   /**
   * Get dagRunTimeout
   * @return dagRunTimeout
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DAG_RUN_TIMEOUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

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
  @JsonProperty(JSON_PROPERTY_DOC_MD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDocMd() {
    return docMd;
  }




   /**
   * Get defaultView
   * @return defaultView
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DEFAULT_VIEW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

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
    DAGDetail daGDetail = (DAGDetail) o;
    return Objects.equals(this.dagId, daGDetail.dagId) &&
        Objects.equals(this.rootDagId, daGDetail.rootDagId) &&
        Objects.equals(this.isPaused, daGDetail.isPaused) &&
        Objects.equals(this.isSubdag, daGDetail.isSubdag) &&
        Objects.equals(this.fileloc, daGDetail.fileloc) &&
        Objects.equals(this.fileToken, daGDetail.fileToken) &&
        Objects.equals(this.owners, daGDetail.owners) &&
        Objects.equals(this.description, daGDetail.description) &&
        Objects.equals(this.scheduleInterval, daGDetail.scheduleInterval) &&
        Objects.equals(this.tags, daGDetail.tags) &&
        Objects.equals(this.timezone, daGDetail.timezone) &&
        Objects.equals(this.catchup, daGDetail.catchup) &&
        Objects.equals(this.orientation, daGDetail.orientation) &&
        Objects.equals(this.concurrency, daGDetail.concurrency) &&
        Objects.equals(this.startDate, daGDetail.startDate) &&
        Objects.equals(this.dagRunTimeout, daGDetail.dagRunTimeout) &&
        Objects.equals(this.docMd, daGDetail.docMd) &&
        Objects.equals(this.defaultView, daGDetail.defaultView);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dagId, rootDagId, isPaused, isSubdag, fileloc, fileToken, owners, description, scheduleInterval, tags, timezone, catchup, orientation, concurrency, startDate, dagRunTimeout, docMd, defaultView);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DAGDetail {\n");
    sb.append("    dagId: ").append(toIndentedString(dagId)).append("\n");
    sb.append("    rootDagId: ").append(toIndentedString(rootDagId)).append("\n");
    sb.append("    isPaused: ").append(toIndentedString(isPaused)).append("\n");
    sb.append("    isSubdag: ").append(toIndentedString(isSubdag)).append("\n");
    sb.append("    fileloc: ").append(toIndentedString(fileloc)).append("\n");
    sb.append("    fileToken: ").append(toIndentedString(fileToken)).append("\n");
    sb.append("    owners: ").append(toIndentedString(owners)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    scheduleInterval: ").append(toIndentedString(scheduleInterval)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

