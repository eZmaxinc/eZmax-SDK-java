/*
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.16
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ezmax.api.model;

import java.util.Objects;
import java.util.Arrays;
import com.ezmax.api.model.EzsignfoldertypeAutocompleteElementResponse;
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
 * Payload for POST /2/object/ezsignfoldertype/getAutocomplete
 */
@ApiModel(description = "Payload for POST /2/object/ezsignfoldertype/getAutocomplete")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-10T15:21:40.493145Z[Etc/UTC]")
public class EzsignfoldertypeGetAutocompleteV2ResponseMPayload {
  public static final String SERIALIZED_NAME_A_OBJ_EZSIGNFOLDERTYPE = "a_objEzsignfoldertype";
  @SerializedName(SERIALIZED_NAME_A_OBJ_EZSIGNFOLDERTYPE)
  private List<EzsignfoldertypeAutocompleteElementResponse> aObjEzsignfoldertype = new ArrayList<>();

  public EzsignfoldertypeGetAutocompleteV2ResponseMPayload() { 
  }

  public EzsignfoldertypeGetAutocompleteV2ResponseMPayload aObjEzsignfoldertype(List<EzsignfoldertypeAutocompleteElementResponse> aObjEzsignfoldertype) {
    
    this.aObjEzsignfoldertype = aObjEzsignfoldertype;
    return this;
  }

  public EzsignfoldertypeGetAutocompleteV2ResponseMPayload addAObjEzsignfoldertypeItem(EzsignfoldertypeAutocompleteElementResponse aObjEzsignfoldertypeItem) {
    this.aObjEzsignfoldertype.add(aObjEzsignfoldertypeItem);
    return this;
  }

   /**
   * An array of Ezsignfoldertype autocomplete element response.
   * @return aObjEzsignfoldertype
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "An array of Ezsignfoldertype autocomplete element response.")

  public List<EzsignfoldertypeAutocompleteElementResponse> getaObjEzsignfoldertype() {
    return aObjEzsignfoldertype;
  }


  public void setaObjEzsignfoldertype(List<EzsignfoldertypeAutocompleteElementResponse> aObjEzsignfoldertype) {
    this.aObjEzsignfoldertype = aObjEzsignfoldertype;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignfoldertypeGetAutocompleteV2ResponseMPayload ezsignfoldertypeGetAutocompleteV2ResponseMPayload = (EzsignfoldertypeGetAutocompleteV2ResponseMPayload) o;
    return Objects.equals(this.aObjEzsignfoldertype, ezsignfoldertypeGetAutocompleteV2ResponseMPayload.aObjEzsignfoldertype);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aObjEzsignfoldertype);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignfoldertypeGetAutocompleteV2ResponseMPayload {\n");
    sb.append("    aObjEzsignfoldertype: ").append(toIndentedString(aObjEzsignfoldertype)).append("\n");
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
    openapiFields.add("a_objEzsignfoldertype");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("a_objEzsignfoldertype");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EzsignfoldertypeGetAutocompleteV2ResponseMPayload
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (EzsignfoldertypeGetAutocompleteV2ResponseMPayload.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in EzsignfoldertypeGetAutocompleteV2ResponseMPayload is not found in the empty JSON string", EzsignfoldertypeGetAutocompleteV2ResponseMPayload.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!EzsignfoldertypeGetAutocompleteV2ResponseMPayload.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EzsignfoldertypeGetAutocompleteV2ResponseMPayload` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EzsignfoldertypeGetAutocompleteV2ResponseMPayload.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      JsonArray jsonArrayaObjEzsignfoldertype = jsonObj.getAsJsonArray("a_objEzsignfoldertype");
      if (jsonArrayaObjEzsignfoldertype != null) {
        // ensure the json data is an array
        if (!jsonObj.get("a_objEzsignfoldertype").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `a_objEzsignfoldertype` to be an array in the JSON string but got `%s`", jsonObj.get("a_objEzsignfoldertype").toString()));
        }

        // validate the optional field `a_objEzsignfoldertype` (array)
        for (int i = 0; i < jsonArrayaObjEzsignfoldertype.size(); i++) {
          EzsignfoldertypeAutocompleteElementResponse.validateJsonObject(jsonArrayaObjEzsignfoldertype.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EzsignfoldertypeGetAutocompleteV2ResponseMPayload.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EzsignfoldertypeGetAutocompleteV2ResponseMPayload' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EzsignfoldertypeGetAutocompleteV2ResponseMPayload> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EzsignfoldertypeGetAutocompleteV2ResponseMPayload.class));

       return (TypeAdapter<T>) new TypeAdapter<EzsignfoldertypeGetAutocompleteV2ResponseMPayload>() {
           @Override
           public void write(JsonWriter out, EzsignfoldertypeGetAutocompleteV2ResponseMPayload value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EzsignfoldertypeGetAutocompleteV2ResponseMPayload read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EzsignfoldertypeGetAutocompleteV2ResponseMPayload given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EzsignfoldertypeGetAutocompleteV2ResponseMPayload
  * @throws IOException if the JSON string is invalid with respect to EzsignfoldertypeGetAutocompleteV2ResponseMPayload
  */
  public static EzsignfoldertypeGetAutocompleteV2ResponseMPayload fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EzsignfoldertypeGetAutocompleteV2ResponseMPayload.class);
  }

 /**
  * Convert an instance of EzsignfoldertypeGetAutocompleteV2ResponseMPayload to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
