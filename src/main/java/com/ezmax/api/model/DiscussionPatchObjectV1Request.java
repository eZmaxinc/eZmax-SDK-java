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
import com.ezmax.api.model.DiscussionRequestPatch;
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
 * Request for PATCH /1/object/discussion/{pkiDiscussionID}
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-28T04:04:06.974848816Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class DiscussionPatchObjectV1Request {
  public static final String SERIALIZED_NAME_OBJ_DISCUSSION = "objDiscussion";
  @SerializedName(SERIALIZED_NAME_OBJ_DISCUSSION)
  private DiscussionRequestPatch objDiscussion;

  public DiscussionPatchObjectV1Request() {
  }

  public DiscussionPatchObjectV1Request objDiscussion(DiscussionRequestPatch objDiscussion) {
    this.objDiscussion = objDiscussion;
    return this;
  }

   /**
   * Get objDiscussion
   * @return objDiscussion
  **/
  @javax.annotation.Nonnull
  public DiscussionRequestPatch getObjDiscussion() {
    return objDiscussion;
  }

  public void setObjDiscussion(DiscussionRequestPatch objDiscussion) {
    this.objDiscussion = objDiscussion;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DiscussionPatchObjectV1Request discussionPatchObjectV1Request = (DiscussionPatchObjectV1Request) o;
    return Objects.equals(this.objDiscussion, discussionPatchObjectV1Request.objDiscussion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objDiscussion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DiscussionPatchObjectV1Request {\n");
    sb.append("    objDiscussion: ").append(toIndentedString(objDiscussion)).append("\n");
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
    openapiFields.add("objDiscussion");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("objDiscussion");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DiscussionPatchObjectV1Request
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DiscussionPatchObjectV1Request.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DiscussionPatchObjectV1Request is not found in the empty JSON string", DiscussionPatchObjectV1Request.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DiscussionPatchObjectV1Request.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DiscussionPatchObjectV1Request` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DiscussionPatchObjectV1Request.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `objDiscussion`
      DiscussionRequestPatch.validateJsonElement(jsonObj.get("objDiscussion"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DiscussionPatchObjectV1Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DiscussionPatchObjectV1Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DiscussionPatchObjectV1Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DiscussionPatchObjectV1Request.class));

       return (TypeAdapter<T>) new TypeAdapter<DiscussionPatchObjectV1Request>() {
           @Override
           public void write(JsonWriter out, DiscussionPatchObjectV1Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DiscussionPatchObjectV1Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DiscussionPatchObjectV1Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DiscussionPatchObjectV1Request
  * @throws IOException if the JSON string is invalid with respect to DiscussionPatchObjectV1Request
  */
  public static DiscussionPatchObjectV1Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DiscussionPatchObjectV1Request.class);
  }

 /**
  * Convert an instance of DiscussionPatchObjectV1Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
