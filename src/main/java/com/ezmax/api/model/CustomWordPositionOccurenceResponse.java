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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * A Word Position Object
 */
@ApiModel(description = "A Word Position Object")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-07T04:54:07.055439Z[Etc/UTC]")
public class CustomWordPositionOccurenceResponse {
  public static final String SERIALIZED_NAME_I_PAGE = "iPage";
  @SerializedName(SERIALIZED_NAME_I_PAGE)
  private Integer iPage;

  public static final String SERIALIZED_NAME_I_X = "iX";
  @SerializedName(SERIALIZED_NAME_I_X)
  private Integer iX;

  public static final String SERIALIZED_NAME_I_Y = "iY";
  @SerializedName(SERIALIZED_NAME_I_Y)
  private Integer iY;


  public CustomWordPositionOccurenceResponse iPage(Integer iPage) {
    
    this.iPage = iPage;
    return this;
  }

   /**
   * The page where the word occurence was found
   * minimum: 1
   * @return iPage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The page where the word occurence was found")

  public Integer getiPage() {
    return iPage;
  }


  public void setiPage(Integer iPage) {
    this.iPage = iPage;
  }


  public CustomWordPositionOccurenceResponse iX(Integer iX) {
    
    this.iX = iX;
    return this;
  }

   /**
   * The X coordinate (Horizontal) where the Word occurence was found.  Coordinate is calculated at 100dpi (dot per inch).
   * minimum: 0
   * @return iX
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The X coordinate (Horizontal) where the Word occurence was found.  Coordinate is calculated at 100dpi (dot per inch).")

  public Integer getiX() {
    return iX;
  }


  public void setiX(Integer iX) {
    this.iX = iX;
  }


  public CustomWordPositionOccurenceResponse iY(Integer iY) {
    
    this.iY = iY;
    return this;
  }

   /**
   * The Y coordinate (Vertical) where the Word occurence was found.  Coordinate is calculated at 100dpi (dot per inch).
   * minimum: 0
   * @return iY
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Y coordinate (Vertical) where the Word occurence was found.  Coordinate is calculated at 100dpi (dot per inch).")

  public Integer getiY() {
    return iY;
  }


  public void setiY(Integer iY) {
    this.iY = iY;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomWordPositionOccurenceResponse customWordPositionOccurenceResponse = (CustomWordPositionOccurenceResponse) o;
    return Objects.equals(this.iPage, customWordPositionOccurenceResponse.iPage) &&
        Objects.equals(this.iX, customWordPositionOccurenceResponse.iX) &&
        Objects.equals(this.iY, customWordPositionOccurenceResponse.iY);
  }

  @Override
  public int hashCode() {
    return Objects.hash(iPage, iX, iY);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomWordPositionOccurenceResponse {\n");
    sb.append("    iPage: ").append(toIndentedString(iPage)).append("\n");
    sb.append("    iX: ").append(toIndentedString(iX)).append("\n");
    sb.append("    iY: ").append(toIndentedString(iY)).append("\n");
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
