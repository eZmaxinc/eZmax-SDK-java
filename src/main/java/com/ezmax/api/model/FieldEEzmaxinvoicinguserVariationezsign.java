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
 * The variation type for eZsign
 */
@JsonAdapter(FieldEEzmaxinvoicinguserVariationezsign.Adapter.class)
public enum FieldEEzmaxinvoicinguserVariationezsign {
  
  CHARGE("Charge"),
  
  REFUND("Refund"),
  
  SAME("Same");

  private String value;

  FieldEEzmaxinvoicinguserVariationezsign(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static FieldEEzmaxinvoicinguserVariationezsign fromValue(String value) {
    for (FieldEEzmaxinvoicinguserVariationezsign b : FieldEEzmaxinvoicinguserVariationezsign.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<FieldEEzmaxinvoicinguserVariationezsign> {
    @Override
    public void write(final JsonWriter jsonWriter, final FieldEEzmaxinvoicinguserVariationezsign enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public FieldEEzmaxinvoicinguserVariationezsign read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return FieldEEzmaxinvoicinguserVariationezsign.fromValue(value);
    }
  }
}
