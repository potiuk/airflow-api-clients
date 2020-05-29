/*
 * Airflow API (Stable)
 *
 * Apache Airflow management API.
 *
 * API version: 1.0.0
 * Contact: dev@airflow.apache.org
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi
import (
	"time"
)
// DagRun struct for DagRun
type DagRun struct {
	// Run ID. The value of this field can be set only when creating the object. If you try to modify the field of an existing object, the request fails with an BAD_REQUEST error. If not provided, a value will be generated based on execution_date. If the specified dag_run_id is in use, the creation request fails with an ALREADY_EXISTS error. This together with DAG_ID are a unique key. 
	DagRunId string `json:"dag_run_id,omitempty"`
	DagId string `json:"dag_id"`
	// The execution date. This is the time when the DAG run should be started according to the DAG definition. The value of this field can be set only when creating the object. If you try to modify the field of an existing object, the request fails with an BAD_REQUEST error. This together with DAG_ID are a unique key. 
	ExecutionDate time.Time `json:"execution_date,omitempty"`
	// The start time. The time when DAG Run was actually created.. 
	StartDate time.Time `json:"start_date,omitempty"`
	EndDate time.Time `json:"end_date,omitempty"`
	State DagState `json:"state,omitempty"`
	ExternalTrigger bool `json:"external_trigger,omitempty"`
	// JSON object describing additional configuration parameters. The value of this field can be set only when creating the object. If you try to modify the field of an existing object, the request fails with an BAD_REQUEST error. 
	Conf string `json:"conf,omitempty"`
}