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
 * The Action to do if the PDFA is non compliant of the Ezsignfolder type.  * **Reject** is for rejecting the document * **Convert** is for converting to the fkiPdfalevelIDConvert configured
 */
@JsonAdapter(FieldEEzsignfoldertypePdfanoncompliantaction.Adapter.class)
public enum FieldEEzsignfoldertypePdfanoncompliantaction {
  
  REJECT("Reject"),
  
  CONVERT("Convert");

  private String value;

  FieldEEzsignfoldertypePdfanoncompliantaction(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static FieldEEzsignfoldertypePdfanoncompliantaction fromValue(String value) {
    for (FieldEEzsignfoldertypePdfanoncompliantaction b : FieldEEzsignfoldertypePdfanoncompliantaction.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<FieldEEzsignfoldertypePdfanoncompliantaction> {
    @Override
    public void write(final JsonWriter jsonWriter, final FieldEEzsignfoldertypePdfanoncompliantaction enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public FieldEEzsignfoldertypePdfanoncompliantaction read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return FieldEEzsignfoldertypePdfanoncompliantaction.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    FieldEEzsignfoldertypePdfanoncompliantaction.fromValue(value);
  }
}

