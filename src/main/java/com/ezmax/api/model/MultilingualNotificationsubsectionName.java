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
 * Name of the Notificationsubsection
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-07T19:20:13.445471985Z[Etc/UTC]", comments = "Generator version: 7.12.0")
public class MultilingualNotificationsubsectionName {
  public static final String SERIALIZED_NAME_S_NOTIFICATIONSUBSECTION_NAME1 = "sNotificationsubsectionName1";
  @SerializedName(SERIALIZED_NAME_S_NOTIFICATIONSUBSECTION_NAME1)
  @javax.annotation.Nullable
  private String sNotificationsubsectionName1;

  public static final String SERIALIZED_NAME_S_NOTIFICATIONSUBSECTION_NAME2 = "sNotificationsubsectionName2";
  @SerializedName(SERIALIZED_NAME_S_NOTIFICATIONSUBSECTION_NAME2)
  @javax.annotation.Nullable
  private String sNotificationsubsectionName2;

  public MultilingualNotificationsubsectionName() {
  }

  public MultilingualNotificationsubsectionName sNotificationsubsectionName1(@javax.annotation.Nullable String sNotificationsubsectionName1) {
    this.sNotificationsubsectionName1 = sNotificationsubsectionName1;
    return this;
  }

  /**
   * The name of the Notificationsubsection in French
   * @return sNotificationsubsectionName1
   */
  @javax.annotation.Nullable
  public String getsNotificationsubsectionName1() {
    return sNotificationsubsectionName1;
  }

  public void setsNotificationsubsectionName1(@javax.annotation.Nullable String sNotificationsubsectionName1) {
    this.sNotificationsubsectionName1 = sNotificationsubsectionName1;
  }


  public MultilingualNotificationsubsectionName sNotificationsubsectionName2(@javax.annotation.Nullable String sNotificationsubsectionName2) {
    this.sNotificationsubsectionName2 = sNotificationsubsectionName2;
    return this;
  }

  /**
   * The name of the Notificationsubsection in English
   * @return sNotificationsubsectionName2
   */
  @javax.annotation.Nullable
  public String getsNotificationsubsectionName2() {
    return sNotificationsubsectionName2;
  }

  public void setsNotificationsubsectionName2(@javax.annotation.Nullable String sNotificationsubsectionName2) {
    this.sNotificationsubsectionName2 = sNotificationsubsectionName2;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MultilingualNotificationsubsectionName multilingualNotificationsubsectionName = (MultilingualNotificationsubsectionName) o;
    return Objects.equals(this.sNotificationsubsectionName1, multilingualNotificationsubsectionName.sNotificationsubsectionName1) &&
        Objects.equals(this.sNotificationsubsectionName2, multilingualNotificationsubsectionName.sNotificationsubsectionName2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sNotificationsubsectionName1, sNotificationsubsectionName2);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultilingualNotificationsubsectionName {\n");
    sb.append("    sNotificationsubsectionName1: ").append(toIndentedString(sNotificationsubsectionName1)).append("\n");
    sb.append("    sNotificationsubsectionName2: ").append(toIndentedString(sNotificationsubsectionName2)).append("\n");
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
    openapiFields.add("sNotificationsubsectionName1");
    openapiFields.add("sNotificationsubsectionName2");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to MultilingualNotificationsubsectionName
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MultilingualNotificationsubsectionName.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MultilingualNotificationsubsectionName is not found in the empty JSON string", MultilingualNotificationsubsectionName.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!MultilingualNotificationsubsectionName.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MultilingualNotificationsubsectionName` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("sNotificationsubsectionName1") != null && !jsonObj.get("sNotificationsubsectionName1").isJsonNull()) && !jsonObj.get("sNotificationsubsectionName1").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sNotificationsubsectionName1` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sNotificationsubsectionName1").toString()));
      }
      if ((jsonObj.get("sNotificationsubsectionName2") != null && !jsonObj.get("sNotificationsubsectionName2").isJsonNull()) && !jsonObj.get("sNotificationsubsectionName2").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sNotificationsubsectionName2` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sNotificationsubsectionName2").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MultilingualNotificationsubsectionName.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MultilingualNotificationsubsectionName' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MultilingualNotificationsubsectionName> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MultilingualNotificationsubsectionName.class));

       return (TypeAdapter<T>) new TypeAdapter<MultilingualNotificationsubsectionName>() {
           @Override
           public void write(JsonWriter out, MultilingualNotificationsubsectionName value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MultilingualNotificationsubsectionName read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of MultilingualNotificationsubsectionName given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of MultilingualNotificationsubsectionName
   * @throws IOException if the JSON string is invalid with respect to MultilingualNotificationsubsectionName
   */
  public static MultilingualNotificationsubsectionName fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MultilingualNotificationsubsectionName.class);
  }

  /**
   * Convert an instance of MultilingualNotificationsubsectionName to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

