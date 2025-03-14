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
import com.ezmax.api.model.EzsigntemplatesignatureRequestCompoundV2;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
 * Request for POST /2/object/ezsigntemplatesignature
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-07T19:20:13.445471985Z[Etc/UTC]", comments = "Generator version: 7.12.0")
public class EzsigntemplatesignatureCreateObjectV2Request {
  public static final String SERIALIZED_NAME_A_OBJ_EZSIGNTEMPLATESIGNATURE = "a_objEzsigntemplatesignature";
  @SerializedName(SERIALIZED_NAME_A_OBJ_EZSIGNTEMPLATESIGNATURE)
  @javax.annotation.Nonnull
  private List<EzsigntemplatesignatureRequestCompoundV2> aObjEzsigntemplatesignature = new ArrayList<>();

  public EzsigntemplatesignatureCreateObjectV2Request() {
  }

  public EzsigntemplatesignatureCreateObjectV2Request aObjEzsigntemplatesignature(@javax.annotation.Nonnull List<EzsigntemplatesignatureRequestCompoundV2> aObjEzsigntemplatesignature) {
    this.aObjEzsigntemplatesignature = aObjEzsigntemplatesignature;
    return this;
  }

  public EzsigntemplatesignatureCreateObjectV2Request addAObjEzsigntemplatesignatureItem(EzsigntemplatesignatureRequestCompoundV2 aObjEzsigntemplatesignatureItem) {
    if (this.aObjEzsigntemplatesignature == null) {
      this.aObjEzsigntemplatesignature = new ArrayList<>();
    }
    this.aObjEzsigntemplatesignature.add(aObjEzsigntemplatesignatureItem);
    return this;
  }

  /**
   * Get aObjEzsigntemplatesignature
   * @return aObjEzsigntemplatesignature
   */
  @javax.annotation.Nonnull
  public List<EzsigntemplatesignatureRequestCompoundV2> getaObjEzsigntemplatesignature() {
    return aObjEzsigntemplatesignature;
  }

  public void setaObjEzsigntemplatesignature(@javax.annotation.Nonnull List<EzsigntemplatesignatureRequestCompoundV2> aObjEzsigntemplatesignature) {
    this.aObjEzsigntemplatesignature = aObjEzsigntemplatesignature;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsigntemplatesignatureCreateObjectV2Request ezsigntemplatesignatureCreateObjectV2Request = (EzsigntemplatesignatureCreateObjectV2Request) o;
    return Objects.equals(this.aObjEzsigntemplatesignature, ezsigntemplatesignatureCreateObjectV2Request.aObjEzsigntemplatesignature);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aObjEzsigntemplatesignature);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsigntemplatesignatureCreateObjectV2Request {\n");
    sb.append("    aObjEzsigntemplatesignature: ").append(toIndentedString(aObjEzsigntemplatesignature)).append("\n");
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
    openapiFields.add("a_objEzsigntemplatesignature");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("a_objEzsigntemplatesignature");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EzsigntemplatesignatureCreateObjectV2Request
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EzsigntemplatesignatureCreateObjectV2Request.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EzsigntemplatesignatureCreateObjectV2Request is not found in the empty JSON string", EzsigntemplatesignatureCreateObjectV2Request.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EzsigntemplatesignatureCreateObjectV2Request.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EzsigntemplatesignatureCreateObjectV2Request` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EzsigntemplatesignatureCreateObjectV2Request.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("a_objEzsigntemplatesignature").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `a_objEzsigntemplatesignature` to be an array in the JSON string but got `%s`", jsonObj.get("a_objEzsigntemplatesignature").toString()));
      }

      JsonArray jsonArrayaObjEzsigntemplatesignature = jsonObj.getAsJsonArray("a_objEzsigntemplatesignature");
      // validate the required field `a_objEzsigntemplatesignature` (array)
      for (int i = 0; i < jsonArrayaObjEzsigntemplatesignature.size(); i++) {
        EzsigntemplatesignatureRequestCompoundV2.validateJsonElement(jsonArrayaObjEzsigntemplatesignature.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EzsigntemplatesignatureCreateObjectV2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EzsigntemplatesignatureCreateObjectV2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EzsigntemplatesignatureCreateObjectV2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EzsigntemplatesignatureCreateObjectV2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<EzsigntemplatesignatureCreateObjectV2Request>() {
           @Override
           public void write(JsonWriter out, EzsigntemplatesignatureCreateObjectV2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EzsigntemplatesignatureCreateObjectV2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EzsigntemplatesignatureCreateObjectV2Request given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EzsigntemplatesignatureCreateObjectV2Request
   * @throws IOException if the JSON string is invalid with respect to EzsigntemplatesignatureCreateObjectV2Request
   */
  public static EzsigntemplatesignatureCreateObjectV2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EzsigntemplatesignatureCreateObjectV2Request.class);
  }

  /**
   * Convert an instance of EzsigntemplatesignatureCreateObjectV2Request to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

