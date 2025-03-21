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
import com.ezmax.api.model.FieldECreditcardtypeCodename;
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

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import eZmaxAPI.JSON;

/**
 * A custom Creditcardtransaction Object
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-07T19:20:13.445471985Z[Etc/UTC]", comments = "Generator version: 7.12.0")
public class CustomCreditcardtransactionResponse {
  public static final String SERIALIZED_NAME_E_CREDITCARDTYPE_CODENAME = "eCreditcardtypeCodename";
  @SerializedName(SERIALIZED_NAME_E_CREDITCARDTYPE_CODENAME)
  @javax.annotation.Nonnull
  private FieldECreditcardtypeCodename eCreditcardtypeCodename;

  public static final String SERIALIZED_NAME_D_CREDITCARDTRANSACTION_AMOUNT = "dCreditcardtransactionAmount";
  @SerializedName(SERIALIZED_NAME_D_CREDITCARDTRANSACTION_AMOUNT)
  @javax.annotation.Nonnull
  private String dCreditcardtransactionAmount;

  public static final String SERIALIZED_NAME_S_CREDITCARDTRANSACTION_PARTIALLYDECRYPTEDNUMBER = "sCreditcardtransactionPartiallydecryptednumber";
  @SerializedName(SERIALIZED_NAME_S_CREDITCARDTRANSACTION_PARTIALLYDECRYPTEDNUMBER)
  @javax.annotation.Nonnull
  private String sCreditcardtransactionPartiallydecryptednumber;

  public static final String SERIALIZED_NAME_S_CREDITCARDTRANSACTION_REFERENCENUMBER = "sCreditcardtransactionReferencenumber";
  @SerializedName(SERIALIZED_NAME_S_CREDITCARDTRANSACTION_REFERENCENUMBER)
  @javax.annotation.Nonnull
  private String sCreditcardtransactionReferencenumber;

  public CustomCreditcardtransactionResponse() {
  }

  public CustomCreditcardtransactionResponse eCreditcardtypeCodename(@javax.annotation.Nonnull FieldECreditcardtypeCodename eCreditcardtypeCodename) {
    this.eCreditcardtypeCodename = eCreditcardtypeCodename;
    return this;
  }

  /**
   * Get eCreditcardtypeCodename
   * @return eCreditcardtypeCodename
   */
  @javax.annotation.Nonnull
  public FieldECreditcardtypeCodename geteCreditcardtypeCodename() {
    return eCreditcardtypeCodename;
  }

  public void seteCreditcardtypeCodename(@javax.annotation.Nonnull FieldECreditcardtypeCodename eCreditcardtypeCodename) {
    this.eCreditcardtypeCodename = eCreditcardtypeCodename;
  }


  public CustomCreditcardtransactionResponse dCreditcardtransactionAmount(@javax.annotation.Nonnull String dCreditcardtransactionAmount) {
    this.dCreditcardtransactionAmount = dCreditcardtransactionAmount;
    return this;
  }

  /**
   * The amount of the Creditcardtransaction
   * @return dCreditcardtransactionAmount
   */
  @javax.annotation.Nonnull
  public String getdCreditcardtransactionAmount() {
    return dCreditcardtransactionAmount;
  }

  public void setdCreditcardtransactionAmount(@javax.annotation.Nonnull String dCreditcardtransactionAmount) {
    this.dCreditcardtransactionAmount = dCreditcardtransactionAmount;
  }


  public CustomCreditcardtransactionResponse sCreditcardtransactionPartiallydecryptednumber(@javax.annotation.Nonnull String sCreditcardtransactionPartiallydecryptednumber) {
    this.sCreditcardtransactionPartiallydecryptednumber = sCreditcardtransactionPartiallydecryptednumber;
    return this;
  }

  /**
   * The partially decrypted credit card number used in the Creditcardtransaction
   * @return sCreditcardtransactionPartiallydecryptednumber
   */
  @javax.annotation.Nonnull
  public String getsCreditcardtransactionPartiallydecryptednumber() {
    return sCreditcardtransactionPartiallydecryptednumber;
  }

  public void setsCreditcardtransactionPartiallydecryptednumber(@javax.annotation.Nonnull String sCreditcardtransactionPartiallydecryptednumber) {
    this.sCreditcardtransactionPartiallydecryptednumber = sCreditcardtransactionPartiallydecryptednumber;
  }


  public CustomCreditcardtransactionResponse sCreditcardtransactionReferencenumber(@javax.annotation.Nonnull String sCreditcardtransactionReferencenumber) {
    this.sCreditcardtransactionReferencenumber = sCreditcardtransactionReferencenumber;
    return this;
  }

  /**
   * The reference number on the creditcard service for the Creditcardtransaction
   * @return sCreditcardtransactionReferencenumber
   */
  @javax.annotation.Nonnull
  public String getsCreditcardtransactionReferencenumber() {
    return sCreditcardtransactionReferencenumber;
  }

  public void setsCreditcardtransactionReferencenumber(@javax.annotation.Nonnull String sCreditcardtransactionReferencenumber) {
    this.sCreditcardtransactionReferencenumber = sCreditcardtransactionReferencenumber;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomCreditcardtransactionResponse customCreditcardtransactionResponse = (CustomCreditcardtransactionResponse) o;
    return Objects.equals(this.eCreditcardtypeCodename, customCreditcardtransactionResponse.eCreditcardtypeCodename) &&
        Objects.equals(this.dCreditcardtransactionAmount, customCreditcardtransactionResponse.dCreditcardtransactionAmount) &&
        Objects.equals(this.sCreditcardtransactionPartiallydecryptednumber, customCreditcardtransactionResponse.sCreditcardtransactionPartiallydecryptednumber) &&
        Objects.equals(this.sCreditcardtransactionReferencenumber, customCreditcardtransactionResponse.sCreditcardtransactionReferencenumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eCreditcardtypeCodename, dCreditcardtransactionAmount, sCreditcardtransactionPartiallydecryptednumber, sCreditcardtransactionReferencenumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomCreditcardtransactionResponse {\n");
    sb.append("    eCreditcardtypeCodename: ").append(toIndentedString(eCreditcardtypeCodename)).append("\n");
    sb.append("    dCreditcardtransactionAmount: ").append(toIndentedString(dCreditcardtransactionAmount)).append("\n");
    sb.append("    sCreditcardtransactionPartiallydecryptednumber: ").append(toIndentedString(sCreditcardtransactionPartiallydecryptednumber)).append("\n");
    sb.append("    sCreditcardtransactionReferencenumber: ").append(toIndentedString(sCreditcardtransactionReferencenumber)).append("\n");
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
    openapiFields.add("eCreditcardtypeCodename");
    openapiFields.add("dCreditcardtransactionAmount");
    openapiFields.add("sCreditcardtransactionPartiallydecryptednumber");
    openapiFields.add("sCreditcardtransactionReferencenumber");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("eCreditcardtypeCodename");
    openapiRequiredFields.add("dCreditcardtransactionAmount");
    openapiRequiredFields.add("sCreditcardtransactionPartiallydecryptednumber");
    openapiRequiredFields.add("sCreditcardtransactionReferencenumber");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CustomCreditcardtransactionResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CustomCreditcardtransactionResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CustomCreditcardtransactionResponse is not found in the empty JSON string", CustomCreditcardtransactionResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CustomCreditcardtransactionResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CustomCreditcardtransactionResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CustomCreditcardtransactionResponse.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `eCreditcardtypeCodename`
      FieldECreditcardtypeCodename.validateJsonElement(jsonObj.get("eCreditcardtypeCodename"));
      if (!jsonObj.get("dCreditcardtransactionAmount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dCreditcardtransactionAmount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dCreditcardtransactionAmount").toString()));
      }
      if (!jsonObj.get("sCreditcardtransactionPartiallydecryptednumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sCreditcardtransactionPartiallydecryptednumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sCreditcardtransactionPartiallydecryptednumber").toString()));
      }
      if (!jsonObj.get("sCreditcardtransactionReferencenumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sCreditcardtransactionReferencenumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sCreditcardtransactionReferencenumber").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CustomCreditcardtransactionResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CustomCreditcardtransactionResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CustomCreditcardtransactionResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CustomCreditcardtransactionResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<CustomCreditcardtransactionResponse>() {
           @Override
           public void write(JsonWriter out, CustomCreditcardtransactionResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CustomCreditcardtransactionResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CustomCreditcardtransactionResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CustomCreditcardtransactionResponse
   * @throws IOException if the JSON string is invalid with respect to CustomCreditcardtransactionResponse
   */
  public static CustomCreditcardtransactionResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CustomCreditcardtransactionResponse.class);
  }

  /**
   * Convert an instance of CustomCreditcardtransactionResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

