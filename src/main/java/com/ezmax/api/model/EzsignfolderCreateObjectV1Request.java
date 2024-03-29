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
import com.ezmax.api.model.EzsignfolderRequest;
import com.ezmax.api.model.EzsignfolderRequestCompound;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
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
 * Request for POST /1/object/ezsignfolder
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-22T15:33:11.356591451Z[Etc/UTC]")
public class EzsignfolderCreateObjectV1Request {
  public static final String SERIALIZED_NAME_OBJ_EZSIGNFOLDER = "objEzsignfolder";
  @SerializedName(SERIALIZED_NAME_OBJ_EZSIGNFOLDER)
  private EzsignfolderRequest objEzsignfolder;

  public static final String SERIALIZED_NAME_OBJ_EZSIGNFOLDER_COMPOUND = "objEzsignfolderCompound";
  @SerializedName(SERIALIZED_NAME_OBJ_EZSIGNFOLDER_COMPOUND)
  private EzsignfolderRequestCompound objEzsignfolderCompound;

  public EzsignfolderCreateObjectV1Request() {
  }

  public EzsignfolderCreateObjectV1Request objEzsignfolder(EzsignfolderRequest objEzsignfolder) {
    
    this.objEzsignfolder = objEzsignfolder;
    return this;
  }

   /**
   * Get objEzsignfolder
   * @return objEzsignfolder
  **/
  @javax.annotation.Nullable
  public EzsignfolderRequest getObjEzsignfolder() {
    return objEzsignfolder;
  }


  public void setObjEzsignfolder(EzsignfolderRequest objEzsignfolder) {
    this.objEzsignfolder = objEzsignfolder;
  }


  public EzsignfolderCreateObjectV1Request objEzsignfolderCompound(EzsignfolderRequestCompound objEzsignfolderCompound) {
    
    this.objEzsignfolderCompound = objEzsignfolderCompound;
    return this;
  }

   /**
   * Get objEzsignfolderCompound
   * @return objEzsignfolderCompound
  **/
  @javax.annotation.Nullable
  public EzsignfolderRequestCompound getObjEzsignfolderCompound() {
    return objEzsignfolderCompound;
  }


  public void setObjEzsignfolderCompound(EzsignfolderRequestCompound objEzsignfolderCompound) {
    this.objEzsignfolderCompound = objEzsignfolderCompound;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignfolderCreateObjectV1Request ezsignfolderCreateObjectV1Request = (EzsignfolderCreateObjectV1Request) o;
    return Objects.equals(this.objEzsignfolder, ezsignfolderCreateObjectV1Request.objEzsignfolder) &&
        Objects.equals(this.objEzsignfolderCompound, ezsignfolderCreateObjectV1Request.objEzsignfolderCompound);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objEzsignfolder, objEzsignfolderCompound);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignfolderCreateObjectV1Request {\n");
    sb.append("    objEzsignfolder: ").append(toIndentedString(objEzsignfolder)).append("\n");
    sb.append("    objEzsignfolderCompound: ").append(toIndentedString(objEzsignfolderCompound)).append("\n");
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
    openapiFields.add("objEzsignfolder");
    openapiFields.add("objEzsignfolderCompound");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EzsignfolderCreateObjectV1Request
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!EzsignfolderCreateObjectV1Request.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EzsignfolderCreateObjectV1Request is not found in the empty JSON string", EzsignfolderCreateObjectV1Request.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!EzsignfolderCreateObjectV1Request.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EzsignfolderCreateObjectV1Request` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `objEzsignfolder`
      if (jsonObj.get("objEzsignfolder") != null && !jsonObj.get("objEzsignfolder").isJsonNull()) {
        EzsignfolderRequest.validateJsonObject(jsonObj.getAsJsonObject("objEzsignfolder"));
      }
      // validate the optional field `objEzsignfolderCompound`
      if (jsonObj.get("objEzsignfolderCompound") != null && !jsonObj.get("objEzsignfolderCompound").isJsonNull()) {
        EzsignfolderRequestCompound.validateJsonObject(jsonObj.getAsJsonObject("objEzsignfolderCompound"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EzsignfolderCreateObjectV1Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EzsignfolderCreateObjectV1Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EzsignfolderCreateObjectV1Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EzsignfolderCreateObjectV1Request.class));

       return (TypeAdapter<T>) new TypeAdapter<EzsignfolderCreateObjectV1Request>() {
           @Override
           public void write(JsonWriter out, EzsignfolderCreateObjectV1Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EzsignfolderCreateObjectV1Request read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EzsignfolderCreateObjectV1Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EzsignfolderCreateObjectV1Request
  * @throws IOException if the JSON string is invalid with respect to EzsignfolderCreateObjectV1Request
  */
  public static EzsignfolderCreateObjectV1Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EzsignfolderCreateObjectV1Request.class);
  }

 /**
  * Convert an instance of EzsignfolderCreateObjectV1Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

