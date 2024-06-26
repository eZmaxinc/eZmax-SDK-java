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
 * A Ezsigntemplatepackagesigner Object
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-14T20:13:03.553513468Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class EzsigntemplatepackagesignerResponse {
  public static final String SERIALIZED_NAME_PKI_EZSIGNTEMPLATEPACKAGESIGNER_I_D = "pkiEzsigntemplatepackagesignerID";
  @SerializedName(SERIALIZED_NAME_PKI_EZSIGNTEMPLATEPACKAGESIGNER_I_D)
  private Integer pkiEzsigntemplatepackagesignerID;

  public static final String SERIALIZED_NAME_FKI_EZSIGNTEMPLATEPACKAGE_I_D = "fkiEzsigntemplatepackageID";
  @SerializedName(SERIALIZED_NAME_FKI_EZSIGNTEMPLATEPACKAGE_I_D)
  private Integer fkiEzsigntemplatepackageID;

  public static final String SERIALIZED_NAME_S_EZSIGNTEMPLATEPACKAGESIGNER_DESCRIPTION = "sEzsigntemplatepackagesignerDescription";
  @SerializedName(SERIALIZED_NAME_S_EZSIGNTEMPLATEPACKAGESIGNER_DESCRIPTION)
  private String sEzsigntemplatepackagesignerDescription;

  public EzsigntemplatepackagesignerResponse() {
  }

  public EzsigntemplatepackagesignerResponse pkiEzsigntemplatepackagesignerID(Integer pkiEzsigntemplatepackagesignerID) {
    this.pkiEzsigntemplatepackagesignerID = pkiEzsigntemplatepackagesignerID;
    return this;
  }

   /**
   * The unique ID of the Ezsigntemplatepackagesigner
   * minimum: 0
   * @return pkiEzsigntemplatepackagesignerID
  **/
  @javax.annotation.Nonnull
  public Integer getPkiEzsigntemplatepackagesignerID() {
    return pkiEzsigntemplatepackagesignerID;
  }

  public void setPkiEzsigntemplatepackagesignerID(Integer pkiEzsigntemplatepackagesignerID) {
    this.pkiEzsigntemplatepackagesignerID = pkiEzsigntemplatepackagesignerID;
  }


  public EzsigntemplatepackagesignerResponse fkiEzsigntemplatepackageID(Integer fkiEzsigntemplatepackageID) {
    this.fkiEzsigntemplatepackageID = fkiEzsigntemplatepackageID;
    return this;
  }

   /**
   * The unique ID of the Ezsigntemplatepackage
   * minimum: 0
   * @return fkiEzsigntemplatepackageID
  **/
  @javax.annotation.Nonnull
  public Integer getFkiEzsigntemplatepackageID() {
    return fkiEzsigntemplatepackageID;
  }

  public void setFkiEzsigntemplatepackageID(Integer fkiEzsigntemplatepackageID) {
    this.fkiEzsigntemplatepackageID = fkiEzsigntemplatepackageID;
  }


  public EzsigntemplatepackagesignerResponse sEzsigntemplatepackagesignerDescription(String sEzsigntemplatepackagesignerDescription) {
    this.sEzsigntemplatepackagesignerDescription = sEzsigntemplatepackagesignerDescription;
    return this;
  }

   /**
   * The description of the Ezsigntemplatepackagesigner
   * @return sEzsigntemplatepackagesignerDescription
  **/
  @javax.annotation.Nonnull
  public String getsEzsigntemplatepackagesignerDescription() {
    return sEzsigntemplatepackagesignerDescription;
  }

  public void setsEzsigntemplatepackagesignerDescription(String sEzsigntemplatepackagesignerDescription) {
    this.sEzsigntemplatepackagesignerDescription = sEzsigntemplatepackagesignerDescription;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsigntemplatepackagesignerResponse ezsigntemplatepackagesignerResponse = (EzsigntemplatepackagesignerResponse) o;
    return Objects.equals(this.pkiEzsigntemplatepackagesignerID, ezsigntemplatepackagesignerResponse.pkiEzsigntemplatepackagesignerID) &&
        Objects.equals(this.fkiEzsigntemplatepackageID, ezsigntemplatepackagesignerResponse.fkiEzsigntemplatepackageID) &&
        Objects.equals(this.sEzsigntemplatepackagesignerDescription, ezsigntemplatepackagesignerResponse.sEzsigntemplatepackagesignerDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pkiEzsigntemplatepackagesignerID, fkiEzsigntemplatepackageID, sEzsigntemplatepackagesignerDescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsigntemplatepackagesignerResponse {\n");
    sb.append("    pkiEzsigntemplatepackagesignerID: ").append(toIndentedString(pkiEzsigntemplatepackagesignerID)).append("\n");
    sb.append("    fkiEzsigntemplatepackageID: ").append(toIndentedString(fkiEzsigntemplatepackageID)).append("\n");
    sb.append("    sEzsigntemplatepackagesignerDescription: ").append(toIndentedString(sEzsigntemplatepackagesignerDescription)).append("\n");
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
    openapiFields.add("pkiEzsigntemplatepackagesignerID");
    openapiFields.add("fkiEzsigntemplatepackageID");
    openapiFields.add("sEzsigntemplatepackagesignerDescription");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("pkiEzsigntemplatepackagesignerID");
    openapiRequiredFields.add("fkiEzsigntemplatepackageID");
    openapiRequiredFields.add("sEzsigntemplatepackagesignerDescription");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to EzsigntemplatepackagesignerResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EzsigntemplatepackagesignerResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EzsigntemplatepackagesignerResponse is not found in the empty JSON string", EzsigntemplatepackagesignerResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EzsigntemplatepackagesignerResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EzsigntemplatepackagesignerResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EzsigntemplatepackagesignerResponse.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("sEzsigntemplatepackagesignerDescription").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sEzsigntemplatepackagesignerDescription` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sEzsigntemplatepackagesignerDescription").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EzsigntemplatepackagesignerResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EzsigntemplatepackagesignerResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EzsigntemplatepackagesignerResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EzsigntemplatepackagesignerResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<EzsigntemplatepackagesignerResponse>() {
           @Override
           public void write(JsonWriter out, EzsigntemplatepackagesignerResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EzsigntemplatepackagesignerResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EzsigntemplatepackagesignerResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EzsigntemplatepackagesignerResponse
  * @throws IOException if the JSON string is invalid with respect to EzsigntemplatepackagesignerResponse
  */
  public static EzsigntemplatepackagesignerResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EzsigntemplatepackagesignerResponse.class);
  }

 /**
  * Convert an instance of EzsigntemplatepackagesignerResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

