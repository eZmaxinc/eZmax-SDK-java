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
 * An Email Object
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-27T18:40:35.791662503Z[Etc/UTC]")
public class EmailResponse {
  public static final String SERIALIZED_NAME_PKI_EMAIL_I_D = "pkiEmailID";
  @SerializedName(SERIALIZED_NAME_PKI_EMAIL_I_D)
  private Integer pkiEmailID;

  public static final String SERIALIZED_NAME_FKI_EMAILTYPE_I_D = "fkiEmailtypeID";
  @SerializedName(SERIALIZED_NAME_FKI_EMAILTYPE_I_D)
  private Integer fkiEmailtypeID;

  public static final String SERIALIZED_NAME_S_EMAIL_ADDRESS = "sEmailAddress";
  @SerializedName(SERIALIZED_NAME_S_EMAIL_ADDRESS)
  private String sEmailAddress;

  public EmailResponse() {
  }

  public EmailResponse pkiEmailID(Integer pkiEmailID) {
    
    this.pkiEmailID = pkiEmailID;
    return this;
  }

   /**
   * The unique ID of the Email
   * minimum: 1
   * maximum: 16777215
   * @return pkiEmailID
  **/
  @javax.annotation.Nonnull
  public Integer getPkiEmailID() {
    return pkiEmailID;
  }


  public void setPkiEmailID(Integer pkiEmailID) {
    this.pkiEmailID = pkiEmailID;
  }


  public EmailResponse fkiEmailtypeID(Integer fkiEmailtypeID) {
    
    this.fkiEmailtypeID = fkiEmailtypeID;
    return this;
  }

   /**
   * The unique ID of the Emailtype.  Valid values:  |Value|Description| |-|-| |1|Office| |2|Home|
   * minimum: 0
   * @return fkiEmailtypeID
  **/
  @javax.annotation.Nonnull
  public Integer getFkiEmailtypeID() {
    return fkiEmailtypeID;
  }


  public void setFkiEmailtypeID(Integer fkiEmailtypeID) {
    this.fkiEmailtypeID = fkiEmailtypeID;
  }


  public EmailResponse sEmailAddress(String sEmailAddress) {
    
    this.sEmailAddress = sEmailAddress;
    return this;
  }

   /**
   * The email address.
   * @return sEmailAddress
  **/
  @javax.annotation.Nonnull
  public String getsEmailAddress() {
    return sEmailAddress;
  }


  public void setsEmailAddress(String sEmailAddress) {
    this.sEmailAddress = sEmailAddress;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmailResponse emailResponse = (EmailResponse) o;
    return Objects.equals(this.pkiEmailID, emailResponse.pkiEmailID) &&
        Objects.equals(this.fkiEmailtypeID, emailResponse.fkiEmailtypeID) &&
        Objects.equals(this.sEmailAddress, emailResponse.sEmailAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pkiEmailID, fkiEmailtypeID, sEmailAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailResponse {\n");
    sb.append("    pkiEmailID: ").append(toIndentedString(pkiEmailID)).append("\n");
    sb.append("    fkiEmailtypeID: ").append(toIndentedString(fkiEmailtypeID)).append("\n");
    sb.append("    sEmailAddress: ").append(toIndentedString(sEmailAddress)).append("\n");
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
    openapiFields.add("pkiEmailID");
    openapiFields.add("fkiEmailtypeID");
    openapiFields.add("sEmailAddress");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("pkiEmailID");
    openapiRequiredFields.add("fkiEmailtypeID");
    openapiRequiredFields.add("sEmailAddress");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EmailResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!EmailResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EmailResponse is not found in the empty JSON string", EmailResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!EmailResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EmailResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EmailResponse.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("sEmailAddress").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sEmailAddress` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sEmailAddress").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EmailResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EmailResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EmailResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EmailResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<EmailResponse>() {
           @Override
           public void write(JsonWriter out, EmailResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EmailResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EmailResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EmailResponse
  * @throws IOException if the JSON string is invalid with respect to EmailResponse
  */
  public static EmailResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EmailResponse.class);
  }

 /**
  * Convert an instance of EmailResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
