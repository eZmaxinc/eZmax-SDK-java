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
import com.ezmax.api.model.ActivesessionListElement;
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
 * Payload for GET /1/object/activesession/getList
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-22T15:33:11.356591451Z[Etc/UTC]")
public class ActivesessionGetListV1ResponseMPayload {
  public static final String SERIALIZED_NAME_A_OBJ_ACTIVESESSION = "a_objActivesession";
  @SerializedName(SERIALIZED_NAME_A_OBJ_ACTIVESESSION)
  private List<ActivesessionListElement> aObjActivesession = new ArrayList<>();

  public static final String SERIALIZED_NAME_I_ROW_RETURNED = "iRowReturned";
  @SerializedName(SERIALIZED_NAME_I_ROW_RETURNED)
  private Integer iRowReturned;

  public static final String SERIALIZED_NAME_I_ROW_FILTERED = "iRowFiltered";
  @SerializedName(SERIALIZED_NAME_I_ROW_FILTERED)
  private Integer iRowFiltered;

  public ActivesessionGetListV1ResponseMPayload() {
  }

  public ActivesessionGetListV1ResponseMPayload aObjActivesession(List<ActivesessionListElement> aObjActivesession) {
    
    this.aObjActivesession = aObjActivesession;
    return this;
  }

  public ActivesessionGetListV1ResponseMPayload addAObjActivesessionItem(ActivesessionListElement aObjActivesessionItem) {
    if (this.aObjActivesession == null) {
      this.aObjActivesession = new ArrayList<>();
    }
    this.aObjActivesession.add(aObjActivesessionItem);
    return this;
  }

   /**
   * Get aObjActivesession
   * @return aObjActivesession
  **/
  @javax.annotation.Nonnull
  public List<ActivesessionListElement> getaObjActivesession() {
    return aObjActivesession;
  }


  public void setaObjActivesession(List<ActivesessionListElement> aObjActivesession) {
    this.aObjActivesession = aObjActivesession;
  }


  public ActivesessionGetListV1ResponseMPayload iRowReturned(Integer iRowReturned) {
    
    this.iRowReturned = iRowReturned;
    return this;
  }

   /**
   * The number of rows returned
   * @return iRowReturned
  **/
  @javax.annotation.Nonnull
  public Integer getiRowReturned() {
    return iRowReturned;
  }


  public void setiRowReturned(Integer iRowReturned) {
    this.iRowReturned = iRowReturned;
  }


  public ActivesessionGetListV1ResponseMPayload iRowFiltered(Integer iRowFiltered) {
    
    this.iRowFiltered = iRowFiltered;
    return this;
  }

   /**
   * The number of rows matching your filters (if any) or the total number of rows
   * @return iRowFiltered
  **/
  @javax.annotation.Nonnull
  public Integer getiRowFiltered() {
    return iRowFiltered;
  }


  public void setiRowFiltered(Integer iRowFiltered) {
    this.iRowFiltered = iRowFiltered;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActivesessionGetListV1ResponseMPayload activesessionGetListV1ResponseMPayload = (ActivesessionGetListV1ResponseMPayload) o;
    return Objects.equals(this.aObjActivesession, activesessionGetListV1ResponseMPayload.aObjActivesession) &&
        Objects.equals(this.iRowReturned, activesessionGetListV1ResponseMPayload.iRowReturned) &&
        Objects.equals(this.iRowFiltered, activesessionGetListV1ResponseMPayload.iRowFiltered);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aObjActivesession, iRowReturned, iRowFiltered);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActivesessionGetListV1ResponseMPayload {\n");
    sb.append("    aObjActivesession: ").append(toIndentedString(aObjActivesession)).append("\n");
    sb.append("    iRowReturned: ").append(toIndentedString(iRowReturned)).append("\n");
    sb.append("    iRowFiltered: ").append(toIndentedString(iRowFiltered)).append("\n");
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
    openapiFields.add("a_objActivesession");
    openapiFields.add("iRowReturned");
    openapiFields.add("iRowFiltered");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("a_objActivesession");
    openapiRequiredFields.add("iRowReturned");
    openapiRequiredFields.add("iRowFiltered");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ActivesessionGetListV1ResponseMPayload
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ActivesessionGetListV1ResponseMPayload.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ActivesessionGetListV1ResponseMPayload is not found in the empty JSON string", ActivesessionGetListV1ResponseMPayload.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ActivesessionGetListV1ResponseMPayload.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ActivesessionGetListV1ResponseMPayload` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ActivesessionGetListV1ResponseMPayload.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (!jsonObj.get("a_objActivesession").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `a_objActivesession` to be an array in the JSON string but got `%s`", jsonObj.get("a_objActivesession").toString()));
      }

      JsonArray jsonArrayaObjActivesession = jsonObj.getAsJsonArray("a_objActivesession");
      // validate the required field `a_objActivesession` (array)
      for (int i = 0; i < jsonArrayaObjActivesession.size(); i++) {
        ActivesessionListElement.validateJsonObject(jsonArrayaObjActivesession.get(i).getAsJsonObject());
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ActivesessionGetListV1ResponseMPayload.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ActivesessionGetListV1ResponseMPayload' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ActivesessionGetListV1ResponseMPayload> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ActivesessionGetListV1ResponseMPayload.class));

       return (TypeAdapter<T>) new TypeAdapter<ActivesessionGetListV1ResponseMPayload>() {
           @Override
           public void write(JsonWriter out, ActivesessionGetListV1ResponseMPayload value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ActivesessionGetListV1ResponseMPayload read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ActivesessionGetListV1ResponseMPayload given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ActivesessionGetListV1ResponseMPayload
  * @throws IOException if the JSON string is invalid with respect to ActivesessionGetListV1ResponseMPayload
  */
  public static ActivesessionGetListV1ResponseMPayload fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ActivesessionGetListV1ResponseMPayload.class);
  }

 /**
  * Convert an instance of ActivesessionGetListV1ResponseMPayload to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

