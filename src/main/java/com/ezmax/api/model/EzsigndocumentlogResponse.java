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
import com.ezmax.api.model.FieldEEzsigndocumentlogType;
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
 * An Ezsigndocumentlog Object
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-07T19:20:13.445471985Z[Etc/UTC]", comments = "Generator version: 7.12.0")
public class EzsigndocumentlogResponse {
  public static final String SERIALIZED_NAME_FKI_USER_I_D = "fkiUserID";
  @SerializedName(SERIALIZED_NAME_FKI_USER_I_D)
  @javax.annotation.Nullable
  private Integer fkiUserID;

  public static final String SERIALIZED_NAME_FKI_EZSIGNSIGNER_I_D = "fkiEzsignsignerID";
  @SerializedName(SERIALIZED_NAME_FKI_EZSIGNSIGNER_I_D)
  @javax.annotation.Nullable
  private Integer fkiEzsignsignerID;

  public static final String SERIALIZED_NAME_DT_EZSIGNDOCUMENTLOG_DATETIME = "dtEzsigndocumentlogDatetime";
  @SerializedName(SERIALIZED_NAME_DT_EZSIGNDOCUMENTLOG_DATETIME)
  @javax.annotation.Nonnull
  private String dtEzsigndocumentlogDatetime;

  public static final String SERIALIZED_NAME_E_EZSIGNDOCUMENTLOG_TYPE = "eEzsigndocumentlogType";
  @SerializedName(SERIALIZED_NAME_E_EZSIGNDOCUMENTLOG_TYPE)
  @javax.annotation.Nonnull
  private FieldEEzsigndocumentlogType eEzsigndocumentlogType;

  public static final String SERIALIZED_NAME_S_EZSIGNDOCUMENTLOG_DETAIL = "sEzsigndocumentlogDetail";
  @SerializedName(SERIALIZED_NAME_S_EZSIGNDOCUMENTLOG_DETAIL)
  @javax.annotation.Nonnull
  private String sEzsigndocumentlogDetail;

  public static final String SERIALIZED_NAME_S_EZSIGNDOCUMENTLOG_LASTNAME = "sEzsigndocumentlogLastname";
  @SerializedName(SERIALIZED_NAME_S_EZSIGNDOCUMENTLOG_LASTNAME)
  @javax.annotation.Nonnull
  private String sEzsigndocumentlogLastname;

  public static final String SERIALIZED_NAME_S_EZSIGNDOCUMENTLOG_FIRSTNAME = "sEzsigndocumentlogFirstname";
  @SerializedName(SERIALIZED_NAME_S_EZSIGNDOCUMENTLOG_FIRSTNAME)
  @javax.annotation.Nonnull
  private String sEzsigndocumentlogFirstname;

  public static final String SERIALIZED_NAME_S_EZSIGNDOCUMENTLOG_I_P = "sEzsigndocumentlogIP";
  @SerializedName(SERIALIZED_NAME_S_EZSIGNDOCUMENTLOG_I_P)
  @javax.annotation.Nonnull
  private String sEzsigndocumentlogIP;

  public EzsigndocumentlogResponse() {
  }

  public EzsigndocumentlogResponse fkiUserID(@javax.annotation.Nullable Integer fkiUserID) {
    this.fkiUserID = fkiUserID;
    return this;
  }

  /**
   * The unique ID of the User
   * minimum: 0
   * @return fkiUserID
   */
  @javax.annotation.Nullable
  public Integer getFkiUserID() {
    return fkiUserID;
  }

  public void setFkiUserID(@javax.annotation.Nullable Integer fkiUserID) {
    this.fkiUserID = fkiUserID;
  }


  public EzsigndocumentlogResponse fkiEzsignsignerID(@javax.annotation.Nullable Integer fkiEzsignsignerID) {
    this.fkiEzsignsignerID = fkiEzsignsignerID;
    return this;
  }

  /**
   * The unique ID of the Ezsignsigner
   * minimum: 0
   * @return fkiEzsignsignerID
   */
  @javax.annotation.Nullable
  public Integer getFkiEzsignsignerID() {
    return fkiEzsignsignerID;
  }

  public void setFkiEzsignsignerID(@javax.annotation.Nullable Integer fkiEzsignsignerID) {
    this.fkiEzsignsignerID = fkiEzsignsignerID;
  }


  public EzsigndocumentlogResponse dtEzsigndocumentlogDatetime(@javax.annotation.Nonnull String dtEzsigndocumentlogDatetime) {
    this.dtEzsigndocumentlogDatetime = dtEzsigndocumentlogDatetime;
    return this;
  }

  /**
   * The date and time at which the event was logged
   * @return dtEzsigndocumentlogDatetime
   */
  @javax.annotation.Nonnull
  public String getDtEzsigndocumentlogDatetime() {
    return dtEzsigndocumentlogDatetime;
  }

  public void setDtEzsigndocumentlogDatetime(@javax.annotation.Nonnull String dtEzsigndocumentlogDatetime) {
    this.dtEzsigndocumentlogDatetime = dtEzsigndocumentlogDatetime;
  }


  public EzsigndocumentlogResponse eEzsigndocumentlogType(@javax.annotation.Nonnull FieldEEzsigndocumentlogType eEzsigndocumentlogType) {
    this.eEzsigndocumentlogType = eEzsigndocumentlogType;
    return this;
  }

  /**
   * Get eEzsigndocumentlogType
   * @return eEzsigndocumentlogType
   */
  @javax.annotation.Nonnull
  public FieldEEzsigndocumentlogType geteEzsigndocumentlogType() {
    return eEzsigndocumentlogType;
  }

  public void seteEzsigndocumentlogType(@javax.annotation.Nonnull FieldEEzsigndocumentlogType eEzsigndocumentlogType) {
    this.eEzsigndocumentlogType = eEzsigndocumentlogType;
  }


  public EzsigndocumentlogResponse sEzsigndocumentlogDetail(@javax.annotation.Nonnull String sEzsigndocumentlogDetail) {
    this.sEzsigndocumentlogDetail = sEzsigndocumentlogDetail;
    return this;
  }

  /**
   * The detail of the Ezsigndocumentlog
   * @return sEzsigndocumentlogDetail
   */
  @javax.annotation.Nonnull
  public String getsEzsigndocumentlogDetail() {
    return sEzsigndocumentlogDetail;
  }

  public void setsEzsigndocumentlogDetail(@javax.annotation.Nonnull String sEzsigndocumentlogDetail) {
    this.sEzsigndocumentlogDetail = sEzsigndocumentlogDetail;
  }


  public EzsigndocumentlogResponse sEzsigndocumentlogLastname(@javax.annotation.Nonnull String sEzsigndocumentlogLastname) {
    this.sEzsigndocumentlogLastname = sEzsigndocumentlogLastname;
    return this;
  }

  /**
   * The last name of the User or Ezsignsigner
   * @return sEzsigndocumentlogLastname
   */
  @javax.annotation.Nonnull
  public String getsEzsigndocumentlogLastname() {
    return sEzsigndocumentlogLastname;
  }

  public void setsEzsigndocumentlogLastname(@javax.annotation.Nonnull String sEzsigndocumentlogLastname) {
    this.sEzsigndocumentlogLastname = sEzsigndocumentlogLastname;
  }


  public EzsigndocumentlogResponse sEzsigndocumentlogFirstname(@javax.annotation.Nonnull String sEzsigndocumentlogFirstname) {
    this.sEzsigndocumentlogFirstname = sEzsigndocumentlogFirstname;
    return this;
  }

  /**
   * The first name of the User or Ezsignsigner
   * @return sEzsigndocumentlogFirstname
   */
  @javax.annotation.Nonnull
  public String getsEzsigndocumentlogFirstname() {
    return sEzsigndocumentlogFirstname;
  }

  public void setsEzsigndocumentlogFirstname(@javax.annotation.Nonnull String sEzsigndocumentlogFirstname) {
    this.sEzsigndocumentlogFirstname = sEzsigndocumentlogFirstname;
  }


  public EzsigndocumentlogResponse sEzsigndocumentlogIP(@javax.annotation.Nonnull String sEzsigndocumentlogIP) {
    this.sEzsigndocumentlogIP = sEzsigndocumentlogIP;
    return this;
  }

  /**
   * Represent an IP address.
   * @return sEzsigndocumentlogIP
   */
  @javax.annotation.Nonnull
  public String getsEzsigndocumentlogIP() {
    return sEzsigndocumentlogIP;
  }

  public void setsEzsigndocumentlogIP(@javax.annotation.Nonnull String sEzsigndocumentlogIP) {
    this.sEzsigndocumentlogIP = sEzsigndocumentlogIP;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsigndocumentlogResponse ezsigndocumentlogResponse = (EzsigndocumentlogResponse) o;
    return Objects.equals(this.fkiUserID, ezsigndocumentlogResponse.fkiUserID) &&
        Objects.equals(this.fkiEzsignsignerID, ezsigndocumentlogResponse.fkiEzsignsignerID) &&
        Objects.equals(this.dtEzsigndocumentlogDatetime, ezsigndocumentlogResponse.dtEzsigndocumentlogDatetime) &&
        Objects.equals(this.eEzsigndocumentlogType, ezsigndocumentlogResponse.eEzsigndocumentlogType) &&
        Objects.equals(this.sEzsigndocumentlogDetail, ezsigndocumentlogResponse.sEzsigndocumentlogDetail) &&
        Objects.equals(this.sEzsigndocumentlogLastname, ezsigndocumentlogResponse.sEzsigndocumentlogLastname) &&
        Objects.equals(this.sEzsigndocumentlogFirstname, ezsigndocumentlogResponse.sEzsigndocumentlogFirstname) &&
        Objects.equals(this.sEzsigndocumentlogIP, ezsigndocumentlogResponse.sEzsigndocumentlogIP);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fkiUserID, fkiEzsignsignerID, dtEzsigndocumentlogDatetime, eEzsigndocumentlogType, sEzsigndocumentlogDetail, sEzsigndocumentlogLastname, sEzsigndocumentlogFirstname, sEzsigndocumentlogIP);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsigndocumentlogResponse {\n");
    sb.append("    fkiUserID: ").append(toIndentedString(fkiUserID)).append("\n");
    sb.append("    fkiEzsignsignerID: ").append(toIndentedString(fkiEzsignsignerID)).append("\n");
    sb.append("    dtEzsigndocumentlogDatetime: ").append(toIndentedString(dtEzsigndocumentlogDatetime)).append("\n");
    sb.append("    eEzsigndocumentlogType: ").append(toIndentedString(eEzsigndocumentlogType)).append("\n");
    sb.append("    sEzsigndocumentlogDetail: ").append(toIndentedString(sEzsigndocumentlogDetail)).append("\n");
    sb.append("    sEzsigndocumentlogLastname: ").append(toIndentedString(sEzsigndocumentlogLastname)).append("\n");
    sb.append("    sEzsigndocumentlogFirstname: ").append(toIndentedString(sEzsigndocumentlogFirstname)).append("\n");
    sb.append("    sEzsigndocumentlogIP: ").append(toIndentedString(sEzsigndocumentlogIP)).append("\n");
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
    openapiFields.add("fkiUserID");
    openapiFields.add("fkiEzsignsignerID");
    openapiFields.add("dtEzsigndocumentlogDatetime");
    openapiFields.add("eEzsigndocumentlogType");
    openapiFields.add("sEzsigndocumentlogDetail");
    openapiFields.add("sEzsigndocumentlogLastname");
    openapiFields.add("sEzsigndocumentlogFirstname");
    openapiFields.add("sEzsigndocumentlogIP");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("dtEzsigndocumentlogDatetime");
    openapiRequiredFields.add("eEzsigndocumentlogType");
    openapiRequiredFields.add("sEzsigndocumentlogDetail");
    openapiRequiredFields.add("sEzsigndocumentlogLastname");
    openapiRequiredFields.add("sEzsigndocumentlogFirstname");
    openapiRequiredFields.add("sEzsigndocumentlogIP");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EzsigndocumentlogResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EzsigndocumentlogResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EzsigndocumentlogResponse is not found in the empty JSON string", EzsigndocumentlogResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EzsigndocumentlogResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EzsigndocumentlogResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EzsigndocumentlogResponse.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("dtEzsigndocumentlogDatetime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dtEzsigndocumentlogDatetime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dtEzsigndocumentlogDatetime").toString()));
      }
      // validate the required field `eEzsigndocumentlogType`
      FieldEEzsigndocumentlogType.validateJsonElement(jsonObj.get("eEzsigndocumentlogType"));
      if (!jsonObj.get("sEzsigndocumentlogDetail").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sEzsigndocumentlogDetail` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sEzsigndocumentlogDetail").toString()));
      }
      if (!jsonObj.get("sEzsigndocumentlogLastname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sEzsigndocumentlogLastname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sEzsigndocumentlogLastname").toString()));
      }
      if (!jsonObj.get("sEzsigndocumentlogFirstname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sEzsigndocumentlogFirstname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sEzsigndocumentlogFirstname").toString()));
      }
      if (!jsonObj.get("sEzsigndocumentlogIP").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sEzsigndocumentlogIP` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sEzsigndocumentlogIP").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EzsigndocumentlogResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EzsigndocumentlogResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EzsigndocumentlogResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EzsigndocumentlogResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<EzsigndocumentlogResponse>() {
           @Override
           public void write(JsonWriter out, EzsigndocumentlogResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EzsigndocumentlogResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EzsigndocumentlogResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EzsigndocumentlogResponse
   * @throws IOException if the JSON string is invalid with respect to EzsigndocumentlogResponse
   */
  public static EzsigndocumentlogResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EzsigndocumentlogResponse.class);
  }

  /**
   * Convert an instance of EzsigndocumentlogResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

