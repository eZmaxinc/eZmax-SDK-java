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
import com.ezmax.api.model.PhonetypeAutocompleteElementResponse;
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
 * Payload for POST /2/object/phonetype/getAutocomplete
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-27T18:40:35.791662503Z[Etc/UTC]")
public class PhonetypeGetAutocompleteV2ResponseMPayload {
  public static final String SERIALIZED_NAME_A_OBJ_PHONETYPE = "a_objPhonetype";
  @SerializedName(SERIALIZED_NAME_A_OBJ_PHONETYPE)
  private List<PhonetypeAutocompleteElementResponse> aObjPhonetype;

  public PhonetypeGetAutocompleteV2ResponseMPayload() {
  }

  public PhonetypeGetAutocompleteV2ResponseMPayload aObjPhonetype(List<PhonetypeAutocompleteElementResponse> aObjPhonetype) {
    
    this.aObjPhonetype = aObjPhonetype;
    return this;
  }

  public PhonetypeGetAutocompleteV2ResponseMPayload addAObjPhonetypeItem(PhonetypeAutocompleteElementResponse aObjPhonetypeItem) {
    if (this.aObjPhonetype == null) {
      this.aObjPhonetype = new ArrayList<>();
    }
    this.aObjPhonetype.add(aObjPhonetypeItem);
    return this;
  }

   /**
   * An array of Phonetype autocomplete element response.
   * @return aObjPhonetype
  **/
  @javax.annotation.Nullable
  public List<PhonetypeAutocompleteElementResponse> getaObjPhonetype() {
    return aObjPhonetype;
  }


  public void setaObjPhonetype(List<PhonetypeAutocompleteElementResponse> aObjPhonetype) {
    this.aObjPhonetype = aObjPhonetype;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PhonetypeGetAutocompleteV2ResponseMPayload phonetypeGetAutocompleteV2ResponseMPayload = (PhonetypeGetAutocompleteV2ResponseMPayload) o;
    return Objects.equals(this.aObjPhonetype, phonetypeGetAutocompleteV2ResponseMPayload.aObjPhonetype);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aObjPhonetype);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhonetypeGetAutocompleteV2ResponseMPayload {\n");
    sb.append("    aObjPhonetype: ").append(toIndentedString(aObjPhonetype)).append("\n");
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
    openapiFields.add("a_objPhonetype");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PhonetypeGetAutocompleteV2ResponseMPayload
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PhonetypeGetAutocompleteV2ResponseMPayload.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PhonetypeGetAutocompleteV2ResponseMPayload is not found in the empty JSON string", PhonetypeGetAutocompleteV2ResponseMPayload.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PhonetypeGetAutocompleteV2ResponseMPayload.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PhonetypeGetAutocompleteV2ResponseMPayload` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("a_objPhonetype") != null && !jsonObj.get("a_objPhonetype").isJsonNull()) {
        JsonArray jsonArrayaObjPhonetype = jsonObj.getAsJsonArray("a_objPhonetype");
        if (jsonArrayaObjPhonetype != null) {
          // ensure the json data is an array
          if (!jsonObj.get("a_objPhonetype").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `a_objPhonetype` to be an array in the JSON string but got `%s`", jsonObj.get("a_objPhonetype").toString()));
          }

          // validate the optional field `a_objPhonetype` (array)
          for (int i = 0; i < jsonArrayaObjPhonetype.size(); i++) {
            PhonetypeAutocompleteElementResponse.validateJsonObject(jsonArrayaObjPhonetype.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PhonetypeGetAutocompleteV2ResponseMPayload.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PhonetypeGetAutocompleteV2ResponseMPayload' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PhonetypeGetAutocompleteV2ResponseMPayload> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PhonetypeGetAutocompleteV2ResponseMPayload.class));

       return (TypeAdapter<T>) new TypeAdapter<PhonetypeGetAutocompleteV2ResponseMPayload>() {
           @Override
           public void write(JsonWriter out, PhonetypeGetAutocompleteV2ResponseMPayload value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PhonetypeGetAutocompleteV2ResponseMPayload read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PhonetypeGetAutocompleteV2ResponseMPayload given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PhonetypeGetAutocompleteV2ResponseMPayload
  * @throws IOException if the JSON string is invalid with respect to PhonetypeGetAutocompleteV2ResponseMPayload
  */
  public static PhonetypeGetAutocompleteV2ResponseMPayload fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PhonetypeGetAutocompleteV2ResponseMPayload.class);
  }

 /**
  * Convert an instance of PhonetypeGetAutocompleteV2ResponseMPayload to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
