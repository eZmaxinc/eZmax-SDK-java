/*
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.17
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
 * The Origin of User for the Activesession
 */
@JsonAdapter(FieldEActivesessionOrigin.Adapter.class)
public enum FieldEActivesessionOrigin {
  
  BUILTIN("BuiltIn"),
  
  EXTERNAL("External");

  private String value;

  FieldEActivesessionOrigin(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static FieldEActivesessionOrigin fromValue(String value) {
    for (FieldEActivesessionOrigin b : FieldEActivesessionOrigin.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<FieldEActivesessionOrigin> {
    @Override
    public void write(final JsonWriter jsonWriter, final FieldEActivesessionOrigin enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public FieldEActivesessionOrigin read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return FieldEActivesessionOrigin.fromValue(value);
    }
  }
}
