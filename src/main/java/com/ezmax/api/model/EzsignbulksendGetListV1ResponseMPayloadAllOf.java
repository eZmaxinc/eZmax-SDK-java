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
 * EzsignbulksendGetListV1ResponseMPayloadAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-25T20:39:52.064550Z[Etc/UTC]")
public class EzsignbulksendGetListV1ResponseMPayloadAllOf {
  public static final String SERIALIZED_NAME_A_OBJ_EZSIGNFOLDER = "a_objEzsignfolder";
  @SerializedName(SERIALIZED_NAME_A_OBJ_EZSIGNFOLDER)
  private List<EzsignbulksendListElement> aObjEzsignfolder = null;

  public EzsignbulksendGetListV1ResponseMPayloadAllOf() { 
  }

  public EzsignbulksendGetListV1ResponseMPayloadAllOf aObjEzsignfolder(List<EzsignbulksendListElement> aObjEzsignfolder) {
    
    this.aObjEzsignfolder = aObjEzsignfolder;
    return this;
  }

  public EzsignbulksendGetListV1ResponseMPayloadAllOf addAObjEzsignfolderItem(EzsignbulksendListElement aObjEzsignfolderItem) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignbulksendGetListV1ResponseMPayloadAllOf ezsignbulksendGetListV1ResponseMPayloadAllOf = (EzsignbulksendGetListV1ResponseMPayloadAllOf) o;
    return Objects.equals(this.aObjEzsignfolder, ezsignbulksendGetListV1ResponseMPayloadAllOf.aObjEzsignfolder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aObjEzsignfolder);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignbulksendGetListV1ResponseMPayloadAllOf {\n");
    sb.append("    aObjEzsignfolder: ").append(toIndentedString(aObjEzsignfolder)).append("\n");
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
