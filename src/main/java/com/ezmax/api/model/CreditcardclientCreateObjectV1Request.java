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
import com.ezmax.api.model.CreditcardclientRequestCompound;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
 * Request for POST /1/object/creditcardclient
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-14T23:45:44.203418720Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CreditcardclientCreateObjectV1Request {
  public static final String SERIALIZED_NAME_A_OBJ_CREDITCARDCLIENT = "a_objCreditcardclient";
  @SerializedName(SERIALIZED_NAME_A_OBJ_CREDITCARDCLIENT)
  private List<CreditcardclientRequestCompound> aObjCreditcardclient = new ArrayList<>();

  public CreditcardclientCreateObjectV1Request() {
  }

  public CreditcardclientCreateObjectV1Request aObjCreditcardclient(List<CreditcardclientRequestCompound> aObjCreditcardclient) {
    this.aObjCreditcardclient = aObjCreditcardclient;
    return this;
  }

  public CreditcardclientCreateObjectV1Request addAObjCreditcardclientItem(CreditcardclientRequestCompound aObjCreditcardclientItem) {
    if (this.aObjCreditcardclient == null) {
      this.aObjCreditcardclient = new ArrayList<>();
    }
    this.aObjCreditcardclient.add(aObjCreditcardclientItem);
    return this;
  }

   /**
   * Get aObjCreditcardclient
   * @return aObjCreditcardclient
  **/
  @javax.annotation.Nonnull
  public List<CreditcardclientRequestCompound> getaObjCreditcardclient() {
    return aObjCreditcardclient;
  }

  public void setaObjCreditcardclient(List<CreditcardclientRequestCompound> aObjCreditcardclient) {
    this.aObjCreditcardclient = aObjCreditcardclient;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditcardclientCreateObjectV1Request creditcardclientCreateObjectV1Request = (CreditcardclientCreateObjectV1Request) o;
    return Objects.equals(this.aObjCreditcardclient, creditcardclientCreateObjectV1Request.aObjCreditcardclient);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aObjCreditcardclient);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditcardclientCreateObjectV1Request {\n");
    sb.append("    aObjCreditcardclient: ").append(toIndentedString(aObjCreditcardclient)).append("\n");
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
    openapiFields.add("a_objCreditcardclient");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("a_objCreditcardclient");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreditcardclientCreateObjectV1Request
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreditcardclientCreateObjectV1Request.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreditcardclientCreateObjectV1Request is not found in the empty JSON string", CreditcardclientCreateObjectV1Request.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreditcardclientCreateObjectV1Request.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreditcardclientCreateObjectV1Request` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreditcardclientCreateObjectV1Request.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("a_objCreditcardclient").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `a_objCreditcardclient` to be an array in the JSON string but got `%s`", jsonObj.get("a_objCreditcardclient").toString()));
      }

      JsonArray jsonArrayaObjCreditcardclient = jsonObj.getAsJsonArray("a_objCreditcardclient");
      // validate the required field `a_objCreditcardclient` (array)
      for (int i = 0; i < jsonArrayaObjCreditcardclient.size(); i++) {
        CreditcardclientRequestCompound.validateJsonElement(jsonArrayaObjCreditcardclient.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreditcardclientCreateObjectV1Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreditcardclientCreateObjectV1Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreditcardclientCreateObjectV1Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreditcardclientCreateObjectV1Request.class));

       return (TypeAdapter<T>) new TypeAdapter<CreditcardclientCreateObjectV1Request>() {
           @Override
           public void write(JsonWriter out, CreditcardclientCreateObjectV1Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreditcardclientCreateObjectV1Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreditcardclientCreateObjectV1Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreditcardclientCreateObjectV1Request
  * @throws IOException if the JSON string is invalid with respect to CreditcardclientCreateObjectV1Request
  */
  public static CreditcardclientCreateObjectV1Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreditcardclientCreateObjectV1Request.class);
  }

 /**
  * Convert an instance of CreditcardclientCreateObjectV1Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
