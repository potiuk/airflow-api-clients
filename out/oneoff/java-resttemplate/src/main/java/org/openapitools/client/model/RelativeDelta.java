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
 * RelativeDelta
 */
@JsonPropertyOrder({
  RelativeDelta.JSON_PROPERTY_TYPE,
  RelativeDelta.JSON_PROPERTY_YEARS,
  RelativeDelta.JSON_PROPERTY_MONTHS,
  RelativeDelta.JSON_PROPERTY_DAYS,
  RelativeDelta.JSON_PROPERTY_LEAPDAYS,
  RelativeDelta.JSON_PROPERTY_HOURS,
  RelativeDelta.JSON_PROPERTY_MINUTES,
  RelativeDelta.JSON_PROPERTY_SECONDS,
  RelativeDelta.JSON_PROPERTY_MICROSECONDS,
  RelativeDelta.JSON_PROPERTY_YEAR,
  RelativeDelta.JSON_PROPERTY_MONTH,
  RelativeDelta.JSON_PROPERTY_DAY,
  RelativeDelta.JSON_PROPERTY_HOUR,
  RelativeDelta.JSON_PROPERTY_MINUTE,
  RelativeDelta.JSON_PROPERTY_SECOND,
  RelativeDelta.JSON_PROPERTY_MICROSECOND
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-05-29T12:09:53.101Z[GMT]")
public class RelativeDelta {
  public static final String JSON_PROPERTY_TYPE = "__type";
  private String type;

  public static final String JSON_PROPERTY_YEARS = "years";
  private Integer years;

  public static final String JSON_PROPERTY_MONTHS = "months";
  private Integer months;

  public static final String JSON_PROPERTY_DAYS = "days";
  private Integer days;

  public static final String JSON_PROPERTY_LEAPDAYS = "leapdays";
  private Integer leapdays;

  public static final String JSON_PROPERTY_HOURS = "hours";
  private Integer hours;

  public static final String JSON_PROPERTY_MINUTES = "minutes";
  private Integer minutes;

  public static final String JSON_PROPERTY_SECONDS = "seconds";
  private Integer seconds;

  public static final String JSON_PROPERTY_MICROSECONDS = "microseconds";
  private Integer microseconds;

  public static final String JSON_PROPERTY_YEAR = "year";
  private Integer year;

  public static final String JSON_PROPERTY_MONTH = "month";
  private Integer month;

  public static final String JSON_PROPERTY_DAY = "day";
  private Integer day;

  public static final String JSON_PROPERTY_HOUR = "hour";
  private Integer hour;

  public static final String JSON_PROPERTY_MINUTE = "minute";
  private Integer minute;

  public static final String JSON_PROPERTY_SECOND = "second";
  private Integer second;

  public static final String JSON_PROPERTY_MICROSECOND = "microsecond";
  private Integer microsecond;


  public RelativeDelta type(String type) {
    
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


  public RelativeDelta years(Integer years) {
    
    this.years = years;
    return this;
  }

   /**
   * Get years
   * @return years
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_YEARS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getYears() {
    return years;
  }


  public void setYears(Integer years) {
    this.years = years;
  }


  public RelativeDelta months(Integer months) {
    
    this.months = months;
    return this;
  }

   /**
   * Get months
   * @return months
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MONTHS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMonths() {
    return months;
  }


  public void setMonths(Integer months) {
    this.months = months;
  }


  public RelativeDelta days(Integer days) {
    
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


  public RelativeDelta leapdays(Integer leapdays) {
    
    this.leapdays = leapdays;
    return this;
  }

   /**
   * Get leapdays
   * @return leapdays
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LEAPDAYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getLeapdays() {
    return leapdays;
  }


  public void setLeapdays(Integer leapdays) {
    this.leapdays = leapdays;
  }


  public RelativeDelta hours(Integer hours) {
    
    this.hours = hours;
    return this;
  }

   /**
   * Get hours
   * @return hours
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_HOURS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getHours() {
    return hours;
  }


  public void setHours(Integer hours) {
    this.hours = hours;
  }


  public RelativeDelta minutes(Integer minutes) {
    
    this.minutes = minutes;
    return this;
  }

   /**
   * Get minutes
   * @return minutes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MINUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMinutes() {
    return minutes;
  }


  public void setMinutes(Integer minutes) {
    this.minutes = minutes;
  }


  public RelativeDelta seconds(Integer seconds) {
    
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


  public RelativeDelta microseconds(Integer microseconds) {
    
    this.microseconds = microseconds;
    return this;
  }

   /**
   * Get microseconds
   * @return microseconds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MICROSECONDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMicroseconds() {
    return microseconds;
  }


  public void setMicroseconds(Integer microseconds) {
    this.microseconds = microseconds;
  }


  public RelativeDelta year(Integer year) {
    
    this.year = year;
    return this;
  }

   /**
   * Get year
   * @return year
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_YEAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getYear() {
    return year;
  }


  public void setYear(Integer year) {
    this.year = year;
  }


  public RelativeDelta month(Integer month) {
    
    this.month = month;
    return this;
  }

   /**
   * Get month
   * @return month
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MONTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMonth() {
    return month;
  }


  public void setMonth(Integer month) {
    this.month = month;
  }


  public RelativeDelta day(Integer day) {
    
    this.day = day;
    return this;
  }

   /**
   * Get day
   * @return day
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getDay() {
    return day;
  }


  public void setDay(Integer day) {
    this.day = day;
  }


  public RelativeDelta hour(Integer hour) {
    
    this.hour = hour;
    return this;
  }

   /**
   * Get hour
   * @return hour
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_HOUR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getHour() {
    return hour;
  }


  public void setHour(Integer hour) {
    this.hour = hour;
  }


  public RelativeDelta minute(Integer minute) {
    
    this.minute = minute;
    return this;
  }

   /**
   * Get minute
   * @return minute
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MINUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMinute() {
    return minute;
  }


  public void setMinute(Integer minute) {
    this.minute = minute;
  }


  public RelativeDelta second(Integer second) {
    
    this.second = second;
    return this;
  }

   /**
   * Get second
   * @return second
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SECOND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getSecond() {
    return second;
  }


  public void setSecond(Integer second) {
    this.second = second;
  }


  public RelativeDelta microsecond(Integer microsecond) {
    
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
    RelativeDelta relativeDelta = (RelativeDelta) o;
    return Objects.equals(this.type, relativeDelta.type) &&
        Objects.equals(this.years, relativeDelta.years) &&
        Objects.equals(this.months, relativeDelta.months) &&
        Objects.equals(this.days, relativeDelta.days) &&
        Objects.equals(this.leapdays, relativeDelta.leapdays) &&
        Objects.equals(this.hours, relativeDelta.hours) &&
        Objects.equals(this.minutes, relativeDelta.minutes) &&
        Objects.equals(this.seconds, relativeDelta.seconds) &&
        Objects.equals(this.microseconds, relativeDelta.microseconds) &&
        Objects.equals(this.year, relativeDelta.year) &&
        Objects.equals(this.month, relativeDelta.month) &&
        Objects.equals(this.day, relativeDelta.day) &&
        Objects.equals(this.hour, relativeDelta.hour) &&
        Objects.equals(this.minute, relativeDelta.minute) &&
        Objects.equals(this.second, relativeDelta.second) &&
        Objects.equals(this.microsecond, relativeDelta.microsecond);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, years, months, days, leapdays, hours, minutes, seconds, microseconds, year, month, day, hour, minute, second, microsecond);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelativeDelta {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    years: ").append(toIndentedString(years)).append("\n");
    sb.append("    months: ").append(toIndentedString(months)).append("\n");
    sb.append("    days: ").append(toIndentedString(days)).append("\n");
    sb.append("    leapdays: ").append(toIndentedString(leapdays)).append("\n");
    sb.append("    hours: ").append(toIndentedString(hours)).append("\n");
    sb.append("    minutes: ").append(toIndentedString(minutes)).append("\n");
    sb.append("    seconds: ").append(toIndentedString(seconds)).append("\n");
    sb.append("    microseconds: ").append(toIndentedString(microseconds)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
    sb.append("    month: ").append(toIndentedString(month)).append("\n");
    sb.append("    day: ").append(toIndentedString(day)).append("\n");
    sb.append("    hour: ").append(toIndentedString(hour)).append("\n");
    sb.append("    minute: ").append(toIndentedString(minute)).append("\n");
    sb.append("    second: ").append(toIndentedString(second)).append("\n");
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

