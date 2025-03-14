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
import com.ezmax.api.model.FieldEVariableexpenseTaxable;
import com.ezmax.api.model.MultilingualVariableexpenseDescription;
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
 * A Variableexpense Object
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-07T19:20:13.445471985Z[Etc/UTC]", comments = "Generator version: 7.12.0")
public class VariableexpenseRequest {
  public static final String SERIALIZED_NAME_PKI_VARIABLEEXPENSE_I_D = "pkiVariableexpenseID";
  @SerializedName(SERIALIZED_NAME_PKI_VARIABLEEXPENSE_I_D)
  @javax.annotation.Nullable
  private Integer pkiVariableexpenseID;

  public static final String SERIALIZED_NAME_S_VARIABLEEXPENSE_CODE = "sVariableexpenseCode";
  @SerializedName(SERIALIZED_NAME_S_VARIABLEEXPENSE_CODE)
  @javax.annotation.Nonnull
  private String sVariableexpenseCode;

  public static final String SERIALIZED_NAME_OBJ_VARIABLEEXPENSE_DESCRIPTION = "objVariableexpenseDescription";
  @SerializedName(SERIALIZED_NAME_OBJ_VARIABLEEXPENSE_DESCRIPTION)
  @javax.annotation.Nonnull
  private MultilingualVariableexpenseDescription objVariableexpenseDescription;

  public static final String SERIALIZED_NAME_E_VARIABLEEXPENSE_TAXABLE = "eVariableexpenseTaxable";
  @SerializedName(SERIALIZED_NAME_E_VARIABLEEXPENSE_TAXABLE)
  @javax.annotation.Nonnull
  private FieldEVariableexpenseTaxable eVariableexpenseTaxable;

  public static final String SERIALIZED_NAME_B_VARIABLEEXPENSE_ISACTIVE = "bVariableexpenseIsactive";
  @SerializedName(SERIALIZED_NAME_B_VARIABLEEXPENSE_ISACTIVE)
  @javax.annotation.Nonnull
  private Boolean bVariableexpenseIsactive;

  public VariableexpenseRequest() {
  }

  public VariableexpenseRequest pkiVariableexpenseID(@javax.annotation.Nullable Integer pkiVariableexpenseID) {
    this.pkiVariableexpenseID = pkiVariableexpenseID;
    return this;
  }

  /**
   * The unique ID of the Variableexpense
   * minimum: 1
   * maximum: 255
   * @return pkiVariableexpenseID
   */
  @javax.annotation.Nullable
  public Integer getPkiVariableexpenseID() {
    return pkiVariableexpenseID;
  }

  public void setPkiVariableexpenseID(@javax.annotation.Nullable Integer pkiVariableexpenseID) {
    this.pkiVariableexpenseID = pkiVariableexpenseID;
  }


  public VariableexpenseRequest sVariableexpenseCode(@javax.annotation.Nonnull String sVariableexpenseCode) {
    this.sVariableexpenseCode = sVariableexpenseCode;
    return this;
  }

  /**
   * The code of the Variableexpense
   * @return sVariableexpenseCode
   */
  @javax.annotation.Nonnull
  public String getsVariableexpenseCode() {
    return sVariableexpenseCode;
  }

  public void setsVariableexpenseCode(@javax.annotation.Nonnull String sVariableexpenseCode) {
    this.sVariableexpenseCode = sVariableexpenseCode;
  }


  public VariableexpenseRequest objVariableexpenseDescription(@javax.annotation.Nonnull MultilingualVariableexpenseDescription objVariableexpenseDescription) {
    this.objVariableexpenseDescription = objVariableexpenseDescription;
    return this;
  }

  /**
   * Get objVariableexpenseDescription
   * @return objVariableexpenseDescription
   */
  @javax.annotation.Nonnull
  public MultilingualVariableexpenseDescription getObjVariableexpenseDescription() {
    return objVariableexpenseDescription;
  }

  public void setObjVariableexpenseDescription(@javax.annotation.Nonnull MultilingualVariableexpenseDescription objVariableexpenseDescription) {
    this.objVariableexpenseDescription = objVariableexpenseDescription;
  }


  public VariableexpenseRequest eVariableexpenseTaxable(@javax.annotation.Nonnull FieldEVariableexpenseTaxable eVariableexpenseTaxable) {
    this.eVariableexpenseTaxable = eVariableexpenseTaxable;
    return this;
  }

  /**
   * Get eVariableexpenseTaxable
   * @return eVariableexpenseTaxable
   */
  @javax.annotation.Nonnull
  public FieldEVariableexpenseTaxable geteVariableexpenseTaxable() {
    return eVariableexpenseTaxable;
  }

  public void seteVariableexpenseTaxable(@javax.annotation.Nonnull FieldEVariableexpenseTaxable eVariableexpenseTaxable) {
    this.eVariableexpenseTaxable = eVariableexpenseTaxable;
  }


  public VariableexpenseRequest bVariableexpenseIsactive(@javax.annotation.Nonnull Boolean bVariableexpenseIsactive) {
    this.bVariableexpenseIsactive = bVariableexpenseIsactive;
    return this;
  }

  /**
   * Whether the variableexpense is active or not
   * @return bVariableexpenseIsactive
   */
  @javax.annotation.Nonnull
  public Boolean getbVariableexpenseIsactive() {
    return bVariableexpenseIsactive;
  }

  public void setbVariableexpenseIsactive(@javax.annotation.Nonnull Boolean bVariableexpenseIsactive) {
    this.bVariableexpenseIsactive = bVariableexpenseIsactive;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VariableexpenseRequest variableexpenseRequest = (VariableexpenseRequest) o;
    return Objects.equals(this.pkiVariableexpenseID, variableexpenseRequest.pkiVariableexpenseID) &&
        Objects.equals(this.sVariableexpenseCode, variableexpenseRequest.sVariableexpenseCode) &&
        Objects.equals(this.objVariableexpenseDescription, variableexpenseRequest.objVariableexpenseDescription) &&
        Objects.equals(this.eVariableexpenseTaxable, variableexpenseRequest.eVariableexpenseTaxable) &&
        Objects.equals(this.bVariableexpenseIsactive, variableexpenseRequest.bVariableexpenseIsactive);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pkiVariableexpenseID, sVariableexpenseCode, objVariableexpenseDescription, eVariableexpenseTaxable, bVariableexpenseIsactive);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VariableexpenseRequest {\n");
    sb.append("    pkiVariableexpenseID: ").append(toIndentedString(pkiVariableexpenseID)).append("\n");
    sb.append("    sVariableexpenseCode: ").append(toIndentedString(sVariableexpenseCode)).append("\n");
    sb.append("    objVariableexpenseDescription: ").append(toIndentedString(objVariableexpenseDescription)).append("\n");
    sb.append("    eVariableexpenseTaxable: ").append(toIndentedString(eVariableexpenseTaxable)).append("\n");
    sb.append("    bVariableexpenseIsactive: ").append(toIndentedString(bVariableexpenseIsactive)).append("\n");
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
    openapiFields.add("pkiVariableexpenseID");
    openapiFields.add("sVariableexpenseCode");
    openapiFields.add("objVariableexpenseDescription");
    openapiFields.add("eVariableexpenseTaxable");
    openapiFields.add("bVariableexpenseIsactive");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("sVariableexpenseCode");
    openapiRequiredFields.add("objVariableexpenseDescription");
    openapiRequiredFields.add("eVariableexpenseTaxable");
    openapiRequiredFields.add("bVariableexpenseIsactive");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to VariableexpenseRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!VariableexpenseRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in VariableexpenseRequest is not found in the empty JSON string", VariableexpenseRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!VariableexpenseRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `VariableexpenseRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : VariableexpenseRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("sVariableexpenseCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sVariableexpenseCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sVariableexpenseCode").toString()));
      }
      // validate the required field `objVariableexpenseDescription`
      MultilingualVariableexpenseDescription.validateJsonElement(jsonObj.get("objVariableexpenseDescription"));
      // validate the required field `eVariableexpenseTaxable`
      FieldEVariableexpenseTaxable.validateJsonElement(jsonObj.get("eVariableexpenseTaxable"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VariableexpenseRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VariableexpenseRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VariableexpenseRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VariableexpenseRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<VariableexpenseRequest>() {
           @Override
           public void write(JsonWriter out, VariableexpenseRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public VariableexpenseRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of VariableexpenseRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of VariableexpenseRequest
   * @throws IOException if the JSON string is invalid with respect to VariableexpenseRequest
   */
  public static VariableexpenseRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VariableexpenseRequest.class);
  }

  /**
   * Convert an instance of VariableexpenseRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

