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
 * ImportError
 */
@JsonPropertyOrder({
  ImportError.JSON_PROPERTY_IMPORT_ERROR_ID,
  ImportError.JSON_PROPERTY_TIMESTAMP,
  ImportError.JSON_PROPERTY_FILENAME,
  ImportError.JSON_PROPERTY_STACK_TRACE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-05-31T07:39:21.588Z[GMT]")
public class ImportError {
  public static final String JSON_PROPERTY_IMPORT_ERROR_ID = "import_error_id";
  private Integer importErrorId;

  public static final String JSON_PROPERTY_TIMESTAMP = "timestamp";
  private String timestamp;

  public static final String JSON_PROPERTY_FILENAME = "filename";
  private String filename;

  public static final String JSON_PROPERTY_STACK_TRACE = "stack_trace";
  private String stackTrace;


   /**
   * Get importErrorId
   * @return importErrorId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IMPORT_ERROR_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getImportErrorId() {
    return importErrorId;
  }




   /**
   * Get timestamp
   * @return timestamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTimestamp() {
    return timestamp;
  }




   /**
   * Get filename
   * @return filename
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FILENAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFilename() {
    return filename;
  }




   /**
   * Get stackTrace
   * @return stackTrace
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STACK_TRACE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStackTrace() {
    return stackTrace;
  }




  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImportError importError = (ImportError) o;
    return Objects.equals(this.importErrorId, importError.importErrorId) &&
        Objects.equals(this.timestamp, importError.timestamp) &&
        Objects.equals(this.filename, importError.filename) &&
        Objects.equals(this.stackTrace, importError.stackTrace);
  }

  @Override
  public int hashCode() {
    return Objects.hash(importErrorId, timestamp, filename, stackTrace);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImportError {\n");
    sb.append("    importErrorId: ").append(toIndentedString(importErrorId)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    stackTrace: ").append(toIndentedString(stackTrace)).append("\n");
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

