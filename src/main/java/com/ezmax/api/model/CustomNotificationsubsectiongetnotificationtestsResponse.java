/*
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.8
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ezmax.api.model;

import java.util.Objects;
import java.util.Arrays;
import com.ezmax.api.model.CustomNotificationsubsectiongetnotificationtestsResponseAllOf;
import com.ezmax.api.model.CustomNotificationtestgetnotificationtestsResponse;
import com.ezmax.api.model.NotificationsubsectionResponse;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import eZmaxAPI.JSON;

/**
 * A Notificationsubsection Object in the context of getNotificationtests
 */
@ApiModel(description = "A Notificationsubsection Object in the context of getNotificationtests")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-20T16:59:39.826205Z[Etc/UTC]")
public class CustomNotificationsubsectiongetnotificationtestsResponse {
  public static final String SERIALIZED_NAME_PKI_NOTIFICATIONSUBSECTION_I_D = "pkiNotificationsubsectionID";
  @SerializedName(SERIALIZED_NAME_PKI_NOTIFICATIONSUBSECTION_I_D)
  private Integer pkiNotificationsubsectionID;

  public static final String SERIALIZED_NAME_FKI_NOTIFICATIONSECTION_I_D = "fkiNotificationsectionID";
  @SerializedName(SERIALIZED_NAME_FKI_NOTIFICATIONSECTION_I_D)
  private Integer fkiNotificationsectionID;

  public static final String SERIALIZED_NAME_S_NOTIFICATIONSUBSECTION_NAME_X = "sNotificationsubsectionNameX";
  @SerializedName(SERIALIZED_NAME_S_NOTIFICATIONSUBSECTION_NAME_X)
  private String sNotificationsubsectionNameX;

  public static final String SERIALIZED_NAME_A_OBJ_NOTIFICATIONTEST = "a_objNotificationtest";
  @SerializedName(SERIALIZED_NAME_A_OBJ_NOTIFICATIONTEST)
  private List<CustomNotificationtestgetnotificationtestsResponse> aObjNotificationtest = new ArrayList<>();

  public CustomNotificationsubsectiongetnotificationtestsResponse() { 
  }

  public CustomNotificationsubsectiongetnotificationtestsResponse pkiNotificationsubsectionID(Integer pkiNotificationsubsectionID) {
    
    this.pkiNotificationsubsectionID = pkiNotificationsubsectionID;
    return this;
  }

   /**
   * The unique ID of the Notificationsubsection
   * minimum: 0
   * @return pkiNotificationsubsectionID
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "3", required = true, value = "The unique ID of the Notificationsubsection")

  public Integer getPkiNotificationsubsectionID() {
    return pkiNotificationsubsectionID;
  }


  public void setPkiNotificationsubsectionID(Integer pkiNotificationsubsectionID) {
    this.pkiNotificationsubsectionID = pkiNotificationsubsectionID;
  }


  public CustomNotificationsubsectiongetnotificationtestsResponse fkiNotificationsectionID(Integer fkiNotificationsectionID) {
    
    this.fkiNotificationsectionID = fkiNotificationsectionID;
    return this;
  }

   /**
   * The unique ID of the Notificationsection
   * minimum: 0
   * @return fkiNotificationsectionID
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1", required = true, value = "The unique ID of the Notificationsection")

  public Integer getFkiNotificationsectionID() {
    return fkiNotificationsectionID;
  }


  public void setFkiNotificationsectionID(Integer fkiNotificationsectionID) {
    this.fkiNotificationsectionID = fkiNotificationsectionID;
  }


  public CustomNotificationsubsectiongetnotificationtestsResponse sNotificationsubsectionNameX(String sNotificationsubsectionNameX) {
    
    this.sNotificationsubsectionNameX = sNotificationsubsectionNameX;
    return this;
  }

   /**
   * The name of the Notificationsubsection in the language of the requester
   * @return sNotificationsubsectionNameX
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Default", required = true, value = "The name of the Notificationsubsection in the language of the requester")

  public String getsNotificationsubsectionNameX() {
    return sNotificationsubsectionNameX;
  }


  public void setsNotificationsubsectionNameX(String sNotificationsubsectionNameX) {
    this.sNotificationsubsectionNameX = sNotificationsubsectionNameX;
  }


  public CustomNotificationsubsectiongetnotificationtestsResponse aObjNotificationtest(List<CustomNotificationtestgetnotificationtestsResponse> aObjNotificationtest) {
    
    this.aObjNotificationtest = aObjNotificationtest;
    return this;
  }

  public CustomNotificationsubsectiongetnotificationtestsResponse addAObjNotificationtestItem(CustomNotificationtestgetnotificationtestsResponse aObjNotificationtestItem) {
    this.aObjNotificationtest.add(aObjNotificationtestItem);
    return this;
  }

   /**
   * Get aObjNotificationtest
   * @return aObjNotificationtest
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<CustomNotificationtestgetnotificationtestsResponse> getaObjNotificationtest() {
    return aObjNotificationtest;
  }


  public void setaObjNotificationtest(List<CustomNotificationtestgetnotificationtestsResponse> aObjNotificationtest) {
    this.aObjNotificationtest = aObjNotificationtest;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomNotificationsubsectiongetnotificationtestsResponse customNotificationsubsectiongetnotificationtestsResponse = (CustomNotificationsubsectiongetnotificationtestsResponse) o;
    return Objects.equals(this.pkiNotificationsubsectionID, customNotificationsubsectiongetnotificationtestsResponse.pkiNotificationsubsectionID) &&
        Objects.equals(this.fkiNotificationsectionID, customNotificationsubsectiongetnotificationtestsResponse.fkiNotificationsectionID) &&
        Objects.equals(this.sNotificationsubsectionNameX, customNotificationsubsectiongetnotificationtestsResponse.sNotificationsubsectionNameX) &&
        Objects.equals(this.aObjNotificationtest, customNotificationsubsectiongetnotificationtestsResponse.aObjNotificationtest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pkiNotificationsubsectionID, fkiNotificationsectionID, sNotificationsubsectionNameX, aObjNotificationtest);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomNotificationsubsectiongetnotificationtestsResponse {\n");
    sb.append("    pkiNotificationsubsectionID: ").append(toIndentedString(pkiNotificationsubsectionID)).append("\n");
    sb.append("    fkiNotificationsectionID: ").append(toIndentedString(fkiNotificationsectionID)).append("\n");
    sb.append("    sNotificationsubsectionNameX: ").append(toIndentedString(sNotificationsubsectionNameX)).append("\n");
    sb.append("    aObjNotificationtest: ").append(toIndentedString(aObjNotificationtest)).append("\n");
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
    openapiFields.add("pkiNotificationsubsectionID");
    openapiFields.add("fkiNotificationsectionID");
    openapiFields.add("sNotificationsubsectionNameX");
    openapiFields.add("a_objNotificationtest");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("pkiNotificationsubsectionID");
    openapiRequiredFields.add("fkiNotificationsectionID");
    openapiRequiredFields.add("sNotificationsubsectionNameX");
    openapiRequiredFields.add("a_objNotificationtest");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CustomNotificationsubsectiongetnotificationtestsResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CustomNotificationsubsectiongetnotificationtestsResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CustomNotificationsubsectiongetnotificationtestsResponse is not found in the empty JSON string", CustomNotificationsubsectiongetnotificationtestsResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CustomNotificationsubsectiongetnotificationtestsResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CustomNotificationsubsectiongetnotificationtestsResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CustomNotificationsubsectiongetnotificationtestsResponse.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("sNotificationsubsectionNameX") != null && !jsonObj.get("sNotificationsubsectionNameX").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sNotificationsubsectionNameX` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sNotificationsubsectionNameX").toString()));
      }
      JsonArray jsonArrayaObjNotificationtest = jsonObj.getAsJsonArray("a_objNotificationtest");
      if (jsonArrayaObjNotificationtest != null) {
        // ensure the json data is an array
        if (!jsonObj.get("a_objNotificationtest").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `a_objNotificationtest` to be an array in the JSON string but got `%s`", jsonObj.get("a_objNotificationtest").toString()));
        }

        // validate the optional field `a_objNotificationtest` (array)
        for (int i = 0; i < jsonArrayaObjNotificationtest.size(); i++) {
          CustomNotificationtestgetnotificationtestsResponse.validateJsonObject(jsonArrayaObjNotificationtest.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CustomNotificationsubsectiongetnotificationtestsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CustomNotificationsubsectiongetnotificationtestsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CustomNotificationsubsectiongetnotificationtestsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CustomNotificationsubsectiongetnotificationtestsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<CustomNotificationsubsectiongetnotificationtestsResponse>() {
           @Override
           public void write(JsonWriter out, CustomNotificationsubsectiongetnotificationtestsResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CustomNotificationsubsectiongetnotificationtestsResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CustomNotificationsubsectiongetnotificationtestsResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CustomNotificationsubsectiongetnotificationtestsResponse
  * @throws IOException if the JSON string is invalid with respect to CustomNotificationsubsectiongetnotificationtestsResponse
  */
  public static CustomNotificationsubsectiongetnotificationtestsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CustomNotificationsubsectiongetnotificationtestsResponse.class);
  }

 /**
  * Convert an instance of CustomNotificationsubsectiongetnotificationtestsResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
