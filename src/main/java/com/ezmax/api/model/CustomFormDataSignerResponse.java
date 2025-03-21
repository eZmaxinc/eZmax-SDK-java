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
import com.ezmax.api.model.CustomFormDataEzsignformfieldgroupResponse;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
 * A form Data Signer Object
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-07T19:20:13.445471985Z[Etc/UTC]", comments = "Generator version: 7.12.0")
public class CustomFormDataSignerResponse {
  public static final String SERIALIZED_NAME_FKI_EZSIGNFOLDERSIGNERASSOCIATION_I_D = "fkiEzsignfoldersignerassociationID";
  @SerializedName(SERIALIZED_NAME_FKI_EZSIGNFOLDERSIGNERASSOCIATION_I_D)
  @javax.annotation.Nonnull
  private Integer fkiEzsignfoldersignerassociationID;

  public static final String SERIALIZED_NAME_FKI_USER_I_D = "fkiUserID";
  @SerializedName(SERIALIZED_NAME_FKI_USER_I_D)
  @javax.annotation.Nullable
  private Integer fkiUserID;

  public static final String SERIALIZED_NAME_S_CONTACT_FIRSTNAME = "sContactFirstname";
  @SerializedName(SERIALIZED_NAME_S_CONTACT_FIRSTNAME)
  @javax.annotation.Nonnull
  private String sContactFirstname;

  public static final String SERIALIZED_NAME_S_CONTACT_LASTNAME = "sContactLastname";
  @SerializedName(SERIALIZED_NAME_S_CONTACT_LASTNAME)
  @javax.annotation.Nonnull
  private String sContactLastname;

  public static final String SERIALIZED_NAME_A_OBJ_EZSIGNFORMFIELDGROUP = "a_objEzsignformfieldgroup";
  @SerializedName(SERIALIZED_NAME_A_OBJ_EZSIGNFORMFIELDGROUP)
  @javax.annotation.Nonnull
  private List<CustomFormDataEzsignformfieldgroupResponse> aObjEzsignformfieldgroup = new ArrayList<>();

  public CustomFormDataSignerResponse() {
  }

  public CustomFormDataSignerResponse fkiEzsignfoldersignerassociationID(@javax.annotation.Nonnull Integer fkiEzsignfoldersignerassociationID) {
    this.fkiEzsignfoldersignerassociationID = fkiEzsignfoldersignerassociationID;
    return this;
  }

  /**
   * The unique ID of the Ezsignfoldersignerassociation
   * minimum: 0
   * @return fkiEzsignfoldersignerassociationID
   */
  @javax.annotation.Nonnull
  public Integer getFkiEzsignfoldersignerassociationID() {
    return fkiEzsignfoldersignerassociationID;
  }

  public void setFkiEzsignfoldersignerassociationID(@javax.annotation.Nonnull Integer fkiEzsignfoldersignerassociationID) {
    this.fkiEzsignfoldersignerassociationID = fkiEzsignfoldersignerassociationID;
  }


  public CustomFormDataSignerResponse fkiUserID(@javax.annotation.Nullable Integer fkiUserID) {
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


  public CustomFormDataSignerResponse sContactFirstname(@javax.annotation.Nonnull String sContactFirstname) {
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


  public CustomFormDataSignerResponse sContactLastname(@javax.annotation.Nonnull String sContactLastname) {
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


  public CustomFormDataSignerResponse aObjEzsignformfieldgroup(@javax.annotation.Nonnull List<CustomFormDataEzsignformfieldgroupResponse> aObjEzsignformfieldgroup) {
    this.aObjEzsignformfieldgroup = aObjEzsignformfieldgroup;
    return this;
  }

  public CustomFormDataSignerResponse addAObjEzsignformfieldgroupItem(CustomFormDataEzsignformfieldgroupResponse aObjEzsignformfieldgroupItem) {
    if (this.aObjEzsignformfieldgroup == null) {
      this.aObjEzsignformfieldgroup = new ArrayList<>();
    }
    this.aObjEzsignformfieldgroup.add(aObjEzsignformfieldgroupItem);
    return this;
  }

  /**
   * Get aObjEzsignformfieldgroup
   * @return aObjEzsignformfieldgroup
   */
  @javax.annotation.Nonnull
  public List<CustomFormDataEzsignformfieldgroupResponse> getaObjEzsignformfieldgroup() {
    return aObjEzsignformfieldgroup;
  }

  public void setaObjEzsignformfieldgroup(@javax.annotation.Nonnull List<CustomFormDataEzsignformfieldgroupResponse> aObjEzsignformfieldgroup) {
    this.aObjEzsignformfieldgroup = aObjEzsignformfieldgroup;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomFormDataSignerResponse customFormDataSignerResponse = (CustomFormDataSignerResponse) o;
    return Objects.equals(this.fkiEzsignfoldersignerassociationID, customFormDataSignerResponse.fkiEzsignfoldersignerassociationID) &&
        Objects.equals(this.fkiUserID, customFormDataSignerResponse.fkiUserID) &&
        Objects.equals(this.sContactFirstname, customFormDataSignerResponse.sContactFirstname) &&
        Objects.equals(this.sContactLastname, customFormDataSignerResponse.sContactLastname) &&
        Objects.equals(this.aObjEzsignformfieldgroup, customFormDataSignerResponse.aObjEzsignformfieldgroup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fkiEzsignfoldersignerassociationID, fkiUserID, sContactFirstname, sContactLastname, aObjEzsignformfieldgroup);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomFormDataSignerResponse {\n");
    sb.append("    fkiEzsignfoldersignerassociationID: ").append(toIndentedString(fkiEzsignfoldersignerassociationID)).append("\n");
    sb.append("    fkiUserID: ").append(toIndentedString(fkiUserID)).append("\n");
    sb.append("    sContactFirstname: ").append(toIndentedString(sContactFirstname)).append("\n");
    sb.append("    sContactLastname: ").append(toIndentedString(sContactLastname)).append("\n");
    sb.append("    aObjEzsignformfieldgroup: ").append(toIndentedString(aObjEzsignformfieldgroup)).append("\n");
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
    openapiFields.add("fkiEzsignfoldersignerassociationID");
    openapiFields.add("fkiUserID");
    openapiFields.add("sContactFirstname");
    openapiFields.add("sContactLastname");
    openapiFields.add("a_objEzsignformfieldgroup");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("fkiEzsignfoldersignerassociationID");
    openapiRequiredFields.add("sContactFirstname");
    openapiRequiredFields.add("sContactLastname");
    openapiRequiredFields.add("a_objEzsignformfieldgroup");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CustomFormDataSignerResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CustomFormDataSignerResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CustomFormDataSignerResponse is not found in the empty JSON string", CustomFormDataSignerResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CustomFormDataSignerResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CustomFormDataSignerResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CustomFormDataSignerResponse.openapiRequiredFields) {
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
      // ensure the json data is an array
      if (!jsonObj.get("a_objEzsignformfieldgroup").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `a_objEzsignformfieldgroup` to be an array in the JSON string but got `%s`", jsonObj.get("a_objEzsignformfieldgroup").toString()));
      }

      JsonArray jsonArrayaObjEzsignformfieldgroup = jsonObj.getAsJsonArray("a_objEzsignformfieldgroup");
      // validate the required field `a_objEzsignformfieldgroup` (array)
      for (int i = 0; i < jsonArrayaObjEzsignformfieldgroup.size(); i++) {
        CustomFormDataEzsignformfieldgroupResponse.validateJsonElement(jsonArrayaObjEzsignformfieldgroup.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CustomFormDataSignerResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CustomFormDataSignerResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CustomFormDataSignerResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CustomFormDataSignerResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<CustomFormDataSignerResponse>() {
           @Override
           public void write(JsonWriter out, CustomFormDataSignerResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CustomFormDataSignerResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CustomFormDataSignerResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CustomFormDataSignerResponse
   * @throws IOException if the JSON string is invalid with respect to CustomFormDataSignerResponse
   */
  public static CustomFormDataSignerResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CustomFormDataSignerResponse.class);
  }

  /**
   * Convert an instance of CustomFormDataSignerResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

