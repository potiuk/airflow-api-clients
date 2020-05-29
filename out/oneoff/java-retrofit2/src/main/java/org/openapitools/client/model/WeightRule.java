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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets WeightRule
 */
@JsonAdapter(WeightRule.Adapter.class)
public enum WeightRule {
  
  DOWNSTREAM("downstream"),
  
  UPSTREAM("upstream"),
  
  ABSOLUTE("absolute");

  private String value;

  WeightRule(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static WeightRule fromValue(String value) {
    for (WeightRule b : WeightRule.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<WeightRule> {
    @Override
    public void write(final JsonWriter jsonWriter, final WeightRule enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public WeightRule read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return WeightRule.fromValue(value);
    }
  }
}
