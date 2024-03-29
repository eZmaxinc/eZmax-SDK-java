/*
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.18
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ezmax.api.model;

import java.util.Objects;
import java.util.Arrays;
import com.ezmax.api.model.EzsigntemplateResponseCompound;
import com.ezmax.api.model.EzsigntemplatepackageResponseCompound;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
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
import java.util.Map.Entry;
import java.util.Set;

import eZmaxAPI.JSON;

/**
 * Payload for GET /1/module/ezsign/suggestTemplates
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-22T15:33:11.356591451Z[Etc/UTC]")
public class EzsignSuggestTemplatesV1ResponseMPayload {
  public static final String SERIALIZED_NAME_A_OBJ_EZSIGNTEMPLATE = "a_objEzsigntemplate";
  @SerializedName(SERIALIZED_NAME_A_OBJ_EZSIGNTEMPLATE)
  private List<EzsigntemplateResponseCompound> aObjEzsigntemplate = new ArrayList<>();

  public static final String SERIALIZED_NAME_A_OBJ_EZSIGNTEMPLATEPACKAGE = "a_objEzsigntemplatepackage";
  @SerializedName(SERIALIZED_NAME_A_OBJ_EZSIGNTEMPLATEPACKAGE)
  private List<EzsigntemplatepackageResponseCompound> aObjEzsigntemplatepackage = new ArrayList<>();

  public EzsignSuggestTemplatesV1ResponseMPayload() {
  }

  public EzsignSuggestTemplatesV1ResponseMPayload aObjEzsigntemplate(List<EzsigntemplateResponseCompound> aObjEzsigntemplate) {
    
    this.aObjEzsigntemplate = aObjEzsigntemplate;
    return this;
  }

  public EzsignSuggestTemplatesV1ResponseMPayload addAObjEzsigntemplateItem(EzsigntemplateResponseCompound aObjEzsigntemplateItem) {
    if (this.aObjEzsigntemplate == null) {
      this.aObjEzsigntemplate = new ArrayList<>();
    }
    this.aObjEzsigntemplate.add(aObjEzsigntemplateItem);
    return this;
  }

   /**
   * Get aObjEzsigntemplate
   * @return aObjEzsigntemplate
  **/
  @javax.annotation.Nonnull
  public List<EzsigntemplateResponseCompound> getaObjEzsigntemplate() {
    return aObjEzsigntemplate;
  }


  public void setaObjEzsigntemplate(List<EzsigntemplateResponseCompound> aObjEzsigntemplate) {
    this.aObjEzsigntemplate = aObjEzsigntemplate;
  }


  public EzsignSuggestTemplatesV1ResponseMPayload aObjEzsigntemplatepackage(List<EzsigntemplatepackageResponseCompound> aObjEzsigntemplatepackage) {
    
    this.aObjEzsigntemplatepackage = aObjEzsigntemplatepackage;
    return this;
  }

  public EzsignSuggestTemplatesV1ResponseMPayload addAObjEzsigntemplatepackageItem(EzsigntemplatepackageResponseCompound aObjEzsigntemplatepackageItem) {
    if (this.aObjEzsigntemplatepackage == null) {
      this.aObjEzsigntemplatepackage = new ArrayList<>();
    }
    this.aObjEzsigntemplatepackage.add(aObjEzsigntemplatepackageItem);
    return this;
  }

   /**
   * Get aObjEzsigntemplatepackage
   * @return aObjEzsigntemplatepackage
  **/
  @javax.annotation.Nonnull
  public List<EzsigntemplatepackageResponseCompound> getaObjEzsigntemplatepackage() {
    return aObjEzsigntemplatepackage;
  }


  public void setaObjEzsigntemplatepackage(List<EzsigntemplatepackageResponseCompound> aObjEzsigntemplatepackage) {
    this.aObjEzsigntemplatepackage = aObjEzsigntemplatepackage;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignSuggestTemplatesV1ResponseMPayload ezsignSuggestTemplatesV1ResponseMPayload = (EzsignSuggestTemplatesV1ResponseMPayload) o;
    return Objects.equals(this.aObjEzsigntemplate, ezsignSuggestTemplatesV1ResponseMPayload.aObjEzsigntemplate) &&
        Objects.equals(this.aObjEzsigntemplatepackage, ezsignSuggestTemplatesV1ResponseMPayload.aObjEzsigntemplatepackage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aObjEzsigntemplate, aObjEzsigntemplatepackage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignSuggestTemplatesV1ResponseMPayload {\n");
    sb.append("    aObjEzsigntemplate: ").append(toIndentedString(aObjEzsigntemplate)).append("\n");
    sb.append("    aObjEzsigntemplatepackage: ").append(toIndentedString(aObjEzsigntemplatepackage)).append("\n");
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
    openapiFields.add("a_objEzsigntemplate");
    openapiFields.add("a_objEzsigntemplatepackage");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("a_objEzsigntemplate");
    openapiRequiredFields.add("a_objEzsigntemplatepackage");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EzsignSuggestTemplatesV1ResponseMPayload
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!EzsignSuggestTemplatesV1ResponseMPayload.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EzsignSuggestTemplatesV1ResponseMPayload is not found in the empty JSON string", EzsignSuggestTemplatesV1ResponseMPayload.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!EzsignSuggestTemplatesV1ResponseMPayload.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EzsignSuggestTemplatesV1ResponseMPayload` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EzsignSuggestTemplatesV1ResponseMPayload.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (!jsonObj.get("a_objEzsigntemplate").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `a_objEzsigntemplate` to be an array in the JSON string but got `%s`", jsonObj.get("a_objEzsigntemplate").toString()));
      }

      JsonArray jsonArrayaObjEzsigntemplate = jsonObj.getAsJsonArray("a_objEzsigntemplate");
      // validate the required field `a_objEzsigntemplate` (array)
      for (int i = 0; i < jsonArrayaObjEzsigntemplate.size(); i++) {
        EzsigntemplateResponseCompound.validateJsonObject(jsonArrayaObjEzsigntemplate.get(i).getAsJsonObject());
      };
      // ensure the json data is an array
      if (!jsonObj.get("a_objEzsigntemplatepackage").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `a_objEzsigntemplatepackage` to be an array in the JSON string but got `%s`", jsonObj.get("a_objEzsigntemplatepackage").toString()));
      }

      JsonArray jsonArrayaObjEzsigntemplatepackage = jsonObj.getAsJsonArray("a_objEzsigntemplatepackage");
      // validate the required field `a_objEzsigntemplatepackage` (array)
      for (int i = 0; i < jsonArrayaObjEzsigntemplatepackage.size(); i++) {
        EzsigntemplatepackageResponseCompound.validateJsonObject(jsonArrayaObjEzsigntemplatepackage.get(i).getAsJsonObject());
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EzsignSuggestTemplatesV1ResponseMPayload.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EzsignSuggestTemplatesV1ResponseMPayload' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EzsignSuggestTemplatesV1ResponseMPayload> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EzsignSuggestTemplatesV1ResponseMPayload.class));

       return (TypeAdapter<T>) new TypeAdapter<EzsignSuggestTemplatesV1ResponseMPayload>() {
           @Override
           public void write(JsonWriter out, EzsignSuggestTemplatesV1ResponseMPayload value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EzsignSuggestTemplatesV1ResponseMPayload read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EzsignSuggestTemplatesV1ResponseMPayload given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EzsignSuggestTemplatesV1ResponseMPayload
  * @throws IOException if the JSON string is invalid with respect to EzsignSuggestTemplatesV1ResponseMPayload
  */
  public static EzsignSuggestTemplatesV1ResponseMPayload fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EzsignSuggestTemplatesV1ResponseMPayload.class);
  }

 /**
  * Convert an instance of EzsignSuggestTemplatesV1ResponseMPayload to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

