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
import com.ezmax.api.model.VersionhistoryResponseCompound;
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
 * Payload for GET /2/object/versionhistory/{pkiVersionhistoryID}
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-07T19:20:13.445471985Z[Etc/UTC]", comments = "Generator version: 7.12.0")
public class VersionhistoryGetObjectV2ResponseMPayload {
  public static final String SERIALIZED_NAME_OBJ_VERSIONHISTORY = "objVersionhistory";
  @SerializedName(SERIALIZED_NAME_OBJ_VERSIONHISTORY)
  @javax.annotation.Nonnull
  private VersionhistoryResponseCompound objVersionhistory;

  public VersionhistoryGetObjectV2ResponseMPayload() {
  }

  public VersionhistoryGetObjectV2ResponseMPayload objVersionhistory(@javax.annotation.Nonnull VersionhistoryResponseCompound objVersionhistory) {
    this.objVersionhistory = objVersionhistory;
    return this;
  }

  /**
   * Get objVersionhistory
   * @return objVersionhistory
   */
  @javax.annotation.Nonnull
  public VersionhistoryResponseCompound getObjVersionhistory() {
    return objVersionhistory;
  }

  public void setObjVersionhistory(@javax.annotation.Nonnull VersionhistoryResponseCompound objVersionhistory) {
    this.objVersionhistory = objVersionhistory;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VersionhistoryGetObjectV2ResponseMPayload versionhistoryGetObjectV2ResponseMPayload = (VersionhistoryGetObjectV2ResponseMPayload) o;
    return Objects.equals(this.objVersionhistory, versionhistoryGetObjectV2ResponseMPayload.objVersionhistory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objVersionhistory);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VersionhistoryGetObjectV2ResponseMPayload {\n");
    sb.append("    objVersionhistory: ").append(toIndentedString(objVersionhistory)).append("\n");
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
    openapiFields.add("objVersionhistory");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("objVersionhistory");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to VersionhistoryGetObjectV2ResponseMPayload
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!VersionhistoryGetObjectV2ResponseMPayload.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in VersionhistoryGetObjectV2ResponseMPayload is not found in the empty JSON string", VersionhistoryGetObjectV2ResponseMPayload.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!VersionhistoryGetObjectV2ResponseMPayload.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `VersionhistoryGetObjectV2ResponseMPayload` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : VersionhistoryGetObjectV2ResponseMPayload.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `objVersionhistory`
      VersionhistoryResponseCompound.validateJsonElement(jsonObj.get("objVersionhistory"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VersionhistoryGetObjectV2ResponseMPayload.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VersionhistoryGetObjectV2ResponseMPayload' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VersionhistoryGetObjectV2ResponseMPayload> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VersionhistoryGetObjectV2ResponseMPayload.class));

       return (TypeAdapter<T>) new TypeAdapter<VersionhistoryGetObjectV2ResponseMPayload>() {
           @Override
           public void write(JsonWriter out, VersionhistoryGetObjectV2ResponseMPayload value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public VersionhistoryGetObjectV2ResponseMPayload read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of VersionhistoryGetObjectV2ResponseMPayload given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of VersionhistoryGetObjectV2ResponseMPayload
   * @throws IOException if the JSON string is invalid with respect to VersionhistoryGetObjectV2ResponseMPayload
   */
  public static VersionhistoryGetObjectV2ResponseMPayload fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VersionhistoryGetObjectV2ResponseMPayload.class);
  }

  /**
   * Convert an instance of VersionhistoryGetObjectV2ResponseMPayload to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

