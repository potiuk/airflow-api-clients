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
// DagState the model 'DagState'
type DagState string

// List of DagState
const (
	SUCCESS DagState = "success"
	RUNNING DagState = "running"
	FAILED DagState = "failed"
)
