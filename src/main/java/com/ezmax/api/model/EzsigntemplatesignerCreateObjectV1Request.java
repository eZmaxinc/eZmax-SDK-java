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
import com.ezmax.api.model.EzsigntemplatesignerRequestCompound;
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
 * Request for POST /1/object/ezsigntemplatesigner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-07T19:20:13.445471985Z[Etc/UTC]", comments = "Generator version: 7.12.0")
public class EzsigntemplatesignerCreateObjectV1Request {
  public static final String SERIALIZED_NAME_A_OBJ_EZSIGNTEMPLATESIGNER = "a_objEzsigntemplatesigner";
  @SerializedName(SERIALIZED_NAME_A_OBJ_EZSIGNTEMPLATESIGNER)
  @javax.annotation.Nonnull
  private List<EzsigntemplatesignerRequestCompound> aObjEzsigntemplatesigner = new ArrayList<>();

  public EzsigntemplatesignerCreateObjectV1Request() {
  }

  public EzsigntemplatesignerCreateObjectV1Request aObjEzsigntemplatesigner(@javax.annotation.Nonnull List<EzsigntemplatesignerRequestCompound> aObjEzsigntemplatesigner) {
    this.aObjEzsigntemplatesigner = aObjEzsigntemplatesigner;
    return this;
  }

  public EzsigntemplatesignerCreateObjectV1Request addAObjEzsigntemplatesignerItem(EzsigntemplatesignerRequestCompound aObjEzsigntemplatesignerItem) {
    if (this.aObjEzsigntemplatesigner == null) {
      this.aObjEzsigntemplatesigner = new ArrayList<>();
    }
    this.aObjEzsigntemplatesigner.add(aObjEzsigntemplatesignerItem);
    return this;
  }

  /**
   * Get aObjEzsigntemplatesigner
   * @return aObjEzsigntemplatesigner
   */
  @javax.annotation.Nonnull
  public List<EzsigntemplatesignerRequestCompound> getaObjEzsigntemplatesigner() {
    return aObjEzsigntemplatesigner;
  }

  public void setaObjEzsigntemplatesigner(@javax.annotation.Nonnull List<EzsigntemplatesignerRequestCompound> aObjEzsigntemplatesigner) {
    this.aObjEzsigntemplatesigner = aObjEzsigntemplatesigner;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsigntemplatesignerCreateObjectV1Request ezsigntemplatesignerCreateObjectV1Request = (EzsigntemplatesignerCreateObjectV1Request) o;
    return Objects.equals(this.aObjEzsigntemplatesigner, ezsigntemplatesignerCreateObjectV1Request.aObjEzsigntemplatesigner);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aObjEzsigntemplatesigner);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsigntemplatesignerCreateObjectV1Request {\n");
    sb.append("    aObjEzsigntemplatesigner: ").append(toIndentedString(aObjEzsigntemplatesigner)).append("\n");
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
    openapiFields.add("a_objEzsigntemplatesigner");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("a_objEzsigntemplatesigner");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EzsigntemplatesignerCreateObjectV1Request
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EzsigntemplatesignerCreateObjectV1Request.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EzsigntemplatesignerCreateObjectV1Request is not found in the empty JSON string", EzsigntemplatesignerCreateObjectV1Request.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EzsigntemplatesignerCreateObjectV1Request.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EzsigntemplatesignerCreateObjectV1Request` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EzsigntemplatesignerCreateObjectV1Request.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("a_objEzsigntemplatesigner").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `a_objEzsigntemplatesigner` to be an array in the JSON string but got `%s`", jsonObj.get("a_objEzsigntemplatesigner").toString()));
      }

      JsonArray jsonArrayaObjEzsigntemplatesigner = jsonObj.getAsJsonArray("a_objEzsigntemplatesigner");
      // validate the required field `a_objEzsigntemplatesigner` (array)
      for (int i = 0; i < jsonArrayaObjEzsigntemplatesigner.size(); i++) {
        EzsigntemplatesignerRequestCompound.validateJsonElement(jsonArrayaObjEzsigntemplatesigner.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EzsigntemplatesignerCreateObjectV1Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EzsigntemplatesignerCreateObjectV1Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EzsigntemplatesignerCreateObjectV1Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EzsigntemplatesignerCreateObjectV1Request.class));

       return (TypeAdapter<T>) new TypeAdapter<EzsigntemplatesignerCreateObjectV1Request>() {
           @Override
           public void write(JsonWriter out, EzsigntemplatesignerCreateObjectV1Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EzsigntemplatesignerCreateObjectV1Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EzsigntemplatesignerCreateObjectV1Request given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EzsigntemplatesignerCreateObjectV1Request
   * @throws IOException if the JSON string is invalid with respect to EzsigntemplatesignerCreateObjectV1Request
   */
  public static EzsigntemplatesignerCreateObjectV1Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EzsigntemplatesignerCreateObjectV1Request.class);
  }

  /**
   * Convert an instance of EzsigntemplatesignerCreateObjectV1Request to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

