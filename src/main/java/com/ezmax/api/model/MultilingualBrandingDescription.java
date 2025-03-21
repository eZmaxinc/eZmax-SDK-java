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
 * Description of the Branding
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-07T19:20:13.445471985Z[Etc/UTC]", comments = "Generator version: 7.12.0")
public class MultilingualBrandingDescription {
  public static final String SERIALIZED_NAME_S_BRANDING_DESCRIPTION1 = "sBrandingDescription1";
  @SerializedName(SERIALIZED_NAME_S_BRANDING_DESCRIPTION1)
  @javax.annotation.Nullable
  private String sBrandingDescription1;

  public static final String SERIALIZED_NAME_S_BRANDING_DESCRIPTION2 = "sBrandingDescription2";
  @SerializedName(SERIALIZED_NAME_S_BRANDING_DESCRIPTION2)
  @javax.annotation.Nullable
  private String sBrandingDescription2;

  public MultilingualBrandingDescription() {
  }

  public MultilingualBrandingDescription sBrandingDescription1(@javax.annotation.Nullable String sBrandingDescription1) {
    this.sBrandingDescription1 = sBrandingDescription1;
    return this;
  }

  /**
   * The description of the Branding in French
   * @return sBrandingDescription1
   */
  @javax.annotation.Nullable
  public String getsBrandingDescription1() {
    return sBrandingDescription1;
  }

  public void setsBrandingDescription1(@javax.annotation.Nullable String sBrandingDescription1) {
    this.sBrandingDescription1 = sBrandingDescription1;
  }


  public MultilingualBrandingDescription sBrandingDescription2(@javax.annotation.Nullable String sBrandingDescription2) {
    this.sBrandingDescription2 = sBrandingDescription2;
    return this;
  }

  /**
   * The description of the Branding in English
   * @return sBrandingDescription2
   */
  @javax.annotation.Nullable
  public String getsBrandingDescription2() {
    return sBrandingDescription2;
  }

  public void setsBrandingDescription2(@javax.annotation.Nullable String sBrandingDescription2) {
    this.sBrandingDescription2 = sBrandingDescription2;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MultilingualBrandingDescription multilingualBrandingDescription = (MultilingualBrandingDescription) o;
    return Objects.equals(this.sBrandingDescription1, multilingualBrandingDescription.sBrandingDescription1) &&
        Objects.equals(this.sBrandingDescription2, multilingualBrandingDescription.sBrandingDescription2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sBrandingDescription1, sBrandingDescription2);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultilingualBrandingDescription {\n");
    sb.append("    sBrandingDescription1: ").append(toIndentedString(sBrandingDescription1)).append("\n");
    sb.append("    sBrandingDescription2: ").append(toIndentedString(sBrandingDescription2)).append("\n");
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
    openapiFields.add("sBrandingDescription1");
    openapiFields.add("sBrandingDescription2");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to MultilingualBrandingDescription
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MultilingualBrandingDescription.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MultilingualBrandingDescription is not found in the empty JSON string", MultilingualBrandingDescription.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!MultilingualBrandingDescription.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MultilingualBrandingDescription` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("sBrandingDescription1") != null && !jsonObj.get("sBrandingDescription1").isJsonNull()) && !jsonObj.get("sBrandingDescription1").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sBrandingDescription1` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sBrandingDescription1").toString()));
      }
      if ((jsonObj.get("sBrandingDescription2") != null && !jsonObj.get("sBrandingDescription2").isJsonNull()) && !jsonObj.get("sBrandingDescription2").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sBrandingDescription2` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sBrandingDescription2").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MultilingualBrandingDescription.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MultilingualBrandingDescription' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MultilingualBrandingDescription> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MultilingualBrandingDescription.class));

       return (TypeAdapter<T>) new TypeAdapter<MultilingualBrandingDescription>() {
           @Override
           public void write(JsonWriter out, MultilingualBrandingDescription value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MultilingualBrandingDescription read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of MultilingualBrandingDescription given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of MultilingualBrandingDescription
   * @throws IOException if the JSON string is invalid with respect to MultilingualBrandingDescription
   */
  public static MultilingualBrandingDescription fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MultilingualBrandingDescription.class);
  }

  /**
   * Convert an instance of MultilingualBrandingDescription to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

