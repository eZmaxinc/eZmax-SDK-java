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
import com.ezmax.api.model.DiscussionResponseCompound;
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
 * A Ezsigndiscussion Object
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-07T19:20:13.445471985Z[Etc/UTC]", comments = "Generator version: 7.12.0")
public class EzsigndiscussionResponse {
  public static final String SERIALIZED_NAME_PKI_EZSIGNDISCUSSION_I_D = "pkiEzsigndiscussionID";
  @SerializedName(SERIALIZED_NAME_PKI_EZSIGNDISCUSSION_I_D)
  @javax.annotation.Nonnull
  private Integer pkiEzsigndiscussionID;

  public static final String SERIALIZED_NAME_FKI_EZSIGNPAGE_I_D = "fkiEzsignpageID";
  @SerializedName(SERIALIZED_NAME_FKI_EZSIGNPAGE_I_D)
  @javax.annotation.Nonnull
  private Integer fkiEzsignpageID;

  public static final String SERIALIZED_NAME_FKI_DISCUSSION_I_D = "fkiDiscussionID";
  @SerializedName(SERIALIZED_NAME_FKI_DISCUSSION_I_D)
  @javax.annotation.Nonnull
  private Integer fkiDiscussionID;

  public static final String SERIALIZED_NAME_I_EZSIGNDISCUSSION_X = "iEzsigndiscussionX";
  @SerializedName(SERIALIZED_NAME_I_EZSIGNDISCUSSION_X)
  @javax.annotation.Nonnull
  private Integer iEzsigndiscussionX;

  public static final String SERIALIZED_NAME_I_EZSIGNDISCUSSION_Y = "iEzsigndiscussionY";
  @SerializedName(SERIALIZED_NAME_I_EZSIGNDISCUSSION_Y)
  @javax.annotation.Nonnull
  private Integer iEzsigndiscussionY;

  public static final String SERIALIZED_NAME_I_EZSIGNDISCUSSION_PAGENUMBER = "iEzsigndiscussionPagenumber";
  @SerializedName(SERIALIZED_NAME_I_EZSIGNDISCUSSION_PAGENUMBER)
  @javax.annotation.Nonnull
  private Integer iEzsigndiscussionPagenumber;

  public static final String SERIALIZED_NAME_OBJ_DISCUSSION = "objDiscussion";
  @SerializedName(SERIALIZED_NAME_OBJ_DISCUSSION)
  @javax.annotation.Nonnull
  private DiscussionResponseCompound objDiscussion;

  public EzsigndiscussionResponse() {
  }

  public EzsigndiscussionResponse pkiEzsigndiscussionID(@javax.annotation.Nonnull Integer pkiEzsigndiscussionID) {
    this.pkiEzsigndiscussionID = pkiEzsigndiscussionID;
    return this;
  }

  /**
   * The unique ID of the Ezsigndiscussion
   * minimum: 0
   * maximum: 16777215
   * @return pkiEzsigndiscussionID
   */
  @javax.annotation.Nonnull
  public Integer getPkiEzsigndiscussionID() {
    return pkiEzsigndiscussionID;
  }

  public void setPkiEzsigndiscussionID(@javax.annotation.Nonnull Integer pkiEzsigndiscussionID) {
    this.pkiEzsigndiscussionID = pkiEzsigndiscussionID;
  }


  public EzsigndiscussionResponse fkiEzsignpageID(@javax.annotation.Nonnull Integer fkiEzsignpageID) {
    this.fkiEzsignpageID = fkiEzsignpageID;
    return this;
  }

  /**
   * The unique ID of the Ezsignpage
   * minimum: 0
   * @return fkiEzsignpageID
   */
  @javax.annotation.Nonnull
  public Integer getFkiEzsignpageID() {
    return fkiEzsignpageID;
  }

  public void setFkiEzsignpageID(@javax.annotation.Nonnull Integer fkiEzsignpageID) {
    this.fkiEzsignpageID = fkiEzsignpageID;
  }


  public EzsigndiscussionResponse fkiDiscussionID(@javax.annotation.Nonnull Integer fkiDiscussionID) {
    this.fkiDiscussionID = fkiDiscussionID;
    return this;
  }

  /**
   * The unique ID of the Discussion
   * minimum: 0
   * maximum: 16777215
   * @return fkiDiscussionID
   */
  @javax.annotation.Nonnull
  public Integer getFkiDiscussionID() {
    return fkiDiscussionID;
  }

  public void setFkiDiscussionID(@javax.annotation.Nonnull Integer fkiDiscussionID) {
    this.fkiDiscussionID = fkiDiscussionID;
  }


  public EzsigndiscussionResponse iEzsigndiscussionX(@javax.annotation.Nonnull Integer iEzsigndiscussionX) {
    this.iEzsigndiscussionX = iEzsigndiscussionX;
    return this;
  }

  /**
   * The x of the Ezsigndiscussion
   * minimum: 0
   * maximum: 65535
   * @return iEzsigndiscussionX
   */
  @javax.annotation.Nonnull
  public Integer getiEzsigndiscussionX() {
    return iEzsigndiscussionX;
  }

  public void setiEzsigndiscussionX(@javax.annotation.Nonnull Integer iEzsigndiscussionX) {
    this.iEzsigndiscussionX = iEzsigndiscussionX;
  }


  public EzsigndiscussionResponse iEzsigndiscussionY(@javax.annotation.Nonnull Integer iEzsigndiscussionY) {
    this.iEzsigndiscussionY = iEzsigndiscussionY;
    return this;
  }

  /**
   * The y of the Ezsigndiscussion
   * minimum: 0
   * maximum: 65535
   * @return iEzsigndiscussionY
   */
  @javax.annotation.Nonnull
  public Integer getiEzsigndiscussionY() {
    return iEzsigndiscussionY;
  }

  public void setiEzsigndiscussionY(@javax.annotation.Nonnull Integer iEzsigndiscussionY) {
    this.iEzsigndiscussionY = iEzsigndiscussionY;
  }


  public EzsigndiscussionResponse iEzsigndiscussionPagenumber(@javax.annotation.Nonnull Integer iEzsigndiscussionPagenumber) {
    this.iEzsigndiscussionPagenumber = iEzsigndiscussionPagenumber;
    return this;
  }

  /**
   * The page number in the Ezsigndocument for the Ezsigndiscussion
   * @return iEzsigndiscussionPagenumber
   */
  @javax.annotation.Nonnull
  public Integer getiEzsigndiscussionPagenumber() {
    return iEzsigndiscussionPagenumber;
  }

  public void setiEzsigndiscussionPagenumber(@javax.annotation.Nonnull Integer iEzsigndiscussionPagenumber) {
    this.iEzsigndiscussionPagenumber = iEzsigndiscussionPagenumber;
  }


  public EzsigndiscussionResponse objDiscussion(@javax.annotation.Nonnull DiscussionResponseCompound objDiscussion) {
    this.objDiscussion = objDiscussion;
    return this;
  }

  /**
   * Get objDiscussion
   * @return objDiscussion
   */
  @javax.annotation.Nonnull
  public DiscussionResponseCompound getObjDiscussion() {
    return objDiscussion;
  }

  public void setObjDiscussion(@javax.annotation.Nonnull DiscussionResponseCompound objDiscussion) {
    this.objDiscussion = objDiscussion;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsigndiscussionResponse ezsigndiscussionResponse = (EzsigndiscussionResponse) o;
    return Objects.equals(this.pkiEzsigndiscussionID, ezsigndiscussionResponse.pkiEzsigndiscussionID) &&
        Objects.equals(this.fkiEzsignpageID, ezsigndiscussionResponse.fkiEzsignpageID) &&
        Objects.equals(this.fkiDiscussionID, ezsigndiscussionResponse.fkiDiscussionID) &&
        Objects.equals(this.iEzsigndiscussionX, ezsigndiscussionResponse.iEzsigndiscussionX) &&
        Objects.equals(this.iEzsigndiscussionY, ezsigndiscussionResponse.iEzsigndiscussionY) &&
        Objects.equals(this.iEzsigndiscussionPagenumber, ezsigndiscussionResponse.iEzsigndiscussionPagenumber) &&
        Objects.equals(this.objDiscussion, ezsigndiscussionResponse.objDiscussion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pkiEzsigndiscussionID, fkiEzsignpageID, fkiDiscussionID, iEzsigndiscussionX, iEzsigndiscussionY, iEzsigndiscussionPagenumber, objDiscussion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsigndiscussionResponse {\n");
    sb.append("    pkiEzsigndiscussionID: ").append(toIndentedString(pkiEzsigndiscussionID)).append("\n");
    sb.append("    fkiEzsignpageID: ").append(toIndentedString(fkiEzsignpageID)).append("\n");
    sb.append("    fkiDiscussionID: ").append(toIndentedString(fkiDiscussionID)).append("\n");
    sb.append("    iEzsigndiscussionX: ").append(toIndentedString(iEzsigndiscussionX)).append("\n");
    sb.append("    iEzsigndiscussionY: ").append(toIndentedString(iEzsigndiscussionY)).append("\n");
    sb.append("    iEzsigndiscussionPagenumber: ").append(toIndentedString(iEzsigndiscussionPagenumber)).append("\n");
    sb.append("    objDiscussion: ").append(toIndentedString(objDiscussion)).append("\n");
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
    openapiFields.add("pkiEzsigndiscussionID");
    openapiFields.add("fkiEzsignpageID");
    openapiFields.add("fkiDiscussionID");
    openapiFields.add("iEzsigndiscussionX");
    openapiFields.add("iEzsigndiscussionY");
    openapiFields.add("iEzsigndiscussionPagenumber");
    openapiFields.add("objDiscussion");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("pkiEzsigndiscussionID");
    openapiRequiredFields.add("fkiEzsignpageID");
    openapiRequiredFields.add("fkiDiscussionID");
    openapiRequiredFields.add("iEzsigndiscussionX");
    openapiRequiredFields.add("iEzsigndiscussionY");
    openapiRequiredFields.add("iEzsigndiscussionPagenumber");
    openapiRequiredFields.add("objDiscussion");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EzsigndiscussionResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EzsigndiscussionResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EzsigndiscussionResponse is not found in the empty JSON string", EzsigndiscussionResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EzsigndiscussionResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EzsigndiscussionResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EzsigndiscussionResponse.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `objDiscussion`
      DiscussionResponseCompound.validateJsonElement(jsonObj.get("objDiscussion"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EzsigndiscussionResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EzsigndiscussionResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EzsigndiscussionResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EzsigndiscussionResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<EzsigndiscussionResponse>() {
           @Override
           public void write(JsonWriter out, EzsigndiscussionResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EzsigndiscussionResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EzsigndiscussionResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EzsigndiscussionResponse
   * @throws IOException if the JSON string is invalid with respect to EzsigndiscussionResponse
   */
  public static EzsigndiscussionResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EzsigndiscussionResponse.class);
  }

  /**
   * Convert an instance of EzsigndiscussionResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

