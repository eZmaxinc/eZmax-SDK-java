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
 * A Userlogintype AutocompleteElement Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-07T19:20:13.445471985Z[Etc/UTC]", comments = "Generator version: 7.12.0")
public class UserlogintypeAutocompleteElementResponse {
  public static final String SERIALIZED_NAME_PKI_USERLOGINTYPE_I_D = "pkiUserlogintypeID";
  @SerializedName(SERIALIZED_NAME_PKI_USERLOGINTYPE_I_D)
  @javax.annotation.Nonnull
  private Integer pkiUserlogintypeID;

  public static final String SERIALIZED_NAME_S_USERLOGINTYPE_DESCRIPTION_X = "sUserlogintypeDescriptionX";
  @SerializedName(SERIALIZED_NAME_S_USERLOGINTYPE_DESCRIPTION_X)
  @javax.annotation.Nonnull
  private String sUserlogintypeDescriptionX;

  public static final String SERIALIZED_NAME_B_USERLOGINTYPE_ISACTIVE = "bUserlogintypeIsactive";
  @SerializedName(SERIALIZED_NAME_B_USERLOGINTYPE_ISACTIVE)
  @javax.annotation.Nonnull
  private Boolean bUserlogintypeIsactive;

  public UserlogintypeAutocompleteElementResponse() {
  }

  public UserlogintypeAutocompleteElementResponse pkiUserlogintypeID(@javax.annotation.Nonnull Integer pkiUserlogintypeID) {
    this.pkiUserlogintypeID = pkiUserlogintypeID;
    return this;
  }

  /**
   * The unique ID of the Userlogintype  Valid values:  |Value|Description|Detail| |-|-|-| |1|**Email Only**|The Ezsignsigner will receive a secure link by email| |2|**Email and phone or SMS**|The Ezsignsigner will receive a secure link by email and will need to authenticate using SMS or Phone call. **Additional fee applies**| |3|**Email and secret question**|The Ezsignsigner will receive a secure link by email and will need to authenticate using a predefined question and answer| |4|**In person only**|The Ezsignsigner will only be able to sign \&quot;In-Person\&quot; and there won&#39;t be any authentication. No email will be sent for invitation to sign. Make sure you evaluate the risk of signature denial and at minimum, we recommend you use a handwritten signature type| |5|**In person with phone or SMS**|The Ezsignsigner will only be able to sign \&quot;In-Person\&quot; and will need to authenticate using SMS or Phone call. No email will be sent for invitation to sign. **Additional fee applies**| |6|**Embedded**|The Ezsignsigner will only be able to sign in the embedded solution. No email will be sent for invitation to sign. **Additional fee applies**|   |7|**Embedded with phone or SMS**|The Ezsignsigner will only be able to sign in the embedded solution and will need to authenticate using SMS or Phone call. No email will be sent for invitation to sign. **Additional fee applies**|   |8|**No validation**|The Ezsignsigner will not receive an email and won&#39;t have to validate his connection using 2 factor. **Additional fee applies**|      |9|**Sms only**|The Ezsignsigner will not receive an email but will will need to authenticate using SMS. **Additional fee applies**|     
   * minimum: 0
   * @return pkiUserlogintypeID
   */
  @javax.annotation.Nonnull
  public Integer getPkiUserlogintypeID() {
    return pkiUserlogintypeID;
  }

  public void setPkiUserlogintypeID(@javax.annotation.Nonnull Integer pkiUserlogintypeID) {
    this.pkiUserlogintypeID = pkiUserlogintypeID;
  }


  public UserlogintypeAutocompleteElementResponse sUserlogintypeDescriptionX(@javax.annotation.Nonnull String sUserlogintypeDescriptionX) {
    this.sUserlogintypeDescriptionX = sUserlogintypeDescriptionX;
    return this;
  }

  /**
   * The description of the Userlogintype in the language of the requester
   * @return sUserlogintypeDescriptionX
   */
  @javax.annotation.Nonnull
  public String getsUserlogintypeDescriptionX() {
    return sUserlogintypeDescriptionX;
  }

  public void setsUserlogintypeDescriptionX(@javax.annotation.Nonnull String sUserlogintypeDescriptionX) {
    this.sUserlogintypeDescriptionX = sUserlogintypeDescriptionX;
  }


  public UserlogintypeAutocompleteElementResponse bUserlogintypeIsactive(@javax.annotation.Nonnull Boolean bUserlogintypeIsactive) {
    this.bUserlogintypeIsactive = bUserlogintypeIsactive;
    return this;
  }

  /**
   * Whether the Userlogintype is active or not
   * @return bUserlogintypeIsactive
   */
  @javax.annotation.Nonnull
  public Boolean getbUserlogintypeIsactive() {
    return bUserlogintypeIsactive;
  }

  public void setbUserlogintypeIsactive(@javax.annotation.Nonnull Boolean bUserlogintypeIsactive) {
    this.bUserlogintypeIsactive = bUserlogintypeIsactive;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserlogintypeAutocompleteElementResponse userlogintypeAutocompleteElementResponse = (UserlogintypeAutocompleteElementResponse) o;
    return Objects.equals(this.pkiUserlogintypeID, userlogintypeAutocompleteElementResponse.pkiUserlogintypeID) &&
        Objects.equals(this.sUserlogintypeDescriptionX, userlogintypeAutocompleteElementResponse.sUserlogintypeDescriptionX) &&
        Objects.equals(this.bUserlogintypeIsactive, userlogintypeAutocompleteElementResponse.bUserlogintypeIsactive);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pkiUserlogintypeID, sUserlogintypeDescriptionX, bUserlogintypeIsactive);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserlogintypeAutocompleteElementResponse {\n");
    sb.append("    pkiUserlogintypeID: ").append(toIndentedString(pkiUserlogintypeID)).append("\n");
    sb.append("    sUserlogintypeDescriptionX: ").append(toIndentedString(sUserlogintypeDescriptionX)).append("\n");
    sb.append("    bUserlogintypeIsactive: ").append(toIndentedString(bUserlogintypeIsactive)).append("\n");
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
    openapiFields.add("pkiUserlogintypeID");
    openapiFields.add("sUserlogintypeDescriptionX");
    openapiFields.add("bUserlogintypeIsactive");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("pkiUserlogintypeID");
    openapiRequiredFields.add("sUserlogintypeDescriptionX");
    openapiRequiredFields.add("bUserlogintypeIsactive");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UserlogintypeAutocompleteElementResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UserlogintypeAutocompleteElementResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UserlogintypeAutocompleteElementResponse is not found in the empty JSON string", UserlogintypeAutocompleteElementResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UserlogintypeAutocompleteElementResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UserlogintypeAutocompleteElementResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UserlogintypeAutocompleteElementResponse.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("sUserlogintypeDescriptionX").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sUserlogintypeDescriptionX` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sUserlogintypeDescriptionX").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UserlogintypeAutocompleteElementResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UserlogintypeAutocompleteElementResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UserlogintypeAutocompleteElementResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UserlogintypeAutocompleteElementResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<UserlogintypeAutocompleteElementResponse>() {
           @Override
           public void write(JsonWriter out, UserlogintypeAutocompleteElementResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UserlogintypeAutocompleteElementResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of UserlogintypeAutocompleteElementResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UserlogintypeAutocompleteElementResponse
   * @throws IOException if the JSON string is invalid with respect to UserlogintypeAutocompleteElementResponse
   */
  public static UserlogintypeAutocompleteElementResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UserlogintypeAutocompleteElementResponse.class);
  }

  /**
   * Convert an instance of UserlogintypeAutocompleteElementResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

