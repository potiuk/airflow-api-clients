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
import org.openapitools.client.model.DAG;

/**
 * DAGCollection
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-05-29T12:09:26.121Z[GMT]")
public class DAGCollection {
  public static final String SERIALIZED_NAME_DAGS = "dags";
  @SerializedName(SERIALIZED_NAME_DAGS)
  private List<DAG> dags = null;


  public DAGCollection dags(List<DAG> dags) {
    
    this.dags = dags;
    return this;
  }

  public DAGCollection addDagsItem(DAG dagsItem) {
    if (this.dags == null) {
      this.dags = new ArrayList<DAG>();
    }
    this.dags.add(dagsItem);
    return this;
  }

   /**
   * Get dags
   * @return dags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<DAG> getDags() {
    return dags;
  }


  public void setDags(List<DAG> dags) {
    this.dags = dags;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DAGCollection daGCollection = (DAGCollection) o;
    return Objects.equals(this.dags, daGCollection.dags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dags);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DAGCollection {\n");
    sb.append("    dags: ").append(toIndentedString(dags)).append("\n");
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

