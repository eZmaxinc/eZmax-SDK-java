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
import com.ezmax.api.model.ApikeyResponseCompound;
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
 * Response for GET /1/object/user/{pkiUserID}/getApikeys
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-07T19:20:13.445471985Z[Etc/UTC]", comments = "Generator version: 7.12.0")
public class UserGetApikeysV1ResponseMPayload {
  public static final String SERIALIZED_NAME_A_OBJ_APIKEY = "a_objApikey";
  @SerializedName(SERIALIZED_NAME_A_OBJ_APIKEY)
  @javax.annotation.Nonnull
  private List<ApikeyResponseCompound> aObjApikey = new ArrayList<>();

  public UserGetApikeysV1ResponseMPayload() {
  }

  public UserGetApikeysV1ResponseMPayload aObjApikey(@javax.annotation.Nonnull List<ApikeyResponseCompound> aObjApikey) {
    this.aObjApikey = aObjApikey;
    return this;
  }

  public UserGetApikeysV1ResponseMPayload addAObjApikeyItem(ApikeyResponseCompound aObjApikeyItem) {
    if (this.aObjApikey == null) {
      this.aObjApikey = new ArrayList<>();
    }
    this.aObjApikey.add(aObjApikeyItem);
    return this;
  }

  /**
   * Get aObjApikey
   * @return aObjApikey
   */
  @javax.annotation.Nonnull
  public List<ApikeyResponseCompound> getaObjApikey() {
    return aObjApikey;
  }

  public void setaObjApikey(@javax.annotation.Nonnull List<ApikeyResponseCompound> aObjApikey) {
    this.aObjApikey = aObjApikey;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserGetApikeysV1ResponseMPayload userGetApikeysV1ResponseMPayload = (UserGetApikeysV1ResponseMPayload) o;
    return Objects.equals(this.aObjApikey, userGetApikeysV1ResponseMPayload.aObjApikey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aObjApikey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserGetApikeysV1ResponseMPayload {\n");
    sb.append("    aObjApikey: ").append(toIndentedString(aObjApikey)).append("\n");
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
    openapiFields.add("a_objApikey");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("a_objApikey");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UserGetApikeysV1ResponseMPayload
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UserGetApikeysV1ResponseMPayload.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UserGetApikeysV1ResponseMPayload is not found in the empty JSON string", UserGetApikeysV1ResponseMPayload.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UserGetApikeysV1ResponseMPayload.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UserGetApikeysV1ResponseMPayload` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UserGetApikeysV1ResponseMPayload.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("a_objApikey").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `a_objApikey` to be an array in the JSON string but got `%s`", jsonObj.get("a_objApikey").toString()));
      }

      JsonArray jsonArrayaObjApikey = jsonObj.getAsJsonArray("a_objApikey");
      // validate the required field `a_objApikey` (array)
      for (int i = 0; i < jsonArrayaObjApikey.size(); i++) {
        ApikeyResponseCompound.validateJsonElement(jsonArrayaObjApikey.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UserGetApikeysV1ResponseMPayload.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UserGetApikeysV1ResponseMPayload' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UserGetApikeysV1ResponseMPayload> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UserGetApikeysV1ResponseMPayload.class));

       return (TypeAdapter<T>) new TypeAdapter<UserGetApikeysV1ResponseMPayload>() {
           @Override
           public void write(JsonWriter out, UserGetApikeysV1ResponseMPayload value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UserGetApikeysV1ResponseMPayload read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of UserGetApikeysV1ResponseMPayload given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UserGetApikeysV1ResponseMPayload
   * @throws IOException if the JSON string is invalid with respect to UserGetApikeysV1ResponseMPayload
   */
  public static UserGetApikeysV1ResponseMPayload fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UserGetApikeysV1ResponseMPayload.class);
  }

  /**
   * Convert an instance of UserGetApikeysV1ResponseMPayload to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

