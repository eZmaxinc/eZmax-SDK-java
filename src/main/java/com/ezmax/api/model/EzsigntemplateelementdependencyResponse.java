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
import com.ezmax.api.model.FieldEEzsigntemplateelementdependencyOperator;
import com.ezmax.api.model.FieldEEzsigntemplateelementdependencyValidation;
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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import eZmaxAPI.JSON;

/**
 * An Ezsigntemplateelementdependency Object
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-28T04:04:06.974848816Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class EzsigntemplateelementdependencyResponse {
  public static final String SERIALIZED_NAME_PKI_EZSIGNTEMPLATEELEMENTDEPENDENCY_I_D = "pkiEzsigntemplateelementdependencyID";
  @SerializedName(SERIALIZED_NAME_PKI_EZSIGNTEMPLATEELEMENTDEPENDENCY_I_D)
  private Integer pkiEzsigntemplateelementdependencyID;

  public static final String SERIALIZED_NAME_FKI_EZSIGNTEMPLATEFORMFIELD_I_D = "fkiEzsigntemplateformfieldID";
  @SerializedName(SERIALIZED_NAME_FKI_EZSIGNTEMPLATEFORMFIELD_I_D)
  private Integer fkiEzsigntemplateformfieldID;

  public static final String SERIALIZED_NAME_FKI_EZSIGNTEMPLATESIGNATURE_I_D = "fkiEzsigntemplatesignatureID";
  @SerializedName(SERIALIZED_NAME_FKI_EZSIGNTEMPLATESIGNATURE_I_D)
  private Integer fkiEzsigntemplatesignatureID;

  public static final String SERIALIZED_NAME_FKI_EZSIGNTEMPLATEFORMFIELD_I_D_VALIDATION = "fkiEzsigntemplateformfieldIDValidation";
  @SerializedName(SERIALIZED_NAME_FKI_EZSIGNTEMPLATEFORMFIELD_I_D_VALIDATION)
  private Integer fkiEzsigntemplateformfieldIDValidation;

  public static final String SERIALIZED_NAME_FKI_EZSIGNTEMPLATEFORMFIELDGROUP_I_D_VALIDATION = "fkiEzsigntemplateformfieldgroupIDValidation";
  @SerializedName(SERIALIZED_NAME_FKI_EZSIGNTEMPLATEFORMFIELDGROUP_I_D_VALIDATION)
  private Integer fkiEzsigntemplateformfieldgroupIDValidation;

  public static final String SERIALIZED_NAME_E_EZSIGNTEMPLATEELEMENTDEPENDENCY_VALIDATION = "eEzsigntemplateelementdependencyValidation";
  @SerializedName(SERIALIZED_NAME_E_EZSIGNTEMPLATEELEMENTDEPENDENCY_VALIDATION)
  private FieldEEzsigntemplateelementdependencyValidation eEzsigntemplateelementdependencyValidation;

  public static final String SERIALIZED_NAME_B_EZSIGNTEMPLATEELEMENTDEPENDENCY_SELECTED = "bEzsigntemplateelementdependencySelected";
  @SerializedName(SERIALIZED_NAME_B_EZSIGNTEMPLATEELEMENTDEPENDENCY_SELECTED)
  private Boolean bEzsigntemplateelementdependencySelected;

  public static final String SERIALIZED_NAME_E_EZSIGNTEMPLATEELEMENTDEPENDENCY_OPERATOR = "eEzsigntemplateelementdependencyOperator";
  @SerializedName(SERIALIZED_NAME_E_EZSIGNTEMPLATEELEMENTDEPENDENCY_OPERATOR)
  private FieldEEzsigntemplateelementdependencyOperator eEzsigntemplateelementdependencyOperator;

  public static final String SERIALIZED_NAME_S_EZSIGNTEMPLATEELEMENTDEPENDENCY_VALUE = "sEzsigntemplateelementdependencyValue";
  @SerializedName(SERIALIZED_NAME_S_EZSIGNTEMPLATEELEMENTDEPENDENCY_VALUE)
  private String sEzsigntemplateelementdependencyValue;

  public EzsigntemplateelementdependencyResponse() {
  }

  public EzsigntemplateelementdependencyResponse pkiEzsigntemplateelementdependencyID(Integer pkiEzsigntemplateelementdependencyID) {
    this.pkiEzsigntemplateelementdependencyID = pkiEzsigntemplateelementdependencyID;
    return this;
  }

   /**
   * The unique ID of the Ezsigntemplateelementdependency
   * minimum: 0
   * maximum: 65535
   * @return pkiEzsigntemplateelementdependencyID
  **/
  @javax.annotation.Nonnull
  public Integer getPkiEzsigntemplateelementdependencyID() {
    return pkiEzsigntemplateelementdependencyID;
  }

  public void setPkiEzsigntemplateelementdependencyID(Integer pkiEzsigntemplateelementdependencyID) {
    this.pkiEzsigntemplateelementdependencyID = pkiEzsigntemplateelementdependencyID;
  }


  public EzsigntemplateelementdependencyResponse fkiEzsigntemplateformfieldID(Integer fkiEzsigntemplateformfieldID) {
    this.fkiEzsigntemplateformfieldID = fkiEzsigntemplateformfieldID;
    return this;
  }

   /**
   * The unique ID of the Ezsigntemplateformfield
   * minimum: 0
   * @return fkiEzsigntemplateformfieldID
  **/
  @javax.annotation.Nullable
  public Integer getFkiEzsigntemplateformfieldID() {
    return fkiEzsigntemplateformfieldID;
  }

  public void setFkiEzsigntemplateformfieldID(Integer fkiEzsigntemplateformfieldID) {
    this.fkiEzsigntemplateformfieldID = fkiEzsigntemplateformfieldID;
  }


  public EzsigntemplateelementdependencyResponse fkiEzsigntemplatesignatureID(Integer fkiEzsigntemplatesignatureID) {
    this.fkiEzsigntemplatesignatureID = fkiEzsigntemplatesignatureID;
    return this;
  }

   /**
   * The unique ID of the Ezsigntemplatesignature
   * minimum: 0
   * @return fkiEzsigntemplatesignatureID
  **/
  @javax.annotation.Nullable
  public Integer getFkiEzsigntemplatesignatureID() {
    return fkiEzsigntemplatesignatureID;
  }

  public void setFkiEzsigntemplatesignatureID(Integer fkiEzsigntemplatesignatureID) {
    this.fkiEzsigntemplatesignatureID = fkiEzsigntemplatesignatureID;
  }


  public EzsigntemplateelementdependencyResponse fkiEzsigntemplateformfieldIDValidation(Integer fkiEzsigntemplateformfieldIDValidation) {
    this.fkiEzsigntemplateformfieldIDValidation = fkiEzsigntemplateformfieldIDValidation;
    return this;
  }

   /**
   * The unique ID of the Ezsigntemplateformfield
   * minimum: 0
   * @return fkiEzsigntemplateformfieldIDValidation
  **/
  @javax.annotation.Nullable
  public Integer getFkiEzsigntemplateformfieldIDValidation() {
    return fkiEzsigntemplateformfieldIDValidation;
  }

  public void setFkiEzsigntemplateformfieldIDValidation(Integer fkiEzsigntemplateformfieldIDValidation) {
    this.fkiEzsigntemplateformfieldIDValidation = fkiEzsigntemplateformfieldIDValidation;
  }


  public EzsigntemplateelementdependencyResponse fkiEzsigntemplateformfieldgroupIDValidation(Integer fkiEzsigntemplateformfieldgroupIDValidation) {
    this.fkiEzsigntemplateformfieldgroupIDValidation = fkiEzsigntemplateformfieldgroupIDValidation;
    return this;
  }

   /**
   * The unique ID of the Ezsigntemplateformfieldgroup
   * minimum: 0
   * @return fkiEzsigntemplateformfieldgroupIDValidation
  **/
  @javax.annotation.Nullable
  public Integer getFkiEzsigntemplateformfieldgroupIDValidation() {
    return fkiEzsigntemplateformfieldgroupIDValidation;
  }

  public void setFkiEzsigntemplateformfieldgroupIDValidation(Integer fkiEzsigntemplateformfieldgroupIDValidation) {
    this.fkiEzsigntemplateformfieldgroupIDValidation = fkiEzsigntemplateformfieldgroupIDValidation;
  }


  public EzsigntemplateelementdependencyResponse eEzsigntemplateelementdependencyValidation(FieldEEzsigntemplateelementdependencyValidation eEzsigntemplateelementdependencyValidation) {
    this.eEzsigntemplateelementdependencyValidation = eEzsigntemplateelementdependencyValidation;
    return this;
  }

   /**
   * Get eEzsigntemplateelementdependencyValidation
   * @return eEzsigntemplateelementdependencyValidation
  **/
  @javax.annotation.Nonnull
  public FieldEEzsigntemplateelementdependencyValidation geteEzsigntemplateelementdependencyValidation() {
    return eEzsigntemplateelementdependencyValidation;
  }

  public void seteEzsigntemplateelementdependencyValidation(FieldEEzsigntemplateelementdependencyValidation eEzsigntemplateelementdependencyValidation) {
    this.eEzsigntemplateelementdependencyValidation = eEzsigntemplateelementdependencyValidation;
  }


  public EzsigntemplateelementdependencyResponse bEzsigntemplateelementdependencySelected(Boolean bEzsigntemplateelementdependencySelected) {
    this.bEzsigntemplateelementdependencySelected = bEzsigntemplateelementdependencySelected;
    return this;
  }

   /**
   * Whether if it&#39;s selected or not when using eEzsigntemplateelementdependencyValidation &#x3D; Selected
   * @return bEzsigntemplateelementdependencySelected
  **/
  @javax.annotation.Nullable
  public Boolean getbEzsigntemplateelementdependencySelected() {
    return bEzsigntemplateelementdependencySelected;
  }

  public void setbEzsigntemplateelementdependencySelected(Boolean bEzsigntemplateelementdependencySelected) {
    this.bEzsigntemplateelementdependencySelected = bEzsigntemplateelementdependencySelected;
  }


  public EzsigntemplateelementdependencyResponse eEzsigntemplateelementdependencyOperator(FieldEEzsigntemplateelementdependencyOperator eEzsigntemplateelementdependencyOperator) {
    this.eEzsigntemplateelementdependencyOperator = eEzsigntemplateelementdependencyOperator;
    return this;
  }

   /**
   * Get eEzsigntemplateelementdependencyOperator
   * @return eEzsigntemplateelementdependencyOperator
  **/
  @javax.annotation.Nullable
  public FieldEEzsigntemplateelementdependencyOperator geteEzsigntemplateelementdependencyOperator() {
    return eEzsigntemplateelementdependencyOperator;
  }

  public void seteEzsigntemplateelementdependencyOperator(FieldEEzsigntemplateelementdependencyOperator eEzsigntemplateelementdependencyOperator) {
    this.eEzsigntemplateelementdependencyOperator = eEzsigntemplateelementdependencyOperator;
  }


  public EzsigntemplateelementdependencyResponse sEzsigntemplateelementdependencyValue(String sEzsigntemplateelementdependencyValue) {
    this.sEzsigntemplateelementdependencyValue = sEzsigntemplateelementdependencyValue;
    return this;
  }

   /**
   * The value of the Ezsignelementdependency
   * @return sEzsigntemplateelementdependencyValue
  **/
  @javax.annotation.Nullable
  public String getsEzsigntemplateelementdependencyValue() {
    return sEzsigntemplateelementdependencyValue;
  }

  public void setsEzsigntemplateelementdependencyValue(String sEzsigntemplateelementdependencyValue) {
    this.sEzsigntemplateelementdependencyValue = sEzsigntemplateelementdependencyValue;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsigntemplateelementdependencyResponse ezsigntemplateelementdependencyResponse = (EzsigntemplateelementdependencyResponse) o;
    return Objects.equals(this.pkiEzsigntemplateelementdependencyID, ezsigntemplateelementdependencyResponse.pkiEzsigntemplateelementdependencyID) &&
        Objects.equals(this.fkiEzsigntemplateformfieldID, ezsigntemplateelementdependencyResponse.fkiEzsigntemplateformfieldID) &&
        Objects.equals(this.fkiEzsigntemplatesignatureID, ezsigntemplateelementdependencyResponse.fkiEzsigntemplatesignatureID) &&
        Objects.equals(this.fkiEzsigntemplateformfieldIDValidation, ezsigntemplateelementdependencyResponse.fkiEzsigntemplateformfieldIDValidation) &&
        Objects.equals(this.fkiEzsigntemplateformfieldgroupIDValidation, ezsigntemplateelementdependencyResponse.fkiEzsigntemplateformfieldgroupIDValidation) &&
        Objects.equals(this.eEzsigntemplateelementdependencyValidation, ezsigntemplateelementdependencyResponse.eEzsigntemplateelementdependencyValidation) &&
        Objects.equals(this.bEzsigntemplateelementdependencySelected, ezsigntemplateelementdependencyResponse.bEzsigntemplateelementdependencySelected) &&
        Objects.equals(this.eEzsigntemplateelementdependencyOperator, ezsigntemplateelementdependencyResponse.eEzsigntemplateelementdependencyOperator) &&
        Objects.equals(this.sEzsigntemplateelementdependencyValue, ezsigntemplateelementdependencyResponse.sEzsigntemplateelementdependencyValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pkiEzsigntemplateelementdependencyID, fkiEzsigntemplateformfieldID, fkiEzsigntemplatesignatureID, fkiEzsigntemplateformfieldIDValidation, fkiEzsigntemplateformfieldgroupIDValidation, eEzsigntemplateelementdependencyValidation, bEzsigntemplateelementdependencySelected, eEzsigntemplateelementdependencyOperator, sEzsigntemplateelementdependencyValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsigntemplateelementdependencyResponse {\n");
    sb.append("    pkiEzsigntemplateelementdependencyID: ").append(toIndentedString(pkiEzsigntemplateelementdependencyID)).append("\n");
    sb.append("    fkiEzsigntemplateformfieldID: ").append(toIndentedString(fkiEzsigntemplateformfieldID)).append("\n");
    sb.append("    fkiEzsigntemplatesignatureID: ").append(toIndentedString(fkiEzsigntemplatesignatureID)).append("\n");
    sb.append("    fkiEzsigntemplateformfieldIDValidation: ").append(toIndentedString(fkiEzsigntemplateformfieldIDValidation)).append("\n");
    sb.append("    fkiEzsigntemplateformfieldgroupIDValidation: ").append(toIndentedString(fkiEzsigntemplateformfieldgroupIDValidation)).append("\n");
    sb.append("    eEzsigntemplateelementdependencyValidation: ").append(toIndentedString(eEzsigntemplateelementdependencyValidation)).append("\n");
    sb.append("    bEzsigntemplateelementdependencySelected: ").append(toIndentedString(bEzsigntemplateelementdependencySelected)).append("\n");
    sb.append("    eEzsigntemplateelementdependencyOperator: ").append(toIndentedString(eEzsigntemplateelementdependencyOperator)).append("\n");
    sb.append("    sEzsigntemplateelementdependencyValue: ").append(toIndentedString(sEzsigntemplateelementdependencyValue)).append("\n");
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
    openapiFields.add("pkiEzsigntemplateelementdependencyID");
    openapiFields.add("fkiEzsigntemplateformfieldID");
    openapiFields.add("fkiEzsigntemplatesignatureID");
    openapiFields.add("fkiEzsigntemplateformfieldIDValidation");
    openapiFields.add("fkiEzsigntemplateformfieldgroupIDValidation");
    openapiFields.add("eEzsigntemplateelementdependencyValidation");
    openapiFields.add("bEzsigntemplateelementdependencySelected");
    openapiFields.add("eEzsigntemplateelementdependencyOperator");
    openapiFields.add("sEzsigntemplateelementdependencyValue");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("pkiEzsigntemplateelementdependencyID");
    openapiRequiredFields.add("eEzsigntemplateelementdependencyValidation");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to EzsigntemplateelementdependencyResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EzsigntemplateelementdependencyResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EzsigntemplateelementdependencyResponse is not found in the empty JSON string", EzsigntemplateelementdependencyResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EzsigntemplateelementdependencyResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EzsigntemplateelementdependencyResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EzsigntemplateelementdependencyResponse.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `eEzsigntemplateelementdependencyValidation`
      FieldEEzsigntemplateelementdependencyValidation.validateJsonElement(jsonObj.get("eEzsigntemplateelementdependencyValidation"));
      // validate the optional field `eEzsigntemplateelementdependencyOperator`
      if (jsonObj.get("eEzsigntemplateelementdependencyOperator") != null && !jsonObj.get("eEzsigntemplateelementdependencyOperator").isJsonNull()) {
        FieldEEzsigntemplateelementdependencyOperator.validateJsonElement(jsonObj.get("eEzsigntemplateelementdependencyOperator"));
      }
      if ((jsonObj.get("sEzsigntemplateelementdependencyValue") != null && !jsonObj.get("sEzsigntemplateelementdependencyValue").isJsonNull()) && !jsonObj.get("sEzsigntemplateelementdependencyValue").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sEzsigntemplateelementdependencyValue` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sEzsigntemplateelementdependencyValue").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EzsigntemplateelementdependencyResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EzsigntemplateelementdependencyResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EzsigntemplateelementdependencyResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EzsigntemplateelementdependencyResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<EzsigntemplateelementdependencyResponse>() {
           @Override
           public void write(JsonWriter out, EzsigntemplateelementdependencyResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EzsigntemplateelementdependencyResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EzsigntemplateelementdependencyResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EzsigntemplateelementdependencyResponse
  * @throws IOException if the JSON string is invalid with respect to EzsigntemplateelementdependencyResponse
  */
  public static EzsigntemplateelementdependencyResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EzsigntemplateelementdependencyResponse.class);
  }

 /**
  * Convert an instance of EzsigntemplateelementdependencyResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
