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
import com.ezmax.api.model.CreditcardmerchantAutocompleteElementResponse;
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

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import eZmaxAPI.JSON;

/**
 * Payload for POST /2/object/creditcardmerchant/getAutocomplete
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-07T19:20:13.445471985Z[Etc/UTC]", comments = "Generator version: 7.12.0")
public class CreditcardmerchantGetAutocompleteV2ResponseMPayload {
  public static final String SERIALIZED_NAME_A_OBJ_CREDITCARDMERCHANT = "a_objCreditcardmerchant";
  @SerializedName(SERIALIZED_NAME_A_OBJ_CREDITCARDMERCHANT)
  @javax.annotation.Nonnull
  private List<CreditcardmerchantAutocompleteElementResponse> aObjCreditcardmerchant = new ArrayList<>();

  public CreditcardmerchantGetAutocompleteV2ResponseMPayload() {
  }

  public CreditcardmerchantGetAutocompleteV2ResponseMPayload aObjCreditcardmerchant(@javax.annotation.Nonnull List<CreditcardmerchantAutocompleteElementResponse> aObjCreditcardmerchant) {
    this.aObjCreditcardmerchant = aObjCreditcardmerchant;
    return this;
  }

  public CreditcardmerchantGetAutocompleteV2ResponseMPayload addAObjCreditcardmerchantItem(CreditcardmerchantAutocompleteElementResponse aObjCreditcardmerchantItem) {
    if (this.aObjCreditcardmerchant == null) {
      this.aObjCreditcardmerchant = new ArrayList<>();
    }
    this.aObjCreditcardmerchant.add(aObjCreditcardmerchantItem);
    return this;
  }

  /**
   * An array of Creditcardmerchant autocomplete element response.
   * @return aObjCreditcardmerchant
   */
  @javax.annotation.Nonnull
  public List<CreditcardmerchantAutocompleteElementResponse> getaObjCreditcardmerchant() {
    return aObjCreditcardmerchant;
  }

  public void setaObjCreditcardmerchant(@javax.annotation.Nonnull List<CreditcardmerchantAutocompleteElementResponse> aObjCreditcardmerchant) {
    this.aObjCreditcardmerchant = aObjCreditcardmerchant;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditcardmerchantGetAutocompleteV2ResponseMPayload creditcardmerchantGetAutocompleteV2ResponseMPayload = (CreditcardmerchantGetAutocompleteV2ResponseMPayload) o;
    return Objects.equals(this.aObjCreditcardmerchant, creditcardmerchantGetAutocompleteV2ResponseMPayload.aObjCreditcardmerchant);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aObjCreditcardmerchant);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditcardmerchantGetAutocompleteV2ResponseMPayload {\n");
    sb.append("    aObjCreditcardmerchant: ").append(toIndentedString(aObjCreditcardmerchant)).append("\n");
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
    openapiFields.add("a_objCreditcardmerchant");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("a_objCreditcardmerchant");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreditcardmerchantGetAutocompleteV2ResponseMPayload
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreditcardmerchantGetAutocompleteV2ResponseMPayload.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreditcardmerchantGetAutocompleteV2ResponseMPayload is not found in the empty JSON string", CreditcardmerchantGetAutocompleteV2ResponseMPayload.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreditcardmerchantGetAutocompleteV2ResponseMPayload.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreditcardmerchantGetAutocompleteV2ResponseMPayload` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreditcardmerchantGetAutocompleteV2ResponseMPayload.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("a_objCreditcardmerchant").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `a_objCreditcardmerchant` to be an array in the JSON string but got `%s`", jsonObj.get("a_objCreditcardmerchant").toString()));
      }

      JsonArray jsonArrayaObjCreditcardmerchant = jsonObj.getAsJsonArray("a_objCreditcardmerchant");
      // validate the required field `a_objCreditcardmerchant` (array)
      for (int i = 0; i < jsonArrayaObjCreditcardmerchant.size(); i++) {
        CreditcardmerchantAutocompleteElementResponse.validateJsonElement(jsonArrayaObjCreditcardmerchant.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreditcardmerchantGetAutocompleteV2ResponseMPayload.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreditcardmerchantGetAutocompleteV2ResponseMPayload' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreditcardmerchantGetAutocompleteV2ResponseMPayload> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreditcardmerchantGetAutocompleteV2ResponseMPayload.class));

       return (TypeAdapter<T>) new TypeAdapter<CreditcardmerchantGetAutocompleteV2ResponseMPayload>() {
           @Override
           public void write(JsonWriter out, CreditcardmerchantGetAutocompleteV2ResponseMPayload value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreditcardmerchantGetAutocompleteV2ResponseMPayload read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreditcardmerchantGetAutocompleteV2ResponseMPayload given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreditcardmerchantGetAutocompleteV2ResponseMPayload
   * @throws IOException if the JSON string is invalid with respect to CreditcardmerchantGetAutocompleteV2ResponseMPayload
   */
  public static CreditcardmerchantGetAutocompleteV2ResponseMPayload fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreditcardmerchantGetAutocompleteV2ResponseMPayload.class);
  }

  /**
   * Convert an instance of CreditcardmerchantGetAutocompleteV2ResponseMPayload to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

