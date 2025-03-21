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
 * A Ezsignsigner-&gt;Contact Object and children to create a complete structure
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-07T19:20:13.445471985Z[Etc/UTC]", comments = "Generator version: 7.12.0")
public class EzsignsignerResponseCompoundContact {
  public static final String SERIALIZED_NAME_PKI_CONTACT_I_D = "pkiContactID";
  @SerializedName(SERIALIZED_NAME_PKI_CONTACT_I_D)
  @javax.annotation.Nonnull
  private Integer pkiContactID;

  public static final String SERIALIZED_NAME_S_CONTACT_FIRSTNAME = "sContactFirstname";
  @SerializedName(SERIALIZED_NAME_S_CONTACT_FIRSTNAME)
  @javax.annotation.Nonnull
  private String sContactFirstname;

  public static final String SERIALIZED_NAME_S_CONTACT_LASTNAME = "sContactLastname";
  @SerializedName(SERIALIZED_NAME_S_CONTACT_LASTNAME)
  @javax.annotation.Nonnull
  private String sContactLastname;

  public static final String SERIALIZED_NAME_FKI_LANGUAGE_I_D = "fkiLanguageID";
  @SerializedName(SERIALIZED_NAME_FKI_LANGUAGE_I_D)
  @javax.annotation.Nonnull
  private Integer fkiLanguageID;

  public static final String SERIALIZED_NAME_S_EMAIL_ADDRESS = "sEmailAddress";
  @SerializedName(SERIALIZED_NAME_S_EMAIL_ADDRESS)
  @javax.annotation.Nullable
  private String sEmailAddress;

  public static final String SERIALIZED_NAME_S_PHONE_E164 = "sPhoneE164";
  @SerializedName(SERIALIZED_NAME_S_PHONE_E164)
  @javax.annotation.Nullable
  private String sPhoneE164;

  public static final String SERIALIZED_NAME_S_PHONE_EXTENSION = "sPhoneExtension";
  @SerializedName(SERIALIZED_NAME_S_PHONE_EXTENSION)
  @javax.annotation.Nullable
  private String sPhoneExtension;

  public static final String SERIALIZED_NAME_S_PHONE_E164_CELL = "sPhoneE164Cell";
  @SerializedName(SERIALIZED_NAME_S_PHONE_E164_CELL)
  @javax.annotation.Nullable
  private String sPhoneE164Cell;

  public EzsignsignerResponseCompoundContact() {
  }

  public EzsignsignerResponseCompoundContact pkiContactID(@javax.annotation.Nonnull Integer pkiContactID) {
    this.pkiContactID = pkiContactID;
    return this;
  }

  /**
   * The unique ID of the Contact
   * minimum: 0
   * @return pkiContactID
   */
  @javax.annotation.Nonnull
  public Integer getPkiContactID() {
    return pkiContactID;
  }

  public void setPkiContactID(@javax.annotation.Nonnull Integer pkiContactID) {
    this.pkiContactID = pkiContactID;
  }


  public EzsignsignerResponseCompoundContact sContactFirstname(@javax.annotation.Nonnull String sContactFirstname) {
    this.sContactFirstname = sContactFirstname;
    return this;
  }

  /**
   * The First name of the contact
   * @return sContactFirstname
   */
  @javax.annotation.Nonnull
  public String getsContactFirstname() {
    return sContactFirstname;
  }

  public void setsContactFirstname(@javax.annotation.Nonnull String sContactFirstname) {
    this.sContactFirstname = sContactFirstname;
  }


  public EzsignsignerResponseCompoundContact sContactLastname(@javax.annotation.Nonnull String sContactLastname) {
    this.sContactLastname = sContactLastname;
    return this;
  }

  /**
   * The Last name of the contact
   * @return sContactLastname
   */
  @javax.annotation.Nonnull
  public String getsContactLastname() {
    return sContactLastname;
  }

  public void setsContactLastname(@javax.annotation.Nonnull String sContactLastname) {
    this.sContactLastname = sContactLastname;
  }


  public EzsignsignerResponseCompoundContact fkiLanguageID(@javax.annotation.Nonnull Integer fkiLanguageID) {
    this.fkiLanguageID = fkiLanguageID;
    return this;
  }

  /**
   * The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English|
   * minimum: 1
   * maximum: 2
   * @return fkiLanguageID
   */
  @javax.annotation.Nonnull
  public Integer getFkiLanguageID() {
    return fkiLanguageID;
  }

  public void setFkiLanguageID(@javax.annotation.Nonnull Integer fkiLanguageID) {
    this.fkiLanguageID = fkiLanguageID;
  }


  public EzsignsignerResponseCompoundContact sEmailAddress(@javax.annotation.Nullable String sEmailAddress) {
    this.sEmailAddress = sEmailAddress;
    return this;
  }

  /**
   * The email address.
   * @return sEmailAddress
   */
  @javax.annotation.Nullable
  public String getsEmailAddress() {
    return sEmailAddress;
  }

  public void setsEmailAddress(@javax.annotation.Nullable String sEmailAddress) {
    this.sEmailAddress = sEmailAddress;
  }


  public EzsignsignerResponseCompoundContact sPhoneE164(@javax.annotation.Nullable String sPhoneE164) {
    this.sPhoneE164 = sPhoneE164;
    return this;
  }

  /**
   * A phone number in E.164 Format
   * @return sPhoneE164
   */
  @javax.annotation.Nullable
  public String getsPhoneE164() {
    return sPhoneE164;
  }

  public void setsPhoneE164(@javax.annotation.Nullable String sPhoneE164) {
    this.sPhoneE164 = sPhoneE164;
  }


  public EzsignsignerResponseCompoundContact sPhoneExtension(@javax.annotation.Nullable String sPhoneExtension) {
    this.sPhoneExtension = sPhoneExtension;
    return this;
  }

  /**
   * The extension of the phone number.  The extension is the \&quot;123\&quot; section in this sample phone number: (514) 990-1516 x123.  It can also be used with international phone numbers
   * @return sPhoneExtension
   */
  @javax.annotation.Nullable
  public String getsPhoneExtension() {
    return sPhoneExtension;
  }

  public void setsPhoneExtension(@javax.annotation.Nullable String sPhoneExtension) {
    this.sPhoneExtension = sPhoneExtension;
  }


  public EzsignsignerResponseCompoundContact sPhoneE164Cell(@javax.annotation.Nullable String sPhoneE164Cell) {
    this.sPhoneE164Cell = sPhoneE164Cell;
    return this;
  }

  /**
   * A phone number in E.164 Format
   * @return sPhoneE164Cell
   */
  @javax.annotation.Nullable
  public String getsPhoneE164Cell() {
    return sPhoneE164Cell;
  }

  public void setsPhoneE164Cell(@javax.annotation.Nullable String sPhoneE164Cell) {
    this.sPhoneE164Cell = sPhoneE164Cell;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignsignerResponseCompoundContact ezsignsignerResponseCompoundContact = (EzsignsignerResponseCompoundContact) o;
    return Objects.equals(this.pkiContactID, ezsignsignerResponseCompoundContact.pkiContactID) &&
        Objects.equals(this.sContactFirstname, ezsignsignerResponseCompoundContact.sContactFirstname) &&
        Objects.equals(this.sContactLastname, ezsignsignerResponseCompoundContact.sContactLastname) &&
        Objects.equals(this.fkiLanguageID, ezsignsignerResponseCompoundContact.fkiLanguageID) &&
        Objects.equals(this.sEmailAddress, ezsignsignerResponseCompoundContact.sEmailAddress) &&
        Objects.equals(this.sPhoneE164, ezsignsignerResponseCompoundContact.sPhoneE164) &&
        Objects.equals(this.sPhoneExtension, ezsignsignerResponseCompoundContact.sPhoneExtension) &&
        Objects.equals(this.sPhoneE164Cell, ezsignsignerResponseCompoundContact.sPhoneE164Cell);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pkiContactID, sContactFirstname, sContactLastname, fkiLanguageID, sEmailAddress, sPhoneE164, sPhoneExtension, sPhoneE164Cell);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignsignerResponseCompoundContact {\n");
    sb.append("    pkiContactID: ").append(toIndentedString(pkiContactID)).append("\n");
    sb.append("    sContactFirstname: ").append(toIndentedString(sContactFirstname)).append("\n");
    sb.append("    sContactLastname: ").append(toIndentedString(sContactLastname)).append("\n");
    sb.append("    fkiLanguageID: ").append(toIndentedString(fkiLanguageID)).append("\n");
    sb.append("    sEmailAddress: ").append(toIndentedString(sEmailAddress)).append("\n");
    sb.append("    sPhoneE164: ").append(toIndentedString(sPhoneE164)).append("\n");
    sb.append("    sPhoneExtension: ").append(toIndentedString(sPhoneExtension)).append("\n");
    sb.append("    sPhoneE164Cell: ").append(toIndentedString(sPhoneE164Cell)).append("\n");
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
    openapiFields.add("pkiContactID");
    openapiFields.add("sContactFirstname");
    openapiFields.add("sContactLastname");
    openapiFields.add("fkiLanguageID");
    openapiFields.add("sEmailAddress");
    openapiFields.add("sPhoneE164");
    openapiFields.add("sPhoneExtension");
    openapiFields.add("sPhoneE164Cell");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("pkiContactID");
    openapiRequiredFields.add("sContactFirstname");
    openapiRequiredFields.add("sContactLastname");
    openapiRequiredFields.add("fkiLanguageID");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EzsignsignerResponseCompoundContact
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EzsignsignerResponseCompoundContact.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EzsignsignerResponseCompoundContact is not found in the empty JSON string", EzsignsignerResponseCompoundContact.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EzsignsignerResponseCompoundContact.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EzsignsignerResponseCompoundContact` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EzsignsignerResponseCompoundContact.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("sContactFirstname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sContactFirstname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sContactFirstname").toString()));
      }
      if (!jsonObj.get("sContactLastname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sContactLastname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sContactLastname").toString()));
      }
      if ((jsonObj.get("sEmailAddress") != null && !jsonObj.get("sEmailAddress").isJsonNull()) && !jsonObj.get("sEmailAddress").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sEmailAddress` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sEmailAddress").toString()));
      }
      if ((jsonObj.get("sPhoneE164") != null && !jsonObj.get("sPhoneE164").isJsonNull()) && !jsonObj.get("sPhoneE164").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sPhoneE164` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sPhoneE164").toString()));
      }
      if ((jsonObj.get("sPhoneExtension") != null && !jsonObj.get("sPhoneExtension").isJsonNull()) && !jsonObj.get("sPhoneExtension").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sPhoneExtension` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sPhoneExtension").toString()));
      }
      if ((jsonObj.get("sPhoneE164Cell") != null && !jsonObj.get("sPhoneE164Cell").isJsonNull()) && !jsonObj.get("sPhoneE164Cell").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sPhoneE164Cell` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sPhoneE164Cell").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EzsignsignerResponseCompoundContact.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EzsignsignerResponseCompoundContact' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EzsignsignerResponseCompoundContact> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EzsignsignerResponseCompoundContact.class));

       return (TypeAdapter<T>) new TypeAdapter<EzsignsignerResponseCompoundContact>() {
           @Override
           public void write(JsonWriter out, EzsignsignerResponseCompoundContact value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EzsignsignerResponseCompoundContact read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EzsignsignerResponseCompoundContact given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EzsignsignerResponseCompoundContact
   * @throws IOException if the JSON string is invalid with respect to EzsignsignerResponseCompoundContact
   */
  public static EzsignsignerResponseCompoundContact fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EzsignsignerResponseCompoundContact.class);
  }

  /**
   * Convert an instance of EzsignsignerResponseCompoundContact to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

