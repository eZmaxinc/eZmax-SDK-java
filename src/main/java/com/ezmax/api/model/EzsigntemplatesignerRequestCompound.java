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
import com.ezmax.api.model.FieldEEzsigntemplatesignerMapping;
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
 * A Ezsigntemplatesigner Object and children
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-07T19:20:13.445471985Z[Etc/UTC]", comments = "Generator version: 7.12.0")
public class EzsigntemplatesignerRequestCompound {
  public static final String SERIALIZED_NAME_PKI_EZSIGNTEMPLATESIGNER_I_D = "pkiEzsigntemplatesignerID";
  @SerializedName(SERIALIZED_NAME_PKI_EZSIGNTEMPLATESIGNER_I_D)
  @javax.annotation.Nullable
  private Integer pkiEzsigntemplatesignerID;

  public static final String SERIALIZED_NAME_FKI_EZSIGNTEMPLATE_I_D = "fkiEzsigntemplateID";
  @SerializedName(SERIALIZED_NAME_FKI_EZSIGNTEMPLATE_I_D)
  @javax.annotation.Nonnull
  private Integer fkiEzsigntemplateID;

  public static final String SERIALIZED_NAME_FKI_USER_I_D = "fkiUserID";
  @SerializedName(SERIALIZED_NAME_FKI_USER_I_D)
  @javax.annotation.Nullable
  private Integer fkiUserID;

  public static final String SERIALIZED_NAME_FKI_USERGROUP_I_D = "fkiUsergroupID";
  @SerializedName(SERIALIZED_NAME_FKI_USERGROUP_I_D)
  @javax.annotation.Nullable
  private Integer fkiUsergroupID;

  public static final String SERIALIZED_NAME_FKI_EZDOCTEMPLATEDOCUMENT_I_D = "fkiEzdoctemplatedocumentID";
  @SerializedName(SERIALIZED_NAME_FKI_EZDOCTEMPLATEDOCUMENT_I_D)
  @javax.annotation.Nullable
  private Integer fkiEzdoctemplatedocumentID;

  public static final String SERIALIZED_NAME_B_EZSIGNTEMPLATESIGNER_RECEIVECOPY = "bEzsigntemplatesignerReceivecopy";
  @SerializedName(SERIALIZED_NAME_B_EZSIGNTEMPLATESIGNER_RECEIVECOPY)
  @javax.annotation.Nullable
  private Boolean bEzsigntemplatesignerReceivecopy;

  public static final String SERIALIZED_NAME_E_EZSIGNTEMPLATESIGNER_MAPPING = "eEzsigntemplatesignerMapping";
  @SerializedName(SERIALIZED_NAME_E_EZSIGNTEMPLATESIGNER_MAPPING)
  @javax.annotation.Nullable
  private FieldEEzsigntemplatesignerMapping eEzsigntemplatesignerMapping;

  public static final String SERIALIZED_NAME_S_EZSIGNTEMPLATESIGNER_DESCRIPTION = "sEzsigntemplatesignerDescription";
  @SerializedName(SERIALIZED_NAME_S_EZSIGNTEMPLATESIGNER_DESCRIPTION)
  @javax.annotation.Nonnull
  private String sEzsigntemplatesignerDescription;

  public EzsigntemplatesignerRequestCompound() {
  }

  public EzsigntemplatesignerRequestCompound pkiEzsigntemplatesignerID(@javax.annotation.Nullable Integer pkiEzsigntemplatesignerID) {
    this.pkiEzsigntemplatesignerID = pkiEzsigntemplatesignerID;
    return this;
  }

  /**
   * The unique ID of the Ezsigntemplatesigner
   * minimum: 0
   * @return pkiEzsigntemplatesignerID
   */
  @javax.annotation.Nullable
  public Integer getPkiEzsigntemplatesignerID() {
    return pkiEzsigntemplatesignerID;
  }

  public void setPkiEzsigntemplatesignerID(@javax.annotation.Nullable Integer pkiEzsigntemplatesignerID) {
    this.pkiEzsigntemplatesignerID = pkiEzsigntemplatesignerID;
  }


  public EzsigntemplatesignerRequestCompound fkiEzsigntemplateID(@javax.annotation.Nonnull Integer fkiEzsigntemplateID) {
    this.fkiEzsigntemplateID = fkiEzsigntemplateID;
    return this;
  }

  /**
   * The unique ID of the Ezsigntemplate
   * minimum: 0
   * @return fkiEzsigntemplateID
   */
  @javax.annotation.Nonnull
  public Integer getFkiEzsigntemplateID() {
    return fkiEzsigntemplateID;
  }

  public void setFkiEzsigntemplateID(@javax.annotation.Nonnull Integer fkiEzsigntemplateID) {
    this.fkiEzsigntemplateID = fkiEzsigntemplateID;
  }


  public EzsigntemplatesignerRequestCompound fkiUserID(@javax.annotation.Nullable Integer fkiUserID) {
    this.fkiUserID = fkiUserID;
    return this;
  }

  /**
   * The unique ID of the User
   * minimum: 0
   * @return fkiUserID
   */
  @javax.annotation.Nullable
  public Integer getFkiUserID() {
    return fkiUserID;
  }

  public void setFkiUserID(@javax.annotation.Nullable Integer fkiUserID) {
    this.fkiUserID = fkiUserID;
  }


  public EzsigntemplatesignerRequestCompound fkiUsergroupID(@javax.annotation.Nullable Integer fkiUsergroupID) {
    this.fkiUsergroupID = fkiUsergroupID;
    return this;
  }

  /**
   * The unique ID of the Usergroup
   * minimum: 0
   * maximum: 255
   * @return fkiUsergroupID
   */
  @javax.annotation.Nullable
  public Integer getFkiUsergroupID() {
    return fkiUsergroupID;
  }

  public void setFkiUsergroupID(@javax.annotation.Nullable Integer fkiUsergroupID) {
    this.fkiUsergroupID = fkiUsergroupID;
  }


  public EzsigntemplatesignerRequestCompound fkiEzdoctemplatedocumentID(@javax.annotation.Nullable Integer fkiEzdoctemplatedocumentID) {
    this.fkiEzdoctemplatedocumentID = fkiEzdoctemplatedocumentID;
    return this;
  }

  /**
   * The unique ID of the Ezdoctemplatedocument
   * minimum: 0
   * maximum: 65535
   * @return fkiEzdoctemplatedocumentID
   */
  @javax.annotation.Nullable
  public Integer getFkiEzdoctemplatedocumentID() {
    return fkiEzdoctemplatedocumentID;
  }

  public void setFkiEzdoctemplatedocumentID(@javax.annotation.Nullable Integer fkiEzdoctemplatedocumentID) {
    this.fkiEzdoctemplatedocumentID = fkiEzdoctemplatedocumentID;
  }


  public EzsigntemplatesignerRequestCompound bEzsigntemplatesignerReceivecopy(@javax.annotation.Nullable Boolean bEzsigntemplatesignerReceivecopy) {
    this.bEzsigntemplatesignerReceivecopy = bEzsigntemplatesignerReceivecopy;
    return this;
  }

  /**
   * If this flag is true. The signatory will receive a copy of every signed Ezsigndocument even if it ain&#39;t required to sign the document.
   * @return bEzsigntemplatesignerReceivecopy
   */
  @javax.annotation.Nullable
  public Boolean getbEzsigntemplatesignerReceivecopy() {
    return bEzsigntemplatesignerReceivecopy;
  }

  public void setbEzsigntemplatesignerReceivecopy(@javax.annotation.Nullable Boolean bEzsigntemplatesignerReceivecopy) {
    this.bEzsigntemplatesignerReceivecopy = bEzsigntemplatesignerReceivecopy;
  }


  public EzsigntemplatesignerRequestCompound eEzsigntemplatesignerMapping(@javax.annotation.Nullable FieldEEzsigntemplatesignerMapping eEzsigntemplatesignerMapping) {
    this.eEzsigntemplatesignerMapping = eEzsigntemplatesignerMapping;
    return this;
  }

  /**
   * Get eEzsigntemplatesignerMapping
   * @return eEzsigntemplatesignerMapping
   */
  @javax.annotation.Nullable
  public FieldEEzsigntemplatesignerMapping geteEzsigntemplatesignerMapping() {
    return eEzsigntemplatesignerMapping;
  }

  public void seteEzsigntemplatesignerMapping(@javax.annotation.Nullable FieldEEzsigntemplatesignerMapping eEzsigntemplatesignerMapping) {
    this.eEzsigntemplatesignerMapping = eEzsigntemplatesignerMapping;
  }


  public EzsigntemplatesignerRequestCompound sEzsigntemplatesignerDescription(@javax.annotation.Nonnull String sEzsigntemplatesignerDescription) {
    this.sEzsigntemplatesignerDescription = sEzsigntemplatesignerDescription;
    return this;
  }

  /**
   * The description of the Ezsigntemplatesigner
   * @return sEzsigntemplatesignerDescription
   */
  @javax.annotation.Nonnull
  public String getsEzsigntemplatesignerDescription() {
    return sEzsigntemplatesignerDescription;
  }

  public void setsEzsigntemplatesignerDescription(@javax.annotation.Nonnull String sEzsigntemplatesignerDescription) {
    this.sEzsigntemplatesignerDescription = sEzsigntemplatesignerDescription;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsigntemplatesignerRequestCompound ezsigntemplatesignerRequestCompound = (EzsigntemplatesignerRequestCompound) o;
    return Objects.equals(this.pkiEzsigntemplatesignerID, ezsigntemplatesignerRequestCompound.pkiEzsigntemplatesignerID) &&
        Objects.equals(this.fkiEzsigntemplateID, ezsigntemplatesignerRequestCompound.fkiEzsigntemplateID) &&
        Objects.equals(this.fkiUserID, ezsigntemplatesignerRequestCompound.fkiUserID) &&
        Objects.equals(this.fkiUsergroupID, ezsigntemplatesignerRequestCompound.fkiUsergroupID) &&
        Objects.equals(this.fkiEzdoctemplatedocumentID, ezsigntemplatesignerRequestCompound.fkiEzdoctemplatedocumentID) &&
        Objects.equals(this.bEzsigntemplatesignerReceivecopy, ezsigntemplatesignerRequestCompound.bEzsigntemplatesignerReceivecopy) &&
        Objects.equals(this.eEzsigntemplatesignerMapping, ezsigntemplatesignerRequestCompound.eEzsigntemplatesignerMapping) &&
        Objects.equals(this.sEzsigntemplatesignerDescription, ezsigntemplatesignerRequestCompound.sEzsigntemplatesignerDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pkiEzsigntemplatesignerID, fkiEzsigntemplateID, fkiUserID, fkiUsergroupID, fkiEzdoctemplatedocumentID, bEzsigntemplatesignerReceivecopy, eEzsigntemplatesignerMapping, sEzsigntemplatesignerDescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsigntemplatesignerRequestCompound {\n");
    sb.append("    pkiEzsigntemplatesignerID: ").append(toIndentedString(pkiEzsigntemplatesignerID)).append("\n");
    sb.append("    fkiEzsigntemplateID: ").append(toIndentedString(fkiEzsigntemplateID)).append("\n");
    sb.append("    fkiUserID: ").append(toIndentedString(fkiUserID)).append("\n");
    sb.append("    fkiUsergroupID: ").append(toIndentedString(fkiUsergroupID)).append("\n");
    sb.append("    fkiEzdoctemplatedocumentID: ").append(toIndentedString(fkiEzdoctemplatedocumentID)).append("\n");
    sb.append("    bEzsigntemplatesignerReceivecopy: ").append(toIndentedString(bEzsigntemplatesignerReceivecopy)).append("\n");
    sb.append("    eEzsigntemplatesignerMapping: ").append(toIndentedString(eEzsigntemplatesignerMapping)).append("\n");
    sb.append("    sEzsigntemplatesignerDescription: ").append(toIndentedString(sEzsigntemplatesignerDescription)).append("\n");
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
    openapiFields.add("pkiEzsigntemplatesignerID");
    openapiFields.add("fkiEzsigntemplateID");
    openapiFields.add("fkiUserID");
    openapiFields.add("fkiUsergroupID");
    openapiFields.add("fkiEzdoctemplatedocumentID");
    openapiFields.add("bEzsigntemplatesignerReceivecopy");
    openapiFields.add("eEzsigntemplatesignerMapping");
    openapiFields.add("sEzsigntemplatesignerDescription");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("fkiEzsigntemplateID");
    openapiRequiredFields.add("sEzsigntemplatesignerDescription");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EzsigntemplatesignerRequestCompound
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EzsigntemplatesignerRequestCompound.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EzsigntemplatesignerRequestCompound is not found in the empty JSON string", EzsigntemplatesignerRequestCompound.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EzsigntemplatesignerRequestCompound.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EzsigntemplatesignerRequestCompound` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EzsigntemplatesignerRequestCompound.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `eEzsigntemplatesignerMapping`
      if (jsonObj.get("eEzsigntemplatesignerMapping") != null && !jsonObj.get("eEzsigntemplatesignerMapping").isJsonNull()) {
        FieldEEzsigntemplatesignerMapping.validateJsonElement(jsonObj.get("eEzsigntemplatesignerMapping"));
      }
      if (!jsonObj.get("sEzsigntemplatesignerDescription").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sEzsigntemplatesignerDescription` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sEzsigntemplatesignerDescription").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EzsigntemplatesignerRequestCompound.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EzsigntemplatesignerRequestCompound' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EzsigntemplatesignerRequestCompound> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EzsigntemplatesignerRequestCompound.class));

       return (TypeAdapter<T>) new TypeAdapter<EzsigntemplatesignerRequestCompound>() {
           @Override
           public void write(JsonWriter out, EzsigntemplatesignerRequestCompound value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EzsigntemplatesignerRequestCompound read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EzsigntemplatesignerRequestCompound given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EzsigntemplatesignerRequestCompound
   * @throws IOException if the JSON string is invalid with respect to EzsigntemplatesignerRequestCompound
   */
  public static EzsigntemplatesignerRequestCompound fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EzsigntemplatesignerRequestCompound.class);
  }

  /**
   * Convert an instance of EzsigntemplatesignerRequestCompound to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

