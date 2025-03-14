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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import eZmaxAPI.JSON;

/**
 * A custom Webhooklog object
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-07T19:20:13.445471985Z[Etc/UTC]", comments = "Generator version: 7.12.0")
public class CustomWebhooklogResponse {
  public static final String SERIALIZED_NAME_DT_WEBHOOKLOG_DATE = "dtWebhooklogDate";
  @SerializedName(SERIALIZED_NAME_DT_WEBHOOKLOG_DATE)
  @javax.annotation.Nonnull
  private String dtWebhooklogDate;

  public static final String SERIALIZED_NAME_T_WEBHOOKLOG_JSON = "tWebhooklogJson";
  @SerializedName(SERIALIZED_NAME_T_WEBHOOKLOG_JSON)
  @javax.annotation.Nonnull
  private String tWebhooklogJson;

  public CustomWebhooklogResponse() {
  }

  public CustomWebhooklogResponse dtWebhooklogDate(@javax.annotation.Nonnull String dtWebhooklogDate) {
    this.dtWebhooklogDate = dtWebhooklogDate;
    return this;
  }

  /**
   * The date and time at which the Webhooklog happened.
   * @return dtWebhooklogDate
   */
  @javax.annotation.Nonnull
  public String getDtWebhooklogDate() {
    return dtWebhooklogDate;
  }

  public void setDtWebhooklogDate(@javax.annotation.Nonnull String dtWebhooklogDate) {
    this.dtWebhooklogDate = dtWebhooklogDate;
  }


  public CustomWebhooklogResponse tWebhooklogJson(@javax.annotation.Nonnull String tWebhooklogJson) {
    this.tWebhooklogJson = tWebhooklogJson;
    return this;
  }

  /**
   * The Json containing the Webhook call and return
   * @return tWebhooklogJson
   */
  @javax.annotation.Nonnull
  public String gettWebhooklogJson() {
    return tWebhooklogJson;
  }

  public void settWebhooklogJson(@javax.annotation.Nonnull String tWebhooklogJson) {
    this.tWebhooklogJson = tWebhooklogJson;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomWebhooklogResponse customWebhooklogResponse = (CustomWebhooklogResponse) o;
    return Objects.equals(this.dtWebhooklogDate, customWebhooklogResponse.dtWebhooklogDate) &&
        Objects.equals(this.tWebhooklogJson, customWebhooklogResponse.tWebhooklogJson);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dtWebhooklogDate, tWebhooklogJson);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomWebhooklogResponse {\n");
    sb.append("    dtWebhooklogDate: ").append(toIndentedString(dtWebhooklogDate)).append("\n");
    sb.append("    tWebhooklogJson: ").append(toIndentedString(tWebhooklogJson)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("dtWebhooklogDate");
    openapiFields.add("tWebhooklogJson");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("dtWebhooklogDate");
    openapiRequiredFields.add("tWebhooklogJson");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CustomWebhooklogResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CustomWebhooklogResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CustomWebhooklogResponse is not found in the empty JSON string", CustomWebhooklogResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CustomWebhooklogResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CustomWebhooklogResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CustomWebhooklogResponse.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("dtWebhooklogDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dtWebhooklogDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dtWebhooklogDate").toString()));
      }
      if (!jsonObj.get("tWebhooklogJson").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tWebhooklogJson` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tWebhooklogJson").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CustomWebhooklogResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CustomWebhooklogResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CustomWebhooklogResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CustomWebhooklogResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<CustomWebhooklogResponse>() {
           @Override
           public void write(JsonWriter out, CustomWebhooklogResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CustomWebhooklogResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CustomWebhooklogResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CustomWebhooklogResponse
   * @throws IOException if the JSON string is invalid with respect to CustomWebhooklogResponse
   */
  public static CustomWebhooklogResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CustomWebhooklogResponse.class);
  }

  /**
   * Convert an instance of CustomWebhooklogResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

