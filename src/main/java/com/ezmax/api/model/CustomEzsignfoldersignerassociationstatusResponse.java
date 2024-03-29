/*
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.18
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ezmax.api.model;

import java.util.Objects;
import java.util.Arrays;
import com.ezmax.api.model.CustomEzsignsignaturestatusResponse;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import eZmaxAPI.JSON;

/**
 * A Ezsignfoldersignerassociationstatus Object and children to create a complete structure
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-22T15:33:11.356591451Z[Etc/UTC]")
public class CustomEzsignfoldersignerassociationstatusResponse {
  public static final String SERIALIZED_NAME_FKI_EZSIGNFOLDERSIGNERASSOCIATION_I_D = "fkiEzsignfoldersignerassociationID";
  @SerializedName(SERIALIZED_NAME_FKI_EZSIGNFOLDERSIGNERASSOCIATION_I_D)
  private Integer fkiEzsignfoldersignerassociationID;

  public static final String SERIALIZED_NAME_S_EZSIGNFOLDERSIGNERASSOCIATIONSTATUS_LASTNAME = "sEzsignfoldersignerassociationstatusLastname";
  @SerializedName(SERIALIZED_NAME_S_EZSIGNFOLDERSIGNERASSOCIATIONSTATUS_LASTNAME)
  private String sEzsignfoldersignerassociationstatusLastname;

  public static final String SERIALIZED_NAME_S_EZSIGNFOLDERSIGNERASSOCIATIONSTATUS_FIRSTNAME = "sEzsignfoldersignerassociationstatusFirstname";
  @SerializedName(SERIALIZED_NAME_S_EZSIGNFOLDERSIGNERASSOCIATIONSTATUS_FIRSTNAME)
  private String sEzsignfoldersignerassociationstatusFirstname;

  public static final String SERIALIZED_NAME_A_OBJ_EZSIGNSIGNATURESTATUS = "a_objEzsignsignaturestatus";
  @SerializedName(SERIALIZED_NAME_A_OBJ_EZSIGNSIGNATURESTATUS)
  private List<CustomEzsignsignaturestatusResponse> aObjEzsignsignaturestatus = new ArrayList<>();

  public CustomEzsignfoldersignerassociationstatusResponse() {
  }

  public CustomEzsignfoldersignerassociationstatusResponse fkiEzsignfoldersignerassociationID(Integer fkiEzsignfoldersignerassociationID) {
    
    this.fkiEzsignfoldersignerassociationID = fkiEzsignfoldersignerassociationID;
    return this;
  }

   /**
   * The unique ID of the Ezsignfoldersignerassociation
   * minimum: 0
   * @return fkiEzsignfoldersignerassociationID
  **/
  @javax.annotation.Nonnull
  public Integer getFkiEzsignfoldersignerassociationID() {
    return fkiEzsignfoldersignerassociationID;
  }


  public void setFkiEzsignfoldersignerassociationID(Integer fkiEzsignfoldersignerassociationID) {
    this.fkiEzsignfoldersignerassociationID = fkiEzsignfoldersignerassociationID;
  }


  public CustomEzsignfoldersignerassociationstatusResponse sEzsignfoldersignerassociationstatusLastname(String sEzsignfoldersignerassociationstatusLastname) {
    
    this.sEzsignfoldersignerassociationstatusLastname = sEzsignfoldersignerassociationstatusLastname;
    return this;
  }

   /**
   * The last name of the Ezsignsigner
   * @return sEzsignfoldersignerassociationstatusLastname
  **/
  @javax.annotation.Nullable
  public String getsEzsignfoldersignerassociationstatusLastname() {
    return sEzsignfoldersignerassociationstatusLastname;
  }


  public void setsEzsignfoldersignerassociationstatusLastname(String sEzsignfoldersignerassociationstatusLastname) {
    this.sEzsignfoldersignerassociationstatusLastname = sEzsignfoldersignerassociationstatusLastname;
  }


  public CustomEzsignfoldersignerassociationstatusResponse sEzsignfoldersignerassociationstatusFirstname(String sEzsignfoldersignerassociationstatusFirstname) {
    
    this.sEzsignfoldersignerassociationstatusFirstname = sEzsignfoldersignerassociationstatusFirstname;
    return this;
  }

   /**
   * The first name of the Ezsignsigner
   * @return sEzsignfoldersignerassociationstatusFirstname
  **/
  @javax.annotation.Nullable
  public String getsEzsignfoldersignerassociationstatusFirstname() {
    return sEzsignfoldersignerassociationstatusFirstname;
  }


  public void setsEzsignfoldersignerassociationstatusFirstname(String sEzsignfoldersignerassociationstatusFirstname) {
    this.sEzsignfoldersignerassociationstatusFirstname = sEzsignfoldersignerassociationstatusFirstname;
  }


  public CustomEzsignfoldersignerassociationstatusResponse aObjEzsignsignaturestatus(List<CustomEzsignsignaturestatusResponse> aObjEzsignsignaturestatus) {
    
    this.aObjEzsignsignaturestatus = aObjEzsignsignaturestatus;
    return this;
  }

  public CustomEzsignfoldersignerassociationstatusResponse addAObjEzsignsignaturestatusItem(CustomEzsignsignaturestatusResponse aObjEzsignsignaturestatusItem) {
    if (this.aObjEzsignsignaturestatus == null) {
      this.aObjEzsignsignaturestatus = new ArrayList<>();
    }
    this.aObjEzsignsignaturestatus.add(aObjEzsignsignaturestatusItem);
    return this;
  }

   /**
   * Get aObjEzsignsignaturestatus
   * @return aObjEzsignsignaturestatus
  **/
  @javax.annotation.Nonnull
  public List<CustomEzsignsignaturestatusResponse> getaObjEzsignsignaturestatus() {
    return aObjEzsignsignaturestatus;
  }


  public void setaObjEzsignsignaturestatus(List<CustomEzsignsignaturestatusResponse> aObjEzsignsignaturestatus) {
    this.aObjEzsignsignaturestatus = aObjEzsignsignaturestatus;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomEzsignfoldersignerassociationstatusResponse customEzsignfoldersignerassociationstatusResponse = (CustomEzsignfoldersignerassociationstatusResponse) o;
    return Objects.equals(this.fkiEzsignfoldersignerassociationID, customEzsignfoldersignerassociationstatusResponse.fkiEzsignfoldersignerassociationID) &&
        Objects.equals(this.sEzsignfoldersignerassociationstatusLastname, customEzsignfoldersignerassociationstatusResponse.sEzsignfoldersignerassociationstatusLastname) &&
        Objects.equals(this.sEzsignfoldersignerassociationstatusFirstname, customEzsignfoldersignerassociationstatusResponse.sEzsignfoldersignerassociationstatusFirstname) &&
        Objects.equals(this.aObjEzsignsignaturestatus, customEzsignfoldersignerassociationstatusResponse.aObjEzsignsignaturestatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fkiEzsignfoldersignerassociationID, sEzsignfoldersignerassociationstatusLastname, sEzsignfoldersignerassociationstatusFirstname, aObjEzsignsignaturestatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomEzsignfoldersignerassociationstatusResponse {\n");
    sb.append("    fkiEzsignfoldersignerassociationID: ").append(toIndentedString(fkiEzsignfoldersignerassociationID)).append("\n");
    sb.append("    sEzsignfoldersignerassociationstatusLastname: ").append(toIndentedString(sEzsignfoldersignerassociationstatusLastname)).append("\n");
    sb.append("    sEzsignfoldersignerassociationstatusFirstname: ").append(toIndentedString(sEzsignfoldersignerassociationstatusFirstname)).append("\n");
    sb.append("    aObjEzsignsignaturestatus: ").append(toIndentedString(aObjEzsignsignaturestatus)).append("\n");
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
    openapiFields.add("sEzsignfoldersignerassociationstatusLastname");
    openapiFields.add("sEzsignfoldersignerassociationstatusFirstname");
    openapiFields.add("a_objEzsignsignaturestatus");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("fkiEzsignfoldersignerassociationID");
    openapiRequiredFields.add("a_objEzsignsignaturestatus");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CustomEzsignfoldersignerassociationstatusResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CustomEzsignfoldersignerassociationstatusResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CustomEzsignfoldersignerassociationstatusResponse is not found in the empty JSON string", CustomEzsignfoldersignerassociationstatusResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CustomEzsignfoldersignerassociationstatusResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CustomEzsignfoldersignerassociationstatusResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CustomEzsignfoldersignerassociationstatusResponse.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("sEzsignfoldersignerassociationstatusLastname") != null && !jsonObj.get("sEzsignfoldersignerassociationstatusLastname").isJsonNull()) && !jsonObj.get("sEzsignfoldersignerassociationstatusLastname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sEzsignfoldersignerassociationstatusLastname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sEzsignfoldersignerassociationstatusLastname").toString()));
      }
      if ((jsonObj.get("sEzsignfoldersignerassociationstatusFirstname") != null && !jsonObj.get("sEzsignfoldersignerassociationstatusFirstname").isJsonNull()) && !jsonObj.get("sEzsignfoldersignerassociationstatusFirstname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sEzsignfoldersignerassociationstatusFirstname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sEzsignfoldersignerassociationstatusFirstname").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("a_objEzsignsignaturestatus").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `a_objEzsignsignaturestatus` to be an array in the JSON string but got `%s`", jsonObj.get("a_objEzsignsignaturestatus").toString()));
      }

      JsonArray jsonArrayaObjEzsignsignaturestatus = jsonObj.getAsJsonArray("a_objEzsignsignaturestatus");
      // validate the required field `a_objEzsignsignaturestatus` (array)
      for (int i = 0; i < jsonArrayaObjEzsignsignaturestatus.size(); i++) {
        CustomEzsignsignaturestatusResponse.validateJsonObject(jsonArrayaObjEzsignsignaturestatus.get(i).getAsJsonObject());
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CustomEzsignfoldersignerassociationstatusResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CustomEzsignfoldersignerassociationstatusResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CustomEzsignfoldersignerassociationstatusResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CustomEzsignfoldersignerassociationstatusResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<CustomEzsignfoldersignerassociationstatusResponse>() {
           @Override
           public void write(JsonWriter out, CustomEzsignfoldersignerassociationstatusResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CustomEzsignfoldersignerassociationstatusResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CustomEzsignfoldersignerassociationstatusResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CustomEzsignfoldersignerassociationstatusResponse
  * @throws IOException if the JSON string is invalid with respect to CustomEzsignfoldersignerassociationstatusResponse
  */
  public static CustomEzsignfoldersignerassociationstatusResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CustomEzsignfoldersignerassociationstatusResponse.class);
  }

 /**
  * Convert an instance of CustomEzsignfoldersignerassociationstatusResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

