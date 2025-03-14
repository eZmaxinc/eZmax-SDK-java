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
import com.ezmax.api.model.ModulegroupResponseCompound;
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
 * Response for GET /1/object/user/{pkiUserID}/getPermissions
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-07T19:20:13.445471985Z[Etc/UTC]", comments = "Generator version: 7.12.0")
public class UserGetPermissionsV1ResponseMPayload {
  public static final String SERIALIZED_NAME_A_OBJ_MODULEGROUP = "a_objModulegroup";
  @SerializedName(SERIALIZED_NAME_A_OBJ_MODULEGROUP)
  @javax.annotation.Nonnull
  private List<ModulegroupResponseCompound> aObjModulegroup = new ArrayList<>();

  public UserGetPermissionsV1ResponseMPayload() {
  }

  public UserGetPermissionsV1ResponseMPayload aObjModulegroup(@javax.annotation.Nonnull List<ModulegroupResponseCompound> aObjModulegroup) {
    this.aObjModulegroup = aObjModulegroup;
    return this;
  }

  public UserGetPermissionsV1ResponseMPayload addAObjModulegroupItem(ModulegroupResponseCompound aObjModulegroupItem) {
    if (this.aObjModulegroup == null) {
      this.aObjModulegroup = new ArrayList<>();
    }
    this.aObjModulegroup.add(aObjModulegroupItem);
    return this;
  }

  /**
   * Get aObjModulegroup
   * @return aObjModulegroup
   */
  @javax.annotation.Nonnull
  public List<ModulegroupResponseCompound> getaObjModulegroup() {
    return aObjModulegroup;
  }

  public void setaObjModulegroup(@javax.annotation.Nonnull List<ModulegroupResponseCompound> aObjModulegroup) {
    this.aObjModulegroup = aObjModulegroup;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserGetPermissionsV1ResponseMPayload userGetPermissionsV1ResponseMPayload = (UserGetPermissionsV1ResponseMPayload) o;
    return Objects.equals(this.aObjModulegroup, userGetPermissionsV1ResponseMPayload.aObjModulegroup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aObjModulegroup);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserGetPermissionsV1ResponseMPayload {\n");
    sb.append("    aObjModulegroup: ").append(toIndentedString(aObjModulegroup)).append("\n");
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
    openapiFields.add("a_objModulegroup");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("a_objModulegroup");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UserGetPermissionsV1ResponseMPayload
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UserGetPermissionsV1ResponseMPayload.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UserGetPermissionsV1ResponseMPayload is not found in the empty JSON string", UserGetPermissionsV1ResponseMPayload.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UserGetPermissionsV1ResponseMPayload.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UserGetPermissionsV1ResponseMPayload` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UserGetPermissionsV1ResponseMPayload.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("a_objModulegroup").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `a_objModulegroup` to be an array in the JSON string but got `%s`", jsonObj.get("a_objModulegroup").toString()));
      }

      JsonArray jsonArrayaObjModulegroup = jsonObj.getAsJsonArray("a_objModulegroup");
      // validate the required field `a_objModulegroup` (array)
      for (int i = 0; i < jsonArrayaObjModulegroup.size(); i++) {
        ModulegroupResponseCompound.validateJsonElement(jsonArrayaObjModulegroup.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UserGetPermissionsV1ResponseMPayload.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UserGetPermissionsV1ResponseMPayload' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UserGetPermissionsV1ResponseMPayload> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UserGetPermissionsV1ResponseMPayload.class));

       return (TypeAdapter<T>) new TypeAdapter<UserGetPermissionsV1ResponseMPayload>() {
           @Override
           public void write(JsonWriter out, UserGetPermissionsV1ResponseMPayload value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UserGetPermissionsV1ResponseMPayload read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of UserGetPermissionsV1ResponseMPayload given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UserGetPermissionsV1ResponseMPayload
   * @throws IOException if the JSON string is invalid with respect to UserGetPermissionsV1ResponseMPayload
   */
  public static UserGetPermissionsV1ResponseMPayload fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UserGetPermissionsV1ResponseMPayload.class);
  }

  /**
   * Convert an instance of UserGetPermissionsV1ResponseMPayload to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

