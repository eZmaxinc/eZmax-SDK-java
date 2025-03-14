/*
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.2.2
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ezmax.api.model;

import java.util.Objects;
import com.ezmax.api.model.PdfalevelAutocompleteElementResponse;
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

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import eZmaxAPI.JSON;

/**
 * Payload for POST /2/object/pdfalevel/getAutocomplete
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-07T19:20:13.445471985Z[Etc/UTC]", comments = "Generator version: 7.12.0")
public class PdfalevelGetAutocompleteV2ResponseMPayload {
  public static final String SERIALIZED_NAME_A_OBJ_PDFALEVEL = "a_objPdfalevel";
  @SerializedName(SERIALIZED_NAME_A_OBJ_PDFALEVEL)
  @javax.annotation.Nonnull
  private List<PdfalevelAutocompleteElementResponse> aObjPdfalevel = new ArrayList<>();

  public PdfalevelGetAutocompleteV2ResponseMPayload() {
  }

  public PdfalevelGetAutocompleteV2ResponseMPayload aObjPdfalevel(@javax.annotation.Nonnull List<PdfalevelAutocompleteElementResponse> aObjPdfalevel) {
    this.aObjPdfalevel = aObjPdfalevel;
    return this;
  }

  public PdfalevelGetAutocompleteV2ResponseMPayload addAObjPdfalevelItem(PdfalevelAutocompleteElementResponse aObjPdfalevelItem) {
    if (this.aObjPdfalevel == null) {
      this.aObjPdfalevel = new ArrayList<>();
    }
    this.aObjPdfalevel.add(aObjPdfalevelItem);
    return this;
  }

  /**
   * An array of Pdfalevel autocomplete element response.
   * @return aObjPdfalevel
   */
  @javax.annotation.Nonnull
  public List<PdfalevelAutocompleteElementResponse> getaObjPdfalevel() {
    return aObjPdfalevel;
  }

  public void setaObjPdfalevel(@javax.annotation.Nonnull List<PdfalevelAutocompleteElementResponse> aObjPdfalevel) {
    this.aObjPdfalevel = aObjPdfalevel;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PdfalevelGetAutocompleteV2ResponseMPayload pdfalevelGetAutocompleteV2ResponseMPayload = (PdfalevelGetAutocompleteV2ResponseMPayload) o;
    return Objects.equals(this.aObjPdfalevel, pdfalevelGetAutocompleteV2ResponseMPayload.aObjPdfalevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aObjPdfalevel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PdfalevelGetAutocompleteV2ResponseMPayload {\n");
    sb.append("    aObjPdfalevel: ").append(toIndentedString(aObjPdfalevel)).append("\n");
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
    openapiFields.add("a_objPdfalevel");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("a_objPdfalevel");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PdfalevelGetAutocompleteV2ResponseMPayload
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PdfalevelGetAutocompleteV2ResponseMPayload.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PdfalevelGetAutocompleteV2ResponseMPayload is not found in the empty JSON string", PdfalevelGetAutocompleteV2ResponseMPayload.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PdfalevelGetAutocompleteV2ResponseMPayload.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PdfalevelGetAutocompleteV2ResponseMPayload` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PdfalevelGetAutocompleteV2ResponseMPayload.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("a_objPdfalevel").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `a_objPdfalevel` to be an array in the JSON string but got `%s`", jsonObj.get("a_objPdfalevel").toString()));
      }

      JsonArray jsonArrayaObjPdfalevel = jsonObj.getAsJsonArray("a_objPdfalevel");
      // validate the required field `a_objPdfalevel` (array)
      for (int i = 0; i < jsonArrayaObjPdfalevel.size(); i++) {
        PdfalevelAutocompleteElementResponse.validateJsonElement(jsonArrayaObjPdfalevel.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PdfalevelGetAutocompleteV2ResponseMPayload.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PdfalevelGetAutocompleteV2ResponseMPayload' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PdfalevelGetAutocompleteV2ResponseMPayload> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PdfalevelGetAutocompleteV2ResponseMPayload.class));

       return (TypeAdapter<T>) new TypeAdapter<PdfalevelGetAutocompleteV2ResponseMPayload>() {
           @Override
           public void write(JsonWriter out, PdfalevelGetAutocompleteV2ResponseMPayload value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PdfalevelGetAutocompleteV2ResponseMPayload read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PdfalevelGetAutocompleteV2ResponseMPayload given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PdfalevelGetAutocompleteV2ResponseMPayload
   * @throws IOException if the JSON string is invalid with respect to PdfalevelGetAutocompleteV2ResponseMPayload
   */
  public static PdfalevelGetAutocompleteV2ResponseMPayload fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PdfalevelGetAutocompleteV2ResponseMPayload.class);
  }

  /**
   * Convert an instance of PdfalevelGetAutocompleteV2ResponseMPayload to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

