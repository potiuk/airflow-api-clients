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
import org.openapitools.client.model.ImportError;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * ImportErrorCollection
 */
@JsonPropertyOrder({
  ImportErrorCollection.JSON_PROPERTY_IMPORT_ERRORS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-05-29T12:10:18.569Z[GMT]")
public class ImportErrorCollection {
  public static final String JSON_PROPERTY_IMPORT_ERRORS = "import_errors";
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
  @JsonProperty(JSON_PROPERTY_IMPORT_ERRORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

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

