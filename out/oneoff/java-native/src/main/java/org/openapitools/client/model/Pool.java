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
 * Pool
 */
@JsonPropertyOrder({
  Pool.JSON_PROPERTY_NAME,
  Pool.JSON_PROPERTY_SLOTS,
  Pool.JSON_PROPERTY_OCCUPIED_SLOTS,
  Pool.JSON_PROPERTY_USED_SLOTS,
  Pool.JSON_PROPERTY_QUEUED_SLOTS,
  Pool.JSON_PROPERTY_OPEN_SLOTS
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-05-31T07:39:46.427Z[GMT]")
public class Pool {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SLOTS = "slots";
  private Integer slots;

  public static final String JSON_PROPERTY_OCCUPIED_SLOTS = "occupied_slots";
  private Integer occupiedSlots;

  public static final String JSON_PROPERTY_USED_SLOTS = "used_slots";
  private Integer usedSlots;

  public static final String JSON_PROPERTY_QUEUED_SLOTS = "queued_slots";
  private Integer queuedSlots;

  public static final String JSON_PROPERTY_OPEN_SLOTS = "open_slots";
  private Integer openSlots;


  public Pool name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Pool slots(Integer slots) {
    
    this.slots = slots;
    return this;
  }

   /**
   * Get slots
   * @return slots
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SLOTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getSlots() {
    return slots;
  }


  public void setSlots(Integer slots) {
    this.slots = slots;
  }


   /**
   * Get occupiedSlots
   * @return occupiedSlots
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OCCUPIED_SLOTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getOccupiedSlots() {
    return occupiedSlots;
  }




   /**
   * Get usedSlots
   * @return usedSlots
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_USED_SLOTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getUsedSlots() {
    return usedSlots;
  }




   /**
   * Get queuedSlots
   * @return queuedSlots
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_QUEUED_SLOTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getQueuedSlots() {
    return queuedSlots;
  }




   /**
   * Get openSlots
   * @return openSlots
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OPEN_SLOTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getOpenSlots() {
    return openSlots;
  }




  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Pool pool = (Pool) o;
    return Objects.equals(this.name, pool.name) &&
        Objects.equals(this.slots, pool.slots) &&
        Objects.equals(this.occupiedSlots, pool.occupiedSlots) &&
        Objects.equals(this.usedSlots, pool.usedSlots) &&
        Objects.equals(this.queuedSlots, pool.queuedSlots) &&
        Objects.equals(this.openSlots, pool.openSlots);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, slots, occupiedSlots, usedSlots, queuedSlots, openSlots);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pool {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    slots: ").append(toIndentedString(slots)).append("\n");
    sb.append("    occupiedSlots: ").append(toIndentedString(occupiedSlots)).append("\n");
    sb.append("    usedSlots: ").append(toIndentedString(usedSlots)).append("\n");
    sb.append("    queuedSlots: ").append(toIndentedString(queuedSlots)).append("\n");
    sb.append("    openSlots: ").append(toIndentedString(openSlots)).append("\n");
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

