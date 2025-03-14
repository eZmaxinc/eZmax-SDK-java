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
 * A Activesession List Element
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-07T19:20:13.445471985Z[Etc/UTC]", comments = "Generator version: 7.12.0")
public class ActivesessionListElement {
  public static final String SERIALIZED_NAME_PKI_ACTIVESESSION_I_D = "pkiActivesessionID";
  @SerializedName(SERIALIZED_NAME_PKI_ACTIVESESSION_I_D)
  @javax.annotation.Nonnull
  private Integer pkiActivesessionID;

  public static final String SERIALIZED_NAME_FKI_USER_I_D = "fkiUserID";
  @SerializedName(SERIALIZED_NAME_FKI_USER_I_D)
  @javax.annotation.Nonnull
  private Integer fkiUserID;

  public static final String SERIALIZED_NAME_FKI_COMPUTER_I_D = "fkiComputerID";
  @SerializedName(SERIALIZED_NAME_FKI_COMPUTER_I_D)
  @javax.annotation.Nonnull
  private Integer fkiComputerID;

  public static final String SERIALIZED_NAME_FKI_COMPANY_I_D = "fkiCompanyID";
  @SerializedName(SERIALIZED_NAME_FKI_COMPANY_I_D)
  @javax.annotation.Nonnull
  private Integer fkiCompanyID;

  public static final String SERIALIZED_NAME_FKI_DEPARTMENT_I_D = "fkiDepartmentID";
  @SerializedName(SERIALIZED_NAME_FKI_DEPARTMENT_I_D)
  @javax.annotation.Nonnull
  private Integer fkiDepartmentID;

  public static final String SERIALIZED_NAME_S_COMPANY_NAME_X = "sCompanyNameX";
  @SerializedName(SERIALIZED_NAME_S_COMPANY_NAME_X)
  @javax.annotation.Nonnull
  private String sCompanyNameX;

  public static final String SERIALIZED_NAME_S_DEPARTMENT_NAME_X = "sDepartmentNameX";
  @SerializedName(SERIALIZED_NAME_S_DEPARTMENT_NAME_X)
  @javax.annotation.Nonnull
  private String sDepartmentNameX;

  public static final String SERIALIZED_NAME_S_ACTIVESESSION_LOGINNAME = "sActivesessionLoginname";
  @SerializedName(SERIALIZED_NAME_S_ACTIVESESSION_LOGINNAME)
  @javax.annotation.Nonnull
  private String sActivesessionLoginname;

  public static final String SERIALIZED_NAME_S_COMPUTER_DESCRIPTION = "sComputerDescription";
  @SerializedName(SERIALIZED_NAME_S_COMPUTER_DESCRIPTION)
  @javax.annotation.Nonnull
  private String sComputerDescription;

  public static final String SERIALIZED_NAME_DT_ACTIVESESSION_FIRSTHIT = "dtActivesessionFirsthit";
  @SerializedName(SERIALIZED_NAME_DT_ACTIVESESSION_FIRSTHIT)
  @javax.annotation.Nonnull
  private String dtActivesessionFirsthit;

  public static final String SERIALIZED_NAME_DT_ACTIVESESSION_LASTHIT = "dtActivesessionLasthit";
  @SerializedName(SERIALIZED_NAME_DT_ACTIVESESSION_LASTHIT)
  @javax.annotation.Nonnull
  private String dtActivesessionLasthit;

  public static final String SERIALIZED_NAME_S_ACTIVESESSION_I_P = "sActivesessionIP";
  @SerializedName(SERIALIZED_NAME_S_ACTIVESESSION_I_P)
  @javax.annotation.Nonnull
  private String sActivesessionIP;

  public ActivesessionListElement() {
  }

  public ActivesessionListElement pkiActivesessionID(@javax.annotation.Nonnull Integer pkiActivesessionID) {
    this.pkiActivesessionID = pkiActivesessionID;
    return this;
  }

  /**
   * The unique ID of the Activesession
   * @return pkiActivesessionID
   */
  @javax.annotation.Nonnull
  public Integer getPkiActivesessionID() {
    return pkiActivesessionID;
  }

  public void setPkiActivesessionID(@javax.annotation.Nonnull Integer pkiActivesessionID) {
    this.pkiActivesessionID = pkiActivesessionID;
  }


  public ActivesessionListElement fkiUserID(@javax.annotation.Nonnull Integer fkiUserID) {
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


  public ActivesessionListElement fkiComputerID(@javax.annotation.Nonnull Integer fkiComputerID) {
    this.fkiComputerID = fkiComputerID;
    return this;
  }

  /**
   * The unique ID of the Computer
   * minimum: 1
   * maximum: 65535
   * @return fkiComputerID
   */
  @javax.annotation.Nonnull
  public Integer getFkiComputerID() {
    return fkiComputerID;
  }

  public void setFkiComputerID(@javax.annotation.Nonnull Integer fkiComputerID) {
    this.fkiComputerID = fkiComputerID;
  }


  public ActivesessionListElement fkiCompanyID(@javax.annotation.Nonnull Integer fkiCompanyID) {
    this.fkiCompanyID = fkiCompanyID;
    return this;
  }

  /**
   * The unique ID of the Company
   * minimum: 1
   * maximum: 255
   * @return fkiCompanyID
   */
  @javax.annotation.Nonnull
  public Integer getFkiCompanyID() {
    return fkiCompanyID;
  }

  public void setFkiCompanyID(@javax.annotation.Nonnull Integer fkiCompanyID) {
    this.fkiCompanyID = fkiCompanyID;
  }


  public ActivesessionListElement fkiDepartmentID(@javax.annotation.Nonnull Integer fkiDepartmentID) {
    this.fkiDepartmentID = fkiDepartmentID;
    return this;
  }

  /**
   * The unique ID of the Department
   * minimum: 0
   * @return fkiDepartmentID
   */
  @javax.annotation.Nonnull
  public Integer getFkiDepartmentID() {
    return fkiDepartmentID;
  }

  public void setFkiDepartmentID(@javax.annotation.Nonnull Integer fkiDepartmentID) {
    this.fkiDepartmentID = fkiDepartmentID;
  }


  public ActivesessionListElement sCompanyNameX(@javax.annotation.Nonnull String sCompanyNameX) {
    this.sCompanyNameX = sCompanyNameX;
    return this;
  }

  /**
   * The Name of the Company in the language of the requester
   * @return sCompanyNameX
   */
  @javax.annotation.Nonnull
  public String getsCompanyNameX() {
    return sCompanyNameX;
  }

  public void setsCompanyNameX(@javax.annotation.Nonnull String sCompanyNameX) {
    this.sCompanyNameX = sCompanyNameX;
  }


  public ActivesessionListElement sDepartmentNameX(@javax.annotation.Nonnull String sDepartmentNameX) {
    this.sDepartmentNameX = sDepartmentNameX;
    return this;
  }

  /**
   * The Name of the Department in the language of the requester
   * @return sDepartmentNameX
   */
  @javax.annotation.Nonnull
  public String getsDepartmentNameX() {
    return sDepartmentNameX;
  }

  public void setsDepartmentNameX(@javax.annotation.Nonnull String sDepartmentNameX) {
    this.sDepartmentNameX = sDepartmentNameX;
  }


  public ActivesessionListElement sActivesessionLoginname(@javax.annotation.Nonnull String sActivesessionLoginname) {
    this.sActivesessionLoginname = sActivesessionLoginname;
    return this;
  }

  /**
   * The loginname of the Activesession
   * @return sActivesessionLoginname
   */
  @javax.annotation.Nonnull
  public String getsActivesessionLoginname() {
    return sActivesessionLoginname;
  }

  public void setsActivesessionLoginname(@javax.annotation.Nonnull String sActivesessionLoginname) {
    this.sActivesessionLoginname = sActivesessionLoginname;
  }


  public ActivesessionListElement sComputerDescription(@javax.annotation.Nonnull String sComputerDescription) {
    this.sComputerDescription = sComputerDescription;
    return this;
  }

  /**
   * The description of the Computer
   * @return sComputerDescription
   */
  @javax.annotation.Nonnull
  public String getsComputerDescription() {
    return sComputerDescription;
  }

  public void setsComputerDescription(@javax.annotation.Nonnull String sComputerDescription) {
    this.sComputerDescription = sComputerDescription;
  }


  public ActivesessionListElement dtActivesessionFirsthit(@javax.annotation.Nonnull String dtActivesessionFirsthit) {
    this.dtActivesessionFirsthit = dtActivesessionFirsthit;
    return this;
  }

  /**
   * The first hit of the Activesession
   * @return dtActivesessionFirsthit
   */
  @javax.annotation.Nonnull
  public String getDtActivesessionFirsthit() {
    return dtActivesessionFirsthit;
  }

  public void setDtActivesessionFirsthit(@javax.annotation.Nonnull String dtActivesessionFirsthit) {
    this.dtActivesessionFirsthit = dtActivesessionFirsthit;
  }


  public ActivesessionListElement dtActivesessionLasthit(@javax.annotation.Nonnull String dtActivesessionLasthit) {
    this.dtActivesessionLasthit = dtActivesessionLasthit;
    return this;
  }

  /**
   * The last hit of the Activesession
   * @return dtActivesessionLasthit
   */
  @javax.annotation.Nonnull
  public String getDtActivesessionLasthit() {
    return dtActivesessionLasthit;
  }

  public void setDtActivesessionLasthit(@javax.annotation.Nonnull String dtActivesessionLasthit) {
    this.dtActivesessionLasthit = dtActivesessionLasthit;
  }


  public ActivesessionListElement sActivesessionIP(@javax.annotation.Nonnull String sActivesessionIP) {
    this.sActivesessionIP = sActivesessionIP;
    return this;
  }

  /**
   * Represent an IP address.
   * @return sActivesessionIP
   */
  @javax.annotation.Nonnull
  public String getsActivesessionIP() {
    return sActivesessionIP;
  }

  public void setsActivesessionIP(@javax.annotation.Nonnull String sActivesessionIP) {
    this.sActivesessionIP = sActivesessionIP;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActivesessionListElement activesessionListElement = (ActivesessionListElement) o;
    return Objects.equals(this.pkiActivesessionID, activesessionListElement.pkiActivesessionID) &&
        Objects.equals(this.fkiUserID, activesessionListElement.fkiUserID) &&
        Objects.equals(this.fkiComputerID, activesessionListElement.fkiComputerID) &&
        Objects.equals(this.fkiCompanyID, activesessionListElement.fkiCompanyID) &&
        Objects.equals(this.fkiDepartmentID, activesessionListElement.fkiDepartmentID) &&
        Objects.equals(this.sCompanyNameX, activesessionListElement.sCompanyNameX) &&
        Objects.equals(this.sDepartmentNameX, activesessionListElement.sDepartmentNameX) &&
        Objects.equals(this.sActivesessionLoginname, activesessionListElement.sActivesessionLoginname) &&
        Objects.equals(this.sComputerDescription, activesessionListElement.sComputerDescription) &&
        Objects.equals(this.dtActivesessionFirsthit, activesessionListElement.dtActivesessionFirsthit) &&
        Objects.equals(this.dtActivesessionLasthit, activesessionListElement.dtActivesessionLasthit) &&
        Objects.equals(this.sActivesessionIP, activesessionListElement.sActivesessionIP);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pkiActivesessionID, fkiUserID, fkiComputerID, fkiCompanyID, fkiDepartmentID, sCompanyNameX, sDepartmentNameX, sActivesessionLoginname, sComputerDescription, dtActivesessionFirsthit, dtActivesessionLasthit, sActivesessionIP);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActivesessionListElement {\n");
    sb.append("    pkiActivesessionID: ").append(toIndentedString(pkiActivesessionID)).append("\n");
    sb.append("    fkiUserID: ").append(toIndentedString(fkiUserID)).append("\n");
    sb.append("    fkiComputerID: ").append(toIndentedString(fkiComputerID)).append("\n");
    sb.append("    fkiCompanyID: ").append(toIndentedString(fkiCompanyID)).append("\n");
    sb.append("    fkiDepartmentID: ").append(toIndentedString(fkiDepartmentID)).append("\n");
    sb.append("    sCompanyNameX: ").append(toIndentedString(sCompanyNameX)).append("\n");
    sb.append("    sDepartmentNameX: ").append(toIndentedString(sDepartmentNameX)).append("\n");
    sb.append("    sActivesessionLoginname: ").append(toIndentedString(sActivesessionLoginname)).append("\n");
    sb.append("    sComputerDescription: ").append(toIndentedString(sComputerDescription)).append("\n");
    sb.append("    dtActivesessionFirsthit: ").append(toIndentedString(dtActivesessionFirsthit)).append("\n");
    sb.append("    dtActivesessionLasthit: ").append(toIndentedString(dtActivesessionLasthit)).append("\n");
    sb.append("    sActivesessionIP: ").append(toIndentedString(sActivesessionIP)).append("\n");
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
    openapiFields.add("pkiActivesessionID");
    openapiFields.add("fkiUserID");
    openapiFields.add("fkiComputerID");
    openapiFields.add("fkiCompanyID");
    openapiFields.add("fkiDepartmentID");
    openapiFields.add("sCompanyNameX");
    openapiFields.add("sDepartmentNameX");
    openapiFields.add("sActivesessionLoginname");
    openapiFields.add("sComputerDescription");
    openapiFields.add("dtActivesessionFirsthit");
    openapiFields.add("dtActivesessionLasthit");
    openapiFields.add("sActivesessionIP");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("pkiActivesessionID");
    openapiRequiredFields.add("fkiUserID");
    openapiRequiredFields.add("fkiComputerID");
    openapiRequiredFields.add("fkiCompanyID");
    openapiRequiredFields.add("fkiDepartmentID");
    openapiRequiredFields.add("sCompanyNameX");
    openapiRequiredFields.add("sDepartmentNameX");
    openapiRequiredFields.add("sActivesessionLoginname");
    openapiRequiredFields.add("sComputerDescription");
    openapiRequiredFields.add("dtActivesessionFirsthit");
    openapiRequiredFields.add("dtActivesessionLasthit");
    openapiRequiredFields.add("sActivesessionIP");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ActivesessionListElement
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ActivesessionListElement.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ActivesessionListElement is not found in the empty JSON string", ActivesessionListElement.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ActivesessionListElement.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ActivesessionListElement` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ActivesessionListElement.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("sCompanyNameX").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sCompanyNameX` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sCompanyNameX").toString()));
      }
      if (!jsonObj.get("sDepartmentNameX").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sDepartmentNameX` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sDepartmentNameX").toString()));
      }
      if (!jsonObj.get("sActivesessionLoginname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sActivesessionLoginname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sActivesessionLoginname").toString()));
      }
      if (!jsonObj.get("sComputerDescription").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sComputerDescription` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sComputerDescription").toString()));
      }
      if (!jsonObj.get("dtActivesessionFirsthit").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dtActivesessionFirsthit` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dtActivesessionFirsthit").toString()));
      }
      if (!jsonObj.get("dtActivesessionLasthit").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dtActivesessionLasthit` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dtActivesessionLasthit").toString()));
      }
      if (!jsonObj.get("sActivesessionIP").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sActivesessionIP` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sActivesessionIP").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ActivesessionListElement.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ActivesessionListElement' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ActivesessionListElement> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ActivesessionListElement.class));

       return (TypeAdapter<T>) new TypeAdapter<ActivesessionListElement>() {
           @Override
           public void write(JsonWriter out, ActivesessionListElement value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ActivesessionListElement read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ActivesessionListElement given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ActivesessionListElement
   * @throws IOException if the JSON string is invalid with respect to ActivesessionListElement
   */
  public static ActivesessionListElement fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ActivesessionListElement.class);
  }

  /**
   * Convert an instance of ActivesessionListElement to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

