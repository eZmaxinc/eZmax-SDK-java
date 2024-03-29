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
import com.ezmax.api.model.EzsigntemplateformfieldgroupCreateObjectV1ResponseMPayload;
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
 * EzsigntemplateformfieldgroupCreateObjectV1ResponseAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-22T15:33:11.356591451Z[Etc/UTC]")
public class EzsigntemplateformfieldgroupCreateObjectV1ResponseAllOf {
  public static final String SERIALIZED_NAME_M_PAYLOAD = "mPayload";
  @SerializedName(SERIALIZED_NAME_M_PAYLOAD)
  private EzsigntemplateformfieldgroupCreateObjectV1ResponseMPayload mPayload;

  public EzsigntemplateformfieldgroupCreateObjectV1ResponseAllOf() {
  }

  public EzsigntemplateformfieldgroupCreateObjectV1ResponseAllOf mPayload(EzsigntemplateformfieldgroupCreateObjectV1ResponseMPayload mPayload) {
    
    this.mPayload = mPayload;
    return this;
  }

   /**
   * Get mPayload
   * @return mPayload
  **/
  @javax.annotation.Nonnull
  public EzsigntemplateformfieldgroupCreateObjectV1ResponseMPayload getmPayload() {
    return mPayload;
  }


  public void setmPayload(EzsigntemplateformfieldgroupCreateObjectV1ResponseMPayload mPayload) {
    this.mPayload = mPayload;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsigntemplateformfieldgroupCreateObjectV1ResponseAllOf ezsigntemplateformfieldgroupCreateObjectV1ResponseAllOf = (EzsigntemplateformfieldgroupCreateObjectV1ResponseAllOf) o;
    return Objects.equals(this.mPayload, ezsigntemplateformfieldgroupCreateObjectV1ResponseAllOf.mPayload);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mPayload);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsigntemplateformfieldgroupCreateObjectV1ResponseAllOf {\n");
    sb.append("    mPayload: ").append(toIndentedString(mPayload)).append("\n");
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
    openapiFields.add("mPayload");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("mPayload");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EzsigntemplateformfieldgroupCreateObjectV1ResponseAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!EzsigntemplateformfieldgroupCreateObjectV1ResponseAllOf.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EzsigntemplateformfieldgroupCreateObjectV1ResponseAllOf is not found in the empty JSON string", EzsigntemplateformfieldgroupCreateObjectV1ResponseAllOf.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!EzsigntemplateformfieldgroupCreateObjectV1ResponseAllOf.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EzsigntemplateformfieldgroupCreateObjectV1ResponseAllOf` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EzsigntemplateformfieldgroupCreateObjectV1ResponseAllOf.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the required field `mPayload`
      EzsigntemplateformfieldgroupCreateObjectV1ResponseMPayload.validateJsonObject(jsonObj.getAsJsonObject("mPayload"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EzsigntemplateformfieldgroupCreateObjectV1ResponseAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EzsigntemplateformfieldgroupCreateObjectV1ResponseAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EzsigntemplateformfieldgroupCreateObjectV1ResponseAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EzsigntemplateformfieldgroupCreateObjectV1ResponseAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<EzsigntemplateformfieldgroupCreateObjectV1ResponseAllOf>() {
           @Override
           public void write(JsonWriter out, EzsigntemplateformfieldgroupCreateObjectV1ResponseAllOf value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EzsigntemplateformfieldgroupCreateObjectV1ResponseAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EzsigntemplateformfieldgroupCreateObjectV1ResponseAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EzsigntemplateformfieldgroupCreateObjectV1ResponseAllOf
  * @throws IOException if the JSON string is invalid with respect to EzsigntemplateformfieldgroupCreateObjectV1ResponseAllOf
  */
  public static EzsigntemplateformfieldgroupCreateObjectV1ResponseAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EzsigntemplateformfieldgroupCreateObjectV1ResponseAllOf.class);
  }

 /**
  * Convert an instance of EzsigntemplateformfieldgroupCreateObjectV1ResponseAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

