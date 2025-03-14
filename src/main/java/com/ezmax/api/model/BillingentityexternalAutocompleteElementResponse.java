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
 * A Billingentityexternal AutocompleteElement Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-07T19:20:13.445471985Z[Etc/UTC]", comments = "Generator version: 7.12.0")
public class BillingentityexternalAutocompleteElementResponse {
  public static final String SERIALIZED_NAME_PKI_BILLINGENTITYEXTERNAL_I_D = "pkiBillingentityexternalID";
  @SerializedName(SERIALIZED_NAME_PKI_BILLINGENTITYEXTERNAL_I_D)
  @javax.annotation.Nonnull
  private Integer pkiBillingentityexternalID;

  public static final String SERIALIZED_NAME_S_BILLINGENTITYEXTERNAL_DESCRIPTION = "sBillingentityexternalDescription";
  @SerializedName(SERIALIZED_NAME_S_BILLINGENTITYEXTERNAL_DESCRIPTION)
  @javax.annotation.Nonnull
  private String sBillingentityexternalDescription;

  public static final String SERIALIZED_NAME_B_BILLINGENTITYEXTERNAL_ISACTIVE = "bBillingentityexternalIsactive";
  @SerializedName(SERIALIZED_NAME_B_BILLINGENTITYEXTERNAL_ISACTIVE)
  @javax.annotation.Nonnull
  private Boolean bBillingentityexternalIsactive;

  public BillingentityexternalAutocompleteElementResponse() {
  }

  public BillingentityexternalAutocompleteElementResponse pkiBillingentityexternalID(@javax.annotation.Nonnull Integer pkiBillingentityexternalID) {
    this.pkiBillingentityexternalID = pkiBillingentityexternalID;
    return this;
  }

  /**
   * The unique ID of the Billingentityexternal
   * minimum: 1
   * @return pkiBillingentityexternalID
   */
  @javax.annotation.Nonnull
  public Integer getPkiBillingentityexternalID() {
    return pkiBillingentityexternalID;
  }

  public void setPkiBillingentityexternalID(@javax.annotation.Nonnull Integer pkiBillingentityexternalID) {
    this.pkiBillingentityexternalID = pkiBillingentityexternalID;
  }


  public BillingentityexternalAutocompleteElementResponse sBillingentityexternalDescription(@javax.annotation.Nonnull String sBillingentityexternalDescription) {
    this.sBillingentityexternalDescription = sBillingentityexternalDescription;
    return this;
  }

  /**
   * The description of the Billingentityexternal
   * @return sBillingentityexternalDescription
   */
  @javax.annotation.Nonnull
  public String getsBillingentityexternalDescription() {
    return sBillingentityexternalDescription;
  }

  public void setsBillingentityexternalDescription(@javax.annotation.Nonnull String sBillingentityexternalDescription) {
    this.sBillingentityexternalDescription = sBillingentityexternalDescription;
  }


  public BillingentityexternalAutocompleteElementResponse bBillingentityexternalIsactive(@javax.annotation.Nonnull Boolean bBillingentityexternalIsactive) {
    this.bBillingentityexternalIsactive = bBillingentityexternalIsactive;
    return this;
  }

  /**
   * Whether the Billingentityexternal is active or not
   * @return bBillingentityexternalIsactive
   */
  @javax.annotation.Nonnull
  public Boolean getbBillingentityexternalIsactive() {
    return bBillingentityexternalIsactive;
  }

  public void setbBillingentityexternalIsactive(@javax.annotation.Nonnull Boolean bBillingentityexternalIsactive) {
    this.bBillingentityexternalIsactive = bBillingentityexternalIsactive;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillingentityexternalAutocompleteElementResponse billingentityexternalAutocompleteElementResponse = (BillingentityexternalAutocompleteElementResponse) o;
    return Objects.equals(this.pkiBillingentityexternalID, billingentityexternalAutocompleteElementResponse.pkiBillingentityexternalID) &&
        Objects.equals(this.sBillingentityexternalDescription, billingentityexternalAutocompleteElementResponse.sBillingentityexternalDescription) &&
        Objects.equals(this.bBillingentityexternalIsactive, billingentityexternalAutocompleteElementResponse.bBillingentityexternalIsactive);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pkiBillingentityexternalID, sBillingentityexternalDescription, bBillingentityexternalIsactive);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillingentityexternalAutocompleteElementResponse {\n");
    sb.append("    pkiBillingentityexternalID: ").append(toIndentedString(pkiBillingentityexternalID)).append("\n");
    sb.append("    sBillingentityexternalDescription: ").append(toIndentedString(sBillingentityexternalDescription)).append("\n");
    sb.append("    bBillingentityexternalIsactive: ").append(toIndentedString(bBillingentityexternalIsactive)).append("\n");
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
    openapiFields.add("pkiBillingentityexternalID");
    openapiFields.add("sBillingentityexternalDescription");
    openapiFields.add("bBillingentityexternalIsactive");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("pkiBillingentityexternalID");
    openapiRequiredFields.add("sBillingentityexternalDescription");
    openapiRequiredFields.add("bBillingentityexternalIsactive");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to BillingentityexternalAutocompleteElementResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BillingentityexternalAutocompleteElementResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BillingentityexternalAutocompleteElementResponse is not found in the empty JSON string", BillingentityexternalAutocompleteElementResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!BillingentityexternalAutocompleteElementResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BillingentityexternalAutocompleteElementResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : BillingentityexternalAutocompleteElementResponse.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("sBillingentityexternalDescription").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sBillingentityexternalDescription` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sBillingentityexternalDescription").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BillingentityexternalAutocompleteElementResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BillingentityexternalAutocompleteElementResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BillingentityexternalAutocompleteElementResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BillingentityexternalAutocompleteElementResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<BillingentityexternalAutocompleteElementResponse>() {
           @Override
           public void write(JsonWriter out, BillingentityexternalAutocompleteElementResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BillingentityexternalAutocompleteElementResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of BillingentityexternalAutocompleteElementResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of BillingentityexternalAutocompleteElementResponse
   * @throws IOException if the JSON string is invalid with respect to BillingentityexternalAutocompleteElementResponse
   */
  public static BillingentityexternalAutocompleteElementResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BillingentityexternalAutocompleteElementResponse.class);
  }

  /**
   * Convert an instance of BillingentityexternalAutocompleteElementResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

