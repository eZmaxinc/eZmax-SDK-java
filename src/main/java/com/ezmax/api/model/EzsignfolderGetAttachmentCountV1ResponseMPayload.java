/*
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.2.0
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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import eZmaxAPI.JSON;

/**
 * Response for GET /1/object/ezsignfolder/{pkiEzsignfolderID}/getAttachmentCount
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-28T04:04:06.974848816Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class EzsignfolderGetAttachmentCountV1ResponseMPayload {
  public static final String SERIALIZED_NAME_I_ATTACHMENT_COUNT = "iAttachmentCount";
  @SerializedName(SERIALIZED_NAME_I_ATTACHMENT_COUNT)
  private Integer iAttachmentCount;

  public EzsignfolderGetAttachmentCountV1ResponseMPayload() {
  }

  public EzsignfolderGetAttachmentCountV1ResponseMPayload iAttachmentCount(Integer iAttachmentCount) {
    this.iAttachmentCount = iAttachmentCount;
    return this;
  }

   /**
   * The count of Attachment.
   * @return iAttachmentCount
  **/
  @javax.annotation.Nonnull
  public Integer getiAttachmentCount() {
    return iAttachmentCount;
  }

  public void setiAttachmentCount(Integer iAttachmentCount) {
    this.iAttachmentCount = iAttachmentCount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignfolderGetAttachmentCountV1ResponseMPayload ezsignfolderGetAttachmentCountV1ResponseMPayload = (EzsignfolderGetAttachmentCountV1ResponseMPayload) o;
    return Objects.equals(this.iAttachmentCount, ezsignfolderGetAttachmentCountV1ResponseMPayload.iAttachmentCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(iAttachmentCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignfolderGetAttachmentCountV1ResponseMPayload {\n");
    sb.append("    iAttachmentCount: ").append(toIndentedString(iAttachmentCount)).append("\n");
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
    openapiFields.add("iAttachmentCount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("iAttachmentCount");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to EzsignfolderGetAttachmentCountV1ResponseMPayload
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EzsignfolderGetAttachmentCountV1ResponseMPayload.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EzsignfolderGetAttachmentCountV1ResponseMPayload is not found in the empty JSON string", EzsignfolderGetAttachmentCountV1ResponseMPayload.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EzsignfolderGetAttachmentCountV1ResponseMPayload.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EzsignfolderGetAttachmentCountV1ResponseMPayload` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EzsignfolderGetAttachmentCountV1ResponseMPayload.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EzsignfolderGetAttachmentCountV1ResponseMPayload.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EzsignfolderGetAttachmentCountV1ResponseMPayload' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EzsignfolderGetAttachmentCountV1ResponseMPayload> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EzsignfolderGetAttachmentCountV1ResponseMPayload.class));

       return (TypeAdapter<T>) new TypeAdapter<EzsignfolderGetAttachmentCountV1ResponseMPayload>() {
           @Override
           public void write(JsonWriter out, EzsignfolderGetAttachmentCountV1ResponseMPayload value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EzsignfolderGetAttachmentCountV1ResponseMPayload read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EzsignfolderGetAttachmentCountV1ResponseMPayload given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EzsignfolderGetAttachmentCountV1ResponseMPayload
  * @throws IOException if the JSON string is invalid with respect to EzsignfolderGetAttachmentCountV1ResponseMPayload
  */
  public static EzsignfolderGetAttachmentCountV1ResponseMPayload fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EzsignfolderGetAttachmentCountV1ResponseMPayload.class);
  }

 /**
  * Convert an instance of EzsignfolderGetAttachmentCountV1ResponseMPayload to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
