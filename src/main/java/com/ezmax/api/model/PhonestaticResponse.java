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
 * A Phonestatic Object
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-22T15:33:11.356591451Z[Etc/UTC]")
public class PhonestaticResponse {
  public static final String SERIALIZED_NAME_PKI_PHONESTATIC_I_D = "pkiPhonestaticID";
  @SerializedName(SERIALIZED_NAME_PKI_PHONESTATIC_I_D)
  private Integer pkiPhonestaticID;

  public static final String SERIALIZED_NAME_S_PHONESTATIC_E164 = "sPhonestaticE164";
  @SerializedName(SERIALIZED_NAME_S_PHONESTATIC_E164)
  private String sPhonestaticE164;

  public static final String SERIALIZED_NAME_S_PHONESTATIC_EXTENSION = "sPhonestaticExtension";
  @SerializedName(SERIALIZED_NAME_S_PHONESTATIC_EXTENSION)
  private String sPhonestaticExtension;

  public PhonestaticResponse() {
  }

  public PhonestaticResponse pkiPhonestaticID(Integer pkiPhonestaticID) {
    
    this.pkiPhonestaticID = pkiPhonestaticID;
    return this;
  }

   /**
   * The unique ID of the Phone.
   * minimum: 0
   * @return pkiPhonestaticID
  **/
  @javax.annotation.Nonnull
  public Integer getPkiPhonestaticID() {
    return pkiPhonestaticID;
  }


  public void setPkiPhonestaticID(Integer pkiPhonestaticID) {
    this.pkiPhonestaticID = pkiPhonestaticID;
  }


  public PhonestaticResponse sPhonestaticE164(String sPhonestaticE164) {
    
    this.sPhonestaticE164 = sPhonestaticE164;
    return this;
  }

   /**
   * A phone number in E.164 Format
   * @return sPhonestaticE164
  **/
  @javax.annotation.Nullable
  public String getsPhonestaticE164() {
    return sPhonestaticE164;
  }


  public void setsPhonestaticE164(String sPhonestaticE164) {
    this.sPhonestaticE164 = sPhonestaticE164;
  }


  public PhonestaticResponse sPhonestaticExtension(String sPhonestaticExtension) {
    
    this.sPhonestaticExtension = sPhonestaticExtension;
    return this;
  }

   /**
   * The extension of the phone number.
   * @return sPhonestaticExtension
  **/
  @javax.annotation.Nullable
  public String getsPhonestaticExtension() {
    return sPhonestaticExtension;
  }


  public void setsPhonestaticExtension(String sPhonestaticExtension) {
    this.sPhonestaticExtension = sPhonestaticExtension;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PhonestaticResponse phonestaticResponse = (PhonestaticResponse) o;
    return Objects.equals(this.pkiPhonestaticID, phonestaticResponse.pkiPhonestaticID) &&
        Objects.equals(this.sPhonestaticE164, phonestaticResponse.sPhonestaticE164) &&
        Objects.equals(this.sPhonestaticExtension, phonestaticResponse.sPhonestaticExtension);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pkiPhonestaticID, sPhonestaticE164, sPhonestaticExtension);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhonestaticResponse {\n");
    sb.append("    pkiPhonestaticID: ").append(toIndentedString(pkiPhonestaticID)).append("\n");
    sb.append("    sPhonestaticE164: ").append(toIndentedString(sPhonestaticE164)).append("\n");
    sb.append("    sPhonestaticExtension: ").append(toIndentedString(sPhonestaticExtension)).append("\n");
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
    openapiFields.add("pkiPhonestaticID");
    openapiFields.add("sPhonestaticE164");
    openapiFields.add("sPhonestaticExtension");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("pkiPhonestaticID");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PhonestaticResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PhonestaticResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PhonestaticResponse is not found in the empty JSON string", PhonestaticResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PhonestaticResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PhonestaticResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PhonestaticResponse.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("sPhonestaticE164") != null && !jsonObj.get("sPhonestaticE164").isJsonNull()) && !jsonObj.get("sPhonestaticE164").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sPhonestaticE164` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sPhonestaticE164").toString()));
      }
      if ((jsonObj.get("sPhonestaticExtension") != null && !jsonObj.get("sPhonestaticExtension").isJsonNull()) && !jsonObj.get("sPhonestaticExtension").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sPhonestaticExtension` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sPhonestaticExtension").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PhonestaticResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PhonestaticResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PhonestaticResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PhonestaticResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<PhonestaticResponse>() {
           @Override
           public void write(JsonWriter out, PhonestaticResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PhonestaticResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PhonestaticResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PhonestaticResponse
  * @throws IOException if the JSON string is invalid with respect to PhonestaticResponse
  */
  public static PhonestaticResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PhonestaticResponse.class);
  }

 /**
  * Convert an instance of PhonestaticResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

