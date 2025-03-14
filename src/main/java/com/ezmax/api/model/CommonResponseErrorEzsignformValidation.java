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
import com.ezmax.api.model.CustomEzsignformfielderrorResponse;
import com.ezmax.api.model.FieldEErrorCode;
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

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import eZmaxAPI.JSON;

/**
 * Generic Error Message
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-07T19:20:13.445471985Z[Etc/UTC]", comments = "Generator version: 7.12.0")
public class CommonResponseErrorEzsignformValidation {
  public static final String SERIALIZED_NAME_S_ERROR_MESSAGE = "sErrorMessage";
  @SerializedName(SERIALIZED_NAME_S_ERROR_MESSAGE)
  @javax.annotation.Nonnull
  private String sErrorMessage;

  public static final String SERIALIZED_NAME_E_ERROR_CODE = "eErrorCode";
  @SerializedName(SERIALIZED_NAME_E_ERROR_CODE)
  @javax.annotation.Nonnull
  private FieldEErrorCode eErrorCode;

  public static final String SERIALIZED_NAME_A_S_ERROR_MESSAGEDETAIL = "a_sErrorMessagedetail";
  @SerializedName(SERIALIZED_NAME_A_S_ERROR_MESSAGEDETAIL)
  @javax.annotation.Nullable
  private List<String> aSErrorMessagedetail = new ArrayList<>();

  public static final String SERIALIZED_NAME_A_OBJ_EZSIGNFORMFIELDERROR = "a_objEzsignformfielderror";
  @SerializedName(SERIALIZED_NAME_A_OBJ_EZSIGNFORMFIELDERROR)
  @javax.annotation.Nonnull
  private List<CustomEzsignformfielderrorResponse> aObjEzsignformfielderror = new ArrayList<>();

  public CommonResponseErrorEzsignformValidation() {
  }

  public CommonResponseErrorEzsignformValidation sErrorMessage(@javax.annotation.Nonnull String sErrorMessage) {
    this.sErrorMessage = sErrorMessage;
    return this;
  }

  /**
   * The message giving details about the error
   * @return sErrorMessage
   */
  @javax.annotation.Nonnull
  public String getsErrorMessage() {
    return sErrorMessage;
  }

  public void setsErrorMessage(@javax.annotation.Nonnull String sErrorMessage) {
    this.sErrorMessage = sErrorMessage;
  }


  public CommonResponseErrorEzsignformValidation eErrorCode(@javax.annotation.Nonnull FieldEErrorCode eErrorCode) {
    this.eErrorCode = eErrorCode;
    return this;
  }

  /**
   * Get eErrorCode
   * @return eErrorCode
   */
  @javax.annotation.Nonnull
  public FieldEErrorCode geteErrorCode() {
    return eErrorCode;
  }

  public void seteErrorCode(@javax.annotation.Nonnull FieldEErrorCode eErrorCode) {
    this.eErrorCode = eErrorCode;
  }


  public CommonResponseErrorEzsignformValidation aSErrorMessagedetail(@javax.annotation.Nullable List<String> aSErrorMessagedetail) {
    this.aSErrorMessagedetail = aSErrorMessagedetail;
    return this;
  }

  public CommonResponseErrorEzsignformValidation addASErrorMessagedetailItem(String aSErrorMessagedetailItem) {
    if (this.aSErrorMessagedetail == null) {
      this.aSErrorMessagedetail = new ArrayList<>();
    }
    this.aSErrorMessagedetail.add(aSErrorMessagedetailItem);
    return this;
  }

  /**
   * More error message detail
   * @return aSErrorMessagedetail
   */
  @javax.annotation.Nullable
  public List<String> getaSErrorMessagedetail() {
    return aSErrorMessagedetail;
  }

  public void setaSErrorMessagedetail(@javax.annotation.Nullable List<String> aSErrorMessagedetail) {
    this.aSErrorMessagedetail = aSErrorMessagedetail;
  }


  public CommonResponseErrorEzsignformValidation aObjEzsignformfielderror(@javax.annotation.Nonnull List<CustomEzsignformfielderrorResponse> aObjEzsignformfielderror) {
    this.aObjEzsignformfielderror = aObjEzsignformfielderror;
    return this;
  }

  public CommonResponseErrorEzsignformValidation addAObjEzsignformfielderrorItem(CustomEzsignformfielderrorResponse aObjEzsignformfielderrorItem) {
    if (this.aObjEzsignformfielderror == null) {
      this.aObjEzsignformfielderror = new ArrayList<>();
    }
    this.aObjEzsignformfielderror.add(aObjEzsignformfielderrorItem);
    return this;
  }

  /**
   * 
   * @return aObjEzsignformfielderror
   */
  @javax.annotation.Nonnull
  public List<CustomEzsignformfielderrorResponse> getaObjEzsignformfielderror() {
    return aObjEzsignformfielderror;
  }

  public void setaObjEzsignformfielderror(@javax.annotation.Nonnull List<CustomEzsignformfielderrorResponse> aObjEzsignformfielderror) {
    this.aObjEzsignformfielderror = aObjEzsignformfielderror;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommonResponseErrorEzsignformValidation commonResponseErrorEzsignformValidation = (CommonResponseErrorEzsignformValidation) o;
    return Objects.equals(this.sErrorMessage, commonResponseErrorEzsignformValidation.sErrorMessage) &&
        Objects.equals(this.eErrorCode, commonResponseErrorEzsignformValidation.eErrorCode) &&
        Objects.equals(this.aSErrorMessagedetail, commonResponseErrorEzsignformValidation.aSErrorMessagedetail) &&
        Objects.equals(this.aObjEzsignformfielderror, commonResponseErrorEzsignformValidation.aObjEzsignformfielderror);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sErrorMessage, eErrorCode, aSErrorMessagedetail, aObjEzsignformfielderror);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommonResponseErrorEzsignformValidation {\n");
    sb.append("    sErrorMessage: ").append(toIndentedString(sErrorMessage)).append("\n");
    sb.append("    eErrorCode: ").append(toIndentedString(eErrorCode)).append("\n");
    sb.append("    aSErrorMessagedetail: ").append(toIndentedString(aSErrorMessagedetail)).append("\n");
    sb.append("    aObjEzsignformfielderror: ").append(toIndentedString(aObjEzsignformfielderror)).append("\n");
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
    openapiFields.add("sErrorMessage");
    openapiFields.add("eErrorCode");
    openapiFields.add("a_sErrorMessagedetail");
    openapiFields.add("a_objEzsignformfielderror");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("sErrorMessage");
    openapiRequiredFields.add("eErrorCode");
    openapiRequiredFields.add("a_objEzsignformfielderror");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CommonResponseErrorEzsignformValidation
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CommonResponseErrorEzsignformValidation.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CommonResponseErrorEzsignformValidation is not found in the empty JSON string", CommonResponseErrorEzsignformValidation.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CommonResponseErrorEzsignformValidation.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CommonResponseErrorEzsignformValidation` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CommonResponseErrorEzsignformValidation.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("sErrorMessage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sErrorMessage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sErrorMessage").toString()));
      }
      // validate the required field `eErrorCode`
      FieldEErrorCode.validateJsonElement(jsonObj.get("eErrorCode"));
      // ensure the optional json data is an array if present
      if (jsonObj.get("a_sErrorMessagedetail") != null && !jsonObj.get("a_sErrorMessagedetail").isJsonNull() && !jsonObj.get("a_sErrorMessagedetail").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `a_sErrorMessagedetail` to be an array in the JSON string but got `%s`", jsonObj.get("a_sErrorMessagedetail").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("a_objEzsignformfielderror").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `a_objEzsignformfielderror` to be an array in the JSON string but got `%s`", jsonObj.get("a_objEzsignformfielderror").toString()));
      }

      JsonArray jsonArrayaObjEzsignformfielderror = jsonObj.getAsJsonArray("a_objEzsignformfielderror");
      // validate the required field `a_objEzsignformfielderror` (array)
      for (int i = 0; i < jsonArrayaObjEzsignformfielderror.size(); i++) {
        CustomEzsignformfielderrorResponse.validateJsonElement(jsonArrayaObjEzsignformfielderror.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CommonResponseErrorEzsignformValidation.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CommonResponseErrorEzsignformValidation' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CommonResponseErrorEzsignformValidation> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CommonResponseErrorEzsignformValidation.class));

       return (TypeAdapter<T>) new TypeAdapter<CommonResponseErrorEzsignformValidation>() {
           @Override
           public void write(JsonWriter out, CommonResponseErrorEzsignformValidation value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CommonResponseErrorEzsignformValidation read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CommonResponseErrorEzsignformValidation given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CommonResponseErrorEzsignformValidation
   * @throws IOException if the JSON string is invalid with respect to CommonResponseErrorEzsignformValidation
   */
  public static CommonResponseErrorEzsignformValidation fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CommonResponseErrorEzsignformValidation.class);
  }

  /**
   * Convert an instance of CommonResponseErrorEzsignformValidation to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

