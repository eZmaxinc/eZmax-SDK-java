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
import com.ezmax.api.model.CurrencyAutocompleteElementResponse;
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
 * Payload for POST /2/object/currency/getAutocomplete
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-07T19:20:13.445471985Z[Etc/UTC]", comments = "Generator version: 7.12.0")
public class CurrencyGetAutocompleteV2ResponseMPayload {
  public static final String SERIALIZED_NAME_A_OBJ_CURRENCY = "a_objCurrency";
  @SerializedName(SERIALIZED_NAME_A_OBJ_CURRENCY)
  @javax.annotation.Nonnull
  private List<CurrencyAutocompleteElementResponse> aObjCurrency = new ArrayList<>();

  public CurrencyGetAutocompleteV2ResponseMPayload() {
  }

  public CurrencyGetAutocompleteV2ResponseMPayload aObjCurrency(@javax.annotation.Nonnull List<CurrencyAutocompleteElementResponse> aObjCurrency) {
    this.aObjCurrency = aObjCurrency;
    return this;
  }

  public CurrencyGetAutocompleteV2ResponseMPayload addAObjCurrencyItem(CurrencyAutocompleteElementResponse aObjCurrencyItem) {
    if (this.aObjCurrency == null) {
      this.aObjCurrency = new ArrayList<>();
    }
    this.aObjCurrency.add(aObjCurrencyItem);
    return this;
  }

  /**
   * An array of Currency autocomplete element response.
   * @return aObjCurrency
   */
  @javax.annotation.Nonnull
  public List<CurrencyAutocompleteElementResponse> getaObjCurrency() {
    return aObjCurrency;
  }

  public void setaObjCurrency(@javax.annotation.Nonnull List<CurrencyAutocompleteElementResponse> aObjCurrency) {
    this.aObjCurrency = aObjCurrency;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CurrencyGetAutocompleteV2ResponseMPayload currencyGetAutocompleteV2ResponseMPayload = (CurrencyGetAutocompleteV2ResponseMPayload) o;
    return Objects.equals(this.aObjCurrency, currencyGetAutocompleteV2ResponseMPayload.aObjCurrency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aObjCurrency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurrencyGetAutocompleteV2ResponseMPayload {\n");
    sb.append("    aObjCurrency: ").append(toIndentedString(aObjCurrency)).append("\n");
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
    openapiFields.add("a_objCurrency");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("a_objCurrency");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CurrencyGetAutocompleteV2ResponseMPayload
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CurrencyGetAutocompleteV2ResponseMPayload.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CurrencyGetAutocompleteV2ResponseMPayload is not found in the empty JSON string", CurrencyGetAutocompleteV2ResponseMPayload.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CurrencyGetAutocompleteV2ResponseMPayload.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CurrencyGetAutocompleteV2ResponseMPayload` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CurrencyGetAutocompleteV2ResponseMPayload.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("a_objCurrency").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `a_objCurrency` to be an array in the JSON string but got `%s`", jsonObj.get("a_objCurrency").toString()));
      }

      JsonArray jsonArrayaObjCurrency = jsonObj.getAsJsonArray("a_objCurrency");
      // validate the required field `a_objCurrency` (array)
      for (int i = 0; i < jsonArrayaObjCurrency.size(); i++) {
        CurrencyAutocompleteElementResponse.validateJsonElement(jsonArrayaObjCurrency.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CurrencyGetAutocompleteV2ResponseMPayload.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CurrencyGetAutocompleteV2ResponseMPayload' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CurrencyGetAutocompleteV2ResponseMPayload> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CurrencyGetAutocompleteV2ResponseMPayload.class));

       return (TypeAdapter<T>) new TypeAdapter<CurrencyGetAutocompleteV2ResponseMPayload>() {
           @Override
           public void write(JsonWriter out, CurrencyGetAutocompleteV2ResponseMPayload value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CurrencyGetAutocompleteV2ResponseMPayload read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CurrencyGetAutocompleteV2ResponseMPayload given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CurrencyGetAutocompleteV2ResponseMPayload
   * @throws IOException if the JSON string is invalid with respect to CurrencyGetAutocompleteV2ResponseMPayload
   */
  public static CurrencyGetAutocompleteV2ResponseMPayload fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CurrencyGetAutocompleteV2ResponseMPayload.class);
  }

  /**
   * Convert an instance of CurrencyGetAutocompleteV2ResponseMPayload to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

