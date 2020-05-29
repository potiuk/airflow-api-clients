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
import org.openapitools.client.model.ClassReference;
import org.openapitools.client.model.DAG;
import org.openapitools.client.model.TaskExtraLinks;
import org.openapitools.client.model.TimeDelta;
import org.openapitools.client.model.TriggerRule;
import org.openapitools.client.model.WeightRule;
import org.threeten.bp.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Task
 */
@JsonPropertyOrder({
  Task.JSON_PROPERTY_CLASS_REF,
  Task.JSON_PROPERTY_TASK_ID,
  Task.JSON_PROPERTY_OWNER,
  Task.JSON_PROPERTY_START_DATE,
  Task.JSON_PROPERTY_END_DATE,
  Task.JSON_PROPERTY_TRIGGER_RULE,
  Task.JSON_PROPERTY_EXTRA_LINKS,
  Task.JSON_PROPERTY_DEPENDS_ON_PAST,
  Task.JSON_PROPERTY_WAIT_FOR_DOWNSTREAM,
  Task.JSON_PROPERTY_RETRIES,
  Task.JSON_PROPERTY_QUEUE,
  Task.JSON_PROPERTY_POOL,
  Task.JSON_PROPERTY_POOL_SLOTS,
  Task.JSON_PROPERTY_EXECUTION_TIMEOUT,
  Task.JSON_PROPERTY_RETRY_DELAY,
  Task.JSON_PROPERTY_RETRY_EXPONENTIAL_BACKOFF,
  Task.JSON_PROPERTY_PRIORITY_WEIGHT,
  Task.JSON_PROPERTY_WEIGHT_RULE,
  Task.JSON_PROPERTY_UI_COLOR,
  Task.JSON_PROPERTY_UI_FGCOLOR,
  Task.JSON_PROPERTY_TEMPLATE_FIELDS,
  Task.JSON_PROPERTY_SUB_DAG,
  Task.JSON_PROPERTY_DOWNSTREAM_TASK_IDS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-05-29T12:06:30.200Z[GMT]")
public class Task {
  public static final String JSON_PROPERTY_CLASS_REF = "class_ref";
  private ClassReference classRef;

  public static final String JSON_PROPERTY_TASK_ID = "task_id";
  private String taskId;

  public static final String JSON_PROPERTY_OWNER = "owner";
  private String owner;

  public static final String JSON_PROPERTY_START_DATE = "start_date";
  private OffsetDateTime startDate;

  public static final String JSON_PROPERTY_END_DATE = "end_date";
  private OffsetDateTime endDate;

  public static final String JSON_PROPERTY_TRIGGER_RULE = "trigger_rule";
  private TriggerRule triggerRule;

  public static final String JSON_PROPERTY_EXTRA_LINKS = "extra_links";
  private List<TaskExtraLinks> extraLinks = null;

  public static final String JSON_PROPERTY_DEPENDS_ON_PAST = "depends_on_past";
  private Boolean dependsOnPast;

  public static final String JSON_PROPERTY_WAIT_FOR_DOWNSTREAM = "wait_for_downstream";
  private Boolean waitForDownstream;

  public static final String JSON_PROPERTY_RETRIES = "retries";
  private BigDecimal retries;

  public static final String JSON_PROPERTY_QUEUE = "queue";
  private String queue;

  public static final String JSON_PROPERTY_POOL = "pool";
  private String pool;

  public static final String JSON_PROPERTY_POOL_SLOTS = "pool_slots";
  private BigDecimal poolSlots;

  public static final String JSON_PROPERTY_EXECUTION_TIMEOUT = "execution_timeout";
  private TimeDelta executionTimeout;

  public static final String JSON_PROPERTY_RETRY_DELAY = "retry_delay";
  private TimeDelta retryDelay;

  public static final String JSON_PROPERTY_RETRY_EXPONENTIAL_BACKOFF = "retry_exponential_backoff";
  private Boolean retryExponentialBackoff;

  public static final String JSON_PROPERTY_PRIORITY_WEIGHT = "priority_weight";
  private BigDecimal priorityWeight;

  public static final String JSON_PROPERTY_WEIGHT_RULE = "weight_rule";
  private WeightRule weightRule;

  public static final String JSON_PROPERTY_UI_COLOR = "ui_color";
  private String uiColor;

  public static final String JSON_PROPERTY_UI_FGCOLOR = "ui_fgcolor";
  private String uiFgcolor;

  public static final String JSON_PROPERTY_TEMPLATE_FIELDS = "template_fields";
  private List<String> templateFields = null;

  public static final String JSON_PROPERTY_SUB_DAG = "sub_dag";
  private DAG subDag;

  public static final String JSON_PROPERTY_DOWNSTREAM_TASK_IDS = "downstream_task_ids";
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
  @JsonProperty(JSON_PROPERTY_CLASS_REF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

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
  @JsonProperty(JSON_PROPERTY_TASK_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTaskId() {
    return taskId;
  }




   /**
   * Get owner
   * @return owner
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OWNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOwner() {
    return owner;
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




   /**
   * Get endDate
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

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
  @JsonProperty(JSON_PROPERTY_TRIGGER_RULE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

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
  @JsonProperty(JSON_PROPERTY_EXTRA_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TaskExtraLinks> getExtraLinks() {
    return extraLinks;
  }




   /**
   * Get dependsOnPast
   * @return dependsOnPast
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DEPENDS_ON_PAST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDependsOnPast() {
    return dependsOnPast;
  }




   /**
   * Get waitForDownstream
   * @return waitForDownstream
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_WAIT_FOR_DOWNSTREAM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getWaitForDownstream() {
    return waitForDownstream;
  }




   /**
   * Get retries
   * @return retries
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RETRIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getRetries() {
    return retries;
  }




   /**
   * Get queue
   * @return queue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_QUEUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getQueue() {
    return queue;
  }




   /**
   * Get pool
   * @return pool
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_POOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPool() {
    return pool;
  }




   /**
   * Get poolSlots
   * @return poolSlots
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_POOL_SLOTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

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
  @JsonProperty(JSON_PROPERTY_EXECUTION_TIMEOUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

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
  @JsonProperty(JSON_PROPERTY_RETRY_DELAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

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
  @JsonProperty(JSON_PROPERTY_RETRY_EXPONENTIAL_BACKOFF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getRetryExponentialBackoff() {
    return retryExponentialBackoff;
  }




   /**
   * Get priorityWeight
   * @return priorityWeight
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PRIORITY_WEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

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
  @JsonProperty(JSON_PROPERTY_WEIGHT_RULE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

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
  @JsonProperty(JSON_PROPERTY_UI_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

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
  @JsonProperty(JSON_PROPERTY_UI_FGCOLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

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
  @JsonProperty(JSON_PROPERTY_TEMPLATE_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

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
  @JsonProperty(JSON_PROPERTY_SUB_DAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

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
  @JsonProperty(JSON_PROPERTY_DOWNSTREAM_TASK_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

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
