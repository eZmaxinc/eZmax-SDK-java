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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;

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
 * A Branding List Element
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-07T19:20:13.445471985Z[Etc/UTC]", comments = "Generator version: 7.12.0")
public class ApikeyListElement {
  public static final String SERIALIZED_NAME_PKI_APIKEY_I_D = "pkiApikeyID";
  @SerializedName(SERIALIZED_NAME_PKI_APIKEY_I_D)
  @javax.annotation.Nonnull
  private Integer pkiApikeyID;

  public static final String SERIALIZED_NAME_S_APIKEY_DESCRIPTION_X = "sApikeyDescriptionX";
  @SerializedName(SERIALIZED_NAME_S_APIKEY_DESCRIPTION_X)
  @javax.annotation.Nonnull
  private String sApikeyDescriptionX;

  public static final String SERIALIZED_NAME_S_USER_FIRSTNAME = "sUserFirstname";
  @SerializedName(SERIALIZED_NAME_S_USER_FIRSTNAME)
  @javax.annotation.Nonnull
  private String sUserFirstname;

  public static final String SERIALIZED_NAME_S_USER_LASTNAME = "sUserLastname";
  @SerializedName(SERIALIZED_NAME_S_USER_LASTNAME)
  @javax.annotation.Nonnull
  private String sUserLastname;

  public static final String SERIALIZED_NAME_B_APIKEY_ISACTIVE = "bApikeyIsactive";
  @SerializedName(SERIALIZED_NAME_B_APIKEY_ISACTIVE)
  @javax.annotation.Nonnull
  private Boolean bApikeyIsactive;

  public static final String SERIALIZED_NAME_B_APIKEY_ISSIGNED = "bApikeyIssigned";
  @SerializedName(SERIALIZED_NAME_B_APIKEY_ISSIGNED)
  @javax.annotation.Nonnull
  private Boolean bApikeyIssigned;

  public ApikeyListElement() {
  }

  public ApikeyListElement pkiApikeyID(@javax.annotation.Nonnull Integer pkiApikeyID) {
    this.pkiApikeyID = pkiApikeyID;
    return this;
  }

  /**
   * The unique ID of the Apikey
   * minimum: 0
   * @return pkiApikeyID
   */
  @javax.annotation.Nonnull
  public Integer getPkiApikeyID() {
    return pkiApikeyID;
  }

  public void setPkiApikeyID(@javax.annotation.Nonnull Integer pkiApikeyID) {
    this.pkiApikeyID = pkiApikeyID;
  }


  public ApikeyListElement sApikeyDescriptionX(@javax.annotation.Nonnull String sApikeyDescriptionX) {
    this.sApikeyDescriptionX = sApikeyDescriptionX;
    return this;
  }

  /**
   * The description of the Apikey in the language of the requester
   * @return sApikeyDescriptionX
   */
  @javax.annotation.Nonnull
  public String getsApikeyDescriptionX() {
    return sApikeyDescriptionX;
  }

  public void setsApikeyDescriptionX(@javax.annotation.Nonnull String sApikeyDescriptionX) {
    this.sApikeyDescriptionX = sApikeyDescriptionX;
  }


  public ApikeyListElement sUserFirstname(@javax.annotation.Nonnull String sUserFirstname) {
    this.sUserFirstname = sUserFirstname;
    return this;
  }

  /**
   * The first name of the user
   * @return sUserFirstname
   */
  @javax.annotation.Nonnull
  public String getsUserFirstname() {
    return sUserFirstname;
  }

  public void setsUserFirstname(@javax.annotation.Nonnull String sUserFirstname) {
    this.sUserFirstname = sUserFirstname;
  }


  public ApikeyListElement sUserLastname(@javax.annotation.Nonnull String sUserLastname) {
    this.sUserLastname = sUserLastname;
    return this;
  }

  /**
   * The last name of the user
   * @return sUserLastname
   */
  @javax.annotation.Nonnull
  public String getsUserLastname() {
    return sUserLastname;
  }

  public void setsUserLastname(@javax.annotation.Nonnull String sUserLastname) {
    this.sUserLastname = sUserLastname;
  }


  public ApikeyListElement bApikeyIsactive(@javax.annotation.Nonnull Boolean bApikeyIsactive) {
    this.bApikeyIsactive = bApikeyIsactive;
    return this;
  }

  /**
   * Whether the apikey is active or not
   * @return bApikeyIsactive
   */
  @javax.annotation.Nonnull
  public Boolean getbApikeyIsactive() {
    return bApikeyIsactive;
  }

  public void setbApikeyIsactive(@javax.annotation.Nonnull Boolean bApikeyIsactive) {
    this.bApikeyIsactive = bApikeyIsactive;
  }


  public ApikeyListElement bApikeyIssigned(@javax.annotation.Nonnull Boolean bApikeyIssigned) {
    this.bApikeyIssigned = bApikeyIssigned;
    return this;
  }

  /**
   * Whether the apikey is signed or not
   * @return bApikeyIssigned
   */
  @javax.annotation.Nonnull
  public Boolean getbApikeyIssigned() {
    return bApikeyIssigned;
  }

  public void setbApikeyIssigned(@javax.annotation.Nonnull Boolean bApikeyIssigned) {
    this.bApikeyIssigned = bApikeyIssigned;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApikeyListElement apikeyListElement = (ApikeyListElement) o;
    return Objects.equals(this.pkiApikeyID, apikeyListElement.pkiApikeyID) &&
        Objects.equals(this.sApikeyDescriptionX, apikeyListElement.sApikeyDescriptionX) &&
        Objects.equals(this.sUserFirstname, apikeyListElement.sUserFirstname) &&
        Objects.equals(this.sUserLastname, apikeyListElement.sUserLastname) &&
        Objects.equals(this.bApikeyIsactive, apikeyListElement.bApikeyIsactive) &&
        Objects.equals(this.bApikeyIssigned, apikeyListElement.bApikeyIssigned);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pkiApikeyID, sApikeyDescriptionX, sUserFirstname, sUserLastname, bApikeyIsactive, bApikeyIssigned);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApikeyListElement {\n");
    sb.append("    pkiApikeyID: ").append(toIndentedString(pkiApikeyID)).append("\n");
    sb.append("    sApikeyDescriptionX: ").append(toIndentedString(sApikeyDescriptionX)).append("\n");
    sb.append("    sUserFirstname: ").append(toIndentedString(sUserFirstname)).append("\n");
    sb.append("    sUserLastname: ").append(toIndentedString(sUserLastname)).append("\n");
    sb.append("    bApikeyIsactive: ").append(toIndentedString(bApikeyIsactive)).append("\n");
    sb.append("    bApikeyIssigned: ").append(toIndentedString(bApikeyIssigned)).append("\n");
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
    openapiFields.add("pkiApikeyID");
    openapiFields.add("sApikeyDescriptionX");
    openapiFields.add("sUserFirstname");
    openapiFields.add("sUserLastname");
    openapiFields.add("bApikeyIsactive");
    openapiFields.add("bApikeyIssigned");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("pkiApikeyID");
    openapiRequiredFields.add("sApikeyDescriptionX");
    openapiRequiredFields.add("sUserFirstname");
    openapiRequiredFields.add("sUserLastname");
    openapiRequiredFields.add("bApikeyIsactive");
    openapiRequiredFields.add("bApikeyIssigned");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ApikeyListElement
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ApikeyListElement.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ApikeyListElement is not found in the empty JSON string", ApikeyListElement.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ApikeyListElement.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ApikeyListElement` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ApikeyListElement.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("sApikeyDescriptionX").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sApikeyDescriptionX` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sApikeyDescriptionX").toString()));
      }
      if (!jsonObj.get("sUserFirstname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sUserFirstname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sUserFirstname").toString()));
      }
      if (!jsonObj.get("sUserLastname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sUserLastname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sUserLastname").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ApikeyListElement.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ApikeyListElement' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ApikeyListElement> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ApikeyListElement.class));

       return (TypeAdapter<T>) new TypeAdapter<ApikeyListElement>() {
           @Override
           public void write(JsonWriter out, ApikeyListElement value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ApikeyListElement read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ApikeyListElement given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ApikeyListElement
   * @throws IOException if the JSON string is invalid with respect to ApikeyListElement
   */
  public static ApikeyListElement fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ApikeyListElement.class);
  }

  /**
   * Convert an instance of ApikeyListElement to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

