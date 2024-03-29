/*
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.18
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ezmax.api.model;

import java.util.Objects;
import java.util.Arrays;
import com.ezmax.api.model.CustomEzsignformfieldRequest;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
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
 * CustomEzsignformfieldgroupRequestAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-22T15:33:11.356591451Z[Etc/UTC]")
public class CustomEzsignformfieldgroupRequestAllOf {
  public static final String SERIALIZED_NAME_PKI_EZSIGNFORMFIELDGROUP_I_D = "pkiEzsignformfieldgroupID";
  @SerializedName(SERIALIZED_NAME_PKI_EZSIGNFORMFIELDGROUP_I_D)
  private Integer pkiEzsignformfieldgroupID;

  public static final String SERIALIZED_NAME_S_EZSIGNFORMFIELDGROUP_LABEL = "sEzsignformfieldgroupLabel";
  @SerializedName(SERIALIZED_NAME_S_EZSIGNFORMFIELDGROUP_LABEL)
  private String sEzsignformfieldgroupLabel;

  public static final String SERIALIZED_NAME_A_OBJ_EZSIGNFORMFIELD = "a_objEzsignformfield";
  @SerializedName(SERIALIZED_NAME_A_OBJ_EZSIGNFORMFIELD)
  private List<CustomEzsignformfieldRequest> aObjEzsignformfield = new ArrayList<>();

  public CustomEzsignformfieldgroupRequestAllOf() {
  }

  public CustomEzsignformfieldgroupRequestAllOf pkiEzsignformfieldgroupID(Integer pkiEzsignformfieldgroupID) {
    
    this.pkiEzsignformfieldgroupID = pkiEzsignformfieldgroupID;
    return this;
  }

   /**
   * The unique ID of the Ezsignformfieldgroup
   * minimum: 0
   * @return pkiEzsignformfieldgroupID
  **/
  @javax.annotation.Nullable
  public Integer getPkiEzsignformfieldgroupID() {
    return pkiEzsignformfieldgroupID;
  }


  public void setPkiEzsignformfieldgroupID(Integer pkiEzsignformfieldgroupID) {
    this.pkiEzsignformfieldgroupID = pkiEzsignformfieldgroupID;
  }


  public CustomEzsignformfieldgroupRequestAllOf sEzsignformfieldgroupLabel(String sEzsignformfieldgroupLabel) {
    
    this.sEzsignformfieldgroupLabel = sEzsignformfieldgroupLabel;
    return this;
  }

   /**
   * The Label for the Ezsignformfieldgroup
   * @return sEzsignformfieldgroupLabel
  **/
  @javax.annotation.Nullable
  public String getsEzsignformfieldgroupLabel() {
    return sEzsignformfieldgroupLabel;
  }


  public void setsEzsignformfieldgroupLabel(String sEzsignformfieldgroupLabel) {
    this.sEzsignformfieldgroupLabel = sEzsignformfieldgroupLabel;
  }


  public CustomEzsignformfieldgroupRequestAllOf aObjEzsignformfield(List<CustomEzsignformfieldRequest> aObjEzsignformfield) {
    
    this.aObjEzsignformfield = aObjEzsignformfield;
    return this;
  }

  public CustomEzsignformfieldgroupRequestAllOf addAObjEzsignformfieldItem(CustomEzsignformfieldRequest aObjEzsignformfieldItem) {
    if (this.aObjEzsignformfield == null) {
      this.aObjEzsignformfield = new ArrayList<>();
    }
    this.aObjEzsignformfield.add(aObjEzsignformfieldItem);
    return this;
  }

   /**
   * An array containing all the values to fill the Ezsignform.
   * @return aObjEzsignformfield
  **/
  @javax.annotation.Nonnull
  public List<CustomEzsignformfieldRequest> getaObjEzsignformfield() {
    return aObjEzsignformfield;
  }


  public void setaObjEzsignformfield(List<CustomEzsignformfieldRequest> aObjEzsignformfield) {
    this.aObjEzsignformfield = aObjEzsignformfield;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomEzsignformfieldgroupRequestAllOf customEzsignformfieldgroupRequestAllOf = (CustomEzsignformfieldgroupRequestAllOf) o;
    return Objects.equals(this.pkiEzsignformfieldgroupID, customEzsignformfieldgroupRequestAllOf.pkiEzsignformfieldgroupID) &&
        Objects.equals(this.sEzsignformfieldgroupLabel, customEzsignformfieldgroupRequestAllOf.sEzsignformfieldgroupLabel) &&
        Objects.equals(this.aObjEzsignformfield, customEzsignformfieldgroupRequestAllOf.aObjEzsignformfield);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pkiEzsignformfieldgroupID, sEzsignformfieldgroupLabel, aObjEzsignformfield);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomEzsignformfieldgroupRequestAllOf {\n");
    sb.append("    pkiEzsignformfieldgroupID: ").append(toIndentedString(pkiEzsignformfieldgroupID)).append("\n");
    sb.append("    sEzsignformfieldgroupLabel: ").append(toIndentedString(sEzsignformfieldgroupLabel)).append("\n");
    sb.append("    aObjEzsignformfield: ").append(toIndentedString(aObjEzsignformfield)).append("\n");
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
    openapiFields.add("pkiEzsignformfieldgroupID");
    openapiFields.add("sEzsignformfieldgroupLabel");
    openapiFields.add("a_objEzsignformfield");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("a_objEzsignformfield");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CustomEzsignformfieldgroupRequestAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CustomEzsignformfieldgroupRequestAllOf.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CustomEzsignformfieldgroupRequestAllOf is not found in the empty JSON string", CustomEzsignformfieldgroupRequestAllOf.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CustomEzsignformfieldgroupRequestAllOf.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CustomEzsignformfieldgroupRequestAllOf` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CustomEzsignformfieldgroupRequestAllOf.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("sEzsignformfieldgroupLabel") != null && !jsonObj.get("sEzsignformfieldgroupLabel").isJsonNull()) && !jsonObj.get("sEzsignformfieldgroupLabel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sEzsignformfieldgroupLabel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sEzsignformfieldgroupLabel").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("a_objEzsignformfield").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `a_objEzsignformfield` to be an array in the JSON string but got `%s`", jsonObj.get("a_objEzsignformfield").toString()));
      }

      JsonArray jsonArrayaObjEzsignformfield = jsonObj.getAsJsonArray("a_objEzsignformfield");
      // validate the required field `a_objEzsignformfield` (array)
      for (int i = 0; i < jsonArrayaObjEzsignformfield.size(); i++) {
        CustomEzsignformfieldRequest.validateJsonObject(jsonArrayaObjEzsignformfield.get(i).getAsJsonObject());
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CustomEzsignformfieldgroupRequestAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CustomEzsignformfieldgroupRequestAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CustomEzsignformfieldgroupRequestAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CustomEzsignformfieldgroupRequestAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<CustomEzsignformfieldgroupRequestAllOf>() {
           @Override
           public void write(JsonWriter out, CustomEzsignformfieldgroupRequestAllOf value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CustomEzsignformfieldgroupRequestAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CustomEzsignformfieldgroupRequestAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CustomEzsignformfieldgroupRequestAllOf
  * @throws IOException if the JSON string is invalid with respect to CustomEzsignformfieldgroupRequestAllOf
  */
  public static CustomEzsignformfieldgroupRequestAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CustomEzsignformfieldgroupRequestAllOf.class);
  }

 /**
  * Convert an instance of CustomEzsignformfieldgroupRequestAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

