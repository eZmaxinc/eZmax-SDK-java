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
import com.ezmax.api.model.ContacttitleAutocompleteElementResponse;
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
 * Payload for POST /2/object/contacttitle/getAutocomplete
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-07T19:20:13.445471985Z[Etc/UTC]", comments = "Generator version: 7.12.0")
public class ContacttitleGetAutocompleteV2ResponseMPayload {
  public static final String SERIALIZED_NAME_A_OBJ_CONTACTTITLE = "a_objContacttitle";
  @SerializedName(SERIALIZED_NAME_A_OBJ_CONTACTTITLE)
  @javax.annotation.Nonnull
  private List<ContacttitleAutocompleteElementResponse> aObjContacttitle = new ArrayList<>();

  public ContacttitleGetAutocompleteV2ResponseMPayload() {
  }

  public ContacttitleGetAutocompleteV2ResponseMPayload aObjContacttitle(@javax.annotation.Nonnull List<ContacttitleAutocompleteElementResponse> aObjContacttitle) {
    this.aObjContacttitle = aObjContacttitle;
    return this;
  }

  public ContacttitleGetAutocompleteV2ResponseMPayload addAObjContacttitleItem(ContacttitleAutocompleteElementResponse aObjContacttitleItem) {
    if (this.aObjContacttitle == null) {
      this.aObjContacttitle = new ArrayList<>();
    }
    this.aObjContacttitle.add(aObjContacttitleItem);
    return this;
  }

  /**
   * An array of Contacttitle autocomplete element response.
   * @return aObjContacttitle
   */
  @javax.annotation.Nonnull
  public List<ContacttitleAutocompleteElementResponse> getaObjContacttitle() {
    return aObjContacttitle;
  }

  public void setaObjContacttitle(@javax.annotation.Nonnull List<ContacttitleAutocompleteElementResponse> aObjContacttitle) {
    this.aObjContacttitle = aObjContacttitle;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContacttitleGetAutocompleteV2ResponseMPayload contacttitleGetAutocompleteV2ResponseMPayload = (ContacttitleGetAutocompleteV2ResponseMPayload) o;
    return Objects.equals(this.aObjContacttitle, contacttitleGetAutocompleteV2ResponseMPayload.aObjContacttitle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aObjContacttitle);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContacttitleGetAutocompleteV2ResponseMPayload {\n");
    sb.append("    aObjContacttitle: ").append(toIndentedString(aObjContacttitle)).append("\n");
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
    openapiFields.add("a_objContacttitle");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("a_objContacttitle");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ContacttitleGetAutocompleteV2ResponseMPayload
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ContacttitleGetAutocompleteV2ResponseMPayload.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ContacttitleGetAutocompleteV2ResponseMPayload is not found in the empty JSON string", ContacttitleGetAutocompleteV2ResponseMPayload.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ContacttitleGetAutocompleteV2ResponseMPayload.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ContacttitleGetAutocompleteV2ResponseMPayload` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ContacttitleGetAutocompleteV2ResponseMPayload.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("a_objContacttitle").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `a_objContacttitle` to be an array in the JSON string but got `%s`", jsonObj.get("a_objContacttitle").toString()));
      }

      JsonArray jsonArrayaObjContacttitle = jsonObj.getAsJsonArray("a_objContacttitle");
      // validate the required field `a_objContacttitle` (array)
      for (int i = 0; i < jsonArrayaObjContacttitle.size(); i++) {
        ContacttitleAutocompleteElementResponse.validateJsonElement(jsonArrayaObjContacttitle.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ContacttitleGetAutocompleteV2ResponseMPayload.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ContacttitleGetAutocompleteV2ResponseMPayload' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ContacttitleGetAutocompleteV2ResponseMPayload> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ContacttitleGetAutocompleteV2ResponseMPayload.class));

       return (TypeAdapter<T>) new TypeAdapter<ContacttitleGetAutocompleteV2ResponseMPayload>() {
           @Override
           public void write(JsonWriter out, ContacttitleGetAutocompleteV2ResponseMPayload value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ContacttitleGetAutocompleteV2ResponseMPayload read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ContacttitleGetAutocompleteV2ResponseMPayload given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ContacttitleGetAutocompleteV2ResponseMPayload
   * @throws IOException if the JSON string is invalid with respect to ContacttitleGetAutocompleteV2ResponseMPayload
   */
  public static ContacttitleGetAutocompleteV2ResponseMPayload fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ContacttitleGetAutocompleteV2ResponseMPayload.class);
  }

  /**
   * Convert an instance of ContacttitleGetAutocompleteV2ResponseMPayload to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

