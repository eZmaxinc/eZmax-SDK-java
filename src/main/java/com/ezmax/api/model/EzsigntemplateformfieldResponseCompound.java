/*
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.2.0
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ezmax.api.model;

import java.util.Objects;
import com.ezmax.api.model.EzsigntemplateelementdependencyResponseCompound;
import com.ezmax.api.model.FieldEEzsigntemplateformfieldDependencyrequirement;
import com.ezmax.api.model.FieldEEzsigntemplateformfieldPositioning;
import com.ezmax.api.model.FieldEEzsigntemplateformfieldPositioningoccurence;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import eZmaxAPI.JSON;

/**
 * An Ezsigntemplateformfield Object and children
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-14T20:13:03.553513468Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class EzsigntemplateformfieldResponseCompound {
  public static final String SERIALIZED_NAME_PKI_EZSIGNTEMPLATEFORMFIELD_I_D = "pkiEzsigntemplateformfieldID";
  @SerializedName(SERIALIZED_NAME_PKI_EZSIGNTEMPLATEFORMFIELD_I_D)
  private Integer pkiEzsigntemplateformfieldID;

  public static final String SERIALIZED_NAME_E_EZSIGNTEMPLATEFORMFIELD_POSITIONING = "eEzsigntemplateformfieldPositioning";
  @SerializedName(SERIALIZED_NAME_E_EZSIGNTEMPLATEFORMFIELD_POSITIONING)
  private FieldEEzsigntemplateformfieldPositioning eEzsigntemplateformfieldPositioning = FieldEEzsigntemplateformfieldPositioning.PERCOORDINATES;

  public static final String SERIALIZED_NAME_I_EZSIGNTEMPLATEDOCUMENTPAGE_PAGENUMBER = "iEzsigntemplatedocumentpagePagenumber";
  @SerializedName(SERIALIZED_NAME_I_EZSIGNTEMPLATEDOCUMENTPAGE_PAGENUMBER)
  private Integer iEzsigntemplatedocumentpagePagenumber;

  public static final String SERIALIZED_NAME_S_EZSIGNTEMPLATEFORMFIELD_LABEL = "sEzsigntemplateformfieldLabel";
  @SerializedName(SERIALIZED_NAME_S_EZSIGNTEMPLATEFORMFIELD_LABEL)
  private String sEzsigntemplateformfieldLabel;

  public static final String SERIALIZED_NAME_S_EZSIGNTEMPLATEFORMFIELD_VALUE = "sEzsigntemplateformfieldValue";
  @SerializedName(SERIALIZED_NAME_S_EZSIGNTEMPLATEFORMFIELD_VALUE)
  private String sEzsigntemplateformfieldValue;

  public static final String SERIALIZED_NAME_I_EZSIGNTEMPLATEFORMFIELD_X = "iEzsigntemplateformfieldX";
  @SerializedName(SERIALIZED_NAME_I_EZSIGNTEMPLATEFORMFIELD_X)
  private Integer iEzsigntemplateformfieldX;

  public static final String SERIALIZED_NAME_I_EZSIGNTEMPLATEFORMFIELD_Y = "iEzsigntemplateformfieldY";
  @SerializedName(SERIALIZED_NAME_I_EZSIGNTEMPLATEFORMFIELD_Y)
  private Integer iEzsigntemplateformfieldY;

  public static final String SERIALIZED_NAME_I_EZSIGNTEMPLATEFORMFIELD_WIDTH = "iEzsigntemplateformfieldWidth";
  @SerializedName(SERIALIZED_NAME_I_EZSIGNTEMPLATEFORMFIELD_WIDTH)
  private Integer iEzsigntemplateformfieldWidth;

  public static final String SERIALIZED_NAME_I_EZSIGNTEMPLATEFORMFIELD_HEIGHT = "iEzsigntemplateformfieldHeight";
  @SerializedName(SERIALIZED_NAME_I_EZSIGNTEMPLATEFORMFIELD_HEIGHT)
  private Integer iEzsigntemplateformfieldHeight;

  public static final String SERIALIZED_NAME_B_EZSIGNTEMPLATEFORMFIELD_AUTOCOMPLETE = "bEzsigntemplateformfieldAutocomplete";
  @SerializedName(SERIALIZED_NAME_B_EZSIGNTEMPLATEFORMFIELD_AUTOCOMPLETE)
  private Boolean bEzsigntemplateformfieldAutocomplete;

  public static final String SERIALIZED_NAME_B_EZSIGNTEMPLATEFORMFIELD_SELECTED = "bEzsigntemplateformfieldSelected";
  @SerializedName(SERIALIZED_NAME_B_EZSIGNTEMPLATEFORMFIELD_SELECTED)
  private Boolean bEzsigntemplateformfieldSelected;

  public static final String SERIALIZED_NAME_E_EZSIGNTEMPLATEFORMFIELD_DEPENDENCYREQUIREMENT = "eEzsigntemplateformfieldDependencyrequirement";
  @SerializedName(SERIALIZED_NAME_E_EZSIGNTEMPLATEFORMFIELD_DEPENDENCYREQUIREMENT)
  private FieldEEzsigntemplateformfieldDependencyrequirement eEzsigntemplateformfieldDependencyrequirement;

  public static final String SERIALIZED_NAME_S_EZSIGNTEMPLATEFORMFIELD_POSITIONINGPATTERN = "sEzsigntemplateformfieldPositioningpattern";
  @SerializedName(SERIALIZED_NAME_S_EZSIGNTEMPLATEFORMFIELD_POSITIONINGPATTERN)
  private String sEzsigntemplateformfieldPositioningpattern;

  public static final String SERIALIZED_NAME_I_EZSIGNTEMPLATEFORMFIELD_POSITIONINGOFFSETX = "iEzsigntemplateformfieldPositioningoffsetx";
  @SerializedName(SERIALIZED_NAME_I_EZSIGNTEMPLATEFORMFIELD_POSITIONINGOFFSETX)
  private Integer iEzsigntemplateformfieldPositioningoffsetx;

  public static final String SERIALIZED_NAME_I_EZSIGNTEMPLATEFORMFIELD_POSITIONINGOFFSETY = "iEzsigntemplateformfieldPositioningoffsety";
  @SerializedName(SERIALIZED_NAME_I_EZSIGNTEMPLATEFORMFIELD_POSITIONINGOFFSETY)
  private Integer iEzsigntemplateformfieldPositioningoffsety;

  public static final String SERIALIZED_NAME_E_EZSIGNTEMPLATEFORMFIELD_POSITIONINGOCCURENCE = "eEzsigntemplateformfieldPositioningoccurence";
  @SerializedName(SERIALIZED_NAME_E_EZSIGNTEMPLATEFORMFIELD_POSITIONINGOCCURENCE)
  private FieldEEzsigntemplateformfieldPositioningoccurence eEzsigntemplateformfieldPositioningoccurence;

  public static final String SERIALIZED_NAME_A_OBJ_EZSIGNTEMPLATEELEMENTDEPENDENCY = "a_objEzsigntemplateelementdependency";
  @SerializedName(SERIALIZED_NAME_A_OBJ_EZSIGNTEMPLATEELEMENTDEPENDENCY)
  private List<EzsigntemplateelementdependencyResponseCompound> aObjEzsigntemplateelementdependency;

  public EzsigntemplateformfieldResponseCompound() {
  }

  public EzsigntemplateformfieldResponseCompound pkiEzsigntemplateformfieldID(Integer pkiEzsigntemplateformfieldID) {
    this.pkiEzsigntemplateformfieldID = pkiEzsigntemplateformfieldID;
    return this;
  }

   /**
   * The unique ID of the Ezsigntemplateformfield
   * minimum: 0
   * @return pkiEzsigntemplateformfieldID
  **/
  @javax.annotation.Nonnull
  public Integer getPkiEzsigntemplateformfieldID() {
    return pkiEzsigntemplateformfieldID;
  }

  public void setPkiEzsigntemplateformfieldID(Integer pkiEzsigntemplateformfieldID) {
    this.pkiEzsigntemplateformfieldID = pkiEzsigntemplateformfieldID;
  }


  public EzsigntemplateformfieldResponseCompound eEzsigntemplateformfieldPositioning(FieldEEzsigntemplateformfieldPositioning eEzsigntemplateformfieldPositioning) {
    this.eEzsigntemplateformfieldPositioning = eEzsigntemplateformfieldPositioning;
    return this;
  }

   /**
   * Get eEzsigntemplateformfieldPositioning
   * @return eEzsigntemplateformfieldPositioning
  **/
  @javax.annotation.Nullable
  public FieldEEzsigntemplateformfieldPositioning geteEzsigntemplateformfieldPositioning() {
    return eEzsigntemplateformfieldPositioning;
  }

  public void seteEzsigntemplateformfieldPositioning(FieldEEzsigntemplateformfieldPositioning eEzsigntemplateformfieldPositioning) {
    this.eEzsigntemplateformfieldPositioning = eEzsigntemplateformfieldPositioning;
  }


  public EzsigntemplateformfieldResponseCompound iEzsigntemplatedocumentpagePagenumber(Integer iEzsigntemplatedocumentpagePagenumber) {
    this.iEzsigntemplatedocumentpagePagenumber = iEzsigntemplatedocumentpagePagenumber;
    return this;
  }

   /**
   * The page number in the Ezsigntemplatedocument
   * minimum: 1
   * @return iEzsigntemplatedocumentpagePagenumber
  **/
  @javax.annotation.Nonnull
  public Integer getiEzsigntemplatedocumentpagePagenumber() {
    return iEzsigntemplatedocumentpagePagenumber;
  }

  public void setiEzsigntemplatedocumentpagePagenumber(Integer iEzsigntemplatedocumentpagePagenumber) {
    this.iEzsigntemplatedocumentpagePagenumber = iEzsigntemplatedocumentpagePagenumber;
  }


  public EzsigntemplateformfieldResponseCompound sEzsigntemplateformfieldLabel(String sEzsigntemplateformfieldLabel) {
    this.sEzsigntemplateformfieldLabel = sEzsigntemplateformfieldLabel;
    return this;
  }

   /**
   * The Label for the Ezsigntemplateformfield
   * @return sEzsigntemplateformfieldLabel
  **/
  @javax.annotation.Nonnull
  public String getsEzsigntemplateformfieldLabel() {
    return sEzsigntemplateformfieldLabel;
  }

  public void setsEzsigntemplateformfieldLabel(String sEzsigntemplateformfieldLabel) {
    this.sEzsigntemplateformfieldLabel = sEzsigntemplateformfieldLabel;
  }


  public EzsigntemplateformfieldResponseCompound sEzsigntemplateformfieldValue(String sEzsigntemplateformfieldValue) {
    this.sEzsigntemplateformfieldValue = sEzsigntemplateformfieldValue;
    return this;
  }

   /**
   * The value for the Ezsigntemplateformfield
   * @return sEzsigntemplateformfieldValue
  **/
  @javax.annotation.Nullable
  public String getsEzsigntemplateformfieldValue() {
    return sEzsigntemplateformfieldValue;
  }

  public void setsEzsigntemplateformfieldValue(String sEzsigntemplateformfieldValue) {
    this.sEzsigntemplateformfieldValue = sEzsigntemplateformfieldValue;
  }


  public EzsigntemplateformfieldResponseCompound iEzsigntemplateformfieldX(Integer iEzsigntemplateformfieldX) {
    this.iEzsigntemplateformfieldX = iEzsigntemplateformfieldX;
    return this;
  }

   /**
   * The X coordinate (Horizontal) where to put the Ezsigntemplateformfield on the Ezsigntemplatepage.  Coordinate is calculated at 100dpi (dot per inch). So for example, if you want to put the Ezsigntemplateformfield 2 inches from the left border of the page, you would use \&quot;200\&quot; for the X coordinate.
   * minimum: 0
   * @return iEzsigntemplateformfieldX
  **/
  @javax.annotation.Nullable
  public Integer getiEzsigntemplateformfieldX() {
    return iEzsigntemplateformfieldX;
  }

  public void setiEzsigntemplateformfieldX(Integer iEzsigntemplateformfieldX) {
    this.iEzsigntemplateformfieldX = iEzsigntemplateformfieldX;
  }


  public EzsigntemplateformfieldResponseCompound iEzsigntemplateformfieldY(Integer iEzsigntemplateformfieldY) {
    this.iEzsigntemplateformfieldY = iEzsigntemplateformfieldY;
    return this;
  }

   /**
   * The Y coordinate (Vertical) where to put the Ezsigntemplateformfield on the Ezsigntemplatepage.  Coordinate is calculated at 100dpi (dot per inch). So for example, if you want to put the Ezsigntemplateformfield 3 inches from the top border of the page, you would use \&quot;300\&quot; for the Y coordinate.
   * minimum: 0
   * @return iEzsigntemplateformfieldY
  **/
  @javax.annotation.Nullable
  public Integer getiEzsigntemplateformfieldY() {
    return iEzsigntemplateformfieldY;
  }

  public void setiEzsigntemplateformfieldY(Integer iEzsigntemplateformfieldY) {
    this.iEzsigntemplateformfieldY = iEzsigntemplateformfieldY;
  }


  public EzsigntemplateformfieldResponseCompound iEzsigntemplateformfieldWidth(Integer iEzsigntemplateformfieldWidth) {
    this.iEzsigntemplateformfieldWidth = iEzsigntemplateformfieldWidth;
    return this;
  }

   /**
   * The Width of the Ezsigntemplateformfield in pixels calculated at 100 DPI  The allowed values are varying based on the eEzsigntemplateformfieldgroupType.  | eEzsigntemplateformfieldgroupType | Valid values | | ------------------------- | ------------ | | Checkbox                  | 22           | | Dropdown                  | 22-65535     | | Radio                     | 22           | | Text                      | 22-65535     | | Textarea                  | 22-65535     |
   * minimum: 0
   * @return iEzsigntemplateformfieldWidth
  **/
  @javax.annotation.Nonnull
  public Integer getiEzsigntemplateformfieldWidth() {
    return iEzsigntemplateformfieldWidth;
  }

  public void setiEzsigntemplateformfieldWidth(Integer iEzsigntemplateformfieldWidth) {
    this.iEzsigntemplateformfieldWidth = iEzsigntemplateformfieldWidth;
  }


  public EzsigntemplateformfieldResponseCompound iEzsigntemplateformfieldHeight(Integer iEzsigntemplateformfieldHeight) {
    this.iEzsigntemplateformfieldHeight = iEzsigntemplateformfieldHeight;
    return this;
  }

   /**
   * The Height of the Ezsigntemplateformfield in pixels calculated at 100 DPI  The allowed values are varying based on the eEzsigntemplateformfieldgroupType.  | eEzsigntemplateformfieldgroupType | Valid values | | ------------------------- | ------------ | | Checkbox                  | 22           | | Dropdown                  | 22           | | Radio                     | 22           | | Text                      | 22           | | Textarea                  | 22-65535     | 
   * minimum: 0
   * @return iEzsigntemplateformfieldHeight
  **/
  @javax.annotation.Nonnull
  public Integer getiEzsigntemplateformfieldHeight() {
    return iEzsigntemplateformfieldHeight;
  }

  public void setiEzsigntemplateformfieldHeight(Integer iEzsigntemplateformfieldHeight) {
    this.iEzsigntemplateformfieldHeight = iEzsigntemplateformfieldHeight;
  }


  public EzsigntemplateformfieldResponseCompound bEzsigntemplateformfieldAutocomplete(Boolean bEzsigntemplateformfieldAutocomplete) {
    this.bEzsigntemplateformfieldAutocomplete = bEzsigntemplateformfieldAutocomplete;
    return this;
  }

   /**
   * Whether the Ezsigntemplateformfield allows the use of the autocomplete of the browser.  This can only be set if eEzsigntemplateformfieldgroupType is **Text**
   * @return bEzsigntemplateformfieldAutocomplete
  **/
  @javax.annotation.Nullable
  public Boolean getbEzsigntemplateformfieldAutocomplete() {
    return bEzsigntemplateformfieldAutocomplete;
  }

  public void setbEzsigntemplateformfieldAutocomplete(Boolean bEzsigntemplateformfieldAutocomplete) {
    this.bEzsigntemplateformfieldAutocomplete = bEzsigntemplateformfieldAutocomplete;
  }


  public EzsigntemplateformfieldResponseCompound bEzsigntemplateformfieldSelected(Boolean bEzsigntemplateformfieldSelected) {
    this.bEzsigntemplateformfieldSelected = bEzsigntemplateformfieldSelected;
    return this;
  }

   /**
   * Whether the Ezsigntemplateformfield is selected or not by default.  This can only be set if eEzsigntemplateformfieldgroupType is **Checkbox** or **Radio**
   * @return bEzsigntemplateformfieldSelected
  **/
  @javax.annotation.Nullable
  public Boolean getbEzsigntemplateformfieldSelected() {
    return bEzsigntemplateformfieldSelected;
  }

  public void setbEzsigntemplateformfieldSelected(Boolean bEzsigntemplateformfieldSelected) {
    this.bEzsigntemplateformfieldSelected = bEzsigntemplateformfieldSelected;
  }


  public EzsigntemplateformfieldResponseCompound eEzsigntemplateformfieldDependencyrequirement(FieldEEzsigntemplateformfieldDependencyrequirement eEzsigntemplateformfieldDependencyrequirement) {
    this.eEzsigntemplateformfieldDependencyrequirement = eEzsigntemplateformfieldDependencyrequirement;
    return this;
  }

   /**
   * Get eEzsigntemplateformfieldDependencyrequirement
   * @return eEzsigntemplateformfieldDependencyrequirement
  **/
  @javax.annotation.Nullable
  public FieldEEzsigntemplateformfieldDependencyrequirement geteEzsigntemplateformfieldDependencyrequirement() {
    return eEzsigntemplateformfieldDependencyrequirement;
  }

  public void seteEzsigntemplateformfieldDependencyrequirement(FieldEEzsigntemplateformfieldDependencyrequirement eEzsigntemplateformfieldDependencyrequirement) {
    this.eEzsigntemplateformfieldDependencyrequirement = eEzsigntemplateformfieldDependencyrequirement;
  }


  public EzsigntemplateformfieldResponseCompound sEzsigntemplateformfieldPositioningpattern(String sEzsigntemplateformfieldPositioningpattern) {
    this.sEzsigntemplateformfieldPositioningpattern = sEzsigntemplateformfieldPositioningpattern;
    return this;
  }

   /**
   * The string pattern to search for the positioning. **This is not a regexp**  This will be required if **eEzsigntemplateformfieldPositioning** is set to **PerCoordinates**
   * @return sEzsigntemplateformfieldPositioningpattern
  **/
  @javax.annotation.Nullable
  public String getsEzsigntemplateformfieldPositioningpattern() {
    return sEzsigntemplateformfieldPositioningpattern;
  }

  public void setsEzsigntemplateformfieldPositioningpattern(String sEzsigntemplateformfieldPositioningpattern) {
    this.sEzsigntemplateformfieldPositioningpattern = sEzsigntemplateformfieldPositioningpattern;
  }


  public EzsigntemplateformfieldResponseCompound iEzsigntemplateformfieldPositioningoffsetx(Integer iEzsigntemplateformfieldPositioningoffsetx) {
    this.iEzsigntemplateformfieldPositioningoffsetx = iEzsigntemplateformfieldPositioningoffsetx;
    return this;
  }

   /**
   * The offset X  This will be required if **eEzsigntemplateformfieldPositioning** is set to **PerCoordinates**
   * @return iEzsigntemplateformfieldPositioningoffsetx
  **/
  @javax.annotation.Nullable
  public Integer getiEzsigntemplateformfieldPositioningoffsetx() {
    return iEzsigntemplateformfieldPositioningoffsetx;
  }

  public void setiEzsigntemplateformfieldPositioningoffsetx(Integer iEzsigntemplateformfieldPositioningoffsetx) {
    this.iEzsigntemplateformfieldPositioningoffsetx = iEzsigntemplateformfieldPositioningoffsetx;
  }


  public EzsigntemplateformfieldResponseCompound iEzsigntemplateformfieldPositioningoffsety(Integer iEzsigntemplateformfieldPositioningoffsety) {
    this.iEzsigntemplateformfieldPositioningoffsety = iEzsigntemplateformfieldPositioningoffsety;
    return this;
  }

   /**
   * The offset Y  This will be required if **eEzsigntemplateformfieldPositioning** is set to **PerCoordinates**
   * @return iEzsigntemplateformfieldPositioningoffsety
  **/
  @javax.annotation.Nullable
  public Integer getiEzsigntemplateformfieldPositioningoffsety() {
    return iEzsigntemplateformfieldPositioningoffsety;
  }

  public void setiEzsigntemplateformfieldPositioningoffsety(Integer iEzsigntemplateformfieldPositioningoffsety) {
    this.iEzsigntemplateformfieldPositioningoffsety = iEzsigntemplateformfieldPositioningoffsety;
  }


  public EzsigntemplateformfieldResponseCompound eEzsigntemplateformfieldPositioningoccurence(FieldEEzsigntemplateformfieldPositioningoccurence eEzsigntemplateformfieldPositioningoccurence) {
    this.eEzsigntemplateformfieldPositioningoccurence = eEzsigntemplateformfieldPositioningoccurence;
    return this;
  }

   /**
   * Get eEzsigntemplateformfieldPositioningoccurence
   * @return eEzsigntemplateformfieldPositioningoccurence
  **/
  @javax.annotation.Nullable
  public FieldEEzsigntemplateformfieldPositioningoccurence geteEzsigntemplateformfieldPositioningoccurence() {
    return eEzsigntemplateformfieldPositioningoccurence;
  }

  public void seteEzsigntemplateformfieldPositioningoccurence(FieldEEzsigntemplateformfieldPositioningoccurence eEzsigntemplateformfieldPositioningoccurence) {
    this.eEzsigntemplateformfieldPositioningoccurence = eEzsigntemplateformfieldPositioningoccurence;
  }


  public EzsigntemplateformfieldResponseCompound aObjEzsigntemplateelementdependency(List<EzsigntemplateelementdependencyResponseCompound> aObjEzsigntemplateelementdependency) {
    this.aObjEzsigntemplateelementdependency = aObjEzsigntemplateelementdependency;
    return this;
  }

  public EzsigntemplateformfieldResponseCompound addAObjEzsigntemplateelementdependencyItem(EzsigntemplateelementdependencyResponseCompound aObjEzsigntemplateelementdependencyItem) {
    if (this.aObjEzsigntemplateelementdependency == null) {
      this.aObjEzsigntemplateelementdependency = new ArrayList<>();
    }
    this.aObjEzsigntemplateelementdependency.add(aObjEzsigntemplateelementdependencyItem);
    return this;
  }

   /**
   * Get aObjEzsigntemplateelementdependency
   * @return aObjEzsigntemplateelementdependency
  **/
  @javax.annotation.Nullable
  public List<EzsigntemplateelementdependencyResponseCompound> getaObjEzsigntemplateelementdependency() {
    return aObjEzsigntemplateelementdependency;
  }

  public void setaObjEzsigntemplateelementdependency(List<EzsigntemplateelementdependencyResponseCompound> aObjEzsigntemplateelementdependency) {
    this.aObjEzsigntemplateelementdependency = aObjEzsigntemplateelementdependency;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsigntemplateformfieldResponseCompound ezsigntemplateformfieldResponseCompound = (EzsigntemplateformfieldResponseCompound) o;
    return Objects.equals(this.pkiEzsigntemplateformfieldID, ezsigntemplateformfieldResponseCompound.pkiEzsigntemplateformfieldID) &&
        Objects.equals(this.eEzsigntemplateformfieldPositioning, ezsigntemplateformfieldResponseCompound.eEzsigntemplateformfieldPositioning) &&
        Objects.equals(this.iEzsigntemplatedocumentpagePagenumber, ezsigntemplateformfieldResponseCompound.iEzsigntemplatedocumentpagePagenumber) &&
        Objects.equals(this.sEzsigntemplateformfieldLabel, ezsigntemplateformfieldResponseCompound.sEzsigntemplateformfieldLabel) &&
        Objects.equals(this.sEzsigntemplateformfieldValue, ezsigntemplateformfieldResponseCompound.sEzsigntemplateformfieldValue) &&
        Objects.equals(this.iEzsigntemplateformfieldX, ezsigntemplateformfieldResponseCompound.iEzsigntemplateformfieldX) &&
        Objects.equals(this.iEzsigntemplateformfieldY, ezsigntemplateformfieldResponseCompound.iEzsigntemplateformfieldY) &&
        Objects.equals(this.iEzsigntemplateformfieldWidth, ezsigntemplateformfieldResponseCompound.iEzsigntemplateformfieldWidth) &&
        Objects.equals(this.iEzsigntemplateformfieldHeight, ezsigntemplateformfieldResponseCompound.iEzsigntemplateformfieldHeight) &&
        Objects.equals(this.bEzsigntemplateformfieldAutocomplete, ezsigntemplateformfieldResponseCompound.bEzsigntemplateformfieldAutocomplete) &&
        Objects.equals(this.bEzsigntemplateformfieldSelected, ezsigntemplateformfieldResponseCompound.bEzsigntemplateformfieldSelected) &&
        Objects.equals(this.eEzsigntemplateformfieldDependencyrequirement, ezsigntemplateformfieldResponseCompound.eEzsigntemplateformfieldDependencyrequirement) &&
        Objects.equals(this.sEzsigntemplateformfieldPositioningpattern, ezsigntemplateformfieldResponseCompound.sEzsigntemplateformfieldPositioningpattern) &&
        Objects.equals(this.iEzsigntemplateformfieldPositioningoffsetx, ezsigntemplateformfieldResponseCompound.iEzsigntemplateformfieldPositioningoffsetx) &&
        Objects.equals(this.iEzsigntemplateformfieldPositioningoffsety, ezsigntemplateformfieldResponseCompound.iEzsigntemplateformfieldPositioningoffsety) &&
        Objects.equals(this.eEzsigntemplateformfieldPositioningoccurence, ezsigntemplateformfieldResponseCompound.eEzsigntemplateformfieldPositioningoccurence) &&
        Objects.equals(this.aObjEzsigntemplateelementdependency, ezsigntemplateformfieldResponseCompound.aObjEzsigntemplateelementdependency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pkiEzsigntemplateformfieldID, eEzsigntemplateformfieldPositioning, iEzsigntemplatedocumentpagePagenumber, sEzsigntemplateformfieldLabel, sEzsigntemplateformfieldValue, iEzsigntemplateformfieldX, iEzsigntemplateformfieldY, iEzsigntemplateformfieldWidth, iEzsigntemplateformfieldHeight, bEzsigntemplateformfieldAutocomplete, bEzsigntemplateformfieldSelected, eEzsigntemplateformfieldDependencyrequirement, sEzsigntemplateformfieldPositioningpattern, iEzsigntemplateformfieldPositioningoffsetx, iEzsigntemplateformfieldPositioningoffsety, eEzsigntemplateformfieldPositioningoccurence, aObjEzsigntemplateelementdependency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsigntemplateformfieldResponseCompound {\n");
    sb.append("    pkiEzsigntemplateformfieldID: ").append(toIndentedString(pkiEzsigntemplateformfieldID)).append("\n");
    sb.append("    eEzsigntemplateformfieldPositioning: ").append(toIndentedString(eEzsigntemplateformfieldPositioning)).append("\n");
    sb.append("    iEzsigntemplatedocumentpagePagenumber: ").append(toIndentedString(iEzsigntemplatedocumentpagePagenumber)).append("\n");
    sb.append("    sEzsigntemplateformfieldLabel: ").append(toIndentedString(sEzsigntemplateformfieldLabel)).append("\n");
    sb.append("    sEzsigntemplateformfieldValue: ").append(toIndentedString(sEzsigntemplateformfieldValue)).append("\n");
    sb.append("    iEzsigntemplateformfieldX: ").append(toIndentedString(iEzsigntemplateformfieldX)).append("\n");
    sb.append("    iEzsigntemplateformfieldY: ").append(toIndentedString(iEzsigntemplateformfieldY)).append("\n");
    sb.append("    iEzsigntemplateformfieldWidth: ").append(toIndentedString(iEzsigntemplateformfieldWidth)).append("\n");
    sb.append("    iEzsigntemplateformfieldHeight: ").append(toIndentedString(iEzsigntemplateformfieldHeight)).append("\n");
    sb.append("    bEzsigntemplateformfieldAutocomplete: ").append(toIndentedString(bEzsigntemplateformfieldAutocomplete)).append("\n");
    sb.append("    bEzsigntemplateformfieldSelected: ").append(toIndentedString(bEzsigntemplateformfieldSelected)).append("\n");
    sb.append("    eEzsigntemplateformfieldDependencyrequirement: ").append(toIndentedString(eEzsigntemplateformfieldDependencyrequirement)).append("\n");
    sb.append("    sEzsigntemplateformfieldPositioningpattern: ").append(toIndentedString(sEzsigntemplateformfieldPositioningpattern)).append("\n");
    sb.append("    iEzsigntemplateformfieldPositioningoffsetx: ").append(toIndentedString(iEzsigntemplateformfieldPositioningoffsetx)).append("\n");
    sb.append("    iEzsigntemplateformfieldPositioningoffsety: ").append(toIndentedString(iEzsigntemplateformfieldPositioningoffsety)).append("\n");
    sb.append("    eEzsigntemplateformfieldPositioningoccurence: ").append(toIndentedString(eEzsigntemplateformfieldPositioningoccurence)).append("\n");
    sb.append("    aObjEzsigntemplateelementdependency: ").append(toIndentedString(aObjEzsigntemplateelementdependency)).append("\n");
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
    openapiFields.add("pkiEzsigntemplateformfieldID");
    openapiFields.add("eEzsigntemplateformfieldPositioning");
    openapiFields.add("iEzsigntemplatedocumentpagePagenumber");
    openapiFields.add("sEzsigntemplateformfieldLabel");
    openapiFields.add("sEzsigntemplateformfieldValue");
    openapiFields.add("iEzsigntemplateformfieldX");
    openapiFields.add("iEzsigntemplateformfieldY");
    openapiFields.add("iEzsigntemplateformfieldWidth");
    openapiFields.add("iEzsigntemplateformfieldHeight");
    openapiFields.add("bEzsigntemplateformfieldAutocomplete");
    openapiFields.add("bEzsigntemplateformfieldSelected");
    openapiFields.add("eEzsigntemplateformfieldDependencyrequirement");
    openapiFields.add("sEzsigntemplateformfieldPositioningpattern");
    openapiFields.add("iEzsigntemplateformfieldPositioningoffsetx");
    openapiFields.add("iEzsigntemplateformfieldPositioningoffsety");
    openapiFields.add("eEzsigntemplateformfieldPositioningoccurence");
    openapiFields.add("a_objEzsigntemplateelementdependency");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("pkiEzsigntemplateformfieldID");
    openapiRequiredFields.add("iEzsigntemplatedocumentpagePagenumber");
    openapiRequiredFields.add("sEzsigntemplateformfieldLabel");
    openapiRequiredFields.add("iEzsigntemplateformfieldWidth");
    openapiRequiredFields.add("iEzsigntemplateformfieldHeight");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to EzsigntemplateformfieldResponseCompound
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EzsigntemplateformfieldResponseCompound.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EzsigntemplateformfieldResponseCompound is not found in the empty JSON string", EzsigntemplateformfieldResponseCompound.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EzsigntemplateformfieldResponseCompound.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EzsigntemplateformfieldResponseCompound` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EzsigntemplateformfieldResponseCompound.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `eEzsigntemplateformfieldPositioning`
      if (jsonObj.get("eEzsigntemplateformfieldPositioning") != null && !jsonObj.get("eEzsigntemplateformfieldPositioning").isJsonNull()) {
        FieldEEzsigntemplateformfieldPositioning.validateJsonElement(jsonObj.get("eEzsigntemplateformfieldPositioning"));
      }
      if (!jsonObj.get("sEzsigntemplateformfieldLabel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sEzsigntemplateformfieldLabel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sEzsigntemplateformfieldLabel").toString()));
      }
      if ((jsonObj.get("sEzsigntemplateformfieldValue") != null && !jsonObj.get("sEzsigntemplateformfieldValue").isJsonNull()) && !jsonObj.get("sEzsigntemplateformfieldValue").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sEzsigntemplateformfieldValue` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sEzsigntemplateformfieldValue").toString()));
      }
      // validate the optional field `eEzsigntemplateformfieldDependencyrequirement`
      if (jsonObj.get("eEzsigntemplateformfieldDependencyrequirement") != null && !jsonObj.get("eEzsigntemplateformfieldDependencyrequirement").isJsonNull()) {
        FieldEEzsigntemplateformfieldDependencyrequirement.validateJsonElement(jsonObj.get("eEzsigntemplateformfieldDependencyrequirement"));
      }
      if ((jsonObj.get("sEzsigntemplateformfieldPositioningpattern") != null && !jsonObj.get("sEzsigntemplateformfieldPositioningpattern").isJsonNull()) && !jsonObj.get("sEzsigntemplateformfieldPositioningpattern").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sEzsigntemplateformfieldPositioningpattern` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sEzsigntemplateformfieldPositioningpattern").toString()));
      }
      // validate the optional field `eEzsigntemplateformfieldPositioningoccurence`
      if (jsonObj.get("eEzsigntemplateformfieldPositioningoccurence") != null && !jsonObj.get("eEzsigntemplateformfieldPositioningoccurence").isJsonNull()) {
        FieldEEzsigntemplateformfieldPositioningoccurence.validateJsonElement(jsonObj.get("eEzsigntemplateformfieldPositioningoccurence"));
      }
      if (jsonObj.get("a_objEzsigntemplateelementdependency") != null && !jsonObj.get("a_objEzsigntemplateelementdependency").isJsonNull()) {
        JsonArray jsonArrayaObjEzsigntemplateelementdependency = jsonObj.getAsJsonArray("a_objEzsigntemplateelementdependency");
        if (jsonArrayaObjEzsigntemplateelementdependency != null) {
          // ensure the json data is an array
          if (!jsonObj.get("a_objEzsigntemplateelementdependency").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `a_objEzsigntemplateelementdependency` to be an array in the JSON string but got `%s`", jsonObj.get("a_objEzsigntemplateelementdependency").toString()));
          }

          // validate the optional field `a_objEzsigntemplateelementdependency` (array)
          for (int i = 0; i < jsonArrayaObjEzsigntemplateelementdependency.size(); i++) {
            EzsigntemplateelementdependencyResponseCompound.validateJsonElement(jsonArrayaObjEzsigntemplateelementdependency.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EzsigntemplateformfieldResponseCompound.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EzsigntemplateformfieldResponseCompound' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EzsigntemplateformfieldResponseCompound> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EzsigntemplateformfieldResponseCompound.class));

       return (TypeAdapter<T>) new TypeAdapter<EzsigntemplateformfieldResponseCompound>() {
           @Override
           public void write(JsonWriter out, EzsigntemplateformfieldResponseCompound value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EzsigntemplateformfieldResponseCompound read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EzsigntemplateformfieldResponseCompound given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EzsigntemplateformfieldResponseCompound
  * @throws IOException if the JSON string is invalid with respect to EzsigntemplateformfieldResponseCompound
  */
  public static EzsigntemplateformfieldResponseCompound fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EzsigntemplateformfieldResponseCompound.class);
  }

 /**
  * Convert an instance of EzsigntemplateformfieldResponseCompound to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

