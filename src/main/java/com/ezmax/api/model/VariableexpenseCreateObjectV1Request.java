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
import com.ezmax.api.model.VariableexpenseRequestCompound;
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
 * Request for POST /1/object/variableexpense
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-22T14:56:27.093149753Z[Etc/UTC]")
public class VariableexpenseCreateObjectV1Request {
  public static final String SERIALIZED_NAME_A_OBJ_VARIABLEEXPENSE = "a_objVariableexpense";
  @SerializedName(SERIALIZED_NAME_A_OBJ_VARIABLEEXPENSE)
  private List<VariableexpenseRequestCompound> aObjVariableexpense = new ArrayList<>();

  public VariableexpenseCreateObjectV1Request() {
  }

  public VariableexpenseCreateObjectV1Request aObjVariableexpense(List<VariableexpenseRequestCompound> aObjVariableexpense) {
    
    this.aObjVariableexpense = aObjVariableexpense;
    return this;
  }

  public VariableexpenseCreateObjectV1Request addAObjVariableexpenseItem(VariableexpenseRequestCompound aObjVariableexpenseItem) {
    if (this.aObjVariableexpense == null) {
      this.aObjVariableexpense = new ArrayList<>();
    }
    this.aObjVariableexpense.add(aObjVariableexpenseItem);
    return this;
  }

   /**
   * Get aObjVariableexpense
   * @return aObjVariableexpense
  **/
  @javax.annotation.Nonnull
  public List<VariableexpenseRequestCompound> getaObjVariableexpense() {
    return aObjVariableexpense;
  }


  public void setaObjVariableexpense(List<VariableexpenseRequestCompound> aObjVariableexpense) {
    this.aObjVariableexpense = aObjVariableexpense;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VariableexpenseCreateObjectV1Request variableexpenseCreateObjectV1Request = (VariableexpenseCreateObjectV1Request) o;
    return Objects.equals(this.aObjVariableexpense, variableexpenseCreateObjectV1Request.aObjVariableexpense);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aObjVariableexpense);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VariableexpenseCreateObjectV1Request {\n");
    sb.append("    aObjVariableexpense: ").append(toIndentedString(aObjVariableexpense)).append("\n");
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
    openapiFields.add("a_objVariableexpense");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("a_objVariableexpense");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to VariableexpenseCreateObjectV1Request
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!VariableexpenseCreateObjectV1Request.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in VariableexpenseCreateObjectV1Request is not found in the empty JSON string", VariableexpenseCreateObjectV1Request.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!VariableexpenseCreateObjectV1Request.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `VariableexpenseCreateObjectV1Request` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : VariableexpenseCreateObjectV1Request.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (!jsonObj.get("a_objVariableexpense").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `a_objVariableexpense` to be an array in the JSON string but got `%s`", jsonObj.get("a_objVariableexpense").toString()));
      }

      JsonArray jsonArrayaObjVariableexpense = jsonObj.getAsJsonArray("a_objVariableexpense");
      // validate the required field `a_objVariableexpense` (array)
      for (int i = 0; i < jsonArrayaObjVariableexpense.size(); i++) {
        VariableexpenseRequestCompound.validateJsonObject(jsonArrayaObjVariableexpense.get(i).getAsJsonObject());
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VariableexpenseCreateObjectV1Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VariableexpenseCreateObjectV1Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VariableexpenseCreateObjectV1Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VariableexpenseCreateObjectV1Request.class));

       return (TypeAdapter<T>) new TypeAdapter<VariableexpenseCreateObjectV1Request>() {
           @Override
           public void write(JsonWriter out, VariableexpenseCreateObjectV1Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public VariableexpenseCreateObjectV1Request read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of VariableexpenseCreateObjectV1Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VariableexpenseCreateObjectV1Request
  * @throws IOException if the JSON string is invalid with respect to VariableexpenseCreateObjectV1Request
  */
  public static VariableexpenseCreateObjectV1Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VariableexpenseCreateObjectV1Request.class);
  }

 /**
  * Convert an instance of VariableexpenseCreateObjectV1Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
