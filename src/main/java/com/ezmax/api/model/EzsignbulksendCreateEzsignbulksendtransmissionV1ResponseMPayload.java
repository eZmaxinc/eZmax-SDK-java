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
import com.ezmax.api.model.EzsignbulksendtransmissionResponse;
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
 * Payload for POST /1/object/ezsignbulksend/{pkiEzsignbulksendID}/createEzsignbulksendtransmission
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-14T20:13:03.553513468Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class EzsignbulksendCreateEzsignbulksendtransmissionV1ResponseMPayload {
  public static final String SERIALIZED_NAME_OBJ_EZSIGNBULKSENDTRANSMISSION = "objEzsignbulksendtransmission";
  @SerializedName(SERIALIZED_NAME_OBJ_EZSIGNBULKSENDTRANSMISSION)
  private EzsignbulksendtransmissionResponse objEzsignbulksendtransmission;

  public EzsignbulksendCreateEzsignbulksendtransmissionV1ResponseMPayload() {
  }

  public EzsignbulksendCreateEzsignbulksendtransmissionV1ResponseMPayload objEzsignbulksendtransmission(EzsignbulksendtransmissionResponse objEzsignbulksendtransmission) {
    this.objEzsignbulksendtransmission = objEzsignbulksendtransmission;
    return this;
  }

   /**
   * Get objEzsignbulksendtransmission
   * @return objEzsignbulksendtransmission
  **/
  @javax.annotation.Nonnull
  public EzsignbulksendtransmissionResponse getObjEzsignbulksendtransmission() {
    return objEzsignbulksendtransmission;
  }

  public void setObjEzsignbulksendtransmission(EzsignbulksendtransmissionResponse objEzsignbulksendtransmission) {
    this.objEzsignbulksendtransmission = objEzsignbulksendtransmission;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignbulksendCreateEzsignbulksendtransmissionV1ResponseMPayload ezsignbulksendCreateEzsignbulksendtransmissionV1ResponseMPayload = (EzsignbulksendCreateEzsignbulksendtransmissionV1ResponseMPayload) o;
    return Objects.equals(this.objEzsignbulksendtransmission, ezsignbulksendCreateEzsignbulksendtransmissionV1ResponseMPayload.objEzsignbulksendtransmission);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objEzsignbulksendtransmission);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignbulksendCreateEzsignbulksendtransmissionV1ResponseMPayload {\n");
    sb.append("    objEzsignbulksendtransmission: ").append(toIndentedString(objEzsignbulksendtransmission)).append("\n");
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
    openapiFields.add("objEzsignbulksendtransmission");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("objEzsignbulksendtransmission");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to EzsignbulksendCreateEzsignbulksendtransmissionV1ResponseMPayload
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EzsignbulksendCreateEzsignbulksendtransmissionV1ResponseMPayload.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EzsignbulksendCreateEzsignbulksendtransmissionV1ResponseMPayload is not found in the empty JSON string", EzsignbulksendCreateEzsignbulksendtransmissionV1ResponseMPayload.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EzsignbulksendCreateEzsignbulksendtransmissionV1ResponseMPayload.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EzsignbulksendCreateEzsignbulksendtransmissionV1ResponseMPayload` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EzsignbulksendCreateEzsignbulksendtransmissionV1ResponseMPayload.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `objEzsignbulksendtransmission`
      EzsignbulksendtransmissionResponse.validateJsonElement(jsonObj.get("objEzsignbulksendtransmission"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EzsignbulksendCreateEzsignbulksendtransmissionV1ResponseMPayload.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EzsignbulksendCreateEzsignbulksendtransmissionV1ResponseMPayload' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EzsignbulksendCreateEzsignbulksendtransmissionV1ResponseMPayload> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EzsignbulksendCreateEzsignbulksendtransmissionV1ResponseMPayload.class));

       return (TypeAdapter<T>) new TypeAdapter<EzsignbulksendCreateEzsignbulksendtransmissionV1ResponseMPayload>() {
           @Override
           public void write(JsonWriter out, EzsignbulksendCreateEzsignbulksendtransmissionV1ResponseMPayload value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EzsignbulksendCreateEzsignbulksendtransmissionV1ResponseMPayload read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EzsignbulksendCreateEzsignbulksendtransmissionV1ResponseMPayload given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EzsignbulksendCreateEzsignbulksendtransmissionV1ResponseMPayload
  * @throws IOException if the JSON string is invalid with respect to EzsignbulksendCreateEzsignbulksendtransmissionV1ResponseMPayload
  */
  public static EzsignbulksendCreateEzsignbulksendtransmissionV1ResponseMPayload fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EzsignbulksendCreateEzsignbulksendtransmissionV1ResponseMPayload.class);
  }

 /**
  * Convert an instance of EzsignbulksendCreateEzsignbulksendtransmissionV1ResponseMPayload to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

