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
import com.ezmax.api.model.EzsigntemplateResponseCompound;
import com.ezmax.api.model.EzsigntemplatepackageResponseCompound;
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
 * A Ezsignbulksenddocumentmapping Object
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-07T19:20:13.445471985Z[Etc/UTC]", comments = "Generator version: 7.12.0")
public class EzsignbulksenddocumentmappingResponseCompound {
  public static final String SERIALIZED_NAME_PKI_EZSIGNBULKSENDDOCUMENTMAPPING_I_D = "pkiEzsignbulksenddocumentmappingID";
  @SerializedName(SERIALIZED_NAME_PKI_EZSIGNBULKSENDDOCUMENTMAPPING_I_D)
  @javax.annotation.Nonnull
  private Integer pkiEzsignbulksenddocumentmappingID;

  public static final String SERIALIZED_NAME_FKI_EZSIGNBULKSEND_I_D = "fkiEzsignbulksendID";
  @SerializedName(SERIALIZED_NAME_FKI_EZSIGNBULKSEND_I_D)
  @javax.annotation.Nonnull
  private Integer fkiEzsignbulksendID;

  public static final String SERIALIZED_NAME_FKI_EZSIGNTEMPLATEPACKAGE_I_D = "fkiEzsigntemplatepackageID";
  @SerializedName(SERIALIZED_NAME_FKI_EZSIGNTEMPLATEPACKAGE_I_D)
  @javax.annotation.Nullable
  private Integer fkiEzsigntemplatepackageID;

  public static final String SERIALIZED_NAME_FKI_EZSIGNTEMPLATE_I_D = "fkiEzsigntemplateID";
  @SerializedName(SERIALIZED_NAME_FKI_EZSIGNTEMPLATE_I_D)
  @javax.annotation.Nullable
  private Integer fkiEzsigntemplateID;

  public static final String SERIALIZED_NAME_I_EZSIGNBULKSENDDOCUMENTMAPPING_ORDER = "iEzsignbulksenddocumentmappingOrder";
  @SerializedName(SERIALIZED_NAME_I_EZSIGNBULKSENDDOCUMENTMAPPING_ORDER)
  @javax.annotation.Nonnull
  private Integer iEzsignbulksenddocumentmappingOrder;

  public static final String SERIALIZED_NAME_OBJ_EZSIGNTEMPLATE = "objEzsigntemplate";
  @SerializedName(SERIALIZED_NAME_OBJ_EZSIGNTEMPLATE)
  @javax.annotation.Nullable
  private EzsigntemplateResponseCompound objEzsigntemplate;

  public static final String SERIALIZED_NAME_OBJ_EZSIGNTEMPLATEPACKAGE = "objEzsigntemplatepackage";
  @SerializedName(SERIALIZED_NAME_OBJ_EZSIGNTEMPLATEPACKAGE)
  @javax.annotation.Nullable
  private EzsigntemplatepackageResponseCompound objEzsigntemplatepackage;

  public EzsignbulksenddocumentmappingResponseCompound() {
  }

  public EzsignbulksenddocumentmappingResponseCompound pkiEzsignbulksenddocumentmappingID(@javax.annotation.Nonnull Integer pkiEzsignbulksenddocumentmappingID) {
    this.pkiEzsignbulksenddocumentmappingID = pkiEzsignbulksenddocumentmappingID;
    return this;
  }

  /**
   * The unique ID of the Ezsignbulksenddocumentmapping.
   * minimum: 0
   * @return pkiEzsignbulksenddocumentmappingID
   */
  @javax.annotation.Nonnull
  public Integer getPkiEzsignbulksenddocumentmappingID() {
    return pkiEzsignbulksenddocumentmappingID;
  }

  public void setPkiEzsignbulksenddocumentmappingID(@javax.annotation.Nonnull Integer pkiEzsignbulksenddocumentmappingID) {
    this.pkiEzsignbulksenddocumentmappingID = pkiEzsignbulksenddocumentmappingID;
  }


  public EzsignbulksenddocumentmappingResponseCompound fkiEzsignbulksendID(@javax.annotation.Nonnull Integer fkiEzsignbulksendID) {
    this.fkiEzsignbulksendID = fkiEzsignbulksendID;
    return this;
  }

  /**
   * The unique ID of the Ezsignbulksend
   * minimum: 0
   * @return fkiEzsignbulksendID
   */
  @javax.annotation.Nonnull
  public Integer getFkiEzsignbulksendID() {
    return fkiEzsignbulksendID;
  }

  public void setFkiEzsignbulksendID(@javax.annotation.Nonnull Integer fkiEzsignbulksendID) {
    this.fkiEzsignbulksendID = fkiEzsignbulksendID;
  }


  public EzsignbulksenddocumentmappingResponseCompound fkiEzsigntemplatepackageID(@javax.annotation.Nullable Integer fkiEzsigntemplatepackageID) {
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


  public EzsignbulksenddocumentmappingResponseCompound fkiEzsigntemplateID(@javax.annotation.Nullable Integer fkiEzsigntemplateID) {
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


  public EzsignbulksenddocumentmappingResponseCompound iEzsignbulksenddocumentmappingOrder(@javax.annotation.Nonnull Integer iEzsignbulksenddocumentmappingOrder) {
    this.iEzsignbulksenddocumentmappingOrder = iEzsignbulksenddocumentmappingOrder;
    return this;
  }

  /**
   * The order in which the Ezsigntemplate or Ezsigntemplatepackage will be presented to the signatory in the Ezsignfolder.
   * minimum: 0
   * @return iEzsignbulksenddocumentmappingOrder
   */
  @javax.annotation.Nonnull
  public Integer getiEzsignbulksenddocumentmappingOrder() {
    return iEzsignbulksenddocumentmappingOrder;
  }

  public void setiEzsignbulksenddocumentmappingOrder(@javax.annotation.Nonnull Integer iEzsignbulksenddocumentmappingOrder) {
    this.iEzsignbulksenddocumentmappingOrder = iEzsignbulksenddocumentmappingOrder;
  }


  public EzsignbulksenddocumentmappingResponseCompound objEzsigntemplate(@javax.annotation.Nullable EzsigntemplateResponseCompound objEzsigntemplate) {
    this.objEzsigntemplate = objEzsigntemplate;
    return this;
  }

  /**
   * Get objEzsigntemplate
   * @return objEzsigntemplate
   */
  @javax.annotation.Nullable
  public EzsigntemplateResponseCompound getObjEzsigntemplate() {
    return objEzsigntemplate;
  }

  public void setObjEzsigntemplate(@javax.annotation.Nullable EzsigntemplateResponseCompound objEzsigntemplate) {
    this.objEzsigntemplate = objEzsigntemplate;
  }


  public EzsignbulksenddocumentmappingResponseCompound objEzsigntemplatepackage(@javax.annotation.Nullable EzsigntemplatepackageResponseCompound objEzsigntemplatepackage) {
    this.objEzsigntemplatepackage = objEzsigntemplatepackage;
    return this;
  }

  /**
   * Get objEzsigntemplatepackage
   * @return objEzsigntemplatepackage
   */
  @javax.annotation.Nullable
  public EzsigntemplatepackageResponseCompound getObjEzsigntemplatepackage() {
    return objEzsigntemplatepackage;
  }

  public void setObjEzsigntemplatepackage(@javax.annotation.Nullable EzsigntemplatepackageResponseCompound objEzsigntemplatepackage) {
    this.objEzsigntemplatepackage = objEzsigntemplatepackage;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignbulksenddocumentmappingResponseCompound ezsignbulksenddocumentmappingResponseCompound = (EzsignbulksenddocumentmappingResponseCompound) o;
    return Objects.equals(this.pkiEzsignbulksenddocumentmappingID, ezsignbulksenddocumentmappingResponseCompound.pkiEzsignbulksenddocumentmappingID) &&
        Objects.equals(this.fkiEzsignbulksendID, ezsignbulksenddocumentmappingResponseCompound.fkiEzsignbulksendID) &&
        Objects.equals(this.fkiEzsigntemplatepackageID, ezsignbulksenddocumentmappingResponseCompound.fkiEzsigntemplatepackageID) &&
        Objects.equals(this.fkiEzsigntemplateID, ezsignbulksenddocumentmappingResponseCompound.fkiEzsigntemplateID) &&
        Objects.equals(this.iEzsignbulksenddocumentmappingOrder, ezsignbulksenddocumentmappingResponseCompound.iEzsignbulksenddocumentmappingOrder) &&
        Objects.equals(this.objEzsigntemplate, ezsignbulksenddocumentmappingResponseCompound.objEzsigntemplate) &&
        Objects.equals(this.objEzsigntemplatepackage, ezsignbulksenddocumentmappingResponseCompound.objEzsigntemplatepackage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pkiEzsignbulksenddocumentmappingID, fkiEzsignbulksendID, fkiEzsigntemplatepackageID, fkiEzsigntemplateID, iEzsignbulksenddocumentmappingOrder, objEzsigntemplate, objEzsigntemplatepackage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignbulksenddocumentmappingResponseCompound {\n");
    sb.append("    pkiEzsignbulksenddocumentmappingID: ").append(toIndentedString(pkiEzsignbulksenddocumentmappingID)).append("\n");
    sb.append("    fkiEzsignbulksendID: ").append(toIndentedString(fkiEzsignbulksendID)).append("\n");
    sb.append("    fkiEzsigntemplatepackageID: ").append(toIndentedString(fkiEzsigntemplatepackageID)).append("\n");
    sb.append("    fkiEzsigntemplateID: ").append(toIndentedString(fkiEzsigntemplateID)).append("\n");
    sb.append("    iEzsignbulksenddocumentmappingOrder: ").append(toIndentedString(iEzsignbulksenddocumentmappingOrder)).append("\n");
    sb.append("    objEzsigntemplate: ").append(toIndentedString(objEzsigntemplate)).append("\n");
    sb.append("    objEzsigntemplatepackage: ").append(toIndentedString(objEzsigntemplatepackage)).append("\n");
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
    openapiFields.add("pkiEzsignbulksenddocumentmappingID");
    openapiFields.add("fkiEzsignbulksendID");
    openapiFields.add("fkiEzsigntemplatepackageID");
    openapiFields.add("fkiEzsigntemplateID");
    openapiFields.add("iEzsignbulksenddocumentmappingOrder");
    openapiFields.add("objEzsigntemplate");
    openapiFields.add("objEzsigntemplatepackage");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("pkiEzsignbulksenddocumentmappingID");
    openapiRequiredFields.add("fkiEzsignbulksendID");
    openapiRequiredFields.add("iEzsignbulksenddocumentmappingOrder");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EzsignbulksenddocumentmappingResponseCompound
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EzsignbulksenddocumentmappingResponseCompound.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EzsignbulksenddocumentmappingResponseCompound is not found in the empty JSON string", EzsignbulksenddocumentmappingResponseCompound.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EzsignbulksenddocumentmappingResponseCompound.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EzsignbulksenddocumentmappingResponseCompound` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EzsignbulksenddocumentmappingResponseCompound.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `objEzsigntemplate`
      if (jsonObj.get("objEzsigntemplate") != null && !jsonObj.get("objEzsigntemplate").isJsonNull()) {
        EzsigntemplateResponseCompound.validateJsonElement(jsonObj.get("objEzsigntemplate"));
      }
      // validate the optional field `objEzsigntemplatepackage`
      if (jsonObj.get("objEzsigntemplatepackage") != null && !jsonObj.get("objEzsigntemplatepackage").isJsonNull()) {
        EzsigntemplatepackageResponseCompound.validateJsonElement(jsonObj.get("objEzsigntemplatepackage"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EzsignbulksenddocumentmappingResponseCompound.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EzsignbulksenddocumentmappingResponseCompound' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EzsignbulksenddocumentmappingResponseCompound> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EzsignbulksenddocumentmappingResponseCompound.class));

       return (TypeAdapter<T>) new TypeAdapter<EzsignbulksenddocumentmappingResponseCompound>() {
           @Override
           public void write(JsonWriter out, EzsignbulksenddocumentmappingResponseCompound value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EzsignbulksenddocumentmappingResponseCompound read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EzsignbulksenddocumentmappingResponseCompound given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EzsignbulksenddocumentmappingResponseCompound
   * @throws IOException if the JSON string is invalid with respect to EzsignbulksenddocumentmappingResponseCompound
   */
  public static EzsignbulksenddocumentmappingResponseCompound fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EzsignbulksenddocumentmappingResponseCompound.class);
  }

  /**
   * Convert an instance of EzsignbulksenddocumentmappingResponseCompound to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

