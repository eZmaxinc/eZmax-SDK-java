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
import com.ezmax.api.model.EzsigntemplatedocumentRequestCompound;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

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
 * Request for PUT /1/object/ezsigntemplatedocument/{pkiEzsigntemplatedocumentID}
 */
@ApiModel(description = "Request for PUT /1/object/ezsigntemplatedocument/{pkiEzsigntemplatedocumentID}")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-20T16:59:39.826205Z[Etc/UTC]")
public class EzsigntemplatedocumentEditObjectV1Request {
  public static final String SERIALIZED_NAME_OBJ_EZSIGNTEMPLATEDOCUMENT = "objEzsigntemplatedocument";
  @SerializedName(SERIALIZED_NAME_OBJ_EZSIGNTEMPLATEDOCUMENT)
  private EzsigntemplatedocumentRequestCompound objEzsigntemplatedocument;

  public EzsigntemplatedocumentEditObjectV1Request() { 
  }

  public EzsigntemplatedocumentEditObjectV1Request objEzsigntemplatedocument(EzsigntemplatedocumentRequestCompound objEzsigntemplatedocument) {
    
    this.objEzsigntemplatedocument = objEzsigntemplatedocument;
    return this;
  }

   /**
   * Get objEzsigntemplatedocument
   * @return objEzsigntemplatedocument
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public EzsigntemplatedocumentRequestCompound getObjEzsigntemplatedocument() {
    return objEzsigntemplatedocument;
  }


  public void setObjEzsigntemplatedocument(EzsigntemplatedocumentRequestCompound objEzsigntemplatedocument) {
    this.objEzsigntemplatedocument = objEzsigntemplatedocument;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsigntemplatedocumentEditObjectV1Request ezsigntemplatedocumentEditObjectV1Request = (EzsigntemplatedocumentEditObjectV1Request) o;
    return Objects.equals(this.objEzsigntemplatedocument, ezsigntemplatedocumentEditObjectV1Request.objEzsigntemplatedocument);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objEzsigntemplatedocument);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsigntemplatedocumentEditObjectV1Request {\n");
    sb.append("    objEzsigntemplatedocument: ").append(toIndentedString(objEzsigntemplatedocument)).append("\n");
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
    openapiFields.add("objEzsigntemplatedocument");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("objEzsigntemplatedocument");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EzsigntemplatedocumentEditObjectV1Request
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (EzsigntemplatedocumentEditObjectV1Request.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in EzsigntemplatedocumentEditObjectV1Request is not found in the empty JSON string", EzsigntemplatedocumentEditObjectV1Request.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!EzsigntemplatedocumentEditObjectV1Request.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EzsigntemplatedocumentEditObjectV1Request` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EzsigntemplatedocumentEditObjectV1Request.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field `objEzsigntemplatedocument`
      if (jsonObj.getAsJsonObject("objEzsigntemplatedocument") != null) {
        EzsigntemplatedocumentRequestCompound.validateJsonObject(jsonObj.getAsJsonObject("objEzsigntemplatedocument"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EzsigntemplatedocumentEditObjectV1Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EzsigntemplatedocumentEditObjectV1Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EzsigntemplatedocumentEditObjectV1Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EzsigntemplatedocumentEditObjectV1Request.class));

       return (TypeAdapter<T>) new TypeAdapter<EzsigntemplatedocumentEditObjectV1Request>() {
           @Override
           public void write(JsonWriter out, EzsigntemplatedocumentEditObjectV1Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EzsigntemplatedocumentEditObjectV1Request read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EzsigntemplatedocumentEditObjectV1Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EzsigntemplatedocumentEditObjectV1Request
  * @throws IOException if the JSON string is invalid with respect to EzsigntemplatedocumentEditObjectV1Request
  */
  public static EzsigntemplatedocumentEditObjectV1Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EzsigntemplatedocumentEditObjectV1Request.class);
  }

 /**
  * Convert an instance of EzsigntemplatedocumentEditObjectV1Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
