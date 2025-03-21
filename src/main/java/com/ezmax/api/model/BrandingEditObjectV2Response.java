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
import com.ezmax.api.model.CommonResponseObjDebug;
import com.ezmax.api.model.CommonResponseObjDebugPayload;
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
 * Response for PUT /2/object/branding/{pkiBrandingID}
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-07T19:20:13.445471985Z[Etc/UTC]", comments = "Generator version: 7.12.0")
public class BrandingEditObjectV2Response {
  public static final String SERIALIZED_NAME_OBJ_DEBUG_PAYLOAD = "objDebugPayload";
  @SerializedName(SERIALIZED_NAME_OBJ_DEBUG_PAYLOAD)
  @javax.annotation.Nonnull
  private CommonResponseObjDebugPayload objDebugPayload;

  public static final String SERIALIZED_NAME_OBJ_DEBUG = "objDebug";
  @SerializedName(SERIALIZED_NAME_OBJ_DEBUG)
  @javax.annotation.Nullable
  private CommonResponseObjDebug objDebug;

  public BrandingEditObjectV2Response() {
  }

  public BrandingEditObjectV2Response objDebugPayload(@javax.annotation.Nonnull CommonResponseObjDebugPayload objDebugPayload) {
    this.objDebugPayload = objDebugPayload;
    return this;
  }

  /**
   * Get objDebugPayload
   * @return objDebugPayload
   */
  @javax.annotation.Nonnull
  public CommonResponseObjDebugPayload getObjDebugPayload() {
    return objDebugPayload;
  }

  public void setObjDebugPayload(@javax.annotation.Nonnull CommonResponseObjDebugPayload objDebugPayload) {
    this.objDebugPayload = objDebugPayload;
  }


  public BrandingEditObjectV2Response objDebug(@javax.annotation.Nullable CommonResponseObjDebug objDebug) {
    this.objDebug = objDebug;
    return this;
  }

  /**
   * Get objDebug
   * @return objDebug
   */
  @javax.annotation.Nullable
  public CommonResponseObjDebug getObjDebug() {
    return objDebug;
  }

  public void setObjDebug(@javax.annotation.Nullable CommonResponseObjDebug objDebug) {
    this.objDebug = objDebug;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandingEditObjectV2Response brandingEditObjectV2Response = (BrandingEditObjectV2Response) o;
    return Objects.equals(this.objDebugPayload, brandingEditObjectV2Response.objDebugPayload) &&
        Objects.equals(this.objDebug, brandingEditObjectV2Response.objDebug);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objDebugPayload, objDebug);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandingEditObjectV2Response {\n");
    sb.append("    objDebugPayload: ").append(toIndentedString(objDebugPayload)).append("\n");
    sb.append("    objDebug: ").append(toIndentedString(objDebug)).append("\n");
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
    openapiFields.add("objDebugPayload");
    openapiFields.add("objDebug");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("objDebugPayload");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to BrandingEditObjectV2Response
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BrandingEditObjectV2Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BrandingEditObjectV2Response is not found in the empty JSON string", BrandingEditObjectV2Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!BrandingEditObjectV2Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BrandingEditObjectV2Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : BrandingEditObjectV2Response.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `objDebugPayload`
      CommonResponseObjDebugPayload.validateJsonElement(jsonObj.get("objDebugPayload"));
      // validate the optional field `objDebug`
      if (jsonObj.get("objDebug") != null && !jsonObj.get("objDebug").isJsonNull()) {
        CommonResponseObjDebug.validateJsonElement(jsonObj.get("objDebug"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BrandingEditObjectV2Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BrandingEditObjectV2Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BrandingEditObjectV2Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BrandingEditObjectV2Response.class));

       return (TypeAdapter<T>) new TypeAdapter<BrandingEditObjectV2Response>() {
           @Override
           public void write(JsonWriter out, BrandingEditObjectV2Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BrandingEditObjectV2Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of BrandingEditObjectV2Response given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of BrandingEditObjectV2Response
   * @throws IOException if the JSON string is invalid with respect to BrandingEditObjectV2Response
   */
  public static BrandingEditObjectV2Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BrandingEditObjectV2Response.class);
  }

  /**
   * Convert an instance of BrandingEditObjectV2Response to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

