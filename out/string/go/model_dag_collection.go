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
// DagCollection struct for DagCollection
type DagCollection struct {
	Dags []Dag `json:"dags,omitempty"`
}