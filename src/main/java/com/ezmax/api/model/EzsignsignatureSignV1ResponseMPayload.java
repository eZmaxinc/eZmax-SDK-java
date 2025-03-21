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
import com.ezmax.api.model.CustomTimezoneWithCodeResponse;
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
 * Response for POST /1/object/ezsignsignature/{pkiEzsignsignatureID}/sign
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-07T19:20:13.445471985Z[Etc/UTC]", comments = "Generator version: 7.12.0")
public class EzsignsignatureSignV1ResponseMPayload {
  public static final String SERIALIZED_NAME_DT_EZSIGNSIGNATURE_DATE_IN_FOLDER_TIMEZONE = "dtEzsignsignatureDateInFolderTimezone";
  @SerializedName(SERIALIZED_NAME_DT_EZSIGNSIGNATURE_DATE_IN_FOLDER_TIMEZONE)
  @javax.annotation.Nonnull
  private String dtEzsignsignatureDateInFolderTimezone;

  public static final String SERIALIZED_NAME_OBJ_TIMEZONE = "objTimezone";
  @SerializedName(SERIALIZED_NAME_OBJ_TIMEZONE)
  @javax.annotation.Nullable
  private CustomTimezoneWithCodeResponse objTimezone;

  public EzsignsignatureSignV1ResponseMPayload() {
  }

  public EzsignsignatureSignV1ResponseMPayload dtEzsignsignatureDateInFolderTimezone(@javax.annotation.Nonnull String dtEzsignsignatureDateInFolderTimezone) {
    this.dtEzsignsignatureDateInFolderTimezone = dtEzsignsignatureDateInFolderTimezone;
    return this;
  }

  /**
   * The date the Ezsignsignature was signed in folder&#39;s timezone
   * @return dtEzsignsignatureDateInFolderTimezone
   */
  @javax.annotation.Nonnull
  public String getDtEzsignsignatureDateInFolderTimezone() {
    return dtEzsignsignatureDateInFolderTimezone;
  }

  public void setDtEzsignsignatureDateInFolderTimezone(@javax.annotation.Nonnull String dtEzsignsignatureDateInFolderTimezone) {
    this.dtEzsignsignatureDateInFolderTimezone = dtEzsignsignatureDateInFolderTimezone;
  }


  public EzsignsignatureSignV1ResponseMPayload objTimezone(@javax.annotation.Nullable CustomTimezoneWithCodeResponse objTimezone) {
    this.objTimezone = objTimezone;
    return this;
  }

  /**
   * Get objTimezone
   * @return objTimezone
   */
  @javax.annotation.Nullable
  public CustomTimezoneWithCodeResponse getObjTimezone() {
    return objTimezone;
  }

  public void setObjTimezone(@javax.annotation.Nullable CustomTimezoneWithCodeResponse objTimezone) {
    this.objTimezone = objTimezone;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignsignatureSignV1ResponseMPayload ezsignsignatureSignV1ResponseMPayload = (EzsignsignatureSignV1ResponseMPayload) o;
    return Objects.equals(this.dtEzsignsignatureDateInFolderTimezone, ezsignsignatureSignV1ResponseMPayload.dtEzsignsignatureDateInFolderTimezone) &&
        Objects.equals(this.objTimezone, ezsignsignatureSignV1ResponseMPayload.objTimezone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dtEzsignsignatureDateInFolderTimezone, objTimezone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignsignatureSignV1ResponseMPayload {\n");
    sb.append("    dtEzsignsignatureDateInFolderTimezone: ").append(toIndentedString(dtEzsignsignatureDateInFolderTimezone)).append("\n");
    sb.append("    objTimezone: ").append(toIndentedString(objTimezone)).append("\n");
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
    openapiFields.add("dtEzsignsignatureDateInFolderTimezone");
    openapiFields.add("objTimezone");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("dtEzsignsignatureDateInFolderTimezone");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EzsignsignatureSignV1ResponseMPayload
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EzsignsignatureSignV1ResponseMPayload.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EzsignsignatureSignV1ResponseMPayload is not found in the empty JSON string", EzsignsignatureSignV1ResponseMPayload.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EzsignsignatureSignV1ResponseMPayload.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EzsignsignatureSignV1ResponseMPayload` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EzsignsignatureSignV1ResponseMPayload.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("dtEzsignsignatureDateInFolderTimezone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dtEzsignsignatureDateInFolderTimezone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dtEzsignsignatureDateInFolderTimezone").toString()));
      }
      // validate the optional field `objTimezone`
      if (jsonObj.get("objTimezone") != null && !jsonObj.get("objTimezone").isJsonNull()) {
        CustomTimezoneWithCodeResponse.validateJsonElement(jsonObj.get("objTimezone"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EzsignsignatureSignV1ResponseMPayload.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EzsignsignatureSignV1ResponseMPayload' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EzsignsignatureSignV1ResponseMPayload> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EzsignsignatureSignV1ResponseMPayload.class));

       return (TypeAdapter<T>) new TypeAdapter<EzsignsignatureSignV1ResponseMPayload>() {
           @Override
           public void write(JsonWriter out, EzsignsignatureSignV1ResponseMPayload value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EzsignsignatureSignV1ResponseMPayload read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EzsignsignatureSignV1ResponseMPayload given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EzsignsignatureSignV1ResponseMPayload
   * @throws IOException if the JSON string is invalid with respect to EzsignsignatureSignV1ResponseMPayload
   */
  public static EzsignsignatureSignV1ResponseMPayload fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EzsignsignatureSignV1ResponseMPayload.class);
  }

  /**
   * Convert an instance of EzsignsignatureSignV1ResponseMPayload to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

