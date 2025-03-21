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
 * A Custom Ezsignformfielderrortest Object to contain the detail of the test error
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-07T19:20:13.445471985Z[Etc/UTC]", comments = "Generator version: 7.12.0")
public class CustomEzsignformfielderrortestResponse {
  public static final String SERIALIZED_NAME_S_EZSIGNFORMFIELDERRORTEST_NAME = "sEzsignformfielderrortestName";
  @SerializedName(SERIALIZED_NAME_S_EZSIGNFORMFIELDERRORTEST_NAME)
  @javax.annotation.Nonnull
  private String sEzsignformfielderrortestName;

  public static final String SERIALIZED_NAME_S_EZSIGNFORMFIELDERRORTEST_DETAIL = "sEzsignformfielderrortestDetail";
  @SerializedName(SERIALIZED_NAME_S_EZSIGNFORMFIELDERRORTEST_DETAIL)
  @javax.annotation.Nonnull
  private String sEzsignformfielderrortestDetail;

  public CustomEzsignformfielderrortestResponse() {
  }

  public CustomEzsignformfielderrortestResponse sEzsignformfielderrortestName(@javax.annotation.Nonnull String sEzsignformfielderrortestName) {
    this.sEzsignformfielderrortestName = sEzsignformfielderrortestName;
    return this;
  }

  /**
   * The name of the test
   * @return sEzsignformfielderrortestName
   */
  @javax.annotation.Nonnull
  public String getsEzsignformfielderrortestName() {
    return sEzsignformfielderrortestName;
  }

  public void setsEzsignformfielderrortestName(@javax.annotation.Nonnull String sEzsignformfielderrortestName) {
    this.sEzsignformfielderrortestName = sEzsignformfielderrortestName;
  }


  public CustomEzsignformfielderrortestResponse sEzsignformfielderrortestDetail(@javax.annotation.Nonnull String sEzsignformfielderrortestDetail) {
    this.sEzsignformfielderrortestDetail = sEzsignformfielderrortestDetail;
    return this;
  }

  /**
   * The detail why the test failed
   * @return sEzsignformfielderrortestDetail
   */
  @javax.annotation.Nonnull
  public String getsEzsignformfielderrortestDetail() {
    return sEzsignformfielderrortestDetail;
  }

  public void setsEzsignformfielderrortestDetail(@javax.annotation.Nonnull String sEzsignformfielderrortestDetail) {
    this.sEzsignformfielderrortestDetail = sEzsignformfielderrortestDetail;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomEzsignformfielderrortestResponse customEzsignformfielderrortestResponse = (CustomEzsignformfielderrortestResponse) o;
    return Objects.equals(this.sEzsignformfielderrortestName, customEzsignformfielderrortestResponse.sEzsignformfielderrortestName) &&
        Objects.equals(this.sEzsignformfielderrortestDetail, customEzsignformfielderrortestResponse.sEzsignformfielderrortestDetail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sEzsignformfielderrortestName, sEzsignformfielderrortestDetail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomEzsignformfielderrortestResponse {\n");
    sb.append("    sEzsignformfielderrortestName: ").append(toIndentedString(sEzsignformfielderrortestName)).append("\n");
    sb.append("    sEzsignformfielderrortestDetail: ").append(toIndentedString(sEzsignformfielderrortestDetail)).append("\n");
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
    openapiFields.add("sEzsignformfielderrortestName");
    openapiFields.add("sEzsignformfielderrortestDetail");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("sEzsignformfielderrortestName");
    openapiRequiredFields.add("sEzsignformfielderrortestDetail");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CustomEzsignformfielderrortestResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CustomEzsignformfielderrortestResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CustomEzsignformfielderrortestResponse is not found in the empty JSON string", CustomEzsignformfielderrortestResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CustomEzsignformfielderrortestResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CustomEzsignformfielderrortestResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CustomEzsignformfielderrortestResponse.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("sEzsignformfielderrortestName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sEzsignformfielderrortestName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sEzsignformfielderrortestName").toString()));
      }
      if (!jsonObj.get("sEzsignformfielderrortestDetail").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sEzsignformfielderrortestDetail` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sEzsignformfielderrortestDetail").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CustomEzsignformfielderrortestResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CustomEzsignformfielderrortestResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CustomEzsignformfielderrortestResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CustomEzsignformfielderrortestResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<CustomEzsignformfielderrortestResponse>() {
           @Override
           public void write(JsonWriter out, CustomEzsignformfielderrortestResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CustomEzsignformfielderrortestResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CustomEzsignformfielderrortestResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CustomEzsignformfielderrortestResponse
   * @throws IOException if the JSON string is invalid with respect to CustomEzsignformfielderrortestResponse
   */
  public static CustomEzsignformfielderrortestResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CustomEzsignformfielderrortestResponse.class);
  }

  /**
   * Convert an instance of CustomEzsignformfielderrortestResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

