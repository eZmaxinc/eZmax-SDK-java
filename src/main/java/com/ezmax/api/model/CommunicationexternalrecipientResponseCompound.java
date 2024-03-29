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
import com.ezmax.api.model.DescriptionstaticResponseCompound;
import com.ezmax.api.model.EmailstaticResponseCompound;
import com.ezmax.api.model.FieldECommunicationexternalrecipientType;
import com.ezmax.api.model.PhonestaticResponseCompound;
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
 * A Communicationexternalrecipient Object
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-22T15:33:11.356591451Z[Etc/UTC]")
public class CommunicationexternalrecipientResponseCompound {
  public static final String SERIALIZED_NAME_PKI_COMMUNICATIONEXTERNALRECIPIENT_I_D = "pkiCommunicationexternalrecipientID";
  @SerializedName(SERIALIZED_NAME_PKI_COMMUNICATIONEXTERNALRECIPIENT_I_D)
  private Integer pkiCommunicationexternalrecipientID;

  public static final String SERIALIZED_NAME_E_COMMUNICATIONEXTERNALRECIPIENT_TYPE = "eCommunicationexternalrecipientType";
  @SerializedName(SERIALIZED_NAME_E_COMMUNICATIONEXTERNALRECIPIENT_TYPE)
  private FieldECommunicationexternalrecipientType eCommunicationexternalrecipientType;

  public static final String SERIALIZED_NAME_OBJ_DESCRIPTIONSTATIC = "objDescriptionstatic";
  @SerializedName(SERIALIZED_NAME_OBJ_DESCRIPTIONSTATIC)
  private DescriptionstaticResponseCompound objDescriptionstatic;

  public static final String SERIALIZED_NAME_OBJ_EMAILSTATIC = "objEmailstatic";
  @SerializedName(SERIALIZED_NAME_OBJ_EMAILSTATIC)
  private EmailstaticResponseCompound objEmailstatic;

  public static final String SERIALIZED_NAME_OBJ_PHONESTATIC = "objPhonestatic";
  @SerializedName(SERIALIZED_NAME_OBJ_PHONESTATIC)
  private PhonestaticResponseCompound objPhonestatic;

  public CommunicationexternalrecipientResponseCompound() {
  }

  public CommunicationexternalrecipientResponseCompound pkiCommunicationexternalrecipientID(Integer pkiCommunicationexternalrecipientID) {
    
    this.pkiCommunicationexternalrecipientID = pkiCommunicationexternalrecipientID;
    return this;
  }

   /**
   * The unique ID of the Communicationexternalrecipient
   * @return pkiCommunicationexternalrecipientID
  **/
  @javax.annotation.Nonnull
  public Integer getPkiCommunicationexternalrecipientID() {
    return pkiCommunicationexternalrecipientID;
  }


  public void setPkiCommunicationexternalrecipientID(Integer pkiCommunicationexternalrecipientID) {
    this.pkiCommunicationexternalrecipientID = pkiCommunicationexternalrecipientID;
  }


  public CommunicationexternalrecipientResponseCompound eCommunicationexternalrecipientType(FieldECommunicationexternalrecipientType eCommunicationexternalrecipientType) {
    
    this.eCommunicationexternalrecipientType = eCommunicationexternalrecipientType;
    return this;
  }

   /**
   * Get eCommunicationexternalrecipientType
   * @return eCommunicationexternalrecipientType
  **/
  @javax.annotation.Nonnull
  public FieldECommunicationexternalrecipientType geteCommunicationexternalrecipientType() {
    return eCommunicationexternalrecipientType;
  }


  public void seteCommunicationexternalrecipientType(FieldECommunicationexternalrecipientType eCommunicationexternalrecipientType) {
    this.eCommunicationexternalrecipientType = eCommunicationexternalrecipientType;
  }


  public CommunicationexternalrecipientResponseCompound objDescriptionstatic(DescriptionstaticResponseCompound objDescriptionstatic) {
    
    this.objDescriptionstatic = objDescriptionstatic;
    return this;
  }

   /**
   * Get objDescriptionstatic
   * @return objDescriptionstatic
  **/
  @javax.annotation.Nonnull
  public DescriptionstaticResponseCompound getObjDescriptionstatic() {
    return objDescriptionstatic;
  }


  public void setObjDescriptionstatic(DescriptionstaticResponseCompound objDescriptionstatic) {
    this.objDescriptionstatic = objDescriptionstatic;
  }


  public CommunicationexternalrecipientResponseCompound objEmailstatic(EmailstaticResponseCompound objEmailstatic) {
    
    this.objEmailstatic = objEmailstatic;
    return this;
  }

   /**
   * Get objEmailstatic
   * @return objEmailstatic
  **/
  @javax.annotation.Nullable
  public EmailstaticResponseCompound getObjEmailstatic() {
    return objEmailstatic;
  }


  public void setObjEmailstatic(EmailstaticResponseCompound objEmailstatic) {
    this.objEmailstatic = objEmailstatic;
  }


  public CommunicationexternalrecipientResponseCompound objPhonestatic(PhonestaticResponseCompound objPhonestatic) {
    
    this.objPhonestatic = objPhonestatic;
    return this;
  }

   /**
   * Get objPhonestatic
   * @return objPhonestatic
  **/
  @javax.annotation.Nullable
  public PhonestaticResponseCompound getObjPhonestatic() {
    return objPhonestatic;
  }


  public void setObjPhonestatic(PhonestaticResponseCompound objPhonestatic) {
    this.objPhonestatic = objPhonestatic;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommunicationexternalrecipientResponseCompound communicationexternalrecipientResponseCompound = (CommunicationexternalrecipientResponseCompound) o;
    return Objects.equals(this.pkiCommunicationexternalrecipientID, communicationexternalrecipientResponseCompound.pkiCommunicationexternalrecipientID) &&
        Objects.equals(this.eCommunicationexternalrecipientType, communicationexternalrecipientResponseCompound.eCommunicationexternalrecipientType) &&
        Objects.equals(this.objDescriptionstatic, communicationexternalrecipientResponseCompound.objDescriptionstatic) &&
        Objects.equals(this.objEmailstatic, communicationexternalrecipientResponseCompound.objEmailstatic) &&
        Objects.equals(this.objPhonestatic, communicationexternalrecipientResponseCompound.objPhonestatic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pkiCommunicationexternalrecipientID, eCommunicationexternalrecipientType, objDescriptionstatic, objEmailstatic, objPhonestatic);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommunicationexternalrecipientResponseCompound {\n");
    sb.append("    pkiCommunicationexternalrecipientID: ").append(toIndentedString(pkiCommunicationexternalrecipientID)).append("\n");
    sb.append("    eCommunicationexternalrecipientType: ").append(toIndentedString(eCommunicationexternalrecipientType)).append("\n");
    sb.append("    objDescriptionstatic: ").append(toIndentedString(objDescriptionstatic)).append("\n");
    sb.append("    objEmailstatic: ").append(toIndentedString(objEmailstatic)).append("\n");
    sb.append("    objPhonestatic: ").append(toIndentedString(objPhonestatic)).append("\n");
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
    openapiFields.add("pkiCommunicationexternalrecipientID");
    openapiFields.add("eCommunicationexternalrecipientType");
    openapiFields.add("objDescriptionstatic");
    openapiFields.add("objEmailstatic");
    openapiFields.add("objPhonestatic");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("pkiCommunicationexternalrecipientID");
    openapiRequiredFields.add("eCommunicationexternalrecipientType");
    openapiRequiredFields.add("objDescriptionstatic");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CommunicationexternalrecipientResponseCompound
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CommunicationexternalrecipientResponseCompound.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CommunicationexternalrecipientResponseCompound is not found in the empty JSON string", CommunicationexternalrecipientResponseCompound.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CommunicationexternalrecipientResponseCompound.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CommunicationexternalrecipientResponseCompound` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CommunicationexternalrecipientResponseCompound.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the required field `objDescriptionstatic`
      DescriptionstaticResponseCompound.validateJsonObject(jsonObj.getAsJsonObject("objDescriptionstatic"));
      // validate the optional field `objEmailstatic`
      if (jsonObj.get("objEmailstatic") != null && !jsonObj.get("objEmailstatic").isJsonNull()) {
        EmailstaticResponseCompound.validateJsonObject(jsonObj.getAsJsonObject("objEmailstatic"));
      }
      // validate the optional field `objPhonestatic`
      if (jsonObj.get("objPhonestatic") != null && !jsonObj.get("objPhonestatic").isJsonNull()) {
        PhonestaticResponseCompound.validateJsonObject(jsonObj.getAsJsonObject("objPhonestatic"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CommunicationexternalrecipientResponseCompound.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CommunicationexternalrecipientResponseCompound' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CommunicationexternalrecipientResponseCompound> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CommunicationexternalrecipientResponseCompound.class));

       return (TypeAdapter<T>) new TypeAdapter<CommunicationexternalrecipientResponseCompound>() {
           @Override
           public void write(JsonWriter out, CommunicationexternalrecipientResponseCompound value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CommunicationexternalrecipientResponseCompound read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CommunicationexternalrecipientResponseCompound given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CommunicationexternalrecipientResponseCompound
  * @throws IOException if the JSON string is invalid with respect to CommunicationexternalrecipientResponseCompound
  */
  public static CommunicationexternalrecipientResponseCompound fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CommunicationexternalrecipientResponseCompound.class);
  }

 /**
  * Convert an instance of CommunicationexternalrecipientResponseCompound to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

