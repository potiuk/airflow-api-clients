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
 * ClassReference
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-05-31T07:39:26.573Z[GMT]")
public class ClassReference {
  public static final String SERIALIZED_NAME_MODULE_PATH = "module_path";
  @SerializedName(SERIALIZED_NAME_MODULE_PATH)
  private String modulePath;

  public static final String SERIALIZED_NAME_CLASS_NAME = "class_name";
  @SerializedName(SERIALIZED_NAME_CLASS_NAME)
  private String className;


   /**
   * Get modulePath
   * @return modulePath
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getModulePath() {
    return modulePath;
  }




   /**
   * Get className
   * @return className
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

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

