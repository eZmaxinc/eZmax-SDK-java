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
 * A Ezsignsigningreason List Element
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-28T04:04:06.974848816Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class EzsignsigningreasonListElement {
  public static final String SERIALIZED_NAME_PKI_EZSIGNSIGNINGREASON_I_D = "pkiEzsignsigningreasonID";
  @SerializedName(SERIALIZED_NAME_PKI_EZSIGNSIGNINGREASON_I_D)
  private Integer pkiEzsignsigningreasonID;

  public static final String SERIALIZED_NAME_S_EZSIGNSIGNINGREASON_DESCRIPTION_X = "sEzsignsigningreasonDescriptionX";
  @SerializedName(SERIALIZED_NAME_S_EZSIGNSIGNINGREASON_DESCRIPTION_X)
  private String sEzsignsigningreasonDescriptionX;

  public static final String SERIALIZED_NAME_B_EZSIGNSIGNINGREASON_ISACTIVE = "bEzsignsigningreasonIsactive";
  @SerializedName(SERIALIZED_NAME_B_EZSIGNSIGNINGREASON_ISACTIVE)
  private Boolean bEzsignsigningreasonIsactive;

  public EzsignsigningreasonListElement() {
  }

  public EzsignsigningreasonListElement pkiEzsignsigningreasonID(Integer pkiEzsignsigningreasonID) {
    this.pkiEzsignsigningreasonID = pkiEzsignsigningreasonID;
    return this;
  }

   /**
   * The unique ID of the Ezsignsigningreason
   * minimum: 0
   * maximum: 255
   * @return pkiEzsignsigningreasonID
  **/
  @javax.annotation.Nonnull
  public Integer getPkiEzsignsigningreasonID() {
    return pkiEzsignsigningreasonID;
  }

  public void setPkiEzsignsigningreasonID(Integer pkiEzsignsigningreasonID) {
    this.pkiEzsignsigningreasonID = pkiEzsignsigningreasonID;
  }


  public EzsignsigningreasonListElement sEzsignsigningreasonDescriptionX(String sEzsignsigningreasonDescriptionX) {
    this.sEzsignsigningreasonDescriptionX = sEzsignsigningreasonDescriptionX;
    return this;
  }

   /**
   * The description of the Ezsignsigningreason in the language of the requester
   * @return sEzsignsigningreasonDescriptionX
  **/
  @javax.annotation.Nonnull
  public String getsEzsignsigningreasonDescriptionX() {
    return sEzsignsigningreasonDescriptionX;
  }

  public void setsEzsignsigningreasonDescriptionX(String sEzsignsigningreasonDescriptionX) {
    this.sEzsignsigningreasonDescriptionX = sEzsignsigningreasonDescriptionX;
  }


  public EzsignsigningreasonListElement bEzsignsigningreasonIsactive(Boolean bEzsignsigningreasonIsactive) {
    this.bEzsignsigningreasonIsactive = bEzsignsigningreasonIsactive;
    return this;
  }

   /**
   * Whether the ezsignsigningreason is active or not
   * @return bEzsignsigningreasonIsactive
  **/
  @javax.annotation.Nonnull
  public Boolean getbEzsignsigningreasonIsactive() {
    return bEzsignsigningreasonIsactive;
  }

  public void setbEzsignsigningreasonIsactive(Boolean bEzsignsigningreasonIsactive) {
    this.bEzsignsigningreasonIsactive = bEzsignsigningreasonIsactive;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignsigningreasonListElement ezsignsigningreasonListElement = (EzsignsigningreasonListElement) o;
    return Objects.equals(this.pkiEzsignsigningreasonID, ezsignsigningreasonListElement.pkiEzsignsigningreasonID) &&
        Objects.equals(this.sEzsignsigningreasonDescriptionX, ezsignsigningreasonListElement.sEzsignsigningreasonDescriptionX) &&
        Objects.equals(this.bEzsignsigningreasonIsactive, ezsignsigningreasonListElement.bEzsignsigningreasonIsactive);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pkiEzsignsigningreasonID, sEzsignsigningreasonDescriptionX, bEzsignsigningreasonIsactive);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignsigningreasonListElement {\n");
    sb.append("    pkiEzsignsigningreasonID: ").append(toIndentedString(pkiEzsignsigningreasonID)).append("\n");
    sb.append("    sEzsignsigningreasonDescriptionX: ").append(toIndentedString(sEzsignsigningreasonDescriptionX)).append("\n");
    sb.append("    bEzsignsigningreasonIsactive: ").append(toIndentedString(bEzsignsigningreasonIsactive)).append("\n");
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
    openapiFields.add("pkiEzsignsigningreasonID");
    openapiFields.add("sEzsignsigningreasonDescriptionX");
    openapiFields.add("bEzsignsigningreasonIsactive");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("pkiEzsignsigningreasonID");
    openapiRequiredFields.add("sEzsignsigningreasonDescriptionX");
    openapiRequiredFields.add("bEzsignsigningreasonIsactive");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to EzsignsigningreasonListElement
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EzsignsigningreasonListElement.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EzsignsigningreasonListElement is not found in the empty JSON string", EzsignsigningreasonListElement.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EzsignsigningreasonListElement.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EzsignsigningreasonListElement` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EzsignsigningreasonListElement.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("sEzsignsigningreasonDescriptionX").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sEzsignsigningreasonDescriptionX` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sEzsignsigningreasonDescriptionX").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EzsignsigningreasonListElement.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EzsignsigningreasonListElement' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EzsignsigningreasonListElement> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EzsignsigningreasonListElement.class));

       return (TypeAdapter<T>) new TypeAdapter<EzsignsigningreasonListElement>() {
           @Override
           public void write(JsonWriter out, EzsignsigningreasonListElement value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EzsignsigningreasonListElement read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EzsignsigningreasonListElement given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EzsignsigningreasonListElement
  * @throws IOException if the JSON string is invalid with respect to EzsignsigningreasonListElement
  */
  public static EzsignsigningreasonListElement fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EzsignsigningreasonListElement.class);
  }

 /**
  * Convert an instance of EzsignsigningreasonListElement to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
