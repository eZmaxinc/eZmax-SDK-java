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
import com.ezmax.api.model.EnumTextvalidation;
import com.ezmax.api.model.FieldEEzsigntemplateformfieldgroupSignerrequirement;
import com.ezmax.api.model.FieldEEzsigntemplateformfieldgroupTooltipposition;
import com.ezmax.api.model.FieldEEzsigntemplateformfieldgroupType;
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
 * A Ezsigntemplateformfieldgroup Object
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-07T19:20:13.445471985Z[Etc/UTC]", comments = "Generator version: 7.12.0")
public class EzsigntemplateformfieldgroupResponse {
  public static final String SERIALIZED_NAME_PKI_EZSIGNTEMPLATEFORMFIELDGROUP_I_D = "pkiEzsigntemplateformfieldgroupID";
  @SerializedName(SERIALIZED_NAME_PKI_EZSIGNTEMPLATEFORMFIELDGROUP_I_D)
  @javax.annotation.Nonnull
  private Integer pkiEzsigntemplateformfieldgroupID;

  public static final String SERIALIZED_NAME_FKI_EZSIGNTEMPLATEDOCUMENT_I_D = "fkiEzsigntemplatedocumentID";
  @SerializedName(SERIALIZED_NAME_FKI_EZSIGNTEMPLATEDOCUMENT_I_D)
  @javax.annotation.Nonnull
  private Integer fkiEzsigntemplatedocumentID;

  public static final String SERIALIZED_NAME_E_EZSIGNTEMPLATEFORMFIELDGROUP_TYPE = "eEzsigntemplateformfieldgroupType";
  @SerializedName(SERIALIZED_NAME_E_EZSIGNTEMPLATEFORMFIELDGROUP_TYPE)
  @javax.annotation.Nonnull
  private FieldEEzsigntemplateformfieldgroupType eEzsigntemplateformfieldgroupType;

  public static final String SERIALIZED_NAME_E_EZSIGNTEMPLATEFORMFIELDGROUP_SIGNERREQUIREMENT = "eEzsigntemplateformfieldgroupSignerrequirement";
  @Deprecated
  @SerializedName(SERIALIZED_NAME_E_EZSIGNTEMPLATEFORMFIELDGROUP_SIGNERREQUIREMENT)
  @javax.annotation.Nullable
  private FieldEEzsigntemplateformfieldgroupSignerrequirement eEzsigntemplateformfieldgroupSignerrequirement;

  public static final String SERIALIZED_NAME_S_EZSIGNTEMPLATEFORMFIELDGROUP_LABEL = "sEzsigntemplateformfieldgroupLabel";
  @SerializedName(SERIALIZED_NAME_S_EZSIGNTEMPLATEFORMFIELDGROUP_LABEL)
  @javax.annotation.Nonnull
  private String sEzsigntemplateformfieldgroupLabel;

  public static final String SERIALIZED_NAME_I_EZSIGNTEMPLATEFORMFIELDGROUP_STEP = "iEzsigntemplateformfieldgroupStep";
  @SerializedName(SERIALIZED_NAME_I_EZSIGNTEMPLATEFORMFIELDGROUP_STEP)
  @javax.annotation.Nonnull
  private Integer iEzsigntemplateformfieldgroupStep;

  public static final String SERIALIZED_NAME_S_EZSIGNTEMPLATEFORMFIELDGROUP_DEFAULTVALUE = "sEzsigntemplateformfieldgroupDefaultvalue";
  @SerializedName(SERIALIZED_NAME_S_EZSIGNTEMPLATEFORMFIELDGROUP_DEFAULTVALUE)
  @javax.annotation.Nullable
  private String sEzsigntemplateformfieldgroupDefaultvalue;

  public static final String SERIALIZED_NAME_I_EZSIGNTEMPLATEFORMFIELDGROUP_FILLEDMIN = "iEzsigntemplateformfieldgroupFilledmin";
  @SerializedName(SERIALIZED_NAME_I_EZSIGNTEMPLATEFORMFIELDGROUP_FILLEDMIN)
  @javax.annotation.Nonnull
  private Integer iEzsigntemplateformfieldgroupFilledmin;

  public static final String SERIALIZED_NAME_I_EZSIGNTEMPLATEFORMFIELDGROUP_FILLEDMAX = "iEzsigntemplateformfieldgroupFilledmax";
  @SerializedName(SERIALIZED_NAME_I_EZSIGNTEMPLATEFORMFIELDGROUP_FILLEDMAX)
  @javax.annotation.Nonnull
  private Integer iEzsigntemplateformfieldgroupFilledmax;

  public static final String SERIALIZED_NAME_B_EZSIGNTEMPLATEFORMFIELDGROUP_READONLY = "bEzsigntemplateformfieldgroupReadonly";
  @SerializedName(SERIALIZED_NAME_B_EZSIGNTEMPLATEFORMFIELDGROUP_READONLY)
  @javax.annotation.Nonnull
  private Boolean bEzsigntemplateformfieldgroupReadonly;

  public static final String SERIALIZED_NAME_I_EZSIGNTEMPLATEFORMFIELDGROUP_MAXLENGTH = "iEzsigntemplateformfieldgroupMaxlength";
  @SerializedName(SERIALIZED_NAME_I_EZSIGNTEMPLATEFORMFIELDGROUP_MAXLENGTH)
  @javax.annotation.Nullable
  private Integer iEzsigntemplateformfieldgroupMaxlength;

  public static final String SERIALIZED_NAME_B_EZSIGNTEMPLATEFORMFIELDGROUP_ENCRYPTED = "bEzsigntemplateformfieldgroupEncrypted";
  @SerializedName(SERIALIZED_NAME_B_EZSIGNTEMPLATEFORMFIELDGROUP_ENCRYPTED)
  @javax.annotation.Nullable
  private Boolean bEzsigntemplateformfieldgroupEncrypted;

  public static final String SERIALIZED_NAME_S_EZSIGNTEMPLATEFORMFIELDGROUP_REGEXP = "sEzsigntemplateformfieldgroupRegexp";
  @SerializedName(SERIALIZED_NAME_S_EZSIGNTEMPLATEFORMFIELDGROUP_REGEXP)
  @javax.annotation.Nullable
  private String sEzsigntemplateformfieldgroupRegexp;

  public static final String SERIALIZED_NAME_S_EZSIGNTEMPLATEFORMFIELDGROUP_TEXTVALIDATIONCUSTOMMESSAGE = "sEzsigntemplateformfieldgroupTextvalidationcustommessage";
  @SerializedName(SERIALIZED_NAME_S_EZSIGNTEMPLATEFORMFIELDGROUP_TEXTVALIDATIONCUSTOMMESSAGE)
  @javax.annotation.Nullable
  private String sEzsigntemplateformfieldgroupTextvalidationcustommessage;

  public static final String SERIALIZED_NAME_E_EZSIGNTEMPLATEFORMFIELDGROUP_TEXTVALIDATION = "eEzsigntemplateformfieldgroupTextvalidation";
  @SerializedName(SERIALIZED_NAME_E_EZSIGNTEMPLATEFORMFIELDGROUP_TEXTVALIDATION)
  @javax.annotation.Nullable
  private EnumTextvalidation eEzsigntemplateformfieldgroupTextvalidation;

  public static final String SERIALIZED_NAME_T_EZSIGNTEMPLATEFORMFIELDGROUP_TOOLTIP = "tEzsigntemplateformfieldgroupTooltip";
  @SerializedName(SERIALIZED_NAME_T_EZSIGNTEMPLATEFORMFIELDGROUP_TOOLTIP)
  @javax.annotation.Nullable
  private String tEzsigntemplateformfieldgroupTooltip;

  public static final String SERIALIZED_NAME_E_EZSIGNTEMPLATEFORMFIELDGROUP_TOOLTIPPOSITION = "eEzsigntemplateformfieldgroupTooltipposition";
  @SerializedName(SERIALIZED_NAME_E_EZSIGNTEMPLATEFORMFIELDGROUP_TOOLTIPPOSITION)
  @javax.annotation.Nullable
  private FieldEEzsigntemplateformfieldgroupTooltipposition eEzsigntemplateformfieldgroupTooltipposition;

  public EzsigntemplateformfieldgroupResponse() {
  }

  public EzsigntemplateformfieldgroupResponse pkiEzsigntemplateformfieldgroupID(@javax.annotation.Nonnull Integer pkiEzsigntemplateformfieldgroupID) {
    this.pkiEzsigntemplateformfieldgroupID = pkiEzsigntemplateformfieldgroupID;
    return this;
  }

  /**
   * The unique ID of the Ezsigntemplateformfieldgroup
   * minimum: 0
   * @return pkiEzsigntemplateformfieldgroupID
   */
  @javax.annotation.Nonnull
  public Integer getPkiEzsigntemplateformfieldgroupID() {
    return pkiEzsigntemplateformfieldgroupID;
  }

  public void setPkiEzsigntemplateformfieldgroupID(@javax.annotation.Nonnull Integer pkiEzsigntemplateformfieldgroupID) {
    this.pkiEzsigntemplateformfieldgroupID = pkiEzsigntemplateformfieldgroupID;
  }


  public EzsigntemplateformfieldgroupResponse fkiEzsigntemplatedocumentID(@javax.annotation.Nonnull Integer fkiEzsigntemplatedocumentID) {
    this.fkiEzsigntemplatedocumentID = fkiEzsigntemplatedocumentID;
    return this;
  }

  /**
   * The unique ID of the Ezsigntemplatedocument
   * minimum: 0
   * @return fkiEzsigntemplatedocumentID
   */
  @javax.annotation.Nonnull
  public Integer getFkiEzsigntemplatedocumentID() {
    return fkiEzsigntemplatedocumentID;
  }

  public void setFkiEzsigntemplatedocumentID(@javax.annotation.Nonnull Integer fkiEzsigntemplatedocumentID) {
    this.fkiEzsigntemplatedocumentID = fkiEzsigntemplatedocumentID;
  }


  public EzsigntemplateformfieldgroupResponse eEzsigntemplateformfieldgroupType(@javax.annotation.Nonnull FieldEEzsigntemplateformfieldgroupType eEzsigntemplateformfieldgroupType) {
    this.eEzsigntemplateformfieldgroupType = eEzsigntemplateformfieldgroupType;
    return this;
  }

  /**
   * Get eEzsigntemplateformfieldgroupType
   * @return eEzsigntemplateformfieldgroupType
   */
  @javax.annotation.Nonnull
  public FieldEEzsigntemplateformfieldgroupType geteEzsigntemplateformfieldgroupType() {
    return eEzsigntemplateformfieldgroupType;
  }

  public void seteEzsigntemplateformfieldgroupType(@javax.annotation.Nonnull FieldEEzsigntemplateformfieldgroupType eEzsigntemplateformfieldgroupType) {
    this.eEzsigntemplateformfieldgroupType = eEzsigntemplateformfieldgroupType;
  }


  @Deprecated
  public EzsigntemplateformfieldgroupResponse eEzsigntemplateformfieldgroupSignerrequirement(@javax.annotation.Nullable FieldEEzsigntemplateformfieldgroupSignerrequirement eEzsigntemplateformfieldgroupSignerrequirement) {
    this.eEzsigntemplateformfieldgroupSignerrequirement = eEzsigntemplateformfieldgroupSignerrequirement;
    return this;
  }

  /**
   * Get eEzsigntemplateformfieldgroupSignerrequirement
   * @return eEzsigntemplateformfieldgroupSignerrequirement
   * @deprecated
   */
  @Deprecated
  @javax.annotation.Nullable
  public FieldEEzsigntemplateformfieldgroupSignerrequirement geteEzsigntemplateformfieldgroupSignerrequirement() {
    return eEzsigntemplateformfieldgroupSignerrequirement;
  }

  @Deprecated
  public void seteEzsigntemplateformfieldgroupSignerrequirement(@javax.annotation.Nullable FieldEEzsigntemplateformfieldgroupSignerrequirement eEzsigntemplateformfieldgroupSignerrequirement) {
    this.eEzsigntemplateformfieldgroupSignerrequirement = eEzsigntemplateformfieldgroupSignerrequirement;
  }


  public EzsigntemplateformfieldgroupResponse sEzsigntemplateformfieldgroupLabel(@javax.annotation.Nonnull String sEzsigntemplateformfieldgroupLabel) {
    this.sEzsigntemplateformfieldgroupLabel = sEzsigntemplateformfieldgroupLabel;
    return this;
  }

  /**
   * The Label for the Ezsigntemplateformfieldgroup
   * @return sEzsigntemplateformfieldgroupLabel
   */
  @javax.annotation.Nonnull
  public String getsEzsigntemplateformfieldgroupLabel() {
    return sEzsigntemplateformfieldgroupLabel;
  }

  public void setsEzsigntemplateformfieldgroupLabel(@javax.annotation.Nonnull String sEzsigntemplateformfieldgroupLabel) {
    this.sEzsigntemplateformfieldgroupLabel = sEzsigntemplateformfieldgroupLabel;
  }


  public EzsigntemplateformfieldgroupResponse iEzsigntemplateformfieldgroupStep(@javax.annotation.Nonnull Integer iEzsigntemplateformfieldgroupStep) {
    this.iEzsigntemplateformfieldgroupStep = iEzsigntemplateformfieldgroupStep;
    return this;
  }

  /**
   * The step when the Ezsigntemplatesigner will be invited to fill the form fields
   * minimum: 1
   * @return iEzsigntemplateformfieldgroupStep
   */
  @javax.annotation.Nonnull
  public Integer getiEzsigntemplateformfieldgroupStep() {
    return iEzsigntemplateformfieldgroupStep;
  }

  public void setiEzsigntemplateformfieldgroupStep(@javax.annotation.Nonnull Integer iEzsigntemplateformfieldgroupStep) {
    this.iEzsigntemplateformfieldgroupStep = iEzsigntemplateformfieldgroupStep;
  }


  public EzsigntemplateformfieldgroupResponse sEzsigntemplateformfieldgroupDefaultvalue(@javax.annotation.Nullable String sEzsigntemplateformfieldgroupDefaultvalue) {
    this.sEzsigntemplateformfieldgroupDefaultvalue = sEzsigntemplateformfieldgroupDefaultvalue;
    return this;
  }

  /**
   * The default value for the Ezsigntemplateformfieldgroup  You can use the codes below and they will be replaced at signature time.    | Code | Description | Example | | ------------------------- | ------------ | ------------ | | {sUserFirstname} | The first name of the contact | John | | {sUserLastname} | The last name of the contact | Doe | | {sUserJobtitle} | The job title | Sales Representative | | {sEmailAddress} | The email address | email@example.com | | {sPhoneE164} | A phone number in E.164 Format | +15149901516 | | {sPhoneE164Cell} | A phone number in E.164 Format | +15149901516 |
   * @return sEzsigntemplateformfieldgroupDefaultvalue
   */
  @javax.annotation.Nullable
  public String getsEzsigntemplateformfieldgroupDefaultvalue() {
    return sEzsigntemplateformfieldgroupDefaultvalue;
  }

  public void setsEzsigntemplateformfieldgroupDefaultvalue(@javax.annotation.Nullable String sEzsigntemplateformfieldgroupDefaultvalue) {
    this.sEzsigntemplateformfieldgroupDefaultvalue = sEzsigntemplateformfieldgroupDefaultvalue;
  }


  public EzsigntemplateformfieldgroupResponse iEzsigntemplateformfieldgroupFilledmin(@javax.annotation.Nonnull Integer iEzsigntemplateformfieldgroupFilledmin) {
    this.iEzsigntemplateformfieldgroupFilledmin = iEzsigntemplateformfieldgroupFilledmin;
    return this;
  }

  /**
   * The minimum number of Ezsigntemplateformfield that must be filled in the Ezsigntemplateformfieldgroup
   * minimum: 0
   * @return iEzsigntemplateformfieldgroupFilledmin
   */
  @javax.annotation.Nonnull
  public Integer getiEzsigntemplateformfieldgroupFilledmin() {
    return iEzsigntemplateformfieldgroupFilledmin;
  }

  public void setiEzsigntemplateformfieldgroupFilledmin(@javax.annotation.Nonnull Integer iEzsigntemplateformfieldgroupFilledmin) {
    this.iEzsigntemplateformfieldgroupFilledmin = iEzsigntemplateformfieldgroupFilledmin;
  }


  public EzsigntemplateformfieldgroupResponse iEzsigntemplateformfieldgroupFilledmax(@javax.annotation.Nonnull Integer iEzsigntemplateformfieldgroupFilledmax) {
    this.iEzsigntemplateformfieldgroupFilledmax = iEzsigntemplateformfieldgroupFilledmax;
    return this;
  }

  /**
   * The maximum number of Ezsigntemplateformfield that must be filled in the Ezsigntemplateformfieldgroup
   * minimum: 0
   * @return iEzsigntemplateformfieldgroupFilledmax
   */
  @javax.annotation.Nonnull
  public Integer getiEzsigntemplateformfieldgroupFilledmax() {
    return iEzsigntemplateformfieldgroupFilledmax;
  }

  public void setiEzsigntemplateformfieldgroupFilledmax(@javax.annotation.Nonnull Integer iEzsigntemplateformfieldgroupFilledmax) {
    this.iEzsigntemplateformfieldgroupFilledmax = iEzsigntemplateformfieldgroupFilledmax;
  }


  public EzsigntemplateformfieldgroupResponse bEzsigntemplateformfieldgroupReadonly(@javax.annotation.Nonnull Boolean bEzsigntemplateformfieldgroupReadonly) {
    this.bEzsigntemplateformfieldgroupReadonly = bEzsigntemplateformfieldgroupReadonly;
    return this;
  }

  /**
   * Whether the Ezsigntemplateformfieldgroup is read only or not.
   * @return bEzsigntemplateformfieldgroupReadonly
   */
  @javax.annotation.Nonnull
  public Boolean getbEzsigntemplateformfieldgroupReadonly() {
    return bEzsigntemplateformfieldgroupReadonly;
  }

  public void setbEzsigntemplateformfieldgroupReadonly(@javax.annotation.Nonnull Boolean bEzsigntemplateformfieldgroupReadonly) {
    this.bEzsigntemplateformfieldgroupReadonly = bEzsigntemplateformfieldgroupReadonly;
  }


  public EzsigntemplateformfieldgroupResponse iEzsigntemplateformfieldgroupMaxlength(@javax.annotation.Nullable Integer iEzsigntemplateformfieldgroupMaxlength) {
    this.iEzsigntemplateformfieldgroupMaxlength = iEzsigntemplateformfieldgroupMaxlength;
    return this;
  }

  /**
   * The maximum length for the value in the Ezsigntemplateformfieldgroup  This can only be set if eEzsigntemplateformfieldgroupType is **Text** or **Textarea**
   * minimum: 0
   * maximum: 65535
   * @return iEzsigntemplateformfieldgroupMaxlength
   */
  @javax.annotation.Nullable
  public Integer getiEzsigntemplateformfieldgroupMaxlength() {
    return iEzsigntemplateformfieldgroupMaxlength;
  }

  public void setiEzsigntemplateformfieldgroupMaxlength(@javax.annotation.Nullable Integer iEzsigntemplateformfieldgroupMaxlength) {
    this.iEzsigntemplateformfieldgroupMaxlength = iEzsigntemplateformfieldgroupMaxlength;
  }


  public EzsigntemplateformfieldgroupResponse bEzsigntemplateformfieldgroupEncrypted(@javax.annotation.Nullable Boolean bEzsigntemplateformfieldgroupEncrypted) {
    this.bEzsigntemplateformfieldgroupEncrypted = bEzsigntemplateformfieldgroupEncrypted;
    return this;
  }

  /**
   * Whether the Ezsigntemplateformfieldgroup is encrypted in the database or not. Encrypted values are not displayed on the Ezsigndocument. This can only be set if eEzsigntemplateformfieldgroupType is **Text** or **Textarea**
   * @return bEzsigntemplateformfieldgroupEncrypted
   */
  @javax.annotation.Nullable
  public Boolean getbEzsigntemplateformfieldgroupEncrypted() {
    return bEzsigntemplateformfieldgroupEncrypted;
  }

  public void setbEzsigntemplateformfieldgroupEncrypted(@javax.annotation.Nullable Boolean bEzsigntemplateformfieldgroupEncrypted) {
    this.bEzsigntemplateformfieldgroupEncrypted = bEzsigntemplateformfieldgroupEncrypted;
  }


  public EzsigntemplateformfieldgroupResponse sEzsigntemplateformfieldgroupRegexp(@javax.annotation.Nullable String sEzsigntemplateformfieldgroupRegexp) {
    this.sEzsigntemplateformfieldgroupRegexp = sEzsigntemplateformfieldgroupRegexp;
    return this;
  }

  /**
   * A regular expression to indicate what values are acceptable for the Ezsigntemplateformfieldgroup.  This can only be set if eEzsigntemplateformfieldgroupType is **Text** or **Textarea**
   * @return sEzsigntemplateformfieldgroupRegexp
   */
  @javax.annotation.Nullable
  public String getsEzsigntemplateformfieldgroupRegexp() {
    return sEzsigntemplateformfieldgroupRegexp;
  }

  public void setsEzsigntemplateformfieldgroupRegexp(@javax.annotation.Nullable String sEzsigntemplateformfieldgroupRegexp) {
    this.sEzsigntemplateformfieldgroupRegexp = sEzsigntemplateformfieldgroupRegexp;
  }


  public EzsigntemplateformfieldgroupResponse sEzsigntemplateformfieldgroupTextvalidationcustommessage(@javax.annotation.Nullable String sEzsigntemplateformfieldgroupTextvalidationcustommessage) {
    this.sEzsigntemplateformfieldgroupTextvalidationcustommessage = sEzsigntemplateformfieldgroupTextvalidationcustommessage;
    return this;
  }

  /**
   * Description of validation rule. Show by signatory.
   * @return sEzsigntemplateformfieldgroupTextvalidationcustommessage
   */
  @javax.annotation.Nullable
  public String getsEzsigntemplateformfieldgroupTextvalidationcustommessage() {
    return sEzsigntemplateformfieldgroupTextvalidationcustommessage;
  }

  public void setsEzsigntemplateformfieldgroupTextvalidationcustommessage(@javax.annotation.Nullable String sEzsigntemplateformfieldgroupTextvalidationcustommessage) {
    this.sEzsigntemplateformfieldgroupTextvalidationcustommessage = sEzsigntemplateformfieldgroupTextvalidationcustommessage;
  }


  public EzsigntemplateformfieldgroupResponse eEzsigntemplateformfieldgroupTextvalidation(@javax.annotation.Nullable EnumTextvalidation eEzsigntemplateformfieldgroupTextvalidation) {
    this.eEzsigntemplateformfieldgroupTextvalidation = eEzsigntemplateformfieldgroupTextvalidation;
    return this;
  }

  /**
   * Get eEzsigntemplateformfieldgroupTextvalidation
   * @return eEzsigntemplateformfieldgroupTextvalidation
   */
  @javax.annotation.Nullable
  public EnumTextvalidation geteEzsigntemplateformfieldgroupTextvalidation() {
    return eEzsigntemplateformfieldgroupTextvalidation;
  }

  public void seteEzsigntemplateformfieldgroupTextvalidation(@javax.annotation.Nullable EnumTextvalidation eEzsigntemplateformfieldgroupTextvalidation) {
    this.eEzsigntemplateformfieldgroupTextvalidation = eEzsigntemplateformfieldgroupTextvalidation;
  }


  public EzsigntemplateformfieldgroupResponse tEzsigntemplateformfieldgroupTooltip(@javax.annotation.Nullable String tEzsigntemplateformfieldgroupTooltip) {
    this.tEzsigntemplateformfieldgroupTooltip = tEzsigntemplateformfieldgroupTooltip;
    return this;
  }

  /**
   * A tooltip that will be presented to Ezsigntemplatesigner about the Ezsigntemplateformfieldgroup
   * @return tEzsigntemplateformfieldgroupTooltip
   */
  @javax.annotation.Nullable
  public String gettEzsigntemplateformfieldgroupTooltip() {
    return tEzsigntemplateformfieldgroupTooltip;
  }

  public void settEzsigntemplateformfieldgroupTooltip(@javax.annotation.Nullable String tEzsigntemplateformfieldgroupTooltip) {
    this.tEzsigntemplateformfieldgroupTooltip = tEzsigntemplateformfieldgroupTooltip;
  }


  public EzsigntemplateformfieldgroupResponse eEzsigntemplateformfieldgroupTooltipposition(@javax.annotation.Nullable FieldEEzsigntemplateformfieldgroupTooltipposition eEzsigntemplateformfieldgroupTooltipposition) {
    this.eEzsigntemplateformfieldgroupTooltipposition = eEzsigntemplateformfieldgroupTooltipposition;
    return this;
  }

  /**
   * Get eEzsigntemplateformfieldgroupTooltipposition
   * @return eEzsigntemplateformfieldgroupTooltipposition
   */
  @javax.annotation.Nullable
  public FieldEEzsigntemplateformfieldgroupTooltipposition geteEzsigntemplateformfieldgroupTooltipposition() {
    return eEzsigntemplateformfieldgroupTooltipposition;
  }

  public void seteEzsigntemplateformfieldgroupTooltipposition(@javax.annotation.Nullable FieldEEzsigntemplateformfieldgroupTooltipposition eEzsigntemplateformfieldgroupTooltipposition) {
    this.eEzsigntemplateformfieldgroupTooltipposition = eEzsigntemplateformfieldgroupTooltipposition;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsigntemplateformfieldgroupResponse ezsigntemplateformfieldgroupResponse = (EzsigntemplateformfieldgroupResponse) o;
    return Objects.equals(this.pkiEzsigntemplateformfieldgroupID, ezsigntemplateformfieldgroupResponse.pkiEzsigntemplateformfieldgroupID) &&
        Objects.equals(this.fkiEzsigntemplatedocumentID, ezsigntemplateformfieldgroupResponse.fkiEzsigntemplatedocumentID) &&
        Objects.equals(this.eEzsigntemplateformfieldgroupType, ezsigntemplateformfieldgroupResponse.eEzsigntemplateformfieldgroupType) &&
        Objects.equals(this.eEzsigntemplateformfieldgroupSignerrequirement, ezsigntemplateformfieldgroupResponse.eEzsigntemplateformfieldgroupSignerrequirement) &&
        Objects.equals(this.sEzsigntemplateformfieldgroupLabel, ezsigntemplateformfieldgroupResponse.sEzsigntemplateformfieldgroupLabel) &&
        Objects.equals(this.iEzsigntemplateformfieldgroupStep, ezsigntemplateformfieldgroupResponse.iEzsigntemplateformfieldgroupStep) &&
        Objects.equals(this.sEzsigntemplateformfieldgroupDefaultvalue, ezsigntemplateformfieldgroupResponse.sEzsigntemplateformfieldgroupDefaultvalue) &&
        Objects.equals(this.iEzsigntemplateformfieldgroupFilledmin, ezsigntemplateformfieldgroupResponse.iEzsigntemplateformfieldgroupFilledmin) &&
        Objects.equals(this.iEzsigntemplateformfieldgroupFilledmax, ezsigntemplateformfieldgroupResponse.iEzsigntemplateformfieldgroupFilledmax) &&
        Objects.equals(this.bEzsigntemplateformfieldgroupReadonly, ezsigntemplateformfieldgroupResponse.bEzsigntemplateformfieldgroupReadonly) &&
        Objects.equals(this.iEzsigntemplateformfieldgroupMaxlength, ezsigntemplateformfieldgroupResponse.iEzsigntemplateformfieldgroupMaxlength) &&
        Objects.equals(this.bEzsigntemplateformfieldgroupEncrypted, ezsigntemplateformfieldgroupResponse.bEzsigntemplateformfieldgroupEncrypted) &&
        Objects.equals(this.sEzsigntemplateformfieldgroupRegexp, ezsigntemplateformfieldgroupResponse.sEzsigntemplateformfieldgroupRegexp) &&
        Objects.equals(this.sEzsigntemplateformfieldgroupTextvalidationcustommessage, ezsigntemplateformfieldgroupResponse.sEzsigntemplateformfieldgroupTextvalidationcustommessage) &&
        Objects.equals(this.eEzsigntemplateformfieldgroupTextvalidation, ezsigntemplateformfieldgroupResponse.eEzsigntemplateformfieldgroupTextvalidation) &&
        Objects.equals(this.tEzsigntemplateformfieldgroupTooltip, ezsigntemplateformfieldgroupResponse.tEzsigntemplateformfieldgroupTooltip) &&
        Objects.equals(this.eEzsigntemplateformfieldgroupTooltipposition, ezsigntemplateformfieldgroupResponse.eEzsigntemplateformfieldgroupTooltipposition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pkiEzsigntemplateformfieldgroupID, fkiEzsigntemplatedocumentID, eEzsigntemplateformfieldgroupType, eEzsigntemplateformfieldgroupSignerrequirement, sEzsigntemplateformfieldgroupLabel, iEzsigntemplateformfieldgroupStep, sEzsigntemplateformfieldgroupDefaultvalue, iEzsigntemplateformfieldgroupFilledmin, iEzsigntemplateformfieldgroupFilledmax, bEzsigntemplateformfieldgroupReadonly, iEzsigntemplateformfieldgroupMaxlength, bEzsigntemplateformfieldgroupEncrypted, sEzsigntemplateformfieldgroupRegexp, sEzsigntemplateformfieldgroupTextvalidationcustommessage, eEzsigntemplateformfieldgroupTextvalidation, tEzsigntemplateformfieldgroupTooltip, eEzsigntemplateformfieldgroupTooltipposition);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsigntemplateformfieldgroupResponse {\n");
    sb.append("    pkiEzsigntemplateformfieldgroupID: ").append(toIndentedString(pkiEzsigntemplateformfieldgroupID)).append("\n");
    sb.append("    fkiEzsigntemplatedocumentID: ").append(toIndentedString(fkiEzsigntemplatedocumentID)).append("\n");
    sb.append("    eEzsigntemplateformfieldgroupType: ").append(toIndentedString(eEzsigntemplateformfieldgroupType)).append("\n");
    sb.append("    eEzsigntemplateformfieldgroupSignerrequirement: ").append(toIndentedString(eEzsigntemplateformfieldgroupSignerrequirement)).append("\n");
    sb.append("    sEzsigntemplateformfieldgroupLabel: ").append(toIndentedString(sEzsigntemplateformfieldgroupLabel)).append("\n");
    sb.append("    iEzsigntemplateformfieldgroupStep: ").append(toIndentedString(iEzsigntemplateformfieldgroupStep)).append("\n");
    sb.append("    sEzsigntemplateformfieldgroupDefaultvalue: ").append(toIndentedString(sEzsigntemplateformfieldgroupDefaultvalue)).append("\n");
    sb.append("    iEzsigntemplateformfieldgroupFilledmin: ").append(toIndentedString(iEzsigntemplateformfieldgroupFilledmin)).append("\n");
    sb.append("    iEzsigntemplateformfieldgroupFilledmax: ").append(toIndentedString(iEzsigntemplateformfieldgroupFilledmax)).append("\n");
    sb.append("    bEzsigntemplateformfieldgroupReadonly: ").append(toIndentedString(bEzsigntemplateformfieldgroupReadonly)).append("\n");
    sb.append("    iEzsigntemplateformfieldgroupMaxlength: ").append(toIndentedString(iEzsigntemplateformfieldgroupMaxlength)).append("\n");
    sb.append("    bEzsigntemplateformfieldgroupEncrypted: ").append(toIndentedString(bEzsigntemplateformfieldgroupEncrypted)).append("\n");
    sb.append("    sEzsigntemplateformfieldgroupRegexp: ").append(toIndentedString(sEzsigntemplateformfieldgroupRegexp)).append("\n");
    sb.append("    sEzsigntemplateformfieldgroupTextvalidationcustommessage: ").append(toIndentedString(sEzsigntemplateformfieldgroupTextvalidationcustommessage)).append("\n");
    sb.append("    eEzsigntemplateformfieldgroupTextvalidation: ").append(toIndentedString(eEzsigntemplateformfieldgroupTextvalidation)).append("\n");
    sb.append("    tEzsigntemplateformfieldgroupTooltip: ").append(toIndentedString(tEzsigntemplateformfieldgroupTooltip)).append("\n");
    sb.append("    eEzsigntemplateformfieldgroupTooltipposition: ").append(toIndentedString(eEzsigntemplateformfieldgroupTooltipposition)).append("\n");
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
    openapiFields.add("pkiEzsigntemplateformfieldgroupID");
    openapiFields.add("fkiEzsigntemplatedocumentID");
    openapiFields.add("eEzsigntemplateformfieldgroupType");
    openapiFields.add("eEzsigntemplateformfieldgroupSignerrequirement");
    openapiFields.add("sEzsigntemplateformfieldgroupLabel");
    openapiFields.add("iEzsigntemplateformfieldgroupStep");
    openapiFields.add("sEzsigntemplateformfieldgroupDefaultvalue");
    openapiFields.add("iEzsigntemplateformfieldgroupFilledmin");
    openapiFields.add("iEzsigntemplateformfieldgroupFilledmax");
    openapiFields.add("bEzsigntemplateformfieldgroupReadonly");
    openapiFields.add("iEzsigntemplateformfieldgroupMaxlength");
    openapiFields.add("bEzsigntemplateformfieldgroupEncrypted");
    openapiFields.add("sEzsigntemplateformfieldgroupRegexp");
    openapiFields.add("sEzsigntemplateformfieldgroupTextvalidationcustommessage");
    openapiFields.add("eEzsigntemplateformfieldgroupTextvalidation");
    openapiFields.add("tEzsigntemplateformfieldgroupTooltip");
    openapiFields.add("eEzsigntemplateformfieldgroupTooltipposition");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("pkiEzsigntemplateformfieldgroupID");
    openapiRequiredFields.add("fkiEzsigntemplatedocumentID");
    openapiRequiredFields.add("eEzsigntemplateformfieldgroupType");
    openapiRequiredFields.add("sEzsigntemplateformfieldgroupLabel");
    openapiRequiredFields.add("iEzsigntemplateformfieldgroupStep");
    openapiRequiredFields.add("iEzsigntemplateformfieldgroupFilledmin");
    openapiRequiredFields.add("iEzsigntemplateformfieldgroupFilledmax");
    openapiRequiredFields.add("bEzsigntemplateformfieldgroupReadonly");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EzsigntemplateformfieldgroupResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EzsigntemplateformfieldgroupResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EzsigntemplateformfieldgroupResponse is not found in the empty JSON string", EzsigntemplateformfieldgroupResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EzsigntemplateformfieldgroupResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EzsigntemplateformfieldgroupResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EzsigntemplateformfieldgroupResponse.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `eEzsigntemplateformfieldgroupType`
      FieldEEzsigntemplateformfieldgroupType.validateJsonElement(jsonObj.get("eEzsigntemplateformfieldgroupType"));
      // validate the optional field `eEzsigntemplateformfieldgroupSignerrequirement`
      if (jsonObj.get("eEzsigntemplateformfieldgroupSignerrequirement") != null && !jsonObj.get("eEzsigntemplateformfieldgroupSignerrequirement").isJsonNull()) {
        FieldEEzsigntemplateformfieldgroupSignerrequirement.validateJsonElement(jsonObj.get("eEzsigntemplateformfieldgroupSignerrequirement"));
      }
      if (!jsonObj.get("sEzsigntemplateformfieldgroupLabel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sEzsigntemplateformfieldgroupLabel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sEzsigntemplateformfieldgroupLabel").toString()));
      }
      if ((jsonObj.get("sEzsigntemplateformfieldgroupDefaultvalue") != null && !jsonObj.get("sEzsigntemplateformfieldgroupDefaultvalue").isJsonNull()) && !jsonObj.get("sEzsigntemplateformfieldgroupDefaultvalue").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sEzsigntemplateformfieldgroupDefaultvalue` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sEzsigntemplateformfieldgroupDefaultvalue").toString()));
      }
      if ((jsonObj.get("sEzsigntemplateformfieldgroupRegexp") != null && !jsonObj.get("sEzsigntemplateformfieldgroupRegexp").isJsonNull()) && !jsonObj.get("sEzsigntemplateformfieldgroupRegexp").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sEzsigntemplateformfieldgroupRegexp` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sEzsigntemplateformfieldgroupRegexp").toString()));
      }
      if ((jsonObj.get("sEzsigntemplateformfieldgroupTextvalidationcustommessage") != null && !jsonObj.get("sEzsigntemplateformfieldgroupTextvalidationcustommessage").isJsonNull()) && !jsonObj.get("sEzsigntemplateformfieldgroupTextvalidationcustommessage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sEzsigntemplateformfieldgroupTextvalidationcustommessage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sEzsigntemplateformfieldgroupTextvalidationcustommessage").toString()));
      }
      // validate the optional field `eEzsigntemplateformfieldgroupTextvalidation`
      if (jsonObj.get("eEzsigntemplateformfieldgroupTextvalidation") != null && !jsonObj.get("eEzsigntemplateformfieldgroupTextvalidation").isJsonNull()) {
        EnumTextvalidation.validateJsonElement(jsonObj.get("eEzsigntemplateformfieldgroupTextvalidation"));
      }
      if ((jsonObj.get("tEzsigntemplateformfieldgroupTooltip") != null && !jsonObj.get("tEzsigntemplateformfieldgroupTooltip").isJsonNull()) && !jsonObj.get("tEzsigntemplateformfieldgroupTooltip").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tEzsigntemplateformfieldgroupTooltip` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tEzsigntemplateformfieldgroupTooltip").toString()));
      }
      // validate the optional field `eEzsigntemplateformfieldgroupTooltipposition`
      if (jsonObj.get("eEzsigntemplateformfieldgroupTooltipposition") != null && !jsonObj.get("eEzsigntemplateformfieldgroupTooltipposition").isJsonNull()) {
        FieldEEzsigntemplateformfieldgroupTooltipposition.validateJsonElement(jsonObj.get("eEzsigntemplateformfieldgroupTooltipposition"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EzsigntemplateformfieldgroupResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EzsigntemplateformfieldgroupResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EzsigntemplateformfieldgroupResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EzsigntemplateformfieldgroupResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<EzsigntemplateformfieldgroupResponse>() {
           @Override
           public void write(JsonWriter out, EzsigntemplateformfieldgroupResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EzsigntemplateformfieldgroupResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EzsigntemplateformfieldgroupResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EzsigntemplateformfieldgroupResponse
   * @throws IOException if the JSON string is invalid with respect to EzsigntemplateformfieldgroupResponse
   */
  public static EzsigntemplateformfieldgroupResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EzsigntemplateformfieldgroupResponse.class);
  }

  /**
   * Convert an instance of EzsigntemplateformfieldgroupResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

