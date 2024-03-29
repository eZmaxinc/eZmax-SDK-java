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
import com.ezmax.api.model.PaymenttermAutocompleteElementResponse;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
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
import java.util.Map.Entry;
import java.util.Set;

import eZmaxAPI.JSON;

/**
 * Payload for POST /2/object/paymentterm/getAutocomplete
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-22T15:33:11.356591451Z[Etc/UTC]")
public class PaymenttermGetAutocompleteV2ResponseMPayload {
  public static final String SERIALIZED_NAME_A_OBJ_PAYMENTTERM = "a_objPaymentterm";
  @SerializedName(SERIALIZED_NAME_A_OBJ_PAYMENTTERM)
  private List<PaymenttermAutocompleteElementResponse> aObjPaymentterm;

  public PaymenttermGetAutocompleteV2ResponseMPayload() {
  }

  public PaymenttermGetAutocompleteV2ResponseMPayload aObjPaymentterm(List<PaymenttermAutocompleteElementResponse> aObjPaymentterm) {
    
    this.aObjPaymentterm = aObjPaymentterm;
    return this;
  }

  public PaymenttermGetAutocompleteV2ResponseMPayload addAObjPaymenttermItem(PaymenttermAutocompleteElementResponse aObjPaymenttermItem) {
    if (this.aObjPaymentterm == null) {
      this.aObjPaymentterm = new ArrayList<>();
    }
    this.aObjPaymentterm.add(aObjPaymenttermItem);
    return this;
  }

   /**
   * An array of Paymentterm autocomplete element response.
   * @return aObjPaymentterm
  **/
  @javax.annotation.Nullable
  public List<PaymenttermAutocompleteElementResponse> getaObjPaymentterm() {
    return aObjPaymentterm;
  }


  public void setaObjPaymentterm(List<PaymenttermAutocompleteElementResponse> aObjPaymentterm) {
    this.aObjPaymentterm = aObjPaymentterm;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymenttermGetAutocompleteV2ResponseMPayload paymenttermGetAutocompleteV2ResponseMPayload = (PaymenttermGetAutocompleteV2ResponseMPayload) o;
    return Objects.equals(this.aObjPaymentterm, paymenttermGetAutocompleteV2ResponseMPayload.aObjPaymentterm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aObjPaymentterm);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymenttermGetAutocompleteV2ResponseMPayload {\n");
    sb.append("    aObjPaymentterm: ").append(toIndentedString(aObjPaymentterm)).append("\n");
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
    openapiFields.add("a_objPaymentterm");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PaymenttermGetAutocompleteV2ResponseMPayload
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PaymenttermGetAutocompleteV2ResponseMPayload.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PaymenttermGetAutocompleteV2ResponseMPayload is not found in the empty JSON string", PaymenttermGetAutocompleteV2ResponseMPayload.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PaymenttermGetAutocompleteV2ResponseMPayload.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PaymenttermGetAutocompleteV2ResponseMPayload` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("a_objPaymentterm") != null && !jsonObj.get("a_objPaymentterm").isJsonNull()) {
        JsonArray jsonArrayaObjPaymentterm = jsonObj.getAsJsonArray("a_objPaymentterm");
        if (jsonArrayaObjPaymentterm != null) {
          // ensure the json data is an array
          if (!jsonObj.get("a_objPaymentterm").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `a_objPaymentterm` to be an array in the JSON string but got `%s`", jsonObj.get("a_objPaymentterm").toString()));
          }

          // validate the optional field `a_objPaymentterm` (array)
          for (int i = 0; i < jsonArrayaObjPaymentterm.size(); i++) {
            PaymenttermAutocompleteElementResponse.validateJsonObject(jsonArrayaObjPaymentterm.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PaymenttermGetAutocompleteV2ResponseMPayload.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PaymenttermGetAutocompleteV2ResponseMPayload' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PaymenttermGetAutocompleteV2ResponseMPayload> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PaymenttermGetAutocompleteV2ResponseMPayload.class));

       return (TypeAdapter<T>) new TypeAdapter<PaymenttermGetAutocompleteV2ResponseMPayload>() {
           @Override
           public void write(JsonWriter out, PaymenttermGetAutocompleteV2ResponseMPayload value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PaymenttermGetAutocompleteV2ResponseMPayload read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PaymenttermGetAutocompleteV2ResponseMPayload given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PaymenttermGetAutocompleteV2ResponseMPayload
  * @throws IOException if the JSON string is invalid with respect to PaymenttermGetAutocompleteV2ResponseMPayload
  */
  public static PaymenttermGetAutocompleteV2ResponseMPayload fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PaymenttermGetAutocompleteV2ResponseMPayload.class);
  }

 /**
  * Convert an instance of PaymenttermGetAutocompleteV2ResponseMPayload to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

