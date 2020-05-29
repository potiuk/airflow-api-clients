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

import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.TaskInstanceReference;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.json.bind.annotation.JsonbProperty;

public class TaskInstanceReferenceCollection  {
  
  private List<TaskInstanceReference> taskInstances = null;
  
 /**
   * Get taskInstances
   * @return taskInstances
  **/
  @JsonbProperty("task_instances")
  public List<TaskInstanceReference> getTaskInstances() {
    return taskInstances;
  }

  /**
    * Set taskInstances
  **/
  public void setTaskInstances(List<TaskInstanceReference> taskInstances) {
    this.taskInstances = taskInstances;
  }

  public TaskInstanceReferenceCollection taskInstances(List<TaskInstanceReference> taskInstances) {
    this.taskInstances = taskInstances;
    return this;
  }

  public TaskInstanceReferenceCollection addTaskInstancesItem(TaskInstanceReference taskInstancesItem) {
    this.taskInstances.add(taskInstancesItem);
    return this;
  }


  /**
    * Create a string representation of this pojo.
  **/
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

