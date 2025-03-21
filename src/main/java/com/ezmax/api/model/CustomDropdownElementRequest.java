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
 * Generic DropdownElement Request
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-07T19:20:13.445471985Z[Etc/UTC]", comments = "Generator version: 7.12.0")
public class CustomDropdownElementRequest {
  public static final String SERIALIZED_NAME_S_LABEL = "sLabel";
  @SerializedName(SERIALIZED_NAME_S_LABEL)
  @javax.annotation.Nonnull
  private String sLabel;

  public static final String SERIALIZED_NAME_S_VALUE = "sValue";
  @SerializedName(SERIALIZED_NAME_S_VALUE)
  @javax.annotation.Nonnull
  private String sValue;

  public CustomDropdownElementRequest() {
  }

  public CustomDropdownElementRequest sLabel(@javax.annotation.Nonnull String sLabel) {
    this.sLabel = sLabel;
    return this;
  }

  /**
   * The Description of the element
   * @return sLabel
   */
  @javax.annotation.Nonnull
  public String getsLabel() {
    return sLabel;
  }

  public void setsLabel(@javax.annotation.Nonnull String sLabel) {
    this.sLabel = sLabel;
  }


  public CustomDropdownElementRequest sValue(@javax.annotation.Nonnull String sValue) {
    this.sValue = sValue;
    return this;
  }

  /**
   * The Value of the element
   * @return sValue
   */
  @javax.annotation.Nonnull
  public String getsValue() {
    return sValue;
  }

  public void setsValue(@javax.annotation.Nonnull String sValue) {
    this.sValue = sValue;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomDropdownElementRequest customDropdownElementRequest = (CustomDropdownElementRequest) o;
    return Objects.equals(this.sLabel, customDropdownElementRequest.sLabel) &&
        Objects.equals(this.sValue, customDropdownElementRequest.sValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sLabel, sValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomDropdownElementRequest {\n");
    sb.append("    sLabel: ").append(toIndentedString(sLabel)).append("\n");
    sb.append("    sValue: ").append(toIndentedString(sValue)).append("\n");
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
    openapiFields.add("sLabel");
    openapiFields.add("sValue");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("sLabel");
    openapiRequiredFields.add("sValue");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CustomDropdownElementRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CustomDropdownElementRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CustomDropdownElementRequest is not found in the empty JSON string", CustomDropdownElementRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CustomDropdownElementRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CustomDropdownElementRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CustomDropdownElementRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("sLabel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sLabel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sLabel").toString()));
      }
      if (!jsonObj.get("sValue").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sValue` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sValue").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CustomDropdownElementRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CustomDropdownElementRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CustomDropdownElementRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CustomDropdownElementRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CustomDropdownElementRequest>() {
           @Override
           public void write(JsonWriter out, CustomDropdownElementRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CustomDropdownElementRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CustomDropdownElementRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CustomDropdownElementRequest
   * @throws IOException if the JSON string is invalid with respect to CustomDropdownElementRequest
   */
  public static CustomDropdownElementRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CustomDropdownElementRequest.class);
  }

  /**
   * Convert an instance of CustomDropdownElementRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

