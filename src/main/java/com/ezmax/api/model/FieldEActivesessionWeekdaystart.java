/*
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.4
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
 * The weekday start of the User.
 */
@JsonAdapter(FieldEActivesessionWeekdaystart.Adapter.class)
public enum FieldEActivesessionWeekdaystart {
  
  SUNDAY("Sunday"),
  
  MONDAY("Monday"),
  
  TUESDAY("Tuesday"),
  
  WEDNESDAY("Wednesday"),
  
  THURSDAY("Thursday"),
  
  FRIDAY("Friday"),
  
  SATURDAY("Saturday");

  private String value;

  FieldEActivesessionWeekdaystart(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static FieldEActivesessionWeekdaystart fromValue(String value) {
    for (FieldEActivesessionWeekdaystart b : FieldEActivesessionWeekdaystart.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<FieldEActivesessionWeekdaystart> {
    @Override
    public void write(final JsonWriter jsonWriter, final FieldEActivesessionWeekdaystart enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public FieldEActivesessionWeekdaystart read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return FieldEActivesessionWeekdaystart.fromValue(value);
    }
  }
}
