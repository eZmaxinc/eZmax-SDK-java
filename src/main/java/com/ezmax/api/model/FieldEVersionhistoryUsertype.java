/*
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.16
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ezmax.api.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * The Usertype by which the Versionhistory should be visible
 */
@JsonAdapter(FieldEVersionhistoryUsertype.Adapter.class)
public enum FieldEVersionhistoryUsertype {
  
  EMPTY(""),
  
  AGENTBROKER("AgentBroker"),
  
  EZSIGNUSER("EzsignUser"),
  
  NORMAL("Normal");

  private String value;

  FieldEVersionhistoryUsertype(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static FieldEVersionhistoryUsertype fromValue(String value) {
    for (FieldEVersionhistoryUsertype b : FieldEVersionhistoryUsertype.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<FieldEVersionhistoryUsertype> {
    @Override
    public void write(final JsonWriter jsonWriter, final FieldEVersionhistoryUsertype enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public FieldEVersionhistoryUsertype read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return FieldEVersionhistoryUsertype.fromValue(value);
    }
  }
}
