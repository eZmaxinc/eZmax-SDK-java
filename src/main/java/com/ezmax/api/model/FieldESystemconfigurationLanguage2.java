/*
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.18
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ezmax.api.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * The type of the english for the client
 */
@JsonAdapter(FieldESystemconfigurationLanguage2.Adapter.class)
public enum FieldESystemconfigurationLanguage2 {
  
  CA("en_CA"),
  
  QC("en_QC"),
  
  US("en_US");

  private String value;

  FieldESystemconfigurationLanguage2(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static FieldESystemconfigurationLanguage2 fromValue(String value) {
    for (FieldESystemconfigurationLanguage2 b : FieldESystemconfigurationLanguage2.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<FieldESystemconfigurationLanguage2> {
    @Override
    public void write(final JsonWriter jsonWriter, final FieldESystemconfigurationLanguage2 enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public FieldESystemconfigurationLanguage2 read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return FieldESystemconfigurationLanguage2.fromValue(value);
    }
  }
}
