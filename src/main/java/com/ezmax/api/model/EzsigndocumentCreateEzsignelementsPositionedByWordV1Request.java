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
import com.ezmax.api.model.CustomEzsignformfieldgroupCreateEzsignelementsPositionedByWordRequest;
import com.ezmax.api.model.CustomEzsignsignatureCreateEzsignelementsPositionedByWordRequest;
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
 * Request for POST /1/object/ezsigndocument/{pkiEzsigndocumentID}/createEzsignelementsPositionedByWord
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-28T04:04:06.974848816Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class EzsigndocumentCreateEzsignelementsPositionedByWordV1Request {
  public static final String SERIALIZED_NAME_A_OBJ_EZSIGNFORMFIELDGROUP = "a_objEzsignformfieldgroup";
  @SerializedName(SERIALIZED_NAME_A_OBJ_EZSIGNFORMFIELDGROUP)
  private List<CustomEzsignformfieldgroupCreateEzsignelementsPositionedByWordRequest> aObjEzsignformfieldgroup = new ArrayList<>();

  public static final String SERIALIZED_NAME_A_OBJ_EZSIGNSIGNATURE = "a_objEzsignsignature";
  @SerializedName(SERIALIZED_NAME_A_OBJ_EZSIGNSIGNATURE)
  private List<CustomEzsignsignatureCreateEzsignelementsPositionedByWordRequest> aObjEzsignsignature = new ArrayList<>();

  public EzsigndocumentCreateEzsignelementsPositionedByWordV1Request() {
  }

  public EzsigndocumentCreateEzsignelementsPositionedByWordV1Request aObjEzsignformfieldgroup(List<CustomEzsignformfieldgroupCreateEzsignelementsPositionedByWordRequest> aObjEzsignformfieldgroup) {
    this.aObjEzsignformfieldgroup = aObjEzsignformfieldgroup;
    return this;
  }

  public EzsigndocumentCreateEzsignelementsPositionedByWordV1Request addAObjEzsignformfieldgroupItem(CustomEzsignformfieldgroupCreateEzsignelementsPositionedByWordRequest aObjEzsignformfieldgroupItem) {
    if (this.aObjEzsignformfieldgroup == null) {
      this.aObjEzsignformfieldgroup = new ArrayList<>();
    }
    this.aObjEzsignformfieldgroup.add(aObjEzsignformfieldgroupItem);
    return this;
  }

   /**
   * Get aObjEzsignformfieldgroup
   * @return aObjEzsignformfieldgroup
  **/
  @javax.annotation.Nonnull
  public List<CustomEzsignformfieldgroupCreateEzsignelementsPositionedByWordRequest> getaObjEzsignformfieldgroup() {
    return aObjEzsignformfieldgroup;
  }

  public void setaObjEzsignformfieldgroup(List<CustomEzsignformfieldgroupCreateEzsignelementsPositionedByWordRequest> aObjEzsignformfieldgroup) {
    this.aObjEzsignformfieldgroup = aObjEzsignformfieldgroup;
  }


  public EzsigndocumentCreateEzsignelementsPositionedByWordV1Request aObjEzsignsignature(List<CustomEzsignsignatureCreateEzsignelementsPositionedByWordRequest> aObjEzsignsignature) {
    this.aObjEzsignsignature = aObjEzsignsignature;
    return this;
  }

  public EzsigndocumentCreateEzsignelementsPositionedByWordV1Request addAObjEzsignsignatureItem(CustomEzsignsignatureCreateEzsignelementsPositionedByWordRequest aObjEzsignsignatureItem) {
    if (this.aObjEzsignsignature == null) {
      this.aObjEzsignsignature = new ArrayList<>();
    }
    this.aObjEzsignsignature.add(aObjEzsignsignatureItem);
    return this;
  }

   /**
   * Get aObjEzsignsignature
   * @return aObjEzsignsignature
  **/
  @javax.annotation.Nonnull
  public List<CustomEzsignsignatureCreateEzsignelementsPositionedByWordRequest> getaObjEzsignsignature() {
    return aObjEzsignsignature;
  }

  public void setaObjEzsignsignature(List<CustomEzsignsignatureCreateEzsignelementsPositionedByWordRequest> aObjEzsignsignature) {
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
    EzsigndocumentCreateEzsignelementsPositionedByWordV1Request ezsigndocumentCreateEzsignelementsPositionedByWordV1Request = (EzsigndocumentCreateEzsignelementsPositionedByWordV1Request) o;
    return Objects.equals(this.aObjEzsignformfieldgroup, ezsigndocumentCreateEzsignelementsPositionedByWordV1Request.aObjEzsignformfieldgroup) &&
        Objects.equals(this.aObjEzsignsignature, ezsigndocumentCreateEzsignelementsPositionedByWordV1Request.aObjEzsignsignature);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aObjEzsignformfieldgroup, aObjEzsignsignature);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsigndocumentCreateEzsignelementsPositionedByWordV1Request {\n");
    sb.append("    aObjEzsignformfieldgroup: ").append(toIndentedString(aObjEzsignformfieldgroup)).append("\n");
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
    openapiFields.add("a_objEzsignformfieldgroup");
    openapiFields.add("a_objEzsignsignature");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("a_objEzsignformfieldgroup");
    openapiRequiredFields.add("a_objEzsignsignature");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to EzsigndocumentCreateEzsignelementsPositionedByWordV1Request
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EzsigndocumentCreateEzsignelementsPositionedByWordV1Request.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EzsigndocumentCreateEzsignelementsPositionedByWordV1Request is not found in the empty JSON string", EzsigndocumentCreateEzsignelementsPositionedByWordV1Request.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EzsigndocumentCreateEzsignelementsPositionedByWordV1Request.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EzsigndocumentCreateEzsignelementsPositionedByWordV1Request` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EzsigndocumentCreateEzsignelementsPositionedByWordV1Request.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("a_objEzsignformfieldgroup").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `a_objEzsignformfieldgroup` to be an array in the JSON string but got `%s`", jsonObj.get("a_objEzsignformfieldgroup").toString()));
      }

      JsonArray jsonArrayaObjEzsignformfieldgroup = jsonObj.getAsJsonArray("a_objEzsignformfieldgroup");
      // validate the required field `a_objEzsignformfieldgroup` (array)
      for (int i = 0; i < jsonArrayaObjEzsignformfieldgroup.size(); i++) {
        CustomEzsignformfieldgroupCreateEzsignelementsPositionedByWordRequest.validateJsonElement(jsonArrayaObjEzsignformfieldgroup.get(i));
      };
      // ensure the json data is an array
      if (!jsonObj.get("a_objEzsignsignature").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `a_objEzsignsignature` to be an array in the JSON string but got `%s`", jsonObj.get("a_objEzsignsignature").toString()));
      }

      JsonArray jsonArrayaObjEzsignsignature = jsonObj.getAsJsonArray("a_objEzsignsignature");
      // validate the required field `a_objEzsignsignature` (array)
      for (int i = 0; i < jsonArrayaObjEzsignsignature.size(); i++) {
        CustomEzsignsignatureCreateEzsignelementsPositionedByWordRequest.validateJsonElement(jsonArrayaObjEzsignsignature.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EzsigndocumentCreateEzsignelementsPositionedByWordV1Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EzsigndocumentCreateEzsignelementsPositionedByWordV1Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EzsigndocumentCreateEzsignelementsPositionedByWordV1Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EzsigndocumentCreateEzsignelementsPositionedByWordV1Request.class));

       return (TypeAdapter<T>) new TypeAdapter<EzsigndocumentCreateEzsignelementsPositionedByWordV1Request>() {
           @Override
           public void write(JsonWriter out, EzsigndocumentCreateEzsignelementsPositionedByWordV1Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EzsigndocumentCreateEzsignelementsPositionedByWordV1Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EzsigndocumentCreateEzsignelementsPositionedByWordV1Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EzsigndocumentCreateEzsignelementsPositionedByWordV1Request
  * @throws IOException if the JSON string is invalid with respect to EzsigndocumentCreateEzsignelementsPositionedByWordV1Request
  */
  public static EzsigndocumentCreateEzsignelementsPositionedByWordV1Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EzsigndocumentCreateEzsignelementsPositionedByWordV1Request.class);
  }

 /**
  * Convert an instance of EzsigndocumentCreateEzsignelementsPositionedByWordV1Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
