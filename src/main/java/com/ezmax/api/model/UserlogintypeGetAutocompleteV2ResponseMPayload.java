/*
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.2.0
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ezmax.api.model;

import java.util.Objects;
import com.ezmax.api.model.UserlogintypeAutocompleteElementResponse;
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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import eZmaxAPI.JSON;

/**
 * Payload for POST /2/object/userlogintype/getAutocomplete
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-28T04:04:06.974848816Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class UserlogintypeGetAutocompleteV2ResponseMPayload {
  public static final String SERIALIZED_NAME_A_OBJ_USERLOGINTYPE = "a_objUserlogintype";
  @SerializedName(SERIALIZED_NAME_A_OBJ_USERLOGINTYPE)
  private List<UserlogintypeAutocompleteElementResponse> aObjUserlogintype = new ArrayList<>();

  public UserlogintypeGetAutocompleteV2ResponseMPayload() {
  }

  public UserlogintypeGetAutocompleteV2ResponseMPayload aObjUserlogintype(List<UserlogintypeAutocompleteElementResponse> aObjUserlogintype) {
    this.aObjUserlogintype = aObjUserlogintype;
    return this;
  }

  public UserlogintypeGetAutocompleteV2ResponseMPayload addAObjUserlogintypeItem(UserlogintypeAutocompleteElementResponse aObjUserlogintypeItem) {
    if (this.aObjUserlogintype == null) {
      this.aObjUserlogintype = new ArrayList<>();
    }
    this.aObjUserlogintype.add(aObjUserlogintypeItem);
    return this;
  }

   /**
   * An array of Userlogintype autocomplete element response.
   * @return aObjUserlogintype
  **/
  @javax.annotation.Nonnull
  public List<UserlogintypeAutocompleteElementResponse> getaObjUserlogintype() {
    return aObjUserlogintype;
  }

  public void setaObjUserlogintype(List<UserlogintypeAutocompleteElementResponse> aObjUserlogintype) {
    this.aObjUserlogintype = aObjUserlogintype;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserlogintypeGetAutocompleteV2ResponseMPayload userlogintypeGetAutocompleteV2ResponseMPayload = (UserlogintypeGetAutocompleteV2ResponseMPayload) o;
    return Objects.equals(this.aObjUserlogintype, userlogintypeGetAutocompleteV2ResponseMPayload.aObjUserlogintype);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aObjUserlogintype);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserlogintypeGetAutocompleteV2ResponseMPayload {\n");
    sb.append("    aObjUserlogintype: ").append(toIndentedString(aObjUserlogintype)).append("\n");
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
    openapiFields.add("a_objUserlogintype");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("a_objUserlogintype");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to UserlogintypeGetAutocompleteV2ResponseMPayload
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UserlogintypeGetAutocompleteV2ResponseMPayload.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UserlogintypeGetAutocompleteV2ResponseMPayload is not found in the empty JSON string", UserlogintypeGetAutocompleteV2ResponseMPayload.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UserlogintypeGetAutocompleteV2ResponseMPayload.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UserlogintypeGetAutocompleteV2ResponseMPayload` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UserlogintypeGetAutocompleteV2ResponseMPayload.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("a_objUserlogintype").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `a_objUserlogintype` to be an array in the JSON string but got `%s`", jsonObj.get("a_objUserlogintype").toString()));
      }

      JsonArray jsonArrayaObjUserlogintype = jsonObj.getAsJsonArray("a_objUserlogintype");
      // validate the required field `a_objUserlogintype` (array)
      for (int i = 0; i < jsonArrayaObjUserlogintype.size(); i++) {
        UserlogintypeAutocompleteElementResponse.validateJsonElement(jsonArrayaObjUserlogintype.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UserlogintypeGetAutocompleteV2ResponseMPayload.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UserlogintypeGetAutocompleteV2ResponseMPayload' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UserlogintypeGetAutocompleteV2ResponseMPayload> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UserlogintypeGetAutocompleteV2ResponseMPayload.class));

       return (TypeAdapter<T>) new TypeAdapter<UserlogintypeGetAutocompleteV2ResponseMPayload>() {
           @Override
           public void write(JsonWriter out, UserlogintypeGetAutocompleteV2ResponseMPayload value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UserlogintypeGetAutocompleteV2ResponseMPayload read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UserlogintypeGetAutocompleteV2ResponseMPayload given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UserlogintypeGetAutocompleteV2ResponseMPayload
  * @throws IOException if the JSON string is invalid with respect to UserlogintypeGetAutocompleteV2ResponseMPayload
  */
  public static UserlogintypeGetAutocompleteV2ResponseMPayload fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UserlogintypeGetAutocompleteV2ResponseMPayload.class);
  }

 /**
  * Convert an instance of UserlogintypeGetAutocompleteV2ResponseMPayload to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
