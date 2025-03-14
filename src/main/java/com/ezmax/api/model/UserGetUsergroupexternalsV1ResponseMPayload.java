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
import com.ezmax.api.model.UsergroupexternalResponseCompound;
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
 * Response for GET /1/object/user/{pkiUserID}/getUsergroupexternals
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-07T19:20:13.445471985Z[Etc/UTC]", comments = "Generator version: 7.12.0")
public class UserGetUsergroupexternalsV1ResponseMPayload {
  public static final String SERIALIZED_NAME_A_OBJ_USERGROUPEXTERNAL = "a_objUsergroupexternal";
  @SerializedName(SERIALIZED_NAME_A_OBJ_USERGROUPEXTERNAL)
  @javax.annotation.Nonnull
  private List<UsergroupexternalResponseCompound> aObjUsergroupexternal = new ArrayList<>();

  public UserGetUsergroupexternalsV1ResponseMPayload() {
  }

  public UserGetUsergroupexternalsV1ResponseMPayload aObjUsergroupexternal(@javax.annotation.Nonnull List<UsergroupexternalResponseCompound> aObjUsergroupexternal) {
    this.aObjUsergroupexternal = aObjUsergroupexternal;
    return this;
  }

  public UserGetUsergroupexternalsV1ResponseMPayload addAObjUsergroupexternalItem(UsergroupexternalResponseCompound aObjUsergroupexternalItem) {
    if (this.aObjUsergroupexternal == null) {
      this.aObjUsergroupexternal = new ArrayList<>();
    }
    this.aObjUsergroupexternal.add(aObjUsergroupexternalItem);
    return this;
  }

  /**
   * Get aObjUsergroupexternal
   * @return aObjUsergroupexternal
   */
  @javax.annotation.Nonnull
  public List<UsergroupexternalResponseCompound> getaObjUsergroupexternal() {
    return aObjUsergroupexternal;
  }

  public void setaObjUsergroupexternal(@javax.annotation.Nonnull List<UsergroupexternalResponseCompound> aObjUsergroupexternal) {
    this.aObjUsergroupexternal = aObjUsergroupexternal;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserGetUsergroupexternalsV1ResponseMPayload userGetUsergroupexternalsV1ResponseMPayload = (UserGetUsergroupexternalsV1ResponseMPayload) o;
    return Objects.equals(this.aObjUsergroupexternal, userGetUsergroupexternalsV1ResponseMPayload.aObjUsergroupexternal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aObjUsergroupexternal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserGetUsergroupexternalsV1ResponseMPayload {\n");
    sb.append("    aObjUsergroupexternal: ").append(toIndentedString(aObjUsergroupexternal)).append("\n");
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
    openapiFields.add("a_objUsergroupexternal");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("a_objUsergroupexternal");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UserGetUsergroupexternalsV1ResponseMPayload
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UserGetUsergroupexternalsV1ResponseMPayload.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UserGetUsergroupexternalsV1ResponseMPayload is not found in the empty JSON string", UserGetUsergroupexternalsV1ResponseMPayload.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UserGetUsergroupexternalsV1ResponseMPayload.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UserGetUsergroupexternalsV1ResponseMPayload` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UserGetUsergroupexternalsV1ResponseMPayload.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("a_objUsergroupexternal").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `a_objUsergroupexternal` to be an array in the JSON string but got `%s`", jsonObj.get("a_objUsergroupexternal").toString()));
      }

      JsonArray jsonArrayaObjUsergroupexternal = jsonObj.getAsJsonArray("a_objUsergroupexternal");
      // validate the required field `a_objUsergroupexternal` (array)
      for (int i = 0; i < jsonArrayaObjUsergroupexternal.size(); i++) {
        UsergroupexternalResponseCompound.validateJsonElement(jsonArrayaObjUsergroupexternal.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UserGetUsergroupexternalsV1ResponseMPayload.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UserGetUsergroupexternalsV1ResponseMPayload' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UserGetUsergroupexternalsV1ResponseMPayload> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UserGetUsergroupexternalsV1ResponseMPayload.class));

       return (TypeAdapter<T>) new TypeAdapter<UserGetUsergroupexternalsV1ResponseMPayload>() {
           @Override
           public void write(JsonWriter out, UserGetUsergroupexternalsV1ResponseMPayload value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UserGetUsergroupexternalsV1ResponseMPayload read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of UserGetUsergroupexternalsV1ResponseMPayload given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UserGetUsergroupexternalsV1ResponseMPayload
   * @throws IOException if the JSON string is invalid with respect to UserGetUsergroupexternalsV1ResponseMPayload
   */
  public static UserGetUsergroupexternalsV1ResponseMPayload fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UserGetUsergroupexternalsV1ResponseMPayload.class);
  }

  /**
   * Convert an instance of UserGetUsergroupexternalsV1ResponseMPayload to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

