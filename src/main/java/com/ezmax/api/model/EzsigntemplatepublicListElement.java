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
 * A Ezsigntemplatepublic List Element
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-07T19:20:13.445471985Z[Etc/UTC]", comments = "Generator version: 7.12.0")
public class EzsigntemplatepublicListElement {
  public static final String SERIALIZED_NAME_PKI_EZSIGNTEMPLATEPUBLIC_I_D = "pkiEzsigntemplatepublicID";
  @SerializedName(SERIALIZED_NAME_PKI_EZSIGNTEMPLATEPUBLIC_I_D)
  @javax.annotation.Nonnull
  private Integer pkiEzsigntemplatepublicID;

  public static final String SERIALIZED_NAME_FKI_EZSIGNFOLDERTYPE_I_D = "fkiEzsignfoldertypeID";
  @SerializedName(SERIALIZED_NAME_FKI_EZSIGNFOLDERTYPE_I_D)
  @javax.annotation.Nonnull
  private Integer fkiEzsignfoldertypeID;

  public static final String SERIALIZED_NAME_S_EZSIGNFOLDERTYPE_NAME_X = "sEzsignfoldertypeNameX";
  @SerializedName(SERIALIZED_NAME_S_EZSIGNFOLDERTYPE_NAME_X)
  @javax.annotation.Nonnull
  private String sEzsignfoldertypeNameX;

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

  public static final String SERIALIZED_NAME_I_EZSIGNTEMPLATEPUBLIC_LIMITEXCEEDED = "iEzsigntemplatepublicLimitexceeded";
  @SerializedName(SERIALIZED_NAME_I_EZSIGNTEMPLATEPUBLIC_LIMITEXCEEDED)
  @javax.annotation.Nonnull
  private Integer iEzsigntemplatepublicLimitexceeded;

  public static final String SERIALIZED_NAME_DT_EZSIGNTEMPLATEPUBLIC_LIMITEXCEEDEDSINCE = "dtEzsigntemplatepublicLimitexceededsince";
  @SerializedName(SERIALIZED_NAME_DT_EZSIGNTEMPLATEPUBLIC_LIMITEXCEEDEDSINCE)
  @javax.annotation.Nonnull
  private String dtEzsigntemplatepublicLimitexceededsince;

  public static final String SERIALIZED_NAME_I_EZSIGNFOLDER = "iEzsignfolder";
  @SerializedName(SERIALIZED_NAME_I_EZSIGNFOLDER)
  @javax.annotation.Nonnull
  private Integer iEzsignfolder;

  public static final String SERIALIZED_NAME_I_EZSIGNDOCUMENT = "iEzsigndocument";
  @SerializedName(SERIALIZED_NAME_I_EZSIGNDOCUMENT)
  @javax.annotation.Nonnull
  private Integer iEzsigndocument;

  public static final String SERIALIZED_NAME_S_EZSIGNTEMPLATEPUBLIC_EZSIGNTEMPLATEDESCRIPTION = "sEzsigntemplatepublicEzsigntemplatedescription";
  @SerializedName(SERIALIZED_NAME_S_EZSIGNTEMPLATEPUBLIC_EZSIGNTEMPLATEDESCRIPTION)
  @javax.annotation.Nonnull
  private String sEzsigntemplatepublicEzsigntemplatedescription;

  public EzsigntemplatepublicListElement() {
  }

  public EzsigntemplatepublicListElement pkiEzsigntemplatepublicID(@javax.annotation.Nonnull Integer pkiEzsigntemplatepublicID) {
    this.pkiEzsigntemplatepublicID = pkiEzsigntemplatepublicID;
    return this;
  }

  /**
   * The unique ID of the Ezsigntemplatepublic
   * minimum: 0
   * maximum: 65535
   * @return pkiEzsigntemplatepublicID
   */
  @javax.annotation.Nonnull
  public Integer getPkiEzsigntemplatepublicID() {
    return pkiEzsigntemplatepublicID;
  }

  public void setPkiEzsigntemplatepublicID(@javax.annotation.Nonnull Integer pkiEzsigntemplatepublicID) {
    this.pkiEzsigntemplatepublicID = pkiEzsigntemplatepublicID;
  }


  public EzsigntemplatepublicListElement fkiEzsignfoldertypeID(@javax.annotation.Nonnull Integer fkiEzsignfoldertypeID) {
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


  public EzsigntemplatepublicListElement sEzsignfoldertypeNameX(@javax.annotation.Nonnull String sEzsignfoldertypeNameX) {
    this.sEzsignfoldertypeNameX = sEzsignfoldertypeNameX;
    return this;
  }

  /**
   * The name of the Ezsignfoldertype in the language of the requester
   * @return sEzsignfoldertypeNameX
   */
  @javax.annotation.Nonnull
  public String getsEzsignfoldertypeNameX() {
    return sEzsignfoldertypeNameX;
  }

  public void setsEzsignfoldertypeNameX(@javax.annotation.Nonnull String sEzsignfoldertypeNameX) {
    this.sEzsignfoldertypeNameX = sEzsignfoldertypeNameX;
  }


  public EzsigntemplatepublicListElement fkiUserlogintypeID(@javax.annotation.Nonnull Integer fkiUserlogintypeID) {
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


  public EzsigntemplatepublicListElement fkiEzsigntemplateID(@javax.annotation.Nullable Integer fkiEzsigntemplateID) {
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


  public EzsigntemplatepublicListElement fkiEzsigntemplatepackageID(@javax.annotation.Nullable Integer fkiEzsigntemplatepackageID) {
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


  public EzsigntemplatepublicListElement sEzsigntemplatepublicDescription(@javax.annotation.Nonnull String sEzsigntemplatepublicDescription) {
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


  public EzsigntemplatepublicListElement bEzsigntemplatepublicIsactive(@javax.annotation.Nonnull Boolean bEzsigntemplatepublicIsactive) {
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


  public EzsigntemplatepublicListElement tEzsigntemplatepublicNote(@javax.annotation.Nonnull String tEzsigntemplatepublicNote) {
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


  public EzsigntemplatepublicListElement eEzsigntemplatepublicLimittype(@javax.annotation.Nonnull FieldEEzsigntemplatepublicLimittype eEzsigntemplatepublicLimittype) {
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


  public EzsigntemplatepublicListElement iEzsigntemplatepublicLimit(@javax.annotation.Nonnull Integer iEzsigntemplatepublicLimit) {
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


  public EzsigntemplatepublicListElement iEzsigntemplatepublicLimitexceeded(@javax.annotation.Nonnull Integer iEzsigntemplatepublicLimitexceeded) {
    this.iEzsigntemplatepublicLimitexceeded = iEzsigntemplatepublicLimitexceeded;
    return this;
  }

  /**
   * The limitexceeded of the Ezsigntemplatepublic
   * minimum: 0
   * maximum: 65535
   * @return iEzsigntemplatepublicLimitexceeded
   */
  @javax.annotation.Nonnull
  public Integer getiEzsigntemplatepublicLimitexceeded() {
    return iEzsigntemplatepublicLimitexceeded;
  }

  public void setiEzsigntemplatepublicLimitexceeded(@javax.annotation.Nonnull Integer iEzsigntemplatepublicLimitexceeded) {
    this.iEzsigntemplatepublicLimitexceeded = iEzsigntemplatepublicLimitexceeded;
  }


  public EzsigntemplatepublicListElement dtEzsigntemplatepublicLimitexceededsince(@javax.annotation.Nonnull String dtEzsigntemplatepublicLimitexceededsince) {
    this.dtEzsigntemplatepublicLimitexceededsince = dtEzsigntemplatepublicLimitexceededsince;
    return this;
  }

  /**
   * The limitexceededsince of the Ezsigntemplatepublic
   * @return dtEzsigntemplatepublicLimitexceededsince
   */
  @javax.annotation.Nonnull
  public String getDtEzsigntemplatepublicLimitexceededsince() {
    return dtEzsigntemplatepublicLimitexceededsince;
  }

  public void setDtEzsigntemplatepublicLimitexceededsince(@javax.annotation.Nonnull String dtEzsigntemplatepublicLimitexceededsince) {
    this.dtEzsigntemplatepublicLimitexceededsince = dtEzsigntemplatepublicLimitexceededsince;
  }


  public EzsigntemplatepublicListElement iEzsignfolder(@javax.annotation.Nonnull Integer iEzsignfolder) {
    this.iEzsignfolder = iEzsignfolder;
    return this;
  }

  /**
   * The total number of Ezsignfolders using the Ezsigntemplatepublic
   * @return iEzsignfolder
   */
  @javax.annotation.Nonnull
  public Integer getiEzsignfolder() {
    return iEzsignfolder;
  }

  public void setiEzsignfolder(@javax.annotation.Nonnull Integer iEzsignfolder) {
    this.iEzsignfolder = iEzsignfolder;
  }


  public EzsigntemplatepublicListElement iEzsigndocument(@javax.annotation.Nonnull Integer iEzsigndocument) {
    this.iEzsigndocument = iEzsigndocument;
    return this;
  }

  /**
   * The total number of Ezsigndocuments using the Ezsigntemplatepublic
   * @return iEzsigndocument
   */
  @javax.annotation.Nonnull
  public Integer getiEzsigndocument() {
    return iEzsigndocument;
  }

  public void setiEzsigndocument(@javax.annotation.Nonnull Integer iEzsigndocument) {
    this.iEzsigndocument = iEzsigndocument;
  }


  public EzsigntemplatepublicListElement sEzsigntemplatepublicEzsigntemplatedescription(@javax.annotation.Nonnull String sEzsigntemplatepublicEzsigntemplatedescription) {
    this.sEzsigntemplatepublicEzsigntemplatedescription = sEzsigntemplatepublicEzsigntemplatedescription;
    return this;
  }

  /**
   * The Ezsigntemplate/Ezsigntemplatepackage description
   * @return sEzsigntemplatepublicEzsigntemplatedescription
   */
  @javax.annotation.Nonnull
  public String getsEzsigntemplatepublicEzsigntemplatedescription() {
    return sEzsigntemplatepublicEzsigntemplatedescription;
  }

  public void setsEzsigntemplatepublicEzsigntemplatedescription(@javax.annotation.Nonnull String sEzsigntemplatepublicEzsigntemplatedescription) {
    this.sEzsigntemplatepublicEzsigntemplatedescription = sEzsigntemplatepublicEzsigntemplatedescription;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsigntemplatepublicListElement ezsigntemplatepublicListElement = (EzsigntemplatepublicListElement) o;
    return Objects.equals(this.pkiEzsigntemplatepublicID, ezsigntemplatepublicListElement.pkiEzsigntemplatepublicID) &&
        Objects.equals(this.fkiEzsignfoldertypeID, ezsigntemplatepublicListElement.fkiEzsignfoldertypeID) &&
        Objects.equals(this.sEzsignfoldertypeNameX, ezsigntemplatepublicListElement.sEzsignfoldertypeNameX) &&
        Objects.equals(this.fkiUserlogintypeID, ezsigntemplatepublicListElement.fkiUserlogintypeID) &&
        Objects.equals(this.fkiEzsigntemplateID, ezsigntemplatepublicListElement.fkiEzsigntemplateID) &&
        Objects.equals(this.fkiEzsigntemplatepackageID, ezsigntemplatepublicListElement.fkiEzsigntemplatepackageID) &&
        Objects.equals(this.sEzsigntemplatepublicDescription, ezsigntemplatepublicListElement.sEzsigntemplatepublicDescription) &&
        Objects.equals(this.bEzsigntemplatepublicIsactive, ezsigntemplatepublicListElement.bEzsigntemplatepublicIsactive) &&
        Objects.equals(this.tEzsigntemplatepublicNote, ezsigntemplatepublicListElement.tEzsigntemplatepublicNote) &&
        Objects.equals(this.eEzsigntemplatepublicLimittype, ezsigntemplatepublicListElement.eEzsigntemplatepublicLimittype) &&
        Objects.equals(this.iEzsigntemplatepublicLimit, ezsigntemplatepublicListElement.iEzsigntemplatepublicLimit) &&
        Objects.equals(this.iEzsigntemplatepublicLimitexceeded, ezsigntemplatepublicListElement.iEzsigntemplatepublicLimitexceeded) &&
        Objects.equals(this.dtEzsigntemplatepublicLimitexceededsince, ezsigntemplatepublicListElement.dtEzsigntemplatepublicLimitexceededsince) &&
        Objects.equals(this.iEzsignfolder, ezsigntemplatepublicListElement.iEzsignfolder) &&
        Objects.equals(this.iEzsigndocument, ezsigntemplatepublicListElement.iEzsigndocument) &&
        Objects.equals(this.sEzsigntemplatepublicEzsigntemplatedescription, ezsigntemplatepublicListElement.sEzsigntemplatepublicEzsigntemplatedescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pkiEzsigntemplatepublicID, fkiEzsignfoldertypeID, sEzsignfoldertypeNameX, fkiUserlogintypeID, fkiEzsigntemplateID, fkiEzsigntemplatepackageID, sEzsigntemplatepublicDescription, bEzsigntemplatepublicIsactive, tEzsigntemplatepublicNote, eEzsigntemplatepublicLimittype, iEzsigntemplatepublicLimit, iEzsigntemplatepublicLimitexceeded, dtEzsigntemplatepublicLimitexceededsince, iEzsignfolder, iEzsigndocument, sEzsigntemplatepublicEzsigntemplatedescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsigntemplatepublicListElement {\n");
    sb.append("    pkiEzsigntemplatepublicID: ").append(toIndentedString(pkiEzsigntemplatepublicID)).append("\n");
    sb.append("    fkiEzsignfoldertypeID: ").append(toIndentedString(fkiEzsignfoldertypeID)).append("\n");
    sb.append("    sEzsignfoldertypeNameX: ").append(toIndentedString(sEzsignfoldertypeNameX)).append("\n");
    sb.append("    fkiUserlogintypeID: ").append(toIndentedString(fkiUserlogintypeID)).append("\n");
    sb.append("    fkiEzsigntemplateID: ").append(toIndentedString(fkiEzsigntemplateID)).append("\n");
    sb.append("    fkiEzsigntemplatepackageID: ").append(toIndentedString(fkiEzsigntemplatepackageID)).append("\n");
    sb.append("    sEzsigntemplatepublicDescription: ").append(toIndentedString(sEzsigntemplatepublicDescription)).append("\n");
    sb.append("    bEzsigntemplatepublicIsactive: ").append(toIndentedString(bEzsigntemplatepublicIsactive)).append("\n");
    sb.append("    tEzsigntemplatepublicNote: ").append(toIndentedString(tEzsigntemplatepublicNote)).append("\n");
    sb.append("    eEzsigntemplatepublicLimittype: ").append(toIndentedString(eEzsigntemplatepublicLimittype)).append("\n");
    sb.append("    iEzsigntemplatepublicLimit: ").append(toIndentedString(iEzsigntemplatepublicLimit)).append("\n");
    sb.append("    iEzsigntemplatepublicLimitexceeded: ").append(toIndentedString(iEzsigntemplatepublicLimitexceeded)).append("\n");
    sb.append("    dtEzsigntemplatepublicLimitexceededsince: ").append(toIndentedString(dtEzsigntemplatepublicLimitexceededsince)).append("\n");
    sb.append("    iEzsignfolder: ").append(toIndentedString(iEzsignfolder)).append("\n");
    sb.append("    iEzsigndocument: ").append(toIndentedString(iEzsigndocument)).append("\n");
    sb.append("    sEzsigntemplatepublicEzsigntemplatedescription: ").append(toIndentedString(sEzsigntemplatepublicEzsigntemplatedescription)).append("\n");
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
    openapiFields.add("sEzsignfoldertypeNameX");
    openapiFields.add("fkiUserlogintypeID");
    openapiFields.add("fkiEzsigntemplateID");
    openapiFields.add("fkiEzsigntemplatepackageID");
    openapiFields.add("sEzsigntemplatepublicDescription");
    openapiFields.add("bEzsigntemplatepublicIsactive");
    openapiFields.add("tEzsigntemplatepublicNote");
    openapiFields.add("eEzsigntemplatepublicLimittype");
    openapiFields.add("iEzsigntemplatepublicLimit");
    openapiFields.add("iEzsigntemplatepublicLimitexceeded");
    openapiFields.add("dtEzsigntemplatepublicLimitexceededsince");
    openapiFields.add("iEzsignfolder");
    openapiFields.add("iEzsigndocument");
    openapiFields.add("sEzsigntemplatepublicEzsigntemplatedescription");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("pkiEzsigntemplatepublicID");
    openapiRequiredFields.add("fkiEzsignfoldertypeID");
    openapiRequiredFields.add("sEzsignfoldertypeNameX");
    openapiRequiredFields.add("fkiUserlogintypeID");
    openapiRequiredFields.add("sEzsigntemplatepublicDescription");
    openapiRequiredFields.add("bEzsigntemplatepublicIsactive");
    openapiRequiredFields.add("tEzsigntemplatepublicNote");
    openapiRequiredFields.add("eEzsigntemplatepublicLimittype");
    openapiRequiredFields.add("iEzsigntemplatepublicLimit");
    openapiRequiredFields.add("iEzsigntemplatepublicLimitexceeded");
    openapiRequiredFields.add("dtEzsigntemplatepublicLimitexceededsince");
    openapiRequiredFields.add("iEzsignfolder");
    openapiRequiredFields.add("iEzsigndocument");
    openapiRequiredFields.add("sEzsigntemplatepublicEzsigntemplatedescription");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EzsigntemplatepublicListElement
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EzsigntemplatepublicListElement.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EzsigntemplatepublicListElement is not found in the empty JSON string", EzsigntemplatepublicListElement.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EzsigntemplatepublicListElement.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EzsigntemplatepublicListElement` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EzsigntemplatepublicListElement.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("sEzsignfoldertypeNameX").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sEzsignfoldertypeNameX` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sEzsignfoldertypeNameX").toString()));
      }
      if (!jsonObj.get("sEzsigntemplatepublicDescription").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sEzsigntemplatepublicDescription` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sEzsigntemplatepublicDescription").toString()));
      }
      if (!jsonObj.get("tEzsigntemplatepublicNote").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tEzsigntemplatepublicNote` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tEzsigntemplatepublicNote").toString()));
      }
      // validate the required field `eEzsigntemplatepublicLimittype`
      FieldEEzsigntemplatepublicLimittype.validateJsonElement(jsonObj.get("eEzsigntemplatepublicLimittype"));
      if (!jsonObj.get("dtEzsigntemplatepublicLimitexceededsince").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dtEzsigntemplatepublicLimitexceededsince` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dtEzsigntemplatepublicLimitexceededsince").toString()));
      }
      if (!jsonObj.get("sEzsigntemplatepublicEzsigntemplatedescription").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sEzsigntemplatepublicEzsigntemplatedescription` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sEzsigntemplatepublicEzsigntemplatedescription").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EzsigntemplatepublicListElement.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EzsigntemplatepublicListElement' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EzsigntemplatepublicListElement> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EzsigntemplatepublicListElement.class));

       return (TypeAdapter<T>) new TypeAdapter<EzsigntemplatepublicListElement>() {
           @Override
           public void write(JsonWriter out, EzsigntemplatepublicListElement value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EzsigntemplatepublicListElement read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EzsigntemplatepublicListElement given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EzsigntemplatepublicListElement
   * @throws IOException if the JSON string is invalid with respect to EzsigntemplatepublicListElement
   */
  public static EzsigntemplatepublicListElement fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EzsigntemplatepublicListElement.class);
  }

  /**
   * Convert an instance of EzsigntemplatepublicListElement to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

