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
 * A Discussionmessage Object
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-07T19:20:13.445471985Z[Etc/UTC]", comments = "Generator version: 7.12.0")
public class DiscussionmessageRequestPatch {
  public static final String SERIALIZED_NAME_FKI_DISCUSSIONMEMBERSHIP_I_D_ACTIONREQUIRED = "fkiDiscussionmembershipIDActionrequired";
  @SerializedName(SERIALIZED_NAME_FKI_DISCUSSIONMEMBERSHIP_I_D_ACTIONREQUIRED)
  @javax.annotation.Nullable
  private Integer fkiDiscussionmembershipIDActionrequired;

  public static final String SERIALIZED_NAME_T_DISCUSSIONMESSAGE_CONTENT = "tDiscussionmessageContent";
  @SerializedName(SERIALIZED_NAME_T_DISCUSSIONMESSAGE_CONTENT)
  @javax.annotation.Nullable
  private String tDiscussionmessageContent;

  public DiscussionmessageRequestPatch() {
  }

  public DiscussionmessageRequestPatch fkiDiscussionmembershipIDActionrequired(@javax.annotation.Nullable Integer fkiDiscussionmembershipIDActionrequired) {
    this.fkiDiscussionmembershipIDActionrequired = fkiDiscussionmembershipIDActionrequired;
    return this;
  }

  /**
   * The unique ID of the Discussionmembership
   * minimum: 0
   * maximum: 16777215
   * @return fkiDiscussionmembershipIDActionrequired
   */
  @javax.annotation.Nullable
  public Integer getFkiDiscussionmembershipIDActionrequired() {
    return fkiDiscussionmembershipIDActionrequired;
  }

  public void setFkiDiscussionmembershipIDActionrequired(@javax.annotation.Nullable Integer fkiDiscussionmembershipIDActionrequired) {
    this.fkiDiscussionmembershipIDActionrequired = fkiDiscussionmembershipIDActionrequired;
  }


  public DiscussionmessageRequestPatch tDiscussionmessageContent(@javax.annotation.Nullable String tDiscussionmessageContent) {
    this.tDiscussionmessageContent = tDiscussionmessageContent;
    return this;
  }

  /**
   * The content of the Discussionmessage
   * @return tDiscussionmessageContent
   */
  @javax.annotation.Nullable
  public String gettDiscussionmessageContent() {
    return tDiscussionmessageContent;
  }

  public void settDiscussionmessageContent(@javax.annotation.Nullable String tDiscussionmessageContent) {
    this.tDiscussionmessageContent = tDiscussionmessageContent;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DiscussionmessageRequestPatch discussionmessageRequestPatch = (DiscussionmessageRequestPatch) o;
    return Objects.equals(this.fkiDiscussionmembershipIDActionrequired, discussionmessageRequestPatch.fkiDiscussionmembershipIDActionrequired) &&
        Objects.equals(this.tDiscussionmessageContent, discussionmessageRequestPatch.tDiscussionmessageContent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fkiDiscussionmembershipIDActionrequired, tDiscussionmessageContent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DiscussionmessageRequestPatch {\n");
    sb.append("    fkiDiscussionmembershipIDActionrequired: ").append(toIndentedString(fkiDiscussionmembershipIDActionrequired)).append("\n");
    sb.append("    tDiscussionmessageContent: ").append(toIndentedString(tDiscussionmessageContent)).append("\n");
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
    openapiFields.add("fkiDiscussionmembershipIDActionrequired");
    openapiFields.add("tDiscussionmessageContent");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DiscussionmessageRequestPatch
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DiscussionmessageRequestPatch.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DiscussionmessageRequestPatch is not found in the empty JSON string", DiscussionmessageRequestPatch.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DiscussionmessageRequestPatch.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DiscussionmessageRequestPatch` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("tDiscussionmessageContent") != null && !jsonObj.get("tDiscussionmessageContent").isJsonNull()) && !jsonObj.get("tDiscussionmessageContent").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tDiscussionmessageContent` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tDiscussionmessageContent").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DiscussionmessageRequestPatch.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DiscussionmessageRequestPatch' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DiscussionmessageRequestPatch> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DiscussionmessageRequestPatch.class));

       return (TypeAdapter<T>) new TypeAdapter<DiscussionmessageRequestPatch>() {
           @Override
           public void write(JsonWriter out, DiscussionmessageRequestPatch value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DiscussionmessageRequestPatch read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DiscussionmessageRequestPatch given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DiscussionmessageRequestPatch
   * @throws IOException if the JSON string is invalid with respect to DiscussionmessageRequestPatch
   */
  public static DiscussionmessageRequestPatch fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DiscussionmessageRequestPatch.class);
  }

  /**
   * Convert an instance of DiscussionmessageRequestPatch to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

