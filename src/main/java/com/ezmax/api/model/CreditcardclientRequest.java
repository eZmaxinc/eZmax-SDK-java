/*
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.2.1
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ezmax.api.model;

import java.util.Objects;
import com.ezmax.api.model.CreditcarddetailRequest;
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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import eZmaxAPI.JSON;

/**
 * A Creditcardclient Object
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-14T23:45:44.203418720Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CreditcardclientRequest {
  public static final String SERIALIZED_NAME_PKI_CREDITCARDCLIENT_I_D = "pkiCreditcardclientID";
  @SerializedName(SERIALIZED_NAME_PKI_CREDITCARDCLIENT_I_D)
  private Integer pkiCreditcardclientID;

  public static final String SERIALIZED_NAME_FKS_CREDITCARDTOKEN_I_D = "fksCreditcardtokenID";
  @SerializedName(SERIALIZED_NAME_FKS_CREDITCARDTOKEN_I_D)
  private String fksCreditcardtokenID;

  public static final String SERIALIZED_NAME_B_CREDITCARDCLIENTRELATION_ISDEFAULT = "bCreditcardclientrelationIsdefault";
  @SerializedName(SERIALIZED_NAME_B_CREDITCARDCLIENTRELATION_ISDEFAULT)
  private Boolean bCreditcardclientrelationIsdefault;

  public static final String SERIALIZED_NAME_S_CREDITCARDCLIENT_DESCRIPTION = "sCreditcardclientDescription";
  @SerializedName(SERIALIZED_NAME_S_CREDITCARDCLIENT_DESCRIPTION)
  private String sCreditcardclientDescription;

  public static final String SERIALIZED_NAME_B_CREDITCARDCLIENT_ISACTIVE = "bCreditcardclientIsactive";
  @SerializedName(SERIALIZED_NAME_B_CREDITCARDCLIENT_ISACTIVE)
  private Boolean bCreditcardclientIsactive;

  public static final String SERIALIZED_NAME_B_CREDITCARDCLIENT_ALLOWEDAGENCYPAYMENT = "bCreditcardclientAllowedagencypayment";
  @SerializedName(SERIALIZED_NAME_B_CREDITCARDCLIENT_ALLOWEDAGENCYPAYMENT)
  private Boolean bCreditcardclientAllowedagencypayment;

  public static final String SERIALIZED_NAME_B_CREDITCARDCLIENT_ALLOWEDROYALLEPAGEPROTECTION = "bCreditcardclientAllowedroyallepageprotection";
  @SerializedName(SERIALIZED_NAME_B_CREDITCARDCLIENT_ALLOWEDROYALLEPAGEPROTECTION)
  private Boolean bCreditcardclientAllowedroyallepageprotection;

  public static final String SERIALIZED_NAME_B_CREDITCARDCLIENT_ALLOWEDTRANQUILLIT = "bCreditcardclientAllowedtranquillit";
  @SerializedName(SERIALIZED_NAME_B_CREDITCARDCLIENT_ALLOWEDTRANQUILLIT)
  private Boolean bCreditcardclientAllowedtranquillit;

  public static final String SERIALIZED_NAME_OBJ_CREDITCARDDETAIL = "objCreditcarddetail";
  @SerializedName(SERIALIZED_NAME_OBJ_CREDITCARDDETAIL)
  private CreditcarddetailRequest objCreditcarddetail;

  public static final String SERIALIZED_NAME_S_CREDITCARDCLIENT_C_V_V = "sCreditcardclientCVV";
  @SerializedName(SERIALIZED_NAME_S_CREDITCARDCLIENT_C_V_V)
  private String sCreditcardclientCVV;

  public CreditcardclientRequest() {
  }

  public CreditcardclientRequest pkiCreditcardclientID(Integer pkiCreditcardclientID) {
    this.pkiCreditcardclientID = pkiCreditcardclientID;
    return this;
  }

   /**
   * The unique ID of the Creditcardclient
   * minimum: 0
   * maximum: 65535
   * @return pkiCreditcardclientID
  **/
  @javax.annotation.Nullable
  public Integer getPkiCreditcardclientID() {
    return pkiCreditcardclientID;
  }

  public void setPkiCreditcardclientID(Integer pkiCreditcardclientID) {
    this.pkiCreditcardclientID = pkiCreditcardclientID;
  }


  public CreditcardclientRequest fksCreditcardtokenID(String fksCreditcardtokenID) {
    this.fksCreditcardtokenID = fksCreditcardtokenID;
    return this;
  }

   /**
   * The creditcard token identifier
   * @return fksCreditcardtokenID
  **/
  @javax.annotation.Nullable
  public String getFksCreditcardtokenID() {
    return fksCreditcardtokenID;
  }

  public void setFksCreditcardtokenID(String fksCreditcardtokenID) {
    this.fksCreditcardtokenID = fksCreditcardtokenID;
  }


  public CreditcardclientRequest bCreditcardclientrelationIsdefault(Boolean bCreditcardclientrelationIsdefault) {
    this.bCreditcardclientrelationIsdefault = bCreditcardclientrelationIsdefault;
    return this;
  }

   /**
   * Whether if it&#39;s an relationisdefault
   * @return bCreditcardclientrelationIsdefault
  **/
  @javax.annotation.Nonnull
  public Boolean getbCreditcardclientrelationIsdefault() {
    return bCreditcardclientrelationIsdefault;
  }

  public void setbCreditcardclientrelationIsdefault(Boolean bCreditcardclientrelationIsdefault) {
    this.bCreditcardclientrelationIsdefault = bCreditcardclientrelationIsdefault;
  }


  public CreditcardclientRequest sCreditcardclientDescription(String sCreditcardclientDescription) {
    this.sCreditcardclientDescription = sCreditcardclientDescription;
    return this;
  }

   /**
   * The description of the Creditcardclient
   * @return sCreditcardclientDescription
  **/
  @javax.annotation.Nonnull
  public String getsCreditcardclientDescription() {
    return sCreditcardclientDescription;
  }

  public void setsCreditcardclientDescription(String sCreditcardclientDescription) {
    this.sCreditcardclientDescription = sCreditcardclientDescription;
  }


  public CreditcardclientRequest bCreditcardclientIsactive(Boolean bCreditcardclientIsactive) {
    this.bCreditcardclientIsactive = bCreditcardclientIsactive;
    return this;
  }

   /**
   * Whether the creditcardclient is active or not
   * @return bCreditcardclientIsactive
  **/
  @javax.annotation.Nonnull
  public Boolean getbCreditcardclientIsactive() {
    return bCreditcardclientIsactive;
  }

  public void setbCreditcardclientIsactive(Boolean bCreditcardclientIsactive) {
    this.bCreditcardclientIsactive = bCreditcardclientIsactive;
  }


  public CreditcardclientRequest bCreditcardclientAllowedagencypayment(Boolean bCreditcardclientAllowedagencypayment) {
    this.bCreditcardclientAllowedagencypayment = bCreditcardclientAllowedagencypayment;
    return this;
  }

   /**
   * Whether if it&#39;s an allowedagencypayment
   * @return bCreditcardclientAllowedagencypayment
  **/
  @javax.annotation.Nonnull
  public Boolean getbCreditcardclientAllowedagencypayment() {
    return bCreditcardclientAllowedagencypayment;
  }

  public void setbCreditcardclientAllowedagencypayment(Boolean bCreditcardclientAllowedagencypayment) {
    this.bCreditcardclientAllowedagencypayment = bCreditcardclientAllowedagencypayment;
  }


  public CreditcardclientRequest bCreditcardclientAllowedroyallepageprotection(Boolean bCreditcardclientAllowedroyallepageprotection) {
    this.bCreditcardclientAllowedroyallepageprotection = bCreditcardclientAllowedroyallepageprotection;
    return this;
  }

   /**
   * Whether if it&#39;s an allowedroyallepageprotection
   * @return bCreditcardclientAllowedroyallepageprotection
  **/
  @javax.annotation.Nonnull
  public Boolean getbCreditcardclientAllowedroyallepageprotection() {
    return bCreditcardclientAllowedroyallepageprotection;
  }

  public void setbCreditcardclientAllowedroyallepageprotection(Boolean bCreditcardclientAllowedroyallepageprotection) {
    this.bCreditcardclientAllowedroyallepageprotection = bCreditcardclientAllowedroyallepageprotection;
  }


  public CreditcardclientRequest bCreditcardclientAllowedtranquillit(Boolean bCreditcardclientAllowedtranquillit) {
    this.bCreditcardclientAllowedtranquillit = bCreditcardclientAllowedtranquillit;
    return this;
  }

   /**
   * Whether if it&#39;s an allowedtranquillit
   * @return bCreditcardclientAllowedtranquillit
  **/
  @javax.annotation.Nonnull
  public Boolean getbCreditcardclientAllowedtranquillit() {
    return bCreditcardclientAllowedtranquillit;
  }

  public void setbCreditcardclientAllowedtranquillit(Boolean bCreditcardclientAllowedtranquillit) {
    this.bCreditcardclientAllowedtranquillit = bCreditcardclientAllowedtranquillit;
  }


  public CreditcardclientRequest objCreditcarddetail(CreditcarddetailRequest objCreditcarddetail) {
    this.objCreditcarddetail = objCreditcarddetail;
    return this;
  }

   /**
   * Get objCreditcarddetail
   * @return objCreditcarddetail
  **/
  @javax.annotation.Nonnull
  public CreditcarddetailRequest getObjCreditcarddetail() {
    return objCreditcarddetail;
  }

  public void setObjCreditcarddetail(CreditcarddetailRequest objCreditcarddetail) {
    this.objCreditcarddetail = objCreditcarddetail;
  }


  public CreditcardclientRequest sCreditcardclientCVV(String sCreditcardclientCVV) {
    this.sCreditcardclientCVV = sCreditcardclientCVV;
    return this;
  }

   /**
   * The creditcard card CVV
   * @return sCreditcardclientCVV
  **/
  @javax.annotation.Nonnull
  public String getsCreditcardclientCVV() {
    return sCreditcardclientCVV;
  }

  public void setsCreditcardclientCVV(String sCreditcardclientCVV) {
    this.sCreditcardclientCVV = sCreditcardclientCVV;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditcardclientRequest creditcardclientRequest = (CreditcardclientRequest) o;
    return Objects.equals(this.pkiCreditcardclientID, creditcardclientRequest.pkiCreditcardclientID) &&
        Objects.equals(this.fksCreditcardtokenID, creditcardclientRequest.fksCreditcardtokenID) &&
        Objects.equals(this.bCreditcardclientrelationIsdefault, creditcardclientRequest.bCreditcardclientrelationIsdefault) &&
        Objects.equals(this.sCreditcardclientDescription, creditcardclientRequest.sCreditcardclientDescription) &&
        Objects.equals(this.bCreditcardclientIsactive, creditcardclientRequest.bCreditcardclientIsactive) &&
        Objects.equals(this.bCreditcardclientAllowedagencypayment, creditcardclientRequest.bCreditcardclientAllowedagencypayment) &&
        Objects.equals(this.bCreditcardclientAllowedroyallepageprotection, creditcardclientRequest.bCreditcardclientAllowedroyallepageprotection) &&
        Objects.equals(this.bCreditcardclientAllowedtranquillit, creditcardclientRequest.bCreditcardclientAllowedtranquillit) &&
        Objects.equals(this.objCreditcarddetail, creditcardclientRequest.objCreditcarddetail) &&
        Objects.equals(this.sCreditcardclientCVV, creditcardclientRequest.sCreditcardclientCVV);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pkiCreditcardclientID, fksCreditcardtokenID, bCreditcardclientrelationIsdefault, sCreditcardclientDescription, bCreditcardclientIsactive, bCreditcardclientAllowedagencypayment, bCreditcardclientAllowedroyallepageprotection, bCreditcardclientAllowedtranquillit, objCreditcarddetail, sCreditcardclientCVV);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditcardclientRequest {\n");
    sb.append("    pkiCreditcardclientID: ").append(toIndentedString(pkiCreditcardclientID)).append("\n");
    sb.append("    fksCreditcardtokenID: ").append(toIndentedString(fksCreditcardtokenID)).append("\n");
    sb.append("    bCreditcardclientrelationIsdefault: ").append(toIndentedString(bCreditcardclientrelationIsdefault)).append("\n");
    sb.append("    sCreditcardclientDescription: ").append(toIndentedString(sCreditcardclientDescription)).append("\n");
    sb.append("    bCreditcardclientIsactive: ").append(toIndentedString(bCreditcardclientIsactive)).append("\n");
    sb.append("    bCreditcardclientAllowedagencypayment: ").append(toIndentedString(bCreditcardclientAllowedagencypayment)).append("\n");
    sb.append("    bCreditcardclientAllowedroyallepageprotection: ").append(toIndentedString(bCreditcardclientAllowedroyallepageprotection)).append("\n");
    sb.append("    bCreditcardclientAllowedtranquillit: ").append(toIndentedString(bCreditcardclientAllowedtranquillit)).append("\n");
    sb.append("    objCreditcarddetail: ").append(toIndentedString(objCreditcarddetail)).append("\n");
    sb.append("    sCreditcardclientCVV: ").append(toIndentedString(sCreditcardclientCVV)).append("\n");
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
    openapiFields.add("pkiCreditcardclientID");
    openapiFields.add("fksCreditcardtokenID");
    openapiFields.add("bCreditcardclientrelationIsdefault");
    openapiFields.add("sCreditcardclientDescription");
    openapiFields.add("bCreditcardclientIsactive");
    openapiFields.add("bCreditcardclientAllowedagencypayment");
    openapiFields.add("bCreditcardclientAllowedroyallepageprotection");
    openapiFields.add("bCreditcardclientAllowedtranquillit");
    openapiFields.add("objCreditcarddetail");
    openapiFields.add("sCreditcardclientCVV");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("bCreditcardclientrelationIsdefault");
    openapiRequiredFields.add("sCreditcardclientDescription");
    openapiRequiredFields.add("bCreditcardclientIsactive");
    openapiRequiredFields.add("bCreditcardclientAllowedagencypayment");
    openapiRequiredFields.add("bCreditcardclientAllowedroyallepageprotection");
    openapiRequiredFields.add("bCreditcardclientAllowedtranquillit");
    openapiRequiredFields.add("objCreditcarddetail");
    openapiRequiredFields.add("sCreditcardclientCVV");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreditcardclientRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreditcardclientRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreditcardclientRequest is not found in the empty JSON string", CreditcardclientRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreditcardclientRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreditcardclientRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreditcardclientRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("fksCreditcardtokenID") != null && !jsonObj.get("fksCreditcardtokenID").isJsonNull()) && !jsonObj.get("fksCreditcardtokenID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fksCreditcardtokenID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fksCreditcardtokenID").toString()));
      }
      if (!jsonObj.get("sCreditcardclientDescription").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sCreditcardclientDescription` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sCreditcardclientDescription").toString()));
      }
      // validate the required field `objCreditcarddetail`
      CreditcarddetailRequest.validateJsonElement(jsonObj.get("objCreditcarddetail"));
      if (!jsonObj.get("sCreditcardclientCVV").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sCreditcardclientCVV` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sCreditcardclientCVV").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreditcardclientRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreditcardclientRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreditcardclientRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreditcardclientRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreditcardclientRequest>() {
           @Override
           public void write(JsonWriter out, CreditcardclientRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreditcardclientRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreditcardclientRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreditcardclientRequest
  * @throws IOException if the JSON string is invalid with respect to CreditcardclientRequest
  */
  public static CreditcardclientRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreditcardclientRequest.class);
  }

 /**
  * Convert an instance of CreditcardclientRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
