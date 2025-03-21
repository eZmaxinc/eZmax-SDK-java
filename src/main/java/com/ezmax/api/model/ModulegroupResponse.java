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
 * A Modulegroup Object
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-07T19:20:13.445471985Z[Etc/UTC]", comments = "Generator version: 7.12.0")
public class ModulegroupResponse {
  public static final String SERIALIZED_NAME_PKI_MODULEGROUP_I_D = "pkiModulegroupID";
  @SerializedName(SERIALIZED_NAME_PKI_MODULEGROUP_I_D)
  @javax.annotation.Nonnull
  private Integer pkiModulegroupID;

  public static final String SERIALIZED_NAME_S_MODULEGROUP_NAME_X = "sModulegroupNameX";
  @SerializedName(SERIALIZED_NAME_S_MODULEGROUP_NAME_X)
  @javax.annotation.Nonnull
  private String sModulegroupNameX;

  public ModulegroupResponse() {
  }

  public ModulegroupResponse pkiModulegroupID(@javax.annotation.Nonnull Integer pkiModulegroupID) {
    this.pkiModulegroupID = pkiModulegroupID;
    return this;
  }

  /**
   * The unique ID of the Modulegroup
   * minimum: 1
   * maximum: 255
   * @return pkiModulegroupID
   */
  @javax.annotation.Nonnull
  public Integer getPkiModulegroupID() {
    return pkiModulegroupID;
  }

  public void setPkiModulegroupID(@javax.annotation.Nonnull Integer pkiModulegroupID) {
    this.pkiModulegroupID = pkiModulegroupID;
  }


  public ModulegroupResponse sModulegroupNameX(@javax.annotation.Nonnull String sModulegroupNameX) {
    this.sModulegroupNameX = sModulegroupNameX;
    return this;
  }

  /**
   * The name of the Modulegroup in the language of the requester
   * @return sModulegroupNameX
   */
  @javax.annotation.Nonnull
  public String getsModulegroupNameX() {
    return sModulegroupNameX;
  }

  public void setsModulegroupNameX(@javax.annotation.Nonnull String sModulegroupNameX) {
    this.sModulegroupNameX = sModulegroupNameX;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModulegroupResponse modulegroupResponse = (ModulegroupResponse) o;
    return Objects.equals(this.pkiModulegroupID, modulegroupResponse.pkiModulegroupID) &&
        Objects.equals(this.sModulegroupNameX, modulegroupResponse.sModulegroupNameX);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pkiModulegroupID, sModulegroupNameX);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModulegroupResponse {\n");
    sb.append("    pkiModulegroupID: ").append(toIndentedString(pkiModulegroupID)).append("\n");
    sb.append("    sModulegroupNameX: ").append(toIndentedString(sModulegroupNameX)).append("\n");
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
    openapiFields.add("pkiModulegroupID");
    openapiFields.add("sModulegroupNameX");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("pkiModulegroupID");
    openapiRequiredFields.add("sModulegroupNameX");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ModulegroupResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ModulegroupResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModulegroupResponse is not found in the empty JSON string", ModulegroupResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ModulegroupResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModulegroupResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ModulegroupResponse.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("sModulegroupNameX").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sModulegroupNameX` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sModulegroupNameX").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModulegroupResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModulegroupResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModulegroupResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModulegroupResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ModulegroupResponse>() {
           @Override
           public void write(JsonWriter out, ModulegroupResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModulegroupResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ModulegroupResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ModulegroupResponse
   * @throws IOException if the JSON string is invalid with respect to ModulegroupResponse
   */
  public static ModulegroupResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModulegroupResponse.class);
  }

  /**
   * Convert an instance of ModulegroupResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

