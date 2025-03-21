/*
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.2.2
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ezmax.api.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * The source of the name of the attachment added to the Ezsigntemplatesignature
 */
@JsonAdapter(FieldEEzsigntemplatesignatureAttachmentnamesource.Adapter.class)
public enum FieldEEzsigntemplatesignatureAttachmentnamesource {
  
  DESCRIPTION("Description"),
  
  CUSTOMER("Customer"),
  
  DESCRIPTION_CUSTOMER("DescriptionCustomer");

  private String value;

  FieldEEzsigntemplatesignatureAttachmentnamesource(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static FieldEEzsigntemplatesignatureAttachmentnamesource fromValue(String value) {
    for (FieldEEzsigntemplatesignatureAttachmentnamesource b : FieldEEzsigntemplatesignatureAttachmentnamesource.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<FieldEEzsigntemplatesignatureAttachmentnamesource> {
    @Override
    public void write(final JsonWriter jsonWriter, final FieldEEzsigntemplatesignatureAttachmentnamesource enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public FieldEEzsigntemplatesignatureAttachmentnamesource read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return FieldEEzsigntemplatesignatureAttachmentnamesource.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    FieldEEzsigntemplatesignatureAttachmentnamesource.fromValue(value);
  }
}

