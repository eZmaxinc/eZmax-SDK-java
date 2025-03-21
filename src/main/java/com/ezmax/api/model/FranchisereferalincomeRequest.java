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
 * An Franchisereferalincome Object
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-07T19:20:13.445471985Z[Etc/UTC]", comments = "Generator version: 7.12.0")
public class FranchisereferalincomeRequest {
  public static final String SERIALIZED_NAME_PKI_FRANCHISEREFERALINCOME_I_D = "pkiFranchisereferalincomeID";
  @SerializedName(SERIALIZED_NAME_PKI_FRANCHISEREFERALINCOME_I_D)
  @javax.annotation.Nullable
  private Integer pkiFranchisereferalincomeID;

  public static final String SERIALIZED_NAME_FKI_FRANCHISEBROKER_I_D = "fkiFranchisebrokerID";
  @SerializedName(SERIALIZED_NAME_FKI_FRANCHISEBROKER_I_D)
  @javax.annotation.Nonnull
  private Integer fkiFranchisebrokerID;

  public static final String SERIALIZED_NAME_FKI_FRANCHISEREFERALINCOMEPROGRAM_I_D = "fkiFranchisereferalincomeprogramID";
  @SerializedName(SERIALIZED_NAME_FKI_FRANCHISEREFERALINCOMEPROGRAM_I_D)
  @javax.annotation.Nonnull
  private Integer fkiFranchisereferalincomeprogramID;

  public static final String SERIALIZED_NAME_FKI_PERIOD_I_D = "fkiPeriodID";
  @SerializedName(SERIALIZED_NAME_FKI_PERIOD_I_D)
  @javax.annotation.Nonnull
  private Integer fkiPeriodID;

  public static final String SERIALIZED_NAME_D_FRANCHISEREFERALINCOME_LOAN = "dFranchisereferalincomeLoan";
  @SerializedName(SERIALIZED_NAME_D_FRANCHISEREFERALINCOME_LOAN)
  @javax.annotation.Nonnull
  private String dFranchisereferalincomeLoan;

  public static final String SERIALIZED_NAME_D_FRANCHISEREFERALINCOME_FRANCHISEAMOUNT = "dFranchisereferalincomeFranchiseamount";
  @SerializedName(SERIALIZED_NAME_D_FRANCHISEREFERALINCOME_FRANCHISEAMOUNT)
  @javax.annotation.Nonnull
  private String dFranchisereferalincomeFranchiseamount;

  public static final String SERIALIZED_NAME_D_FRANCHISEREFERALINCOME_FRANCHISORAMOUNT = "dFranchisereferalincomeFranchisoramount";
  @SerializedName(SERIALIZED_NAME_D_FRANCHISEREFERALINCOME_FRANCHISORAMOUNT)
  @javax.annotation.Nonnull
  private String dFranchisereferalincomeFranchisoramount;

  public static final String SERIALIZED_NAME_D_FRANCHISEREFERALINCOME_AGENTAMOUNT = "dFranchisereferalincomeAgentamount";
  @SerializedName(SERIALIZED_NAME_D_FRANCHISEREFERALINCOME_AGENTAMOUNT)
  @javax.annotation.Nonnull
  private String dFranchisereferalincomeAgentamount;

  public static final String SERIALIZED_NAME_DT_FRANCHISEREFERALINCOME_DISBURSED = "dtFranchisereferalincomeDisbursed";
  @SerializedName(SERIALIZED_NAME_DT_FRANCHISEREFERALINCOME_DISBURSED)
  @javax.annotation.Nonnull
  private String dtFranchisereferalincomeDisbursed;

  public static final String SERIALIZED_NAME_T_FRANCHISEREFERALINCOME_COMMENT = "tFranchisereferalincomeComment";
  @SerializedName(SERIALIZED_NAME_T_FRANCHISEREFERALINCOME_COMMENT)
  @javax.annotation.Nonnull
  private String tFranchisereferalincomeComment;

  public static final String SERIALIZED_NAME_FKI_FRANCHISEOFFICE_I_D = "fkiFranchiseofficeID";
  @SerializedName(SERIALIZED_NAME_FKI_FRANCHISEOFFICE_I_D)
  @javax.annotation.Nonnull
  private Integer fkiFranchiseofficeID;

  public static final String SERIALIZED_NAME_S_FRANCHISEREFERALINCOME_REMOTEID = "sFranchisereferalincomeRemoteid";
  @SerializedName(SERIALIZED_NAME_S_FRANCHISEREFERALINCOME_REMOTEID)
  @javax.annotation.Nonnull
  private String sFranchisereferalincomeRemoteid;

  public FranchisereferalincomeRequest() {
  }

  public FranchisereferalincomeRequest pkiFranchisereferalincomeID(@javax.annotation.Nullable Integer pkiFranchisereferalincomeID) {
    this.pkiFranchisereferalincomeID = pkiFranchisereferalincomeID;
    return this;
  }

  /**
   * The unique ID of the Franchisereferalincome
   * minimum: 0
   * @return pkiFranchisereferalincomeID
   */
  @javax.annotation.Nullable
  public Integer getPkiFranchisereferalincomeID() {
    return pkiFranchisereferalincomeID;
  }

  public void setPkiFranchisereferalincomeID(@javax.annotation.Nullable Integer pkiFranchisereferalincomeID) {
    this.pkiFranchisereferalincomeID = pkiFranchisereferalincomeID;
  }


  public FranchisereferalincomeRequest fkiFranchisebrokerID(@javax.annotation.Nonnull Integer fkiFranchisebrokerID) {
    this.fkiFranchisebrokerID = fkiFranchisebrokerID;
    return this;
  }

  /**
   * The unique ID of the Franchisebroker
   * minimum: 0
   * @return fkiFranchisebrokerID
   */
  @javax.annotation.Nonnull
  public Integer getFkiFranchisebrokerID() {
    return fkiFranchisebrokerID;
  }

  public void setFkiFranchisebrokerID(@javax.annotation.Nonnull Integer fkiFranchisebrokerID) {
    this.fkiFranchisebrokerID = fkiFranchisebrokerID;
  }


  public FranchisereferalincomeRequest fkiFranchisereferalincomeprogramID(@javax.annotation.Nonnull Integer fkiFranchisereferalincomeprogramID) {
    this.fkiFranchisereferalincomeprogramID = fkiFranchisereferalincomeprogramID;
    return this;
  }

  /**
   * The unique ID of the Franchisereferalincomeprogram
   * minimum: 0
   * @return fkiFranchisereferalincomeprogramID
   */
  @javax.annotation.Nonnull
  public Integer getFkiFranchisereferalincomeprogramID() {
    return fkiFranchisereferalincomeprogramID;
  }

  public void setFkiFranchisereferalincomeprogramID(@javax.annotation.Nonnull Integer fkiFranchisereferalincomeprogramID) {
    this.fkiFranchisereferalincomeprogramID = fkiFranchisereferalincomeprogramID;
  }


  public FranchisereferalincomeRequest fkiPeriodID(@javax.annotation.Nonnull Integer fkiPeriodID) {
    this.fkiPeriodID = fkiPeriodID;
    return this;
  }

  /**
   * The unique ID of the Period
   * minimum: 0
   * @return fkiPeriodID
   */
  @javax.annotation.Nonnull
  public Integer getFkiPeriodID() {
    return fkiPeriodID;
  }

  public void setFkiPeriodID(@javax.annotation.Nonnull Integer fkiPeriodID) {
    this.fkiPeriodID = fkiPeriodID;
  }


  public FranchisereferalincomeRequest dFranchisereferalincomeLoan(@javax.annotation.Nonnull String dFranchisereferalincomeLoan) {
    this.dFranchisereferalincomeLoan = dFranchisereferalincomeLoan;
    return this;
  }

  /**
   * The loan amount
   * @return dFranchisereferalincomeLoan
   */
  @javax.annotation.Nonnull
  public String getdFranchisereferalincomeLoan() {
    return dFranchisereferalincomeLoan;
  }

  public void setdFranchisereferalincomeLoan(@javax.annotation.Nonnull String dFranchisereferalincomeLoan) {
    this.dFranchisereferalincomeLoan = dFranchisereferalincomeLoan;
  }


  public FranchisereferalincomeRequest dFranchisereferalincomeFranchiseamount(@javax.annotation.Nonnull String dFranchisereferalincomeFranchiseamount) {
    this.dFranchisereferalincomeFranchiseamount = dFranchisereferalincomeFranchiseamount;
    return this;
  }

  /**
   * The amount that will be given to the franchise
   * @return dFranchisereferalincomeFranchiseamount
   */
  @javax.annotation.Nonnull
  public String getdFranchisereferalincomeFranchiseamount() {
    return dFranchisereferalincomeFranchiseamount;
  }

  public void setdFranchisereferalincomeFranchiseamount(@javax.annotation.Nonnull String dFranchisereferalincomeFranchiseamount) {
    this.dFranchisereferalincomeFranchiseamount = dFranchisereferalincomeFranchiseamount;
  }


  public FranchisereferalincomeRequest dFranchisereferalincomeFranchisoramount(@javax.annotation.Nonnull String dFranchisereferalincomeFranchisoramount) {
    this.dFranchisereferalincomeFranchisoramount = dFranchisereferalincomeFranchisoramount;
    return this;
  }

  /**
   * The amount that will be kept by the franchisor
   * @return dFranchisereferalincomeFranchisoramount
   */
  @javax.annotation.Nonnull
  public String getdFranchisereferalincomeFranchisoramount() {
    return dFranchisereferalincomeFranchisoramount;
  }

  public void setdFranchisereferalincomeFranchisoramount(@javax.annotation.Nonnull String dFranchisereferalincomeFranchisoramount) {
    this.dFranchisereferalincomeFranchisoramount = dFranchisereferalincomeFranchisoramount;
  }


  public FranchisereferalincomeRequest dFranchisereferalincomeAgentamount(@javax.annotation.Nonnull String dFranchisereferalincomeAgentamount) {
    this.dFranchisereferalincomeAgentamount = dFranchisereferalincomeAgentamount;
    return this;
  }

  /**
   * The amount that will be given to the agent
   * @return dFranchisereferalincomeAgentamount
   */
  @javax.annotation.Nonnull
  public String getdFranchisereferalincomeAgentamount() {
    return dFranchisereferalincomeAgentamount;
  }

  public void setdFranchisereferalincomeAgentamount(@javax.annotation.Nonnull String dFranchisereferalincomeAgentamount) {
    this.dFranchisereferalincomeAgentamount = dFranchisereferalincomeAgentamount;
  }


  public FranchisereferalincomeRequest dtFranchisereferalincomeDisbursed(@javax.annotation.Nonnull String dtFranchisereferalincomeDisbursed) {
    this.dtFranchisereferalincomeDisbursed = dtFranchisereferalincomeDisbursed;
    return this;
  }

  /**
   * The date the amounts were disbursed
   * @return dtFranchisereferalincomeDisbursed
   */
  @javax.annotation.Nonnull
  public String getDtFranchisereferalincomeDisbursed() {
    return dtFranchisereferalincomeDisbursed;
  }

  public void setDtFranchisereferalincomeDisbursed(@javax.annotation.Nonnull String dtFranchisereferalincomeDisbursed) {
    this.dtFranchisereferalincomeDisbursed = dtFranchisereferalincomeDisbursed;
  }


  public FranchisereferalincomeRequest tFranchisereferalincomeComment(@javax.annotation.Nonnull String tFranchisereferalincomeComment) {
    this.tFranchisereferalincomeComment = tFranchisereferalincomeComment;
    return this;
  }

  /**
   * Comment about the transaction
   * @return tFranchisereferalincomeComment
   */
  @javax.annotation.Nonnull
  public String gettFranchisereferalincomeComment() {
    return tFranchisereferalincomeComment;
  }

  public void settFranchisereferalincomeComment(@javax.annotation.Nonnull String tFranchisereferalincomeComment) {
    this.tFranchisereferalincomeComment = tFranchisereferalincomeComment;
  }


  public FranchisereferalincomeRequest fkiFranchiseofficeID(@javax.annotation.Nonnull Integer fkiFranchiseofficeID) {
    this.fkiFranchiseofficeID = fkiFranchiseofficeID;
    return this;
  }

  /**
   * The unique ID of the Franchisereoffice
   * minimum: 0
   * @return fkiFranchiseofficeID
   */
  @javax.annotation.Nonnull
  public Integer getFkiFranchiseofficeID() {
    return fkiFranchiseofficeID;
  }

  public void setFkiFranchiseofficeID(@javax.annotation.Nonnull Integer fkiFranchiseofficeID) {
    this.fkiFranchiseofficeID = fkiFranchiseofficeID;
  }


  public FranchisereferalincomeRequest sFranchisereferalincomeRemoteid(@javax.annotation.Nonnull String sFranchisereferalincomeRemoteid) {
    this.sFranchisereferalincomeRemoteid = sFranchisereferalincomeRemoteid;
    return this;
  }

  /**
   * 
   * @return sFranchisereferalincomeRemoteid
   */
  @javax.annotation.Nonnull
  public String getsFranchisereferalincomeRemoteid() {
    return sFranchisereferalincomeRemoteid;
  }

  public void setsFranchisereferalincomeRemoteid(@javax.annotation.Nonnull String sFranchisereferalincomeRemoteid) {
    this.sFranchisereferalincomeRemoteid = sFranchisereferalincomeRemoteid;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FranchisereferalincomeRequest franchisereferalincomeRequest = (FranchisereferalincomeRequest) o;
    return Objects.equals(this.pkiFranchisereferalincomeID, franchisereferalincomeRequest.pkiFranchisereferalincomeID) &&
        Objects.equals(this.fkiFranchisebrokerID, franchisereferalincomeRequest.fkiFranchisebrokerID) &&
        Objects.equals(this.fkiFranchisereferalincomeprogramID, franchisereferalincomeRequest.fkiFranchisereferalincomeprogramID) &&
        Objects.equals(this.fkiPeriodID, franchisereferalincomeRequest.fkiPeriodID) &&
        Objects.equals(this.dFranchisereferalincomeLoan, franchisereferalincomeRequest.dFranchisereferalincomeLoan) &&
        Objects.equals(this.dFranchisereferalincomeFranchiseamount, franchisereferalincomeRequest.dFranchisereferalincomeFranchiseamount) &&
        Objects.equals(this.dFranchisereferalincomeFranchisoramount, franchisereferalincomeRequest.dFranchisereferalincomeFranchisoramount) &&
        Objects.equals(this.dFranchisereferalincomeAgentamount, franchisereferalincomeRequest.dFranchisereferalincomeAgentamount) &&
        Objects.equals(this.dtFranchisereferalincomeDisbursed, franchisereferalincomeRequest.dtFranchisereferalincomeDisbursed) &&
        Objects.equals(this.tFranchisereferalincomeComment, franchisereferalincomeRequest.tFranchisereferalincomeComment) &&
        Objects.equals(this.fkiFranchiseofficeID, franchisereferalincomeRequest.fkiFranchiseofficeID) &&
        Objects.equals(this.sFranchisereferalincomeRemoteid, franchisereferalincomeRequest.sFranchisereferalincomeRemoteid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pkiFranchisereferalincomeID, fkiFranchisebrokerID, fkiFranchisereferalincomeprogramID, fkiPeriodID, dFranchisereferalincomeLoan, dFranchisereferalincomeFranchiseamount, dFranchisereferalincomeFranchisoramount, dFranchisereferalincomeAgentamount, dtFranchisereferalincomeDisbursed, tFranchisereferalincomeComment, fkiFranchiseofficeID, sFranchisereferalincomeRemoteid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FranchisereferalincomeRequest {\n");
    sb.append("    pkiFranchisereferalincomeID: ").append(toIndentedString(pkiFranchisereferalincomeID)).append("\n");
    sb.append("    fkiFranchisebrokerID: ").append(toIndentedString(fkiFranchisebrokerID)).append("\n");
    sb.append("    fkiFranchisereferalincomeprogramID: ").append(toIndentedString(fkiFranchisereferalincomeprogramID)).append("\n");
    sb.append("    fkiPeriodID: ").append(toIndentedString(fkiPeriodID)).append("\n");
    sb.append("    dFranchisereferalincomeLoan: ").append(toIndentedString(dFranchisereferalincomeLoan)).append("\n");
    sb.append("    dFranchisereferalincomeFranchiseamount: ").append(toIndentedString(dFranchisereferalincomeFranchiseamount)).append("\n");
    sb.append("    dFranchisereferalincomeFranchisoramount: ").append(toIndentedString(dFranchisereferalincomeFranchisoramount)).append("\n");
    sb.append("    dFranchisereferalincomeAgentamount: ").append(toIndentedString(dFranchisereferalincomeAgentamount)).append("\n");
    sb.append("    dtFranchisereferalincomeDisbursed: ").append(toIndentedString(dtFranchisereferalincomeDisbursed)).append("\n");
    sb.append("    tFranchisereferalincomeComment: ").append(toIndentedString(tFranchisereferalincomeComment)).append("\n");
    sb.append("    fkiFranchiseofficeID: ").append(toIndentedString(fkiFranchiseofficeID)).append("\n");
    sb.append("    sFranchisereferalincomeRemoteid: ").append(toIndentedString(sFranchisereferalincomeRemoteid)).append("\n");
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
    openapiFields.add("pkiFranchisereferalincomeID");
    openapiFields.add("fkiFranchisebrokerID");
    openapiFields.add("fkiFranchisereferalincomeprogramID");
    openapiFields.add("fkiPeriodID");
    openapiFields.add("dFranchisereferalincomeLoan");
    openapiFields.add("dFranchisereferalincomeFranchiseamount");
    openapiFields.add("dFranchisereferalincomeFranchisoramount");
    openapiFields.add("dFranchisereferalincomeAgentamount");
    openapiFields.add("dtFranchisereferalincomeDisbursed");
    openapiFields.add("tFranchisereferalincomeComment");
    openapiFields.add("fkiFranchiseofficeID");
    openapiFields.add("sFranchisereferalincomeRemoteid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("fkiFranchisebrokerID");
    openapiRequiredFields.add("fkiFranchisereferalincomeprogramID");
    openapiRequiredFields.add("fkiPeriodID");
    openapiRequiredFields.add("dFranchisereferalincomeLoan");
    openapiRequiredFields.add("dFranchisereferalincomeFranchiseamount");
    openapiRequiredFields.add("dFranchisereferalincomeFranchisoramount");
    openapiRequiredFields.add("dFranchisereferalincomeAgentamount");
    openapiRequiredFields.add("dtFranchisereferalincomeDisbursed");
    openapiRequiredFields.add("tFranchisereferalincomeComment");
    openapiRequiredFields.add("fkiFranchiseofficeID");
    openapiRequiredFields.add("sFranchisereferalincomeRemoteid");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to FranchisereferalincomeRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!FranchisereferalincomeRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FranchisereferalincomeRequest is not found in the empty JSON string", FranchisereferalincomeRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!FranchisereferalincomeRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FranchisereferalincomeRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : FranchisereferalincomeRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("dFranchisereferalincomeLoan").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dFranchisereferalincomeLoan` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dFranchisereferalincomeLoan").toString()));
      }
      if (!jsonObj.get("dFranchisereferalincomeFranchiseamount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dFranchisereferalincomeFranchiseamount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dFranchisereferalincomeFranchiseamount").toString()));
      }
      if (!jsonObj.get("dFranchisereferalincomeFranchisoramount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dFranchisereferalincomeFranchisoramount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dFranchisereferalincomeFranchisoramount").toString()));
      }
      if (!jsonObj.get("dFranchisereferalincomeAgentamount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dFranchisereferalincomeAgentamount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dFranchisereferalincomeAgentamount").toString()));
      }
      if (!jsonObj.get("dtFranchisereferalincomeDisbursed").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dtFranchisereferalincomeDisbursed` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dtFranchisereferalincomeDisbursed").toString()));
      }
      if (!jsonObj.get("tFranchisereferalincomeComment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tFranchisereferalincomeComment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tFranchisereferalincomeComment").toString()));
      }
      if (!jsonObj.get("sFranchisereferalincomeRemoteid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sFranchisereferalincomeRemoteid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sFranchisereferalincomeRemoteid").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FranchisereferalincomeRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FranchisereferalincomeRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FranchisereferalincomeRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FranchisereferalincomeRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<FranchisereferalincomeRequest>() {
           @Override
           public void write(JsonWriter out, FranchisereferalincomeRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FranchisereferalincomeRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of FranchisereferalincomeRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of FranchisereferalincomeRequest
   * @throws IOException if the JSON string is invalid with respect to FranchisereferalincomeRequest
   */
  public static FranchisereferalincomeRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FranchisereferalincomeRequest.class);
  }

  /**
   * Convert an instance of FranchisereferalincomeRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

