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
 * CollectionInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-05-29T12:06:49.093Z[GMT]")
public class CollectionInfo {
  public static final String SERIALIZED_NAME_TOTAL_ENTRIES = "total_entries";
  @SerializedName(SERIALIZED_NAME_TOTAL_ENTRIES)
  private Integer totalEntries;


  public CollectionInfo totalEntries(Integer totalEntries) {
    
    this.totalEntries = totalEntries;
    return this;
  }

   /**
   * Get totalEntries
   * @return totalEntries
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTotalEntries() {
    return totalEntries;
  }


  public void setTotalEntries(Integer totalEntries) {
    this.totalEntries = totalEntries;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CollectionInfo collectionInfo = (CollectionInfo) o;
    return Objects.equals(this.totalEntries, collectionInfo.totalEntries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalEntries);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CollectionInfo {\n");
    sb.append("    totalEntries: ").append(toIndentedString(totalEntries)).append("\n");
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

