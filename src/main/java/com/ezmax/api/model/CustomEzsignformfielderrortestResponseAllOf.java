/*
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.18
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ezmax.api.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import eZmaxAPI.JSON;

/**
 * CustomEzsignformfielderrortestResponseAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-22T15:33:11.356591451Z[Etc/UTC]")
public class CustomEzsignformfielderrortestResponseAllOf {
  public static final String SERIALIZED_NAME_S_EZSIGNFORMFIELDERRORTEST_NAME = "sEzsignformfielderrortestName";
  @SerializedName(SERIALIZED_NAME_S_EZSIGNFORMFIELDERRORTEST_NAME)
  private String sEzsignformfielderrortestName;

  public static final String SERIALIZED_NAME_S_EZSIGNFORMFIELDERRORTEST_DETAIL = "sEzsignformfielderrortestDetail";
  @SerializedName(SERIALIZED_NAME_S_EZSIGNFORMFIELDERRORTEST_DETAIL)
  private String sEzsignformfielderrortestDetail;

  public CustomEzsignformfielderrortestResponseAllOf() {
  }

  public CustomEzsignformfielderrortestResponseAllOf sEzsignformfielderrortestName(String sEzsignformfielderrortestName) {
    
    this.sEzsignformfielderrortestName = sEzsignformfielderrortestName;
    return this;
  }

   /**
   * The name of the test
   * @return sEzsignformfielderrortestName
  **/
  @javax.annotation.Nonnull
  public String getsEzsignformfielderrortestName() {
    return sEzsignformfielderrortestName;
  }


  public void setsEzsignformfielderrortestName(String sEzsignformfielderrortestName) {
    this.sEzsignformfielderrortestName = sEzsignformfielderrortestName;
  }


  public CustomEzsignformfielderrortestResponseAllOf sEzsignformfielderrortestDetail(String sEzsignformfielderrortestDetail) {
    
    this.sEzsignformfielderrortestDetail = sEzsignformfielderrortestDetail;
    return this;
  }

   /**
   * The detail why the test failed
   * @return sEzsignformfielderrortestDetail
  **/
  @javax.annotation.Nonnull
  public String getsEzsignformfielderrortestDetail() {
    return sEzsignformfielderrortestDetail;
  }


  public void setsEzsignformfielderrortestDetail(String sEzsignformfielderrortestDetail) {
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
    CustomEzsignformfielderrortestResponseAllOf customEzsignformfielderrortestResponseAllOf = (CustomEzsignformfielderrortestResponseAllOf) o;
    return Objects.equals(this.sEzsignformfielderrortestName, customEzsignformfielderrortestResponseAllOf.sEzsignformfielderrortestName) &&
        Objects.equals(this.sEzsignformfielderrortestDetail, customEzsignformfielderrortestResponseAllOf.sEzsignformfielderrortestDetail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sEzsignformfielderrortestName, sEzsignformfielderrortestDetail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomEzsignformfielderrortestResponseAllOf {\n");
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
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CustomEzsignformfielderrortestResponseAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CustomEzsignformfielderrortestResponseAllOf.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CustomEzsignformfielderrortestResponseAllOf is not found in the empty JSON string", CustomEzsignformfielderrortestResponseAllOf.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CustomEzsignformfielderrortestResponseAllOf.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CustomEzsignformfielderrortestResponseAllOf` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CustomEzsignformfielderrortestResponseAllOf.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
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
       if (!CustomEzsignformfielderrortestResponseAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CustomEzsignformfielderrortestResponseAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CustomEzsignformfielderrortestResponseAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CustomEzsignformfielderrortestResponseAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<CustomEzsignformfielderrortestResponseAllOf>() {
           @Override
           public void write(JsonWriter out, CustomEzsignformfielderrortestResponseAllOf value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CustomEzsignformfielderrortestResponseAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CustomEzsignformfielderrortestResponseAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CustomEzsignformfielderrortestResponseAllOf
  * @throws IOException if the JSON string is invalid with respect to CustomEzsignformfielderrortestResponseAllOf
  */
  public static CustomEzsignformfielderrortestResponseAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CustomEzsignformfielderrortestResponseAllOf.class);
  }

 /**
  * Convert an instance of CustomEzsignformfielderrortestResponseAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

