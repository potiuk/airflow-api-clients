/**
 * Airflow API (Stable)
 * Apache Airflow management API.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: dev@airflow.apache.org
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.openapitools.client.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.openapitools.client.model.ClassReference;
import org.openapitools.client.model.DAG;
import org.openapitools.client.model.TaskExtraLinks;
import org.openapitools.client.model.TimeDelta;
import org.openapitools.client.model.TriggerRule;
import org.openapitools.client.model.WeightRule;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.json.bind.annotation.JsonbProperty;

public class Task  {
  
  private ClassReference classRef;

  private String taskId;

  private String owner;

  private Date startDate;

  private Date endDate;

  private TriggerRule triggerRule;

  private List<TaskExtraLinks> extraLinks = null;

  private Boolean dependsOnPast;

  private Boolean waitForDownstream;

  private BigDecimal retries;

  private String queue;

  private String pool;

  private BigDecimal poolSlots;

  private TimeDelta executionTimeout;

  private TimeDelta retryDelay;

  private Boolean retryExponentialBackoff;

  private BigDecimal priorityWeight;

  private WeightRule weightRule;

  private String uiColor;

  private String uiFgcolor;

  private List<String> templateFields = null;

  private DAG subDag;

  private List<String> downstreamTaskIds = null;
  
 /**
   * Get classRef
   * @return classRef
  **/
  @JsonbProperty("class_ref")
  public ClassReference getClassRef() {
    return classRef;
  }

  /**
    * Set classRef
  **/
  public void setClassRef(ClassReference classRef) {
    this.classRef = classRef;
  }

  public Task classRef(ClassReference classRef) {
    this.classRef = classRef;
    return this;
  }

 /**
   * Get taskId
   * @return taskId
  **/
  @JsonbProperty("task_id")
  public String getTaskId() {
    return taskId;
  }


 /**
   * Get owner
   * @return owner
  **/
  @JsonbProperty("owner")
  public String getOwner() {
    return owner;
  }


 /**
   * Get startDate
   * @return startDate
  **/
  @JsonbProperty("start_date")
  public Date getStartDate() {
    return startDate;
  }


 /**
   * Get endDate
   * @return endDate
  **/
  @JsonbProperty("end_date")
  public Date getEndDate() {
    return endDate;
  }


 /**
   * Get triggerRule
   * @return triggerRule
  **/
  @JsonbProperty("trigger_rule")
  public TriggerRule getTriggerRule() {
    return triggerRule;
  }

  /**
    * Set triggerRule
  **/
  public void setTriggerRule(TriggerRule triggerRule) {
    this.triggerRule = triggerRule;
  }

  public Task triggerRule(TriggerRule triggerRule) {
    this.triggerRule = triggerRule;
    return this;
  }

 /**
   * Get extraLinks
   * @return extraLinks
  **/
  @JsonbProperty("extra_links")
  public List<TaskExtraLinks> getExtraLinks() {
    return extraLinks;
  }


 /**
   * Get dependsOnPast
   * @return dependsOnPast
  **/
  @JsonbProperty("depends_on_past")
  public Boolean getDependsOnPast() {
    return dependsOnPast;
  }


 /**
   * Get waitForDownstream
   * @return waitForDownstream
  **/
  @JsonbProperty("wait_for_downstream")
  public Boolean getWaitForDownstream() {
    return waitForDownstream;
  }


 /**
   * Get retries
   * @return retries
  **/
  @JsonbProperty("retries")
  public BigDecimal getRetries() {
    return retries;
  }


 /**
   * Get queue
   * @return queue
  **/
  @JsonbProperty("queue")
  public String getQueue() {
    return queue;
  }


 /**
   * Get pool
   * @return pool
  **/
  @JsonbProperty("pool")
  public String getPool() {
    return pool;
  }


 /**
   * Get poolSlots
   * @return poolSlots
  **/
  @JsonbProperty("pool_slots")
  public BigDecimal getPoolSlots() {
    return poolSlots;
  }


 /**
   * Get executionTimeout
   * @return executionTimeout
  **/
  @JsonbProperty("execution_timeout")
  public TimeDelta getExecutionTimeout() {
    return executionTimeout;
  }

  /**
    * Set executionTimeout
  **/
  public void setExecutionTimeout(TimeDelta executionTimeout) {
    this.executionTimeout = executionTimeout;
  }

  public Task executionTimeout(TimeDelta executionTimeout) {
    this.executionTimeout = executionTimeout;
    return this;
  }

 /**
   * Get retryDelay
   * @return retryDelay
  **/
  @JsonbProperty("retry_delay")
  public TimeDelta getRetryDelay() {
    return retryDelay;
  }

  /**
    * Set retryDelay
  **/
  public void setRetryDelay(TimeDelta retryDelay) {
    this.retryDelay = retryDelay;
  }

  public Task retryDelay(TimeDelta retryDelay) {
    this.retryDelay = retryDelay;
    return this;
  }

 /**
   * Get retryExponentialBackoff
   * @return retryExponentialBackoff
  **/
  @JsonbProperty("retry_exponential_backoff")
  public Boolean getRetryExponentialBackoff() {
    return retryExponentialBackoff;
  }


 /**
   * Get priorityWeight
   * @return priorityWeight
  **/
  @JsonbProperty("priority_weight")
  public BigDecimal getPriorityWeight() {
    return priorityWeight;
  }


 /**
   * Get weightRule
   * @return weightRule
  **/
  @JsonbProperty("weight_rule")
  public WeightRule getWeightRule() {
    return weightRule;
  }

  /**
    * Set weightRule
  **/
  public void setWeightRule(WeightRule weightRule) {
    this.weightRule = weightRule;
  }

  public Task weightRule(WeightRule weightRule) {
    this.weightRule = weightRule;
    return this;
  }

 /**
   * Get uiColor
   * @return uiColor
  **/
  @JsonbProperty("ui_color")
  public String getUiColor() {
    return uiColor;
  }

  /**
    * Set uiColor
  **/
  public void setUiColor(String uiColor) {
    this.uiColor = uiColor;
  }

  public Task uiColor(String uiColor) {
    this.uiColor = uiColor;
    return this;
  }

 /**
   * Get uiFgcolor
   * @return uiFgcolor
  **/
  @JsonbProperty("ui_fgcolor")
  public String getUiFgcolor() {
    return uiFgcolor;
  }

  /**
    * Set uiFgcolor
  **/
  public void setUiFgcolor(String uiFgcolor) {
    this.uiFgcolor = uiFgcolor;
  }

  public Task uiFgcolor(String uiFgcolor) {
    this.uiFgcolor = uiFgcolor;
    return this;
  }

 /**
   * Get templateFields
   * @return templateFields
  **/
  @JsonbProperty("template_fields")
  public List<String> getTemplateFields() {
    return templateFields;
  }


 /**
   * Get subDag
   * @return subDag
  **/
  @JsonbProperty("sub_dag")
  public DAG getSubDag() {
    return subDag;
  }

  /**
    * Set subDag
  **/
  public void setSubDag(DAG subDag) {
    this.subDag = subDag;
  }

  public Task subDag(DAG subDag) {
    this.subDag = subDag;
    return this;
  }

 /**
   * Get downstreamTaskIds
   * @return downstreamTaskIds
  **/
  @JsonbProperty("downstream_task_ids")
  public List<String> getDownstreamTaskIds() {
    return downstreamTaskIds;
  }



  /**
    * Create a string representation of this pojo.
  **/
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

