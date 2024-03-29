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
import com.ezmax.api.model.CommonAudit;
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
 * A Ezsigntemplate Object
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-22T15:33:11.356591451Z[Etc/UTC]")
public class EzsigntemplateResponse {
  public static final String SERIALIZED_NAME_PKI_EZSIGNTEMPLATE_I_D = "pkiEzsigntemplateID";
  @SerializedName(SERIALIZED_NAME_PKI_EZSIGNTEMPLATE_I_D)
  private Integer pkiEzsigntemplateID;

  public static final String SERIALIZED_NAME_FKI_EZSIGNTEMPLATEDOCUMENT_I_D = "fkiEzsigntemplatedocumentID";
  @SerializedName(SERIALIZED_NAME_FKI_EZSIGNTEMPLATEDOCUMENT_I_D)
  private Integer fkiEzsigntemplatedocumentID;

  public static final String SERIALIZED_NAME_FKI_EZSIGNFOLDERTYPE_I_D = "fkiEzsignfoldertypeID";
  @SerializedName(SERIALIZED_NAME_FKI_EZSIGNFOLDERTYPE_I_D)
  private Integer fkiEzsignfoldertypeID;

  public static final String SERIALIZED_NAME_FKI_LANGUAGE_I_D = "fkiLanguageID";
  @SerializedName(SERIALIZED_NAME_FKI_LANGUAGE_I_D)
  private Integer fkiLanguageID;

  public static final String SERIALIZED_NAME_S_LANGUAGE_NAME_X = "sLanguageNameX";
  @SerializedName(SERIALIZED_NAME_S_LANGUAGE_NAME_X)
  private String sLanguageNameX;

  public static final String SERIALIZED_NAME_S_EZSIGNTEMPLATE_DESCRIPTION = "sEzsigntemplateDescription";
  @SerializedName(SERIALIZED_NAME_S_EZSIGNTEMPLATE_DESCRIPTION)
  private String sEzsigntemplateDescription;

  public static final String SERIALIZED_NAME_B_EZSIGNTEMPLATE_ADMINONLY = "bEzsigntemplateAdminonly";
  @SerializedName(SERIALIZED_NAME_B_EZSIGNTEMPLATE_ADMINONLY)
  private Boolean bEzsigntemplateAdminonly;

  public static final String SERIALIZED_NAME_S_EZSIGNFOLDERTYPE_NAME_X = "sEzsignfoldertypeNameX";
  @SerializedName(SERIALIZED_NAME_S_EZSIGNFOLDERTYPE_NAME_X)
  private String sEzsignfoldertypeNameX;

  public static final String SERIALIZED_NAME_OBJ_AUDIT = "objAudit";
  @SerializedName(SERIALIZED_NAME_OBJ_AUDIT)
  private CommonAudit objAudit;

  public EzsigntemplateResponse() {
  }

  public EzsigntemplateResponse pkiEzsigntemplateID(Integer pkiEzsigntemplateID) {
    
    this.pkiEzsigntemplateID = pkiEzsigntemplateID;
    return this;
  }

   /**
   * The unique ID of the Ezsigntemplate
   * minimum: 0
   * @return pkiEzsigntemplateID
  **/
  @javax.annotation.Nonnull
  public Integer getPkiEzsigntemplateID() {
    return pkiEzsigntemplateID;
  }


  public void setPkiEzsigntemplateID(Integer pkiEzsigntemplateID) {
    this.pkiEzsigntemplateID = pkiEzsigntemplateID;
  }


  public EzsigntemplateResponse fkiEzsigntemplatedocumentID(Integer fkiEzsigntemplatedocumentID) {
    
    this.fkiEzsigntemplatedocumentID = fkiEzsigntemplatedocumentID;
    return this;
  }

   /**
   * The unique ID of the Ezsigntemplatedocument
   * minimum: 0
   * @return fkiEzsigntemplatedocumentID
  **/
  @javax.annotation.Nullable
  public Integer getFkiEzsigntemplatedocumentID() {
    return fkiEzsigntemplatedocumentID;
  }


  public void setFkiEzsigntemplatedocumentID(Integer fkiEzsigntemplatedocumentID) {
    this.fkiEzsigntemplatedocumentID = fkiEzsigntemplatedocumentID;
  }


  public EzsigntemplateResponse fkiEzsignfoldertypeID(Integer fkiEzsignfoldertypeID) {
    
    this.fkiEzsignfoldertypeID = fkiEzsignfoldertypeID;
    return this;
  }

   /**
   * The unique ID of the Ezsignfoldertype.
   * minimum: 0
   * @return fkiEzsignfoldertypeID
  **/
  @javax.annotation.Nonnull
  public Integer getFkiEzsignfoldertypeID() {
    return fkiEzsignfoldertypeID;
  }


  public void setFkiEzsignfoldertypeID(Integer fkiEzsignfoldertypeID) {
    this.fkiEzsignfoldertypeID = fkiEzsignfoldertypeID;
  }


  public EzsigntemplateResponse fkiLanguageID(Integer fkiLanguageID) {
    
    this.fkiLanguageID = fkiLanguageID;
    return this;
  }

   /**
   * The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English|
   * minimum: 1
   * maximum: 2
   * @return fkiLanguageID
  **/
  @javax.annotation.Nonnull
  public Integer getFkiLanguageID() {
    return fkiLanguageID;
  }


  public void setFkiLanguageID(Integer fkiLanguageID) {
    this.fkiLanguageID = fkiLanguageID;
  }


  public EzsigntemplateResponse sLanguageNameX(String sLanguageNameX) {
    
    this.sLanguageNameX = sLanguageNameX;
    return this;
  }

   /**
   * The Name of the Language in the language of the requester
   * @return sLanguageNameX
  **/
  @javax.annotation.Nonnull
  public String getsLanguageNameX() {
    return sLanguageNameX;
  }


  public void setsLanguageNameX(String sLanguageNameX) {
    this.sLanguageNameX = sLanguageNameX;
  }


  public EzsigntemplateResponse sEzsigntemplateDescription(String sEzsigntemplateDescription) {
    
    this.sEzsigntemplateDescription = sEzsigntemplateDescription;
    return this;
  }

   /**
   * The description of the Ezsigntemplate
   * @return sEzsigntemplateDescription
  **/
  @javax.annotation.Nonnull
  public String getsEzsigntemplateDescription() {
    return sEzsigntemplateDescription;
  }


  public void setsEzsigntemplateDescription(String sEzsigntemplateDescription) {
    this.sEzsigntemplateDescription = sEzsigntemplateDescription;
  }


  public EzsigntemplateResponse bEzsigntemplateAdminonly(Boolean bEzsigntemplateAdminonly) {
    
    this.bEzsigntemplateAdminonly = bEzsigntemplateAdminonly;
    return this;
  }

   /**
   * Whether the Ezsigntemplate can be accessed by admin users only (eUserType&#x3D;Normal)
   * @return bEzsigntemplateAdminonly
  **/
  @javax.annotation.Nonnull
  public Boolean getbEzsigntemplateAdminonly() {
    return bEzsigntemplateAdminonly;
  }


  public void setbEzsigntemplateAdminonly(Boolean bEzsigntemplateAdminonly) {
    this.bEzsigntemplateAdminonly = bEzsigntemplateAdminonly;
  }


  public EzsigntemplateResponse sEzsignfoldertypeNameX(String sEzsignfoldertypeNameX) {
    
    this.sEzsignfoldertypeNameX = sEzsignfoldertypeNameX;
    return this;
  }

   /**
   * The name of the Ezsignfoldertype in the language of the requester
   * @return sEzsignfoldertypeNameX
  **/
  @javax.annotation.Nonnull
  public String getsEzsignfoldertypeNameX() {
    return sEzsignfoldertypeNameX;
  }


  public void setsEzsignfoldertypeNameX(String sEzsignfoldertypeNameX) {
    this.sEzsignfoldertypeNameX = sEzsignfoldertypeNameX;
  }


  public EzsigntemplateResponse objAudit(CommonAudit objAudit) {
    
    this.objAudit = objAudit;
    return this;
  }

   /**
   * Get objAudit
   * @return objAudit
  **/
  @javax.annotation.Nonnull
  public CommonAudit getObjAudit() {
    return objAudit;
  }


  public void setObjAudit(CommonAudit objAudit) {
    this.objAudit = objAudit;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsigntemplateResponse ezsigntemplateResponse = (EzsigntemplateResponse) o;
    return Objects.equals(this.pkiEzsigntemplateID, ezsigntemplateResponse.pkiEzsigntemplateID) &&
        Objects.equals(this.fkiEzsigntemplatedocumentID, ezsigntemplateResponse.fkiEzsigntemplatedocumentID) &&
        Objects.equals(this.fkiEzsignfoldertypeID, ezsigntemplateResponse.fkiEzsignfoldertypeID) &&
        Objects.equals(this.fkiLanguageID, ezsigntemplateResponse.fkiLanguageID) &&
        Objects.equals(this.sLanguageNameX, ezsigntemplateResponse.sLanguageNameX) &&
        Objects.equals(this.sEzsigntemplateDescription, ezsigntemplateResponse.sEzsigntemplateDescription) &&
        Objects.equals(this.bEzsigntemplateAdminonly, ezsigntemplateResponse.bEzsigntemplateAdminonly) &&
        Objects.equals(this.sEzsignfoldertypeNameX, ezsigntemplateResponse.sEzsignfoldertypeNameX) &&
        Objects.equals(this.objAudit, ezsigntemplateResponse.objAudit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pkiEzsigntemplateID, fkiEzsigntemplatedocumentID, fkiEzsignfoldertypeID, fkiLanguageID, sLanguageNameX, sEzsigntemplateDescription, bEzsigntemplateAdminonly, sEzsignfoldertypeNameX, objAudit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsigntemplateResponse {\n");
    sb.append("    pkiEzsigntemplateID: ").append(toIndentedString(pkiEzsigntemplateID)).append("\n");
    sb.append("    fkiEzsigntemplatedocumentID: ").append(toIndentedString(fkiEzsigntemplatedocumentID)).append("\n");
    sb.append("    fkiEzsignfoldertypeID: ").append(toIndentedString(fkiEzsignfoldertypeID)).append("\n");
    sb.append("    fkiLanguageID: ").append(toIndentedString(fkiLanguageID)).append("\n");
    sb.append("    sLanguageNameX: ").append(toIndentedString(sLanguageNameX)).append("\n");
    sb.append("    sEzsigntemplateDescription: ").append(toIndentedString(sEzsigntemplateDescription)).append("\n");
    sb.append("    bEzsigntemplateAdminonly: ").append(toIndentedString(bEzsigntemplateAdminonly)).append("\n");
    sb.append("    sEzsignfoldertypeNameX: ").append(toIndentedString(sEzsignfoldertypeNameX)).append("\n");
    sb.append("    objAudit: ").append(toIndentedString(objAudit)).append("\n");
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
    openapiFields.add("pkiEzsigntemplateID");
    openapiFields.add("fkiEzsigntemplatedocumentID");
    openapiFields.add("fkiEzsignfoldertypeID");
    openapiFields.add("fkiLanguageID");
    openapiFields.add("sLanguageNameX");
    openapiFields.add("sEzsigntemplateDescription");
    openapiFields.add("bEzsigntemplateAdminonly");
    openapiFields.add("sEzsignfoldertypeNameX");
    openapiFields.add("objAudit");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("pkiEzsigntemplateID");
    openapiRequiredFields.add("fkiEzsignfoldertypeID");
    openapiRequiredFields.add("fkiLanguageID");
    openapiRequiredFields.add("sLanguageNameX");
    openapiRequiredFields.add("sEzsigntemplateDescription");
    openapiRequiredFields.add("bEzsigntemplateAdminonly");
    openapiRequiredFields.add("sEzsignfoldertypeNameX");
    openapiRequiredFields.add("objAudit");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EzsigntemplateResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!EzsigntemplateResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EzsigntemplateResponse is not found in the empty JSON string", EzsigntemplateResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!EzsigntemplateResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EzsigntemplateResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EzsigntemplateResponse.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("sLanguageNameX").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sLanguageNameX` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sLanguageNameX").toString()));
      }
      if (!jsonObj.get("sEzsigntemplateDescription").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sEzsigntemplateDescription` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sEzsigntemplateDescription").toString()));
      }
      if (!jsonObj.get("sEzsignfoldertypeNameX").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sEzsignfoldertypeNameX` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sEzsignfoldertypeNameX").toString()));
      }
      // validate the required field `objAudit`
      CommonAudit.validateJsonObject(jsonObj.getAsJsonObject("objAudit"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EzsigntemplateResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EzsigntemplateResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EzsigntemplateResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EzsigntemplateResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<EzsigntemplateResponse>() {
           @Override
           public void write(JsonWriter out, EzsigntemplateResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EzsigntemplateResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EzsigntemplateResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EzsigntemplateResponse
  * @throws IOException if the JSON string is invalid with respect to EzsigntemplateResponse
  */
  public static EzsigntemplateResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EzsigntemplateResponse.class);
  }

 /**
  * Convert an instance of EzsigntemplateResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

