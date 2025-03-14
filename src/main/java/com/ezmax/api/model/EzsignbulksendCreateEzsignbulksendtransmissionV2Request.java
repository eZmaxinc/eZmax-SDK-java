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
 * Request for POST /1/object/ezsignbulksend/{pkiEzsignbulksendID}/createEzsignbulksendtransmission
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-07T19:20:13.445471985Z[Etc/UTC]", comments = "Generator version: 7.12.0")
public class EzsignbulksendCreateEzsignbulksendtransmissionV2Request {
  public static final String SERIALIZED_NAME_FKI_USERLOGINTYPE_I_D = "fkiUserlogintypeID";
  @SerializedName(SERIALIZED_NAME_FKI_USERLOGINTYPE_I_D)
  @javax.annotation.Nonnull
  private Integer fkiUserlogintypeID;

  public static final String SERIALIZED_NAME_FKI_EZSIGNTSAREQUIREMENT_I_D = "fkiEzsigntsarequirementID";
  @SerializedName(SERIALIZED_NAME_FKI_EZSIGNTSAREQUIREMENT_I_D)
  @javax.annotation.Nullable
  private Integer fkiEzsigntsarequirementID;

  public static final String SERIALIZED_NAME_S_EZSIGNBULKSENDTRANSMISSION_DESCRIPTION = "sEzsignbulksendtransmissionDescription";
  @SerializedName(SERIALIZED_NAME_S_EZSIGNBULKSENDTRANSMISSION_DESCRIPTION)
  @javax.annotation.Nonnull
  private String sEzsignbulksendtransmissionDescription;

  public static final String SERIALIZED_NAME_DT_EZSIGNDOCUMENT_DUEDATE = "dtEzsigndocumentDuedate";
  @SerializedName(SERIALIZED_NAME_DT_EZSIGNDOCUMENT_DUEDATE)
  @javax.annotation.Nonnull
  private String dtEzsigndocumentDuedate;

  public static final String SERIALIZED_NAME_I_EZSIGNFOLDER_SENDREMINDERFIRSTDAYS = "iEzsignfolderSendreminderfirstdays";
  @SerializedName(SERIALIZED_NAME_I_EZSIGNFOLDER_SENDREMINDERFIRSTDAYS)
  @javax.annotation.Nonnull
  private Integer iEzsignfolderSendreminderfirstdays;

  public static final String SERIALIZED_NAME_I_EZSIGNFOLDER_SENDREMINDEROTHERDAYS = "iEzsignfolderSendreminderotherdays";
  @SerializedName(SERIALIZED_NAME_I_EZSIGNFOLDER_SENDREMINDEROTHERDAYS)
  @javax.annotation.Nonnull
  private Integer iEzsignfolderSendreminderotherdays;

  public static final String SERIALIZED_NAME_T_EXTRA_MESSAGE = "tExtraMessage";
  @SerializedName(SERIALIZED_NAME_T_EXTRA_MESSAGE)
  @javax.annotation.Nonnull
  private String tExtraMessage;

  public static final String SERIALIZED_NAME_S_CSV_BASE64 = "sCsvBase64";
  @SerializedName(SERIALIZED_NAME_S_CSV_BASE64)
  @javax.annotation.Nonnull
  private byte[] sCsvBase64;

  public EzsignbulksendCreateEzsignbulksendtransmissionV2Request() {
  }

  public EzsignbulksendCreateEzsignbulksendtransmissionV2Request fkiUserlogintypeID(@javax.annotation.Nonnull Integer fkiUserlogintypeID) {
    this.fkiUserlogintypeID = fkiUserlogintypeID;
    return this;
  }

  /**
   * The unique ID of the Userlogintype  Valid values:  |Value|Description|Detail| |-|-|-| |1|**Email Only**|The Ezsignsigner will receive a secure link by email| |2|**Email and phone or SMS**|The Ezsignsigner will receive a secure link by email and will need to authenticate using SMS or Phone call. **Additional fee applies**| |3|**Email and secret question**|The Ezsignsigner will receive a secure link by email and will need to authenticate using a predefined question and answer| |4|**In person only**|The Ezsignsigner will only be able to sign \&quot;In-Person\&quot; and there won&#39;t be any authentication. No email will be sent for invitation to sign. Make sure you evaluate the risk of signature denial and at minimum, we recommend you use a handwritten signature type| |5|**In person with phone or SMS**|The Ezsignsigner will only be able to sign \&quot;In-Person\&quot; and will need to authenticate using SMS or Phone call. No email will be sent for invitation to sign. **Additional fee applies**| |6|**Embedded**|The Ezsignsigner will only be able to sign in the embedded solution. No email will be sent for invitation to sign. **Additional fee applies**|   |7|**Embedded with phone or SMS**|The Ezsignsigner will only be able to sign in the embedded solution and will need to authenticate using SMS or Phone call. No email will be sent for invitation to sign. **Additional fee applies**|   |8|**No validation**|The Ezsignsigner will not receive an email and won&#39;t have to validate his connection using 2 factor. **Additional fee applies**|      |9|**Sms only**|The Ezsignsigner will not receive an email but will will need to authenticate using SMS. **Additional fee applies**|     
   * minimum: 0
   * @return fkiUserlogintypeID
   */
  @javax.annotation.Nonnull
  public Integer getFkiUserlogintypeID() {
    return fkiUserlogintypeID;
  }

  public void setFkiUserlogintypeID(@javax.annotation.Nonnull Integer fkiUserlogintypeID) {
    this.fkiUserlogintypeID = fkiUserlogintypeID;
  }


  public EzsignbulksendCreateEzsignbulksendtransmissionV2Request fkiEzsigntsarequirementID(@javax.annotation.Nullable Integer fkiEzsigntsarequirementID) {
    this.fkiEzsigntsarequirementID = fkiEzsigntsarequirementID;
    return this;
  }

  /**
   * The unique ID of the Ezsigntsarequirement.  Determine if a Time Stamping Authority should add a timestamp on each of the signature. Valid values:  |Value|Description| |-|-| |1|No. TSA Timestamping will requested. This will make all signatures a lot faster since no round-trip to the TSA server will be required. Timestamping will be made using eZsign server&#39;s time.| |2|Best effort. Timestamping from a Time Stamping Authority will be requested but is not mandatory. In the very improbable case it cannot be completed, the timestamping will be made using eZsign server&#39;s time. **Additional fee applies**| |3|Mandatory. Timestamping from a Time Stamping Authority will be requested and is mandatory. In the very improbable case it cannot be completed, the signature will fail and the user will be asked to retry. **Additional fee applies**|
   * minimum: 1
   * maximum: 3
   * @return fkiEzsigntsarequirementID
   */
  @javax.annotation.Nullable
  public Integer getFkiEzsigntsarequirementID() {
    return fkiEzsigntsarequirementID;
  }

  public void setFkiEzsigntsarequirementID(@javax.annotation.Nullable Integer fkiEzsigntsarequirementID) {
    this.fkiEzsigntsarequirementID = fkiEzsigntsarequirementID;
  }


  public EzsignbulksendCreateEzsignbulksendtransmissionV2Request sEzsignbulksendtransmissionDescription(@javax.annotation.Nonnull String sEzsignbulksendtransmissionDescription) {
    this.sEzsignbulksendtransmissionDescription = sEzsignbulksendtransmissionDescription;
    return this;
  }

  /**
   * The description of the Ezsignbulksendtransmission
   * @return sEzsignbulksendtransmissionDescription
   */
  @javax.annotation.Nonnull
  public String getsEzsignbulksendtransmissionDescription() {
    return sEzsignbulksendtransmissionDescription;
  }

  public void setsEzsignbulksendtransmissionDescription(@javax.annotation.Nonnull String sEzsignbulksendtransmissionDescription) {
    this.sEzsignbulksendtransmissionDescription = sEzsignbulksendtransmissionDescription;
  }


  public EzsignbulksendCreateEzsignbulksendtransmissionV2Request dtEzsigndocumentDuedate(@javax.annotation.Nonnull String dtEzsigndocumentDuedate) {
    this.dtEzsigndocumentDuedate = dtEzsigndocumentDuedate;
    return this;
  }

  /**
   * The maximum date and time at which the Ezsigndocument can be signed.
   * @return dtEzsigndocumentDuedate
   */
  @javax.annotation.Nonnull
  public String getDtEzsigndocumentDuedate() {
    return dtEzsigndocumentDuedate;
  }

  public void setDtEzsigndocumentDuedate(@javax.annotation.Nonnull String dtEzsigndocumentDuedate) {
    this.dtEzsigndocumentDuedate = dtEzsigndocumentDuedate;
  }


  public EzsignbulksendCreateEzsignbulksendtransmissionV2Request iEzsignfolderSendreminderfirstdays(@javax.annotation.Nonnull Integer iEzsignfolderSendreminderfirstdays) {
    this.iEzsignfolderSendreminderfirstdays = iEzsignfolderSendreminderfirstdays;
    return this;
  }

  /**
   * The number of days before the the first reminder sending
   * minimum: 0
   * maximum: 255
   * @return iEzsignfolderSendreminderfirstdays
   */
  @javax.annotation.Nonnull
  public Integer getiEzsignfolderSendreminderfirstdays() {
    return iEzsignfolderSendreminderfirstdays;
  }

  public void setiEzsignfolderSendreminderfirstdays(@javax.annotation.Nonnull Integer iEzsignfolderSendreminderfirstdays) {
    this.iEzsignfolderSendreminderfirstdays = iEzsignfolderSendreminderfirstdays;
  }


  public EzsignbulksendCreateEzsignbulksendtransmissionV2Request iEzsignfolderSendreminderotherdays(@javax.annotation.Nonnull Integer iEzsignfolderSendreminderotherdays) {
    this.iEzsignfolderSendreminderotherdays = iEzsignfolderSendreminderotherdays;
    return this;
  }

  /**
   * The number of days after the first reminder sending
   * minimum: 0
   * maximum: 255
   * @return iEzsignfolderSendreminderotherdays
   */
  @javax.annotation.Nonnull
  public Integer getiEzsignfolderSendreminderotherdays() {
    return iEzsignfolderSendreminderotherdays;
  }

  public void setiEzsignfolderSendreminderotherdays(@javax.annotation.Nonnull Integer iEzsignfolderSendreminderotherdays) {
    this.iEzsignfolderSendreminderotherdays = iEzsignfolderSendreminderotherdays;
  }


  public EzsignbulksendCreateEzsignbulksendtransmissionV2Request tExtraMessage(@javax.annotation.Nonnull String tExtraMessage) {
    this.tExtraMessage = tExtraMessage;
    return this;
  }

  /**
   * A custom text message that will be added to the email sent.
   * @return tExtraMessage
   */
  @javax.annotation.Nonnull
  public String gettExtraMessage() {
    return tExtraMessage;
  }

  public void settExtraMessage(@javax.annotation.Nonnull String tExtraMessage) {
    this.tExtraMessage = tExtraMessage;
  }


  public EzsignbulksendCreateEzsignbulksendtransmissionV2Request sCsvBase64(@javax.annotation.Nonnull byte[] sCsvBase64) {
    this.sCsvBase64 = sCsvBase64;
    return this;
  }

  /**
   * The Base64 encoded binary content of the CSV file.
   * @return sCsvBase64
   */
  @javax.annotation.Nonnull
  public byte[] getsCsvBase64() {
    return sCsvBase64;
  }

  public void setsCsvBase64(@javax.annotation.Nonnull byte[] sCsvBase64) {
    this.sCsvBase64 = sCsvBase64;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignbulksendCreateEzsignbulksendtransmissionV2Request ezsignbulksendCreateEzsignbulksendtransmissionV2Request = (EzsignbulksendCreateEzsignbulksendtransmissionV2Request) o;
    return Objects.equals(this.fkiUserlogintypeID, ezsignbulksendCreateEzsignbulksendtransmissionV2Request.fkiUserlogintypeID) &&
        Objects.equals(this.fkiEzsigntsarequirementID, ezsignbulksendCreateEzsignbulksendtransmissionV2Request.fkiEzsigntsarequirementID) &&
        Objects.equals(this.sEzsignbulksendtransmissionDescription, ezsignbulksendCreateEzsignbulksendtransmissionV2Request.sEzsignbulksendtransmissionDescription) &&
        Objects.equals(this.dtEzsigndocumentDuedate, ezsignbulksendCreateEzsignbulksendtransmissionV2Request.dtEzsigndocumentDuedate) &&
        Objects.equals(this.iEzsignfolderSendreminderfirstdays, ezsignbulksendCreateEzsignbulksendtransmissionV2Request.iEzsignfolderSendreminderfirstdays) &&
        Objects.equals(this.iEzsignfolderSendreminderotherdays, ezsignbulksendCreateEzsignbulksendtransmissionV2Request.iEzsignfolderSendreminderotherdays) &&
        Objects.equals(this.tExtraMessage, ezsignbulksendCreateEzsignbulksendtransmissionV2Request.tExtraMessage) &&
        Arrays.equals(this.sCsvBase64, ezsignbulksendCreateEzsignbulksendtransmissionV2Request.sCsvBase64);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fkiUserlogintypeID, fkiEzsigntsarequirementID, sEzsignbulksendtransmissionDescription, dtEzsigndocumentDuedate, iEzsignfolderSendreminderfirstdays, iEzsignfolderSendreminderotherdays, tExtraMessage, Arrays.hashCode(sCsvBase64));
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignbulksendCreateEzsignbulksendtransmissionV2Request {\n");
    sb.append("    fkiUserlogintypeID: ").append(toIndentedString(fkiUserlogintypeID)).append("\n");
    sb.append("    fkiEzsigntsarequirementID: ").append(toIndentedString(fkiEzsigntsarequirementID)).append("\n");
    sb.append("    sEzsignbulksendtransmissionDescription: ").append(toIndentedString(sEzsignbulksendtransmissionDescription)).append("\n");
    sb.append("    dtEzsigndocumentDuedate: ").append(toIndentedString(dtEzsigndocumentDuedate)).append("\n");
    sb.append("    iEzsignfolderSendreminderfirstdays: ").append(toIndentedString(iEzsignfolderSendreminderfirstdays)).append("\n");
    sb.append("    iEzsignfolderSendreminderotherdays: ").append(toIndentedString(iEzsignfolderSendreminderotherdays)).append("\n");
    sb.append("    tExtraMessage: ").append(toIndentedString(tExtraMessage)).append("\n");
    sb.append("    sCsvBase64: ").append(toIndentedString(sCsvBase64)).append("\n");
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
    openapiFields.add("fkiUserlogintypeID");
    openapiFields.add("fkiEzsigntsarequirementID");
    openapiFields.add("sEzsignbulksendtransmissionDescription");
    openapiFields.add("dtEzsigndocumentDuedate");
    openapiFields.add("iEzsignfolderSendreminderfirstdays");
    openapiFields.add("iEzsignfolderSendreminderotherdays");
    openapiFields.add("tExtraMessage");
    openapiFields.add("sCsvBase64");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("fkiUserlogintypeID");
    openapiRequiredFields.add("sEzsignbulksendtransmissionDescription");
    openapiRequiredFields.add("dtEzsigndocumentDuedate");
    openapiRequiredFields.add("iEzsignfolderSendreminderfirstdays");
    openapiRequiredFields.add("iEzsignfolderSendreminderotherdays");
    openapiRequiredFields.add("tExtraMessage");
    openapiRequiredFields.add("sCsvBase64");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EzsignbulksendCreateEzsignbulksendtransmissionV2Request
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EzsignbulksendCreateEzsignbulksendtransmissionV2Request.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EzsignbulksendCreateEzsignbulksendtransmissionV2Request is not found in the empty JSON string", EzsignbulksendCreateEzsignbulksendtransmissionV2Request.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EzsignbulksendCreateEzsignbulksendtransmissionV2Request.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EzsignbulksendCreateEzsignbulksendtransmissionV2Request` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EzsignbulksendCreateEzsignbulksendtransmissionV2Request.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("sEzsignbulksendtransmissionDescription").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sEzsignbulksendtransmissionDescription` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sEzsignbulksendtransmissionDescription").toString()));
      }
      if (!jsonObj.get("dtEzsigndocumentDuedate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dtEzsigndocumentDuedate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dtEzsigndocumentDuedate").toString()));
      }
      if (!jsonObj.get("tExtraMessage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tExtraMessage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tExtraMessage").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EzsignbulksendCreateEzsignbulksendtransmissionV2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EzsignbulksendCreateEzsignbulksendtransmissionV2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EzsignbulksendCreateEzsignbulksendtransmissionV2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EzsignbulksendCreateEzsignbulksendtransmissionV2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<EzsignbulksendCreateEzsignbulksendtransmissionV2Request>() {
           @Override
           public void write(JsonWriter out, EzsignbulksendCreateEzsignbulksendtransmissionV2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EzsignbulksendCreateEzsignbulksendtransmissionV2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EzsignbulksendCreateEzsignbulksendtransmissionV2Request given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EzsignbulksendCreateEzsignbulksendtransmissionV2Request
   * @throws IOException if the JSON string is invalid with respect to EzsignbulksendCreateEzsignbulksendtransmissionV2Request
   */
  public static EzsignbulksendCreateEzsignbulksendtransmissionV2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EzsignbulksendCreateEzsignbulksendtransmissionV2Request.class);
  }

  /**
   * Convert an instance of EzsignbulksendCreateEzsignbulksendtransmissionV2Request to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

