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
 * A Contactinformations Object
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-07T19:20:13.445471985Z[Etc/UTC]", comments = "Generator version: 7.12.0")
public class ContactinformationsRequest {
  public static final String SERIALIZED_NAME_I_ADDRESS_DEFAULT = "iAddressDefault";
  @SerializedName(SERIALIZED_NAME_I_ADDRESS_DEFAULT)
  @javax.annotation.Nonnull
  private Integer iAddressDefault;

  public static final String SERIALIZED_NAME_I_PHONE_DEFAULT = "iPhoneDefault";
  @SerializedName(SERIALIZED_NAME_I_PHONE_DEFAULT)
  @javax.annotation.Nonnull
  private Integer iPhoneDefault;

  public static final String SERIALIZED_NAME_I_EMAIL_DEFAULT = "iEmailDefault";
  @SerializedName(SERIALIZED_NAME_I_EMAIL_DEFAULT)
  @javax.annotation.Nonnull
  private Integer iEmailDefault;

  public static final String SERIALIZED_NAME_I_WEBSITE_DEFAULT = "iWebsiteDefault";
  @SerializedName(SERIALIZED_NAME_I_WEBSITE_DEFAULT)
  @javax.annotation.Nonnull
  private Integer iWebsiteDefault;

  public ContactinformationsRequest() {
  }

  public ContactinformationsRequest iAddressDefault(@javax.annotation.Nonnull Integer iAddressDefault) {
    this.iAddressDefault = iAddressDefault;
    return this;
  }

  /**
   * The index in the a_objAddress array (zero based index) representing the Address object that should become the default one.  You can leave the value to 0 if the array is empty.
   * @return iAddressDefault
   */
  @javax.annotation.Nonnull
  public Integer getiAddressDefault() {
    return iAddressDefault;
  }

  public void setiAddressDefault(@javax.annotation.Nonnull Integer iAddressDefault) {
    this.iAddressDefault = iAddressDefault;
  }


  public ContactinformationsRequest iPhoneDefault(@javax.annotation.Nonnull Integer iPhoneDefault) {
    this.iPhoneDefault = iPhoneDefault;
    return this;
  }

  /**
   * The index in the a_objPhone array (zero based index) representing the Phone object that should become the default one.  You can leave the value to 0 if the array is empty.
   * @return iPhoneDefault
   */
  @javax.annotation.Nonnull
  public Integer getiPhoneDefault() {
    return iPhoneDefault;
  }

  public void setiPhoneDefault(@javax.annotation.Nonnull Integer iPhoneDefault) {
    this.iPhoneDefault = iPhoneDefault;
  }


  public ContactinformationsRequest iEmailDefault(@javax.annotation.Nonnull Integer iEmailDefault) {
    this.iEmailDefault = iEmailDefault;
    return this;
  }

  /**
   * The index in the a_objEmail array (zero based index) representing the Email object that should become the default one.  You can leave the value to 0 if the array is empty.
   * @return iEmailDefault
   */
  @javax.annotation.Nonnull
  public Integer getiEmailDefault() {
    return iEmailDefault;
  }

  public void setiEmailDefault(@javax.annotation.Nonnull Integer iEmailDefault) {
    this.iEmailDefault = iEmailDefault;
  }


  public ContactinformationsRequest iWebsiteDefault(@javax.annotation.Nonnull Integer iWebsiteDefault) {
    this.iWebsiteDefault = iWebsiteDefault;
    return this;
  }

  /**
   * The index in the a_objWebsite array (zero based index) representing the Website object that should become the default one.  You can leave the value to 0 if the array is empty.
   * @return iWebsiteDefault
   */
  @javax.annotation.Nonnull
  public Integer getiWebsiteDefault() {
    return iWebsiteDefault;
  }

  public void setiWebsiteDefault(@javax.annotation.Nonnull Integer iWebsiteDefault) {
    this.iWebsiteDefault = iWebsiteDefault;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactinformationsRequest contactinformationsRequest = (ContactinformationsRequest) o;
    return Objects.equals(this.iAddressDefault, contactinformationsRequest.iAddressDefault) &&
        Objects.equals(this.iPhoneDefault, contactinformationsRequest.iPhoneDefault) &&
        Objects.equals(this.iEmailDefault, contactinformationsRequest.iEmailDefault) &&
        Objects.equals(this.iWebsiteDefault, contactinformationsRequest.iWebsiteDefault);
  }

  @Override
  public int hashCode() {
    return Objects.hash(iAddressDefault, iPhoneDefault, iEmailDefault, iWebsiteDefault);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactinformationsRequest {\n");
    sb.append("    iAddressDefault: ").append(toIndentedString(iAddressDefault)).append("\n");
    sb.append("    iPhoneDefault: ").append(toIndentedString(iPhoneDefault)).append("\n");
    sb.append("    iEmailDefault: ").append(toIndentedString(iEmailDefault)).append("\n");
    sb.append("    iWebsiteDefault: ").append(toIndentedString(iWebsiteDefault)).append("\n");
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
    openapiFields.add("iAddressDefault");
    openapiFields.add("iPhoneDefault");
    openapiFields.add("iEmailDefault");
    openapiFields.add("iWebsiteDefault");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("iAddressDefault");
    openapiRequiredFields.add("iPhoneDefault");
    openapiRequiredFields.add("iEmailDefault");
    openapiRequiredFields.add("iWebsiteDefault");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ContactinformationsRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ContactinformationsRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ContactinformationsRequest is not found in the empty JSON string", ContactinformationsRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ContactinformationsRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ContactinformationsRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ContactinformationsRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ContactinformationsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ContactinformationsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ContactinformationsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ContactinformationsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ContactinformationsRequest>() {
           @Override
           public void write(JsonWriter out, ContactinformationsRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ContactinformationsRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ContactinformationsRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ContactinformationsRequest
   * @throws IOException if the JSON string is invalid with respect to ContactinformationsRequest
   */
  public static ContactinformationsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ContactinformationsRequest.class);
  }

  /**
   * Convert an instance of ContactinformationsRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

