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
 * ClassReference
 */
@JsonPropertyOrder({
  ClassReference.JSON_PROPERTY_MODULE_PATH,
  ClassReference.JSON_PROPERTY_CLASS_NAME
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-05-31T07:53:14.226Z[GMT]")
public class ClassReference {
  public static final String JSON_PROPERTY_MODULE_PATH = "module_path";
  private String modulePath;

  public static final String JSON_PROPERTY_CLASS_NAME = "class_name";
  private String className;


   /**
   * Get modulePath
   * @return modulePath
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MODULE_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getModulePath() {
    return modulePath;
  }




   /**
   * Get className
   * @return className
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CLASS_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getClassName() {
    return className;
  }




  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClassReference classReference = (ClassReference) o;
    return Objects.equals(this.modulePath, classReference.modulePath) &&
        Objects.equals(this.className, classReference.className);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modulePath, className);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClassReference {\n");
    sb.append("    modulePath: ").append(toIndentedString(modulePath)).append("\n");
    sb.append("    className: ").append(toIndentedString(className)).append("\n");
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

