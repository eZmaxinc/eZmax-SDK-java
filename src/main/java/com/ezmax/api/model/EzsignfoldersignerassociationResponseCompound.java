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
import com.ezmax.api.model.EzsignfoldersignerassociationResponse;
import com.ezmax.api.model.EzsignfoldersignerassociationResponseCompoundAllOf;
import com.ezmax.api.model.EzsignfoldersignerassociationResponseCompoundUser;
import com.ezmax.api.model.EzsignsignerResponseCompound;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * An Ezsignfoldersignerassociation Object
 */
@ApiModel(description = "An Ezsignfoldersignerassociation Object")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-02T19:25:42.673502Z[Etc/UTC]")
public class EzsignfoldersignerassociationResponseCompound {
  public static final String SERIALIZED_NAME_OBJ_USER = "objUser";
  @SerializedName(SERIALIZED_NAME_OBJ_USER)
  private EzsignfoldersignerassociationResponseCompoundUser objUser;

  public static final String SERIALIZED_NAME_OBJ_EZSIGNSIGNER = "objEzsignsigner";
  @SerializedName(SERIALIZED_NAME_OBJ_EZSIGNSIGNER)
  private EzsignsignerResponseCompound objEzsignsigner;

  public static final String SERIALIZED_NAME_PKI_EZSIGNFOLDERSIGNERASSOCIATION_I_D = "pkiEzsignfoldersignerassociationID";
  @SerializedName(SERIALIZED_NAME_PKI_EZSIGNFOLDERSIGNERASSOCIATION_I_D)
  private Integer pkiEzsignfoldersignerassociationID;

  public static final String SERIALIZED_NAME_FKI_EZSIGNFOLDER_I_D = "fkiEzsignfolderID";
  @SerializedName(SERIALIZED_NAME_FKI_EZSIGNFOLDER_I_D)
  private Integer fkiEzsignfolderID;

  public static final String SERIALIZED_NAME_B_EZSIGNFOLDERSIGNERASSOCIATION_RECEIVECOPY = "bEzsignfoldersignerassociationReceivecopy";
  @SerializedName(SERIALIZED_NAME_B_EZSIGNFOLDERSIGNERASSOCIATION_RECEIVECOPY)
  private Boolean bEzsignfoldersignerassociationReceivecopy;

  public EzsignfoldersignerassociationResponseCompound() { 
  }

  public EzsignfoldersignerassociationResponseCompound objUser(EzsignfoldersignerassociationResponseCompoundUser objUser) {
    
    this.objUser = objUser;
    return this;
  }

   /**
   * Get objUser
   * @return objUser
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EzsignfoldersignerassociationResponseCompoundUser getObjUser() {
    return objUser;
  }


  public void setObjUser(EzsignfoldersignerassociationResponseCompoundUser objUser) {
    this.objUser = objUser;
  }


  public EzsignfoldersignerassociationResponseCompound objEzsignsigner(EzsignsignerResponseCompound objEzsignsigner) {
    
    this.objEzsignsigner = objEzsignsigner;
    return this;
  }

   /**
   * Get objEzsignsigner
   * @return objEzsignsigner
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EzsignsignerResponseCompound getObjEzsignsigner() {
    return objEzsignsigner;
  }


  public void setObjEzsignsigner(EzsignsignerResponseCompound objEzsignsigner) {
    this.objEzsignsigner = objEzsignsigner;
  }


  public EzsignfoldersignerassociationResponseCompound pkiEzsignfoldersignerassociationID(Integer pkiEzsignfoldersignerassociationID) {
    
    this.pkiEzsignfoldersignerassociationID = pkiEzsignfoldersignerassociationID;
    return this;
  }

   /**
   * The unique ID of the Ezsignfoldersignerassociation
   * @return pkiEzsignfoldersignerassociationID
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "20", required = true, value = "The unique ID of the Ezsignfoldersignerassociation")

  public Integer getPkiEzsignfoldersignerassociationID() {
    return pkiEzsignfoldersignerassociationID;
  }


  public void setPkiEzsignfoldersignerassociationID(Integer pkiEzsignfoldersignerassociationID) {
    this.pkiEzsignfoldersignerassociationID = pkiEzsignfoldersignerassociationID;
  }


  public EzsignfoldersignerassociationResponseCompound fkiEzsignfolderID(Integer fkiEzsignfolderID) {
    
    this.fkiEzsignfolderID = fkiEzsignfolderID;
    return this;
  }

   /**
   * The unique ID of the Ezsignfolder
   * @return fkiEzsignfolderID
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "33", required = true, value = "The unique ID of the Ezsignfolder")

  public Integer getFkiEzsignfolderID() {
    return fkiEzsignfolderID;
  }


  public void setFkiEzsignfolderID(Integer fkiEzsignfolderID) {
    this.fkiEzsignfolderID = fkiEzsignfolderID;
  }


  public EzsignfoldersignerassociationResponseCompound bEzsignfoldersignerassociationReceivecopy(Boolean bEzsignfoldersignerassociationReceivecopy) {
    
    this.bEzsignfoldersignerassociationReceivecopy = bEzsignfoldersignerassociationReceivecopy;
    return this;
  }

   /**
   * If this flag is true. The signatory will receive a copy of every signed Ezsigndocument even if it ain&#39;t required to sign the document.
   * @return bEzsignfoldersignerassociationReceivecopy
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "If this flag is true. The signatory will receive a copy of every signed Ezsigndocument even if it ain't required to sign the document.")

  public Boolean getbEzsignfoldersignerassociationReceivecopy() {
    return bEzsignfoldersignerassociationReceivecopy;
  }


  public void setbEzsignfoldersignerassociationReceivecopy(Boolean bEzsignfoldersignerassociationReceivecopy) {
    this.bEzsignfoldersignerassociationReceivecopy = bEzsignfoldersignerassociationReceivecopy;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignfoldersignerassociationResponseCompound ezsignfoldersignerassociationResponseCompound = (EzsignfoldersignerassociationResponseCompound) o;
    return Objects.equals(this.objUser, ezsignfoldersignerassociationResponseCompound.objUser) &&
        Objects.equals(this.objEzsignsigner, ezsignfoldersignerassociationResponseCompound.objEzsignsigner) &&
        Objects.equals(this.pkiEzsignfoldersignerassociationID, ezsignfoldersignerassociationResponseCompound.pkiEzsignfoldersignerassociationID) &&
        Objects.equals(this.fkiEzsignfolderID, ezsignfoldersignerassociationResponseCompound.fkiEzsignfolderID) &&
        Objects.equals(this.bEzsignfoldersignerassociationReceivecopy, ezsignfoldersignerassociationResponseCompound.bEzsignfoldersignerassociationReceivecopy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objUser, objEzsignsigner, pkiEzsignfoldersignerassociationID, fkiEzsignfolderID, bEzsignfoldersignerassociationReceivecopy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignfoldersignerassociationResponseCompound {\n");
    sb.append("    objUser: ").append(toIndentedString(objUser)).append("\n");
    sb.append("    objEzsignsigner: ").append(toIndentedString(objEzsignsigner)).append("\n");
    sb.append("    pkiEzsignfoldersignerassociationID: ").append(toIndentedString(pkiEzsignfoldersignerassociationID)).append("\n");
    sb.append("    fkiEzsignfolderID: ").append(toIndentedString(fkiEzsignfolderID)).append("\n");
    sb.append("    bEzsignfoldersignerassociationReceivecopy: ").append(toIndentedString(bEzsignfoldersignerassociationReceivecopy)).append("\n");
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
