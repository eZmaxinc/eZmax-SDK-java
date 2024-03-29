/*
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.18
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ezmax.api.model;

import java.util.Objects;
import java.util.Arrays;
import com.ezmax.api.model.FieldENotificationpreferenceStatus;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

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
import java.util.Map.Entry;
import java.util.Set;

import eZmaxAPI.JSON;

/**
 * CustomNotificationtestgetnotificationtestsResponseAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-22T15:33:11.356591451Z[Etc/UTC]")
public class CustomNotificationtestgetnotificationtestsResponseAllOf {
  public static final String SERIALIZED_NAME_E_NOTIFICATIONPREFERENCE_STATUS = "eNotificationpreferenceStatus";
  @SerializedName(SERIALIZED_NAME_E_NOTIFICATIONPREFERENCE_STATUS)
  private FieldENotificationpreferenceStatus eNotificationpreferenceStatus;

  public static final String SERIALIZED_NAME_I_NOTIFICATIONTEST = "iNotificationtest";
  @SerializedName(SERIALIZED_NAME_I_NOTIFICATIONTEST)
  private Integer iNotificationtest;

  public CustomNotificationtestgetnotificationtestsResponseAllOf() {
  }

  public CustomNotificationtestgetnotificationtestsResponseAllOf eNotificationpreferenceStatus(FieldENotificationpreferenceStatus eNotificationpreferenceStatus) {
    
    this.eNotificationpreferenceStatus = eNotificationpreferenceStatus;
    return this;
  }

   /**
   * Get eNotificationpreferenceStatus
   * @return eNotificationpreferenceStatus
  **/
  @javax.annotation.Nonnull
  public FieldENotificationpreferenceStatus geteNotificationpreferenceStatus() {
    return eNotificationpreferenceStatus;
  }


  public void seteNotificationpreferenceStatus(FieldENotificationpreferenceStatus eNotificationpreferenceStatus) {
    this.eNotificationpreferenceStatus = eNotificationpreferenceStatus;
  }


  public CustomNotificationtestgetnotificationtestsResponseAllOf iNotificationtest(Integer iNotificationtest) {
    
    this.iNotificationtest = iNotificationtest;
    return this;
  }

   /**
   * The number of elements returned by the Notificationtest
   * @return iNotificationtest
  **/
  @javax.annotation.Nonnull
  public Integer getiNotificationtest() {
    return iNotificationtest;
  }


  public void setiNotificationtest(Integer iNotificationtest) {
    this.iNotificationtest = iNotificationtest;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomNotificationtestgetnotificationtestsResponseAllOf customNotificationtestgetnotificationtestsResponseAllOf = (CustomNotificationtestgetnotificationtestsResponseAllOf) o;
    return Objects.equals(this.eNotificationpreferenceStatus, customNotificationtestgetnotificationtestsResponseAllOf.eNotificationpreferenceStatus) &&
        Objects.equals(this.iNotificationtest, customNotificationtestgetnotificationtestsResponseAllOf.iNotificationtest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eNotificationpreferenceStatus, iNotificationtest);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomNotificationtestgetnotificationtestsResponseAllOf {\n");
    sb.append("    eNotificationpreferenceStatus: ").append(toIndentedString(eNotificationpreferenceStatus)).append("\n");
    sb.append("    iNotificationtest: ").append(toIndentedString(iNotificationtest)).append("\n");
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
    openapiFields.add("eNotificationpreferenceStatus");
    openapiFields.add("iNotificationtest");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("eNotificationpreferenceStatus");
    openapiRequiredFields.add("iNotificationtest");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CustomNotificationtestgetnotificationtestsResponseAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CustomNotificationtestgetnotificationtestsResponseAllOf.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CustomNotificationtestgetnotificationtestsResponseAllOf is not found in the empty JSON string", CustomNotificationtestgetnotificationtestsResponseAllOf.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CustomNotificationtestgetnotificationtestsResponseAllOf.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CustomNotificationtestgetnotificationtestsResponseAllOf` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CustomNotificationtestgetnotificationtestsResponseAllOf.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CustomNotificationtestgetnotificationtestsResponseAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CustomNotificationtestgetnotificationtestsResponseAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CustomNotificationtestgetnotificationtestsResponseAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CustomNotificationtestgetnotificationtestsResponseAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<CustomNotificationtestgetnotificationtestsResponseAllOf>() {
           @Override
           public void write(JsonWriter out, CustomNotificationtestgetnotificationtestsResponseAllOf value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CustomNotificationtestgetnotificationtestsResponseAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CustomNotificationtestgetnotificationtestsResponseAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CustomNotificationtestgetnotificationtestsResponseAllOf
  * @throws IOException if the JSON string is invalid with respect to CustomNotificationtestgetnotificationtestsResponseAllOf
  */
  public static CustomNotificationtestgetnotificationtestsResponseAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CustomNotificationtestgetnotificationtestsResponseAllOf.class);
  }

 /**
  * Convert an instance of CustomNotificationtestgetnotificationtestsResponseAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

