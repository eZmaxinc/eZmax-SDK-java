/*
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.0
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ezmax.api.model;

import java.util.Objects;
import java.util.Arrays;
import com.ezmax.api.model.EzsignformfieldResponse;
import com.ezmax.api.model.EzsignformfieldgroupResponse;
import com.ezmax.api.model.EzsignformfieldgroupResponseCompoundAllOf;
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
 * An Ezsignformfieldgroup Object and children to create a complete structure
 */
@ApiModel(description = "An Ezsignformfieldgroup Object and children to create a complete structure")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-07T04:54:07.055439Z[Etc/UTC]")
public class EzsignformfieldgroupResponseCompound {
  public static final String SERIALIZED_NAME_S_EZSIGNFORMFIELDGROUP_LABEL = "sEzsignformfieldgroupLabel";
  @SerializedName(SERIALIZED_NAME_S_EZSIGNFORMFIELDGROUP_LABEL)
  private String sEzsignformfieldgroupLabel;

  public static final String SERIALIZED_NAME_A_OBJ_EZSIGNFORMFIELD = "a_objEzsignformfield";
  @SerializedName(SERIALIZED_NAME_A_OBJ_EZSIGNFORMFIELD)
  private List<EzsignformfieldResponse> aObjEzsignformfield = new ArrayList<EzsignformfieldResponse>();


  public EzsignformfieldgroupResponseCompound sEzsignformfieldgroupLabel(String sEzsignformfieldgroupLabel) {
    
    this.sEzsignformfieldgroupLabel = sEzsignformfieldgroupLabel;
    return this;
  }

   /**
   * The Label for the Ezsignformfieldgroup
   * @return sEzsignformfieldgroupLabel
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Allergies", required = true, value = "The Label for the Ezsignformfieldgroup")

  public String getsEzsignformfieldgroupLabel() {
    return sEzsignformfieldgroupLabel;
  }


  public void setsEzsignformfieldgroupLabel(String sEzsignformfieldgroupLabel) {
    this.sEzsignformfieldgroupLabel = sEzsignformfieldgroupLabel;
  }


  public EzsignformfieldgroupResponseCompound aObjEzsignformfield(List<EzsignformfieldResponse> aObjEzsignformfield) {
    
    this.aObjEzsignformfield = aObjEzsignformfield;
    return this;
  }

  public EzsignformfieldgroupResponseCompound addAObjEzsignformfieldItem(EzsignformfieldResponse aObjEzsignformfieldItem) {
    this.aObjEzsignformfield.add(aObjEzsignformfieldItem);
    return this;
  }

   /**
   * Get aObjEzsignformfield
   * @return aObjEzsignformfield
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<EzsignformfieldResponse> getaObjEzsignformfield() {
    return aObjEzsignformfield;
  }


  public void setaObjEzsignformfield(List<EzsignformfieldResponse> aObjEzsignformfield) {
    this.aObjEzsignformfield = aObjEzsignformfield;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignformfieldgroupResponseCompound ezsignformfieldgroupResponseCompound = (EzsignformfieldgroupResponseCompound) o;
    return Objects.equals(this.sEzsignformfieldgroupLabel, ezsignformfieldgroupResponseCompound.sEzsignformfieldgroupLabel) &&
        Objects.equals(this.aObjEzsignformfield, ezsignformfieldgroupResponseCompound.aObjEzsignformfield);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sEzsignformfieldgroupLabel, aObjEzsignformfield);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignformfieldgroupResponseCompound {\n");
    sb.append("    sEzsignformfieldgroupLabel: ").append(toIndentedString(sEzsignformfieldgroupLabel)).append("\n");
    sb.append("    aObjEzsignformfield: ").append(toIndentedString(aObjEzsignformfield)).append("\n");
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
