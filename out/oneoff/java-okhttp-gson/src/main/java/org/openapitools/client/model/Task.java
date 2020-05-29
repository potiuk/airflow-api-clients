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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.ClassReference;
import org.openapitools.client.model.DAG;
import org.openapitools.client.model.TaskExtraLinks;
import org.openapitools.client.model.TimeDelta;
import org.openapitools.client.model.TriggerRule;
import org.openapitools.client.model.WeightRule;
import org.threeten.bp.OffsetDateTime;

/**
 * Task
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-05-29T12:09:26.121Z[GMT]")
public class Task {
  public static final String SERIALIZED_NAME_CLASS_REF = "class_ref";
  @SerializedName(SERIALIZED_NAME_CLASS_REF)
  private ClassReference classRef;

  public static final String SERIALIZED_NAME_TASK_ID = "task_id";
  @SerializedName(SERIALIZED_NAME_TASK_ID)
  private String taskId;

  public static final String SERIALIZED_NAME_OWNER = "owner";
  @SerializedName(SERIALIZED_NAME_OWNER)
  private String owner;

  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private OffsetDateTime startDate;

  public static final String SERIALIZED_NAME_END_DATE = "end_date";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private OffsetDateTime endDate;

  public static final String SERIALIZED_NAME_TRIGGER_RULE = "trigger_rule";
  @SerializedName(SERIALIZED_NAME_TRIGGER_RULE)
  private TriggerRule triggerRule;

  public static final String SERIALIZED_NAME_EXTRA_LINKS = "extra_links";
  @SerializedName(SERIALIZED_NAME_EXTRA_LINKS)
  private List<TaskExtraLinks> extraLinks = null;

  public static final String SERIALIZED_NAME_DEPENDS_ON_PAST = "depends_on_past";
  @SerializedName(SERIALIZED_NAME_DEPENDS_ON_PAST)
  private Boolean dependsOnPast;

  public static final String SERIALIZED_NAME_WAIT_FOR_DOWNSTREAM = "wait_for_downstream";
  @SerializedName(SERIALIZED_NAME_WAIT_FOR_DOWNSTREAM)
  private Boolean waitForDownstream;

  public static final String SERIALIZED_NAME_RETRIES = "retries";
  @SerializedName(SERIALIZED_NAME_RETRIES)
  private BigDecimal retries;

  public static final String SERIALIZED_NAME_QUEUE = "queue";
  @SerializedName(SERIALIZED_NAME_QUEUE)
  private String queue;

  public static final String SERIALIZED_NAME_POOL = "pool";
  @SerializedName(SERIALIZED_NAME_POOL)
  private String pool;

  public static final String SERIALIZED_NAME_POOL_SLOTS = "pool_slots";
  @SerializedName(SERIALIZED_NAME_POOL_SLOTS)
  private BigDecimal poolSlots;

  public static final String SERIALIZED_NAME_EXECUTION_TIMEOUT = "execution_timeout";
  @SerializedName(SERIALIZED_NAME_EXECUTION_TIMEOUT)
  private TimeDelta executionTimeout;

  public static final String SERIALIZED_NAME_RETRY_DELAY = "retry_delay";
  @SerializedName(SERIALIZED_NAME_RETRY_DELAY)
  private TimeDelta retryDelay;

  public static final String SERIALIZED_NAME_RETRY_EXPONENTIAL_BACKOFF = "retry_exponential_backoff";
  @SerializedName(SERIALIZED_NAME_RETRY_EXPONENTIAL_BACKOFF)
  private Boolean retryExponentialBackoff;

  public static final String SERIALIZED_NAME_PRIORITY_WEIGHT = "priority_weight";
  @SerializedName(SERIALIZED_NAME_PRIORITY_WEIGHT)
  private BigDecimal priorityWeight;

  public static final String SERIALIZED_NAME_WEIGHT_RULE = "weight_rule";
  @SerializedName(SERIALIZED_NAME_WEIGHT_RULE)
  private WeightRule weightRule;

  public static final String SERIALIZED_NAME_UI_COLOR = "ui_color";
  @SerializedName(SERIALIZED_NAME_UI_COLOR)
  private String uiColor;

  public static final String SERIALIZED_NAME_UI_FGCOLOR = "ui_fgcolor";
  @SerializedName(SERIALIZED_NAME_UI_FGCOLOR)
  private String uiFgcolor;

  public static final String SERIALIZED_NAME_TEMPLATE_FIELDS = "template_fields";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_FIELDS)
  private List<String> templateFields = null;

  public static final String SERIALIZED_NAME_SUB_DAG = "sub_dag";
  @SerializedName(SERIALIZED_NAME_SUB_DAG)
  private DAG subDag;

  public static final String SERIALIZED_NAME_DOWNSTREAM_TASK_IDS = "downstream_task_ids";
  @SerializedName(SERIALIZED_NAME_DOWNSTREAM_TASK_IDS)
  private List<String> downstreamTaskIds = null;


  public Task classRef(ClassReference classRef) {
    
    this.classRef = classRef;
    return this;
  }

   /**
   * Get classRef
   * @return classRef
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ClassReference getClassRef() {
    return classRef;
  }


  public void setClassRef(ClassReference classRef) {
    this.classRef = classRef;
  }


   /**
   * Get taskId
   * @return taskId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTaskId() {
    return taskId;
  }




   /**
   * Get owner
   * @return owner
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOwner() {
    return owner;
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




   /**
   * Get endDate
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getEndDate() {
    return endDate;
  }




  public Task triggerRule(TriggerRule triggerRule) {
    
    this.triggerRule = triggerRule;
    return this;
  }

   /**
   * Get triggerRule
   * @return triggerRule
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TriggerRule getTriggerRule() {
    return triggerRule;
  }


  public void setTriggerRule(TriggerRule triggerRule) {
    this.triggerRule = triggerRule;
  }


   /**
   * Get extraLinks
   * @return extraLinks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<TaskExtraLinks> getExtraLinks() {
    return extraLinks;
  }




   /**
   * Get dependsOnPast
   * @return dependsOnPast
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getDependsOnPast() {
    return dependsOnPast;
  }




   /**
   * Get waitForDownstream
   * @return waitForDownstream
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getWaitForDownstream() {
    return waitForDownstream;
  }




   /**
   * Get retries
   * @return retries
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getRetries() {
    return retries;
  }




   /**
   * Get queue
   * @return queue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getQueue() {
    return queue;
  }




   /**
   * Get pool
   * @return pool
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPool() {
    return pool;
  }




   /**
   * Get poolSlots
   * @return poolSlots
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getPoolSlots() {
    return poolSlots;
  }




  public Task executionTimeout(TimeDelta executionTimeout) {
    
    this.executionTimeout = executionTimeout;
    return this;
  }

   /**
   * Get executionTimeout
   * @return executionTimeout
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TimeDelta getExecutionTimeout() {
    return executionTimeout;
  }


  public void setExecutionTimeout(TimeDelta executionTimeout) {
    this.executionTimeout = executionTimeout;
  }


  public Task retryDelay(TimeDelta retryDelay) {
    
    this.retryDelay = retryDelay;
    return this;
  }

   /**
   * Get retryDelay
   * @return retryDelay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TimeDelta getRetryDelay() {
    return retryDelay;
  }


  public void setRetryDelay(TimeDelta retryDelay) {
    this.retryDelay = retryDelay;
  }


   /**
   * Get retryExponentialBackoff
   * @return retryExponentialBackoff
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getRetryExponentialBackoff() {
    return retryExponentialBackoff;
  }




   /**
   * Get priorityWeight
   * @return priorityWeight
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getPriorityWeight() {
    return priorityWeight;
  }




  public Task weightRule(WeightRule weightRule) {
    
    this.weightRule = weightRule;
    return this;
  }

   /**
   * Get weightRule
   * @return weightRule
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public WeightRule getWeightRule() {
    return weightRule;
  }


  public void setWeightRule(WeightRule weightRule) {
    this.weightRule = weightRule;
  }


  public Task uiColor(String uiColor) {
    
    this.uiColor = uiColor;
    return this;
  }

   /**
   * Get uiColor
   * @return uiColor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUiColor() {
    return uiColor;
  }


  public void setUiColor(String uiColor) {
    this.uiColor = uiColor;
  }


  public Task uiFgcolor(String uiFgcolor) {
    
    this.uiFgcolor = uiFgcolor;
    return this;
  }

   /**
   * Get uiFgcolor
   * @return uiFgcolor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUiFgcolor() {
    return uiFgcolor;
  }


  public void setUiFgcolor(String uiFgcolor) {
    this.uiFgcolor = uiFgcolor;
  }


   /**
   * Get templateFields
   * @return templateFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getTemplateFields() {
    return templateFields;
  }




  public Task subDag(DAG subDag) {
    
    this.subDag = subDag;
    return this;
  }

   /**
   * Get subDag
   * @return subDag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DAG getSubDag() {
    return subDag;
  }


  public void setSubDag(DAG subDag) {
    this.subDag = subDag;
  }


   /**
   * Get downstreamTaskIds
   * @return downstreamTaskIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getDownstreamTaskIds() {
    return downstreamTaskIds;
  }




  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Task task = (Task) o;
    return Objects.equals(this.classRef, task.classRef) &&
        Objects.equals(this.taskId, task.taskId) &&
        Objects.equals(this.owner, task.owner) &&
        Objects.equals(this.startDate, task.startDate) &&
        Objects.equals(this.endDate, task.endDate) &&
        Objects.equals(this.triggerRule, task.triggerRule) &&
        Objects.equals(this.extraLinks, task.extraLinks) &&
        Objects.equals(this.dependsOnPast, task.dependsOnPast) &&
        Objects.equals(this.waitForDownstream, task.waitForDownstream) &&
        Objects.equals(this.retries, task.retries) &&
        Objects.equals(this.queue, task.queue) &&
        Objects.equals(this.pool, task.pool) &&
        Objects.equals(this.poolSlots, task.poolSlots) &&
        Objects.equals(this.executionTimeout, task.executionTimeout) &&
        Objects.equals(this.retryDelay, task.retryDelay) &&
        Objects.equals(this.retryExponentialBackoff, task.retryExponentialBackoff) &&
        Objects.equals(this.priorityWeight, task.priorityWeight) &&
        Objects.equals(this.weightRule, task.weightRule) &&
        Objects.equals(this.uiColor, task.uiColor) &&
        Objects.equals(this.uiFgcolor, task.uiFgcolor) &&
        Objects.equals(this.templateFields, task.templateFields) &&
        Objects.equals(this.subDag, task.subDag) &&
        Objects.equals(this.downstreamTaskIds, task.downstreamTaskIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(classRef, taskId, owner, startDate, endDate, triggerRule, extraLinks, dependsOnPast, waitForDownstream, retries, queue, pool, poolSlots, executionTimeout, retryDelay, retryExponentialBackoff, priorityWeight, weightRule, uiColor, uiFgcolor, templateFields, subDag, downstreamTaskIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Task {\n");
    sb.append("    classRef: ").append(toIndentedString(classRef)).append("\n");
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    triggerRule: ").append(toIndentedString(triggerRule)).append("\n");
    sb.append("    extraLinks: ").append(toIndentedString(extraLinks)).append("\n");
    sb.append("    dependsOnPast: ").append(toIndentedString(dependsOnPast)).append("\n");
    sb.append("    waitForDownstream: ").append(toIndentedString(waitForDownstream)).append("\n");
    sb.append("    retries: ").append(toIndentedString(retries)).append("\n");
    sb.append("    queue: ").append(toIndentedString(queue)).append("\n");
    sb.append("    pool: ").append(toIndentedString(pool)).append("\n");
    sb.append("    poolSlots: ").append(toIndentedString(poolSlots)).append("\n");
    sb.append("    executionTimeout: ").append(toIndentedString(executionTimeout)).append("\n");
    sb.append("    retryDelay: ").append(toIndentedString(retryDelay)).append("\n");
    sb.append("    retryExponentialBackoff: ").append(toIndentedString(retryExponentialBackoff)).append("\n");
    sb.append("    priorityWeight: ").append(toIndentedString(priorityWeight)).append("\n");
    sb.append("    weightRule: ").append(toIndentedString(weightRule)).append("\n");
    sb.append("    uiColor: ").append(toIndentedString(uiColor)).append("\n");
    sb.append("    uiFgcolor: ").append(toIndentedString(uiFgcolor)).append("\n");
    sb.append("    templateFields: ").append(toIndentedString(templateFields)).append("\n");
    sb.append("    subDag: ").append(toIndentedString(subDag)).append("\n");
    sb.append("    downstreamTaskIds: ").append(toIndentedString(downstreamTaskIds)).append("\n");
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

