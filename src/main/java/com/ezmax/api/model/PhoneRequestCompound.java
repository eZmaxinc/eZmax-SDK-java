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
import com.ezmax.api.model.FieldEPhoneType;
import com.ezmax.api.model.PhoneRequest;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import eZmaxAPI.JSON;

/**
 * A Phone Object and children to create a complete structure
 */
@ApiModel(description = "A Phone Object and children to create a complete structure")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-20T16:59:39.826205Z[Etc/UTC]")
public class PhoneRequestCompound {
  public static final String SERIALIZED_NAME_FKI_PHONETYPE_I_D = "fkiPhonetypeID";
  @SerializedName(SERIALIZED_NAME_FKI_PHONETYPE_I_D)
  private Integer fkiPhonetypeID;

  public static final String SERIALIZED_NAME_E_PHONE_TYPE = "ePhoneType";
  @SerializedName(SERIALIZED_NAME_E_PHONE_TYPE)
  private FieldEPhoneType ePhoneType;

  public static final String SERIALIZED_NAME_S_PHONE_REGION = "sPhoneRegion";
  @SerializedName(SERIALIZED_NAME_S_PHONE_REGION)
  private String sPhoneRegion;

  public static final String SERIALIZED_NAME_S_PHONE_EXCHANGE = "sPhoneExchange";
  @SerializedName(SERIALIZED_NAME_S_PHONE_EXCHANGE)
  private String sPhoneExchange;

  public static final String SERIALIZED_NAME_S_PHONE_NUMBER = "sPhoneNumber";
  @SerializedName(SERIALIZED_NAME_S_PHONE_NUMBER)
  private String sPhoneNumber;

  public static final String SERIALIZED_NAME_S_PHONE_INTERNATIONAL = "sPhoneInternational";
  @SerializedName(SERIALIZED_NAME_S_PHONE_INTERNATIONAL)
  private String sPhoneInternational;

  public static final String SERIALIZED_NAME_S_PHONE_EXTENSION = "sPhoneExtension";
  @SerializedName(SERIALIZED_NAME_S_PHONE_EXTENSION)
  private String sPhoneExtension;

  public PhoneRequestCompound() { 
  }

  public PhoneRequestCompound fkiPhonetypeID(Integer fkiPhonetypeID) {
    
    this.fkiPhonetypeID = fkiPhonetypeID;
    return this;
  }

   /**
   * The unique ID of the Phonetype.  Valid values:  |Value|Description| |-|-| |1|Office| |2|Home| |3|Mobile| |4|Fax| |5|Pager| |6|Toll Free|
   * minimum: 0
   * @return fkiPhonetypeID
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1", required = true, value = "The unique ID of the Phonetype.  Valid values:  |Value|Description| |-|-| |1|Office| |2|Home| |3|Mobile| |4|Fax| |5|Pager| |6|Toll Free|")

  public Integer getFkiPhonetypeID() {
    return fkiPhonetypeID;
  }


  public void setFkiPhonetypeID(Integer fkiPhonetypeID) {
    this.fkiPhonetypeID = fkiPhonetypeID;
  }


  public PhoneRequestCompound ePhoneType(FieldEPhoneType ePhoneType) {
    
    this.ePhoneType = ePhoneType;
    return this;
  }

   /**
   * Get ePhoneType
   * @return ePhoneType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public FieldEPhoneType getePhoneType() {
    return ePhoneType;
  }


  public void setePhoneType(FieldEPhoneType ePhoneType) {
    this.ePhoneType = ePhoneType;
  }


  public PhoneRequestCompound sPhoneRegion(String sPhoneRegion) {
    
    this.sPhoneRegion = sPhoneRegion;
    return this;
  }

   /**
   * The region of the phone number. (For a North America Number only)  The region is the \&quot;514\&quot; section in this sample phone number: (514) 990-1516 x123
   * @return sPhoneRegion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "514", value = "The region of the phone number. (For a North America Number only)  The region is the \"514\" section in this sample phone number: (514) 990-1516 x123")

  public String getsPhoneRegion() {
    return sPhoneRegion;
  }


  public void setsPhoneRegion(String sPhoneRegion) {
    this.sPhoneRegion = sPhoneRegion;
  }


  public PhoneRequestCompound sPhoneExchange(String sPhoneExchange) {
    
    this.sPhoneExchange = sPhoneExchange;
    return this;
  }

   /**
   * The exchange of the phone number. (For a North America Number only)  The exchange is the \&quot;990\&quot; section in this sample phone number: (514) 990-1516 x123
   * @return sPhoneExchange
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "990", value = "The exchange of the phone number. (For a North America Number only)  The exchange is the \"990\" section in this sample phone number: (514) 990-1516 x123")

  public String getsPhoneExchange() {
    return sPhoneExchange;
  }


  public void setsPhoneExchange(String sPhoneExchange) {
    this.sPhoneExchange = sPhoneExchange;
  }


  public PhoneRequestCompound sPhoneNumber(String sPhoneNumber) {
    
    this.sPhoneNumber = sPhoneNumber;
    return this;
  }

   /**
   * The number of the phone number. (For a North America Number only)  The number is the \&quot;1516\&quot; section in this sample phone number: (514) 990-1516 x123
   * @return sPhoneNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1516", value = "The number of the phone number. (For a North America Number only)  The number is the \"1516\" section in this sample phone number: (514) 990-1516 x123")

  public String getsPhoneNumber() {
    return sPhoneNumber;
  }


  public void setsPhoneNumber(String sPhoneNumber) {
    this.sPhoneNumber = sPhoneNumber;
  }


  public PhoneRequestCompound sPhoneInternational(String sPhoneInternational) {
    
    this.sPhoneInternational = sPhoneInternational;
    return this;
  }

   /**
   * A phone number in E.164 Format
   * @return sPhoneInternational
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "+15149901516", value = "A phone number in E.164 Format")

  public String getsPhoneInternational() {
    return sPhoneInternational;
  }


  public void setsPhoneInternational(String sPhoneInternational) {
    this.sPhoneInternational = sPhoneInternational;
  }


  public PhoneRequestCompound sPhoneExtension(String sPhoneExtension) {
    
    this.sPhoneExtension = sPhoneExtension;
    return this;
  }

   /**
   * The extension of the phone number.  The extension is the \&quot;123\&quot; section in this sample phone number: (514) 990-1516 x123.  It can also be used with international phone numbers
   * @return sPhoneExtension
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123", value = "The extension of the phone number.  The extension is the \"123\" section in this sample phone number: (514) 990-1516 x123.  It can also be used with international phone numbers")

  public String getsPhoneExtension() {
    return sPhoneExtension;
  }


  public void setsPhoneExtension(String sPhoneExtension) {
    this.sPhoneExtension = sPhoneExtension;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PhoneRequestCompound phoneRequestCompound = (PhoneRequestCompound) o;
    return Objects.equals(this.fkiPhonetypeID, phoneRequestCompound.fkiPhonetypeID) &&
        Objects.equals(this.ePhoneType, phoneRequestCompound.ePhoneType) &&
        Objects.equals(this.sPhoneRegion, phoneRequestCompound.sPhoneRegion) &&
        Objects.equals(this.sPhoneExchange, phoneRequestCompound.sPhoneExchange) &&
        Objects.equals(this.sPhoneNumber, phoneRequestCompound.sPhoneNumber) &&
        Objects.equals(this.sPhoneInternational, phoneRequestCompound.sPhoneInternational) &&
        Objects.equals(this.sPhoneExtension, phoneRequestCompound.sPhoneExtension);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fkiPhonetypeID, ePhoneType, sPhoneRegion, sPhoneExchange, sPhoneNumber, sPhoneInternational, sPhoneExtension);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhoneRequestCompound {\n");
    sb.append("    fkiPhonetypeID: ").append(toIndentedString(fkiPhonetypeID)).append("\n");
    sb.append("    ePhoneType: ").append(toIndentedString(ePhoneType)).append("\n");
    sb.append("    sPhoneRegion: ").append(toIndentedString(sPhoneRegion)).append("\n");
    sb.append("    sPhoneExchange: ").append(toIndentedString(sPhoneExchange)).append("\n");
    sb.append("    sPhoneNumber: ").append(toIndentedString(sPhoneNumber)).append("\n");
    sb.append("    sPhoneInternational: ").append(toIndentedString(sPhoneInternational)).append("\n");
    sb.append("    sPhoneExtension: ").append(toIndentedString(sPhoneExtension)).append("\n");
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
    openapiFields.add("fkiPhonetypeID");
    openapiFields.add("ePhoneType");
    openapiFields.add("sPhoneRegion");
    openapiFields.add("sPhoneExchange");
    openapiFields.add("sPhoneNumber");
    openapiFields.add("sPhoneInternational");
    openapiFields.add("sPhoneExtension");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("fkiPhonetypeID");
    openapiRequiredFields.add("ePhoneType");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PhoneRequestCompound
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (PhoneRequestCompound.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in PhoneRequestCompound is not found in the empty JSON string", PhoneRequestCompound.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PhoneRequestCompound.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PhoneRequestCompound` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PhoneRequestCompound.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("sPhoneRegion") != null && !jsonObj.get("sPhoneRegion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sPhoneRegion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sPhoneRegion").toString()));
      }
      if (jsonObj.get("sPhoneExchange") != null && !jsonObj.get("sPhoneExchange").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sPhoneExchange` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sPhoneExchange").toString()));
      }
      if (jsonObj.get("sPhoneNumber") != null && !jsonObj.get("sPhoneNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sPhoneNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sPhoneNumber").toString()));
      }
      if (jsonObj.get("sPhoneInternational") != null && !jsonObj.get("sPhoneInternational").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sPhoneInternational` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sPhoneInternational").toString()));
      }
      if (jsonObj.get("sPhoneExtension") != null && !jsonObj.get("sPhoneExtension").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sPhoneExtension` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sPhoneExtension").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PhoneRequestCompound.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PhoneRequestCompound' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PhoneRequestCompound> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PhoneRequestCompound.class));

       return (TypeAdapter<T>) new TypeAdapter<PhoneRequestCompound>() {
           @Override
           public void write(JsonWriter out, PhoneRequestCompound value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PhoneRequestCompound read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PhoneRequestCompound given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PhoneRequestCompound
  * @throws IOException if the JSON string is invalid with respect to PhoneRequestCompound
  */
  public static PhoneRequestCompound fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PhoneRequestCompound.class);
  }

 /**
  * Convert an instance of PhoneRequestCompound to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
