/*
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.2.0
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ezmax.api.model;

import java.util.Objects;
import com.ezmax.api.model.FieldECommunicationexternalrecipientType;
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
 * A Communicationexternalrecipient Object
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-28T04:04:06.974848816Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CommunicationexternalrecipientRequest {
  public static final String SERIALIZED_NAME_PKI_COMMUNICATIONEXTERNALRECIPIENT_I_D = "pkiCommunicationexternalrecipientID";
  @SerializedName(SERIALIZED_NAME_PKI_COMMUNICATIONEXTERNALRECIPIENT_I_D)
  private Integer pkiCommunicationexternalrecipientID;

  public static final String SERIALIZED_NAME_S_EMAIL_ADDRESS = "sEmailAddress";
  @SerializedName(SERIALIZED_NAME_S_EMAIL_ADDRESS)
  private String sEmailAddress;

  public static final String SERIALIZED_NAME_S_PHONE_E164 = "sPhoneE164";
  @SerializedName(SERIALIZED_NAME_S_PHONE_E164)
  private String sPhoneE164;

  public static final String SERIALIZED_NAME_E_COMMUNICATIONEXTERNALRECIPIENT_TYPE = "eCommunicationexternalrecipientType";
  @SerializedName(SERIALIZED_NAME_E_COMMUNICATIONEXTERNALRECIPIENT_TYPE)
  private FieldECommunicationexternalrecipientType eCommunicationexternalrecipientType;

  public static final String SERIALIZED_NAME_S_COMMUNICATIONEXTERNALRECIPIENT_NAME = "sCommunicationexternalrecipientName";
  @SerializedName(SERIALIZED_NAME_S_COMMUNICATIONEXTERNALRECIPIENT_NAME)
  private String sCommunicationexternalrecipientName;

  public CommunicationexternalrecipientRequest() {
  }

  public CommunicationexternalrecipientRequest pkiCommunicationexternalrecipientID(Integer pkiCommunicationexternalrecipientID) {
    this.pkiCommunicationexternalrecipientID = pkiCommunicationexternalrecipientID;
    return this;
  }

   /**
   * The unique ID of the Communicationexternalrecipient
   * @return pkiCommunicationexternalrecipientID
  **/
  @javax.annotation.Nullable
  public Integer getPkiCommunicationexternalrecipientID() {
    return pkiCommunicationexternalrecipientID;
  }

  public void setPkiCommunicationexternalrecipientID(Integer pkiCommunicationexternalrecipientID) {
    this.pkiCommunicationexternalrecipientID = pkiCommunicationexternalrecipientID;
  }


  public CommunicationexternalrecipientRequest sEmailAddress(String sEmailAddress) {
    this.sEmailAddress = sEmailAddress;
    return this;
  }

   /**
   * The email address.
   * @return sEmailAddress
  **/
  @javax.annotation.Nullable
  public String getsEmailAddress() {
    return sEmailAddress;
  }

  public void setsEmailAddress(String sEmailAddress) {
    this.sEmailAddress = sEmailAddress;
  }


  public CommunicationexternalrecipientRequest sPhoneE164(String sPhoneE164) {
    this.sPhoneE164 = sPhoneE164;
    return this;
  }

   /**
   * A phone number in E.164 Format
   * @return sPhoneE164
  **/
  @javax.annotation.Nullable
  public String getsPhoneE164() {
    return sPhoneE164;
  }

  public void setsPhoneE164(String sPhoneE164) {
    this.sPhoneE164 = sPhoneE164;
  }


  public CommunicationexternalrecipientRequest eCommunicationexternalrecipientType(FieldECommunicationexternalrecipientType eCommunicationexternalrecipientType) {
    this.eCommunicationexternalrecipientType = eCommunicationexternalrecipientType;
    return this;
  }

   /**
   * Get eCommunicationexternalrecipientType
   * @return eCommunicationexternalrecipientType
  **/
  @javax.annotation.Nullable
  public FieldECommunicationexternalrecipientType geteCommunicationexternalrecipientType() {
    return eCommunicationexternalrecipientType;
  }

  public void seteCommunicationexternalrecipientType(FieldECommunicationexternalrecipientType eCommunicationexternalrecipientType) {
    this.eCommunicationexternalrecipientType = eCommunicationexternalrecipientType;
  }


  public CommunicationexternalrecipientRequest sCommunicationexternalrecipientName(String sCommunicationexternalrecipientName) {
    this.sCommunicationexternalrecipientName = sCommunicationexternalrecipientName;
    return this;
  }

   /**
   * The name of the Communicationexternalrecipient
   * @return sCommunicationexternalrecipientName
  **/
  @javax.annotation.Nullable
  public String getsCommunicationexternalrecipientName() {
    return sCommunicationexternalrecipientName;
  }

  public void setsCommunicationexternalrecipientName(String sCommunicationexternalrecipientName) {
    this.sCommunicationexternalrecipientName = sCommunicationexternalrecipientName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommunicationexternalrecipientRequest communicationexternalrecipientRequest = (CommunicationexternalrecipientRequest) o;
    return Objects.equals(this.pkiCommunicationexternalrecipientID, communicationexternalrecipientRequest.pkiCommunicationexternalrecipientID) &&
        Objects.equals(this.sEmailAddress, communicationexternalrecipientRequest.sEmailAddress) &&
        Objects.equals(this.sPhoneE164, communicationexternalrecipientRequest.sPhoneE164) &&
        Objects.equals(this.eCommunicationexternalrecipientType, communicationexternalrecipientRequest.eCommunicationexternalrecipientType) &&
        Objects.equals(this.sCommunicationexternalrecipientName, communicationexternalrecipientRequest.sCommunicationexternalrecipientName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pkiCommunicationexternalrecipientID, sEmailAddress, sPhoneE164, eCommunicationexternalrecipientType, sCommunicationexternalrecipientName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommunicationexternalrecipientRequest {\n");
    sb.append("    pkiCommunicationexternalrecipientID: ").append(toIndentedString(pkiCommunicationexternalrecipientID)).append("\n");
    sb.append("    sEmailAddress: ").append(toIndentedString(sEmailAddress)).append("\n");
    sb.append("    sPhoneE164: ").append(toIndentedString(sPhoneE164)).append("\n");
    sb.append("    eCommunicationexternalrecipientType: ").append(toIndentedString(eCommunicationexternalrecipientType)).append("\n");
    sb.append("    sCommunicationexternalrecipientName: ").append(toIndentedString(sCommunicationexternalrecipientName)).append("\n");
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
    openapiFields.add("sEmailAddress");
    openapiFields.add("sPhoneE164");
    openapiFields.add("eCommunicationexternalrecipientType");
    openapiFields.add("sCommunicationexternalrecipientName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CommunicationexternalrecipientRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CommunicationexternalrecipientRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CommunicationexternalrecipientRequest is not found in the empty JSON string", CommunicationexternalrecipientRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CommunicationexternalrecipientRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CommunicationexternalrecipientRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("sEmailAddress") != null && !jsonObj.get("sEmailAddress").isJsonNull()) && !jsonObj.get("sEmailAddress").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sEmailAddress` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sEmailAddress").toString()));
      }
      if ((jsonObj.get("sPhoneE164") != null && !jsonObj.get("sPhoneE164").isJsonNull()) && !jsonObj.get("sPhoneE164").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sPhoneE164` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sPhoneE164").toString()));
      }
      // validate the optional field `eCommunicationexternalrecipientType`
      if (jsonObj.get("eCommunicationexternalrecipientType") != null && !jsonObj.get("eCommunicationexternalrecipientType").isJsonNull()) {
        FieldECommunicationexternalrecipientType.validateJsonElement(jsonObj.get("eCommunicationexternalrecipientType"));
      }
      if ((jsonObj.get("sCommunicationexternalrecipientName") != null && !jsonObj.get("sCommunicationexternalrecipientName").isJsonNull()) && !jsonObj.get("sCommunicationexternalrecipientName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sCommunicationexternalrecipientName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sCommunicationexternalrecipientName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CommunicationexternalrecipientRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CommunicationexternalrecipientRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CommunicationexternalrecipientRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CommunicationexternalrecipientRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CommunicationexternalrecipientRequest>() {
           @Override
           public void write(JsonWriter out, CommunicationexternalrecipientRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CommunicationexternalrecipientRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CommunicationexternalrecipientRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CommunicationexternalrecipientRequest
  * @throws IOException if the JSON string is invalid with respect to CommunicationexternalrecipientRequest
  */
  public static CommunicationexternalrecipientRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CommunicationexternalrecipientRequest.class);
  }

 /**
  * Convert an instance of CommunicationexternalrecipientRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
