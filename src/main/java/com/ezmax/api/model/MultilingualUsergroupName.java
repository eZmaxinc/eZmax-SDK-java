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
 * The name of the Usergroup
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-07T19:20:13.445471985Z[Etc/UTC]", comments = "Generator version: 7.12.0")
public class MultilingualUsergroupName {
  public static final String SERIALIZED_NAME_S_USERGROUP_NAME1 = "sUsergroupName1";
  @SerializedName(SERIALIZED_NAME_S_USERGROUP_NAME1)
  @javax.annotation.Nullable
  private String sUsergroupName1;

  public static final String SERIALIZED_NAME_S_USERGROUP_NAME2 = "sUsergroupName2";
  @SerializedName(SERIALIZED_NAME_S_USERGROUP_NAME2)
  @javax.annotation.Nullable
  private String sUsergroupName2;

  public MultilingualUsergroupName() {
  }

  public MultilingualUsergroupName sUsergroupName1(@javax.annotation.Nullable String sUsergroupName1) {
    this.sUsergroupName1 = sUsergroupName1;
    return this;
  }

  /**
   * The name of the Usergroup in French
   * @return sUsergroupName1
   */
  @javax.annotation.Nullable
  public String getsUsergroupName1() {
    return sUsergroupName1;
  }

  public void setsUsergroupName1(@javax.annotation.Nullable String sUsergroupName1) {
    this.sUsergroupName1 = sUsergroupName1;
  }


  public MultilingualUsergroupName sUsergroupName2(@javax.annotation.Nullable String sUsergroupName2) {
    this.sUsergroupName2 = sUsergroupName2;
    return this;
  }

  /**
   * The name of the Usergroup in English
   * @return sUsergroupName2
   */
  @javax.annotation.Nullable
  public String getsUsergroupName2() {
    return sUsergroupName2;
  }

  public void setsUsergroupName2(@javax.annotation.Nullable String sUsergroupName2) {
    this.sUsergroupName2 = sUsergroupName2;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MultilingualUsergroupName multilingualUsergroupName = (MultilingualUsergroupName) o;
    return Objects.equals(this.sUsergroupName1, multilingualUsergroupName.sUsergroupName1) &&
        Objects.equals(this.sUsergroupName2, multilingualUsergroupName.sUsergroupName2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sUsergroupName1, sUsergroupName2);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultilingualUsergroupName {\n");
    sb.append("    sUsergroupName1: ").append(toIndentedString(sUsergroupName1)).append("\n");
    sb.append("    sUsergroupName2: ").append(toIndentedString(sUsergroupName2)).append("\n");
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
    openapiFields.add("sUsergroupName1");
    openapiFields.add("sUsergroupName2");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to MultilingualUsergroupName
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MultilingualUsergroupName.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MultilingualUsergroupName is not found in the empty JSON string", MultilingualUsergroupName.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!MultilingualUsergroupName.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MultilingualUsergroupName` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("sUsergroupName1") != null && !jsonObj.get("sUsergroupName1").isJsonNull()) && !jsonObj.get("sUsergroupName1").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sUsergroupName1` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sUsergroupName1").toString()));
      }
      if ((jsonObj.get("sUsergroupName2") != null && !jsonObj.get("sUsergroupName2").isJsonNull()) && !jsonObj.get("sUsergroupName2").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sUsergroupName2` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sUsergroupName2").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MultilingualUsergroupName.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MultilingualUsergroupName' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MultilingualUsergroupName> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MultilingualUsergroupName.class));

       return (TypeAdapter<T>) new TypeAdapter<MultilingualUsergroupName>() {
           @Override
           public void write(JsonWriter out, MultilingualUsergroupName value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MultilingualUsergroupName read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of MultilingualUsergroupName given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of MultilingualUsergroupName
   * @throws IOException if the JSON string is invalid with respect to MultilingualUsergroupName
   */
  public static MultilingualUsergroupName fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MultilingualUsergroupName.class);
  }

  /**
   * Convert an instance of MultilingualUsergroupName to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

