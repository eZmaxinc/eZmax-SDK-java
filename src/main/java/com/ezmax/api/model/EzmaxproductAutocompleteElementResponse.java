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
 * A Ezmaxproduct AutocompleteElement Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-07T19:20:13.445471985Z[Etc/UTC]", comments = "Generator version: 7.12.0")
public class EzmaxproductAutocompleteElementResponse {
  public static final String SERIALIZED_NAME_PKI_EZMAXPRODUCT_I_D = "pkiEzmaxproductID";
  @SerializedName(SERIALIZED_NAME_PKI_EZMAXPRODUCT_I_D)
  @javax.annotation.Nonnull
  private Integer pkiEzmaxproductID;

  public static final String SERIALIZED_NAME_S_EZMAXPRODUCT_DESCRIPTION_X = "sEzmaxproductDescriptionX";
  @SerializedName(SERIALIZED_NAME_S_EZMAXPRODUCT_DESCRIPTION_X)
  @javax.annotation.Nonnull
  private String sEzmaxproductDescriptionX;

  public static final String SERIALIZED_NAME_B_EZMAXPRODUCT_ISACTIVE = "bEzmaxproductIsactive";
  @SerializedName(SERIALIZED_NAME_B_EZMAXPRODUCT_ISACTIVE)
  @javax.annotation.Nonnull
  private Boolean bEzmaxproductIsactive;

  public EzmaxproductAutocompleteElementResponse() {
  }

  public EzmaxproductAutocompleteElementResponse pkiEzmaxproductID(@javax.annotation.Nonnull Integer pkiEzmaxproductID) {
    this.pkiEzmaxproductID = pkiEzmaxproductID;
    return this;
  }

  /**
   * The unique ID of the Ezmaxproduct
   * minimum: 1
   * @return pkiEzmaxproductID
   */
  @javax.annotation.Nonnull
  public Integer getPkiEzmaxproductID() {
    return pkiEzmaxproductID;
  }

  public void setPkiEzmaxproductID(@javax.annotation.Nonnull Integer pkiEzmaxproductID) {
    this.pkiEzmaxproductID = pkiEzmaxproductID;
  }


  public EzmaxproductAutocompleteElementResponse sEzmaxproductDescriptionX(@javax.annotation.Nonnull String sEzmaxproductDescriptionX) {
    this.sEzmaxproductDescriptionX = sEzmaxproductDescriptionX;
    return this;
  }

  /**
   * The description of the Ezmaxproduct in the language of the requester
   * @return sEzmaxproductDescriptionX
   */
  @javax.annotation.Nonnull
  public String getsEzmaxproductDescriptionX() {
    return sEzmaxproductDescriptionX;
  }

  public void setsEzmaxproductDescriptionX(@javax.annotation.Nonnull String sEzmaxproductDescriptionX) {
    this.sEzmaxproductDescriptionX = sEzmaxproductDescriptionX;
  }


  public EzmaxproductAutocompleteElementResponse bEzmaxproductIsactive(@javax.annotation.Nonnull Boolean bEzmaxproductIsactive) {
    this.bEzmaxproductIsactive = bEzmaxproductIsactive;
    return this;
  }

  /**
   * Whether the Ezmaxproduct is active or not
   * @return bEzmaxproductIsactive
   */
  @javax.annotation.Nonnull
  public Boolean getbEzmaxproductIsactive() {
    return bEzmaxproductIsactive;
  }

  public void setbEzmaxproductIsactive(@javax.annotation.Nonnull Boolean bEzmaxproductIsactive) {
    this.bEzmaxproductIsactive = bEzmaxproductIsactive;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzmaxproductAutocompleteElementResponse ezmaxproductAutocompleteElementResponse = (EzmaxproductAutocompleteElementResponse) o;
    return Objects.equals(this.pkiEzmaxproductID, ezmaxproductAutocompleteElementResponse.pkiEzmaxproductID) &&
        Objects.equals(this.sEzmaxproductDescriptionX, ezmaxproductAutocompleteElementResponse.sEzmaxproductDescriptionX) &&
        Objects.equals(this.bEzmaxproductIsactive, ezmaxproductAutocompleteElementResponse.bEzmaxproductIsactive);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pkiEzmaxproductID, sEzmaxproductDescriptionX, bEzmaxproductIsactive);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzmaxproductAutocompleteElementResponse {\n");
    sb.append("    pkiEzmaxproductID: ").append(toIndentedString(pkiEzmaxproductID)).append("\n");
    sb.append("    sEzmaxproductDescriptionX: ").append(toIndentedString(sEzmaxproductDescriptionX)).append("\n");
    sb.append("    bEzmaxproductIsactive: ").append(toIndentedString(bEzmaxproductIsactive)).append("\n");
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
    openapiFields.add("pkiEzmaxproductID");
    openapiFields.add("sEzmaxproductDescriptionX");
    openapiFields.add("bEzmaxproductIsactive");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("pkiEzmaxproductID");
    openapiRequiredFields.add("sEzmaxproductDescriptionX");
    openapiRequiredFields.add("bEzmaxproductIsactive");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EzmaxproductAutocompleteElementResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EzmaxproductAutocompleteElementResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EzmaxproductAutocompleteElementResponse is not found in the empty JSON string", EzmaxproductAutocompleteElementResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EzmaxproductAutocompleteElementResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EzmaxproductAutocompleteElementResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EzmaxproductAutocompleteElementResponse.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("sEzmaxproductDescriptionX").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sEzmaxproductDescriptionX` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sEzmaxproductDescriptionX").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EzmaxproductAutocompleteElementResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EzmaxproductAutocompleteElementResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EzmaxproductAutocompleteElementResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EzmaxproductAutocompleteElementResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<EzmaxproductAutocompleteElementResponse>() {
           @Override
           public void write(JsonWriter out, EzmaxproductAutocompleteElementResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EzmaxproductAutocompleteElementResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EzmaxproductAutocompleteElementResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EzmaxproductAutocompleteElementResponse
   * @throws IOException if the JSON string is invalid with respect to EzmaxproductAutocompleteElementResponse
   */
  public static EzmaxproductAutocompleteElementResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EzmaxproductAutocompleteElementResponse.class);
  }

  /**
   * Convert an instance of EzmaxproductAutocompleteElementResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

