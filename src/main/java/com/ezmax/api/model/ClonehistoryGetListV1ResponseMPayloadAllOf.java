/*
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.17
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ezmax.api.model;

import java.util.Objects;
import java.util.Arrays;
import com.ezmax.api.model.ClonehistoryListElement;
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
 * ClonehistoryGetListV1ResponseMPayloadAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-22T14:56:27.093149753Z[Etc/UTC]")
public class ClonehistoryGetListV1ResponseMPayloadAllOf {
  public static final String SERIALIZED_NAME_A_OBJ_CLONEHISTORY = "a_objClonehistory";
  @SerializedName(SERIALIZED_NAME_A_OBJ_CLONEHISTORY)
  private List<ClonehistoryListElement> aObjClonehistory = new ArrayList<>();

  public ClonehistoryGetListV1ResponseMPayloadAllOf() {
  }

  public ClonehistoryGetListV1ResponseMPayloadAllOf aObjClonehistory(List<ClonehistoryListElement> aObjClonehistory) {
    
    this.aObjClonehistory = aObjClonehistory;
    return this;
  }

  public ClonehistoryGetListV1ResponseMPayloadAllOf addAObjClonehistoryItem(ClonehistoryListElement aObjClonehistoryItem) {
    if (this.aObjClonehistory == null) {
      this.aObjClonehistory = new ArrayList<>();
    }
    this.aObjClonehistory.add(aObjClonehistoryItem);
    return this;
  }

   /**
   * Get aObjClonehistory
   * @return aObjClonehistory
  **/
  @javax.annotation.Nonnull
  public List<ClonehistoryListElement> getaObjClonehistory() {
    return aObjClonehistory;
  }


  public void setaObjClonehistory(List<ClonehistoryListElement> aObjClonehistory) {
    this.aObjClonehistory = aObjClonehistory;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClonehistoryGetListV1ResponseMPayloadAllOf clonehistoryGetListV1ResponseMPayloadAllOf = (ClonehistoryGetListV1ResponseMPayloadAllOf) o;
    return Objects.equals(this.aObjClonehistory, clonehistoryGetListV1ResponseMPayloadAllOf.aObjClonehistory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aObjClonehistory);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClonehistoryGetListV1ResponseMPayloadAllOf {\n");
    sb.append("    aObjClonehistory: ").append(toIndentedString(aObjClonehistory)).append("\n");
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
    openapiFields.add("a_objClonehistory");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("a_objClonehistory");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ClonehistoryGetListV1ResponseMPayloadAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ClonehistoryGetListV1ResponseMPayloadAllOf.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ClonehistoryGetListV1ResponseMPayloadAllOf is not found in the empty JSON string", ClonehistoryGetListV1ResponseMPayloadAllOf.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ClonehistoryGetListV1ResponseMPayloadAllOf.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ClonehistoryGetListV1ResponseMPayloadAllOf` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ClonehistoryGetListV1ResponseMPayloadAllOf.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (!jsonObj.get("a_objClonehistory").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `a_objClonehistory` to be an array in the JSON string but got `%s`", jsonObj.get("a_objClonehistory").toString()));
      }

      JsonArray jsonArrayaObjClonehistory = jsonObj.getAsJsonArray("a_objClonehistory");
      // validate the required field `a_objClonehistory` (array)
      for (int i = 0; i < jsonArrayaObjClonehistory.size(); i++) {
        ClonehistoryListElement.validateJsonObject(jsonArrayaObjClonehistory.get(i).getAsJsonObject());
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ClonehistoryGetListV1ResponseMPayloadAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ClonehistoryGetListV1ResponseMPayloadAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ClonehistoryGetListV1ResponseMPayloadAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ClonehistoryGetListV1ResponseMPayloadAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<ClonehistoryGetListV1ResponseMPayloadAllOf>() {
           @Override
           public void write(JsonWriter out, ClonehistoryGetListV1ResponseMPayloadAllOf value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ClonehistoryGetListV1ResponseMPayloadAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ClonehistoryGetListV1ResponseMPayloadAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ClonehistoryGetListV1ResponseMPayloadAllOf
  * @throws IOException if the JSON string is invalid with respect to ClonehistoryGetListV1ResponseMPayloadAllOf
  */
  public static ClonehistoryGetListV1ResponseMPayloadAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ClonehistoryGetListV1ResponseMPayloadAllOf.class);
  }

 /**
  * Convert an instance of ClonehistoryGetListV1ResponseMPayloadAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
