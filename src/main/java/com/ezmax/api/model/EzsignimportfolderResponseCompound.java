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
import com.ezmax.api.model.CustomEzsignimportdocumentResponse;
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
 * A Ezsignimportfolder Object
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-07T19:20:13.445471985Z[Etc/UTC]", comments = "Generator version: 7.12.0")
public class EzsignimportfolderResponseCompound {
  public static final String SERIALIZED_NAME_PKI_EZSIGNIMPORTFOLDER_I_D = "pkiEzsignimportfolderID";
  @SerializedName(SERIALIZED_NAME_PKI_EZSIGNIMPORTFOLDER_I_D)
  @javax.annotation.Nonnull
  private Integer pkiEzsignimportfolderID;

  public static final String SERIALIZED_NAME_S_EZSIGNIMPORTFOLDER_NAME = "sEzsignimportfolderName";
  @SerializedName(SERIALIZED_NAME_S_EZSIGNIMPORTFOLDER_NAME)
  @javax.annotation.Nonnull
  private String sEzsignimportfolderName;

  public static final String SERIALIZED_NAME_A_OBJ_EZSIGNIMPORTDOCUMENT = "a_objEzsignimportdocument";
  @SerializedName(SERIALIZED_NAME_A_OBJ_EZSIGNIMPORTDOCUMENT)
  @javax.annotation.Nullable
  private List<CustomEzsignimportdocumentResponse> aObjEzsignimportdocument = new ArrayList<>();

  public EzsignimportfolderResponseCompound() {
  }

  public EzsignimportfolderResponseCompound pkiEzsignimportfolderID(@javax.annotation.Nonnull Integer pkiEzsignimportfolderID) {
    this.pkiEzsignimportfolderID = pkiEzsignimportfolderID;
    return this;
  }

  /**
   * The unique ID of the Ezsignimportfolder
   * minimum: 0
   * maximum: 16777215
   * @return pkiEzsignimportfolderID
   */
  @javax.annotation.Nonnull
  public Integer getPkiEzsignimportfolderID() {
    return pkiEzsignimportfolderID;
  }

  public void setPkiEzsignimportfolderID(@javax.annotation.Nonnull Integer pkiEzsignimportfolderID) {
    this.pkiEzsignimportfolderID = pkiEzsignimportfolderID;
  }


  public EzsignimportfolderResponseCompound sEzsignimportfolderName(@javax.annotation.Nonnull String sEzsignimportfolderName) {
    this.sEzsignimportfolderName = sEzsignimportfolderName;
    return this;
  }

  /**
   * The name of the Ezsignimportfolder
   * @return sEzsignimportfolderName
   */
  @javax.annotation.Nonnull
  public String getsEzsignimportfolderName() {
    return sEzsignimportfolderName;
  }

  public void setsEzsignimportfolderName(@javax.annotation.Nonnull String sEzsignimportfolderName) {
    this.sEzsignimportfolderName = sEzsignimportfolderName;
  }


  public EzsignimportfolderResponseCompound aObjEzsignimportdocument(@javax.annotation.Nullable List<CustomEzsignimportdocumentResponse> aObjEzsignimportdocument) {
    this.aObjEzsignimportdocument = aObjEzsignimportdocument;
    return this;
  }

  public EzsignimportfolderResponseCompound addAObjEzsignimportdocumentItem(CustomEzsignimportdocumentResponse aObjEzsignimportdocumentItem) {
    if (this.aObjEzsignimportdocument == null) {
      this.aObjEzsignimportdocument = new ArrayList<>();
    }
    this.aObjEzsignimportdocument.add(aObjEzsignimportdocumentItem);
    return this;
  }

  /**
   * Get aObjEzsignimportdocument
   * @return aObjEzsignimportdocument
   */
  @javax.annotation.Nullable
  public List<CustomEzsignimportdocumentResponse> getaObjEzsignimportdocument() {
    return aObjEzsignimportdocument;
  }

  public void setaObjEzsignimportdocument(@javax.annotation.Nullable List<CustomEzsignimportdocumentResponse> aObjEzsignimportdocument) {
    this.aObjEzsignimportdocument = aObjEzsignimportdocument;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignimportfolderResponseCompound ezsignimportfolderResponseCompound = (EzsignimportfolderResponseCompound) o;
    return Objects.equals(this.pkiEzsignimportfolderID, ezsignimportfolderResponseCompound.pkiEzsignimportfolderID) &&
        Objects.equals(this.sEzsignimportfolderName, ezsignimportfolderResponseCompound.sEzsignimportfolderName) &&
        Objects.equals(this.aObjEzsignimportdocument, ezsignimportfolderResponseCompound.aObjEzsignimportdocument);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pkiEzsignimportfolderID, sEzsignimportfolderName, aObjEzsignimportdocument);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignimportfolderResponseCompound {\n");
    sb.append("    pkiEzsignimportfolderID: ").append(toIndentedString(pkiEzsignimportfolderID)).append("\n");
    sb.append("    sEzsignimportfolderName: ").append(toIndentedString(sEzsignimportfolderName)).append("\n");
    sb.append("    aObjEzsignimportdocument: ").append(toIndentedString(aObjEzsignimportdocument)).append("\n");
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
    openapiFields.add("pkiEzsignimportfolderID");
    openapiFields.add("sEzsignimportfolderName");
    openapiFields.add("a_objEzsignimportdocument");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("pkiEzsignimportfolderID");
    openapiRequiredFields.add("sEzsignimportfolderName");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EzsignimportfolderResponseCompound
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EzsignimportfolderResponseCompound.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EzsignimportfolderResponseCompound is not found in the empty JSON string", EzsignimportfolderResponseCompound.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EzsignimportfolderResponseCompound.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EzsignimportfolderResponseCompound` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EzsignimportfolderResponseCompound.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("sEzsignimportfolderName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sEzsignimportfolderName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sEzsignimportfolderName").toString()));
      }
      if (jsonObj.get("a_objEzsignimportdocument") != null && !jsonObj.get("a_objEzsignimportdocument").isJsonNull()) {
        JsonArray jsonArrayaObjEzsignimportdocument = jsonObj.getAsJsonArray("a_objEzsignimportdocument");
        if (jsonArrayaObjEzsignimportdocument != null) {
          // ensure the json data is an array
          if (!jsonObj.get("a_objEzsignimportdocument").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `a_objEzsignimportdocument` to be an array in the JSON string but got `%s`", jsonObj.get("a_objEzsignimportdocument").toString()));
          }

          // validate the optional field `a_objEzsignimportdocument` (array)
          for (int i = 0; i < jsonArrayaObjEzsignimportdocument.size(); i++) {
            CustomEzsignimportdocumentResponse.validateJsonElement(jsonArrayaObjEzsignimportdocument.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EzsignimportfolderResponseCompound.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EzsignimportfolderResponseCompound' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EzsignimportfolderResponseCompound> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EzsignimportfolderResponseCompound.class));

       return (TypeAdapter<T>) new TypeAdapter<EzsignimportfolderResponseCompound>() {
           @Override
           public void write(JsonWriter out, EzsignimportfolderResponseCompound value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EzsignimportfolderResponseCompound read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EzsignimportfolderResponseCompound given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EzsignimportfolderResponseCompound
   * @throws IOException if the JSON string is invalid with respect to EzsignimportfolderResponseCompound
   */
  public static EzsignimportfolderResponseCompound fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EzsignimportfolderResponseCompound.class);
  }

  /**
   * Convert an instance of EzsignimportfolderResponseCompound to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

