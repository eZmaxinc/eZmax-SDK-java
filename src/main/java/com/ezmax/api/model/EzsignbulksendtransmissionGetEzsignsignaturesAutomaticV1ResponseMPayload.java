/*
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.17
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ezmax.api.model;

import java.util.Objects;
import java.util.Arrays;
import com.ezmax.api.model.CustomEzsignfolderEzsignsignaturesAutomaticResponse;
import com.ezmax.api.model.FieldEEzsignsignatureType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

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
 * Payload for GET /1/object/ezsignbulksendtransmission/{pkiEzsignbulksendtransmissionID}/getEzsignsignaturesAutomatic
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-22T14:56:27.093149753Z[Etc/UTC]")
public class EzsignbulksendtransmissionGetEzsignsignaturesAutomaticV1ResponseMPayload {
  public static final String SERIALIZED_NAME_A_E_EZSIGNSIGNATURE_TYPE = "a_eEzsignsignatureType";
  @SerializedName(SERIALIZED_NAME_A_E_EZSIGNSIGNATURE_TYPE)
  private Set<FieldEEzsignsignatureType> aEEzsignsignatureType = new LinkedHashSet<>();

  public static final String SERIALIZED_NAME_A_OBJ_EZSIGNFOLDER = "a_objEzsignfolder";
  @SerializedName(SERIALIZED_NAME_A_OBJ_EZSIGNFOLDER)
  private List<CustomEzsignfolderEzsignsignaturesAutomaticResponse> aObjEzsignfolder = new ArrayList<>();

  public EzsignbulksendtransmissionGetEzsignsignaturesAutomaticV1ResponseMPayload() {
  }

  public EzsignbulksendtransmissionGetEzsignsignaturesAutomaticV1ResponseMPayload aEEzsignsignatureType(Set<FieldEEzsignsignatureType> aEEzsignsignatureType) {
    
    this.aEEzsignsignatureType = aEEzsignsignatureType;
    return this;
  }

  public EzsignbulksendtransmissionGetEzsignsignaturesAutomaticV1ResponseMPayload addAEEzsignsignatureTypeItem(FieldEEzsignsignatureType aEEzsignsignatureTypeItem) {
    if (this.aEEzsignsignatureType == null) {
      this.aEEzsignsignatureType = new LinkedHashSet<>();
    }
    this.aEEzsignsignatureType.add(aEEzsignsignatureTypeItem);
    return this;
  }

   /**
   * All eEzsignsignatureType contained in the response
   * @return aEEzsignsignatureType
  **/
  @javax.annotation.Nonnull
  public Set<FieldEEzsignsignatureType> getaEEzsignsignatureType() {
    return aEEzsignsignatureType;
  }


  public void setaEEzsignsignatureType(Set<FieldEEzsignsignatureType> aEEzsignsignatureType) {
    this.aEEzsignsignatureType = aEEzsignsignatureType;
  }


  public EzsignbulksendtransmissionGetEzsignsignaturesAutomaticV1ResponseMPayload aObjEzsignfolder(List<CustomEzsignfolderEzsignsignaturesAutomaticResponse> aObjEzsignfolder) {
    
    this.aObjEzsignfolder = aObjEzsignfolder;
    return this;
  }

  public EzsignbulksendtransmissionGetEzsignsignaturesAutomaticV1ResponseMPayload addAObjEzsignfolderItem(CustomEzsignfolderEzsignsignaturesAutomaticResponse aObjEzsignfolderItem) {
    if (this.aObjEzsignfolder == null) {
      this.aObjEzsignfolder = new ArrayList<>();
    }
    this.aObjEzsignfolder.add(aObjEzsignfolderItem);
    return this;
  }

   /**
   * Get aObjEzsignfolder
   * @return aObjEzsignfolder
  **/
  @javax.annotation.Nonnull
  public List<CustomEzsignfolderEzsignsignaturesAutomaticResponse> getaObjEzsignfolder() {
    return aObjEzsignfolder;
  }


  public void setaObjEzsignfolder(List<CustomEzsignfolderEzsignsignaturesAutomaticResponse> aObjEzsignfolder) {
    this.aObjEzsignfolder = aObjEzsignfolder;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignbulksendtransmissionGetEzsignsignaturesAutomaticV1ResponseMPayload ezsignbulksendtransmissionGetEzsignsignaturesAutomaticV1ResponseMPayload = (EzsignbulksendtransmissionGetEzsignsignaturesAutomaticV1ResponseMPayload) o;
    return Objects.equals(this.aEEzsignsignatureType, ezsignbulksendtransmissionGetEzsignsignaturesAutomaticV1ResponseMPayload.aEEzsignsignatureType) &&
        Objects.equals(this.aObjEzsignfolder, ezsignbulksendtransmissionGetEzsignsignaturesAutomaticV1ResponseMPayload.aObjEzsignfolder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aEEzsignsignatureType, aObjEzsignfolder);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignbulksendtransmissionGetEzsignsignaturesAutomaticV1ResponseMPayload {\n");
    sb.append("    aEEzsignsignatureType: ").append(toIndentedString(aEEzsignsignatureType)).append("\n");
    sb.append("    aObjEzsignfolder: ").append(toIndentedString(aObjEzsignfolder)).append("\n");
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
    openapiFields.add("a_eEzsignsignatureType");
    openapiFields.add("a_objEzsignfolder");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("a_eEzsignsignatureType");
    openapiRequiredFields.add("a_objEzsignfolder");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EzsignbulksendtransmissionGetEzsignsignaturesAutomaticV1ResponseMPayload
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!EzsignbulksendtransmissionGetEzsignsignaturesAutomaticV1ResponseMPayload.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EzsignbulksendtransmissionGetEzsignsignaturesAutomaticV1ResponseMPayload is not found in the empty JSON string", EzsignbulksendtransmissionGetEzsignsignaturesAutomaticV1ResponseMPayload.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!EzsignbulksendtransmissionGetEzsignsignaturesAutomaticV1ResponseMPayload.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EzsignbulksendtransmissionGetEzsignsignaturesAutomaticV1ResponseMPayload` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EzsignbulksendtransmissionGetEzsignsignaturesAutomaticV1ResponseMPayload.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the required json array is present
      if (jsonObj.get("a_eEzsignsignatureType") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("a_eEzsignsignatureType").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `a_eEzsignsignatureType` to be an array in the JSON string but got `%s`", jsonObj.get("a_eEzsignsignatureType").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("a_objEzsignfolder").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `a_objEzsignfolder` to be an array in the JSON string but got `%s`", jsonObj.get("a_objEzsignfolder").toString()));
      }

      JsonArray jsonArrayaObjEzsignfolder = jsonObj.getAsJsonArray("a_objEzsignfolder");
      // validate the required field `a_objEzsignfolder` (array)
      for (int i = 0; i < jsonArrayaObjEzsignfolder.size(); i++) {
        CustomEzsignfolderEzsignsignaturesAutomaticResponse.validateJsonObject(jsonArrayaObjEzsignfolder.get(i).getAsJsonObject());
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EzsignbulksendtransmissionGetEzsignsignaturesAutomaticV1ResponseMPayload.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EzsignbulksendtransmissionGetEzsignsignaturesAutomaticV1ResponseMPayload' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EzsignbulksendtransmissionGetEzsignsignaturesAutomaticV1ResponseMPayload> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EzsignbulksendtransmissionGetEzsignsignaturesAutomaticV1ResponseMPayload.class));

       return (TypeAdapter<T>) new TypeAdapter<EzsignbulksendtransmissionGetEzsignsignaturesAutomaticV1ResponseMPayload>() {
           @Override
           public void write(JsonWriter out, EzsignbulksendtransmissionGetEzsignsignaturesAutomaticV1ResponseMPayload value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EzsignbulksendtransmissionGetEzsignsignaturesAutomaticV1ResponseMPayload read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EzsignbulksendtransmissionGetEzsignsignaturesAutomaticV1ResponseMPayload given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EzsignbulksendtransmissionGetEzsignsignaturesAutomaticV1ResponseMPayload
  * @throws IOException if the JSON string is invalid with respect to EzsignbulksendtransmissionGetEzsignsignaturesAutomaticV1ResponseMPayload
  */
  public static EzsignbulksendtransmissionGetEzsignsignaturesAutomaticV1ResponseMPayload fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EzsignbulksendtransmissionGetEzsignsignaturesAutomaticV1ResponseMPayload.class);
  }

 /**
  * Convert an instance of EzsignbulksendtransmissionGetEzsignsignaturesAutomaticV1ResponseMPayload to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
