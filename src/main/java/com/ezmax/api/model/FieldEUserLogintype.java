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
 * The type of authentication for the User
 */
@JsonAdapter(FieldEUserLogintype.Adapter.class)
public enum FieldEUserLogintype {
  
  PASSWORD("Password"),
  
  PASSWORDPHONE("PasswordPhone"),
  
  PASSWORDQUESTION("PasswordQuestion");

  private String value;

  FieldEUserLogintype(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static FieldEUserLogintype fromValue(String value) {
    for (FieldEUserLogintype b : FieldEUserLogintype.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<FieldEUserLogintype> {
    @Override
    public void write(final JsonWriter jsonWriter, final FieldEUserLogintype enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public FieldEUserLogintype read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return FieldEUserLogintype.fromValue(value);
    }
  }
}
