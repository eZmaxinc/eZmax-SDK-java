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
 * A complex type that specifies bulk configuration options.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-27T18:40:35.791662503Z[Etc/UTC]")
public class ScimServiceProviderConfigBulk {
  public static final String SERIALIZED_NAME_SUPPORTED = "supported";
  @SerializedName(SERIALIZED_NAME_SUPPORTED)
  private Boolean supported;

  public static final String SERIALIZED_NAME_MAX_OPERATIONS = "maxOperations";
  @SerializedName(SERIALIZED_NAME_MAX_OPERATIONS)
  private Integer maxOperations;

  public static final String SERIALIZED_NAME_MAX_PAYLOAD_SIZE = "maxPayloadSize";
  @SerializedName(SERIALIZED_NAME_MAX_PAYLOAD_SIZE)
  private Integer maxPayloadSize;

  public ScimServiceProviderConfigBulk() {
  }

  public ScimServiceProviderConfigBulk supported(Boolean supported) {
    
    this.supported = supported;
    return this;
  }

   /**
   * A Boolean value specifying whether or not the operation is supported.
   * @return supported
  **/
  @javax.annotation.Nonnull
  public Boolean getSupported() {
    return supported;
  }


  public void setSupported(Boolean supported) {
    this.supported = supported;
  }


  public ScimServiceProviderConfigBulk maxOperations(Integer maxOperations) {
    
    this.maxOperations = maxOperations;
    return this;
  }

   /**
   * An integer value specifying the maximum number of operations.
   * @return maxOperations
  **/
  @javax.annotation.Nonnull
  public Integer getMaxOperations() {
    return maxOperations;
  }


  public void setMaxOperations(Integer maxOperations) {
    this.maxOperations = maxOperations;
  }


  public ScimServiceProviderConfigBulk maxPayloadSize(Integer maxPayloadSize) {
    
    this.maxPayloadSize = maxPayloadSize;
    return this;
  }

   /**
   * An integer value specifying the maximum payload size in bytes.
   * @return maxPayloadSize
  **/
  @javax.annotation.Nonnull
  public Integer getMaxPayloadSize() {
    return maxPayloadSize;
  }


  public void setMaxPayloadSize(Integer maxPayloadSize) {
    this.maxPayloadSize = maxPayloadSize;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScimServiceProviderConfigBulk scimServiceProviderConfigBulk = (ScimServiceProviderConfigBulk) o;
    return Objects.equals(this.supported, scimServiceProviderConfigBulk.supported) &&
        Objects.equals(this.maxOperations, scimServiceProviderConfigBulk.maxOperations) &&
        Objects.equals(this.maxPayloadSize, scimServiceProviderConfigBulk.maxPayloadSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(supported, maxOperations, maxPayloadSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScimServiceProviderConfigBulk {\n");
    sb.append("    supported: ").append(toIndentedString(supported)).append("\n");
    sb.append("    maxOperations: ").append(toIndentedString(maxOperations)).append("\n");
    sb.append("    maxPayloadSize: ").append(toIndentedString(maxPayloadSize)).append("\n");
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
    openapiFields.add("supported");
    openapiFields.add("maxOperations");
    openapiFields.add("maxPayloadSize");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("supported");
    openapiRequiredFields.add("maxOperations");
    openapiRequiredFields.add("maxPayloadSize");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ScimServiceProviderConfigBulk
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ScimServiceProviderConfigBulk.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ScimServiceProviderConfigBulk is not found in the empty JSON string", ScimServiceProviderConfigBulk.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ScimServiceProviderConfigBulk.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ScimServiceProviderConfigBulk` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ScimServiceProviderConfigBulk.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ScimServiceProviderConfigBulk.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ScimServiceProviderConfigBulk' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ScimServiceProviderConfigBulk> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ScimServiceProviderConfigBulk.class));

       return (TypeAdapter<T>) new TypeAdapter<ScimServiceProviderConfigBulk>() {
           @Override
           public void write(JsonWriter out, ScimServiceProviderConfigBulk value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ScimServiceProviderConfigBulk read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ScimServiceProviderConfigBulk given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ScimServiceProviderConfigBulk
  * @throws IOException if the JSON string is invalid with respect to ScimServiceProviderConfigBulk
  */
  public static ScimServiceProviderConfigBulk fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ScimServiceProviderConfigBulk.class);
  }

 /**
  * Convert an instance of ScimServiceProviderConfigBulk to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
