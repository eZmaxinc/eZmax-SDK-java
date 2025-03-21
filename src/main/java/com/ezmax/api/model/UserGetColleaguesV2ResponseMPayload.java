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
import com.ezmax.api.model.ColleagueResponseCompoundV2;
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
 * Response for GET /2/object/user/{pkiUserID}/getColleagues
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-07T19:20:13.445471985Z[Etc/UTC]", comments = "Generator version: 7.12.0")
public class UserGetColleaguesV2ResponseMPayload {
  public static final String SERIALIZED_NAME_A_OBJ_COLLEAGUE = "a_objColleague";
  @SerializedName(SERIALIZED_NAME_A_OBJ_COLLEAGUE)
  @javax.annotation.Nonnull
  private List<ColleagueResponseCompoundV2> aObjColleague = new ArrayList<>();

  public static final String SERIALIZED_NAME_A_OBJ_COLLEAGUE_CLONABLE = "a_objColleagueClonable";
  @SerializedName(SERIALIZED_NAME_A_OBJ_COLLEAGUE_CLONABLE)
  @javax.annotation.Nonnull
  private List<ColleagueResponseCompoundV2> aObjColleagueClonable = new ArrayList<>();

  public UserGetColleaguesV2ResponseMPayload() {
  }

  public UserGetColleaguesV2ResponseMPayload aObjColleague(@javax.annotation.Nonnull List<ColleagueResponseCompoundV2> aObjColleague) {
    this.aObjColleague = aObjColleague;
    return this;
  }

  public UserGetColleaguesV2ResponseMPayload addAObjColleagueItem(ColleagueResponseCompoundV2 aObjColleagueItem) {
    if (this.aObjColleague == null) {
      this.aObjColleague = new ArrayList<>();
    }
    this.aObjColleague.add(aObjColleagueItem);
    return this;
  }

  /**
   * Get aObjColleague
   * @return aObjColleague
   */
  @javax.annotation.Nonnull
  public List<ColleagueResponseCompoundV2> getaObjColleague() {
    return aObjColleague;
  }

  public void setaObjColleague(@javax.annotation.Nonnull List<ColleagueResponseCompoundV2> aObjColleague) {
    this.aObjColleague = aObjColleague;
  }


  public UserGetColleaguesV2ResponseMPayload aObjColleagueClonable(@javax.annotation.Nonnull List<ColleagueResponseCompoundV2> aObjColleagueClonable) {
    this.aObjColleagueClonable = aObjColleagueClonable;
    return this;
  }

  public UserGetColleaguesV2ResponseMPayload addAObjColleagueClonableItem(ColleagueResponseCompoundV2 aObjColleagueClonableItem) {
    if (this.aObjColleagueClonable == null) {
      this.aObjColleagueClonable = new ArrayList<>();
    }
    this.aObjColleagueClonable.add(aObjColleagueClonableItem);
    return this;
  }

  /**
   * Get aObjColleagueClonable
   * @return aObjColleagueClonable
   */
  @javax.annotation.Nonnull
  public List<ColleagueResponseCompoundV2> getaObjColleagueClonable() {
    return aObjColleagueClonable;
  }

  public void setaObjColleagueClonable(@javax.annotation.Nonnull List<ColleagueResponseCompoundV2> aObjColleagueClonable) {
    this.aObjColleagueClonable = aObjColleagueClonable;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserGetColleaguesV2ResponseMPayload userGetColleaguesV2ResponseMPayload = (UserGetColleaguesV2ResponseMPayload) o;
    return Objects.equals(this.aObjColleague, userGetColleaguesV2ResponseMPayload.aObjColleague) &&
        Objects.equals(this.aObjColleagueClonable, userGetColleaguesV2ResponseMPayload.aObjColleagueClonable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aObjColleague, aObjColleagueClonable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserGetColleaguesV2ResponseMPayload {\n");
    sb.append("    aObjColleague: ").append(toIndentedString(aObjColleague)).append("\n");
    sb.append("    aObjColleagueClonable: ").append(toIndentedString(aObjColleagueClonable)).append("\n");
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
    openapiFields.add("a_objColleague");
    openapiFields.add("a_objColleagueClonable");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("a_objColleague");
    openapiRequiredFields.add("a_objColleagueClonable");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UserGetColleaguesV2ResponseMPayload
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UserGetColleaguesV2ResponseMPayload.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UserGetColleaguesV2ResponseMPayload is not found in the empty JSON string", UserGetColleaguesV2ResponseMPayload.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UserGetColleaguesV2ResponseMPayload.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UserGetColleaguesV2ResponseMPayload` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UserGetColleaguesV2ResponseMPayload.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("a_objColleague").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `a_objColleague` to be an array in the JSON string but got `%s`", jsonObj.get("a_objColleague").toString()));
      }

      JsonArray jsonArrayaObjColleague = jsonObj.getAsJsonArray("a_objColleague");
      // validate the required field `a_objColleague` (array)
      for (int i = 0; i < jsonArrayaObjColleague.size(); i++) {
        ColleagueResponseCompoundV2.validateJsonElement(jsonArrayaObjColleague.get(i));
      };
      // ensure the json data is an array
      if (!jsonObj.get("a_objColleagueClonable").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `a_objColleagueClonable` to be an array in the JSON string but got `%s`", jsonObj.get("a_objColleagueClonable").toString()));
      }

      JsonArray jsonArrayaObjColleagueClonable = jsonObj.getAsJsonArray("a_objColleagueClonable");
      // validate the required field `a_objColleagueClonable` (array)
      for (int i = 0; i < jsonArrayaObjColleagueClonable.size(); i++) {
        ColleagueResponseCompoundV2.validateJsonElement(jsonArrayaObjColleagueClonable.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UserGetColleaguesV2ResponseMPayload.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UserGetColleaguesV2ResponseMPayload' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UserGetColleaguesV2ResponseMPayload> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UserGetColleaguesV2ResponseMPayload.class));

       return (TypeAdapter<T>) new TypeAdapter<UserGetColleaguesV2ResponseMPayload>() {
           @Override
           public void write(JsonWriter out, UserGetColleaguesV2ResponseMPayload value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UserGetColleaguesV2ResponseMPayload read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of UserGetColleaguesV2ResponseMPayload given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UserGetColleaguesV2ResponseMPayload
   * @throws IOException if the JSON string is invalid with respect to UserGetColleaguesV2ResponseMPayload
   */
  public static UserGetColleaguesV2ResponseMPayload fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UserGetColleaguesV2ResponseMPayload.class);
  }

  /**
   * Convert an instance of UserGetColleaguesV2ResponseMPayload to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

