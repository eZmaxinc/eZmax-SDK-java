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
import com.ezmax.api.model.EzsigntemplatepackagemembershipRequestCompound;
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
 * Request for POST /1/object/ezsigntemplatepackagemembership
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-07T19:20:13.445471985Z[Etc/UTC]", comments = "Generator version: 7.12.0")
public class EzsigntemplatepackagemembershipCreateObjectV1Request {
  public static final String SERIALIZED_NAME_A_OBJ_EZSIGNTEMPLATEPACKAGEMEMBERSHIP = "a_objEzsigntemplatepackagemembership";
  @SerializedName(SERIALIZED_NAME_A_OBJ_EZSIGNTEMPLATEPACKAGEMEMBERSHIP)
  @javax.annotation.Nonnull
  private List<EzsigntemplatepackagemembershipRequestCompound> aObjEzsigntemplatepackagemembership = new ArrayList<>();

  public EzsigntemplatepackagemembershipCreateObjectV1Request() {
  }

  public EzsigntemplatepackagemembershipCreateObjectV1Request aObjEzsigntemplatepackagemembership(@javax.annotation.Nonnull List<EzsigntemplatepackagemembershipRequestCompound> aObjEzsigntemplatepackagemembership) {
    this.aObjEzsigntemplatepackagemembership = aObjEzsigntemplatepackagemembership;
    return this;
  }

  public EzsigntemplatepackagemembershipCreateObjectV1Request addAObjEzsigntemplatepackagemembershipItem(EzsigntemplatepackagemembershipRequestCompound aObjEzsigntemplatepackagemembershipItem) {
    if (this.aObjEzsigntemplatepackagemembership == null) {
      this.aObjEzsigntemplatepackagemembership = new ArrayList<>();
    }
    this.aObjEzsigntemplatepackagemembership.add(aObjEzsigntemplatepackagemembershipItem);
    return this;
  }

  /**
   * Get aObjEzsigntemplatepackagemembership
   * @return aObjEzsigntemplatepackagemembership
   */
  @javax.annotation.Nonnull
  public List<EzsigntemplatepackagemembershipRequestCompound> getaObjEzsigntemplatepackagemembership() {
    return aObjEzsigntemplatepackagemembership;
  }

  public void setaObjEzsigntemplatepackagemembership(@javax.annotation.Nonnull List<EzsigntemplatepackagemembershipRequestCompound> aObjEzsigntemplatepackagemembership) {
    this.aObjEzsigntemplatepackagemembership = aObjEzsigntemplatepackagemembership;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsigntemplatepackagemembershipCreateObjectV1Request ezsigntemplatepackagemembershipCreateObjectV1Request = (EzsigntemplatepackagemembershipCreateObjectV1Request) o;
    return Objects.equals(this.aObjEzsigntemplatepackagemembership, ezsigntemplatepackagemembershipCreateObjectV1Request.aObjEzsigntemplatepackagemembership);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aObjEzsigntemplatepackagemembership);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsigntemplatepackagemembershipCreateObjectV1Request {\n");
    sb.append("    aObjEzsigntemplatepackagemembership: ").append(toIndentedString(aObjEzsigntemplatepackagemembership)).append("\n");
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
    openapiFields.add("a_objEzsigntemplatepackagemembership");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("a_objEzsigntemplatepackagemembership");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EzsigntemplatepackagemembershipCreateObjectV1Request
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EzsigntemplatepackagemembershipCreateObjectV1Request.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EzsigntemplatepackagemembershipCreateObjectV1Request is not found in the empty JSON string", EzsigntemplatepackagemembershipCreateObjectV1Request.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EzsigntemplatepackagemembershipCreateObjectV1Request.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EzsigntemplatepackagemembershipCreateObjectV1Request` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EzsigntemplatepackagemembershipCreateObjectV1Request.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("a_objEzsigntemplatepackagemembership").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `a_objEzsigntemplatepackagemembership` to be an array in the JSON string but got `%s`", jsonObj.get("a_objEzsigntemplatepackagemembership").toString()));
      }

      JsonArray jsonArrayaObjEzsigntemplatepackagemembership = jsonObj.getAsJsonArray("a_objEzsigntemplatepackagemembership");
      // validate the required field `a_objEzsigntemplatepackagemembership` (array)
      for (int i = 0; i < jsonArrayaObjEzsigntemplatepackagemembership.size(); i++) {
        EzsigntemplatepackagemembershipRequestCompound.validateJsonElement(jsonArrayaObjEzsigntemplatepackagemembership.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EzsigntemplatepackagemembershipCreateObjectV1Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EzsigntemplatepackagemembershipCreateObjectV1Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EzsigntemplatepackagemembershipCreateObjectV1Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EzsigntemplatepackagemembershipCreateObjectV1Request.class));

       return (TypeAdapter<T>) new TypeAdapter<EzsigntemplatepackagemembershipCreateObjectV1Request>() {
           @Override
           public void write(JsonWriter out, EzsigntemplatepackagemembershipCreateObjectV1Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EzsigntemplatepackagemembershipCreateObjectV1Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EzsigntemplatepackagemembershipCreateObjectV1Request given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EzsigntemplatepackagemembershipCreateObjectV1Request
   * @throws IOException if the JSON string is invalid with respect to EzsigntemplatepackagemembershipCreateObjectV1Request
   */
  public static EzsigntemplatepackagemembershipCreateObjectV1Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EzsigntemplatepackagemembershipCreateObjectV1Request.class);
  }

  /**
   * Convert an instance of EzsigntemplatepackagemembershipCreateObjectV1Request to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

