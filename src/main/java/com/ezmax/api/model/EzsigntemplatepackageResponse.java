/*
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.8
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ezmax.api.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import eZmaxAPI.JSON;

/**
 * A Ezsigntemplatepackage Object
 */
@ApiModel(description = "A Ezsigntemplatepackage Object")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-20T16:59:39.826205Z[Etc/UTC]")
public class EzsigntemplatepackageResponse {
  public static final String SERIALIZED_NAME_PKI_EZSIGNTEMPLATEPACKAGE_I_D = "pkiEzsigntemplatepackageID";
  @SerializedName(SERIALIZED_NAME_PKI_EZSIGNTEMPLATEPACKAGE_I_D)
  private Integer pkiEzsigntemplatepackageID;

  public static final String SERIALIZED_NAME_FKI_EZSIGNFOLDERTYPE_I_D = "fkiEzsignfoldertypeID";
  @SerializedName(SERIALIZED_NAME_FKI_EZSIGNFOLDERTYPE_I_D)
  private Integer fkiEzsignfoldertypeID;

  public static final String SERIALIZED_NAME_FKI_LANGUAGE_I_D = "fkiLanguageID";
  @SerializedName(SERIALIZED_NAME_FKI_LANGUAGE_I_D)
  private Integer fkiLanguageID;

  public static final String SERIALIZED_NAME_S_LANGUAGE_NAME_X = "sLanguageNameX";
  @SerializedName(SERIALIZED_NAME_S_LANGUAGE_NAME_X)
  private String sLanguageNameX;

  public static final String SERIALIZED_NAME_S_EZSIGNTEMPLATEPACKAGE_DESCRIPTION = "sEzsigntemplatepackageDescription";
  @SerializedName(SERIALIZED_NAME_S_EZSIGNTEMPLATEPACKAGE_DESCRIPTION)
  private String sEzsigntemplatepackageDescription;

  public static final String SERIALIZED_NAME_B_EZSIGNTEMPLATEPACKAGE_ADMINONLY = "bEzsigntemplatepackageAdminonly";
  @SerializedName(SERIALIZED_NAME_B_EZSIGNTEMPLATEPACKAGE_ADMINONLY)
  private Boolean bEzsigntemplatepackageAdminonly;

  public static final String SERIALIZED_NAME_B_EZSIGNTEMPLATEPACKAGE_NEEDVALIDATION = "bEzsigntemplatepackageNeedvalidation";
  @SerializedName(SERIALIZED_NAME_B_EZSIGNTEMPLATEPACKAGE_NEEDVALIDATION)
  private Boolean bEzsigntemplatepackageNeedvalidation;

  public static final String SERIALIZED_NAME_B_EZSIGNTEMPLATEPACKAGE_ISACTIVE = "bEzsigntemplatepackageIsactive";
  @SerializedName(SERIALIZED_NAME_B_EZSIGNTEMPLATEPACKAGE_ISACTIVE)
  private Boolean bEzsigntemplatepackageIsactive;

  public static final String SERIALIZED_NAME_S_EZSIGNFOLDERTYPE_NAME_X = "sEzsignfoldertypeNameX";
  @SerializedName(SERIALIZED_NAME_S_EZSIGNFOLDERTYPE_NAME_X)
  private String sEzsignfoldertypeNameX;

  public EzsigntemplatepackageResponse() { 
  }

  public EzsigntemplatepackageResponse pkiEzsigntemplatepackageID(Integer pkiEzsigntemplatepackageID) {
    
    this.pkiEzsigntemplatepackageID = pkiEzsigntemplatepackageID;
    return this;
  }

   /**
   * The unique ID of the Ezsigntemplatepackage
   * minimum: 0
   * @return pkiEzsigntemplatepackageID
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "99", required = true, value = "The unique ID of the Ezsigntemplatepackage")

  public Integer getPkiEzsigntemplatepackageID() {
    return pkiEzsigntemplatepackageID;
  }


  public void setPkiEzsigntemplatepackageID(Integer pkiEzsigntemplatepackageID) {
    this.pkiEzsigntemplatepackageID = pkiEzsigntemplatepackageID;
  }


  public EzsigntemplatepackageResponse fkiEzsignfoldertypeID(Integer fkiEzsignfoldertypeID) {
    
    this.fkiEzsignfoldertypeID = fkiEzsignfoldertypeID;
    return this;
  }

   /**
   * The unique ID of the Ezsignfoldertype.
   * minimum: 0
   * @return fkiEzsignfoldertypeID
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "5", required = true, value = "The unique ID of the Ezsignfoldertype.")

  public Integer getFkiEzsignfoldertypeID() {
    return fkiEzsignfoldertypeID;
  }


  public void setFkiEzsignfoldertypeID(Integer fkiEzsignfoldertypeID) {
    this.fkiEzsignfoldertypeID = fkiEzsignfoldertypeID;
  }


  public EzsigntemplatepackageResponse fkiLanguageID(Integer fkiLanguageID) {
    
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
  @ApiModelProperty(example = "2", required = true, value = "The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English|")

  public Integer getFkiLanguageID() {
    return fkiLanguageID;
  }


  public void setFkiLanguageID(Integer fkiLanguageID) {
    this.fkiLanguageID = fkiLanguageID;
  }


  public EzsigntemplatepackageResponse sLanguageNameX(String sLanguageNameX) {
    
    this.sLanguageNameX = sLanguageNameX;
    return this;
  }

   /**
   * The Name of the Language in the language of the requester
   * @return sLanguageNameX
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "English", required = true, value = "The Name of the Language in the language of the requester")

  public String getsLanguageNameX() {
    return sLanguageNameX;
  }


  public void setsLanguageNameX(String sLanguageNameX) {
    this.sLanguageNameX = sLanguageNameX;
  }


  public EzsigntemplatepackageResponse sEzsigntemplatepackageDescription(String sEzsigntemplatepackageDescription) {
    
    this.sEzsigntemplatepackageDescription = sEzsigntemplatepackageDescription;
    return this;
  }

   /**
   * The description of the Ezsigntemplatepackage
   * @return sEzsigntemplatepackageDescription
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Package for new clients", required = true, value = "The description of the Ezsigntemplatepackage")

  public String getsEzsigntemplatepackageDescription() {
    return sEzsigntemplatepackageDescription;
  }


  public void setsEzsigntemplatepackageDescription(String sEzsigntemplatepackageDescription) {
    this.sEzsigntemplatepackageDescription = sEzsigntemplatepackageDescription;
  }


  public EzsigntemplatepackageResponse bEzsigntemplatepackageAdminonly(Boolean bEzsigntemplatepackageAdminonly) {
    
    this.bEzsigntemplatepackageAdminonly = bEzsigntemplatepackageAdminonly;
    return this;
  }

   /**
   * Whether the Ezsigntemplatepackage can be accessed by admin users only (eUserType&#x3D;Normal)
   * @return bEzsigntemplatepackageAdminonly
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Whether the Ezsigntemplatepackage can be accessed by admin users only (eUserType=Normal)")

  public Boolean getbEzsigntemplatepackageAdminonly() {
    return bEzsigntemplatepackageAdminonly;
  }


  public void setbEzsigntemplatepackageAdminonly(Boolean bEzsigntemplatepackageAdminonly) {
    this.bEzsigntemplatepackageAdminonly = bEzsigntemplatepackageAdminonly;
  }


  public EzsigntemplatepackageResponse bEzsigntemplatepackageNeedvalidation(Boolean bEzsigntemplatepackageNeedvalidation) {
    
    this.bEzsigntemplatepackageNeedvalidation = bEzsigntemplatepackageNeedvalidation;
    return this;
  }

   /**
   * Whether the Ezsignbulksend was automatically modified and needs a manual validation
   * @return bEzsigntemplatepackageNeedvalidation
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Whether the Ezsignbulksend was automatically modified and needs a manual validation")

  public Boolean getbEzsigntemplatepackageNeedvalidation() {
    return bEzsigntemplatepackageNeedvalidation;
  }


  public void setbEzsigntemplatepackageNeedvalidation(Boolean bEzsigntemplatepackageNeedvalidation) {
    this.bEzsigntemplatepackageNeedvalidation = bEzsigntemplatepackageNeedvalidation;
  }


  public EzsigntemplatepackageResponse bEzsigntemplatepackageIsactive(Boolean bEzsigntemplatepackageIsactive) {
    
    this.bEzsigntemplatepackageIsactive = bEzsigntemplatepackageIsactive;
    return this;
  }

   /**
   * Whether the Ezsigntemplatepackage is active or not
   * @return bEzsigntemplatepackageIsactive
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Whether the Ezsigntemplatepackage is active or not")

  public Boolean getbEzsigntemplatepackageIsactive() {
    return bEzsigntemplatepackageIsactive;
  }


  public void setbEzsigntemplatepackageIsactive(Boolean bEzsigntemplatepackageIsactive) {
    this.bEzsigntemplatepackageIsactive = bEzsigntemplatepackageIsactive;
  }


  public EzsigntemplatepackageResponse sEzsignfoldertypeNameX(String sEzsignfoldertypeNameX) {
    
    this.sEzsignfoldertypeNameX = sEzsignfoldertypeNameX;
    return this;
  }

   /**
   * The name of the Ezsignfoldertype in the language of the requester
   * @return sEzsignfoldertypeNameX
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Default", required = true, value = "The name of the Ezsignfoldertype in the language of the requester")

  public String getsEzsignfoldertypeNameX() {
    return sEzsignfoldertypeNameX;
  }


  public void setsEzsignfoldertypeNameX(String sEzsignfoldertypeNameX) {
    this.sEzsignfoldertypeNameX = sEzsignfoldertypeNameX;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsigntemplatepackageResponse ezsigntemplatepackageResponse = (EzsigntemplatepackageResponse) o;
    return Objects.equals(this.pkiEzsigntemplatepackageID, ezsigntemplatepackageResponse.pkiEzsigntemplatepackageID) &&
        Objects.equals(this.fkiEzsignfoldertypeID, ezsigntemplatepackageResponse.fkiEzsignfoldertypeID) &&
        Objects.equals(this.fkiLanguageID, ezsigntemplatepackageResponse.fkiLanguageID) &&
        Objects.equals(this.sLanguageNameX, ezsigntemplatepackageResponse.sLanguageNameX) &&
        Objects.equals(this.sEzsigntemplatepackageDescription, ezsigntemplatepackageResponse.sEzsigntemplatepackageDescription) &&
        Objects.equals(this.bEzsigntemplatepackageAdminonly, ezsigntemplatepackageResponse.bEzsigntemplatepackageAdminonly) &&
        Objects.equals(this.bEzsigntemplatepackageNeedvalidation, ezsigntemplatepackageResponse.bEzsigntemplatepackageNeedvalidation) &&
        Objects.equals(this.bEzsigntemplatepackageIsactive, ezsigntemplatepackageResponse.bEzsigntemplatepackageIsactive) &&
        Objects.equals(this.sEzsignfoldertypeNameX, ezsigntemplatepackageResponse.sEzsignfoldertypeNameX);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pkiEzsigntemplatepackageID, fkiEzsignfoldertypeID, fkiLanguageID, sLanguageNameX, sEzsigntemplatepackageDescription, bEzsigntemplatepackageAdminonly, bEzsigntemplatepackageNeedvalidation, bEzsigntemplatepackageIsactive, sEzsignfoldertypeNameX);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsigntemplatepackageResponse {\n");
    sb.append("    pkiEzsigntemplatepackageID: ").append(toIndentedString(pkiEzsigntemplatepackageID)).append("\n");
    sb.append("    fkiEzsignfoldertypeID: ").append(toIndentedString(fkiEzsignfoldertypeID)).append("\n");
    sb.append("    fkiLanguageID: ").append(toIndentedString(fkiLanguageID)).append("\n");
    sb.append("    sLanguageNameX: ").append(toIndentedString(sLanguageNameX)).append("\n");
    sb.append("    sEzsigntemplatepackageDescription: ").append(toIndentedString(sEzsigntemplatepackageDescription)).append("\n");
    sb.append("    bEzsigntemplatepackageAdminonly: ").append(toIndentedString(bEzsigntemplatepackageAdminonly)).append("\n");
    sb.append("    bEzsigntemplatepackageNeedvalidation: ").append(toIndentedString(bEzsigntemplatepackageNeedvalidation)).append("\n");
    sb.append("    bEzsigntemplatepackageIsactive: ").append(toIndentedString(bEzsigntemplatepackageIsactive)).append("\n");
    sb.append("    sEzsignfoldertypeNameX: ").append(toIndentedString(sEzsignfoldertypeNameX)).append("\n");
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
    openapiFields.add("pkiEzsigntemplatepackageID");
    openapiFields.add("fkiEzsignfoldertypeID");
    openapiFields.add("fkiLanguageID");
    openapiFields.add("sLanguageNameX");
    openapiFields.add("sEzsigntemplatepackageDescription");
    openapiFields.add("bEzsigntemplatepackageAdminonly");
    openapiFields.add("bEzsigntemplatepackageNeedvalidation");
    openapiFields.add("bEzsigntemplatepackageIsactive");
    openapiFields.add("sEzsignfoldertypeNameX");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("pkiEzsigntemplatepackageID");
    openapiRequiredFields.add("fkiEzsignfoldertypeID");
    openapiRequiredFields.add("fkiLanguageID");
    openapiRequiredFields.add("sLanguageNameX");
    openapiRequiredFields.add("sEzsigntemplatepackageDescription");
    openapiRequiredFields.add("bEzsigntemplatepackageAdminonly");
    openapiRequiredFields.add("bEzsigntemplatepackageNeedvalidation");
    openapiRequiredFields.add("bEzsigntemplatepackageIsactive");
    openapiRequiredFields.add("sEzsignfoldertypeNameX");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EzsigntemplatepackageResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (EzsigntemplatepackageResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in EzsigntemplatepackageResponse is not found in the empty JSON string", EzsigntemplatepackageResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!EzsigntemplatepackageResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EzsigntemplatepackageResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EzsigntemplatepackageResponse.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("sLanguageNameX") != null && !jsonObj.get("sLanguageNameX").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sLanguageNameX` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sLanguageNameX").toString()));
      }
      if (jsonObj.get("sEzsigntemplatepackageDescription") != null && !jsonObj.get("sEzsigntemplatepackageDescription").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sEzsigntemplatepackageDescription` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sEzsigntemplatepackageDescription").toString()));
      }
      if (jsonObj.get("sEzsignfoldertypeNameX") != null && !jsonObj.get("sEzsignfoldertypeNameX").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sEzsignfoldertypeNameX` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sEzsignfoldertypeNameX").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EzsigntemplatepackageResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EzsigntemplatepackageResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EzsigntemplatepackageResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EzsigntemplatepackageResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<EzsigntemplatepackageResponse>() {
           @Override
           public void write(JsonWriter out, EzsigntemplatepackageResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EzsigntemplatepackageResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EzsigntemplatepackageResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EzsigntemplatepackageResponse
  * @throws IOException if the JSON string is invalid with respect to EzsigntemplatepackageResponse
  */
  public static EzsigntemplatepackageResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EzsigntemplatepackageResponse.class);
  }

 /**
  * Convert an instance of EzsigntemplatepackageResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
