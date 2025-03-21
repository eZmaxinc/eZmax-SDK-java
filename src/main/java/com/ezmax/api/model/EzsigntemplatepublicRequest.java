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
import com.ezmax.api.model.FieldEEzsigntemplatepublicLimittype;
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
 * A Ezsigntemplatepublic Object
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-07T19:20:13.445471985Z[Etc/UTC]", comments = "Generator version: 7.12.0")
public class EzsigntemplatepublicRequest {
  public static final String SERIALIZED_NAME_PKI_EZSIGNTEMPLATEPUBLIC_I_D = "pkiEzsigntemplatepublicID";
  @SerializedName(SERIALIZED_NAME_PKI_EZSIGNTEMPLATEPUBLIC_I_D)
  @javax.annotation.Nullable
  private Integer pkiEzsigntemplatepublicID;

  public static final String SERIALIZED_NAME_FKI_EZSIGNFOLDERTYPE_I_D = "fkiEzsignfoldertypeID";
  @SerializedName(SERIALIZED_NAME_FKI_EZSIGNFOLDERTYPE_I_D)
  @javax.annotation.Nonnull
  private Integer fkiEzsignfoldertypeID;

  public static final String SERIALIZED_NAME_FKI_USERLOGINTYPE_I_D = "fkiUserlogintypeID";
  @SerializedName(SERIALIZED_NAME_FKI_USERLOGINTYPE_I_D)
  @javax.annotation.Nonnull
  private Integer fkiUserlogintypeID;

  public static final String SERIALIZED_NAME_FKI_EZSIGNTEMPLATE_I_D = "fkiEzsigntemplateID";
  @SerializedName(SERIALIZED_NAME_FKI_EZSIGNTEMPLATE_I_D)
  @javax.annotation.Nullable
  private Integer fkiEzsigntemplateID;

  public static final String SERIALIZED_NAME_FKI_EZSIGNTEMPLATEPACKAGE_I_D = "fkiEzsigntemplatepackageID";
  @SerializedName(SERIALIZED_NAME_FKI_EZSIGNTEMPLATEPACKAGE_I_D)
  @javax.annotation.Nullable
  private Integer fkiEzsigntemplatepackageID;

  public static final String SERIALIZED_NAME_S_EZSIGNTEMPLATEPUBLIC_DESCRIPTION = "sEzsigntemplatepublicDescription";
  @SerializedName(SERIALIZED_NAME_S_EZSIGNTEMPLATEPUBLIC_DESCRIPTION)
  @javax.annotation.Nonnull
  private String sEzsigntemplatepublicDescription;

  public static final String SERIALIZED_NAME_B_EZSIGNTEMPLATEPUBLIC_ISACTIVE = "bEzsigntemplatepublicIsactive";
  @SerializedName(SERIALIZED_NAME_B_EZSIGNTEMPLATEPUBLIC_ISACTIVE)
  @javax.annotation.Nonnull
  private Boolean bEzsigntemplatepublicIsactive;

  public static final String SERIALIZED_NAME_T_EZSIGNTEMPLATEPUBLIC_NOTE = "tEzsigntemplatepublicNote";
  @SerializedName(SERIALIZED_NAME_T_EZSIGNTEMPLATEPUBLIC_NOTE)
  @javax.annotation.Nonnull
  private String tEzsigntemplatepublicNote;

  public static final String SERIALIZED_NAME_E_EZSIGNTEMPLATEPUBLIC_LIMITTYPE = "eEzsigntemplatepublicLimittype";
  @SerializedName(SERIALIZED_NAME_E_EZSIGNTEMPLATEPUBLIC_LIMITTYPE)
  @javax.annotation.Nonnull
  private FieldEEzsigntemplatepublicLimittype eEzsigntemplatepublicLimittype;

  public static final String SERIALIZED_NAME_I_EZSIGNTEMPLATEPUBLIC_LIMIT = "iEzsigntemplatepublicLimit";
  @SerializedName(SERIALIZED_NAME_I_EZSIGNTEMPLATEPUBLIC_LIMIT)
  @javax.annotation.Nonnull
  private Integer iEzsigntemplatepublicLimit;

  public EzsigntemplatepublicRequest() {
  }

  public EzsigntemplatepublicRequest pkiEzsigntemplatepublicID(@javax.annotation.Nullable Integer pkiEzsigntemplatepublicID) {
    this.pkiEzsigntemplatepublicID = pkiEzsigntemplatepublicID;
    return this;
  }

  /**
   * The unique ID of the Ezsigntemplatepublic
   * minimum: 0
   * maximum: 65535
   * @return pkiEzsigntemplatepublicID
   */
  @javax.annotation.Nullable
  public Integer getPkiEzsigntemplatepublicID() {
    return pkiEzsigntemplatepublicID;
  }

  public void setPkiEzsigntemplatepublicID(@javax.annotation.Nullable Integer pkiEzsigntemplatepublicID) {
    this.pkiEzsigntemplatepublicID = pkiEzsigntemplatepublicID;
  }


  public EzsigntemplatepublicRequest fkiEzsignfoldertypeID(@javax.annotation.Nonnull Integer fkiEzsignfoldertypeID) {
    this.fkiEzsignfoldertypeID = fkiEzsignfoldertypeID;
    return this;
  }

  /**
   * The unique ID of the Ezsignfoldertype.
   * minimum: 0
   * maximum: 65535
   * @return fkiEzsignfoldertypeID
   */
  @javax.annotation.Nonnull
  public Integer getFkiEzsignfoldertypeID() {
    return fkiEzsignfoldertypeID;
  }

  public void setFkiEzsignfoldertypeID(@javax.annotation.Nonnull Integer fkiEzsignfoldertypeID) {
    this.fkiEzsignfoldertypeID = fkiEzsignfoldertypeID;
  }


  public EzsigntemplatepublicRequest fkiUserlogintypeID(@javax.annotation.Nonnull Integer fkiUserlogintypeID) {
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


  public EzsigntemplatepublicRequest fkiEzsigntemplateID(@javax.annotation.Nullable Integer fkiEzsigntemplateID) {
    this.fkiEzsigntemplateID = fkiEzsigntemplateID;
    return this;
  }

  /**
   * The unique ID of the Ezsigntemplate
   * minimum: 0
   * @return fkiEzsigntemplateID
   */
  @javax.annotation.Nullable
  public Integer getFkiEzsigntemplateID() {
    return fkiEzsigntemplateID;
  }

  public void setFkiEzsigntemplateID(@javax.annotation.Nullable Integer fkiEzsigntemplateID) {
    this.fkiEzsigntemplateID = fkiEzsigntemplateID;
  }


  public EzsigntemplatepublicRequest fkiEzsigntemplatepackageID(@javax.annotation.Nullable Integer fkiEzsigntemplatepackageID) {
    this.fkiEzsigntemplatepackageID = fkiEzsigntemplatepackageID;
    return this;
  }

  /**
   * The unique ID of the Ezsigntemplatepackage
   * minimum: 0
   * @return fkiEzsigntemplatepackageID
   */
  @javax.annotation.Nullable
  public Integer getFkiEzsigntemplatepackageID() {
    return fkiEzsigntemplatepackageID;
  }

  public void setFkiEzsigntemplatepackageID(@javax.annotation.Nullable Integer fkiEzsigntemplatepackageID) {
    this.fkiEzsigntemplatepackageID = fkiEzsigntemplatepackageID;
  }


  public EzsigntemplatepublicRequest sEzsigntemplatepublicDescription(@javax.annotation.Nonnull String sEzsigntemplatepublicDescription) {
    this.sEzsigntemplatepublicDescription = sEzsigntemplatepublicDescription;
    return this;
  }

  /**
   * The description of the Ezsigntemplatepublic
   * @return sEzsigntemplatepublicDescription
   */
  @javax.annotation.Nonnull
  public String getsEzsigntemplatepublicDescription() {
    return sEzsigntemplatepublicDescription;
  }

  public void setsEzsigntemplatepublicDescription(@javax.annotation.Nonnull String sEzsigntemplatepublicDescription) {
    this.sEzsigntemplatepublicDescription = sEzsigntemplatepublicDescription;
  }


  public EzsigntemplatepublicRequest bEzsigntemplatepublicIsactive(@javax.annotation.Nonnull Boolean bEzsigntemplatepublicIsactive) {
    this.bEzsigntemplatepublicIsactive = bEzsigntemplatepublicIsactive;
    return this;
  }

  /**
   * Whether the ezsigntemplatepublic is active or not
   * @return bEzsigntemplatepublicIsactive
   */
  @javax.annotation.Nonnull
  public Boolean getbEzsigntemplatepublicIsactive() {
    return bEzsigntemplatepublicIsactive;
  }

  public void setbEzsigntemplatepublicIsactive(@javax.annotation.Nonnull Boolean bEzsigntemplatepublicIsactive) {
    this.bEzsigntemplatepublicIsactive = bEzsigntemplatepublicIsactive;
  }


  public EzsigntemplatepublicRequest tEzsigntemplatepublicNote(@javax.annotation.Nonnull String tEzsigntemplatepublicNote) {
    this.tEzsigntemplatepublicNote = tEzsigntemplatepublicNote;
    return this;
  }

  /**
   * The note of the Ezsigntemplatepublic
   * @return tEzsigntemplatepublicNote
   */
  @javax.annotation.Nonnull
  public String gettEzsigntemplatepublicNote() {
    return tEzsigntemplatepublicNote;
  }

  public void settEzsigntemplatepublicNote(@javax.annotation.Nonnull String tEzsigntemplatepublicNote) {
    this.tEzsigntemplatepublicNote = tEzsigntemplatepublicNote;
  }


  public EzsigntemplatepublicRequest eEzsigntemplatepublicLimittype(@javax.annotation.Nonnull FieldEEzsigntemplatepublicLimittype eEzsigntemplatepublicLimittype) {
    this.eEzsigntemplatepublicLimittype = eEzsigntemplatepublicLimittype;
    return this;
  }

  /**
   * Get eEzsigntemplatepublicLimittype
   * @return eEzsigntemplatepublicLimittype
   */
  @javax.annotation.Nonnull
  public FieldEEzsigntemplatepublicLimittype geteEzsigntemplatepublicLimittype() {
    return eEzsigntemplatepublicLimittype;
  }

  public void seteEzsigntemplatepublicLimittype(@javax.annotation.Nonnull FieldEEzsigntemplatepublicLimittype eEzsigntemplatepublicLimittype) {
    this.eEzsigntemplatepublicLimittype = eEzsigntemplatepublicLimittype;
  }


  public EzsigntemplatepublicRequest iEzsigntemplatepublicLimit(@javax.annotation.Nonnull Integer iEzsigntemplatepublicLimit) {
    this.iEzsigntemplatepublicLimit = iEzsigntemplatepublicLimit;
    return this;
  }

  /**
   * The limit of the Ezsigntemplatepublic
   * minimum: 0
   * maximum: 65535
   * @return iEzsigntemplatepublicLimit
   */
  @javax.annotation.Nonnull
  public Integer getiEzsigntemplatepublicLimit() {
    return iEzsigntemplatepublicLimit;
  }

  public void setiEzsigntemplatepublicLimit(@javax.annotation.Nonnull Integer iEzsigntemplatepublicLimit) {
    this.iEzsigntemplatepublicLimit = iEzsigntemplatepublicLimit;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsigntemplatepublicRequest ezsigntemplatepublicRequest = (EzsigntemplatepublicRequest) o;
    return Objects.equals(this.pkiEzsigntemplatepublicID, ezsigntemplatepublicRequest.pkiEzsigntemplatepublicID) &&
        Objects.equals(this.fkiEzsignfoldertypeID, ezsigntemplatepublicRequest.fkiEzsignfoldertypeID) &&
        Objects.equals(this.fkiUserlogintypeID, ezsigntemplatepublicRequest.fkiUserlogintypeID) &&
        Objects.equals(this.fkiEzsigntemplateID, ezsigntemplatepublicRequest.fkiEzsigntemplateID) &&
        Objects.equals(this.fkiEzsigntemplatepackageID, ezsigntemplatepublicRequest.fkiEzsigntemplatepackageID) &&
        Objects.equals(this.sEzsigntemplatepublicDescription, ezsigntemplatepublicRequest.sEzsigntemplatepublicDescription) &&
        Objects.equals(this.bEzsigntemplatepublicIsactive, ezsigntemplatepublicRequest.bEzsigntemplatepublicIsactive) &&
        Objects.equals(this.tEzsigntemplatepublicNote, ezsigntemplatepublicRequest.tEzsigntemplatepublicNote) &&
        Objects.equals(this.eEzsigntemplatepublicLimittype, ezsigntemplatepublicRequest.eEzsigntemplatepublicLimittype) &&
        Objects.equals(this.iEzsigntemplatepublicLimit, ezsigntemplatepublicRequest.iEzsigntemplatepublicLimit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pkiEzsigntemplatepublicID, fkiEzsignfoldertypeID, fkiUserlogintypeID, fkiEzsigntemplateID, fkiEzsigntemplatepackageID, sEzsigntemplatepublicDescription, bEzsigntemplatepublicIsactive, tEzsigntemplatepublicNote, eEzsigntemplatepublicLimittype, iEzsigntemplatepublicLimit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsigntemplatepublicRequest {\n");
    sb.append("    pkiEzsigntemplatepublicID: ").append(toIndentedString(pkiEzsigntemplatepublicID)).append("\n");
    sb.append("    fkiEzsignfoldertypeID: ").append(toIndentedString(fkiEzsignfoldertypeID)).append("\n");
    sb.append("    fkiUserlogintypeID: ").append(toIndentedString(fkiUserlogintypeID)).append("\n");
    sb.append("    fkiEzsigntemplateID: ").append(toIndentedString(fkiEzsigntemplateID)).append("\n");
    sb.append("    fkiEzsigntemplatepackageID: ").append(toIndentedString(fkiEzsigntemplatepackageID)).append("\n");
    sb.append("    sEzsigntemplatepublicDescription: ").append(toIndentedString(sEzsigntemplatepublicDescription)).append("\n");
    sb.append("    bEzsigntemplatepublicIsactive: ").append(toIndentedString(bEzsigntemplatepublicIsactive)).append("\n");
    sb.append("    tEzsigntemplatepublicNote: ").append(toIndentedString(tEzsigntemplatepublicNote)).append("\n");
    sb.append("    eEzsigntemplatepublicLimittype: ").append(toIndentedString(eEzsigntemplatepublicLimittype)).append("\n");
    sb.append("    iEzsigntemplatepublicLimit: ").append(toIndentedString(iEzsigntemplatepublicLimit)).append("\n");
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
    openapiFields.add("pkiEzsigntemplatepublicID");
    openapiFields.add("fkiEzsignfoldertypeID");
    openapiFields.add("fkiUserlogintypeID");
    openapiFields.add("fkiEzsigntemplateID");
    openapiFields.add("fkiEzsigntemplatepackageID");
    openapiFields.add("sEzsigntemplatepublicDescription");
    openapiFields.add("bEzsigntemplatepublicIsactive");
    openapiFields.add("tEzsigntemplatepublicNote");
    openapiFields.add("eEzsigntemplatepublicLimittype");
    openapiFields.add("iEzsigntemplatepublicLimit");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("fkiEzsignfoldertypeID");
    openapiRequiredFields.add("fkiUserlogintypeID");
    openapiRequiredFields.add("sEzsigntemplatepublicDescription");
    openapiRequiredFields.add("bEzsigntemplatepublicIsactive");
    openapiRequiredFields.add("tEzsigntemplatepublicNote");
    openapiRequiredFields.add("eEzsigntemplatepublicLimittype");
    openapiRequiredFields.add("iEzsigntemplatepublicLimit");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EzsigntemplatepublicRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EzsigntemplatepublicRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EzsigntemplatepublicRequest is not found in the empty JSON string", EzsigntemplatepublicRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EzsigntemplatepublicRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EzsigntemplatepublicRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EzsigntemplatepublicRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("sEzsigntemplatepublicDescription").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sEzsigntemplatepublicDescription` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sEzsigntemplatepublicDescription").toString()));
      }
      if (!jsonObj.get("tEzsigntemplatepublicNote").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tEzsigntemplatepublicNote` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tEzsigntemplatepublicNote").toString()));
      }
      // validate the required field `eEzsigntemplatepublicLimittype`
      FieldEEzsigntemplatepublicLimittype.validateJsonElement(jsonObj.get("eEzsigntemplatepublicLimittype"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EzsigntemplatepublicRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EzsigntemplatepublicRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EzsigntemplatepublicRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EzsigntemplatepublicRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<EzsigntemplatepublicRequest>() {
           @Override
           public void write(JsonWriter out, EzsigntemplatepublicRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EzsigntemplatepublicRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EzsigntemplatepublicRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EzsigntemplatepublicRequest
   * @throws IOException if the JSON string is invalid with respect to EzsigntemplatepublicRequest
   */
  public static EzsigntemplatepublicRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EzsigntemplatepublicRequest.class);
  }

  /**
   * Convert an instance of EzsigntemplatepublicRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

