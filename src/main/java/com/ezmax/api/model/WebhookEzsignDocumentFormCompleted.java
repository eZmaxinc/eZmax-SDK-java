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
import com.ezmax.api.model.AttemptResponseCompound;
import com.ezmax.api.model.CustomWebhookResponse;
import com.ezmax.api.model.EzsigndocumentResponse;
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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import eZmaxAPI.JSON;

/**
 * This is the base Webhook object
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-28T04:04:06.974848816Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class WebhookEzsignDocumentFormCompleted {
  public static final String SERIALIZED_NAME_OBJ_WEBHOOK = "objWebhook";
  @SerializedName(SERIALIZED_NAME_OBJ_WEBHOOK)
  private CustomWebhookResponse objWebhook;

  public static final String SERIALIZED_NAME_A_OBJ_ATTEMPT = "a_objAttempt";
  @SerializedName(SERIALIZED_NAME_A_OBJ_ATTEMPT)
  private List<AttemptResponseCompound> aObjAttempt = new ArrayList<>();

  public static final String SERIALIZED_NAME_OBJ_EZSIGNDOCUMENT = "objEzsigndocument";
  @SerializedName(SERIALIZED_NAME_OBJ_EZSIGNDOCUMENT)
  private EzsigndocumentResponse objEzsigndocument;

  public WebhookEzsignDocumentFormCompleted() {
  }

  public WebhookEzsignDocumentFormCompleted objWebhook(CustomWebhookResponse objWebhook) {
    this.objWebhook = objWebhook;
    return this;
  }

   /**
   * Get objWebhook
   * @return objWebhook
  **/
  @javax.annotation.Nonnull
  public CustomWebhookResponse getObjWebhook() {
    return objWebhook;
  }

  public void setObjWebhook(CustomWebhookResponse objWebhook) {
    this.objWebhook = objWebhook;
  }


  public WebhookEzsignDocumentFormCompleted aObjAttempt(List<AttemptResponseCompound> aObjAttempt) {
    this.aObjAttempt = aObjAttempt;
    return this;
  }

  public WebhookEzsignDocumentFormCompleted addAObjAttemptItem(AttemptResponseCompound aObjAttemptItem) {
    if (this.aObjAttempt == null) {
      this.aObjAttempt = new ArrayList<>();
    }
    this.aObjAttempt.add(aObjAttemptItem);
    return this;
  }

   /**
   * An array containing details of previous attempts that were made to deliver the message. The array is empty if it&#39;s the first attempt.
   * @return aObjAttempt
  **/
  @javax.annotation.Nonnull
  public List<AttemptResponseCompound> getaObjAttempt() {
    return aObjAttempt;
  }

  public void setaObjAttempt(List<AttemptResponseCompound> aObjAttempt) {
    this.aObjAttempt = aObjAttempt;
  }


  public WebhookEzsignDocumentFormCompleted objEzsigndocument(EzsigndocumentResponse objEzsigndocument) {
    this.objEzsigndocument = objEzsigndocument;
    return this;
  }

   /**
   * Get objEzsigndocument
   * @return objEzsigndocument
  **/
  @javax.annotation.Nonnull
  public EzsigndocumentResponse getObjEzsigndocument() {
    return objEzsigndocument;
  }

  public void setObjEzsigndocument(EzsigndocumentResponse objEzsigndocument) {
    this.objEzsigndocument = objEzsigndocument;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookEzsignDocumentFormCompleted webhookEzsignDocumentFormCompleted = (WebhookEzsignDocumentFormCompleted) o;
    return Objects.equals(this.objWebhook, webhookEzsignDocumentFormCompleted.objWebhook) &&
        Objects.equals(this.aObjAttempt, webhookEzsignDocumentFormCompleted.aObjAttempt) &&
        Objects.equals(this.objEzsigndocument, webhookEzsignDocumentFormCompleted.objEzsigndocument);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objWebhook, aObjAttempt, objEzsigndocument);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookEzsignDocumentFormCompleted {\n");
    sb.append("    objWebhook: ").append(toIndentedString(objWebhook)).append("\n");
    sb.append("    aObjAttempt: ").append(toIndentedString(aObjAttempt)).append("\n");
    sb.append("    objEzsigndocument: ").append(toIndentedString(objEzsigndocument)).append("\n");
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
    openapiFields.add("objWebhook");
    openapiFields.add("a_objAttempt");
    openapiFields.add("objEzsigndocument");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("objWebhook");
    openapiRequiredFields.add("a_objAttempt");
    openapiRequiredFields.add("objEzsigndocument");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to WebhookEzsignDocumentFormCompleted
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!WebhookEzsignDocumentFormCompleted.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WebhookEzsignDocumentFormCompleted is not found in the empty JSON string", WebhookEzsignDocumentFormCompleted.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!WebhookEzsignDocumentFormCompleted.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WebhookEzsignDocumentFormCompleted` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : WebhookEzsignDocumentFormCompleted.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `objWebhook`
      CustomWebhookResponse.validateJsonElement(jsonObj.get("objWebhook"));
      // ensure the json data is an array
      if (!jsonObj.get("a_objAttempt").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `a_objAttempt` to be an array in the JSON string but got `%s`", jsonObj.get("a_objAttempt").toString()));
      }

      JsonArray jsonArrayaObjAttempt = jsonObj.getAsJsonArray("a_objAttempt");
      // validate the required field `a_objAttempt` (array)
      for (int i = 0; i < jsonArrayaObjAttempt.size(); i++) {
        AttemptResponseCompound.validateJsonElement(jsonArrayaObjAttempt.get(i));
      };
      // validate the required field `objEzsigndocument`
      EzsigndocumentResponse.validateJsonElement(jsonObj.get("objEzsigndocument"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WebhookEzsignDocumentFormCompleted.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WebhookEzsignDocumentFormCompleted' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WebhookEzsignDocumentFormCompleted> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WebhookEzsignDocumentFormCompleted.class));

       return (TypeAdapter<T>) new TypeAdapter<WebhookEzsignDocumentFormCompleted>() {
           @Override
           public void write(JsonWriter out, WebhookEzsignDocumentFormCompleted value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WebhookEzsignDocumentFormCompleted read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of WebhookEzsignDocumentFormCompleted given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WebhookEzsignDocumentFormCompleted
  * @throws IOException if the JSON string is invalid with respect to WebhookEzsignDocumentFormCompleted
  */
  public static WebhookEzsignDocumentFormCompleted fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WebhookEzsignDocumentFormCompleted.class);
  }

 /**
  * Convert an instance of WebhookEzsignDocumentFormCompleted to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
