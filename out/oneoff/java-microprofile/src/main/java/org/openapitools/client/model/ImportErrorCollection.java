/**
 * Airflow API (Stable)
 * Apache Airflow management API.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: dev@airflow.apache.org
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.openapitools.client.model;

import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.ImportError;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.json.bind.annotation.JsonbProperty;

public class ImportErrorCollection  {
  
  private List<ImportError> importErrors = null;
  
 /**
   * Get importErrors
   * @return importErrors
  **/
  @JsonbProperty("import_errors")
  public List<ImportError> getImportErrors() {
    return importErrors;
  }

  /**
    * Set importErrors
  **/
  public void setImportErrors(List<ImportError> importErrors) {
    this.importErrors = importErrors;
  }

  public ImportErrorCollection importErrors(List<ImportError> importErrors) {
    this.importErrors = importErrors;
    return this;
  }

  public ImportErrorCollection addImportErrorsItem(ImportError importErrorsItem) {
    this.importErrors.add(importErrorsItem);
    return this;
  }


  /**
    * Create a string representation of this pojo.
  **/
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
