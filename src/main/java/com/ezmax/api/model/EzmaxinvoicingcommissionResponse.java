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
 * A Ezmaxinvoicingcommission Object
 */
@ApiModel(description = "A Ezmaxinvoicingcommission Object")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-10T15:21:40.493145Z[Etc/UTC]")
public class EzmaxinvoicingcommissionResponse {
  public static final String SERIALIZED_NAME_PKI_EZMAXINVOICINGCOMMISSION_I_D = "pkiEzmaxinvoicingcommissionID";
  @SerializedName(SERIALIZED_NAME_PKI_EZMAXINVOICINGCOMMISSION_I_D)
  private Integer pkiEzmaxinvoicingcommissionID;

  public static final String SERIALIZED_NAME_FKI_EZMAXINVOICINGSUMMARYGLOBAL_I_D = "fkiEzmaxinvoicingsummaryglobalID";
  @SerializedName(SERIALIZED_NAME_FKI_EZMAXINVOICINGSUMMARYGLOBAL_I_D)
  private Integer fkiEzmaxinvoicingsummaryglobalID;

  public static final String SERIALIZED_NAME_FKI_EZMAXPARTNER_I_D = "fkiEzmaxpartnerID";
  @SerializedName(SERIALIZED_NAME_FKI_EZMAXPARTNER_I_D)
  private Integer fkiEzmaxpartnerID;

  public static final String SERIALIZED_NAME_FKI_EZMAXREPRESENTATIVE_I_D = "fkiEzmaxrepresentativeID";
  @SerializedName(SERIALIZED_NAME_FKI_EZMAXREPRESENTATIVE_I_D)
  private Integer fkiEzmaxrepresentativeID;

  public static final String SERIALIZED_NAME_DT_EZMAXINVOICINGCOMMISSION_START = "dtEzmaxinvoicingcommissionStart";
  @SerializedName(SERIALIZED_NAME_DT_EZMAXINVOICINGCOMMISSION_START)
  private String dtEzmaxinvoicingcommissionStart;

  public static final String SERIALIZED_NAME_DT_EZMAXINVOICINGCOMMISSION_END = "dtEzmaxinvoicingcommissionEnd";
  @SerializedName(SERIALIZED_NAME_DT_EZMAXINVOICINGCOMMISSION_END)
  private String dtEzmaxinvoicingcommissionEnd;

  public static final String SERIALIZED_NAME_I_EZMAXINVOICINGCOMMISSION_DAYS = "iEzmaxinvoicingcommissionDays";
  @SerializedName(SERIALIZED_NAME_I_EZMAXINVOICINGCOMMISSION_DAYS)
  private Integer iEzmaxinvoicingcommissionDays;

  public static final String SERIALIZED_NAME_D_EZMAXINVOICINGCOMMISSION_AMOUNT = "dEzmaxinvoicingcommissionAmount";
  @SerializedName(SERIALIZED_NAME_D_EZMAXINVOICINGCOMMISSION_AMOUNT)
  private String dEzmaxinvoicingcommissionAmount;

  public EzmaxinvoicingcommissionResponse() { 
  }

  public EzmaxinvoicingcommissionResponse pkiEzmaxinvoicingcommissionID(Integer pkiEzmaxinvoicingcommissionID) {
    
    this.pkiEzmaxinvoicingcommissionID = pkiEzmaxinvoicingcommissionID;
    return this;
  }

   /**
   * The unique ID of the Ezmaxinvoicingcommission
   * @return pkiEzmaxinvoicingcommissionID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "36", value = "The unique ID of the Ezmaxinvoicingcommission")

  public Integer getPkiEzmaxinvoicingcommissionID() {
    return pkiEzmaxinvoicingcommissionID;
  }


  public void setPkiEzmaxinvoicingcommissionID(Integer pkiEzmaxinvoicingcommissionID) {
    this.pkiEzmaxinvoicingcommissionID = pkiEzmaxinvoicingcommissionID;
  }


  public EzmaxinvoicingcommissionResponse fkiEzmaxinvoicingsummaryglobalID(Integer fkiEzmaxinvoicingsummaryglobalID) {
    
    this.fkiEzmaxinvoicingsummaryglobalID = fkiEzmaxinvoicingsummaryglobalID;
    return this;
  }

   /**
   * The unique ID of the Ezmaxinvoicingsummaryglobal
   * minimum: 0
   * @return fkiEzmaxinvoicingsummaryglobalID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "241", value = "The unique ID of the Ezmaxinvoicingsummaryglobal")

  public Integer getFkiEzmaxinvoicingsummaryglobalID() {
    return fkiEzmaxinvoicingsummaryglobalID;
  }


  public void setFkiEzmaxinvoicingsummaryglobalID(Integer fkiEzmaxinvoicingsummaryglobalID) {
    this.fkiEzmaxinvoicingsummaryglobalID = fkiEzmaxinvoicingsummaryglobalID;
  }


  public EzmaxinvoicingcommissionResponse fkiEzmaxpartnerID(Integer fkiEzmaxpartnerID) {
    
    this.fkiEzmaxpartnerID = fkiEzmaxpartnerID;
    return this;
  }

   /**
   * The unique ID of the Ezmaxpartner
   * minimum: 1
   * @return fkiEzmaxpartnerID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "12", value = "The unique ID of the Ezmaxpartner")

  public Integer getFkiEzmaxpartnerID() {
    return fkiEzmaxpartnerID;
  }


  public void setFkiEzmaxpartnerID(Integer fkiEzmaxpartnerID) {
    this.fkiEzmaxpartnerID = fkiEzmaxpartnerID;
  }


  public EzmaxinvoicingcommissionResponse fkiEzmaxrepresentativeID(Integer fkiEzmaxrepresentativeID) {
    
    this.fkiEzmaxrepresentativeID = fkiEzmaxrepresentativeID;
    return this;
  }

   /**
   * The unique ID of the Ezmaxrepresentative
   * minimum: 1
   * @return fkiEzmaxrepresentativeID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "21", value = "The unique ID of the Ezmaxrepresentative")

  public Integer getFkiEzmaxrepresentativeID() {
    return fkiEzmaxrepresentativeID;
  }


  public void setFkiEzmaxrepresentativeID(Integer fkiEzmaxrepresentativeID) {
    this.fkiEzmaxrepresentativeID = fkiEzmaxrepresentativeID;
  }


  public EzmaxinvoicingcommissionResponse dtEzmaxinvoicingcommissionStart(String dtEzmaxinvoicingcommissionStart) {
    
    this.dtEzmaxinvoicingcommissionStart = dtEzmaxinvoicingcommissionStart;
    return this;
  }

   /**
   * The start date for the Ezmaxinvoicingcommission
   * @return dtEzmaxinvoicingcommissionStart
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2020-12-31", required = true, value = "The start date for the Ezmaxinvoicingcommission")

  public String getDtEzmaxinvoicingcommissionStart() {
    return dtEzmaxinvoicingcommissionStart;
  }


  public void setDtEzmaxinvoicingcommissionStart(String dtEzmaxinvoicingcommissionStart) {
    this.dtEzmaxinvoicingcommissionStart = dtEzmaxinvoicingcommissionStart;
  }


  public EzmaxinvoicingcommissionResponse dtEzmaxinvoicingcommissionEnd(String dtEzmaxinvoicingcommissionEnd) {
    
    this.dtEzmaxinvoicingcommissionEnd = dtEzmaxinvoicingcommissionEnd;
    return this;
  }

   /**
   * The end date for the Ezmaxinvoicingcommission
   * @return dtEzmaxinvoicingcommissionEnd
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2020-12-31", required = true, value = "The end date for the Ezmaxinvoicingcommission")

  public String getDtEzmaxinvoicingcommissionEnd() {
    return dtEzmaxinvoicingcommissionEnd;
  }


  public void setDtEzmaxinvoicingcommissionEnd(String dtEzmaxinvoicingcommissionEnd) {
    this.dtEzmaxinvoicingcommissionEnd = dtEzmaxinvoicingcommissionEnd;
  }


  public EzmaxinvoicingcommissionResponse iEzmaxinvoicingcommissionDays(Integer iEzmaxinvoicingcommissionDays) {
    
    this.iEzmaxinvoicingcommissionDays = iEzmaxinvoicingcommissionDays;
    return this;
  }

   /**
   * This is the number of days during the month on which the Ezmaxinvoigcommission applies
   * minimum: 0
   * @return iEzmaxinvoicingcommissionDays
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "30", required = true, value = "This is the number of days during the month on which the Ezmaxinvoigcommission applies")

  public Integer getiEzmaxinvoicingcommissionDays() {
    return iEzmaxinvoicingcommissionDays;
  }


  public void setiEzmaxinvoicingcommissionDays(Integer iEzmaxinvoicingcommissionDays) {
    this.iEzmaxinvoicingcommissionDays = iEzmaxinvoicingcommissionDays;
  }


  public EzmaxinvoicingcommissionResponse dEzmaxinvoicingcommissionAmount(String dEzmaxinvoicingcommissionAmount) {
    
    this.dEzmaxinvoicingcommissionAmount = dEzmaxinvoicingcommissionAmount;
    return this;
  }

   /**
   * The amount of Ezmaxinvoicingcommission
   * @return dEzmaxinvoicingcommissionAmount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "450.34", required = true, value = "The amount of Ezmaxinvoicingcommission")

  public String getdEzmaxinvoicingcommissionAmount() {
    return dEzmaxinvoicingcommissionAmount;
  }


  public void setdEzmaxinvoicingcommissionAmount(String dEzmaxinvoicingcommissionAmount) {
    this.dEzmaxinvoicingcommissionAmount = dEzmaxinvoicingcommissionAmount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzmaxinvoicingcommissionResponse ezmaxinvoicingcommissionResponse = (EzmaxinvoicingcommissionResponse) o;
    return Objects.equals(this.pkiEzmaxinvoicingcommissionID, ezmaxinvoicingcommissionResponse.pkiEzmaxinvoicingcommissionID) &&
        Objects.equals(this.fkiEzmaxinvoicingsummaryglobalID, ezmaxinvoicingcommissionResponse.fkiEzmaxinvoicingsummaryglobalID) &&
        Objects.equals(this.fkiEzmaxpartnerID, ezmaxinvoicingcommissionResponse.fkiEzmaxpartnerID) &&
        Objects.equals(this.fkiEzmaxrepresentativeID, ezmaxinvoicingcommissionResponse.fkiEzmaxrepresentativeID) &&
        Objects.equals(this.dtEzmaxinvoicingcommissionStart, ezmaxinvoicingcommissionResponse.dtEzmaxinvoicingcommissionStart) &&
        Objects.equals(this.dtEzmaxinvoicingcommissionEnd, ezmaxinvoicingcommissionResponse.dtEzmaxinvoicingcommissionEnd) &&
        Objects.equals(this.iEzmaxinvoicingcommissionDays, ezmaxinvoicingcommissionResponse.iEzmaxinvoicingcommissionDays) &&
        Objects.equals(this.dEzmaxinvoicingcommissionAmount, ezmaxinvoicingcommissionResponse.dEzmaxinvoicingcommissionAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pkiEzmaxinvoicingcommissionID, fkiEzmaxinvoicingsummaryglobalID, fkiEzmaxpartnerID, fkiEzmaxrepresentativeID, dtEzmaxinvoicingcommissionStart, dtEzmaxinvoicingcommissionEnd, iEzmaxinvoicingcommissionDays, dEzmaxinvoicingcommissionAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzmaxinvoicingcommissionResponse {\n");
    sb.append("    pkiEzmaxinvoicingcommissionID: ").append(toIndentedString(pkiEzmaxinvoicingcommissionID)).append("\n");
    sb.append("    fkiEzmaxinvoicingsummaryglobalID: ").append(toIndentedString(fkiEzmaxinvoicingsummaryglobalID)).append("\n");
    sb.append("    fkiEzmaxpartnerID: ").append(toIndentedString(fkiEzmaxpartnerID)).append("\n");
    sb.append("    fkiEzmaxrepresentativeID: ").append(toIndentedString(fkiEzmaxrepresentativeID)).append("\n");
    sb.append("    dtEzmaxinvoicingcommissionStart: ").append(toIndentedString(dtEzmaxinvoicingcommissionStart)).append("\n");
    sb.append("    dtEzmaxinvoicingcommissionEnd: ").append(toIndentedString(dtEzmaxinvoicingcommissionEnd)).append("\n");
    sb.append("    iEzmaxinvoicingcommissionDays: ").append(toIndentedString(iEzmaxinvoicingcommissionDays)).append("\n");
    sb.append("    dEzmaxinvoicingcommissionAmount: ").append(toIndentedString(dEzmaxinvoicingcommissionAmount)).append("\n");
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
    openapiFields.add("pkiEzmaxinvoicingcommissionID");
    openapiFields.add("fkiEzmaxinvoicingsummaryglobalID");
    openapiFields.add("fkiEzmaxpartnerID");
    openapiFields.add("fkiEzmaxrepresentativeID");
    openapiFields.add("dtEzmaxinvoicingcommissionStart");
    openapiFields.add("dtEzmaxinvoicingcommissionEnd");
    openapiFields.add("iEzmaxinvoicingcommissionDays");
    openapiFields.add("dEzmaxinvoicingcommissionAmount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("dtEzmaxinvoicingcommissionStart");
    openapiRequiredFields.add("dtEzmaxinvoicingcommissionEnd");
    openapiRequiredFields.add("iEzmaxinvoicingcommissionDays");
    openapiRequiredFields.add("dEzmaxinvoicingcommissionAmount");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EzmaxinvoicingcommissionResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (EzmaxinvoicingcommissionResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in EzmaxinvoicingcommissionResponse is not found in the empty JSON string", EzmaxinvoicingcommissionResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!EzmaxinvoicingcommissionResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EzmaxinvoicingcommissionResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EzmaxinvoicingcommissionResponse.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("dtEzmaxinvoicingcommissionStart") != null && !jsonObj.get("dtEzmaxinvoicingcommissionStart").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dtEzmaxinvoicingcommissionStart` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dtEzmaxinvoicingcommissionStart").toString()));
      }
      if (jsonObj.get("dtEzmaxinvoicingcommissionEnd") != null && !jsonObj.get("dtEzmaxinvoicingcommissionEnd").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dtEzmaxinvoicingcommissionEnd` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dtEzmaxinvoicingcommissionEnd").toString()));
      }
      if (jsonObj.get("dEzmaxinvoicingcommissionAmount") != null && !jsonObj.get("dEzmaxinvoicingcommissionAmount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dEzmaxinvoicingcommissionAmount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dEzmaxinvoicingcommissionAmount").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EzmaxinvoicingcommissionResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EzmaxinvoicingcommissionResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EzmaxinvoicingcommissionResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EzmaxinvoicingcommissionResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<EzmaxinvoicingcommissionResponse>() {
           @Override
           public void write(JsonWriter out, EzmaxinvoicingcommissionResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EzmaxinvoicingcommissionResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EzmaxinvoicingcommissionResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EzmaxinvoicingcommissionResponse
  * @throws IOException if the JSON string is invalid with respect to EzmaxinvoicingcommissionResponse
  */
  public static EzmaxinvoicingcommissionResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EzmaxinvoicingcommissionResponse.class);
  }

 /**
  * Convert an instance of EzmaxinvoicingcommissionResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
