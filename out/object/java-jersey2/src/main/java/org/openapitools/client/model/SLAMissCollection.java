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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.SLAMiss;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * SLAMissCollection
 */
@JsonPropertyOrder({
  SLAMissCollection.JSON_PROPERTY_SLA_MISSES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-05-31T07:53:02.054Z[GMT]")
public class SLAMissCollection {
  public static final String JSON_PROPERTY_SLA_MISSES = "sla_misses";
  private List<SLAMiss> slaMisses = null;


  public SLAMissCollection slaMisses(List<SLAMiss> slaMisses) {
    
    this.slaMisses = slaMisses;
    return this;
  }

  public SLAMissCollection addSlaMissesItem(SLAMiss slaMissesItem) {
    if (this.slaMisses == null) {
      this.slaMisses = new ArrayList<SLAMiss>();
    }
    this.slaMisses.add(slaMissesItem);
    return this;
  }

   /**
   * Get slaMisses
   * @return slaMisses
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SLA_MISSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<SLAMiss> getSlaMisses() {
    return slaMisses;
  }


  public void setSlaMisses(List<SLAMiss> slaMisses) {
    this.slaMisses = slaMisses;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SLAMissCollection slAMissCollection = (SLAMissCollection) o;
    return Objects.equals(this.slaMisses, slAMissCollection.slaMisses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(slaMisses);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SLAMissCollection {\n");
    sb.append("    slaMisses: ").append(toIndentedString(slaMisses)).append("\n");
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

