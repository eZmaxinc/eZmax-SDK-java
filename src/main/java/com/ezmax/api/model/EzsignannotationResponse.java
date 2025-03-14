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
import com.ezmax.api.model.EnumHorizontalalignment;
import com.ezmax.api.model.EnumVerticalalignment;
import com.ezmax.api.model.FieldEEzsignannotationType;
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
 * A Ezsignannotation Object
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-07T19:20:13.445471985Z[Etc/UTC]", comments = "Generator version: 7.12.0")
public class EzsignannotationResponse {
  public static final String SERIALIZED_NAME_PKI_EZSIGNANNOTATION_I_D = "pkiEzsignannotationID";
  @SerializedName(SERIALIZED_NAME_PKI_EZSIGNANNOTATION_I_D)
  @javax.annotation.Nonnull
  private Integer pkiEzsignannotationID;

  public static final String SERIALIZED_NAME_FKI_EZSIGNDOCUMENT_I_D = "fkiEzsigndocumentID";
  @SerializedName(SERIALIZED_NAME_FKI_EZSIGNDOCUMENT_I_D)
  @javax.annotation.Nonnull
  private Integer fkiEzsigndocumentID;

  public static final String SERIALIZED_NAME_E_EZSIGNANNOTATION_HORIZONTALALIGNMENT = "eEzsignannotationHorizontalalignment";
  @SerializedName(SERIALIZED_NAME_E_EZSIGNANNOTATION_HORIZONTALALIGNMENT)
  @javax.annotation.Nullable
  private EnumHorizontalalignment eEzsignannotationHorizontalalignment;

  public static final String SERIALIZED_NAME_E_EZSIGNANNOTATION_VERTICALALIGNMENT = "eEzsignannotationVerticalalignment";
  @SerializedName(SERIALIZED_NAME_E_EZSIGNANNOTATION_VERTICALALIGNMENT)
  @javax.annotation.Nullable
  private EnumVerticalalignment eEzsignannotationVerticalalignment;

  public static final String SERIALIZED_NAME_E_EZSIGNANNOTATION_TYPE = "eEzsignannotationType";
  @SerializedName(SERIALIZED_NAME_E_EZSIGNANNOTATION_TYPE)
  @javax.annotation.Nonnull
  private FieldEEzsignannotationType eEzsignannotationType;

  public static final String SERIALIZED_NAME_I_EZSIGNANNOTATION_X = "iEzsignannotationX";
  @SerializedName(SERIALIZED_NAME_I_EZSIGNANNOTATION_X)
  @javax.annotation.Nonnull
  private Integer iEzsignannotationX;

  public static final String SERIALIZED_NAME_I_EZSIGNANNOTATION_Y = "iEzsignannotationY";
  @SerializedName(SERIALIZED_NAME_I_EZSIGNANNOTATION_Y)
  @javax.annotation.Nonnull
  private Integer iEzsignannotationY;

  public static final String SERIALIZED_NAME_I_EZSIGNANNOTATION_WIDTH = "iEzsignannotationWidth";
  @SerializedName(SERIALIZED_NAME_I_EZSIGNANNOTATION_WIDTH)
  @javax.annotation.Nullable
  private Integer iEzsignannotationWidth;

  public static final String SERIALIZED_NAME_I_EZSIGNANNOTATION_HEIGHT = "iEzsignannotationHeight";
  @SerializedName(SERIALIZED_NAME_I_EZSIGNANNOTATION_HEIGHT)
  @javax.annotation.Nullable
  private Integer iEzsignannotationHeight;

  public static final String SERIALIZED_NAME_S_EZSIGNANNOTATION_TEXT = "sEzsignannotationText";
  @SerializedName(SERIALIZED_NAME_S_EZSIGNANNOTATION_TEXT)
  @javax.annotation.Nullable
  private String sEzsignannotationText;

  public static final String SERIALIZED_NAME_I_EZSIGNPAGE_PAGENUMBER = "iEzsignpagePagenumber";
  @SerializedName(SERIALIZED_NAME_I_EZSIGNPAGE_PAGENUMBER)
  @javax.annotation.Nonnull
  private Integer iEzsignpagePagenumber;

  public EzsignannotationResponse() {
  }

  public EzsignannotationResponse pkiEzsignannotationID(@javax.annotation.Nonnull Integer pkiEzsignannotationID) {
    this.pkiEzsignannotationID = pkiEzsignannotationID;
    return this;
  }

  /**
   * The unique ID of the Ezsignannotation
   * @return pkiEzsignannotationID
   */
  @javax.annotation.Nonnull
  public Integer getPkiEzsignannotationID() {
    return pkiEzsignannotationID;
  }

  public void setPkiEzsignannotationID(@javax.annotation.Nonnull Integer pkiEzsignannotationID) {
    this.pkiEzsignannotationID = pkiEzsignannotationID;
  }


  public EzsignannotationResponse fkiEzsigndocumentID(@javax.annotation.Nonnull Integer fkiEzsigndocumentID) {
    this.fkiEzsigndocumentID = fkiEzsigndocumentID;
    return this;
  }

  /**
   * The unique ID of the Ezsigndocument
   * minimum: 0
   * @return fkiEzsigndocumentID
   */
  @javax.annotation.Nonnull
  public Integer getFkiEzsigndocumentID() {
    return fkiEzsigndocumentID;
  }

  public void setFkiEzsigndocumentID(@javax.annotation.Nonnull Integer fkiEzsigndocumentID) {
    this.fkiEzsigndocumentID = fkiEzsigndocumentID;
  }


  public EzsignannotationResponse eEzsignannotationHorizontalalignment(@javax.annotation.Nullable EnumHorizontalalignment eEzsignannotationHorizontalalignment) {
    this.eEzsignannotationHorizontalalignment = eEzsignannotationHorizontalalignment;
    return this;
  }

  /**
   * Get eEzsignannotationHorizontalalignment
   * @return eEzsignannotationHorizontalalignment
   */
  @javax.annotation.Nullable
  public EnumHorizontalalignment geteEzsignannotationHorizontalalignment() {
    return eEzsignannotationHorizontalalignment;
  }

  public void seteEzsignannotationHorizontalalignment(@javax.annotation.Nullable EnumHorizontalalignment eEzsignannotationHorizontalalignment) {
    this.eEzsignannotationHorizontalalignment = eEzsignannotationHorizontalalignment;
  }


  public EzsignannotationResponse eEzsignannotationVerticalalignment(@javax.annotation.Nullable EnumVerticalalignment eEzsignannotationVerticalalignment) {
    this.eEzsignannotationVerticalalignment = eEzsignannotationVerticalalignment;
    return this;
  }

  /**
   * Get eEzsignannotationVerticalalignment
   * @return eEzsignannotationVerticalalignment
   */
  @javax.annotation.Nullable
  public EnumVerticalalignment geteEzsignannotationVerticalalignment() {
    return eEzsignannotationVerticalalignment;
  }

  public void seteEzsignannotationVerticalalignment(@javax.annotation.Nullable EnumVerticalalignment eEzsignannotationVerticalalignment) {
    this.eEzsignannotationVerticalalignment = eEzsignannotationVerticalalignment;
  }


  public EzsignannotationResponse eEzsignannotationType(@javax.annotation.Nonnull FieldEEzsignannotationType eEzsignannotationType) {
    this.eEzsignannotationType = eEzsignannotationType;
    return this;
  }

  /**
   * Get eEzsignannotationType
   * @return eEzsignannotationType
   */
  @javax.annotation.Nonnull
  public FieldEEzsignannotationType geteEzsignannotationType() {
    return eEzsignannotationType;
  }

  public void seteEzsignannotationType(@javax.annotation.Nonnull FieldEEzsignannotationType eEzsignannotationType) {
    this.eEzsignannotationType = eEzsignannotationType;
  }


  public EzsignannotationResponse iEzsignannotationX(@javax.annotation.Nonnull Integer iEzsignannotationX) {
    this.iEzsignannotationX = iEzsignannotationX;
    return this;
  }

  /**
   * The X coordinate (Horizontal) where to put the Ezsignannotation on the page.  Coordinate is calculated at 100dpi (dot per inch). So for example, if you want to put the Ezsignannotation 2 inches from the left border of the page, you would use \&quot;200\&quot; for the X coordinate.
   * minimum: 0
   * @return iEzsignannotationX
   */
  @javax.annotation.Nonnull
  public Integer getiEzsignannotationX() {
    return iEzsignannotationX;
  }

  public void setiEzsignannotationX(@javax.annotation.Nonnull Integer iEzsignannotationX) {
    this.iEzsignannotationX = iEzsignannotationX;
  }


  public EzsignannotationResponse iEzsignannotationY(@javax.annotation.Nonnull Integer iEzsignannotationY) {
    this.iEzsignannotationY = iEzsignannotationY;
    return this;
  }

  /**
   * The Y coordinate (Vertical) where to put the Ezsignannotation on the page.  Coordinate is calculated at 100dpi (dot per inch). So for example, if you want to put the Ezsignannotation 3 inches from the top border of the page, you would use \&quot;300\&quot; for the Y coordinate.
   * minimum: 0
   * @return iEzsignannotationY
   */
  @javax.annotation.Nonnull
  public Integer getiEzsignannotationY() {
    return iEzsignannotationY;
  }

  public void setiEzsignannotationY(@javax.annotation.Nonnull Integer iEzsignannotationY) {
    this.iEzsignannotationY = iEzsignannotationY;
  }


  public EzsignannotationResponse iEzsignannotationWidth(@javax.annotation.Nullable Integer iEzsignannotationWidth) {
    this.iEzsignannotationWidth = iEzsignannotationWidth;
    return this;
  }

  /**
   * The Width of the Ezsignannotation.  Width is calculated at 100dpi (dot per inch). So for example, if you want to have the width of the Ezsignannotation to be 3 inches, you would use \&quot;300\&quot; for the Width.
   * minimum: 0
   * @return iEzsignannotationWidth
   */
  @javax.annotation.Nullable
  public Integer getiEzsignannotationWidth() {
    return iEzsignannotationWidth;
  }

  public void setiEzsignannotationWidth(@javax.annotation.Nullable Integer iEzsignannotationWidth) {
    this.iEzsignannotationWidth = iEzsignannotationWidth;
  }


  public EzsignannotationResponse iEzsignannotationHeight(@javax.annotation.Nullable Integer iEzsignannotationHeight) {
    this.iEzsignannotationHeight = iEzsignannotationHeight;
    return this;
  }

  /**
   * The Height of the Ezsignannotation.  Height is calculated at 100dpi (dot per inch). So for example, if you want to have the height of the Ezsignannotation to be 2 inches, you would use \&quot;200\&quot; for the Height.  This can only be set if eEzsignannotationType is **StrikethroughBlock** or **Text**
   * minimum: 0
   * @return iEzsignannotationHeight
   */
  @javax.annotation.Nullable
  public Integer getiEzsignannotationHeight() {
    return iEzsignannotationHeight;
  }

  public void setiEzsignannotationHeight(@javax.annotation.Nullable Integer iEzsignannotationHeight) {
    this.iEzsignannotationHeight = iEzsignannotationHeight;
  }


  public EzsignannotationResponse sEzsignannotationText(@javax.annotation.Nullable String sEzsignannotationText) {
    this.sEzsignannotationText = sEzsignannotationText;
    return this;
  }

  /**
   * The Text of the Ezsignannotation
   * @return sEzsignannotationText
   */
  @javax.annotation.Nullable
  public String getsEzsignannotationText() {
    return sEzsignannotationText;
  }

  public void setsEzsignannotationText(@javax.annotation.Nullable String sEzsignannotationText) {
    this.sEzsignannotationText = sEzsignannotationText;
  }


  public EzsignannotationResponse iEzsignpagePagenumber(@javax.annotation.Nonnull Integer iEzsignpagePagenumber) {
    this.iEzsignpagePagenumber = iEzsignpagePagenumber;
    return this;
  }

  /**
   * The page number in the Ezsigndocument
   * minimum: 1
   * @return iEzsignpagePagenumber
   */
  @javax.annotation.Nonnull
  public Integer getiEzsignpagePagenumber() {
    return iEzsignpagePagenumber;
  }

  public void setiEzsignpagePagenumber(@javax.annotation.Nonnull Integer iEzsignpagePagenumber) {
    this.iEzsignpagePagenumber = iEzsignpagePagenumber;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignannotationResponse ezsignannotationResponse = (EzsignannotationResponse) o;
    return Objects.equals(this.pkiEzsignannotationID, ezsignannotationResponse.pkiEzsignannotationID) &&
        Objects.equals(this.fkiEzsigndocumentID, ezsignannotationResponse.fkiEzsigndocumentID) &&
        Objects.equals(this.eEzsignannotationHorizontalalignment, ezsignannotationResponse.eEzsignannotationHorizontalalignment) &&
        Objects.equals(this.eEzsignannotationVerticalalignment, ezsignannotationResponse.eEzsignannotationVerticalalignment) &&
        Objects.equals(this.eEzsignannotationType, ezsignannotationResponse.eEzsignannotationType) &&
        Objects.equals(this.iEzsignannotationX, ezsignannotationResponse.iEzsignannotationX) &&
        Objects.equals(this.iEzsignannotationY, ezsignannotationResponse.iEzsignannotationY) &&
        Objects.equals(this.iEzsignannotationWidth, ezsignannotationResponse.iEzsignannotationWidth) &&
        Objects.equals(this.iEzsignannotationHeight, ezsignannotationResponse.iEzsignannotationHeight) &&
        Objects.equals(this.sEzsignannotationText, ezsignannotationResponse.sEzsignannotationText) &&
        Objects.equals(this.iEzsignpagePagenumber, ezsignannotationResponse.iEzsignpagePagenumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pkiEzsignannotationID, fkiEzsigndocumentID, eEzsignannotationHorizontalalignment, eEzsignannotationVerticalalignment, eEzsignannotationType, iEzsignannotationX, iEzsignannotationY, iEzsignannotationWidth, iEzsignannotationHeight, sEzsignannotationText, iEzsignpagePagenumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignannotationResponse {\n");
    sb.append("    pkiEzsignannotationID: ").append(toIndentedString(pkiEzsignannotationID)).append("\n");
    sb.append("    fkiEzsigndocumentID: ").append(toIndentedString(fkiEzsigndocumentID)).append("\n");
    sb.append("    eEzsignannotationHorizontalalignment: ").append(toIndentedString(eEzsignannotationHorizontalalignment)).append("\n");
    sb.append("    eEzsignannotationVerticalalignment: ").append(toIndentedString(eEzsignannotationVerticalalignment)).append("\n");
    sb.append("    eEzsignannotationType: ").append(toIndentedString(eEzsignannotationType)).append("\n");
    sb.append("    iEzsignannotationX: ").append(toIndentedString(iEzsignannotationX)).append("\n");
    sb.append("    iEzsignannotationY: ").append(toIndentedString(iEzsignannotationY)).append("\n");
    sb.append("    iEzsignannotationWidth: ").append(toIndentedString(iEzsignannotationWidth)).append("\n");
    sb.append("    iEzsignannotationHeight: ").append(toIndentedString(iEzsignannotationHeight)).append("\n");
    sb.append("    sEzsignannotationText: ").append(toIndentedString(sEzsignannotationText)).append("\n");
    sb.append("    iEzsignpagePagenumber: ").append(toIndentedString(iEzsignpagePagenumber)).append("\n");
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
    openapiFields.add("pkiEzsignannotationID");
    openapiFields.add("fkiEzsigndocumentID");
    openapiFields.add("eEzsignannotationHorizontalalignment");
    openapiFields.add("eEzsignannotationVerticalalignment");
    openapiFields.add("eEzsignannotationType");
    openapiFields.add("iEzsignannotationX");
    openapiFields.add("iEzsignannotationY");
    openapiFields.add("iEzsignannotationWidth");
    openapiFields.add("iEzsignannotationHeight");
    openapiFields.add("sEzsignannotationText");
    openapiFields.add("iEzsignpagePagenumber");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("pkiEzsignannotationID");
    openapiRequiredFields.add("fkiEzsigndocumentID");
    openapiRequiredFields.add("eEzsignannotationType");
    openapiRequiredFields.add("iEzsignannotationX");
    openapiRequiredFields.add("iEzsignannotationY");
    openapiRequiredFields.add("iEzsignpagePagenumber");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EzsignannotationResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EzsignannotationResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EzsignannotationResponse is not found in the empty JSON string", EzsignannotationResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EzsignannotationResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EzsignannotationResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EzsignannotationResponse.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `eEzsignannotationHorizontalalignment`
      if (jsonObj.get("eEzsignannotationHorizontalalignment") != null && !jsonObj.get("eEzsignannotationHorizontalalignment").isJsonNull()) {
        EnumHorizontalalignment.validateJsonElement(jsonObj.get("eEzsignannotationHorizontalalignment"));
      }
      // validate the optional field `eEzsignannotationVerticalalignment`
      if (jsonObj.get("eEzsignannotationVerticalalignment") != null && !jsonObj.get("eEzsignannotationVerticalalignment").isJsonNull()) {
        EnumVerticalalignment.validateJsonElement(jsonObj.get("eEzsignannotationVerticalalignment"));
      }
      // validate the required field `eEzsignannotationType`
      FieldEEzsignannotationType.validateJsonElement(jsonObj.get("eEzsignannotationType"));
      if ((jsonObj.get("sEzsignannotationText") != null && !jsonObj.get("sEzsignannotationText").isJsonNull()) && !jsonObj.get("sEzsignannotationText").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sEzsignannotationText` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sEzsignannotationText").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EzsignannotationResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EzsignannotationResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EzsignannotationResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EzsignannotationResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<EzsignannotationResponse>() {
           @Override
           public void write(JsonWriter out, EzsignannotationResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EzsignannotationResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EzsignannotationResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EzsignannotationResponse
   * @throws IOException if the JSON string is invalid with respect to EzsignannotationResponse
   */
  public static EzsignannotationResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EzsignannotationResponse.class);
  }

  /**
   * Convert an instance of EzsignannotationResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

