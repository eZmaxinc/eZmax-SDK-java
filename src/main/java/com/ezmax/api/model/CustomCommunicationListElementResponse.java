/*
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.17
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ezmax.api.model;

import java.util.Objects;
import java.util.Arrays;
import com.ezmax.api.model.ComputedECommunicationDirection;
import com.ezmax.api.model.FieldECommunicationImportance;
import com.ezmax.api.model.FieldECommunicationType;
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
 * A Communication List Element
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-22T14:56:27.093149753Z[Etc/UTC]")
public class CustomCommunicationListElementResponse {
  public static final String SERIALIZED_NAME_PKI_COMMUNICATION_I_D = "pkiCommunicationID";
  @SerializedName(SERIALIZED_NAME_PKI_COMMUNICATION_I_D)
  private Integer pkiCommunicationID;

  public static final String SERIALIZED_NAME_DT_CREATED_DATE = "dtCreatedDate";
  @SerializedName(SERIALIZED_NAME_DT_CREATED_DATE)
  private String dtCreatedDate;

  public static final String SERIALIZED_NAME_E_COMMUNICATION_DIRECTION = "eCommunicationDirection";
  @SerializedName(SERIALIZED_NAME_E_COMMUNICATION_DIRECTION)
  private ComputedECommunicationDirection eCommunicationDirection;

  public static final String SERIALIZED_NAME_E_COMMUNICATION_IMPORTANCE = "eCommunicationImportance";
  @SerializedName(SERIALIZED_NAME_E_COMMUNICATION_IMPORTANCE)
  private FieldECommunicationImportance eCommunicationImportance;

  public static final String SERIALIZED_NAME_E_COMMUNICATION_TYPE = "eCommunicationType";
  @SerializedName(SERIALIZED_NAME_E_COMMUNICATION_TYPE)
  private FieldECommunicationType eCommunicationType;

  public static final String SERIALIZED_NAME_I_COMMUNICATIONRECIPIENT_COUNT = "iCommunicationrecipientCount";
  @SerializedName(SERIALIZED_NAME_I_COMMUNICATIONRECIPIENT_COUNT)
  private Integer iCommunicationrecipientCount;

  public static final String SERIALIZED_NAME_S_COMMUNICATION_SUBJECT = "sCommunicationSubject";
  @SerializedName(SERIALIZED_NAME_S_COMMUNICATION_SUBJECT)
  private String sCommunicationSubject;

  public static final String SERIALIZED_NAME_S_COMMUNICATION_SENDER = "sCommunicationSender";
  @SerializedName(SERIALIZED_NAME_S_COMMUNICATION_SENDER)
  private String sCommunicationSender;

  public static final String SERIALIZED_NAME_S_COMMUNICATION_RECIPIENT = "sCommunicationRecipient";
  @SerializedName(SERIALIZED_NAME_S_COMMUNICATION_RECIPIENT)
  private String sCommunicationRecipient;

  public CustomCommunicationListElementResponse() {
  }

  public CustomCommunicationListElementResponse pkiCommunicationID(Integer pkiCommunicationID) {
    
    this.pkiCommunicationID = pkiCommunicationID;
    return this;
  }

   /**
   * The unique ID of the Communication.
   * minimum: 0
   * @return pkiCommunicationID
  **/
  @javax.annotation.Nonnull
  public Integer getPkiCommunicationID() {
    return pkiCommunicationID;
  }


  public void setPkiCommunicationID(Integer pkiCommunicationID) {
    this.pkiCommunicationID = pkiCommunicationID;
  }


  public CustomCommunicationListElementResponse dtCreatedDate(String dtCreatedDate) {
    
    this.dtCreatedDate = dtCreatedDate;
    return this;
  }

   /**
   * The date and time at which the object was created
   * @return dtCreatedDate
  **/
  @javax.annotation.Nonnull
  public String getDtCreatedDate() {
    return dtCreatedDate;
  }


  public void setDtCreatedDate(String dtCreatedDate) {
    this.dtCreatedDate = dtCreatedDate;
  }


  public CustomCommunicationListElementResponse eCommunicationDirection(ComputedECommunicationDirection eCommunicationDirection) {
    
    this.eCommunicationDirection = eCommunicationDirection;
    return this;
  }

   /**
   * Get eCommunicationDirection
   * @return eCommunicationDirection
  **/
  @javax.annotation.Nonnull
  public ComputedECommunicationDirection geteCommunicationDirection() {
    return eCommunicationDirection;
  }


  public void seteCommunicationDirection(ComputedECommunicationDirection eCommunicationDirection) {
    this.eCommunicationDirection = eCommunicationDirection;
  }


  public CustomCommunicationListElementResponse eCommunicationImportance(FieldECommunicationImportance eCommunicationImportance) {
    
    this.eCommunicationImportance = eCommunicationImportance;
    return this;
  }

   /**
   * Get eCommunicationImportance
   * @return eCommunicationImportance
  **/
  @javax.annotation.Nonnull
  public FieldECommunicationImportance geteCommunicationImportance() {
    return eCommunicationImportance;
  }


  public void seteCommunicationImportance(FieldECommunicationImportance eCommunicationImportance) {
    this.eCommunicationImportance = eCommunicationImportance;
  }


  public CustomCommunicationListElementResponse eCommunicationType(FieldECommunicationType eCommunicationType) {
    
    this.eCommunicationType = eCommunicationType;
    return this;
  }

   /**
   * Get eCommunicationType
   * @return eCommunicationType
  **/
  @javax.annotation.Nonnull
  public FieldECommunicationType geteCommunicationType() {
    return eCommunicationType;
  }


  public void seteCommunicationType(FieldECommunicationType eCommunicationType) {
    this.eCommunicationType = eCommunicationType;
  }


  public CustomCommunicationListElementResponse iCommunicationrecipientCount(Integer iCommunicationrecipientCount) {
    
    this.iCommunicationrecipientCount = iCommunicationrecipientCount;
    return this;
  }

   /**
   * The count of Communicationrecipient
   * @return iCommunicationrecipientCount
  **/
  @javax.annotation.Nonnull
  public Integer getiCommunicationrecipientCount() {
    return iCommunicationrecipientCount;
  }


  public void setiCommunicationrecipientCount(Integer iCommunicationrecipientCount) {
    this.iCommunicationrecipientCount = iCommunicationrecipientCount;
  }


  public CustomCommunicationListElementResponse sCommunicationSubject(String sCommunicationSubject) {
    
    this.sCommunicationSubject = sCommunicationSubject;
    return this;
  }

   /**
   * The subject of the Communication
   * @return sCommunicationSubject
  **/
  @javax.annotation.Nonnull
  public String getsCommunicationSubject() {
    return sCommunicationSubject;
  }


  public void setsCommunicationSubject(String sCommunicationSubject) {
    this.sCommunicationSubject = sCommunicationSubject;
  }


  public CustomCommunicationListElementResponse sCommunicationSender(String sCommunicationSender) {
    
    this.sCommunicationSender = sCommunicationSender;
    return this;
  }

   /**
   * The sender name of the Communication
   * @return sCommunicationSender
  **/
  @javax.annotation.Nonnull
  public String getsCommunicationSender() {
    return sCommunicationSender;
  }


  public void setsCommunicationSender(String sCommunicationSender) {
    this.sCommunicationSender = sCommunicationSender;
  }


  public CustomCommunicationListElementResponse sCommunicationRecipient(String sCommunicationRecipient) {
    
    this.sCommunicationRecipient = sCommunicationRecipient;
    return this;
  }

   /**
   * The recipients&#39; name of the Communication
   * @return sCommunicationRecipient
  **/
  @javax.annotation.Nonnull
  public String getsCommunicationRecipient() {
    return sCommunicationRecipient;
  }


  public void setsCommunicationRecipient(String sCommunicationRecipient) {
    this.sCommunicationRecipient = sCommunicationRecipient;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomCommunicationListElementResponse customCommunicationListElementResponse = (CustomCommunicationListElementResponse) o;
    return Objects.equals(this.pkiCommunicationID, customCommunicationListElementResponse.pkiCommunicationID) &&
        Objects.equals(this.dtCreatedDate, customCommunicationListElementResponse.dtCreatedDate) &&
        Objects.equals(this.eCommunicationDirection, customCommunicationListElementResponse.eCommunicationDirection) &&
        Objects.equals(this.eCommunicationImportance, customCommunicationListElementResponse.eCommunicationImportance) &&
        Objects.equals(this.eCommunicationType, customCommunicationListElementResponse.eCommunicationType) &&
        Objects.equals(this.iCommunicationrecipientCount, customCommunicationListElementResponse.iCommunicationrecipientCount) &&
        Objects.equals(this.sCommunicationSubject, customCommunicationListElementResponse.sCommunicationSubject) &&
        Objects.equals(this.sCommunicationSender, customCommunicationListElementResponse.sCommunicationSender) &&
        Objects.equals(this.sCommunicationRecipient, customCommunicationListElementResponse.sCommunicationRecipient);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pkiCommunicationID, dtCreatedDate, eCommunicationDirection, eCommunicationImportance, eCommunicationType, iCommunicationrecipientCount, sCommunicationSubject, sCommunicationSender, sCommunicationRecipient);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomCommunicationListElementResponse {\n");
    sb.append("    pkiCommunicationID: ").append(toIndentedString(pkiCommunicationID)).append("\n");
    sb.append("    dtCreatedDate: ").append(toIndentedString(dtCreatedDate)).append("\n");
    sb.append("    eCommunicationDirection: ").append(toIndentedString(eCommunicationDirection)).append("\n");
    sb.append("    eCommunicationImportance: ").append(toIndentedString(eCommunicationImportance)).append("\n");
    sb.append("    eCommunicationType: ").append(toIndentedString(eCommunicationType)).append("\n");
    sb.append("    iCommunicationrecipientCount: ").append(toIndentedString(iCommunicationrecipientCount)).append("\n");
    sb.append("    sCommunicationSubject: ").append(toIndentedString(sCommunicationSubject)).append("\n");
    sb.append("    sCommunicationSender: ").append(toIndentedString(sCommunicationSender)).append("\n");
    sb.append("    sCommunicationRecipient: ").append(toIndentedString(sCommunicationRecipient)).append("\n");
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
    openapiFields.add("pkiCommunicationID");
    openapiFields.add("dtCreatedDate");
    openapiFields.add("eCommunicationDirection");
    openapiFields.add("eCommunicationImportance");
    openapiFields.add("eCommunicationType");
    openapiFields.add("iCommunicationrecipientCount");
    openapiFields.add("sCommunicationSubject");
    openapiFields.add("sCommunicationSender");
    openapiFields.add("sCommunicationRecipient");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("pkiCommunicationID");
    openapiRequiredFields.add("dtCreatedDate");
    openapiRequiredFields.add("eCommunicationDirection");
    openapiRequiredFields.add("eCommunicationImportance");
    openapiRequiredFields.add("eCommunicationType");
    openapiRequiredFields.add("iCommunicationrecipientCount");
    openapiRequiredFields.add("sCommunicationSubject");
    openapiRequiredFields.add("sCommunicationSender");
    openapiRequiredFields.add("sCommunicationRecipient");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CustomCommunicationListElementResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CustomCommunicationListElementResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CustomCommunicationListElementResponse is not found in the empty JSON string", CustomCommunicationListElementResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CustomCommunicationListElementResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CustomCommunicationListElementResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CustomCommunicationListElementResponse.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("dtCreatedDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dtCreatedDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dtCreatedDate").toString()));
      }
      if (!jsonObj.get("sCommunicationSubject").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sCommunicationSubject` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sCommunicationSubject").toString()));
      }
      if (!jsonObj.get("sCommunicationSender").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sCommunicationSender` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sCommunicationSender").toString()));
      }
      if (!jsonObj.get("sCommunicationRecipient").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sCommunicationRecipient` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sCommunicationRecipient").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CustomCommunicationListElementResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CustomCommunicationListElementResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CustomCommunicationListElementResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CustomCommunicationListElementResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<CustomCommunicationListElementResponse>() {
           @Override
           public void write(JsonWriter out, CustomCommunicationListElementResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CustomCommunicationListElementResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CustomCommunicationListElementResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CustomCommunicationListElementResponse
  * @throws IOException if the JSON string is invalid with respect to CustomCommunicationListElementResponse
  */
  public static CustomCommunicationListElementResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CustomCommunicationListElementResponse.class);
  }

 /**
  * Convert an instance of CustomCommunicationListElementResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
