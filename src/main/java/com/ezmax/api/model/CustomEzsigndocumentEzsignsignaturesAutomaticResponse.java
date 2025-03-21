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
import com.ezmax.api.model.CustomEzsignsignatureEzsignsignaturesAutomaticResponse;
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
 * An Ezsigndocument Object in the context of an EzsignsignaturesAutomatic path
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-07T19:20:13.445471985Z[Etc/UTC]", comments = "Generator version: 7.12.0")
public class CustomEzsigndocumentEzsignsignaturesAutomaticResponse {
  public static final String SERIALIZED_NAME_PKI_EZSIGNDOCUMENT_I_D = "pkiEzsigndocumentID";
  @SerializedName(SERIALIZED_NAME_PKI_EZSIGNDOCUMENT_I_D)
  @javax.annotation.Nonnull
  private Integer pkiEzsigndocumentID;

  public static final String SERIALIZED_NAME_S_EZSIGNDOCUMENT_NAME = "sEzsigndocumentName";
  @SerializedName(SERIALIZED_NAME_S_EZSIGNDOCUMENT_NAME)
  @javax.annotation.Nonnull
  private String sEzsigndocumentName;

  public static final String SERIALIZED_NAME_A_OBJ_EZSIGNSIGNATURE = "a_objEzsignsignature";
  @SerializedName(SERIALIZED_NAME_A_OBJ_EZSIGNSIGNATURE)
  @javax.annotation.Nonnull
  private List<CustomEzsignsignatureEzsignsignaturesAutomaticResponse> aObjEzsignsignature = new ArrayList<>();

  public CustomEzsigndocumentEzsignsignaturesAutomaticResponse() {
  }

  public CustomEzsigndocumentEzsignsignaturesAutomaticResponse pkiEzsigndocumentID(@javax.annotation.Nonnull Integer pkiEzsigndocumentID) {
    this.pkiEzsigndocumentID = pkiEzsigndocumentID;
    return this;
  }

  /**
   * The unique ID of the Ezsigndocument
   * minimum: 0
   * @return pkiEzsigndocumentID
   */
  @javax.annotation.Nonnull
  public Integer getPkiEzsigndocumentID() {
    return pkiEzsigndocumentID;
  }

  public void setPkiEzsigndocumentID(@javax.annotation.Nonnull Integer pkiEzsigndocumentID) {
    this.pkiEzsigndocumentID = pkiEzsigndocumentID;
  }


  public CustomEzsigndocumentEzsignsignaturesAutomaticResponse sEzsigndocumentName(@javax.annotation.Nonnull String sEzsigndocumentName) {
    this.sEzsigndocumentName = sEzsigndocumentName;
    return this;
  }

  /**
   * The name of the document that will be presented to Ezsignfoldersignerassociations
   * @return sEzsigndocumentName
   */
  @javax.annotation.Nonnull
  public String getsEzsigndocumentName() {
    return sEzsigndocumentName;
  }

  public void setsEzsigndocumentName(@javax.annotation.Nonnull String sEzsigndocumentName) {
    this.sEzsigndocumentName = sEzsigndocumentName;
  }


  public CustomEzsigndocumentEzsignsignaturesAutomaticResponse aObjEzsignsignature(@javax.annotation.Nonnull List<CustomEzsignsignatureEzsignsignaturesAutomaticResponse> aObjEzsignsignature) {
    this.aObjEzsignsignature = aObjEzsignsignature;
    return this;
  }

  public CustomEzsigndocumentEzsignsignaturesAutomaticResponse addAObjEzsignsignatureItem(CustomEzsignsignatureEzsignsignaturesAutomaticResponse aObjEzsignsignatureItem) {
    if (this.aObjEzsignsignature == null) {
      this.aObjEzsignsignature = new ArrayList<>();
    }
    this.aObjEzsignsignature.add(aObjEzsignsignatureItem);
    return this;
  }

  /**
   * Get aObjEzsignsignature
   * @return aObjEzsignsignature
   */
  @javax.annotation.Nonnull
  public List<CustomEzsignsignatureEzsignsignaturesAutomaticResponse> getaObjEzsignsignature() {
    return aObjEzsignsignature;
  }

  public void setaObjEzsignsignature(@javax.annotation.Nonnull List<CustomEzsignsignatureEzsignsignaturesAutomaticResponse> aObjEzsignsignature) {
    this.aObjEzsignsignature = aObjEzsignsignature;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomEzsigndocumentEzsignsignaturesAutomaticResponse customEzsigndocumentEzsignsignaturesAutomaticResponse = (CustomEzsigndocumentEzsignsignaturesAutomaticResponse) o;
    return Objects.equals(this.pkiEzsigndocumentID, customEzsigndocumentEzsignsignaturesAutomaticResponse.pkiEzsigndocumentID) &&
        Objects.equals(this.sEzsigndocumentName, customEzsigndocumentEzsignsignaturesAutomaticResponse.sEzsigndocumentName) &&
        Objects.equals(this.aObjEzsignsignature, customEzsigndocumentEzsignsignaturesAutomaticResponse.aObjEzsignsignature);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pkiEzsigndocumentID, sEzsigndocumentName, aObjEzsignsignature);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomEzsigndocumentEzsignsignaturesAutomaticResponse {\n");
    sb.append("    pkiEzsigndocumentID: ").append(toIndentedString(pkiEzsigndocumentID)).append("\n");
    sb.append("    sEzsigndocumentName: ").append(toIndentedString(sEzsigndocumentName)).append("\n");
    sb.append("    aObjEzsignsignature: ").append(toIndentedString(aObjEzsignsignature)).append("\n");
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
    openapiFields.add("pkiEzsigndocumentID");
    openapiFields.add("sEzsigndocumentName");
    openapiFields.add("a_objEzsignsignature");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("pkiEzsigndocumentID");
    openapiRequiredFields.add("sEzsigndocumentName");
    openapiRequiredFields.add("a_objEzsignsignature");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CustomEzsigndocumentEzsignsignaturesAutomaticResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CustomEzsigndocumentEzsignsignaturesAutomaticResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CustomEzsigndocumentEzsignsignaturesAutomaticResponse is not found in the empty JSON string", CustomEzsigndocumentEzsignsignaturesAutomaticResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CustomEzsigndocumentEzsignsignaturesAutomaticResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CustomEzsigndocumentEzsignsignaturesAutomaticResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CustomEzsigndocumentEzsignsignaturesAutomaticResponse.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("sEzsigndocumentName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sEzsigndocumentName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sEzsigndocumentName").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("a_objEzsignsignature").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `a_objEzsignsignature` to be an array in the JSON string but got `%s`", jsonObj.get("a_objEzsignsignature").toString()));
      }

      JsonArray jsonArrayaObjEzsignsignature = jsonObj.getAsJsonArray("a_objEzsignsignature");
      // validate the required field `a_objEzsignsignature` (array)
      for (int i = 0; i < jsonArrayaObjEzsignsignature.size(); i++) {
        CustomEzsignsignatureEzsignsignaturesAutomaticResponse.validateJsonElement(jsonArrayaObjEzsignsignature.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CustomEzsigndocumentEzsignsignaturesAutomaticResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CustomEzsigndocumentEzsignsignaturesAutomaticResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CustomEzsigndocumentEzsignsignaturesAutomaticResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CustomEzsigndocumentEzsignsignaturesAutomaticResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<CustomEzsigndocumentEzsignsignaturesAutomaticResponse>() {
           @Override
           public void write(JsonWriter out, CustomEzsigndocumentEzsignsignaturesAutomaticResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CustomEzsigndocumentEzsignsignaturesAutomaticResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CustomEzsigndocumentEzsignsignaturesAutomaticResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CustomEzsigndocumentEzsignsignaturesAutomaticResponse
   * @throws IOException if the JSON string is invalid with respect to CustomEzsigndocumentEzsignsignaturesAutomaticResponse
   */
  public static CustomEzsigndocumentEzsignsignaturesAutomaticResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CustomEzsigndocumentEzsignsignaturesAutomaticResponse.class);
  }

  /**
   * Convert an instance of CustomEzsigndocumentEzsignsignaturesAutomaticResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

