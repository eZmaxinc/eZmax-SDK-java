/*
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.8
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import eZmaxAPI.JSON;

/**
 * Payload for PUT /1/object/ezsigntemplatedocument/{pkiEzsigntemplatedocumentID}/editEzsigntemplatesignatures
 */
@ApiModel(description = "Payload for PUT /1/object/ezsigntemplatedocument/{pkiEzsigntemplatedocumentID}/editEzsigntemplatesignatures")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-20T16:59:39.826205Z[Etc/UTC]")
public class EzsigntemplatedocumentEditEzsigntemplatesignaturesV1ResponseMPayload {
  public static final String SERIALIZED_NAME_A_PKI_EZSIGNTEMPLATESIGNATURE_I_D = "a_pkiEzsigntemplatesignatureID";
  @SerializedName(SERIALIZED_NAME_A_PKI_EZSIGNTEMPLATESIGNATURE_I_D)
  private List<Integer> aPkiEzsigntemplatesignatureID = new ArrayList<>();

  public EzsigntemplatedocumentEditEzsigntemplatesignaturesV1ResponseMPayload() { 
  }

  public EzsigntemplatedocumentEditEzsigntemplatesignaturesV1ResponseMPayload aPkiEzsigntemplatesignatureID(List<Integer> aPkiEzsigntemplatesignatureID) {
    
    this.aPkiEzsigntemplatesignatureID = aPkiEzsigntemplatesignatureID;
    return this;
  }

  public EzsigntemplatedocumentEditEzsigntemplatesignaturesV1ResponseMPayload addAPkiEzsigntemplatesignatureIDItem(Integer aPkiEzsigntemplatesignatureIDItem) {
    this.aPkiEzsigntemplatesignatureID.add(aPkiEzsigntemplatesignatureIDItem);
    return this;
  }

   /**
   * Get aPkiEzsigntemplatesignatureID
   * @return aPkiEzsigntemplatesignatureID
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<Integer> getaPkiEzsigntemplatesignatureID() {
    return aPkiEzsigntemplatesignatureID;
  }


  public void setaPkiEzsigntemplatesignatureID(List<Integer> aPkiEzsigntemplatesignatureID) {
    this.aPkiEzsigntemplatesignatureID = aPkiEzsigntemplatesignatureID;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsigntemplatedocumentEditEzsigntemplatesignaturesV1ResponseMPayload ezsigntemplatedocumentEditEzsigntemplatesignaturesV1ResponseMPayload = (EzsigntemplatedocumentEditEzsigntemplatesignaturesV1ResponseMPayload) o;
    return Objects.equals(this.aPkiEzsigntemplatesignatureID, ezsigntemplatedocumentEditEzsigntemplatesignaturesV1ResponseMPayload.aPkiEzsigntemplatesignatureID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aPkiEzsigntemplatesignatureID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsigntemplatedocumentEditEzsigntemplatesignaturesV1ResponseMPayload {\n");
    sb.append("    aPkiEzsigntemplatesignatureID: ").append(toIndentedString(aPkiEzsigntemplatesignatureID)).append("\n");
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
    openapiFields.add("a_pkiEzsigntemplatesignatureID");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("a_pkiEzsigntemplatesignatureID");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EzsigntemplatedocumentEditEzsigntemplatesignaturesV1ResponseMPayload
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (EzsigntemplatedocumentEditEzsigntemplatesignaturesV1ResponseMPayload.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in EzsigntemplatedocumentEditEzsigntemplatesignaturesV1ResponseMPayload is not found in the empty JSON string", EzsigntemplatedocumentEditEzsigntemplatesignaturesV1ResponseMPayload.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!EzsigntemplatedocumentEditEzsigntemplatesignaturesV1ResponseMPayload.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EzsigntemplatedocumentEditEzsigntemplatesignaturesV1ResponseMPayload` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EzsigntemplatedocumentEditEzsigntemplatesignaturesV1ResponseMPayload.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (jsonObj.get("a_pkiEzsigntemplatesignatureID") != null && !jsonObj.get("a_pkiEzsigntemplatesignatureID").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `a_pkiEzsigntemplatesignatureID` to be an array in the JSON string but got `%s`", jsonObj.get("a_pkiEzsigntemplatesignatureID").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EzsigntemplatedocumentEditEzsigntemplatesignaturesV1ResponseMPayload.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EzsigntemplatedocumentEditEzsigntemplatesignaturesV1ResponseMPayload' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EzsigntemplatedocumentEditEzsigntemplatesignaturesV1ResponseMPayload> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EzsigntemplatedocumentEditEzsigntemplatesignaturesV1ResponseMPayload.class));

       return (TypeAdapter<T>) new TypeAdapter<EzsigntemplatedocumentEditEzsigntemplatesignaturesV1ResponseMPayload>() {
           @Override
           public void write(JsonWriter out, EzsigntemplatedocumentEditEzsigntemplatesignaturesV1ResponseMPayload value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EzsigntemplatedocumentEditEzsigntemplatesignaturesV1ResponseMPayload read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EzsigntemplatedocumentEditEzsigntemplatesignaturesV1ResponseMPayload given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EzsigntemplatedocumentEditEzsigntemplatesignaturesV1ResponseMPayload
  * @throws IOException if the JSON string is invalid with respect to EzsigntemplatedocumentEditEzsigntemplatesignaturesV1ResponseMPayload
  */
  public static EzsigntemplatedocumentEditEzsigntemplatesignaturesV1ResponseMPayload fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EzsigntemplatedocumentEditEzsigntemplatesignaturesV1ResponseMPayload.class);
  }

 /**
  * Convert an instance of EzsigntemplatedocumentEditEzsigntemplatesignaturesV1ResponseMPayload to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
