/*
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.2.0
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
 * The type of the Attachment
 */
@JsonAdapter(FieldEAttachmentType.Adapter.class)
public enum FieldEAttachmentType {
  
  OTHER("Other"),
  
  PDF("Pdf"),
  
  PDFGENERATED("PdfGenerated"),
  
  PDFSCANNED("PdfScanned"),
  
  EZSIGN("Ezsign");

  private String value;

  FieldEAttachmentType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static FieldEAttachmentType fromValue(String value) {
    for (FieldEAttachmentType b : FieldEAttachmentType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<FieldEAttachmentType> {
    @Override
    public void write(final JsonWriter jsonWriter, final FieldEAttachmentType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public FieldEAttachmentType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return FieldEAttachmentType.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    FieldEAttachmentType.fromValue(value);
  }
}
