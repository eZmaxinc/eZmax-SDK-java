/*
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.2.0
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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import eZmaxAPI.JSON;

/**
 * A webhookheader object
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-28T04:04:06.974848816Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class WebhookheaderRequest {
  public static final String SERIALIZED_NAME_PKI_WEBHOOKHEADER_I_D = "pkiWebhookheaderID";
  @SerializedName(SERIALIZED_NAME_PKI_WEBHOOKHEADER_I_D)
  private Integer pkiWebhookheaderID;

  public static final String SERIALIZED_NAME_S_WEBHOOKHEADER_NAME = "sWebhookheaderName";
  @SerializedName(SERIALIZED_NAME_S_WEBHOOKHEADER_NAME)
  private String sWebhookheaderName;

  public static final String SERIALIZED_NAME_S_WEBHOOKHEADER_VALUE = "sWebhookheaderValue";
  @SerializedName(SERIALIZED_NAME_S_WEBHOOKHEADER_VALUE)
  private String sWebhookheaderValue;

  public WebhookheaderRequest() {
  }

  public WebhookheaderRequest pkiWebhookheaderID(Integer pkiWebhookheaderID) {
    this.pkiWebhookheaderID = pkiWebhookheaderID;
    return this;
  }

   /**
   * The unique ID of the Webhookheader
   * @return pkiWebhookheaderID
  **/
  @javax.annotation.Nullable
  public Integer getPkiWebhookheaderID() {
    return pkiWebhookheaderID;
  }

  public void setPkiWebhookheaderID(Integer pkiWebhookheaderID) {
    this.pkiWebhookheaderID = pkiWebhookheaderID;
  }


  public WebhookheaderRequest sWebhookheaderName(String sWebhookheaderName) {
    this.sWebhookheaderName = sWebhookheaderName;
    return this;
  }

   /**
   * The Name of the Webhookheader
   * @return sWebhookheaderName
  **/
  @javax.annotation.Nonnull
  public String getsWebhookheaderName() {
    return sWebhookheaderName;
  }

  public void setsWebhookheaderName(String sWebhookheaderName) {
    this.sWebhookheaderName = sWebhookheaderName;
  }


  public WebhookheaderRequest sWebhookheaderValue(String sWebhookheaderValue) {
    this.sWebhookheaderValue = sWebhookheaderValue;
    return this;
  }

   /**
   * The Value of the Webhookheader
   * @return sWebhookheaderValue
  **/
  @javax.annotation.Nonnull
  public String getsWebhookheaderValue() {
    return sWebhookheaderValue;
  }

  public void setsWebhookheaderValue(String sWebhookheaderValue) {
    this.sWebhookheaderValue = sWebhookheaderValue;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookheaderRequest webhookheaderRequest = (WebhookheaderRequest) o;
    return Objects.equals(this.pkiWebhookheaderID, webhookheaderRequest.pkiWebhookheaderID) &&
        Objects.equals(this.sWebhookheaderName, webhookheaderRequest.sWebhookheaderName) &&
        Objects.equals(this.sWebhookheaderValue, webhookheaderRequest.sWebhookheaderValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pkiWebhookheaderID, sWebhookheaderName, sWebhookheaderValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookheaderRequest {\n");
    sb.append("    pkiWebhookheaderID: ").append(toIndentedString(pkiWebhookheaderID)).append("\n");
    sb.append("    sWebhookheaderName: ").append(toIndentedString(sWebhookheaderName)).append("\n");
    sb.append("    sWebhookheaderValue: ").append(toIndentedString(sWebhookheaderValue)).append("\n");
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
    openapiFields.add("pkiWebhookheaderID");
    openapiFields.add("sWebhookheaderName");
    openapiFields.add("sWebhookheaderValue");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("sWebhookheaderName");
    openapiRequiredFields.add("sWebhookheaderValue");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to WebhookheaderRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!WebhookheaderRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WebhookheaderRequest is not found in the empty JSON string", WebhookheaderRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!WebhookheaderRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WebhookheaderRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : WebhookheaderRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("sWebhookheaderName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sWebhookheaderName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sWebhookheaderName").toString()));
      }
      if (!jsonObj.get("sWebhookheaderValue").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sWebhookheaderValue` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sWebhookheaderValue").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WebhookheaderRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WebhookheaderRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WebhookheaderRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WebhookheaderRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<WebhookheaderRequest>() {
           @Override
           public void write(JsonWriter out, WebhookheaderRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WebhookheaderRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of WebhookheaderRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WebhookheaderRequest
  * @throws IOException if the JSON string is invalid with respect to WebhookheaderRequest
  */
  public static WebhookheaderRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WebhookheaderRequest.class);
  }

 /**
  * Convert an instance of WebhookheaderRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
