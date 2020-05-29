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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

/**
 * ListTaskInstanceForm
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-05-29T12:00:47.463Z[GMT]")
public class ListTaskInstanceForm {
  public static final String SERIALIZED_NAME_DAG_IDS = "dag_ids";
  @SerializedName(SERIALIZED_NAME_DAG_IDS)
  private List<String> dagIds = null;

  public static final String SERIALIZED_NAME_EXECUTION_DATE_GTE = "execution_date_gte";
  @SerializedName(SERIALIZED_NAME_EXECUTION_DATE_GTE)
  private OffsetDateTime executionDateGte;

  public static final String SERIALIZED_NAME_EXECUTION_DATE_LTE = "execution_date_lte";
  @SerializedName(SERIALIZED_NAME_EXECUTION_DATE_LTE)
  private OffsetDateTime executionDateLte;

  public static final String SERIALIZED_NAME_START_DATE_GTE = "start_date_gte";
  @SerializedName(SERIALIZED_NAME_START_DATE_GTE)
  private OffsetDateTime startDateGte;

  public static final String SERIALIZED_NAME_START_DATE_LTE = "start_date_lte";
  @SerializedName(SERIALIZED_NAME_START_DATE_LTE)
  private OffsetDateTime startDateLte;

  public static final String SERIALIZED_NAME_END_DATE_GTE = "end_date_gte";
  @SerializedName(SERIALIZED_NAME_END_DATE_GTE)
  private OffsetDateTime endDateGte;

  public static final String SERIALIZED_NAME_END_DATE_LTE = "end_date_lte";
  @SerializedName(SERIALIZED_NAME_END_DATE_LTE)
  private OffsetDateTime endDateLte;

  public static final String SERIALIZED_NAME_DURATION_GTE = "duration_gte";
  @SerializedName(SERIALIZED_NAME_DURATION_GTE)
  private BigDecimal durationGte;

  public static final String SERIALIZED_NAME_DURATION_LTE = "duration_lte";
  @SerializedName(SERIALIZED_NAME_DURATION_LTE)
  private BigDecimal durationLte;

  public static final String SERIALIZED_NAME_STATE = "State";
  @SerializedName(SERIALIZED_NAME_STATE)
  private List<String> state = null;

  public static final String SERIALIZED_NAME_POOL = "Pool";
  @SerializedName(SERIALIZED_NAME_POOL)
  private List<String> pool = null;

  public static final String SERIALIZED_NAME_QUEUE = "Queue";
  @SerializedName(SERIALIZED_NAME_QUEUE)
  private List<String> queue = null;


  public ListTaskInstanceForm dagIds(List<String> dagIds) {
    
    this.dagIds = dagIds;
    return this;
  }

  public ListTaskInstanceForm addDagIdsItem(String dagIdsItem) {
    if (this.dagIds == null) {
      this.dagIds = new ArrayList<String>();
    }
    this.dagIds.add(dagIdsItem);
    return this;
  }

   /**
   * Return objects with specific DAG IDs. The value can be repeated to retrieve multiple matching values (OR condition).
   * @return dagIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Return objects with specific DAG IDs. The value can be repeated to retrieve multiple matching values (OR condition).")

  public List<String> getDagIds() {
    return dagIds;
  }


  public void setDagIds(List<String> dagIds) {
    this.dagIds = dagIds;
  }


  public ListTaskInstanceForm executionDateGte(OffsetDateTime executionDateGte) {
    
    this.executionDateGte = executionDateGte;
    return this;
  }

   /**
   * Returns objects greater or equal to the specified date. This can be combined with execution_date_lte parameter to receive only the selected period. 
   * @return executionDateGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Returns objects greater or equal to the specified date. This can be combined with execution_date_lte parameter to receive only the selected period. ")

  public OffsetDateTime getExecutionDateGte() {
    return executionDateGte;
  }


  public void setExecutionDateGte(OffsetDateTime executionDateGte) {
    this.executionDateGte = executionDateGte;
  }


  public ListTaskInstanceForm executionDateLte(OffsetDateTime executionDateLte) {
    
    this.executionDateLte = executionDateLte;
    return this;
  }

   /**
   * Returns objects less than or equal to the specified date. This can be combined with execution_date_gte parameter to receive only the selected period. 
   * @return executionDateLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Returns objects less than or equal to the specified date. This can be combined with execution_date_gte parameter to receive only the selected period. ")

  public OffsetDateTime getExecutionDateLte() {
    return executionDateLte;
  }


  public void setExecutionDateLte(OffsetDateTime executionDateLte) {
    this.executionDateLte = executionDateLte;
  }


  public ListTaskInstanceForm startDateGte(OffsetDateTime startDateGte) {
    
    this.startDateGte = startDateGte;
    return this;
  }

   /**
   * Returns objects greater or equal the specified date. This can be combined with startd_ate_lte parameter to receive only the selected period. 
   * @return startDateGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Returns objects greater or equal the specified date. This can be combined with startd_ate_lte parameter to receive only the selected period. ")

  public OffsetDateTime getStartDateGte() {
    return startDateGte;
  }


  public void setStartDateGte(OffsetDateTime startDateGte) {
    this.startDateGte = startDateGte;
  }


  public ListTaskInstanceForm startDateLte(OffsetDateTime startDateLte) {
    
    this.startDateLte = startDateLte;
    return this;
  }

   /**
   * Returns objects less or equal the specified date. This can be combined with start_date_gte parameter to receive only the selected period. 
   * @return startDateLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Returns objects less or equal the specified date. This can be combined with start_date_gte parameter to receive only the selected period. ")

  public OffsetDateTime getStartDateLte() {
    return startDateLte;
  }


  public void setStartDateLte(OffsetDateTime startDateLte) {
    this.startDateLte = startDateLte;
  }


  public ListTaskInstanceForm endDateGte(OffsetDateTime endDateGte) {
    
    this.endDateGte = endDateGte;
    return this;
  }

   /**
   * Returns objects greater or equal the specified date. This can be combined with start_date_lte parameter to receive only the selected period. 
   * @return endDateGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Returns objects greater or equal the specified date. This can be combined with start_date_lte parameter to receive only the selected period. ")

  public OffsetDateTime getEndDateGte() {
    return endDateGte;
  }


  public void setEndDateGte(OffsetDateTime endDateGte) {
    this.endDateGte = endDateGte;
  }


  public ListTaskInstanceForm endDateLte(OffsetDateTime endDateLte) {
    
    this.endDateLte = endDateLte;
    return this;
  }

   /**
   * Returns objects less than or equal to the specified date. This can be combined with start_date_gte parameter to receive only the selected period. 
   * @return endDateLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Returns objects less than or equal to the specified date. This can be combined with start_date_gte parameter to receive only the selected period. ")

  public OffsetDateTime getEndDateLte() {
    return endDateLte;
  }


  public void setEndDateLte(OffsetDateTime endDateLte) {
    this.endDateLte = endDateLte;
  }


  public ListTaskInstanceForm durationGte(BigDecimal durationGte) {
    
    this.durationGte = durationGte;
    return this;
  }

   /**
   * Returns objects greater than or equal to the specified values. This can be combined with duration_lte parameter to receive only the selected period. 
   * @return durationGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Returns objects greater than or equal to the specified values. This can be combined with duration_lte parameter to receive only the selected period. ")

  public BigDecimal getDurationGte() {
    return durationGte;
  }


  public void setDurationGte(BigDecimal durationGte) {
    this.durationGte = durationGte;
  }


  public ListTaskInstanceForm durationLte(BigDecimal durationLte) {
    
    this.durationLte = durationLte;
    return this;
  }

   /**
   * Returns objects less than or equal to the specified values. This can be combined with duration_gte parameter to receive only the selected range. 
   * @return durationLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Returns objects less than or equal to the specified values. This can be combined with duration_gte parameter to receive only the selected range. ")

  public BigDecimal getDurationLte() {
    return durationLte;
  }


  public void setDurationLte(BigDecimal durationLte) {
    this.durationLte = durationLte;
  }


  public ListTaskInstanceForm state(List<String> state) {
    
    this.state = state;
    return this;
  }

  public ListTaskInstanceForm addStateItem(String stateItem) {
    if (this.state == null) {
      this.state = new ArrayList<String>();
    }
    this.state.add(stateItem);
    return this;
  }

   /**
   * The value can be repeated to retrieve multiple matching values (OR condition).
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The value can be repeated to retrieve multiple matching values (OR condition).")

  public List<String> getState() {
    return state;
  }


  public void setState(List<String> state) {
    this.state = state;
  }


  public ListTaskInstanceForm pool(List<String> pool) {
    
    this.pool = pool;
    return this;
  }

  public ListTaskInstanceForm addPoolItem(String poolItem) {
    if (this.pool == null) {
      this.pool = new ArrayList<String>();
    }
    this.pool.add(poolItem);
    return this;
  }

   /**
   * The value can be repeated to retrieve multiple matching values (OR condition).
   * @return pool
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The value can be repeated to retrieve multiple matching values (OR condition).")

  public List<String> getPool() {
    return pool;
  }


  public void setPool(List<String> pool) {
    this.pool = pool;
  }


  public ListTaskInstanceForm queue(List<String> queue) {
    
    this.queue = queue;
    return this;
  }

  public ListTaskInstanceForm addQueueItem(String queueItem) {
    if (this.queue == null) {
      this.queue = new ArrayList<String>();
    }
    this.queue.add(queueItem);
    return this;
  }

   /**
   * The value can be repeated to retrieve multiple matching values (OR condition).
   * @return queue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The value can be repeated to retrieve multiple matching values (OR condition).")

  public List<String> getQueue() {
    return queue;
  }


  public void setQueue(List<String> queue) {
    this.queue = queue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListTaskInstanceForm listTaskInstanceForm = (ListTaskInstanceForm) o;
    return Objects.equals(this.dagIds, listTaskInstanceForm.dagIds) &&
        Objects.equals(this.executionDateGte, listTaskInstanceForm.executionDateGte) &&
        Objects.equals(this.executionDateLte, listTaskInstanceForm.executionDateLte) &&
        Objects.equals(this.startDateGte, listTaskInstanceForm.startDateGte) &&
        Objects.equals(this.startDateLte, listTaskInstanceForm.startDateLte) &&
        Objects.equals(this.endDateGte, listTaskInstanceForm.endDateGte) &&
        Objects.equals(this.endDateLte, listTaskInstanceForm.endDateLte) &&
        Objects.equals(this.durationGte, listTaskInstanceForm.durationGte) &&
        Objects.equals(this.durationLte, listTaskInstanceForm.durationLte) &&
        Objects.equals(this.state, listTaskInstanceForm.state) &&
        Objects.equals(this.pool, listTaskInstanceForm.pool) &&
        Objects.equals(this.queue, listTaskInstanceForm.queue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dagIds, executionDateGte, executionDateLte, startDateGte, startDateLte, endDateGte, endDateLte, durationGte, durationLte, state, pool, queue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListTaskInstanceForm {\n");
    sb.append("    dagIds: ").append(toIndentedString(dagIds)).append("\n");
    sb.append("    executionDateGte: ").append(toIndentedString(executionDateGte)).append("\n");
    sb.append("    executionDateLte: ").append(toIndentedString(executionDateLte)).append("\n");
    sb.append("    startDateGte: ").append(toIndentedString(startDateGte)).append("\n");
    sb.append("    startDateLte: ").append(toIndentedString(startDateLte)).append("\n");
    sb.append("    endDateGte: ").append(toIndentedString(endDateGte)).append("\n");
    sb.append("    endDateLte: ").append(toIndentedString(endDateLte)).append("\n");
    sb.append("    durationGte: ").append(toIndentedString(durationGte)).append("\n");
    sb.append("    durationLte: ").append(toIndentedString(durationLte)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    pool: ").append(toIndentedString(pool)).append("\n");
    sb.append("    queue: ").append(toIndentedString(queue)).append("\n");
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

