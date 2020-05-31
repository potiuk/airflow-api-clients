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

/**
 * Pool
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-05-31T07:37:12.038Z[GMT]")
public class Pool {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SLOTS = "slots";
  @SerializedName(SERIALIZED_NAME_SLOTS)
  private Integer slots;

  public static final String SERIALIZED_NAME_OCCUPIED_SLOTS = "occupied_slots";
  @SerializedName(SERIALIZED_NAME_OCCUPIED_SLOTS)
  private Integer occupiedSlots;

  public static final String SERIALIZED_NAME_USED_SLOTS = "used_slots";
  @SerializedName(SERIALIZED_NAME_USED_SLOTS)
  private Integer usedSlots;

  public static final String SERIALIZED_NAME_QUEUED_SLOTS = "queued_slots";
  @SerializedName(SERIALIZED_NAME_QUEUED_SLOTS)
  private Integer queuedSlots;

  public static final String SERIALIZED_NAME_OPEN_SLOTS = "open_slots";
  @SerializedName(SERIALIZED_NAME_OPEN_SLOTS)
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

  public Integer getOccupiedSlots() {
    return occupiedSlots;
  }




   /**
   * Get usedSlots
   * @return usedSlots
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getUsedSlots() {
    return usedSlots;
  }




   /**
   * Get queuedSlots
   * @return queuedSlots
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getQueuedSlots() {
    return queuedSlots;
  }




   /**
   * Get openSlots
   * @return openSlots
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

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

