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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.ConfigSection;

/**
 * Config
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-05-29T12:09:26.121Z[GMT]")
public class Config {
  public static final String SERIALIZED_NAME_SECTIONS = "sections";
  @SerializedName(SERIALIZED_NAME_SECTIONS)
  private List<ConfigSection> sections = null;


  public Config sections(List<ConfigSection> sections) {
    
    this.sections = sections;
    return this;
  }

  public Config addSectionsItem(ConfigSection sectionsItem) {
    if (this.sections == null) {
      this.sections = new ArrayList<ConfigSection>();
    }
    this.sections.add(sectionsItem);
    return this;
  }

   /**
   * Get sections
   * @return sections
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ConfigSection> getSections() {
    return sections;
  }


  public void setSections(List<ConfigSection> sections) {
    this.sections = sections;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Config config = (Config) o;
    return Objects.equals(this.sections, config.sections);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sections);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Config {\n");
    sb.append("    sections: ").append(toIndentedString(sections)).append("\n");
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

