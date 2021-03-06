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


import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.json.bind.annotation.JsonbProperty;

public class TimeDelta  {
  
  private String type;

  private Integer days;

  private Integer seconds;

  private Integer microsecond;
  
 /**
   * Get type
   * @return type
  **/
  @JsonbProperty("__type")
  public String getType() {
    return type;
  }

  /**
    * Set type
  **/
  public void setType(String type) {
    this.type = type;
  }

  public TimeDelta type(String type) {
    this.type = type;
    return this;
  }

 /**
   * Get days
   * @return days
  **/
  @JsonbProperty("days")
  public Integer getDays() {
    return days;
  }

  /**
    * Set days
  **/
  public void setDays(Integer days) {
    this.days = days;
  }

  public TimeDelta days(Integer days) {
    this.days = days;
    return this;
  }

 /**
   * Get seconds
   * @return seconds
  **/
  @JsonbProperty("seconds")
  public Integer getSeconds() {
    return seconds;
  }

  /**
    * Set seconds
  **/
  public void setSeconds(Integer seconds) {
    this.seconds = seconds;
  }

  public TimeDelta seconds(Integer seconds) {
    this.seconds = seconds;
    return this;
  }

 /**
   * Get microsecond
   * @return microsecond
  **/
  @JsonbProperty("microsecond")
  public Integer getMicrosecond() {
    return microsecond;
  }

  /**
    * Set microsecond
  **/
  public void setMicrosecond(Integer microsecond) {
    this.microsecond = microsecond;
  }

  public TimeDelta microsecond(Integer microsecond) {
    this.microsecond = microsecond;
    return this;
  }


  /**
    * Create a string representation of this pojo.
  **/
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeDelta {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    days: ").append(toIndentedString(days)).append("\n");
    sb.append("    seconds: ").append(toIndentedString(seconds)).append("\n");
    sb.append("    microsecond: ").append(toIndentedString(microsecond)).append("\n");
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

