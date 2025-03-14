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
import com.ezmax.api.model.MultilingualSupplyDescription;
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
 * A Supply Object
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-07T19:20:13.445471985Z[Etc/UTC]", comments = "Generator version: 7.12.0")
public class SupplyResponseCompound {
  public static final String SERIALIZED_NAME_PKI_SUPPLY_I_D = "pkiSupplyID";
  @SerializedName(SERIALIZED_NAME_PKI_SUPPLY_I_D)
  @javax.annotation.Nonnull
  private Integer pkiSupplyID;

  public static final String SERIALIZED_NAME_FKI_GLACCOUNT_I_D = "fkiGlaccountID";
  @SerializedName(SERIALIZED_NAME_FKI_GLACCOUNT_I_D)
  @javax.annotation.Nullable
  private Integer fkiGlaccountID;

  public static final String SERIALIZED_NAME_FKI_GLACCOUNTCONTAINER_I_D = "fkiGlaccountcontainerID";
  @SerializedName(SERIALIZED_NAME_FKI_GLACCOUNTCONTAINER_I_D)
  @javax.annotation.Nullable
  private Integer fkiGlaccountcontainerID;

  public static final String SERIALIZED_NAME_FKI_VARIABLEEXPENSE_I_D = "fkiVariableexpenseID";
  @SerializedName(SERIALIZED_NAME_FKI_VARIABLEEXPENSE_I_D)
  @javax.annotation.Nonnull
  private Integer fkiVariableexpenseID;

  public static final String SERIALIZED_NAME_S_SUPPLY_CODE = "sSupplyCode";
  @SerializedName(SERIALIZED_NAME_S_SUPPLY_CODE)
  @javax.annotation.Nonnull
  private String sSupplyCode;

  public static final String SERIALIZED_NAME_OBJ_SUPPLY_DESCRIPTION = "objSupplyDescription";
  @SerializedName(SERIALIZED_NAME_OBJ_SUPPLY_DESCRIPTION)
  @javax.annotation.Nonnull
  private MultilingualSupplyDescription objSupplyDescription;

  public static final String SERIALIZED_NAME_D_SUPPLY_UNITPRICE = "dSupplyUnitprice";
  @SerializedName(SERIALIZED_NAME_D_SUPPLY_UNITPRICE)
  @javax.annotation.Nonnull
  private String dSupplyUnitprice;

  public static final String SERIALIZED_NAME_B_SUPPLY_ISACTIVE = "bSupplyIsactive";
  @SerializedName(SERIALIZED_NAME_B_SUPPLY_ISACTIVE)
  @javax.annotation.Nonnull
  private Boolean bSupplyIsactive;

  public static final String SERIALIZED_NAME_B_SUPPLY_VARIABLEPRICE = "bSupplyVariableprice";
  @SerializedName(SERIALIZED_NAME_B_SUPPLY_VARIABLEPRICE)
  @javax.annotation.Nonnull
  private Boolean bSupplyVariableprice;

  public static final String SERIALIZED_NAME_S_GLACCOUNT_DESCRIPTION_X = "sGlaccountDescriptionX";
  @SerializedName(SERIALIZED_NAME_S_GLACCOUNT_DESCRIPTION_X)
  @javax.annotation.Nullable
  private String sGlaccountDescriptionX;

  public static final String SERIALIZED_NAME_S_GLACCOUNTCONTAINER_LONGDESCRIPTION_X = "sGlaccountcontainerLongdescriptionX";
  @SerializedName(SERIALIZED_NAME_S_GLACCOUNTCONTAINER_LONGDESCRIPTION_X)
  @javax.annotation.Nullable
  private String sGlaccountcontainerLongdescriptionX;

  public static final String SERIALIZED_NAME_S_VARIABLEEXPENSE_DESCRIPTION_X = "sVariableexpenseDescriptionX";
  @SerializedName(SERIALIZED_NAME_S_VARIABLEEXPENSE_DESCRIPTION_X)
  @javax.annotation.Nullable
  private String sVariableexpenseDescriptionX;

  public SupplyResponseCompound() {
  }

  public SupplyResponseCompound pkiSupplyID(@javax.annotation.Nonnull Integer pkiSupplyID) {
    this.pkiSupplyID = pkiSupplyID;
    return this;
  }

  /**
   * The unique ID of the Supply
   * minimum: 0
   * maximum: 65535
   * @return pkiSupplyID
   */
  @javax.annotation.Nonnull
  public Integer getPkiSupplyID() {
    return pkiSupplyID;
  }

  public void setPkiSupplyID(@javax.annotation.Nonnull Integer pkiSupplyID) {
    this.pkiSupplyID = pkiSupplyID;
  }


  public SupplyResponseCompound fkiGlaccountID(@javax.annotation.Nullable Integer fkiGlaccountID) {
    this.fkiGlaccountID = fkiGlaccountID;
    return this;
  }

  /**
   * The unique ID of the Glaccount
   * minimum: 0
   * @return fkiGlaccountID
   */
  @javax.annotation.Nullable
  public Integer getFkiGlaccountID() {
    return fkiGlaccountID;
  }

  public void setFkiGlaccountID(@javax.annotation.Nullable Integer fkiGlaccountID) {
    this.fkiGlaccountID = fkiGlaccountID;
  }


  public SupplyResponseCompound fkiGlaccountcontainerID(@javax.annotation.Nullable Integer fkiGlaccountcontainerID) {
    this.fkiGlaccountcontainerID = fkiGlaccountcontainerID;
    return this;
  }

  /**
   * The unique ID of the Glaccountcontainer
   * minimum: 0
   * @return fkiGlaccountcontainerID
   */
  @javax.annotation.Nullable
  public Integer getFkiGlaccountcontainerID() {
    return fkiGlaccountcontainerID;
  }

  public void setFkiGlaccountcontainerID(@javax.annotation.Nullable Integer fkiGlaccountcontainerID) {
    this.fkiGlaccountcontainerID = fkiGlaccountcontainerID;
  }


  public SupplyResponseCompound fkiVariableexpenseID(@javax.annotation.Nonnull Integer fkiVariableexpenseID) {
    this.fkiVariableexpenseID = fkiVariableexpenseID;
    return this;
  }

  /**
   * The unique ID of the Variableexpense
   * minimum: 1
   * maximum: 255
   * @return fkiVariableexpenseID
   */
  @javax.annotation.Nonnull
  public Integer getFkiVariableexpenseID() {
    return fkiVariableexpenseID;
  }

  public void setFkiVariableexpenseID(@javax.annotation.Nonnull Integer fkiVariableexpenseID) {
    this.fkiVariableexpenseID = fkiVariableexpenseID;
  }


  public SupplyResponseCompound sSupplyCode(@javax.annotation.Nonnull String sSupplyCode) {
    this.sSupplyCode = sSupplyCode;
    return this;
  }

  /**
   * The code of the Supply
   * @return sSupplyCode
   */
  @javax.annotation.Nonnull
  public String getsSupplyCode() {
    return sSupplyCode;
  }

  public void setsSupplyCode(@javax.annotation.Nonnull String sSupplyCode) {
    this.sSupplyCode = sSupplyCode;
  }


  public SupplyResponseCompound objSupplyDescription(@javax.annotation.Nonnull MultilingualSupplyDescription objSupplyDescription) {
    this.objSupplyDescription = objSupplyDescription;
    return this;
  }

  /**
   * Get objSupplyDescription
   * @return objSupplyDescription
   */
  @javax.annotation.Nonnull
  public MultilingualSupplyDescription getObjSupplyDescription() {
    return objSupplyDescription;
  }

  public void setObjSupplyDescription(@javax.annotation.Nonnull MultilingualSupplyDescription objSupplyDescription) {
    this.objSupplyDescription = objSupplyDescription;
  }


  public SupplyResponseCompound dSupplyUnitprice(@javax.annotation.Nonnull String dSupplyUnitprice) {
    this.dSupplyUnitprice = dSupplyUnitprice;
    return this;
  }

  /**
   * The unit price of the Supply
   * @return dSupplyUnitprice
   */
  @javax.annotation.Nonnull
  public String getdSupplyUnitprice() {
    return dSupplyUnitprice;
  }

  public void setdSupplyUnitprice(@javax.annotation.Nonnull String dSupplyUnitprice) {
    this.dSupplyUnitprice = dSupplyUnitprice;
  }


  public SupplyResponseCompound bSupplyIsactive(@javax.annotation.Nonnull Boolean bSupplyIsactive) {
    this.bSupplyIsactive = bSupplyIsactive;
    return this;
  }

  /**
   * Whether the supply is active or not
   * @return bSupplyIsactive
   */
  @javax.annotation.Nonnull
  public Boolean getbSupplyIsactive() {
    return bSupplyIsactive;
  }

  public void setbSupplyIsactive(@javax.annotation.Nonnull Boolean bSupplyIsactive) {
    this.bSupplyIsactive = bSupplyIsactive;
  }


  public SupplyResponseCompound bSupplyVariableprice(@javax.annotation.Nonnull Boolean bSupplyVariableprice) {
    this.bSupplyVariableprice = bSupplyVariableprice;
    return this;
  }

  /**
   * Whether if the price is variable
   * @return bSupplyVariableprice
   */
  @javax.annotation.Nonnull
  public Boolean getbSupplyVariableprice() {
    return bSupplyVariableprice;
  }

  public void setbSupplyVariableprice(@javax.annotation.Nonnull Boolean bSupplyVariableprice) {
    this.bSupplyVariableprice = bSupplyVariableprice;
  }


  public SupplyResponseCompound sGlaccountDescriptionX(@javax.annotation.Nullable String sGlaccountDescriptionX) {
    this.sGlaccountDescriptionX = sGlaccountDescriptionX;
    return this;
  }

  /**
   * The Description for the Glaccount in the language of the requester
   * @return sGlaccountDescriptionX
   */
  @javax.annotation.Nullable
  public String getsGlaccountDescriptionX() {
    return sGlaccountDescriptionX;
  }

  public void setsGlaccountDescriptionX(@javax.annotation.Nullable String sGlaccountDescriptionX) {
    this.sGlaccountDescriptionX = sGlaccountDescriptionX;
  }


  public SupplyResponseCompound sGlaccountcontainerLongdescriptionX(@javax.annotation.Nullable String sGlaccountcontainerLongdescriptionX) {
    this.sGlaccountcontainerLongdescriptionX = sGlaccountcontainerLongdescriptionX;
    return this;
  }

  /**
   * The Description for the Glaccountcontainer in the language of the requester
   * @return sGlaccountcontainerLongdescriptionX
   */
  @javax.annotation.Nullable
  public String getsGlaccountcontainerLongdescriptionX() {
    return sGlaccountcontainerLongdescriptionX;
  }

  public void setsGlaccountcontainerLongdescriptionX(@javax.annotation.Nullable String sGlaccountcontainerLongdescriptionX) {
    this.sGlaccountcontainerLongdescriptionX = sGlaccountcontainerLongdescriptionX;
  }


  public SupplyResponseCompound sVariableexpenseDescriptionX(@javax.annotation.Nullable String sVariableexpenseDescriptionX) {
    this.sVariableexpenseDescriptionX = sVariableexpenseDescriptionX;
    return this;
  }

  /**
   * The description of the Variableexpense in the language of the requester
   * @return sVariableexpenseDescriptionX
   */
  @javax.annotation.Nullable
  public String getsVariableexpenseDescriptionX() {
    return sVariableexpenseDescriptionX;
  }

  public void setsVariableexpenseDescriptionX(@javax.annotation.Nullable String sVariableexpenseDescriptionX) {
    this.sVariableexpenseDescriptionX = sVariableexpenseDescriptionX;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SupplyResponseCompound supplyResponseCompound = (SupplyResponseCompound) o;
    return Objects.equals(this.pkiSupplyID, supplyResponseCompound.pkiSupplyID) &&
        Objects.equals(this.fkiGlaccountID, supplyResponseCompound.fkiGlaccountID) &&
        Objects.equals(this.fkiGlaccountcontainerID, supplyResponseCompound.fkiGlaccountcontainerID) &&
        Objects.equals(this.fkiVariableexpenseID, supplyResponseCompound.fkiVariableexpenseID) &&
        Objects.equals(this.sSupplyCode, supplyResponseCompound.sSupplyCode) &&
        Objects.equals(this.objSupplyDescription, supplyResponseCompound.objSupplyDescription) &&
        Objects.equals(this.dSupplyUnitprice, supplyResponseCompound.dSupplyUnitprice) &&
        Objects.equals(this.bSupplyIsactive, supplyResponseCompound.bSupplyIsactive) &&
        Objects.equals(this.bSupplyVariableprice, supplyResponseCompound.bSupplyVariableprice) &&
        Objects.equals(this.sGlaccountDescriptionX, supplyResponseCompound.sGlaccountDescriptionX) &&
        Objects.equals(this.sGlaccountcontainerLongdescriptionX, supplyResponseCompound.sGlaccountcontainerLongdescriptionX) &&
        Objects.equals(this.sVariableexpenseDescriptionX, supplyResponseCompound.sVariableexpenseDescriptionX);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pkiSupplyID, fkiGlaccountID, fkiGlaccountcontainerID, fkiVariableexpenseID, sSupplyCode, objSupplyDescription, dSupplyUnitprice, bSupplyIsactive, bSupplyVariableprice, sGlaccountDescriptionX, sGlaccountcontainerLongdescriptionX, sVariableexpenseDescriptionX);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SupplyResponseCompound {\n");
    sb.append("    pkiSupplyID: ").append(toIndentedString(pkiSupplyID)).append("\n");
    sb.append("    fkiGlaccountID: ").append(toIndentedString(fkiGlaccountID)).append("\n");
    sb.append("    fkiGlaccountcontainerID: ").append(toIndentedString(fkiGlaccountcontainerID)).append("\n");
    sb.append("    fkiVariableexpenseID: ").append(toIndentedString(fkiVariableexpenseID)).append("\n");
    sb.append("    sSupplyCode: ").append(toIndentedString(sSupplyCode)).append("\n");
    sb.append("    objSupplyDescription: ").append(toIndentedString(objSupplyDescription)).append("\n");
    sb.append("    dSupplyUnitprice: ").append(toIndentedString(dSupplyUnitprice)).append("\n");
    sb.append("    bSupplyIsactive: ").append(toIndentedString(bSupplyIsactive)).append("\n");
    sb.append("    bSupplyVariableprice: ").append(toIndentedString(bSupplyVariableprice)).append("\n");
    sb.append("    sGlaccountDescriptionX: ").append(toIndentedString(sGlaccountDescriptionX)).append("\n");
    sb.append("    sGlaccountcontainerLongdescriptionX: ").append(toIndentedString(sGlaccountcontainerLongdescriptionX)).append("\n");
    sb.append("    sVariableexpenseDescriptionX: ").append(toIndentedString(sVariableexpenseDescriptionX)).append("\n");
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
    openapiFields.add("pkiSupplyID");
    openapiFields.add("fkiGlaccountID");
    openapiFields.add("fkiGlaccountcontainerID");
    openapiFields.add("fkiVariableexpenseID");
    openapiFields.add("sSupplyCode");
    openapiFields.add("objSupplyDescription");
    openapiFields.add("dSupplyUnitprice");
    openapiFields.add("bSupplyIsactive");
    openapiFields.add("bSupplyVariableprice");
    openapiFields.add("sGlaccountDescriptionX");
    openapiFields.add("sGlaccountcontainerLongdescriptionX");
    openapiFields.add("sVariableexpenseDescriptionX");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("pkiSupplyID");
    openapiRequiredFields.add("fkiVariableexpenseID");
    openapiRequiredFields.add("sSupplyCode");
    openapiRequiredFields.add("objSupplyDescription");
    openapiRequiredFields.add("dSupplyUnitprice");
    openapiRequiredFields.add("bSupplyIsactive");
    openapiRequiredFields.add("bSupplyVariableprice");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SupplyResponseCompound
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SupplyResponseCompound.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SupplyResponseCompound is not found in the empty JSON string", SupplyResponseCompound.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SupplyResponseCompound.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SupplyResponseCompound` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SupplyResponseCompound.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("sSupplyCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sSupplyCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sSupplyCode").toString()));
      }
      // validate the required field `objSupplyDescription`
      MultilingualSupplyDescription.validateJsonElement(jsonObj.get("objSupplyDescription"));
      if (!jsonObj.get("dSupplyUnitprice").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dSupplyUnitprice` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dSupplyUnitprice").toString()));
      }
      if ((jsonObj.get("sGlaccountDescriptionX") != null && !jsonObj.get("sGlaccountDescriptionX").isJsonNull()) && !jsonObj.get("sGlaccountDescriptionX").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sGlaccountDescriptionX` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sGlaccountDescriptionX").toString()));
      }
      if ((jsonObj.get("sGlaccountcontainerLongdescriptionX") != null && !jsonObj.get("sGlaccountcontainerLongdescriptionX").isJsonNull()) && !jsonObj.get("sGlaccountcontainerLongdescriptionX").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sGlaccountcontainerLongdescriptionX` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sGlaccountcontainerLongdescriptionX").toString()));
      }
      if ((jsonObj.get("sVariableexpenseDescriptionX") != null && !jsonObj.get("sVariableexpenseDescriptionX").isJsonNull()) && !jsonObj.get("sVariableexpenseDescriptionX").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sVariableexpenseDescriptionX` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sVariableexpenseDescriptionX").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SupplyResponseCompound.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SupplyResponseCompound' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SupplyResponseCompound> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SupplyResponseCompound.class));

       return (TypeAdapter<T>) new TypeAdapter<SupplyResponseCompound>() {
           @Override
           public void write(JsonWriter out, SupplyResponseCompound value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SupplyResponseCompound read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of SupplyResponseCompound given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SupplyResponseCompound
   * @throws IOException if the JSON string is invalid with respect to SupplyResponseCompound
   */
  public static SupplyResponseCompound fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SupplyResponseCompound.class);
  }

  /**
   * Convert an instance of SupplyResponseCompound to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

