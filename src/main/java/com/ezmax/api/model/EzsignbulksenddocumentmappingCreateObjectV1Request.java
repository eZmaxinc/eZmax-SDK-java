/*
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.8
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ezmax.api.model;

import java.util.Objects;
import java.util.Arrays;
import com.ezmax.api.model.EzsignbulksenddocumentmappingRequestCompound;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import eZmaxAPI.JSON;

/**
 * Request for POST /1/object/ezsignbulksenddocumentmapping
 */
@ApiModel(description = "Request for POST /1/object/ezsignbulksenddocumentmapping")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-20T16:59:39.826205Z[Etc/UTC]")
public class EzsignbulksenddocumentmappingCreateObjectV1Request {
  public static final String SERIALIZED_NAME_A_OBJ_EZSIGNBULKSENDDOCUMENTMAPPING = "a_objEzsignbulksenddocumentmapping";
  @SerializedName(SERIALIZED_NAME_A_OBJ_EZSIGNBULKSENDDOCUMENTMAPPING)
  private List<EzsignbulksenddocumentmappingRequestCompound> aObjEzsignbulksenddocumentmapping = new ArrayList<>();

  public EzsignbulksenddocumentmappingCreateObjectV1Request() { 
  }

  public EzsignbulksenddocumentmappingCreateObjectV1Request aObjEzsignbulksenddocumentmapping(List<EzsignbulksenddocumentmappingRequestCompound> aObjEzsignbulksenddocumentmapping) {
    
    this.aObjEzsignbulksenddocumentmapping = aObjEzsignbulksenddocumentmapping;
    return this;
  }

  public EzsignbulksenddocumentmappingCreateObjectV1Request addAObjEzsignbulksenddocumentmappingItem(EzsignbulksenddocumentmappingRequestCompound aObjEzsignbulksenddocumentmappingItem) {
    this.aObjEzsignbulksenddocumentmapping.add(aObjEzsignbulksenddocumentmappingItem);
    return this;
  }

   /**
   * Get aObjEzsignbulksenddocumentmapping
   * @return aObjEzsignbulksenddocumentmapping
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<EzsignbulksenddocumentmappingRequestCompound> getaObjEzsignbulksenddocumentmapping() {
    return aObjEzsignbulksenddocumentmapping;
  }


  public void setaObjEzsignbulksenddocumentmapping(List<EzsignbulksenddocumentmappingRequestCompound> aObjEzsignbulksenddocumentmapping) {
    this.aObjEzsignbulksenddocumentmapping = aObjEzsignbulksenddocumentmapping;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignbulksenddocumentmappingCreateObjectV1Request ezsignbulksenddocumentmappingCreateObjectV1Request = (EzsignbulksenddocumentmappingCreateObjectV1Request) o;
    return Objects.equals(this.aObjEzsignbulksenddocumentmapping, ezsignbulksenddocumentmappingCreateObjectV1Request.aObjEzsignbulksenddocumentmapping);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aObjEzsignbulksenddocumentmapping);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignbulksenddocumentmappingCreateObjectV1Request {\n");
    sb.append("    aObjEzsignbulksenddocumentmapping: ").append(toIndentedString(aObjEzsignbulksenddocumentmapping)).append("\n");
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
    openapiFields.add("a_objEzsignbulksenddocumentmapping");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("a_objEzsignbulksenddocumentmapping");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EzsignbulksenddocumentmappingCreateObjectV1Request
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (EzsignbulksenddocumentmappingCreateObjectV1Request.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in EzsignbulksenddocumentmappingCreateObjectV1Request is not found in the empty JSON string", EzsignbulksenddocumentmappingCreateObjectV1Request.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!EzsignbulksenddocumentmappingCreateObjectV1Request.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EzsignbulksenddocumentmappingCreateObjectV1Request` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EzsignbulksenddocumentmappingCreateObjectV1Request.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      JsonArray jsonArrayaObjEzsignbulksenddocumentmapping = jsonObj.getAsJsonArray("a_objEzsignbulksenddocumentmapping");
      if (jsonArrayaObjEzsignbulksenddocumentmapping != null) {
        // ensure the json data is an array
        if (!jsonObj.get("a_objEzsignbulksenddocumentmapping").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `a_objEzsignbulksenddocumentmapping` to be an array in the JSON string but got `%s`", jsonObj.get("a_objEzsignbulksenddocumentmapping").toString()));
        }

        // validate the optional field `a_objEzsignbulksenddocumentmapping` (array)
        for (int i = 0; i < jsonArrayaObjEzsignbulksenddocumentmapping.size(); i++) {
          EzsignbulksenddocumentmappingRequestCompound.validateJsonObject(jsonArrayaObjEzsignbulksenddocumentmapping.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EzsignbulksenddocumentmappingCreateObjectV1Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EzsignbulksenddocumentmappingCreateObjectV1Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EzsignbulksenddocumentmappingCreateObjectV1Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EzsignbulksenddocumentmappingCreateObjectV1Request.class));

       return (TypeAdapter<T>) new TypeAdapter<EzsignbulksenddocumentmappingCreateObjectV1Request>() {
           @Override
           public void write(JsonWriter out, EzsignbulksenddocumentmappingCreateObjectV1Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EzsignbulksenddocumentmappingCreateObjectV1Request read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EzsignbulksenddocumentmappingCreateObjectV1Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EzsignbulksenddocumentmappingCreateObjectV1Request
  * @throws IOException if the JSON string is invalid with respect to EzsignbulksenddocumentmappingCreateObjectV1Request
  */
  public static EzsignbulksenddocumentmappingCreateObjectV1Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EzsignbulksenddocumentmappingCreateObjectV1Request.class);
  }

 /**
  * Convert an instance of EzsignbulksenddocumentmappingCreateObjectV1Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
