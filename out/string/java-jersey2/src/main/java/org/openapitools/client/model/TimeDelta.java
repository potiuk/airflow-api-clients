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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * TimeDelta
 */
@JsonPropertyOrder({
  TimeDelta.JSON_PROPERTY_TYPE,
  TimeDelta.JSON_PROPERTY_DAYS,
  TimeDelta.JSON_PROPERTY_SECONDS,
  TimeDelta.JSON_PROPERTY_MICROSECOND
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-05-31T07:37:07.361Z[GMT]")
public class TimeDelta {
  public static final String JSON_PROPERTY_TYPE = "__type";
  private String type;

  public static final String JSON_PROPERTY_DAYS = "days";
  private Integer days;

  public static final String JSON_PROPERTY_SECONDS = "seconds";
  private Integer seconds;

  public static final String JSON_PROPERTY_MICROSECOND = "microsecond";
  private Integer microsecond;


  public TimeDelta type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public TimeDelta days(Integer days) {
    
    this.days = days;
    return this;
  }

   /**
   * Get days
   * @return days
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DAYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getDays() {
    return days;
  }


  public void setDays(Integer days) {
    this.days = days;
  }


  public TimeDelta seconds(Integer seconds) {
    
    this.seconds = seconds;
    return this;
  }

   /**
   * Get seconds
   * @return seconds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SECONDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getSeconds() {
    return seconds;
  }


  public void setSeconds(Integer seconds) {
    this.seconds = seconds;
  }


  public TimeDelta microsecond(Integer microsecond) {
    
    this.microsecond = microsecond;
    return this;
  }

   /**
   * Get microsecond
   * @return microsecond
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MICROSECOND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMicrosecond() {
    return microsecond;
  }


  public void setMicrosecond(Integer microsecond) {
    this.microsecond = microsecond;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeDelta timeDelta = (TimeDelta) o;
    return Objects.equals(this.type, timeDelta.type) &&
        Objects.equals(this.days, timeDelta.days) &&
        Objects.equals(this.seconds, timeDelta.seconds) &&
        Objects.equals(this.microsecond, timeDelta.microsecond);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, days, seconds, microsecond);
  }


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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

