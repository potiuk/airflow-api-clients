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
import org.openapitools.client.model.ImportError;

/**
 * ImportErrorCollection
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-05-29T12:00:47.463Z[GMT]")
public class ImportErrorCollection {
  public static final String SERIALIZED_NAME_IMPORT_ERRORS = "import_errors";
  @SerializedName(SERIALIZED_NAME_IMPORT_ERRORS)
  private List<ImportError> importErrors = null;


  public ImportErrorCollection importErrors(List<ImportError> importErrors) {
    
    this.importErrors = importErrors;
    return this;
  }

  public ImportErrorCollection addImportErrorsItem(ImportError importErrorsItem) {
    if (this.importErrors == null) {
      this.importErrors = new ArrayList<ImportError>();
    }
    this.importErrors.add(importErrorsItem);
    return this;
  }

   /**
   * Get importErrors
   * @return importErrors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ImportError> getImportErrors() {
    return importErrors;
  }


  public void setImportErrors(List<ImportError> importErrors) {
    this.importErrors = importErrors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImportErrorCollection importErrorCollection = (ImportErrorCollection) o;
    return Objects.equals(this.importErrors, importErrorCollection.importErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(importErrors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImportErrorCollection {\n");
    sb.append("    importErrors: ").append(toIndentedString(importErrors)).append("\n");
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

