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
import com.ezmax.api.model.EzsignfolderRequestCompoundV3;
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
 * Request for POST /3/object/ezsignfolder
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-07T19:20:13.445471985Z[Etc/UTC]", comments = "Generator version: 7.12.0")
public class EzsignfolderCreateObjectV3Request {
  public static final String SERIALIZED_NAME_A_OBJ_EZSIGNFOLDER = "a_objEzsignfolder";
  @SerializedName(SERIALIZED_NAME_A_OBJ_EZSIGNFOLDER)
  @javax.annotation.Nonnull
  private List<EzsignfolderRequestCompoundV3> aObjEzsignfolder = new ArrayList<>();

  public EzsignfolderCreateObjectV3Request() {
  }

  public EzsignfolderCreateObjectV3Request aObjEzsignfolder(@javax.annotation.Nonnull List<EzsignfolderRequestCompoundV3> aObjEzsignfolder) {
    this.aObjEzsignfolder = aObjEzsignfolder;
    return this;
  }

  public EzsignfolderCreateObjectV3Request addAObjEzsignfolderItem(EzsignfolderRequestCompoundV3 aObjEzsignfolderItem) {
    if (this.aObjEzsignfolder == null) {
      this.aObjEzsignfolder = new ArrayList<>();
    }
    this.aObjEzsignfolder.add(aObjEzsignfolderItem);
    return this;
  }

  /**
   * Get aObjEzsignfolder
   * @return aObjEzsignfolder
   */
  @javax.annotation.Nonnull
  public List<EzsignfolderRequestCompoundV3> getaObjEzsignfolder() {
    return aObjEzsignfolder;
  }

  public void setaObjEzsignfolder(@javax.annotation.Nonnull List<EzsignfolderRequestCompoundV3> aObjEzsignfolder) {
    this.aObjEzsignfolder = aObjEzsignfolder;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignfolderCreateObjectV3Request ezsignfolderCreateObjectV3Request = (EzsignfolderCreateObjectV3Request) o;
    return Objects.equals(this.aObjEzsignfolder, ezsignfolderCreateObjectV3Request.aObjEzsignfolder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aObjEzsignfolder);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignfolderCreateObjectV3Request {\n");
    sb.append("    aObjEzsignfolder: ").append(toIndentedString(aObjEzsignfolder)).append("\n");
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
    openapiFields.add("a_objEzsignfolder");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("a_objEzsignfolder");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EzsignfolderCreateObjectV3Request
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EzsignfolderCreateObjectV3Request.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EzsignfolderCreateObjectV3Request is not found in the empty JSON string", EzsignfolderCreateObjectV3Request.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EzsignfolderCreateObjectV3Request.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EzsignfolderCreateObjectV3Request` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EzsignfolderCreateObjectV3Request.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("a_objEzsignfolder").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `a_objEzsignfolder` to be an array in the JSON string but got `%s`", jsonObj.get("a_objEzsignfolder").toString()));
      }

      JsonArray jsonArrayaObjEzsignfolder = jsonObj.getAsJsonArray("a_objEzsignfolder");
      // validate the required field `a_objEzsignfolder` (array)
      for (int i = 0; i < jsonArrayaObjEzsignfolder.size(); i++) {
        EzsignfolderRequestCompoundV3.validateJsonElement(jsonArrayaObjEzsignfolder.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EzsignfolderCreateObjectV3Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EzsignfolderCreateObjectV3Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EzsignfolderCreateObjectV3Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EzsignfolderCreateObjectV3Request.class));

       return (TypeAdapter<T>) new TypeAdapter<EzsignfolderCreateObjectV3Request>() {
           @Override
           public void write(JsonWriter out, EzsignfolderCreateObjectV3Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EzsignfolderCreateObjectV3Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EzsignfolderCreateObjectV3Request given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EzsignfolderCreateObjectV3Request
   * @throws IOException if the JSON string is invalid with respect to EzsignfolderCreateObjectV3Request
   */
  public static EzsignfolderCreateObjectV3Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EzsignfolderCreateObjectV3Request.class);
  }

  /**
   * Convert an instance of EzsignfolderCreateObjectV3Request to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

