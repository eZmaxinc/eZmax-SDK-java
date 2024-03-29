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
 * Request for POST /1/object/ezsigndocument/{pkiEzsigndocumentID}/declineToSign
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-22T15:33:11.356591451Z[Etc/UTC]")
public class EzsigndocumentDeclineToSignV1Request {
  public static final String SERIALIZED_NAME_S_REASON = "sReason";
  @SerializedName(SERIALIZED_NAME_S_REASON)
  private String sReason;

  public EzsigndocumentDeclineToSignV1Request() {
  }

  public EzsigndocumentDeclineToSignV1Request sReason(String sReason) {
    
    this.sReason = sReason;
    return this;
  }

   /**
   * Reason for refusal
   * @return sReason
  **/
  @javax.annotation.Nonnull
  public String getsReason() {
    return sReason;
  }


  public void setsReason(String sReason) {
    this.sReason = sReason;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsigndocumentDeclineToSignV1Request ezsigndocumentDeclineToSignV1Request = (EzsigndocumentDeclineToSignV1Request) o;
    return Objects.equals(this.sReason, ezsigndocumentDeclineToSignV1Request.sReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sReason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsigndocumentDeclineToSignV1Request {\n");
    sb.append("    sReason: ").append(toIndentedString(sReason)).append("\n");
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
    openapiFields.add("sReason");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("sReason");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EzsigndocumentDeclineToSignV1Request
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!EzsigndocumentDeclineToSignV1Request.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EzsigndocumentDeclineToSignV1Request is not found in the empty JSON string", EzsigndocumentDeclineToSignV1Request.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!EzsigndocumentDeclineToSignV1Request.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EzsigndocumentDeclineToSignV1Request` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EzsigndocumentDeclineToSignV1Request.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("sReason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sReason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sReason").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EzsigndocumentDeclineToSignV1Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EzsigndocumentDeclineToSignV1Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EzsigndocumentDeclineToSignV1Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EzsigndocumentDeclineToSignV1Request.class));

       return (TypeAdapter<T>) new TypeAdapter<EzsigndocumentDeclineToSignV1Request>() {
           @Override
           public void write(JsonWriter out, EzsigndocumentDeclineToSignV1Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EzsigndocumentDeclineToSignV1Request read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EzsigndocumentDeclineToSignV1Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EzsigndocumentDeclineToSignV1Request
  * @throws IOException if the JSON string is invalid with respect to EzsigndocumentDeclineToSignV1Request
  */
  public static EzsigndocumentDeclineToSignV1Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EzsigndocumentDeclineToSignV1Request.class);
  }

 /**
  * Convert an instance of EzsigndocumentDeclineToSignV1Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

