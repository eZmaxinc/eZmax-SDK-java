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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

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
 * CustomEzsignformfieldRequestAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-27T18:40:35.791662503Z[Etc/UTC]")
public class CustomEzsignformfieldRequestAllOf {
  public static final String SERIALIZED_NAME_PKI_EZSIGNFORMFIELD_I_D = "pkiEzsignformfieldID";
  @SerializedName(SERIALIZED_NAME_PKI_EZSIGNFORMFIELD_I_D)
  private Integer pkiEzsignformfieldID;

  public static final String SERIALIZED_NAME_S_EZSIGNFORMFIELD_LABEL = "sEzsignformfieldLabel";
  @SerializedName(SERIALIZED_NAME_S_EZSIGNFORMFIELD_LABEL)
  private String sEzsignformfieldLabel;

  public static final String SERIALIZED_NAME_B_EZSIGNFORMFIELD_SELECTED = "bEzsignformfieldSelected";
  @SerializedName(SERIALIZED_NAME_B_EZSIGNFORMFIELD_SELECTED)
  private Boolean bEzsignformfieldSelected;

  public static final String SERIALIZED_NAME_S_EZSIGNFORMFIELD_ENTEREDVALUE = "sEzsignformfieldEnteredvalue";
  @SerializedName(SERIALIZED_NAME_S_EZSIGNFORMFIELD_ENTEREDVALUE)
  private String sEzsignformfieldEnteredvalue;

  public CustomEzsignformfieldRequestAllOf() {
  }

  public CustomEzsignformfieldRequestAllOf pkiEzsignformfieldID(Integer pkiEzsignformfieldID) {
    
    this.pkiEzsignformfieldID = pkiEzsignformfieldID;
    return this;
  }

   /**
   * The unique ID of the Ezsignformfield
   * minimum: 0
   * @return pkiEzsignformfieldID
  **/
  @javax.annotation.Nullable
  public Integer getPkiEzsignformfieldID() {
    return pkiEzsignformfieldID;
  }


  public void setPkiEzsignformfieldID(Integer pkiEzsignformfieldID) {
    this.pkiEzsignformfieldID = pkiEzsignformfieldID;
  }


  public CustomEzsignformfieldRequestAllOf sEzsignformfieldLabel(String sEzsignformfieldLabel) {
    
    this.sEzsignformfieldLabel = sEzsignformfieldLabel;
    return this;
  }

   /**
   * The Label for the Ezsignformfield
   * @return sEzsignformfieldLabel
  **/
  @javax.annotation.Nullable
  public String getsEzsignformfieldLabel() {
    return sEzsignformfieldLabel;
  }


  public void setsEzsignformfieldLabel(String sEzsignformfieldLabel) {
    this.sEzsignformfieldLabel = sEzsignformfieldLabel;
  }


  public CustomEzsignformfieldRequestAllOf bEzsignformfieldSelected(Boolean bEzsignformfieldSelected) {
    
    this.bEzsignformfieldSelected = bEzsignformfieldSelected;
    return this;
  }

   /**
   * Whether the Ezsignformfield is selected or not by default.  This can only be set if eEzsignformfieldgroupType is **Checkbox** or **Radio**
   * @return bEzsignformfieldSelected
  **/
  @javax.annotation.Nullable
  public Boolean getbEzsignformfieldSelected() {
    return bEzsignformfieldSelected;
  }


  public void setbEzsignformfieldSelected(Boolean bEzsignformfieldSelected) {
    this.bEzsignformfieldSelected = bEzsignformfieldSelected;
  }


  public CustomEzsignformfieldRequestAllOf sEzsignformfieldEnteredvalue(String sEzsignformfieldEnteredvalue) {
    
    this.sEzsignformfieldEnteredvalue = sEzsignformfieldEnteredvalue;
    return this;
  }

   /**
   * This is the value enterred for the Ezsignformfield  This can only be set if eEzsignformfieldgroupType is **Dropdown**, **Text** or **Textarea**
   * @return sEzsignformfieldEnteredvalue
  **/
  @javax.annotation.Nullable
  public String getsEzsignformfieldEnteredvalue() {
    return sEzsignformfieldEnteredvalue;
  }


  public void setsEzsignformfieldEnteredvalue(String sEzsignformfieldEnteredvalue) {
    this.sEzsignformfieldEnteredvalue = sEzsignformfieldEnteredvalue;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomEzsignformfieldRequestAllOf customEzsignformfieldRequestAllOf = (CustomEzsignformfieldRequestAllOf) o;
    return Objects.equals(this.pkiEzsignformfieldID, customEzsignformfieldRequestAllOf.pkiEzsignformfieldID) &&
        Objects.equals(this.sEzsignformfieldLabel, customEzsignformfieldRequestAllOf.sEzsignformfieldLabel) &&
        Objects.equals(this.bEzsignformfieldSelected, customEzsignformfieldRequestAllOf.bEzsignformfieldSelected) &&
        Objects.equals(this.sEzsignformfieldEnteredvalue, customEzsignformfieldRequestAllOf.sEzsignformfieldEnteredvalue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pkiEzsignformfieldID, sEzsignformfieldLabel, bEzsignformfieldSelected, sEzsignformfieldEnteredvalue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomEzsignformfieldRequestAllOf {\n");
    sb.append("    pkiEzsignformfieldID: ").append(toIndentedString(pkiEzsignformfieldID)).append("\n");
    sb.append("    sEzsignformfieldLabel: ").append(toIndentedString(sEzsignformfieldLabel)).append("\n");
    sb.append("    bEzsignformfieldSelected: ").append(toIndentedString(bEzsignformfieldSelected)).append("\n");
    sb.append("    sEzsignformfieldEnteredvalue: ").append(toIndentedString(sEzsignformfieldEnteredvalue)).append("\n");
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
    openapiFields.add("pkiEzsignformfieldID");
    openapiFields.add("sEzsignformfieldLabel");
    openapiFields.add("bEzsignformfieldSelected");
    openapiFields.add("sEzsignformfieldEnteredvalue");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CustomEzsignformfieldRequestAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CustomEzsignformfieldRequestAllOf.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CustomEzsignformfieldRequestAllOf is not found in the empty JSON string", CustomEzsignformfieldRequestAllOf.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CustomEzsignformfieldRequestAllOf.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CustomEzsignformfieldRequestAllOf` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("sEzsignformfieldLabel") != null && !jsonObj.get("sEzsignformfieldLabel").isJsonNull()) && !jsonObj.get("sEzsignformfieldLabel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sEzsignformfieldLabel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sEzsignformfieldLabel").toString()));
      }
      if ((jsonObj.get("sEzsignformfieldEnteredvalue") != null && !jsonObj.get("sEzsignformfieldEnteredvalue").isJsonNull()) && !jsonObj.get("sEzsignformfieldEnteredvalue").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sEzsignformfieldEnteredvalue` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sEzsignformfieldEnteredvalue").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CustomEzsignformfieldRequestAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CustomEzsignformfieldRequestAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CustomEzsignformfieldRequestAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CustomEzsignformfieldRequestAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<CustomEzsignformfieldRequestAllOf>() {
           @Override
           public void write(JsonWriter out, CustomEzsignformfieldRequestAllOf value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CustomEzsignformfieldRequestAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CustomEzsignformfieldRequestAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CustomEzsignformfieldRequestAllOf
  * @throws IOException if the JSON string is invalid with respect to CustomEzsignformfieldRequestAllOf
  */
  public static CustomEzsignformfieldRequestAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CustomEzsignformfieldRequestAllOf.class);
  }

 /**
  * Convert an instance of CustomEzsignformfieldRequestAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
