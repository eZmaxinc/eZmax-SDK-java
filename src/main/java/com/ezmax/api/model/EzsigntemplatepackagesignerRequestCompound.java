/*
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.8
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ezmax.api.model;

import java.util.Objects;
import java.util.Arrays;
import com.ezmax.api.model.EzsigntemplatepackagesignerRequest;
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
 * A Ezsigntemplatepackagesigner Object and children
 */
@ApiModel(description = "A Ezsigntemplatepackagesigner Object and children")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-20T16:59:39.826205Z[Etc/UTC]")
public class EzsigntemplatepackagesignerRequestCompound {
  public static final String SERIALIZED_NAME_PKI_EZSIGNTEMPLATEPACKAGESIGNER_I_D = "pkiEzsigntemplatepackagesignerID";
  @SerializedName(SERIALIZED_NAME_PKI_EZSIGNTEMPLATEPACKAGESIGNER_I_D)
  private Integer pkiEzsigntemplatepackagesignerID;

  public static final String SERIALIZED_NAME_FKI_EZSIGNTEMPLATEPACKAGE_I_D = "fkiEzsigntemplatepackageID";
  @SerializedName(SERIALIZED_NAME_FKI_EZSIGNTEMPLATEPACKAGE_I_D)
  private Integer fkiEzsigntemplatepackageID;

  public static final String SERIALIZED_NAME_S_EZSIGNTEMPLATEPACKAGESIGNER_DESCRIPTION = "sEzsigntemplatepackagesignerDescription";
  @SerializedName(SERIALIZED_NAME_S_EZSIGNTEMPLATEPACKAGESIGNER_DESCRIPTION)
  private String sEzsigntemplatepackagesignerDescription;

  public EzsigntemplatepackagesignerRequestCompound() { 
  }

  public EzsigntemplatepackagesignerRequestCompound pkiEzsigntemplatepackagesignerID(Integer pkiEzsigntemplatepackagesignerID) {
    
    this.pkiEzsigntemplatepackagesignerID = pkiEzsigntemplatepackagesignerID;
    return this;
  }

   /**
   * The unique ID of the Ezsigntemplatepackagesigner
   * minimum: 0
   * @return pkiEzsigntemplatepackagesignerID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "174", value = "The unique ID of the Ezsigntemplatepackagesigner")

  public Integer getPkiEzsigntemplatepackagesignerID() {
    return pkiEzsigntemplatepackagesignerID;
  }


  public void setPkiEzsigntemplatepackagesignerID(Integer pkiEzsigntemplatepackagesignerID) {
    this.pkiEzsigntemplatepackagesignerID = pkiEzsigntemplatepackagesignerID;
  }


  public EzsigntemplatepackagesignerRequestCompound fkiEzsigntemplatepackageID(Integer fkiEzsigntemplatepackageID) {
    
    this.fkiEzsigntemplatepackageID = fkiEzsigntemplatepackageID;
    return this;
  }

   /**
   * The unique ID of the Ezsigntemplatepackage
   * minimum: 0
   * @return fkiEzsigntemplatepackageID
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "99", required = true, value = "The unique ID of the Ezsigntemplatepackage")

  public Integer getFkiEzsigntemplatepackageID() {
    return fkiEzsigntemplatepackageID;
  }


  public void setFkiEzsigntemplatepackageID(Integer fkiEzsigntemplatepackageID) {
    this.fkiEzsigntemplatepackageID = fkiEzsigntemplatepackageID;
  }


  public EzsigntemplatepackagesignerRequestCompound sEzsigntemplatepackagesignerDescription(String sEzsigntemplatepackagesignerDescription) {
    
    this.sEzsigntemplatepackagesignerDescription = sEzsigntemplatepackagesignerDescription;
    return this;
  }

   /**
   * The description of the Ezsigntemplatepackagesigner
   * @return sEzsigntemplatepackagesignerDescription
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Customer", required = true, value = "The description of the Ezsigntemplatepackagesigner")

  public String getsEzsigntemplatepackagesignerDescription() {
    return sEzsigntemplatepackagesignerDescription;
  }


  public void setsEzsigntemplatepackagesignerDescription(String sEzsigntemplatepackagesignerDescription) {
    this.sEzsigntemplatepackagesignerDescription = sEzsigntemplatepackagesignerDescription;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsigntemplatepackagesignerRequestCompound ezsigntemplatepackagesignerRequestCompound = (EzsigntemplatepackagesignerRequestCompound) o;
    return Objects.equals(this.pkiEzsigntemplatepackagesignerID, ezsigntemplatepackagesignerRequestCompound.pkiEzsigntemplatepackagesignerID) &&
        Objects.equals(this.fkiEzsigntemplatepackageID, ezsigntemplatepackagesignerRequestCompound.fkiEzsigntemplatepackageID) &&
        Objects.equals(this.sEzsigntemplatepackagesignerDescription, ezsigntemplatepackagesignerRequestCompound.sEzsigntemplatepackagesignerDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pkiEzsigntemplatepackagesignerID, fkiEzsigntemplatepackageID, sEzsigntemplatepackagesignerDescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsigntemplatepackagesignerRequestCompound {\n");
    sb.append("    pkiEzsigntemplatepackagesignerID: ").append(toIndentedString(pkiEzsigntemplatepackagesignerID)).append("\n");
    sb.append("    fkiEzsigntemplatepackageID: ").append(toIndentedString(fkiEzsigntemplatepackageID)).append("\n");
    sb.append("    sEzsigntemplatepackagesignerDescription: ").append(toIndentedString(sEzsigntemplatepackagesignerDescription)).append("\n");
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
    openapiFields.add("pkiEzsigntemplatepackagesignerID");
    openapiFields.add("fkiEzsigntemplatepackageID");
    openapiFields.add("sEzsigntemplatepackagesignerDescription");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("fkiEzsigntemplatepackageID");
    openapiRequiredFields.add("sEzsigntemplatepackagesignerDescription");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EzsigntemplatepackagesignerRequestCompound
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (EzsigntemplatepackagesignerRequestCompound.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in EzsigntemplatepackagesignerRequestCompound is not found in the empty JSON string", EzsigntemplatepackagesignerRequestCompound.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!EzsigntemplatepackagesignerRequestCompound.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EzsigntemplatepackagesignerRequestCompound` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EzsigntemplatepackagesignerRequestCompound.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("sEzsigntemplatepackagesignerDescription") != null && !jsonObj.get("sEzsigntemplatepackagesignerDescription").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sEzsigntemplatepackagesignerDescription` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sEzsigntemplatepackagesignerDescription").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EzsigntemplatepackagesignerRequestCompound.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EzsigntemplatepackagesignerRequestCompound' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EzsigntemplatepackagesignerRequestCompound> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EzsigntemplatepackagesignerRequestCompound.class));

       return (TypeAdapter<T>) new TypeAdapter<EzsigntemplatepackagesignerRequestCompound>() {
           @Override
           public void write(JsonWriter out, EzsigntemplatepackagesignerRequestCompound value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EzsigntemplatepackagesignerRequestCompound read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EzsigntemplatepackagesignerRequestCompound given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EzsigntemplatepackagesignerRequestCompound
  * @throws IOException if the JSON string is invalid with respect to EzsigntemplatepackagesignerRequestCompound
  */
  public static EzsigntemplatepackagesignerRequestCompound fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EzsigntemplatepackagesignerRequestCompound.class);
  }

 /**
  * Convert an instance of EzsigntemplatepackagesignerRequestCompound to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
