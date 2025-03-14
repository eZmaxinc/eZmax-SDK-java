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
import com.ezmax.api.model.UsergroupexternalmembershipResponseCompound;
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
 * Response for GET /1/object/usergroupexternal/{pkiUsergroupexternalID}/getUsergroupexternalmemberships
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-07T19:20:13.445471985Z[Etc/UTC]", comments = "Generator version: 7.12.0")
public class UsergroupexternalGetUsergroupexternalmembershipsV1ResponseMPayload {
  public static final String SERIALIZED_NAME_A_OBJ_USERGROUPEXTERNALMEMBERSHIP = "a_objUsergroupexternalmembership";
  @SerializedName(SERIALIZED_NAME_A_OBJ_USERGROUPEXTERNALMEMBERSHIP)
  @javax.annotation.Nonnull
  private List<UsergroupexternalmembershipResponseCompound> aObjUsergroupexternalmembership = new ArrayList<>();

  public UsergroupexternalGetUsergroupexternalmembershipsV1ResponseMPayload() {
  }

  public UsergroupexternalGetUsergroupexternalmembershipsV1ResponseMPayload aObjUsergroupexternalmembership(@javax.annotation.Nonnull List<UsergroupexternalmembershipResponseCompound> aObjUsergroupexternalmembership) {
    this.aObjUsergroupexternalmembership = aObjUsergroupexternalmembership;
    return this;
  }

  public UsergroupexternalGetUsergroupexternalmembershipsV1ResponseMPayload addAObjUsergroupexternalmembershipItem(UsergroupexternalmembershipResponseCompound aObjUsergroupexternalmembershipItem) {
    if (this.aObjUsergroupexternalmembership == null) {
      this.aObjUsergroupexternalmembership = new ArrayList<>();
    }
    this.aObjUsergroupexternalmembership.add(aObjUsergroupexternalmembershipItem);
    return this;
  }

  /**
   * Get aObjUsergroupexternalmembership
   * @return aObjUsergroupexternalmembership
   */
  @javax.annotation.Nonnull
  public List<UsergroupexternalmembershipResponseCompound> getaObjUsergroupexternalmembership() {
    return aObjUsergroupexternalmembership;
  }

  public void setaObjUsergroupexternalmembership(@javax.annotation.Nonnull List<UsergroupexternalmembershipResponseCompound> aObjUsergroupexternalmembership) {
    this.aObjUsergroupexternalmembership = aObjUsergroupexternalmembership;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsergroupexternalGetUsergroupexternalmembershipsV1ResponseMPayload usergroupexternalGetUsergroupexternalmembershipsV1ResponseMPayload = (UsergroupexternalGetUsergroupexternalmembershipsV1ResponseMPayload) o;
    return Objects.equals(this.aObjUsergroupexternalmembership, usergroupexternalGetUsergroupexternalmembershipsV1ResponseMPayload.aObjUsergroupexternalmembership);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aObjUsergroupexternalmembership);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsergroupexternalGetUsergroupexternalmembershipsV1ResponseMPayload {\n");
    sb.append("    aObjUsergroupexternalmembership: ").append(toIndentedString(aObjUsergroupexternalmembership)).append("\n");
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
    openapiFields.add("a_objUsergroupexternalmembership");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("a_objUsergroupexternalmembership");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UsergroupexternalGetUsergroupexternalmembershipsV1ResponseMPayload
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UsergroupexternalGetUsergroupexternalmembershipsV1ResponseMPayload.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UsergroupexternalGetUsergroupexternalmembershipsV1ResponseMPayload is not found in the empty JSON string", UsergroupexternalGetUsergroupexternalmembershipsV1ResponseMPayload.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UsergroupexternalGetUsergroupexternalmembershipsV1ResponseMPayload.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UsergroupexternalGetUsergroupexternalmembershipsV1ResponseMPayload` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UsergroupexternalGetUsergroupexternalmembershipsV1ResponseMPayload.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("a_objUsergroupexternalmembership").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `a_objUsergroupexternalmembership` to be an array in the JSON string but got `%s`", jsonObj.get("a_objUsergroupexternalmembership").toString()));
      }

      JsonArray jsonArrayaObjUsergroupexternalmembership = jsonObj.getAsJsonArray("a_objUsergroupexternalmembership");
      // validate the required field `a_objUsergroupexternalmembership` (array)
      for (int i = 0; i < jsonArrayaObjUsergroupexternalmembership.size(); i++) {
        UsergroupexternalmembershipResponseCompound.validateJsonElement(jsonArrayaObjUsergroupexternalmembership.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UsergroupexternalGetUsergroupexternalmembershipsV1ResponseMPayload.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UsergroupexternalGetUsergroupexternalmembershipsV1ResponseMPayload' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UsergroupexternalGetUsergroupexternalmembershipsV1ResponseMPayload> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UsergroupexternalGetUsergroupexternalmembershipsV1ResponseMPayload.class));

       return (TypeAdapter<T>) new TypeAdapter<UsergroupexternalGetUsergroupexternalmembershipsV1ResponseMPayload>() {
           @Override
           public void write(JsonWriter out, UsergroupexternalGetUsergroupexternalmembershipsV1ResponseMPayload value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UsergroupexternalGetUsergroupexternalmembershipsV1ResponseMPayload read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of UsergroupexternalGetUsergroupexternalmembershipsV1ResponseMPayload given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UsergroupexternalGetUsergroupexternalmembershipsV1ResponseMPayload
   * @throws IOException if the JSON string is invalid with respect to UsergroupexternalGetUsergroupexternalmembershipsV1ResponseMPayload
   */
  public static UsergroupexternalGetUsergroupexternalmembershipsV1ResponseMPayload fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UsergroupexternalGetUsergroupexternalmembershipsV1ResponseMPayload.class);
  }

  /**
   * Convert an instance of UsergroupexternalGetUsergroupexternalmembershipsV1ResponseMPayload to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

