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
import com.ezmax.api.model.EzsigntemplatesignatureGetObjectV2ResponseMPayload;
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
 * EzsigntemplatesignatureGetObjectV2ResponseAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-22T15:33:11.356591451Z[Etc/UTC]")
public class EzsigntemplatesignatureGetObjectV2ResponseAllOf {
  public static final String SERIALIZED_NAME_M_PAYLOAD = "mPayload";
  @SerializedName(SERIALIZED_NAME_M_PAYLOAD)
  private EzsigntemplatesignatureGetObjectV2ResponseMPayload mPayload;

  public EzsigntemplatesignatureGetObjectV2ResponseAllOf() {
  }

  public EzsigntemplatesignatureGetObjectV2ResponseAllOf mPayload(EzsigntemplatesignatureGetObjectV2ResponseMPayload mPayload) {
    
    this.mPayload = mPayload;
    return this;
  }

   /**
   * Get mPayload
   * @return mPayload
  **/
  @javax.annotation.Nonnull
  public EzsigntemplatesignatureGetObjectV2ResponseMPayload getmPayload() {
    return mPayload;
  }


  public void setmPayload(EzsigntemplatesignatureGetObjectV2ResponseMPayload mPayload) {
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
    EzsigntemplatesignatureGetObjectV2ResponseAllOf ezsigntemplatesignatureGetObjectV2ResponseAllOf = (EzsigntemplatesignatureGetObjectV2ResponseAllOf) o;
    return Objects.equals(this.mPayload, ezsigntemplatesignatureGetObjectV2ResponseAllOf.mPayload);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mPayload);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsigntemplatesignatureGetObjectV2ResponseAllOf {\n");
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
  * @throws IOException if the JSON Object is invalid with respect to EzsigntemplatesignatureGetObjectV2ResponseAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!EzsigntemplatesignatureGetObjectV2ResponseAllOf.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EzsigntemplatesignatureGetObjectV2ResponseAllOf is not found in the empty JSON string", EzsigntemplatesignatureGetObjectV2ResponseAllOf.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!EzsigntemplatesignatureGetObjectV2ResponseAllOf.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EzsigntemplatesignatureGetObjectV2ResponseAllOf` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EzsigntemplatesignatureGetObjectV2ResponseAllOf.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the required field `mPayload`
      EzsigntemplatesignatureGetObjectV2ResponseMPayload.validateJsonObject(jsonObj.getAsJsonObject("mPayload"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EzsigntemplatesignatureGetObjectV2ResponseAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EzsigntemplatesignatureGetObjectV2ResponseAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EzsigntemplatesignatureGetObjectV2ResponseAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EzsigntemplatesignatureGetObjectV2ResponseAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<EzsigntemplatesignatureGetObjectV2ResponseAllOf>() {
           @Override
           public void write(JsonWriter out, EzsigntemplatesignatureGetObjectV2ResponseAllOf value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EzsigntemplatesignatureGetObjectV2ResponseAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EzsigntemplatesignatureGetObjectV2ResponseAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EzsigntemplatesignatureGetObjectV2ResponseAllOf
  * @throws IOException if the JSON string is invalid with respect to EzsigntemplatesignatureGetObjectV2ResponseAllOf
  */
  public static EzsigntemplatesignatureGetObjectV2ResponseAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EzsigntemplatesignatureGetObjectV2ResponseAllOf.class);
  }

 /**
  * Convert an instance of EzsigntemplatesignatureGetObjectV2ResponseAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

