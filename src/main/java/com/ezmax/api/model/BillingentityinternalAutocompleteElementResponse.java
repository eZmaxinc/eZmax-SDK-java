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
 * A Billingentityinternal AutocompleteElement Response
 */
@ApiModel(description = "A Billingentityinternal AutocompleteElement Response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-10T15:21:40.493145Z[Etc/UTC]")
public class BillingentityinternalAutocompleteElementResponse {
  public static final String SERIALIZED_NAME_S_BILLINGENTITYINTERNAL_DESCRIPTION_X = "sBillingentityinternalDescriptionX";
  @SerializedName(SERIALIZED_NAME_S_BILLINGENTITYINTERNAL_DESCRIPTION_X)
  private String sBillingentityinternalDescriptionX;

  public static final String SERIALIZED_NAME_PKI_BILLINGENTITYINTERNAL_I_D = "pkiBillingentityinternalID";
  @SerializedName(SERIALIZED_NAME_PKI_BILLINGENTITYINTERNAL_I_D)
  private Integer pkiBillingentityinternalID;

  public static final String SERIALIZED_NAME_B_BILLINGENTITYINTERNAL_ISACTIVE = "bBillingentityinternalIsactive";
  @SerializedName(SERIALIZED_NAME_B_BILLINGENTITYINTERNAL_ISACTIVE)
  private Boolean bBillingentityinternalIsactive;

  public BillingentityinternalAutocompleteElementResponse() { 
  }

  public BillingentityinternalAutocompleteElementResponse sBillingentityinternalDescriptionX(String sBillingentityinternalDescriptionX) {
    
    this.sBillingentityinternalDescriptionX = sBillingentityinternalDescriptionX;
    return this;
  }

   /**
   * The description of the Billingentityinternal in the language of the requester
   * @return sBillingentityinternalDescriptionX
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Default", required = true, value = "The description of the Billingentityinternal in the language of the requester")

  public String getsBillingentityinternalDescriptionX() {
    return sBillingentityinternalDescriptionX;
  }


  public void setsBillingentityinternalDescriptionX(String sBillingentityinternalDescriptionX) {
    this.sBillingentityinternalDescriptionX = sBillingentityinternalDescriptionX;
  }


  public BillingentityinternalAutocompleteElementResponse pkiBillingentityinternalID(Integer pkiBillingentityinternalID) {
    
    this.pkiBillingentityinternalID = pkiBillingentityinternalID;
    return this;
  }

   /**
   * The unique ID of the Billingentityinternal.
   * minimum: 0
   * @return pkiBillingentityinternalID
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1", required = true, value = "The unique ID of the Billingentityinternal.")

  public Integer getPkiBillingentityinternalID() {
    return pkiBillingentityinternalID;
  }


  public void setPkiBillingentityinternalID(Integer pkiBillingentityinternalID) {
    this.pkiBillingentityinternalID = pkiBillingentityinternalID;
  }


  public BillingentityinternalAutocompleteElementResponse bBillingentityinternalIsactive(Boolean bBillingentityinternalIsactive) {
    
    this.bBillingentityinternalIsactive = bBillingentityinternalIsactive;
    return this;
  }

   /**
   * Whether the Billingentityinternal is active or not
   * @return bBillingentityinternalIsactive
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "true", required = true, value = "Whether the Billingentityinternal is active or not")

  public Boolean getbBillingentityinternalIsactive() {
    return bBillingentityinternalIsactive;
  }


  public void setbBillingentityinternalIsactive(Boolean bBillingentityinternalIsactive) {
    this.bBillingentityinternalIsactive = bBillingentityinternalIsactive;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillingentityinternalAutocompleteElementResponse billingentityinternalAutocompleteElementResponse = (BillingentityinternalAutocompleteElementResponse) o;
    return Objects.equals(this.sBillingentityinternalDescriptionX, billingentityinternalAutocompleteElementResponse.sBillingentityinternalDescriptionX) &&
        Objects.equals(this.pkiBillingentityinternalID, billingentityinternalAutocompleteElementResponse.pkiBillingentityinternalID) &&
        Objects.equals(this.bBillingentityinternalIsactive, billingentityinternalAutocompleteElementResponse.bBillingentityinternalIsactive);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sBillingentityinternalDescriptionX, pkiBillingentityinternalID, bBillingentityinternalIsactive);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillingentityinternalAutocompleteElementResponse {\n");
    sb.append("    sBillingentityinternalDescriptionX: ").append(toIndentedString(sBillingentityinternalDescriptionX)).append("\n");
    sb.append("    pkiBillingentityinternalID: ").append(toIndentedString(pkiBillingentityinternalID)).append("\n");
    sb.append("    bBillingentityinternalIsactive: ").append(toIndentedString(bBillingentityinternalIsactive)).append("\n");
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
    openapiFields.add("sBillingentityinternalDescriptionX");
    openapiFields.add("pkiBillingentityinternalID");
    openapiFields.add("bBillingentityinternalIsactive");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("sBillingentityinternalDescriptionX");
    openapiRequiredFields.add("pkiBillingentityinternalID");
    openapiRequiredFields.add("bBillingentityinternalIsactive");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BillingentityinternalAutocompleteElementResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (BillingentityinternalAutocompleteElementResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in BillingentityinternalAutocompleteElementResponse is not found in the empty JSON string", BillingentityinternalAutocompleteElementResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!BillingentityinternalAutocompleteElementResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BillingentityinternalAutocompleteElementResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : BillingentityinternalAutocompleteElementResponse.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("sBillingentityinternalDescriptionX") != null && !jsonObj.get("sBillingentityinternalDescriptionX").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sBillingentityinternalDescriptionX` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sBillingentityinternalDescriptionX").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BillingentityinternalAutocompleteElementResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BillingentityinternalAutocompleteElementResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BillingentityinternalAutocompleteElementResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BillingentityinternalAutocompleteElementResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<BillingentityinternalAutocompleteElementResponse>() {
           @Override
           public void write(JsonWriter out, BillingentityinternalAutocompleteElementResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BillingentityinternalAutocompleteElementResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BillingentityinternalAutocompleteElementResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BillingentityinternalAutocompleteElementResponse
  * @throws IOException if the JSON string is invalid with respect to BillingentityinternalAutocompleteElementResponse
  */
  public static BillingentityinternalAutocompleteElementResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BillingentityinternalAutocompleteElementResponse.class);
  }

 /**
  * Convert an instance of BillingentityinternalAutocompleteElementResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
