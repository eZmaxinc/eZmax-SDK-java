/*
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.2.1
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ezmax.api.model;

import java.util.Objects;
import com.ezmax.api.model.CreditcardclientResponseCompound;
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
 * Payload for GET /2/object/creditcardclient/{pkiCreditcardclientID}
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-14T23:45:44.203418720Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CreditcardclientGetObjectV2ResponseMPayload {
  public static final String SERIALIZED_NAME_OBJ_CREDITCARDCLIENT = "objCreditcardclient";
  @SerializedName(SERIALIZED_NAME_OBJ_CREDITCARDCLIENT)
  private CreditcardclientResponseCompound objCreditcardclient;

  public CreditcardclientGetObjectV2ResponseMPayload() {
  }

  public CreditcardclientGetObjectV2ResponseMPayload objCreditcardclient(CreditcardclientResponseCompound objCreditcardclient) {
    this.objCreditcardclient = objCreditcardclient;
    return this;
  }

   /**
   * Get objCreditcardclient
   * @return objCreditcardclient
  **/
  @javax.annotation.Nonnull
  public CreditcardclientResponseCompound getObjCreditcardclient() {
    return objCreditcardclient;
  }

  public void setObjCreditcardclient(CreditcardclientResponseCompound objCreditcardclient) {
    this.objCreditcardclient = objCreditcardclient;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditcardclientGetObjectV2ResponseMPayload creditcardclientGetObjectV2ResponseMPayload = (CreditcardclientGetObjectV2ResponseMPayload) o;
    return Objects.equals(this.objCreditcardclient, creditcardclientGetObjectV2ResponseMPayload.objCreditcardclient);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objCreditcardclient);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditcardclientGetObjectV2ResponseMPayload {\n");
    sb.append("    objCreditcardclient: ").append(toIndentedString(objCreditcardclient)).append("\n");
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
    openapiFields.add("objCreditcardclient");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("objCreditcardclient");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreditcardclientGetObjectV2ResponseMPayload
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreditcardclientGetObjectV2ResponseMPayload.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreditcardclientGetObjectV2ResponseMPayload is not found in the empty JSON string", CreditcardclientGetObjectV2ResponseMPayload.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreditcardclientGetObjectV2ResponseMPayload.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreditcardclientGetObjectV2ResponseMPayload` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreditcardclientGetObjectV2ResponseMPayload.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `objCreditcardclient`
      CreditcardclientResponseCompound.validateJsonElement(jsonObj.get("objCreditcardclient"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreditcardclientGetObjectV2ResponseMPayload.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreditcardclientGetObjectV2ResponseMPayload' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreditcardclientGetObjectV2ResponseMPayload> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreditcardclientGetObjectV2ResponseMPayload.class));

       return (TypeAdapter<T>) new TypeAdapter<CreditcardclientGetObjectV2ResponseMPayload>() {
           @Override
           public void write(JsonWriter out, CreditcardclientGetObjectV2ResponseMPayload value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreditcardclientGetObjectV2ResponseMPayload read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreditcardclientGetObjectV2ResponseMPayload given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreditcardclientGetObjectV2ResponseMPayload
  * @throws IOException if the JSON string is invalid with respect to CreditcardclientGetObjectV2ResponseMPayload
  */
  public static CreditcardclientGetObjectV2ResponseMPayload fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreditcardclientGetObjectV2ResponseMPayload.class);
  }

 /**
  * Convert an instance of CreditcardclientGetObjectV2ResponseMPayload to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
