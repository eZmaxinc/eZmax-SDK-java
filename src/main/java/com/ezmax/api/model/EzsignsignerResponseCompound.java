/*
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.4
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ezmax.api.model;

import java.util.Objects;
import java.util.Arrays;
import com.ezmax.api.model.EzsignsignerResponse;
import com.ezmax.api.model.EzsignsignerResponseCompoundAllOf;
import com.ezmax.api.model.EzsignsignerResponseCompoundContact;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * An Ezsignsigner Object and children to create a complete structure
 */
@ApiModel(description = "An Ezsignsigner Object and children to create a complete structure")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-02T19:25:42.673502Z[Etc/UTC]")
public class EzsignsignerResponseCompound {
  public static final String SERIALIZED_NAME_OBJ_CONTACT = "objContact";
  @SerializedName(SERIALIZED_NAME_OBJ_CONTACT)
  private EzsignsignerResponseCompoundContact objContact;

  public static final String SERIALIZED_NAME_PKI_EZSIGNSIGNER_I_D = "pkiEzsignsignerID";
  @SerializedName(SERIALIZED_NAME_PKI_EZSIGNSIGNER_I_D)
  private Integer pkiEzsignsignerID;

  public static final String SERIALIZED_NAME_FKI_TAXASSIGNMENT_I_D = "fkiTaxassignmentID";
  @SerializedName(SERIALIZED_NAME_FKI_TAXASSIGNMENT_I_D)
  private Integer fkiTaxassignmentID;

  public static final String SERIALIZED_NAME_FKI_SECRETQUESTION_I_D = "fkiSecretquestionID";
  @SerializedName(SERIALIZED_NAME_FKI_SECRETQUESTION_I_D)
  private Integer fkiSecretquestionID;

  public static final String SERIALIZED_NAME_FKI_USERLOGINTYPE_I_D = "fkiUserlogintypeID";
  @SerializedName(SERIALIZED_NAME_FKI_USERLOGINTYPE_I_D)
  private Integer fkiUserlogintypeID;

  public static final String SERIALIZED_NAME_S_USERLOGINTYPE_DESCRIPTION_X = "sUserlogintypeDescriptionX";
  @SerializedName(SERIALIZED_NAME_S_USERLOGINTYPE_DESCRIPTION_X)
  private String sUserlogintypeDescriptionX;

  public EzsignsignerResponseCompound() { 
  }

  public EzsignsignerResponseCompound objContact(EzsignsignerResponseCompoundContact objContact) {
    
    this.objContact = objContact;
    return this;
  }

   /**
   * Get objContact
   * @return objContact
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public EzsignsignerResponseCompoundContact getObjContact() {
    return objContact;
  }


  public void setObjContact(EzsignsignerResponseCompoundContact objContact) {
    this.objContact = objContact;
  }


  public EzsignsignerResponseCompound pkiEzsignsignerID(Integer pkiEzsignsignerID) {
    
    this.pkiEzsignsignerID = pkiEzsignsignerID;
    return this;
  }

   /**
   * The unique ID of the Ezsignsigner
   * @return pkiEzsignsignerID
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "89", required = true, value = "The unique ID of the Ezsignsigner")

  public Integer getPkiEzsignsignerID() {
    return pkiEzsignsignerID;
  }


  public void setPkiEzsignsignerID(Integer pkiEzsignsignerID) {
    this.pkiEzsignsignerID = pkiEzsignsignerID;
  }


  public EzsignsignerResponseCompound fkiTaxassignmentID(Integer fkiTaxassignmentID) {
    
    this.fkiTaxassignmentID = fkiTaxassignmentID;
    return this;
  }

   /**
   * The unique ID of the Taxassignment.  Valid values:  |Value|Description| |-|-| |1|No tax| |2|GST| |3|HST (ON)| |4|HST (NB)| |5|HST (NS)| |6|HST (NL)| |7|HST (PE)| |8|GST + QST (QC)| |9|GST + QST (QC) Non-Recoverable| |10|GST + PST (BC)| |11|GST + PST (SK)| |12|GST + RST (MB)| |13|GST + PST (BC) Non-Recoverable| |14|GST + PST (SK) Non-Recoverable| |15|GST + RST (MB) Non-Recoverable|
   * minimum: 1
   * maximum: 15
   * @return fkiTaxassignmentID
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1", required = true, value = "The unique ID of the Taxassignment.  Valid values:  |Value|Description| |-|-| |1|No tax| |2|GST| |3|HST (ON)| |4|HST (NB)| |5|HST (NS)| |6|HST (NL)| |7|HST (PE)| |8|GST + QST (QC)| |9|GST + QST (QC) Non-Recoverable| |10|GST + PST (BC)| |11|GST + PST (SK)| |12|GST + RST (MB)| |13|GST + PST (BC) Non-Recoverable| |14|GST + PST (SK) Non-Recoverable| |15|GST + RST (MB) Non-Recoverable|")

  public Integer getFkiTaxassignmentID() {
    return fkiTaxassignmentID;
  }


  public void setFkiTaxassignmentID(Integer fkiTaxassignmentID) {
    this.fkiTaxassignmentID = fkiTaxassignmentID;
  }


  public EzsignsignerResponseCompound fkiSecretquestionID(Integer fkiSecretquestionID) {
    
    this.fkiSecretquestionID = fkiSecretquestionID;
    return this;
  }

   /**
   * The unique ID of the Secretquestion.  Valid values:  |Value|Description| |-|-| |1|The name of the hospital in which you were born| |2|The name of your grade school| |3|The last name of your favorite teacher| |4|Your favorite sports team| |5|Your favorite TV show| |6|Your favorite movie| |7|The name of the street on which you grew up| |8|The name of your first employer| |9|Your first car| |10|Your favorite food| |11|The name of your first pet| |12|Favorite musician/band| |13|What instrument you play| |14|Your father&#39;s middle name| |15|Your mother&#39;s maiden name| |16|Name of your eldest child| |17|Your spouse&#39;s middle name| |18|Favorite restaurant| |19|Childhood nickname| |20|Favorite vacation destination| |21|Your boat&#39;s name| |22|Date of Birth (YYYY-MM-DD)|
   * @return fkiSecretquestionID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "7", value = "The unique ID of the Secretquestion.  Valid values:  |Value|Description| |-|-| |1|The name of the hospital in which you were born| |2|The name of your grade school| |3|The last name of your favorite teacher| |4|Your favorite sports team| |5|Your favorite TV show| |6|Your favorite movie| |7|The name of the street on which you grew up| |8|The name of your first employer| |9|Your first car| |10|Your favorite food| |11|The name of your first pet| |12|Favorite musician/band| |13|What instrument you play| |14|Your father's middle name| |15|Your mother's maiden name| |16|Name of your eldest child| |17|Your spouse's middle name| |18|Favorite restaurant| |19|Childhood nickname| |20|Favorite vacation destination| |21|Your boat's name| |22|Date of Birth (YYYY-MM-DD)|")

  public Integer getFkiSecretquestionID() {
    return fkiSecretquestionID;
  }


  public void setFkiSecretquestionID(Integer fkiSecretquestionID) {
    this.fkiSecretquestionID = fkiSecretquestionID;
  }


  public EzsignsignerResponseCompound fkiUserlogintypeID(Integer fkiUserlogintypeID) {
    
    this.fkiUserlogintypeID = fkiUserlogintypeID;
    return this;
  }

   /**
   * The unique ID of the Userlogintype
   * @return fkiUserlogintypeID
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2", required = true, value = "The unique ID of the Userlogintype")

  public Integer getFkiUserlogintypeID() {
    return fkiUserlogintypeID;
  }


  public void setFkiUserlogintypeID(Integer fkiUserlogintypeID) {
    this.fkiUserlogintypeID = fkiUserlogintypeID;
  }


  public EzsignsignerResponseCompound sUserlogintypeDescriptionX(String sUserlogintypeDescriptionX) {
    
    this.sUserlogintypeDescriptionX = sUserlogintypeDescriptionX;
    return this;
  }

   /**
   * The description of the Userlogintype in the language of the requester
   * @return sUserlogintypeDescriptionX
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Email and phone or SMS", required = true, value = "The description of the Userlogintype in the language of the requester")

  public String getsUserlogintypeDescriptionX() {
    return sUserlogintypeDescriptionX;
  }


  public void setsUserlogintypeDescriptionX(String sUserlogintypeDescriptionX) {
    this.sUserlogintypeDescriptionX = sUserlogintypeDescriptionX;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignsignerResponseCompound ezsignsignerResponseCompound = (EzsignsignerResponseCompound) o;
    return Objects.equals(this.objContact, ezsignsignerResponseCompound.objContact) &&
        Objects.equals(this.pkiEzsignsignerID, ezsignsignerResponseCompound.pkiEzsignsignerID) &&
        Objects.equals(this.fkiTaxassignmentID, ezsignsignerResponseCompound.fkiTaxassignmentID) &&
        Objects.equals(this.fkiSecretquestionID, ezsignsignerResponseCompound.fkiSecretquestionID) &&
        Objects.equals(this.fkiUserlogintypeID, ezsignsignerResponseCompound.fkiUserlogintypeID) &&
        Objects.equals(this.sUserlogintypeDescriptionX, ezsignsignerResponseCompound.sUserlogintypeDescriptionX);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objContact, pkiEzsignsignerID, fkiTaxassignmentID, fkiSecretquestionID, fkiUserlogintypeID, sUserlogintypeDescriptionX);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignsignerResponseCompound {\n");
    sb.append("    objContact: ").append(toIndentedString(objContact)).append("\n");
    sb.append("    pkiEzsignsignerID: ").append(toIndentedString(pkiEzsignsignerID)).append("\n");
    sb.append("    fkiTaxassignmentID: ").append(toIndentedString(fkiTaxassignmentID)).append("\n");
    sb.append("    fkiSecretquestionID: ").append(toIndentedString(fkiSecretquestionID)).append("\n");
    sb.append("    fkiUserlogintypeID: ").append(toIndentedString(fkiUserlogintypeID)).append("\n");
    sb.append("    sUserlogintypeDescriptionX: ").append(toIndentedString(sUserlogintypeDescriptionX)).append("\n");
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

}
