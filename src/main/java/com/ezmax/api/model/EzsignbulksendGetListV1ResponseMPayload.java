/*
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.3
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ezmax.api.model;

import java.util.Objects;
import java.util.Arrays;
import com.ezmax.api.model.CommonGetListV1ResponseMPayload;
import com.ezmax.api.model.EzsignbulksendGetListV1ResponseMPayloadAllOf;
import com.ezmax.api.model.EzsignbulksendListElement;
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

/**
 * Payload for the /1/object/ezsignbulksend/getList API Request
 */
@ApiModel(description = "Payload for the /1/object/ezsignbulksend/getList API Request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-25T20:39:52.064550Z[Etc/UTC]")
public class EzsignbulksendGetListV1ResponseMPayload {
  public static final String SERIALIZED_NAME_A_OBJ_EZSIGNFOLDER = "a_objEzsignfolder";
  @SerializedName(SERIALIZED_NAME_A_OBJ_EZSIGNFOLDER)
  private List<EzsignbulksendListElement> aObjEzsignfolder = null;

  public static final String SERIALIZED_NAME_I_ROW_RETURNED = "iRowReturned";
  @SerializedName(SERIALIZED_NAME_I_ROW_RETURNED)
  private Integer iRowReturned;

  public static final String SERIALIZED_NAME_I_ROW_FILTERED = "iRowFiltered";
  @SerializedName(SERIALIZED_NAME_I_ROW_FILTERED)
  private Integer iRowFiltered;

  public EzsignbulksendGetListV1ResponseMPayload() { 
  }

  public EzsignbulksendGetListV1ResponseMPayload aObjEzsignfolder(List<EzsignbulksendListElement> aObjEzsignfolder) {
    
    this.aObjEzsignfolder = aObjEzsignfolder;
    return this;
  }

  public EzsignbulksendGetListV1ResponseMPayload addAObjEzsignfolderItem(EzsignbulksendListElement aObjEzsignfolderItem) {
    if (this.aObjEzsignfolder == null) {
      this.aObjEzsignfolder = new ArrayList<EzsignbulksendListElement>();
    }
    this.aObjEzsignfolder.add(aObjEzsignfolderItem);
    return this;
  }

   /**
   * Get aObjEzsignfolder
   * @return aObjEzsignfolder
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<EzsignbulksendListElement> getaObjEzsignfolder() {
    return aObjEzsignfolder;
  }


  public void setaObjEzsignfolder(List<EzsignbulksendListElement> aObjEzsignfolder) {
    this.aObjEzsignfolder = aObjEzsignfolder;
  }


  public EzsignbulksendGetListV1ResponseMPayload iRowReturned(Integer iRowReturned) {
    
    this.iRowReturned = iRowReturned;
    return this;
  }

   /**
   * The number of rows returned
   * @return iRowReturned
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "100", required = true, value = "The number of rows returned")

  public Integer getiRowReturned() {
    return iRowReturned;
  }


  public void setiRowReturned(Integer iRowReturned) {
    this.iRowReturned = iRowReturned;
  }


  public EzsignbulksendGetListV1ResponseMPayload iRowFiltered(Integer iRowFiltered) {
    
    this.iRowFiltered = iRowFiltered;
    return this;
  }

   /**
   * The number of rows matching your filters (if any) or the total number of rows
   * @return iRowFiltered
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "533", required = true, value = "The number of rows matching your filters (if any) or the total number of rows")

  public Integer getiRowFiltered() {
    return iRowFiltered;
  }


  public void setiRowFiltered(Integer iRowFiltered) {
    this.iRowFiltered = iRowFiltered;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignbulksendGetListV1ResponseMPayload ezsignbulksendGetListV1ResponseMPayload = (EzsignbulksendGetListV1ResponseMPayload) o;
    return Objects.equals(this.aObjEzsignfolder, ezsignbulksendGetListV1ResponseMPayload.aObjEzsignfolder) &&
        Objects.equals(this.iRowReturned, ezsignbulksendGetListV1ResponseMPayload.iRowReturned) &&
        Objects.equals(this.iRowFiltered, ezsignbulksendGetListV1ResponseMPayload.iRowFiltered);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aObjEzsignfolder, iRowReturned, iRowFiltered);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignbulksendGetListV1ResponseMPayload {\n");
    sb.append("    aObjEzsignfolder: ").append(toIndentedString(aObjEzsignfolder)).append("\n");
    sb.append("    iRowReturned: ").append(toIndentedString(iRowReturned)).append("\n");
    sb.append("    iRowFiltered: ").append(toIndentedString(iRowFiltered)).append("\n");
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
