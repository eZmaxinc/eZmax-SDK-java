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
import com.ezmax.api.model.FieldEEzmaxinvoicinguserVariationezsign;
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
 * A Ezmaxinvoicinguser Object
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-07T19:20:13.445471985Z[Etc/UTC]", comments = "Generator version: 7.12.0")
public class EzmaxinvoicinguserResponse {
  public static final String SERIALIZED_NAME_PKI_EZMAXINVOICINGUSER_I_D = "pkiEzmaxinvoicinguserID";
  @SerializedName(SERIALIZED_NAME_PKI_EZMAXINVOICINGUSER_I_D)
  @javax.annotation.Nullable
  private Integer pkiEzmaxinvoicinguserID;

  public static final String SERIALIZED_NAME_FKI_EZMAXINVOICING_I_D = "fkiEzmaxinvoicingID";
  @SerializedName(SERIALIZED_NAME_FKI_EZMAXINVOICING_I_D)
  @javax.annotation.Nullable
  private Integer fkiEzmaxinvoicingID;

  public static final String SERIALIZED_NAME_FKI_BILLINGENTITYINTERNAL_I_D = "fkiBillingentityinternalID";
  @SerializedName(SERIALIZED_NAME_FKI_BILLINGENTITYINTERNAL_I_D)
  @javax.annotation.Nonnull
  private Integer fkiBillingentityinternalID;

  public static final String SERIALIZED_NAME_S_BILLINGENTITYINTERNAL_DESCRIPTION_X = "sBillingentityinternalDescriptionX";
  @SerializedName(SERIALIZED_NAME_S_BILLINGENTITYINTERNAL_DESCRIPTION_X)
  @javax.annotation.Nonnull
  private String sBillingentityinternalDescriptionX;

  public static final String SERIALIZED_NAME_FKI_USER_I_D = "fkiUserID";
  @SerializedName(SERIALIZED_NAME_FKI_USER_I_D)
  @javax.annotation.Nonnull
  private Integer fkiUserID;

  public static final String SERIALIZED_NAME_I_EZMAXINVOICINGUSER_EZSIGNDOCUMENT = "iEzmaxinvoicinguserEzsigndocument";
  @SerializedName(SERIALIZED_NAME_I_EZMAXINVOICINGUSER_EZSIGNDOCUMENT)
  @javax.annotation.Nonnull
  private Integer iEzmaxinvoicinguserEzsigndocument;

  public static final String SERIALIZED_NAME_B_EZMAXINVOICINGUSER_EZSIGNACCOUNT = "bEzmaxinvoicinguserEzsignaccount";
  @SerializedName(SERIALIZED_NAME_B_EZMAXINVOICINGUSER_EZSIGNACCOUNT)
  @javax.annotation.Nonnull
  private Boolean bEzmaxinvoicinguserEzsignaccount;

  public static final String SERIALIZED_NAME_B_EZMAXINVOICINGUSER_BILLABLEEZSIGN = "bEzmaxinvoicinguserBillableezsign";
  @SerializedName(SERIALIZED_NAME_B_EZMAXINVOICINGUSER_BILLABLEEZSIGN)
  @javax.annotation.Nonnull
  private Boolean bEzmaxinvoicinguserBillableezsign;

  public static final String SERIALIZED_NAME_E_EZMAXINVOICINGUSER_VARIATIONEZSIGN = "eEzmaxinvoicinguserVariationezsign";
  @SerializedName(SERIALIZED_NAME_E_EZMAXINVOICINGUSER_VARIATIONEZSIGN)
  @javax.annotation.Nonnull
  private FieldEEzmaxinvoicinguserVariationezsign eEzmaxinvoicinguserVariationezsign;

  public EzmaxinvoicinguserResponse() {
  }

  public EzmaxinvoicinguserResponse pkiEzmaxinvoicinguserID(@javax.annotation.Nullable Integer pkiEzmaxinvoicinguserID) {
    this.pkiEzmaxinvoicinguserID = pkiEzmaxinvoicinguserID;
    return this;
  }

  /**
   * The unique ID of the Ezmaxinvoicinguser
   * minimum: 0
   * @return pkiEzmaxinvoicinguserID
   */
  @javax.annotation.Nullable
  public Integer getPkiEzmaxinvoicinguserID() {
    return pkiEzmaxinvoicinguserID;
  }

  public void setPkiEzmaxinvoicinguserID(@javax.annotation.Nullable Integer pkiEzmaxinvoicinguserID) {
    this.pkiEzmaxinvoicinguserID = pkiEzmaxinvoicinguserID;
  }


  public EzmaxinvoicinguserResponse fkiEzmaxinvoicingID(@javax.annotation.Nullable Integer fkiEzmaxinvoicingID) {
    this.fkiEzmaxinvoicingID = fkiEzmaxinvoicingID;
    return this;
  }

  /**
   * The unique ID of the Ezmaxinvoicing
   * minimum: 0
   * @return fkiEzmaxinvoicingID
   */
  @javax.annotation.Nullable
  public Integer getFkiEzmaxinvoicingID() {
    return fkiEzmaxinvoicingID;
  }

  public void setFkiEzmaxinvoicingID(@javax.annotation.Nullable Integer fkiEzmaxinvoicingID) {
    this.fkiEzmaxinvoicingID = fkiEzmaxinvoicingID;
  }


  public EzmaxinvoicinguserResponse fkiBillingentityinternalID(@javax.annotation.Nonnull Integer fkiBillingentityinternalID) {
    this.fkiBillingentityinternalID = fkiBillingentityinternalID;
    return this;
  }

  /**
   * The unique ID of the Billingentityinternal.
   * minimum: 0
   * @return fkiBillingentityinternalID
   */
  @javax.annotation.Nonnull
  public Integer getFkiBillingentityinternalID() {
    return fkiBillingentityinternalID;
  }

  public void setFkiBillingentityinternalID(@javax.annotation.Nonnull Integer fkiBillingentityinternalID) {
    this.fkiBillingentityinternalID = fkiBillingentityinternalID;
  }


  public EzmaxinvoicinguserResponse sBillingentityinternalDescriptionX(@javax.annotation.Nonnull String sBillingentityinternalDescriptionX) {
    this.sBillingentityinternalDescriptionX = sBillingentityinternalDescriptionX;
    return this;
  }

  /**
   * The description of the Billingentityinternal in the language of the requester
   * @return sBillingentityinternalDescriptionX
   */
  @javax.annotation.Nonnull
  public String getsBillingentityinternalDescriptionX() {
    return sBillingentityinternalDescriptionX;
  }

  public void setsBillingentityinternalDescriptionX(@javax.annotation.Nonnull String sBillingentityinternalDescriptionX) {
    this.sBillingentityinternalDescriptionX = sBillingentityinternalDescriptionX;
  }


  public EzmaxinvoicinguserResponse fkiUserID(@javax.annotation.Nonnull Integer fkiUserID) {
    this.fkiUserID = fkiUserID;
    return this;
  }

  /**
   * The unique ID of the User
   * minimum: 0
   * @return fkiUserID
   */
  @javax.annotation.Nonnull
  public Integer getFkiUserID() {
    return fkiUserID;
  }

  public void setFkiUserID(@javax.annotation.Nonnull Integer fkiUserID) {
    this.fkiUserID = fkiUserID;
  }


  public EzmaxinvoicinguserResponse iEzmaxinvoicinguserEzsigndocument(@javax.annotation.Nonnull Integer iEzmaxinvoicinguserEzsigndocument) {
    this.iEzmaxinvoicinguserEzsigndocument = iEzmaxinvoicinguserEzsigndocument;
    return this;
  }

  /**
   * The number of ezsign documents
   * minimum: 0
   * @return iEzmaxinvoicinguserEzsigndocument
   */
  @javax.annotation.Nonnull
  public Integer getiEzmaxinvoicinguserEzsigndocument() {
    return iEzmaxinvoicinguserEzsigndocument;
  }

  public void setiEzmaxinvoicinguserEzsigndocument(@javax.annotation.Nonnull Integer iEzmaxinvoicinguserEzsigndocument) {
    this.iEzmaxinvoicinguserEzsigndocument = iEzmaxinvoicinguserEzsigndocument;
  }


  public EzmaxinvoicinguserResponse bEzmaxinvoicinguserEzsignaccount(@javax.annotation.Nonnull Boolean bEzmaxinvoicinguserEzsignaccount) {
    this.bEzmaxinvoicinguserEzsignaccount = bEzmaxinvoicinguserEzsignaccount;
    return this;
  }

  /**
   * Whether there is an eZsign account
   * @return bEzmaxinvoicinguserEzsignaccount
   */
  @javax.annotation.Nonnull
  public Boolean getbEzmaxinvoicinguserEzsignaccount() {
    return bEzmaxinvoicinguserEzsignaccount;
  }

  public void setbEzmaxinvoicinguserEzsignaccount(@javax.annotation.Nonnull Boolean bEzmaxinvoicinguserEzsignaccount) {
    this.bEzmaxinvoicinguserEzsignaccount = bEzmaxinvoicinguserEzsignaccount;
  }


  public EzmaxinvoicinguserResponse bEzmaxinvoicinguserBillableezsign(@javax.annotation.Nonnull Boolean bEzmaxinvoicinguserBillableezsign) {
    this.bEzmaxinvoicinguserBillableezsign = bEzmaxinvoicinguserBillableezsign;
    return this;
  }

  /**
   * Whether it is billable for eZsign
   * @return bEzmaxinvoicinguserBillableezsign
   */
  @javax.annotation.Nonnull
  public Boolean getbEzmaxinvoicinguserBillableezsign() {
    return bEzmaxinvoicinguserBillableezsign;
  }

  public void setbEzmaxinvoicinguserBillableezsign(@javax.annotation.Nonnull Boolean bEzmaxinvoicinguserBillableezsign) {
    this.bEzmaxinvoicinguserBillableezsign = bEzmaxinvoicinguserBillableezsign;
  }


  public EzmaxinvoicinguserResponse eEzmaxinvoicinguserVariationezsign(@javax.annotation.Nonnull FieldEEzmaxinvoicinguserVariationezsign eEzmaxinvoicinguserVariationezsign) {
    this.eEzmaxinvoicinguserVariationezsign = eEzmaxinvoicinguserVariationezsign;
    return this;
  }

  /**
   * Get eEzmaxinvoicinguserVariationezsign
   * @return eEzmaxinvoicinguserVariationezsign
   */
  @javax.annotation.Nonnull
  public FieldEEzmaxinvoicinguserVariationezsign geteEzmaxinvoicinguserVariationezsign() {
    return eEzmaxinvoicinguserVariationezsign;
  }

  public void seteEzmaxinvoicinguserVariationezsign(@javax.annotation.Nonnull FieldEEzmaxinvoicinguserVariationezsign eEzmaxinvoicinguserVariationezsign) {
    this.eEzmaxinvoicinguserVariationezsign = eEzmaxinvoicinguserVariationezsign;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzmaxinvoicinguserResponse ezmaxinvoicinguserResponse = (EzmaxinvoicinguserResponse) o;
    return Objects.equals(this.pkiEzmaxinvoicinguserID, ezmaxinvoicinguserResponse.pkiEzmaxinvoicinguserID) &&
        Objects.equals(this.fkiEzmaxinvoicingID, ezmaxinvoicinguserResponse.fkiEzmaxinvoicingID) &&
        Objects.equals(this.fkiBillingentityinternalID, ezmaxinvoicinguserResponse.fkiBillingentityinternalID) &&
        Objects.equals(this.sBillingentityinternalDescriptionX, ezmaxinvoicinguserResponse.sBillingentityinternalDescriptionX) &&
        Objects.equals(this.fkiUserID, ezmaxinvoicinguserResponse.fkiUserID) &&
        Objects.equals(this.iEzmaxinvoicinguserEzsigndocument, ezmaxinvoicinguserResponse.iEzmaxinvoicinguserEzsigndocument) &&
        Objects.equals(this.bEzmaxinvoicinguserEzsignaccount, ezmaxinvoicinguserResponse.bEzmaxinvoicinguserEzsignaccount) &&
        Objects.equals(this.bEzmaxinvoicinguserBillableezsign, ezmaxinvoicinguserResponse.bEzmaxinvoicinguserBillableezsign) &&
        Objects.equals(this.eEzmaxinvoicinguserVariationezsign, ezmaxinvoicinguserResponse.eEzmaxinvoicinguserVariationezsign);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pkiEzmaxinvoicinguserID, fkiEzmaxinvoicingID, fkiBillingentityinternalID, sBillingentityinternalDescriptionX, fkiUserID, iEzmaxinvoicinguserEzsigndocument, bEzmaxinvoicinguserEzsignaccount, bEzmaxinvoicinguserBillableezsign, eEzmaxinvoicinguserVariationezsign);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzmaxinvoicinguserResponse {\n");
    sb.append("    pkiEzmaxinvoicinguserID: ").append(toIndentedString(pkiEzmaxinvoicinguserID)).append("\n");
    sb.append("    fkiEzmaxinvoicingID: ").append(toIndentedString(fkiEzmaxinvoicingID)).append("\n");
    sb.append("    fkiBillingentityinternalID: ").append(toIndentedString(fkiBillingentityinternalID)).append("\n");
    sb.append("    sBillingentityinternalDescriptionX: ").append(toIndentedString(sBillingentityinternalDescriptionX)).append("\n");
    sb.append("    fkiUserID: ").append(toIndentedString(fkiUserID)).append("\n");
    sb.append("    iEzmaxinvoicinguserEzsigndocument: ").append(toIndentedString(iEzmaxinvoicinguserEzsigndocument)).append("\n");
    sb.append("    bEzmaxinvoicinguserEzsignaccount: ").append(toIndentedString(bEzmaxinvoicinguserEzsignaccount)).append("\n");
    sb.append("    bEzmaxinvoicinguserBillableezsign: ").append(toIndentedString(bEzmaxinvoicinguserBillableezsign)).append("\n");
    sb.append("    eEzmaxinvoicinguserVariationezsign: ").append(toIndentedString(eEzmaxinvoicinguserVariationezsign)).append("\n");
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
    openapiFields.add("pkiEzmaxinvoicinguserID");
    openapiFields.add("fkiEzmaxinvoicingID");
    openapiFields.add("fkiBillingentityinternalID");
    openapiFields.add("sBillingentityinternalDescriptionX");
    openapiFields.add("fkiUserID");
    openapiFields.add("iEzmaxinvoicinguserEzsigndocument");
    openapiFields.add("bEzmaxinvoicinguserEzsignaccount");
    openapiFields.add("bEzmaxinvoicinguserBillableezsign");
    openapiFields.add("eEzmaxinvoicinguserVariationezsign");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("fkiBillingentityinternalID");
    openapiRequiredFields.add("sBillingentityinternalDescriptionX");
    openapiRequiredFields.add("fkiUserID");
    openapiRequiredFields.add("iEzmaxinvoicinguserEzsigndocument");
    openapiRequiredFields.add("bEzmaxinvoicinguserEzsignaccount");
    openapiRequiredFields.add("bEzmaxinvoicinguserBillableezsign");
    openapiRequiredFields.add("eEzmaxinvoicinguserVariationezsign");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EzmaxinvoicinguserResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EzmaxinvoicinguserResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EzmaxinvoicinguserResponse is not found in the empty JSON string", EzmaxinvoicinguserResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EzmaxinvoicinguserResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EzmaxinvoicinguserResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EzmaxinvoicinguserResponse.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("sBillingentityinternalDescriptionX").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sBillingentityinternalDescriptionX` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sBillingentityinternalDescriptionX").toString()));
      }
      // validate the required field `eEzmaxinvoicinguserVariationezsign`
      FieldEEzmaxinvoicinguserVariationezsign.validateJsonElement(jsonObj.get("eEzmaxinvoicinguserVariationezsign"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EzmaxinvoicinguserResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EzmaxinvoicinguserResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EzmaxinvoicinguserResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EzmaxinvoicinguserResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<EzmaxinvoicinguserResponse>() {
           @Override
           public void write(JsonWriter out, EzmaxinvoicinguserResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EzmaxinvoicinguserResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EzmaxinvoicinguserResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EzmaxinvoicinguserResponse
   * @throws IOException if the JSON string is invalid with respect to EzmaxinvoicinguserResponse
   */
  public static EzmaxinvoicinguserResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EzmaxinvoicinguserResponse.class);
  }

  /**
   * Convert an instance of EzmaxinvoicinguserResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

