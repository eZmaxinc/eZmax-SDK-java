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
import com.ezmax.api.model.AddressRequestCompound;
import com.ezmax.api.model.EmailRequestCompound;
import com.ezmax.api.model.PhoneRequestCompound;
import com.ezmax.api.model.WebsiteRequestCompound;
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
 * ContactinformationsRequestCompoundAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-22T15:33:11.356591451Z[Etc/UTC]")
public class ContactinformationsRequestCompoundAllOf {
  public static final String SERIALIZED_NAME_A_OBJ_ADDRESS = "a_objAddress";
  @SerializedName(SERIALIZED_NAME_A_OBJ_ADDRESS)
  private List<AddressRequestCompound> aObjAddress = new ArrayList<>();

  public static final String SERIALIZED_NAME_A_OBJ_PHONE = "a_objPhone";
  @SerializedName(SERIALIZED_NAME_A_OBJ_PHONE)
  private List<PhoneRequestCompound> aObjPhone = new ArrayList<>();

  public static final String SERIALIZED_NAME_A_OBJ_EMAIL = "a_objEmail";
  @SerializedName(SERIALIZED_NAME_A_OBJ_EMAIL)
  private List<EmailRequestCompound> aObjEmail = new ArrayList<>();

  public static final String SERIALIZED_NAME_A_OBJ_WEBSITE = "a_objWebsite";
  @SerializedName(SERIALIZED_NAME_A_OBJ_WEBSITE)
  private List<WebsiteRequestCompound> aObjWebsite = new ArrayList<>();

  public ContactinformationsRequestCompoundAllOf() {
  }

  public ContactinformationsRequestCompoundAllOf aObjAddress(List<AddressRequestCompound> aObjAddress) {
    
    this.aObjAddress = aObjAddress;
    return this;
  }

  public ContactinformationsRequestCompoundAllOf addAObjAddressItem(AddressRequestCompound aObjAddressItem) {
    if (this.aObjAddress == null) {
      this.aObjAddress = new ArrayList<>();
    }
    this.aObjAddress.add(aObjAddressItem);
    return this;
  }

   /**
   * Get aObjAddress
   * @return aObjAddress
  **/
  @javax.annotation.Nonnull
  public List<AddressRequestCompound> getaObjAddress() {
    return aObjAddress;
  }


  public void setaObjAddress(List<AddressRequestCompound> aObjAddress) {
    this.aObjAddress = aObjAddress;
  }


  public ContactinformationsRequestCompoundAllOf aObjPhone(List<PhoneRequestCompound> aObjPhone) {
    
    this.aObjPhone = aObjPhone;
    return this;
  }

  public ContactinformationsRequestCompoundAllOf addAObjPhoneItem(PhoneRequestCompound aObjPhoneItem) {
    if (this.aObjPhone == null) {
      this.aObjPhone = new ArrayList<>();
    }
    this.aObjPhone.add(aObjPhoneItem);
    return this;
  }

   /**
   * Get aObjPhone
   * @return aObjPhone
  **/
  @javax.annotation.Nonnull
  public List<PhoneRequestCompound> getaObjPhone() {
    return aObjPhone;
  }


  public void setaObjPhone(List<PhoneRequestCompound> aObjPhone) {
    this.aObjPhone = aObjPhone;
  }


  public ContactinformationsRequestCompoundAllOf aObjEmail(List<EmailRequestCompound> aObjEmail) {
    
    this.aObjEmail = aObjEmail;
    return this;
  }

  public ContactinformationsRequestCompoundAllOf addAObjEmailItem(EmailRequestCompound aObjEmailItem) {
    if (this.aObjEmail == null) {
      this.aObjEmail = new ArrayList<>();
    }
    this.aObjEmail.add(aObjEmailItem);
    return this;
  }

   /**
   * Get aObjEmail
   * @return aObjEmail
  **/
  @javax.annotation.Nonnull
  public List<EmailRequestCompound> getaObjEmail() {
    return aObjEmail;
  }


  public void setaObjEmail(List<EmailRequestCompound> aObjEmail) {
    this.aObjEmail = aObjEmail;
  }


  public ContactinformationsRequestCompoundAllOf aObjWebsite(List<WebsiteRequestCompound> aObjWebsite) {
    
    this.aObjWebsite = aObjWebsite;
    return this;
  }

  public ContactinformationsRequestCompoundAllOf addAObjWebsiteItem(WebsiteRequestCompound aObjWebsiteItem) {
    if (this.aObjWebsite == null) {
      this.aObjWebsite = new ArrayList<>();
    }
    this.aObjWebsite.add(aObjWebsiteItem);
    return this;
  }

   /**
   * Get aObjWebsite
   * @return aObjWebsite
  **/
  @javax.annotation.Nonnull
  public List<WebsiteRequestCompound> getaObjWebsite() {
    return aObjWebsite;
  }


  public void setaObjWebsite(List<WebsiteRequestCompound> aObjWebsite) {
    this.aObjWebsite = aObjWebsite;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactinformationsRequestCompoundAllOf contactinformationsRequestCompoundAllOf = (ContactinformationsRequestCompoundAllOf) o;
    return Objects.equals(this.aObjAddress, contactinformationsRequestCompoundAllOf.aObjAddress) &&
        Objects.equals(this.aObjPhone, contactinformationsRequestCompoundAllOf.aObjPhone) &&
        Objects.equals(this.aObjEmail, contactinformationsRequestCompoundAllOf.aObjEmail) &&
        Objects.equals(this.aObjWebsite, contactinformationsRequestCompoundAllOf.aObjWebsite);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aObjAddress, aObjPhone, aObjEmail, aObjWebsite);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactinformationsRequestCompoundAllOf {\n");
    sb.append("    aObjAddress: ").append(toIndentedString(aObjAddress)).append("\n");
    sb.append("    aObjPhone: ").append(toIndentedString(aObjPhone)).append("\n");
    sb.append("    aObjEmail: ").append(toIndentedString(aObjEmail)).append("\n");
    sb.append("    aObjWebsite: ").append(toIndentedString(aObjWebsite)).append("\n");
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
    openapiFields.add("a_objAddress");
    openapiFields.add("a_objPhone");
    openapiFields.add("a_objEmail");
    openapiFields.add("a_objWebsite");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("a_objAddress");
    openapiRequiredFields.add("a_objPhone");
    openapiRequiredFields.add("a_objEmail");
    openapiRequiredFields.add("a_objWebsite");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ContactinformationsRequestCompoundAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ContactinformationsRequestCompoundAllOf.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ContactinformationsRequestCompoundAllOf is not found in the empty JSON string", ContactinformationsRequestCompoundAllOf.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ContactinformationsRequestCompoundAllOf.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ContactinformationsRequestCompoundAllOf` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ContactinformationsRequestCompoundAllOf.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (!jsonObj.get("a_objAddress").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `a_objAddress` to be an array in the JSON string but got `%s`", jsonObj.get("a_objAddress").toString()));
      }

      JsonArray jsonArrayaObjAddress = jsonObj.getAsJsonArray("a_objAddress");
      // validate the required field `a_objAddress` (array)
      for (int i = 0; i < jsonArrayaObjAddress.size(); i++) {
        AddressRequestCompound.validateJsonObject(jsonArrayaObjAddress.get(i).getAsJsonObject());
      };
      // ensure the json data is an array
      if (!jsonObj.get("a_objPhone").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `a_objPhone` to be an array in the JSON string but got `%s`", jsonObj.get("a_objPhone").toString()));
      }

      JsonArray jsonArrayaObjPhone = jsonObj.getAsJsonArray("a_objPhone");
      // validate the required field `a_objPhone` (array)
      for (int i = 0; i < jsonArrayaObjPhone.size(); i++) {
        PhoneRequestCompound.validateJsonObject(jsonArrayaObjPhone.get(i).getAsJsonObject());
      };
      // ensure the json data is an array
      if (!jsonObj.get("a_objEmail").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `a_objEmail` to be an array in the JSON string but got `%s`", jsonObj.get("a_objEmail").toString()));
      }

      JsonArray jsonArrayaObjEmail = jsonObj.getAsJsonArray("a_objEmail");
      // validate the required field `a_objEmail` (array)
      for (int i = 0; i < jsonArrayaObjEmail.size(); i++) {
        EmailRequestCompound.validateJsonObject(jsonArrayaObjEmail.get(i).getAsJsonObject());
      };
      // ensure the json data is an array
      if (!jsonObj.get("a_objWebsite").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `a_objWebsite` to be an array in the JSON string but got `%s`", jsonObj.get("a_objWebsite").toString()));
      }

      JsonArray jsonArrayaObjWebsite = jsonObj.getAsJsonArray("a_objWebsite");
      // validate the required field `a_objWebsite` (array)
      for (int i = 0; i < jsonArrayaObjWebsite.size(); i++) {
        WebsiteRequestCompound.validateJsonObject(jsonArrayaObjWebsite.get(i).getAsJsonObject());
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ContactinformationsRequestCompoundAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ContactinformationsRequestCompoundAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ContactinformationsRequestCompoundAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ContactinformationsRequestCompoundAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<ContactinformationsRequestCompoundAllOf>() {
           @Override
           public void write(JsonWriter out, ContactinformationsRequestCompoundAllOf value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ContactinformationsRequestCompoundAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ContactinformationsRequestCompoundAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ContactinformationsRequestCompoundAllOf
  * @throws IOException if the JSON string is invalid with respect to ContactinformationsRequestCompoundAllOf
  */
  public static ContactinformationsRequestCompoundAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ContactinformationsRequestCompoundAllOf.class);
  }

 /**
  * Convert an instance of ContactinformationsRequestCompoundAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

