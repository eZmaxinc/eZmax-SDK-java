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
 * This Ezsign Event. This property will be set only if the Module is \&quot;Ezsign\&quot;
 */
@JsonAdapter(CustomEWebhookEzsignevent.Adapter.class)
public enum CustomEWebhookEzsignevent {
  
  DOCUMENT_COMPLETED("DocumentCompleted"),
  
  DOCUMENT_FORM_COMPLETED("DocumentFormCompleted"),
  
  DOCUMENT_UNSENT("DocumentUnsent"),
  
  EZSIGNSIGNER_ACCEPTCLAUSE("EzsignsignerAcceptclause"),
  
  EZSIGNSIGNER_CONNECT("EzsignsignerConnect"),
  
  FOLDER_COMPLETED("FolderCompleted"),
  
  FOLDER_DISPOSED("FolderDisposed"),
  
  FOLDER_SENT("FolderSent"),
  
  FOLDER_UNSENT("FolderUnsent");

  private String value;

  CustomEWebhookEzsignevent(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CustomEWebhookEzsignevent fromValue(String value) {
    for (CustomEWebhookEzsignevent b : CustomEWebhookEzsignevent.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<CustomEWebhookEzsignevent> {
    @Override
    public void write(final JsonWriter jsonWriter, final CustomEWebhookEzsignevent enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CustomEWebhookEzsignevent read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CustomEWebhookEzsignevent.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    CustomEWebhookEzsignevent.fromValue(value);
  }
}

