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
import com.ezmax.api.model.CommunicationattachmentResponseCompound;
import com.ezmax.api.model.CommunicationexternalimageResponseCompound;
import com.ezmax.api.model.CommunicationexternalrecipientResponseCompound;
import com.ezmax.api.model.CommunicationimageResponseCompound;
import com.ezmax.api.model.CommunicationrecipientResponseCompound;
import com.ezmax.api.model.CustomContactNameResponse;
import com.ezmax.api.model.FieldECommunicationEmailimportance;
import com.ezmax.api.model.FieldECommunicationType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import eZmaxAPI.JSON;

/**
 * A Communication Object
 */
@ApiModel(description = "A Communication Object")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-01T20:33:46.172972014Z[Etc/UTC]")
public class CommunicationResponseCompound {
  public static final String SERIALIZED_NAME_PKI_COMMUNICATION_I_D = "pkiCommunicationID";
  @SerializedName(SERIALIZED_NAME_PKI_COMMUNICATION_I_D)
  private Integer pkiCommunicationID;

  public static final String SERIALIZED_NAME_E_COMMUNICATION_EMAILIMPORTANCE = "eCommunicationEmailimportance";
  @SerializedName(SERIALIZED_NAME_E_COMMUNICATION_EMAILIMPORTANCE)
  private FieldECommunicationEmailimportance eCommunicationEmailimportance;

  public static final String SERIALIZED_NAME_E_COMMUNICATION_TYPE = "eCommunicationType";
  @SerializedName(SERIALIZED_NAME_E_COMMUNICATION_TYPE)
  private FieldECommunicationType eCommunicationType;

  public static final String SERIALIZED_NAME_S_COMMUNICATION_SUBJECT = "sCommunicationSubject";
  @SerializedName(SERIALIZED_NAME_S_COMMUNICATION_SUBJECT)
  private String sCommunicationSubject;

  public static final String SERIALIZED_NAME_DT_COMMUNICATION_SENTDATE = "dtCommunicationSentdate";
  @SerializedName(SERIALIZED_NAME_DT_COMMUNICATION_SENTDATE)
  private String dtCommunicationSentdate;

  public static final String SERIALIZED_NAME_OBJ_CONTACT_FROM = "objContactFrom";
  @SerializedName(SERIALIZED_NAME_OBJ_CONTACT_FROM)
  private CustomContactNameResponse objContactFrom;

  public static final String SERIALIZED_NAME_A_OBJ_COMMUNICATIONATTACHMENT = "a_objCommunicationattachment";
  @SerializedName(SERIALIZED_NAME_A_OBJ_COMMUNICATIONATTACHMENT)
  private List<CommunicationattachmentResponseCompound> aObjCommunicationattachment = new ArrayList<>();

  public static final String SERIALIZED_NAME_A_OBJ_COMMUNICATIONRECIPIENT = "a_objCommunicationrecipient";
  @SerializedName(SERIALIZED_NAME_A_OBJ_COMMUNICATIONRECIPIENT)
  private List<CommunicationrecipientResponseCompound> aObjCommunicationrecipient = new ArrayList<>();

  public static final String SERIALIZED_NAME_A_OBJ_COMMUNICATIONEXTERNALRECIPIENT = "a_objCommunicationexternalrecipient";
  @SerializedName(SERIALIZED_NAME_A_OBJ_COMMUNICATIONEXTERNALRECIPIENT)
  private List<CommunicationexternalrecipientResponseCompound> aObjCommunicationexternalrecipient = new ArrayList<>();

  public static final String SERIALIZED_NAME_A_OBJ_COMMUNICATIONIMAGE = "a_objCommunicationimage";
  @SerializedName(SERIALIZED_NAME_A_OBJ_COMMUNICATIONIMAGE)
  private List<CommunicationimageResponseCompound> aObjCommunicationimage = new ArrayList<>();

  public static final String SERIALIZED_NAME_A_OBJ_COMMUNICATIONEXTERNALIMAGE = "a_objCommunicationexternalimage";
  @SerializedName(SERIALIZED_NAME_A_OBJ_COMMUNICATIONEXTERNALIMAGE)
  private List<CommunicationexternalimageResponseCompound> aObjCommunicationexternalimage = new ArrayList<>();

  public CommunicationResponseCompound() {
  }

  public CommunicationResponseCompound pkiCommunicationID(Integer pkiCommunicationID) {
    
    this.pkiCommunicationID = pkiCommunicationID;
    return this;
  }

   /**
   * The unique ID of the Communication.
   * minimum: 0
   * @return pkiCommunicationID
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1", required = true, value = "The unique ID of the Communication.")

  public Integer getPkiCommunicationID() {
    return pkiCommunicationID;
  }


  public void setPkiCommunicationID(Integer pkiCommunicationID) {
    this.pkiCommunicationID = pkiCommunicationID;
  }


  public CommunicationResponseCompound eCommunicationEmailimportance(FieldECommunicationEmailimportance eCommunicationEmailimportance) {
    
    this.eCommunicationEmailimportance = eCommunicationEmailimportance;
    return this;
  }

   /**
   * Get eCommunicationEmailimportance
   * @return eCommunicationEmailimportance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FieldECommunicationEmailimportance geteCommunicationEmailimportance() {
    return eCommunicationEmailimportance;
  }


  public void seteCommunicationEmailimportance(FieldECommunicationEmailimportance eCommunicationEmailimportance) {
    this.eCommunicationEmailimportance = eCommunicationEmailimportance;
  }


  public CommunicationResponseCompound eCommunicationType(FieldECommunicationType eCommunicationType) {
    
    this.eCommunicationType = eCommunicationType;
    return this;
  }

   /**
   * Get eCommunicationType
   * @return eCommunicationType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public FieldECommunicationType geteCommunicationType() {
    return eCommunicationType;
  }


  public void seteCommunicationType(FieldECommunicationType eCommunicationType) {
    this.eCommunicationType = eCommunicationType;
  }


  public CommunicationResponseCompound sCommunicationSubject(String sCommunicationSubject) {
    
    this.sCommunicationSubject = sCommunicationSubject;
    return this;
  }

   /**
   * The Subject of the Communication
   * @return sCommunicationSubject
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "This is an example of subject", required = true, value = "The Subject of the Communication")

  public String getsCommunicationSubject() {
    return sCommunicationSubject;
  }


  public void setsCommunicationSubject(String sCommunicationSubject) {
    this.sCommunicationSubject = sCommunicationSubject;
  }


  public CommunicationResponseCompound dtCommunicationSentdate(String dtCommunicationSentdate) {
    
    this.dtCommunicationSentdate = dtCommunicationSentdate;
    return this;
  }

   /**
   * The send date and time at which the Communication was sent.
   * @return dtCommunicationSentdate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2020-12-31 23:59:59", required = true, value = "The send date and time at which the Communication was sent.")

  public String getDtCommunicationSentdate() {
    return dtCommunicationSentdate;
  }


  public void setDtCommunicationSentdate(String dtCommunicationSentdate) {
    this.dtCommunicationSentdate = dtCommunicationSentdate;
  }


  public CommunicationResponseCompound objContactFrom(CustomContactNameResponse objContactFrom) {
    
    this.objContactFrom = objContactFrom;
    return this;
  }

   /**
   * Get objContactFrom
   * @return objContactFrom
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public CustomContactNameResponse getObjContactFrom() {
    return objContactFrom;
  }


  public void setObjContactFrom(CustomContactNameResponse objContactFrom) {
    this.objContactFrom = objContactFrom;
  }


  public CommunicationResponseCompound aObjCommunicationattachment(List<CommunicationattachmentResponseCompound> aObjCommunicationattachment) {
    
    this.aObjCommunicationattachment = aObjCommunicationattachment;
    return this;
  }

  public CommunicationResponseCompound addAObjCommunicationattachmentItem(CommunicationattachmentResponseCompound aObjCommunicationattachmentItem) {
    this.aObjCommunicationattachment.add(aObjCommunicationattachmentItem);
    return this;
  }

   /**
   * Get aObjCommunicationattachment
   * @return aObjCommunicationattachment
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<CommunicationattachmentResponseCompound> getaObjCommunicationattachment() {
    return aObjCommunicationattachment;
  }


  public void setaObjCommunicationattachment(List<CommunicationattachmentResponseCompound> aObjCommunicationattachment) {
    this.aObjCommunicationattachment = aObjCommunicationattachment;
  }


  public CommunicationResponseCompound aObjCommunicationrecipient(List<CommunicationrecipientResponseCompound> aObjCommunicationrecipient) {
    
    this.aObjCommunicationrecipient = aObjCommunicationrecipient;
    return this;
  }

  public CommunicationResponseCompound addAObjCommunicationrecipientItem(CommunicationrecipientResponseCompound aObjCommunicationrecipientItem) {
    this.aObjCommunicationrecipient.add(aObjCommunicationrecipientItem);
    return this;
  }

   /**
   * Get aObjCommunicationrecipient
   * @return aObjCommunicationrecipient
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<CommunicationrecipientResponseCompound> getaObjCommunicationrecipient() {
    return aObjCommunicationrecipient;
  }


  public void setaObjCommunicationrecipient(List<CommunicationrecipientResponseCompound> aObjCommunicationrecipient) {
    this.aObjCommunicationrecipient = aObjCommunicationrecipient;
  }


  public CommunicationResponseCompound aObjCommunicationexternalrecipient(List<CommunicationexternalrecipientResponseCompound> aObjCommunicationexternalrecipient) {
    
    this.aObjCommunicationexternalrecipient = aObjCommunicationexternalrecipient;
    return this;
  }

  public CommunicationResponseCompound addAObjCommunicationexternalrecipientItem(CommunicationexternalrecipientResponseCompound aObjCommunicationexternalrecipientItem) {
    this.aObjCommunicationexternalrecipient.add(aObjCommunicationexternalrecipientItem);
    return this;
  }

   /**
   * Get aObjCommunicationexternalrecipient
   * @return aObjCommunicationexternalrecipient
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<CommunicationexternalrecipientResponseCompound> getaObjCommunicationexternalrecipient() {
    return aObjCommunicationexternalrecipient;
  }


  public void setaObjCommunicationexternalrecipient(List<CommunicationexternalrecipientResponseCompound> aObjCommunicationexternalrecipient) {
    this.aObjCommunicationexternalrecipient = aObjCommunicationexternalrecipient;
  }


  public CommunicationResponseCompound aObjCommunicationimage(List<CommunicationimageResponseCompound> aObjCommunicationimage) {
    
    this.aObjCommunicationimage = aObjCommunicationimage;
    return this;
  }

  public CommunicationResponseCompound addAObjCommunicationimageItem(CommunicationimageResponseCompound aObjCommunicationimageItem) {
    this.aObjCommunicationimage.add(aObjCommunicationimageItem);
    return this;
  }

   /**
   * Get aObjCommunicationimage
   * @return aObjCommunicationimage
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<CommunicationimageResponseCompound> getaObjCommunicationimage() {
    return aObjCommunicationimage;
  }


  public void setaObjCommunicationimage(List<CommunicationimageResponseCompound> aObjCommunicationimage) {
    this.aObjCommunicationimage = aObjCommunicationimage;
  }


  public CommunicationResponseCompound aObjCommunicationexternalimage(List<CommunicationexternalimageResponseCompound> aObjCommunicationexternalimage) {
    
    this.aObjCommunicationexternalimage = aObjCommunicationexternalimage;
    return this;
  }

  public CommunicationResponseCompound addAObjCommunicationexternalimageItem(CommunicationexternalimageResponseCompound aObjCommunicationexternalimageItem) {
    this.aObjCommunicationexternalimage.add(aObjCommunicationexternalimageItem);
    return this;
  }

   /**
   * Get aObjCommunicationexternalimage
   * @return aObjCommunicationexternalimage
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<CommunicationexternalimageResponseCompound> getaObjCommunicationexternalimage() {
    return aObjCommunicationexternalimage;
  }


  public void setaObjCommunicationexternalimage(List<CommunicationexternalimageResponseCompound> aObjCommunicationexternalimage) {
    this.aObjCommunicationexternalimage = aObjCommunicationexternalimage;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommunicationResponseCompound communicationResponseCompound = (CommunicationResponseCompound) o;
    return Objects.equals(this.pkiCommunicationID, communicationResponseCompound.pkiCommunicationID) &&
        Objects.equals(this.eCommunicationEmailimportance, communicationResponseCompound.eCommunicationEmailimportance) &&
        Objects.equals(this.eCommunicationType, communicationResponseCompound.eCommunicationType) &&
        Objects.equals(this.sCommunicationSubject, communicationResponseCompound.sCommunicationSubject) &&
        Objects.equals(this.dtCommunicationSentdate, communicationResponseCompound.dtCommunicationSentdate) &&
        Objects.equals(this.objContactFrom, communicationResponseCompound.objContactFrom) &&
        Objects.equals(this.aObjCommunicationattachment, communicationResponseCompound.aObjCommunicationattachment) &&
        Objects.equals(this.aObjCommunicationrecipient, communicationResponseCompound.aObjCommunicationrecipient) &&
        Objects.equals(this.aObjCommunicationexternalrecipient, communicationResponseCompound.aObjCommunicationexternalrecipient) &&
        Objects.equals(this.aObjCommunicationimage, communicationResponseCompound.aObjCommunicationimage) &&
        Objects.equals(this.aObjCommunicationexternalimage, communicationResponseCompound.aObjCommunicationexternalimage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pkiCommunicationID, eCommunicationEmailimportance, eCommunicationType, sCommunicationSubject, dtCommunicationSentdate, objContactFrom, aObjCommunicationattachment, aObjCommunicationrecipient, aObjCommunicationexternalrecipient, aObjCommunicationimage, aObjCommunicationexternalimage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommunicationResponseCompound {\n");
    sb.append("    pkiCommunicationID: ").append(toIndentedString(pkiCommunicationID)).append("\n");
    sb.append("    eCommunicationEmailimportance: ").append(toIndentedString(eCommunicationEmailimportance)).append("\n");
    sb.append("    eCommunicationType: ").append(toIndentedString(eCommunicationType)).append("\n");
    sb.append("    sCommunicationSubject: ").append(toIndentedString(sCommunicationSubject)).append("\n");
    sb.append("    dtCommunicationSentdate: ").append(toIndentedString(dtCommunicationSentdate)).append("\n");
    sb.append("    objContactFrom: ").append(toIndentedString(objContactFrom)).append("\n");
    sb.append("    aObjCommunicationattachment: ").append(toIndentedString(aObjCommunicationattachment)).append("\n");
    sb.append("    aObjCommunicationrecipient: ").append(toIndentedString(aObjCommunicationrecipient)).append("\n");
    sb.append("    aObjCommunicationexternalrecipient: ").append(toIndentedString(aObjCommunicationexternalrecipient)).append("\n");
    sb.append("    aObjCommunicationimage: ").append(toIndentedString(aObjCommunicationimage)).append("\n");
    sb.append("    aObjCommunicationexternalimage: ").append(toIndentedString(aObjCommunicationexternalimage)).append("\n");
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
    openapiFields.add("eCommunicationEmailimportance");
    openapiFields.add("eCommunicationType");
    openapiFields.add("sCommunicationSubject");
    openapiFields.add("dtCommunicationSentdate");
    openapiFields.add("objContactFrom");
    openapiFields.add("a_objCommunicationattachment");
    openapiFields.add("a_objCommunicationrecipient");
    openapiFields.add("a_objCommunicationexternalrecipient");
    openapiFields.add("a_objCommunicationimage");
    openapiFields.add("a_objCommunicationexternalimage");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("pkiCommunicationID");
    openapiRequiredFields.add("eCommunicationType");
    openapiRequiredFields.add("sCommunicationSubject");
    openapiRequiredFields.add("dtCommunicationSentdate");
    openapiRequiredFields.add("objContactFrom");
    openapiRequiredFields.add("a_objCommunicationattachment");
    openapiRequiredFields.add("a_objCommunicationrecipient");
    openapiRequiredFields.add("a_objCommunicationexternalrecipient");
    openapiRequiredFields.add("a_objCommunicationimage");
    openapiRequiredFields.add("a_objCommunicationexternalimage");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CommunicationResponseCompound
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CommunicationResponseCompound.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CommunicationResponseCompound is not found in the empty JSON string", CommunicationResponseCompound.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CommunicationResponseCompound.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CommunicationResponseCompound` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CommunicationResponseCompound.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("sCommunicationSubject").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sCommunicationSubject` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sCommunicationSubject").toString()));
      }
      if (!jsonObj.get("dtCommunicationSentdate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dtCommunicationSentdate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dtCommunicationSentdate").toString()));
      }
      // validate the required field `objContactFrom`
      CustomContactNameResponse.validateJsonObject(jsonObj.getAsJsonObject("objContactFrom"));
      // ensure the json data is an array
      if (!jsonObj.get("a_objCommunicationattachment").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `a_objCommunicationattachment` to be an array in the JSON string but got `%s`", jsonObj.get("a_objCommunicationattachment").toString()));
      }

      JsonArray jsonArrayaObjCommunicationattachment = jsonObj.getAsJsonArray("a_objCommunicationattachment");
      // validate the required field `a_objCommunicationattachment` (array)
      for (int i = 0; i < jsonArrayaObjCommunicationattachment.size(); i++) {
        CommunicationattachmentResponseCompound.validateJsonObject(jsonArrayaObjCommunicationattachment.get(i).getAsJsonObject());
      };
      // ensure the json data is an array
      if (!jsonObj.get("a_objCommunicationrecipient").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `a_objCommunicationrecipient` to be an array in the JSON string but got `%s`", jsonObj.get("a_objCommunicationrecipient").toString()));
      }

      JsonArray jsonArrayaObjCommunicationrecipient = jsonObj.getAsJsonArray("a_objCommunicationrecipient");
      // validate the required field `a_objCommunicationrecipient` (array)
      for (int i = 0; i < jsonArrayaObjCommunicationrecipient.size(); i++) {
        CommunicationrecipientResponseCompound.validateJsonObject(jsonArrayaObjCommunicationrecipient.get(i).getAsJsonObject());
      };
      // ensure the json data is an array
      if (!jsonObj.get("a_objCommunicationexternalrecipient").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `a_objCommunicationexternalrecipient` to be an array in the JSON string but got `%s`", jsonObj.get("a_objCommunicationexternalrecipient").toString()));
      }

      JsonArray jsonArrayaObjCommunicationexternalrecipient = jsonObj.getAsJsonArray("a_objCommunicationexternalrecipient");
      // validate the required field `a_objCommunicationexternalrecipient` (array)
      for (int i = 0; i < jsonArrayaObjCommunicationexternalrecipient.size(); i++) {
        CommunicationexternalrecipientResponseCompound.validateJsonObject(jsonArrayaObjCommunicationexternalrecipient.get(i).getAsJsonObject());
      };
      // ensure the json data is an array
      if (!jsonObj.get("a_objCommunicationimage").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `a_objCommunicationimage` to be an array in the JSON string but got `%s`", jsonObj.get("a_objCommunicationimage").toString()));
      }

      JsonArray jsonArrayaObjCommunicationimage = jsonObj.getAsJsonArray("a_objCommunicationimage");
      // validate the required field `a_objCommunicationimage` (array)
      for (int i = 0; i < jsonArrayaObjCommunicationimage.size(); i++) {
        CommunicationimageResponseCompound.validateJsonObject(jsonArrayaObjCommunicationimage.get(i).getAsJsonObject());
      };
      // ensure the json data is an array
      if (!jsonObj.get("a_objCommunicationexternalimage").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `a_objCommunicationexternalimage` to be an array in the JSON string but got `%s`", jsonObj.get("a_objCommunicationexternalimage").toString()));
      }

      JsonArray jsonArrayaObjCommunicationexternalimage = jsonObj.getAsJsonArray("a_objCommunicationexternalimage");
      // validate the required field `a_objCommunicationexternalimage` (array)
      for (int i = 0; i < jsonArrayaObjCommunicationexternalimage.size(); i++) {
        CommunicationexternalimageResponseCompound.validateJsonObject(jsonArrayaObjCommunicationexternalimage.get(i).getAsJsonObject());
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CommunicationResponseCompound.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CommunicationResponseCompound' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CommunicationResponseCompound> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CommunicationResponseCompound.class));

       return (TypeAdapter<T>) new TypeAdapter<CommunicationResponseCompound>() {
           @Override
           public void write(JsonWriter out, CommunicationResponseCompound value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CommunicationResponseCompound read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CommunicationResponseCompound given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CommunicationResponseCompound
  * @throws IOException if the JSON string is invalid with respect to CommunicationResponseCompound
  */
  public static CommunicationResponseCompound fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CommunicationResponseCompound.class);
  }

 /**
  * Convert an instance of CommunicationResponseCompound to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
