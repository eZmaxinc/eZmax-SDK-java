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
import com.ezmax.api.model.SignatureRequestCompound;
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
 * Request for PUT /1/object/signature/{pkiSignatureID}
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-27T18:40:35.791662503Z[Etc/UTC]")
public class SignatureEditObjectV1Request {
  public static final String SERIALIZED_NAME_OBJ_SIGNATURE = "objSignature";
  @SerializedName(SERIALIZED_NAME_OBJ_SIGNATURE)
  private SignatureRequestCompound objSignature;

  public SignatureEditObjectV1Request() {
  }

  public SignatureEditObjectV1Request objSignature(SignatureRequestCompound objSignature) {
    
    this.objSignature = objSignature;
    return this;
  }

   /**
   * Get objSignature
   * @return objSignature
  **/
  @javax.annotation.Nonnull
  public SignatureRequestCompound getObjSignature() {
    return objSignature;
  }


  public void setObjSignature(SignatureRequestCompound objSignature) {
    this.objSignature = objSignature;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SignatureEditObjectV1Request signatureEditObjectV1Request = (SignatureEditObjectV1Request) o;
    return Objects.equals(this.objSignature, signatureEditObjectV1Request.objSignature);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objSignature);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignatureEditObjectV1Request {\n");
    sb.append("    objSignature: ").append(toIndentedString(objSignature)).append("\n");
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
    openapiFields.add("objSignature");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("objSignature");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SignatureEditObjectV1Request
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SignatureEditObjectV1Request.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SignatureEditObjectV1Request is not found in the empty JSON string", SignatureEditObjectV1Request.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SignatureEditObjectV1Request.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SignatureEditObjectV1Request` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SignatureEditObjectV1Request.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the required field `objSignature`
      SignatureRequestCompound.validateJsonObject(jsonObj.getAsJsonObject("objSignature"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SignatureEditObjectV1Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SignatureEditObjectV1Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SignatureEditObjectV1Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SignatureEditObjectV1Request.class));

       return (TypeAdapter<T>) new TypeAdapter<SignatureEditObjectV1Request>() {
           @Override
           public void write(JsonWriter out, SignatureEditObjectV1Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SignatureEditObjectV1Request read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SignatureEditObjectV1Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SignatureEditObjectV1Request
  * @throws IOException if the JSON string is invalid with respect to SignatureEditObjectV1Request
  */
  public static SignatureEditObjectV1Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SignatureEditObjectV1Request.class);
  }

 /**
  * Convert an instance of SignatureEditObjectV1Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
