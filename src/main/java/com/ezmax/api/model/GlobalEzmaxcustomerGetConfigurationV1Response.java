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
 * Response for GET /1/ezmaxcustomer/{pksEzmaxcustomerCode}/getConfiguration
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-07T19:20:13.445471985Z[Etc/UTC]", comments = "Generator version: 7.12.0")
public class GlobalEzmaxcustomerGetConfigurationV1Response {
  public static final String SERIALIZED_NAME_S_INFRASTRUCTUREREGION_CODE = "sInfrastructureregionCode";
  @SerializedName(SERIALIZED_NAME_S_INFRASTRUCTUREREGION_CODE)
  @javax.annotation.Nonnull
  private String sInfrastructureregionCode;

  public static final String SERIALIZED_NAME_S_INFRASTRUCTUREREGION_CODE_WEB = "sInfrastructureregionCodeWeb";
  @SerializedName(SERIALIZED_NAME_S_INFRASTRUCTUREREGION_CODE_WEB)
  @javax.annotation.Nonnull
  private String sInfrastructureregionCodeWeb;

  public static final String SERIALIZED_NAME_S_INFRASTRUCTUREENVIRONMENTTYPE_DESCRIPTION = "sInfrastructureenvironmenttypeDescription";
  @SerializedName(SERIALIZED_NAME_S_INFRASTRUCTUREENVIRONMENTTYPE_DESCRIPTION)
  @javax.annotation.Nonnull
  private String sInfrastructureenvironmenttypeDescription;

  public static final String SERIALIZED_NAME_S_COGNITO_CLIENT_I_D_EXTERNAL = "sCognitoClientIDExternal";
  @SerializedName(SERIALIZED_NAME_S_COGNITO_CLIENT_I_D_EXTERNAL)
  @javax.annotation.Nullable
  private String sCognitoClientIDExternal;

  public static final String SERIALIZED_NAME_S_COGNITO_CLIENT_I_D_EZMAXPUBLIC = "sCognitoClientIDEzmaxpublic";
  @SerializedName(SERIALIZED_NAME_S_COGNITO_CLIENT_I_D_EZMAXPUBLIC)
  @javax.annotation.Nonnull
  private String sCognitoClientIDEzmaxpublic;

  public GlobalEzmaxcustomerGetConfigurationV1Response() {
  }

  public GlobalEzmaxcustomerGetConfigurationV1Response sInfrastructureregionCode(@javax.annotation.Nonnull String sInfrastructureregionCode) {
    this.sInfrastructureregionCode = sInfrastructureregionCode;
    return this;
  }

  /**
   * The region code
   * @return sInfrastructureregionCode
   */
  @javax.annotation.Nonnull
  public String getsInfrastructureregionCode() {
    return sInfrastructureregionCode;
  }

  public void setsInfrastructureregionCode(@javax.annotation.Nonnull String sInfrastructureregionCode) {
    this.sInfrastructureregionCode = sInfrastructureregionCode;
  }


  public GlobalEzmaxcustomerGetConfigurationV1Response sInfrastructureregionCodeWeb(@javax.annotation.Nonnull String sInfrastructureregionCodeWeb) {
    this.sInfrastructureregionCodeWeb = sInfrastructureregionCodeWeb;
    return this;
  }

  /**
   * The region code
   * @return sInfrastructureregionCodeWeb
   */
  @javax.annotation.Nonnull
  public String getsInfrastructureregionCodeWeb() {
    return sInfrastructureregionCodeWeb;
  }

  public void setsInfrastructureregionCodeWeb(@javax.annotation.Nonnull String sInfrastructureregionCodeWeb) {
    this.sInfrastructureregionCodeWeb = sInfrastructureregionCodeWeb;
  }


  public GlobalEzmaxcustomerGetConfigurationV1Response sInfrastructureenvironmenttypeDescription(@javax.annotation.Nonnull String sInfrastructureenvironmenttypeDescription) {
    this.sInfrastructureenvironmenttypeDescription = sInfrastructureenvironmenttypeDescription;
    return this;
  }

  /**
   * The environment type Description
   * @return sInfrastructureenvironmenttypeDescription
   */
  @javax.annotation.Nonnull
  public String getsInfrastructureenvironmenttypeDescription() {
    return sInfrastructureenvironmenttypeDescription;
  }

  public void setsInfrastructureenvironmenttypeDescription(@javax.annotation.Nonnull String sInfrastructureenvironmenttypeDescription) {
    this.sInfrastructureenvironmenttypeDescription = sInfrastructureenvironmenttypeDescription;
  }


  public GlobalEzmaxcustomerGetConfigurationV1Response sCognitoClientIDExternal(@javax.annotation.Nullable String sCognitoClientIDExternal) {
    this.sCognitoClientIDExternal = sCognitoClientIDExternal;
    return this;
  }

  /**
   * The ID of the client in Cognito
   * @return sCognitoClientIDExternal
   */
  @javax.annotation.Nullable
  public String getsCognitoClientIDExternal() {
    return sCognitoClientIDExternal;
  }

  public void setsCognitoClientIDExternal(@javax.annotation.Nullable String sCognitoClientIDExternal) {
    this.sCognitoClientIDExternal = sCognitoClientIDExternal;
  }


  public GlobalEzmaxcustomerGetConfigurationV1Response sCognitoClientIDEzmaxpublic(@javax.annotation.Nonnull String sCognitoClientIDEzmaxpublic) {
    this.sCognitoClientIDEzmaxpublic = sCognitoClientIDEzmaxpublic;
    return this;
  }

  /**
   * The ID of the client in Cognito
   * @return sCognitoClientIDEzmaxpublic
   */
  @javax.annotation.Nonnull
  public String getsCognitoClientIDEzmaxpublic() {
    return sCognitoClientIDEzmaxpublic;
  }

  public void setsCognitoClientIDEzmaxpublic(@javax.annotation.Nonnull String sCognitoClientIDEzmaxpublic) {
    this.sCognitoClientIDEzmaxpublic = sCognitoClientIDEzmaxpublic;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GlobalEzmaxcustomerGetConfigurationV1Response globalEzmaxcustomerGetConfigurationV1Response = (GlobalEzmaxcustomerGetConfigurationV1Response) o;
    return Objects.equals(this.sInfrastructureregionCode, globalEzmaxcustomerGetConfigurationV1Response.sInfrastructureregionCode) &&
        Objects.equals(this.sInfrastructureregionCodeWeb, globalEzmaxcustomerGetConfigurationV1Response.sInfrastructureregionCodeWeb) &&
        Objects.equals(this.sInfrastructureenvironmenttypeDescription, globalEzmaxcustomerGetConfigurationV1Response.sInfrastructureenvironmenttypeDescription) &&
        Objects.equals(this.sCognitoClientIDExternal, globalEzmaxcustomerGetConfigurationV1Response.sCognitoClientIDExternal) &&
        Objects.equals(this.sCognitoClientIDEzmaxpublic, globalEzmaxcustomerGetConfigurationV1Response.sCognitoClientIDEzmaxpublic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sInfrastructureregionCode, sInfrastructureregionCodeWeb, sInfrastructureenvironmenttypeDescription, sCognitoClientIDExternal, sCognitoClientIDEzmaxpublic);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GlobalEzmaxcustomerGetConfigurationV1Response {\n");
    sb.append("    sInfrastructureregionCode: ").append(toIndentedString(sInfrastructureregionCode)).append("\n");
    sb.append("    sInfrastructureregionCodeWeb: ").append(toIndentedString(sInfrastructureregionCodeWeb)).append("\n");
    sb.append("    sInfrastructureenvironmenttypeDescription: ").append(toIndentedString(sInfrastructureenvironmenttypeDescription)).append("\n");
    sb.append("    sCognitoClientIDExternal: ").append(toIndentedString(sCognitoClientIDExternal)).append("\n");
    sb.append("    sCognitoClientIDEzmaxpublic: ").append(toIndentedString(sCognitoClientIDEzmaxpublic)).append("\n");
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
    openapiFields.add("sInfrastructureregionCode");
    openapiFields.add("sInfrastructureregionCodeWeb");
    openapiFields.add("sInfrastructureenvironmenttypeDescription");
    openapiFields.add("sCognitoClientIDExternal");
    openapiFields.add("sCognitoClientIDEzmaxpublic");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("sInfrastructureregionCode");
    openapiRequiredFields.add("sInfrastructureregionCodeWeb");
    openapiRequiredFields.add("sInfrastructureenvironmenttypeDescription");
    openapiRequiredFields.add("sCognitoClientIDEzmaxpublic");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GlobalEzmaxcustomerGetConfigurationV1Response
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GlobalEzmaxcustomerGetConfigurationV1Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GlobalEzmaxcustomerGetConfigurationV1Response is not found in the empty JSON string", GlobalEzmaxcustomerGetConfigurationV1Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GlobalEzmaxcustomerGetConfigurationV1Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GlobalEzmaxcustomerGetConfigurationV1Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GlobalEzmaxcustomerGetConfigurationV1Response.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("sInfrastructureregionCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sInfrastructureregionCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sInfrastructureregionCode").toString()));
      }
      if (!jsonObj.get("sInfrastructureregionCodeWeb").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sInfrastructureregionCodeWeb` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sInfrastructureregionCodeWeb").toString()));
      }
      if (!jsonObj.get("sInfrastructureenvironmenttypeDescription").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sInfrastructureenvironmenttypeDescription` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sInfrastructureenvironmenttypeDescription").toString()));
      }
      if ((jsonObj.get("sCognitoClientIDExternal") != null && !jsonObj.get("sCognitoClientIDExternal").isJsonNull()) && !jsonObj.get("sCognitoClientIDExternal").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sCognitoClientIDExternal` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sCognitoClientIDExternal").toString()));
      }
      if (!jsonObj.get("sCognitoClientIDEzmaxpublic").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sCognitoClientIDEzmaxpublic` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sCognitoClientIDEzmaxpublic").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GlobalEzmaxcustomerGetConfigurationV1Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GlobalEzmaxcustomerGetConfigurationV1Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GlobalEzmaxcustomerGetConfigurationV1Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GlobalEzmaxcustomerGetConfigurationV1Response.class));

       return (TypeAdapter<T>) new TypeAdapter<GlobalEzmaxcustomerGetConfigurationV1Response>() {
           @Override
           public void write(JsonWriter out, GlobalEzmaxcustomerGetConfigurationV1Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GlobalEzmaxcustomerGetConfigurationV1Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GlobalEzmaxcustomerGetConfigurationV1Response given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GlobalEzmaxcustomerGetConfigurationV1Response
   * @throws IOException if the JSON string is invalid with respect to GlobalEzmaxcustomerGetConfigurationV1Response
   */
  public static GlobalEzmaxcustomerGetConfigurationV1Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GlobalEzmaxcustomerGetConfigurationV1Response.class);
  }

  /**
   * Convert an instance of GlobalEzmaxcustomerGetConfigurationV1Response to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

