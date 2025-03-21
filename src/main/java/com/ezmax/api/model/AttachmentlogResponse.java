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
import com.ezmax.api.model.FieldEAttachmentlogType;
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
 * An Attachmentlog Object
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-07T19:20:13.445471985Z[Etc/UTC]", comments = "Generator version: 7.12.0")
public class AttachmentlogResponse {
  public static final String SERIALIZED_NAME_FKI_ATTACHMENT_I_D = "fkiAttachmentID";
  @SerializedName(SERIALIZED_NAME_FKI_ATTACHMENT_I_D)
  @javax.annotation.Nonnull
  private Integer fkiAttachmentID;

  public static final String SERIALIZED_NAME_FKI_USER_I_D = "fkiUserID";
  @SerializedName(SERIALIZED_NAME_FKI_USER_I_D)
  @javax.annotation.Nonnull
  private Integer fkiUserID;

  public static final String SERIALIZED_NAME_DT_ATTACHMENTLOG_DATETIME = "dtAttachmentlogDatetime";
  @SerializedName(SERIALIZED_NAME_DT_ATTACHMENTLOG_DATETIME)
  @javax.annotation.Nonnull
  private String dtAttachmentlogDatetime;

  public static final String SERIALIZED_NAME_E_ATTACHMENTLOG_TYPE = "eAttachmentlogType";
  @SerializedName(SERIALIZED_NAME_E_ATTACHMENTLOG_TYPE)
  @javax.annotation.Nonnull
  private FieldEAttachmentlogType eAttachmentlogType;

  public static final String SERIALIZED_NAME_S_ATTACHMENTLOG_DETAIL = "sAttachmentlogDetail";
  @SerializedName(SERIALIZED_NAME_S_ATTACHMENTLOG_DETAIL)
  @javax.annotation.Nullable
  private String sAttachmentlogDetail;

  public AttachmentlogResponse() {
  }

  public AttachmentlogResponse fkiAttachmentID(@javax.annotation.Nonnull Integer fkiAttachmentID) {
    this.fkiAttachmentID = fkiAttachmentID;
    return this;
  }

  /**
   * The unique ID of the Attachment.
   * minimum: 0
   * @return fkiAttachmentID
   */
  @javax.annotation.Nonnull
  public Integer getFkiAttachmentID() {
    return fkiAttachmentID;
  }

  public void setFkiAttachmentID(@javax.annotation.Nonnull Integer fkiAttachmentID) {
    this.fkiAttachmentID = fkiAttachmentID;
  }


  public AttachmentlogResponse fkiUserID(@javax.annotation.Nonnull Integer fkiUserID) {
    this.fkiUserID = fkiUserID;
    return this;
  }

  /**
   * The unique ID of the User
   * minimum: 0
   * @return fkiUserID
   */
  @javax.annotation.Nonnull
  public Integer getFkiUserID() {
    return fkiUserID;
  }

  public void setFkiUserID(@javax.annotation.Nonnull Integer fkiUserID) {
    this.fkiUserID = fkiUserID;
  }


  public AttachmentlogResponse dtAttachmentlogDatetime(@javax.annotation.Nonnull String dtAttachmentlogDatetime) {
    this.dtAttachmentlogDatetime = dtAttachmentlogDatetime;
    return this;
  }

  /**
   * The created date
   * @return dtAttachmentlogDatetime
   */
  @javax.annotation.Nonnull
  public String getDtAttachmentlogDatetime() {
    return dtAttachmentlogDatetime;
  }

  public void setDtAttachmentlogDatetime(@javax.annotation.Nonnull String dtAttachmentlogDatetime) {
    this.dtAttachmentlogDatetime = dtAttachmentlogDatetime;
  }


  public AttachmentlogResponse eAttachmentlogType(@javax.annotation.Nonnull FieldEAttachmentlogType eAttachmentlogType) {
    this.eAttachmentlogType = eAttachmentlogType;
    return this;
  }

  /**
   * Get eAttachmentlogType
   * @return eAttachmentlogType
   */
  @javax.annotation.Nonnull
  public FieldEAttachmentlogType geteAttachmentlogType() {
    return eAttachmentlogType;
  }

  public void seteAttachmentlogType(@javax.annotation.Nonnull FieldEAttachmentlogType eAttachmentlogType) {
    this.eAttachmentlogType = eAttachmentlogType;
  }


  public AttachmentlogResponse sAttachmentlogDetail(@javax.annotation.Nullable String sAttachmentlogDetail) {
    this.sAttachmentlogDetail = sAttachmentlogDetail;
    return this;
  }

  /**
   * The additionnal detail
   * @return sAttachmentlogDetail
   */
  @javax.annotation.Nullable
  public String getsAttachmentlogDetail() {
    return sAttachmentlogDetail;
  }

  public void setsAttachmentlogDetail(@javax.annotation.Nullable String sAttachmentlogDetail) {
    this.sAttachmentlogDetail = sAttachmentlogDetail;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttachmentlogResponse attachmentlogResponse = (AttachmentlogResponse) o;
    return Objects.equals(this.fkiAttachmentID, attachmentlogResponse.fkiAttachmentID) &&
        Objects.equals(this.fkiUserID, attachmentlogResponse.fkiUserID) &&
        Objects.equals(this.dtAttachmentlogDatetime, attachmentlogResponse.dtAttachmentlogDatetime) &&
        Objects.equals(this.eAttachmentlogType, attachmentlogResponse.eAttachmentlogType) &&
        Objects.equals(this.sAttachmentlogDetail, attachmentlogResponse.sAttachmentlogDetail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fkiAttachmentID, fkiUserID, dtAttachmentlogDatetime, eAttachmentlogType, sAttachmentlogDetail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttachmentlogResponse {\n");
    sb.append("    fkiAttachmentID: ").append(toIndentedString(fkiAttachmentID)).append("\n");
    sb.append("    fkiUserID: ").append(toIndentedString(fkiUserID)).append("\n");
    sb.append("    dtAttachmentlogDatetime: ").append(toIndentedString(dtAttachmentlogDatetime)).append("\n");
    sb.append("    eAttachmentlogType: ").append(toIndentedString(eAttachmentlogType)).append("\n");
    sb.append("    sAttachmentlogDetail: ").append(toIndentedString(sAttachmentlogDetail)).append("\n");
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
    openapiFields.add("fkiAttachmentID");
    openapiFields.add("fkiUserID");
    openapiFields.add("dtAttachmentlogDatetime");
    openapiFields.add("eAttachmentlogType");
    openapiFields.add("sAttachmentlogDetail");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("fkiAttachmentID");
    openapiRequiredFields.add("fkiUserID");
    openapiRequiredFields.add("dtAttachmentlogDatetime");
    openapiRequiredFields.add("eAttachmentlogType");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AttachmentlogResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AttachmentlogResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AttachmentlogResponse is not found in the empty JSON string", AttachmentlogResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AttachmentlogResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AttachmentlogResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AttachmentlogResponse.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("dtAttachmentlogDatetime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dtAttachmentlogDatetime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dtAttachmentlogDatetime").toString()));
      }
      // validate the required field `eAttachmentlogType`
      FieldEAttachmentlogType.validateJsonElement(jsonObj.get("eAttachmentlogType"));
      if ((jsonObj.get("sAttachmentlogDetail") != null && !jsonObj.get("sAttachmentlogDetail").isJsonNull()) && !jsonObj.get("sAttachmentlogDetail").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sAttachmentlogDetail` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sAttachmentlogDetail").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AttachmentlogResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AttachmentlogResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AttachmentlogResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AttachmentlogResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<AttachmentlogResponse>() {
           @Override
           public void write(JsonWriter out, AttachmentlogResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AttachmentlogResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AttachmentlogResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AttachmentlogResponse
   * @throws IOException if the JSON string is invalid with respect to AttachmentlogResponse
   */
  public static AttachmentlogResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AttachmentlogResponse.class);
  }

  /**
   * Convert an instance of AttachmentlogResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

