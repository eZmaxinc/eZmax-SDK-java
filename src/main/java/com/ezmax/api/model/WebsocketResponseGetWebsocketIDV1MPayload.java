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
 * Payload for Websocket GetWebsocketID V1
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-27T18:40:35.791662503Z[Etc/UTC]")
public class WebsocketResponseGetWebsocketIDV1MPayload {
  public static final String SERIALIZED_NAME_S_WEBSOCKET_I_D = "sWebsocketID";
  @SerializedName(SERIALIZED_NAME_S_WEBSOCKET_I_D)
  private String sWebsocketID;

  public WebsocketResponseGetWebsocketIDV1MPayload() {
  }

  public WebsocketResponseGetWebsocketIDV1MPayload sWebsocketID(String sWebsocketID) {
    
    this.sWebsocketID = sWebsocketID;
    return this;
  }

   /**
   * The Unique ID of the Websocket Connection
   * @return sWebsocketID
  **/
  @javax.annotation.Nonnull
  public String getsWebsocketID() {
    return sWebsocketID;
  }


  public void setsWebsocketID(String sWebsocketID) {
    this.sWebsocketID = sWebsocketID;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebsocketResponseGetWebsocketIDV1MPayload websocketResponseGetWebsocketIDV1MPayload = (WebsocketResponseGetWebsocketIDV1MPayload) o;
    return Objects.equals(this.sWebsocketID, websocketResponseGetWebsocketIDV1MPayload.sWebsocketID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sWebsocketID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebsocketResponseGetWebsocketIDV1MPayload {\n");
    sb.append("    sWebsocketID: ").append(toIndentedString(sWebsocketID)).append("\n");
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
    openapiFields.add("sWebsocketID");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("sWebsocketID");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WebsocketResponseGetWebsocketIDV1MPayload
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!WebsocketResponseGetWebsocketIDV1MPayload.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WebsocketResponseGetWebsocketIDV1MPayload is not found in the empty JSON string", WebsocketResponseGetWebsocketIDV1MPayload.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!WebsocketResponseGetWebsocketIDV1MPayload.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WebsocketResponseGetWebsocketIDV1MPayload` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : WebsocketResponseGetWebsocketIDV1MPayload.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("sWebsocketID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sWebsocketID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sWebsocketID").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WebsocketResponseGetWebsocketIDV1MPayload.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WebsocketResponseGetWebsocketIDV1MPayload' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WebsocketResponseGetWebsocketIDV1MPayload> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WebsocketResponseGetWebsocketIDV1MPayload.class));

       return (TypeAdapter<T>) new TypeAdapter<WebsocketResponseGetWebsocketIDV1MPayload>() {
           @Override
           public void write(JsonWriter out, WebsocketResponseGetWebsocketIDV1MPayload value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WebsocketResponseGetWebsocketIDV1MPayload read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of WebsocketResponseGetWebsocketIDV1MPayload given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WebsocketResponseGetWebsocketIDV1MPayload
  * @throws IOException if the JSON string is invalid with respect to WebsocketResponseGetWebsocketIDV1MPayload
  */
  public static WebsocketResponseGetWebsocketIDV1MPayload fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WebsocketResponseGetWebsocketIDV1MPayload.class);
  }

 /**
  * Convert an instance of WebsocketResponseGetWebsocketIDV1MPayload to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
