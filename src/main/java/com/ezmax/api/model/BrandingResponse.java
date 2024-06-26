/*
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.2.0
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ezmax.api.model;

import java.util.Objects;
import com.ezmax.api.model.FieldEBrandingLogo;
import com.ezmax.api.model.FieldEBrandingLogointerface;
import com.ezmax.api.model.MultilingualBrandingDescription;
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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import eZmaxAPI.JSON;

/**
 * A Branding Object
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-14T20:13:03.553513468Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class BrandingResponse {
  public static final String SERIALIZED_NAME_PKI_BRANDING_I_D = "pkiBrandingID";
  @SerializedName(SERIALIZED_NAME_PKI_BRANDING_I_D)
  private Integer pkiBrandingID;

  public static final String SERIALIZED_NAME_FKI_EMAIL_I_D = "fkiEmailID";
  @SerializedName(SERIALIZED_NAME_FKI_EMAIL_I_D)
  private Integer fkiEmailID;

  public static final String SERIALIZED_NAME_OBJ_BRANDING_DESCRIPTION = "objBrandingDescription";
  @SerializedName(SERIALIZED_NAME_OBJ_BRANDING_DESCRIPTION)
  private MultilingualBrandingDescription objBrandingDescription;

  public static final String SERIALIZED_NAME_S_BRANDING_DESCRIPTION_X = "sBrandingDescriptionX";
  @SerializedName(SERIALIZED_NAME_S_BRANDING_DESCRIPTION_X)
  private String sBrandingDescriptionX;

  public static final String SERIALIZED_NAME_S_BRANDING_NAME = "sBrandingName";
  @SerializedName(SERIALIZED_NAME_S_BRANDING_NAME)
  private String sBrandingName;

  public static final String SERIALIZED_NAME_S_EMAIL_ADDRESS = "sEmailAddress";
  @SerializedName(SERIALIZED_NAME_S_EMAIL_ADDRESS)
  private String sEmailAddress;

  public static final String SERIALIZED_NAME_E_BRANDING_LOGO = "eBrandingLogo";
  @SerializedName(SERIALIZED_NAME_E_BRANDING_LOGO)
  private FieldEBrandingLogo eBrandingLogo;

  public static final String SERIALIZED_NAME_E_BRANDING_LOGOINTERFACE = "eBrandingLogointerface";
  @SerializedName(SERIALIZED_NAME_E_BRANDING_LOGOINTERFACE)
  private FieldEBrandingLogointerface eBrandingLogointerface = FieldEBrandingLogointerface.DEFAULT;

  public static final String SERIALIZED_NAME_I_BRANDING_COLORTEXT = "iBrandingColortext";
  @SerializedName(SERIALIZED_NAME_I_BRANDING_COLORTEXT)
  private Integer iBrandingColortext;

  public static final String SERIALIZED_NAME_I_BRANDING_COLORTEXTLINKBOX = "iBrandingColortextlinkbox";
  @SerializedName(SERIALIZED_NAME_I_BRANDING_COLORTEXTLINKBOX)
  private Integer iBrandingColortextlinkbox;

  public static final String SERIALIZED_NAME_I_BRANDING_COLORTEXTBUTTON = "iBrandingColortextbutton";
  @SerializedName(SERIALIZED_NAME_I_BRANDING_COLORTEXTBUTTON)
  private Integer iBrandingColortextbutton;

  public static final String SERIALIZED_NAME_I_BRANDING_COLORBACKGROUND = "iBrandingColorbackground";
  @SerializedName(SERIALIZED_NAME_I_BRANDING_COLORBACKGROUND)
  private Integer iBrandingColorbackground;

  public static final String SERIALIZED_NAME_I_BRANDING_COLORBACKGROUNDBUTTON = "iBrandingColorbackgroundbutton";
  @SerializedName(SERIALIZED_NAME_I_BRANDING_COLORBACKGROUNDBUTTON)
  private Integer iBrandingColorbackgroundbutton;

  public static final String SERIALIZED_NAME_I_BRANDING_COLORBACKGROUNDSMALLBOX = "iBrandingColorbackgroundsmallbox";
  @SerializedName(SERIALIZED_NAME_I_BRANDING_COLORBACKGROUNDSMALLBOX)
  private Integer iBrandingColorbackgroundsmallbox;

  public static final String SERIALIZED_NAME_I_BRANDING_INTERFACECOLOR = "iBrandingInterfacecolor";
  @SerializedName(SERIALIZED_NAME_I_BRANDING_INTERFACECOLOR)
  private Integer iBrandingInterfacecolor;

  public static final String SERIALIZED_NAME_B_BRANDING_ISACTIVE = "bBrandingIsactive";
  @SerializedName(SERIALIZED_NAME_B_BRANDING_ISACTIVE)
  private Boolean bBrandingIsactive;

  public BrandingResponse() {
  }

  public BrandingResponse pkiBrandingID(Integer pkiBrandingID) {
    this.pkiBrandingID = pkiBrandingID;
    return this;
  }

   /**
   * The unique ID of the Branding
   * minimum: 0
   * @return pkiBrandingID
  **/
  @javax.annotation.Nonnull
  public Integer getPkiBrandingID() {
    return pkiBrandingID;
  }

  public void setPkiBrandingID(Integer pkiBrandingID) {
    this.pkiBrandingID = pkiBrandingID;
  }


  public BrandingResponse fkiEmailID(Integer fkiEmailID) {
    this.fkiEmailID = fkiEmailID;
    return this;
  }

   /**
   * The unique ID of the Email
   * minimum: 1
   * maximum: 16777215
   * @return fkiEmailID
  **/
  @javax.annotation.Nullable
  public Integer getFkiEmailID() {
    return fkiEmailID;
  }

  public void setFkiEmailID(Integer fkiEmailID) {
    this.fkiEmailID = fkiEmailID;
  }


  public BrandingResponse objBrandingDescription(MultilingualBrandingDescription objBrandingDescription) {
    this.objBrandingDescription = objBrandingDescription;
    return this;
  }

   /**
   * Get objBrandingDescription
   * @return objBrandingDescription
  **/
  @javax.annotation.Nonnull
  public MultilingualBrandingDescription getObjBrandingDescription() {
    return objBrandingDescription;
  }

  public void setObjBrandingDescription(MultilingualBrandingDescription objBrandingDescription) {
    this.objBrandingDescription = objBrandingDescription;
  }


  public BrandingResponse sBrandingDescriptionX(String sBrandingDescriptionX) {
    this.sBrandingDescriptionX = sBrandingDescriptionX;
    return this;
  }

   /**
   * The Description of the Branding in the language of the requester
   * @return sBrandingDescriptionX
  **/
  @javax.annotation.Nonnull
  public String getsBrandingDescriptionX() {
    return sBrandingDescriptionX;
  }

  public void setsBrandingDescriptionX(String sBrandingDescriptionX) {
    this.sBrandingDescriptionX = sBrandingDescriptionX;
  }


  public BrandingResponse sBrandingName(String sBrandingName) {
    this.sBrandingName = sBrandingName;
    return this;
  }

   /**
   * The name of the Branding  This value will only be set if you wish to overwrite the default name. If you want to keep the default name, leave this property empty
   * @return sBrandingName
  **/
  @javax.annotation.Nullable
  public String getsBrandingName() {
    return sBrandingName;
  }

  public void setsBrandingName(String sBrandingName) {
    this.sBrandingName = sBrandingName;
  }


  public BrandingResponse sEmailAddress(String sEmailAddress) {
    this.sEmailAddress = sEmailAddress;
    return this;
  }

   /**
   * The email address.
   * @return sEmailAddress
  **/
  @javax.annotation.Nullable
  public String getsEmailAddress() {
    return sEmailAddress;
  }

  public void setsEmailAddress(String sEmailAddress) {
    this.sEmailAddress = sEmailAddress;
  }


  public BrandingResponse eBrandingLogo(FieldEBrandingLogo eBrandingLogo) {
    this.eBrandingLogo = eBrandingLogo;
    return this;
  }

   /**
   * Get eBrandingLogo
   * @return eBrandingLogo
  **/
  @javax.annotation.Nonnull
  public FieldEBrandingLogo geteBrandingLogo() {
    return eBrandingLogo;
  }

  public void seteBrandingLogo(FieldEBrandingLogo eBrandingLogo) {
    this.eBrandingLogo = eBrandingLogo;
  }


  public BrandingResponse eBrandingLogointerface(FieldEBrandingLogointerface eBrandingLogointerface) {
    this.eBrandingLogointerface = eBrandingLogointerface;
    return this;
  }

   /**
   * Get eBrandingLogointerface
   * @return eBrandingLogointerface
  **/
  @javax.annotation.Nullable
  public FieldEBrandingLogointerface geteBrandingLogointerface() {
    return eBrandingLogointerface;
  }

  public void seteBrandingLogointerface(FieldEBrandingLogointerface eBrandingLogointerface) {
    this.eBrandingLogointerface = eBrandingLogointerface;
  }


  public BrandingResponse iBrandingColortext(Integer iBrandingColortext) {
    this.iBrandingColortext = iBrandingColortext;
    return this;
  }

   /**
   * The color of the text. This is a RGB color converted into integer
   * minimum: 0
   * maximum: 16777215
   * @return iBrandingColortext
  **/
  @javax.annotation.Nonnull
  public Integer getiBrandingColortext() {
    return iBrandingColortext;
  }

  public void setiBrandingColortext(Integer iBrandingColortext) {
    this.iBrandingColortext = iBrandingColortext;
  }


  public BrandingResponse iBrandingColortextlinkbox(Integer iBrandingColortextlinkbox) {
    this.iBrandingColortextlinkbox = iBrandingColortextlinkbox;
    return this;
  }

   /**
   * The color of the text in the link box. This is a RGB color converted into integer
   * minimum: 0
   * maximum: 16777215
   * @return iBrandingColortextlinkbox
  **/
  @javax.annotation.Nonnull
  public Integer getiBrandingColortextlinkbox() {
    return iBrandingColortextlinkbox;
  }

  public void setiBrandingColortextlinkbox(Integer iBrandingColortextlinkbox) {
    this.iBrandingColortextlinkbox = iBrandingColortextlinkbox;
  }


  public BrandingResponse iBrandingColortextbutton(Integer iBrandingColortextbutton) {
    this.iBrandingColortextbutton = iBrandingColortextbutton;
    return this;
  }

   /**
   * The color of the text in the button. This is a RGB color converted into integer
   * minimum: 0
   * maximum: 16777215
   * @return iBrandingColortextbutton
  **/
  @javax.annotation.Nonnull
  public Integer getiBrandingColortextbutton() {
    return iBrandingColortextbutton;
  }

  public void setiBrandingColortextbutton(Integer iBrandingColortextbutton) {
    this.iBrandingColortextbutton = iBrandingColortextbutton;
  }


  public BrandingResponse iBrandingColorbackground(Integer iBrandingColorbackground) {
    this.iBrandingColorbackground = iBrandingColorbackground;
    return this;
  }

   /**
   * The color of the background. This is a RGB color converted into integer
   * minimum: 0
   * maximum: 16777215
   * @return iBrandingColorbackground
  **/
  @javax.annotation.Nonnull
  public Integer getiBrandingColorbackground() {
    return iBrandingColorbackground;
  }

  public void setiBrandingColorbackground(Integer iBrandingColorbackground) {
    this.iBrandingColorbackground = iBrandingColorbackground;
  }


  public BrandingResponse iBrandingColorbackgroundbutton(Integer iBrandingColorbackgroundbutton) {
    this.iBrandingColorbackgroundbutton = iBrandingColorbackgroundbutton;
    return this;
  }

   /**
   * The color of the background of the button. This is a RGB color converted into integer
   * minimum: 0
   * maximum: 16777215
   * @return iBrandingColorbackgroundbutton
  **/
  @javax.annotation.Nonnull
  public Integer getiBrandingColorbackgroundbutton() {
    return iBrandingColorbackgroundbutton;
  }

  public void setiBrandingColorbackgroundbutton(Integer iBrandingColorbackgroundbutton) {
    this.iBrandingColorbackgroundbutton = iBrandingColorbackgroundbutton;
  }


  public BrandingResponse iBrandingColorbackgroundsmallbox(Integer iBrandingColorbackgroundsmallbox) {
    this.iBrandingColorbackgroundsmallbox = iBrandingColorbackgroundsmallbox;
    return this;
  }

   /**
   * The color of the background of the small box. This is a RGB color converted into integer
   * minimum: 0
   * maximum: 16777215
   * @return iBrandingColorbackgroundsmallbox
  **/
  @javax.annotation.Nonnull
  public Integer getiBrandingColorbackgroundsmallbox() {
    return iBrandingColorbackgroundsmallbox;
  }

  public void setiBrandingColorbackgroundsmallbox(Integer iBrandingColorbackgroundsmallbox) {
    this.iBrandingColorbackgroundsmallbox = iBrandingColorbackgroundsmallbox;
  }


  public BrandingResponse iBrandingInterfacecolor(Integer iBrandingInterfacecolor) {
    this.iBrandingInterfacecolor = iBrandingInterfacecolor;
    return this;
  }

   /**
   * The color of the interface. This is a RGB color converted into integer
   * minimum: 0
   * maximum: 16777215
   * @return iBrandingInterfacecolor
  **/
  @javax.annotation.Nullable
  public Integer getiBrandingInterfacecolor() {
    return iBrandingInterfacecolor;
  }

  public void setiBrandingInterfacecolor(Integer iBrandingInterfacecolor) {
    this.iBrandingInterfacecolor = iBrandingInterfacecolor;
  }


  public BrandingResponse bBrandingIsactive(Boolean bBrandingIsactive) {
    this.bBrandingIsactive = bBrandingIsactive;
    return this;
  }

   /**
   * Whether the Branding is active or not
   * @return bBrandingIsactive
  **/
  @javax.annotation.Nonnull
  public Boolean getbBrandingIsactive() {
    return bBrandingIsactive;
  }

  public void setbBrandingIsactive(Boolean bBrandingIsactive) {
    this.bBrandingIsactive = bBrandingIsactive;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandingResponse brandingResponse = (BrandingResponse) o;
    return Objects.equals(this.pkiBrandingID, brandingResponse.pkiBrandingID) &&
        Objects.equals(this.fkiEmailID, brandingResponse.fkiEmailID) &&
        Objects.equals(this.objBrandingDescription, brandingResponse.objBrandingDescription) &&
        Objects.equals(this.sBrandingDescriptionX, brandingResponse.sBrandingDescriptionX) &&
        Objects.equals(this.sBrandingName, brandingResponse.sBrandingName) &&
        Objects.equals(this.sEmailAddress, brandingResponse.sEmailAddress) &&
        Objects.equals(this.eBrandingLogo, brandingResponse.eBrandingLogo) &&
        Objects.equals(this.eBrandingLogointerface, brandingResponse.eBrandingLogointerface) &&
        Objects.equals(this.iBrandingColortext, brandingResponse.iBrandingColortext) &&
        Objects.equals(this.iBrandingColortextlinkbox, brandingResponse.iBrandingColortextlinkbox) &&
        Objects.equals(this.iBrandingColortextbutton, brandingResponse.iBrandingColortextbutton) &&
        Objects.equals(this.iBrandingColorbackground, brandingResponse.iBrandingColorbackground) &&
        Objects.equals(this.iBrandingColorbackgroundbutton, brandingResponse.iBrandingColorbackgroundbutton) &&
        Objects.equals(this.iBrandingColorbackgroundsmallbox, brandingResponse.iBrandingColorbackgroundsmallbox) &&
        Objects.equals(this.iBrandingInterfacecolor, brandingResponse.iBrandingInterfacecolor) &&
        Objects.equals(this.bBrandingIsactive, brandingResponse.bBrandingIsactive);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pkiBrandingID, fkiEmailID, objBrandingDescription, sBrandingDescriptionX, sBrandingName, sEmailAddress, eBrandingLogo, eBrandingLogointerface, iBrandingColortext, iBrandingColortextlinkbox, iBrandingColortextbutton, iBrandingColorbackground, iBrandingColorbackgroundbutton, iBrandingColorbackgroundsmallbox, iBrandingInterfacecolor, bBrandingIsactive);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandingResponse {\n");
    sb.append("    pkiBrandingID: ").append(toIndentedString(pkiBrandingID)).append("\n");
    sb.append("    fkiEmailID: ").append(toIndentedString(fkiEmailID)).append("\n");
    sb.append("    objBrandingDescription: ").append(toIndentedString(objBrandingDescription)).append("\n");
    sb.append("    sBrandingDescriptionX: ").append(toIndentedString(sBrandingDescriptionX)).append("\n");
    sb.append("    sBrandingName: ").append(toIndentedString(sBrandingName)).append("\n");
    sb.append("    sEmailAddress: ").append(toIndentedString(sEmailAddress)).append("\n");
    sb.append("    eBrandingLogo: ").append(toIndentedString(eBrandingLogo)).append("\n");
    sb.append("    eBrandingLogointerface: ").append(toIndentedString(eBrandingLogointerface)).append("\n");
    sb.append("    iBrandingColortext: ").append(toIndentedString(iBrandingColortext)).append("\n");
    sb.append("    iBrandingColortextlinkbox: ").append(toIndentedString(iBrandingColortextlinkbox)).append("\n");
    sb.append("    iBrandingColortextbutton: ").append(toIndentedString(iBrandingColortextbutton)).append("\n");
    sb.append("    iBrandingColorbackground: ").append(toIndentedString(iBrandingColorbackground)).append("\n");
    sb.append("    iBrandingColorbackgroundbutton: ").append(toIndentedString(iBrandingColorbackgroundbutton)).append("\n");
    sb.append("    iBrandingColorbackgroundsmallbox: ").append(toIndentedString(iBrandingColorbackgroundsmallbox)).append("\n");
    sb.append("    iBrandingInterfacecolor: ").append(toIndentedString(iBrandingInterfacecolor)).append("\n");
    sb.append("    bBrandingIsactive: ").append(toIndentedString(bBrandingIsactive)).append("\n");
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
    openapiFields.add("pkiBrandingID");
    openapiFields.add("fkiEmailID");
    openapiFields.add("objBrandingDescription");
    openapiFields.add("sBrandingDescriptionX");
    openapiFields.add("sBrandingName");
    openapiFields.add("sEmailAddress");
    openapiFields.add("eBrandingLogo");
    openapiFields.add("eBrandingLogointerface");
    openapiFields.add("iBrandingColortext");
    openapiFields.add("iBrandingColortextlinkbox");
    openapiFields.add("iBrandingColortextbutton");
    openapiFields.add("iBrandingColorbackground");
    openapiFields.add("iBrandingColorbackgroundbutton");
    openapiFields.add("iBrandingColorbackgroundsmallbox");
    openapiFields.add("iBrandingInterfacecolor");
    openapiFields.add("bBrandingIsactive");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("pkiBrandingID");
    openapiRequiredFields.add("objBrandingDescription");
    openapiRequiredFields.add("sBrandingDescriptionX");
    openapiRequiredFields.add("eBrandingLogo");
    openapiRequiredFields.add("iBrandingColortext");
    openapiRequiredFields.add("iBrandingColortextlinkbox");
    openapiRequiredFields.add("iBrandingColortextbutton");
    openapiRequiredFields.add("iBrandingColorbackground");
    openapiRequiredFields.add("iBrandingColorbackgroundbutton");
    openapiRequiredFields.add("iBrandingColorbackgroundsmallbox");
    openapiRequiredFields.add("bBrandingIsactive");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to BrandingResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BrandingResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BrandingResponse is not found in the empty JSON string", BrandingResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!BrandingResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BrandingResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : BrandingResponse.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `objBrandingDescription`
      MultilingualBrandingDescription.validateJsonElement(jsonObj.get("objBrandingDescription"));
      if (!jsonObj.get("sBrandingDescriptionX").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sBrandingDescriptionX` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sBrandingDescriptionX").toString()));
      }
      if ((jsonObj.get("sBrandingName") != null && !jsonObj.get("sBrandingName").isJsonNull()) && !jsonObj.get("sBrandingName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sBrandingName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sBrandingName").toString()));
      }
      if ((jsonObj.get("sEmailAddress") != null && !jsonObj.get("sEmailAddress").isJsonNull()) && !jsonObj.get("sEmailAddress").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sEmailAddress` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sEmailAddress").toString()));
      }
      // validate the required field `eBrandingLogo`
      FieldEBrandingLogo.validateJsonElement(jsonObj.get("eBrandingLogo"));
      // validate the optional field `eBrandingLogointerface`
      if (jsonObj.get("eBrandingLogointerface") != null && !jsonObj.get("eBrandingLogointerface").isJsonNull()) {
        FieldEBrandingLogointerface.validateJsonElement(jsonObj.get("eBrandingLogointerface"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BrandingResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BrandingResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BrandingResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BrandingResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<BrandingResponse>() {
           @Override
           public void write(JsonWriter out, BrandingResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BrandingResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BrandingResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BrandingResponse
  * @throws IOException if the JSON string is invalid with respect to BrandingResponse
  */
  public static BrandingResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BrandingResponse.class);
  }

 /**
  * Convert an instance of BrandingResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

