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
 * An Address Object and children to create a complete structure
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-07T19:20:13.445471985Z[Etc/UTC]", comments = "Generator version: 7.12.0")
public class AddressResponseCompound {
  public static final String SERIALIZED_NAME_PKI_ADDRESS_I_D = "pkiAddressID";
  @SerializedName(SERIALIZED_NAME_PKI_ADDRESS_I_D)
  @javax.annotation.Nonnull
  private Integer pkiAddressID;

  public static final String SERIALIZED_NAME_FKI_ADDRESSTYPE_I_D = "fkiAddresstypeID";
  @SerializedName(SERIALIZED_NAME_FKI_ADDRESSTYPE_I_D)
  @javax.annotation.Nonnull
  private Integer fkiAddresstypeID;

  public static final String SERIALIZED_NAME_S_ADDRESS_CIVIC = "sAddressCivic";
  @SerializedName(SERIALIZED_NAME_S_ADDRESS_CIVIC)
  @javax.annotation.Nonnull
  private String sAddressCivic;

  public static final String SERIALIZED_NAME_S_ADDRESS_STREET = "sAddressStreet";
  @SerializedName(SERIALIZED_NAME_S_ADDRESS_STREET)
  @javax.annotation.Nonnull
  private String sAddressStreet;

  public static final String SERIALIZED_NAME_S_ADDRESS_SUITE = "sAddressSuite";
  @SerializedName(SERIALIZED_NAME_S_ADDRESS_SUITE)
  @javax.annotation.Nullable
  private String sAddressSuite;

  public static final String SERIALIZED_NAME_S_ADDRESS_CITY = "sAddressCity";
  @SerializedName(SERIALIZED_NAME_S_ADDRESS_CITY)
  @javax.annotation.Nonnull
  private String sAddressCity;

  public static final String SERIALIZED_NAME_FKI_PROVINCE_I_D = "fkiProvinceID";
  @SerializedName(SERIALIZED_NAME_FKI_PROVINCE_I_D)
  @javax.annotation.Nonnull
  private Integer fkiProvinceID;

  public static final String SERIALIZED_NAME_S_PROVINCE_NAME_X = "sProvinceNameX";
  @SerializedName(SERIALIZED_NAME_S_PROVINCE_NAME_X)
  @javax.annotation.Nonnull
  private String sProvinceNameX;

  public static final String SERIALIZED_NAME_FKI_COUNTRY_I_D = "fkiCountryID";
  @SerializedName(SERIALIZED_NAME_FKI_COUNTRY_I_D)
  @javax.annotation.Nonnull
  private Integer fkiCountryID;

  public static final String SERIALIZED_NAME_S_COUNTRY_NAME_X = "sCountryNameX";
  @SerializedName(SERIALIZED_NAME_S_COUNTRY_NAME_X)
  @javax.annotation.Nonnull
  private String sCountryNameX;

  public static final String SERIALIZED_NAME_S_ADDRESS_ZIP = "sAddressZip";
  @SerializedName(SERIALIZED_NAME_S_ADDRESS_ZIP)
  @javax.annotation.Nonnull
  private String sAddressZip;

  public static final String SERIALIZED_NAME_F_ADDRESS_LONGITUDE = "fAddressLongitude";
  @SerializedName(SERIALIZED_NAME_F_ADDRESS_LONGITUDE)
  @javax.annotation.Nullable
  private String fAddressLongitude;

  public static final String SERIALIZED_NAME_F_ADDRESS_LATITUDE = "fAddressLatitude";
  @SerializedName(SERIALIZED_NAME_F_ADDRESS_LATITUDE)
  @javax.annotation.Nullable
  private String fAddressLatitude;

  public AddressResponseCompound() {
  }

  public AddressResponseCompound pkiAddressID(@javax.annotation.Nonnull Integer pkiAddressID) {
    this.pkiAddressID = pkiAddressID;
    return this;
  }

  /**
   * The unique ID of the Address
   * minimum: 0
   * @return pkiAddressID
   */
  @javax.annotation.Nonnull
  public Integer getPkiAddressID() {
    return pkiAddressID;
  }

  public void setPkiAddressID(@javax.annotation.Nonnull Integer pkiAddressID) {
    this.pkiAddressID = pkiAddressID;
  }


  public AddressResponseCompound fkiAddresstypeID(@javax.annotation.Nonnull Integer fkiAddresstypeID) {
    this.fkiAddresstypeID = fkiAddresstypeID;
    return this;
  }

  /**
   * The unique ID of the Addresstype.  Valid values:  |Value|Description| |-|-| |1|Office| |2|Home| |3|Real Estate Invoice| |4|Invoicing| |5|Shipping|
   * minimum: 0
   * @return fkiAddresstypeID
   */
  @javax.annotation.Nonnull
  public Integer getFkiAddresstypeID() {
    return fkiAddresstypeID;
  }

  public void setFkiAddresstypeID(@javax.annotation.Nonnull Integer fkiAddresstypeID) {
    this.fkiAddresstypeID = fkiAddresstypeID;
  }


  public AddressResponseCompound sAddressCivic(@javax.annotation.Nonnull String sAddressCivic) {
    this.sAddressCivic = sAddressCivic;
    return this;
  }

  /**
   * The Civic number.
   * @return sAddressCivic
   */
  @javax.annotation.Nonnull
  public String getsAddressCivic() {
    return sAddressCivic;
  }

  public void setsAddressCivic(@javax.annotation.Nonnull String sAddressCivic) {
    this.sAddressCivic = sAddressCivic;
  }


  public AddressResponseCompound sAddressStreet(@javax.annotation.Nonnull String sAddressStreet) {
    this.sAddressStreet = sAddressStreet;
    return this;
  }

  /**
   * The Street Name
   * @return sAddressStreet
   */
  @javax.annotation.Nonnull
  public String getsAddressStreet() {
    return sAddressStreet;
  }

  public void setsAddressStreet(@javax.annotation.Nonnull String sAddressStreet) {
    this.sAddressStreet = sAddressStreet;
  }


  public AddressResponseCompound sAddressSuite(@javax.annotation.Nullable String sAddressSuite) {
    this.sAddressSuite = sAddressSuite;
    return this;
  }

  /**
   * The Suite or appartment number
   * @return sAddressSuite
   */
  @javax.annotation.Nullable
  public String getsAddressSuite() {
    return sAddressSuite;
  }

  public void setsAddressSuite(@javax.annotation.Nullable String sAddressSuite) {
    this.sAddressSuite = sAddressSuite;
  }


  public AddressResponseCompound sAddressCity(@javax.annotation.Nonnull String sAddressCity) {
    this.sAddressCity = sAddressCity;
    return this;
  }

  /**
   * The City name
   * @return sAddressCity
   */
  @javax.annotation.Nonnull
  public String getsAddressCity() {
    return sAddressCity;
  }

  public void setsAddressCity(@javax.annotation.Nonnull String sAddressCity) {
    this.sAddressCity = sAddressCity;
  }


  public AddressResponseCompound fkiProvinceID(@javax.annotation.Nonnull Integer fkiProvinceID) {
    this.fkiProvinceID = fkiProvinceID;
    return this;
  }

  /**
   * The unique ID of the Province.  Here are some common values (Complete list must be retrieved from API):  |Value|Description| |-|-| |1|(Canada) Alberta |2|(Canada) British Columbia| |3|(Canada) Manitoba| |3|(Canada) Manitoba| |4|(Canada) New Brunswick| |5|(Canada) Newfoundland| |6|(Canada) Northwest Territories| |7|(Canada) Nova Scotia| |8|(Canada) Nunavut| |9|(Canada) Ontario| |10|(Canada) Prince Edward Island| |11|(Canada) Quebec| |12|(Canada) Saskatchewan| |13|(Canada) Yukon| |14|(United-States) Alabama| |15|(United-States) Alaska| |16|(United-States) Arizona| |17|(United-States) Arkansas| |18|(United-States) California| |19|(United-States) Colorado| |20|(United-States) Connecticut| |21|(United-States) Delaware| |22|(United-States) District of Columbia| |23|(United-States) Florida| |24|(United-States) Georgia| |25|(United-States) Hawaii| |26|(United-States) Idaho| |27|(United-States) Illinois| |28|(United-States) Indiana| |29|(United-States) Iowa| |30|(United-States) Kansas| |31|(United-States) Kentucky| |32|(United-States) Louisiane| |33|(United-States) Maine| |34|(United-States) Maryland| |35|(United-States) Massachusetts| |36|(United-States) Michigan| |37|(United-States) Minnesota| |38|(United-States) Mississippi| |39|(United-States) Missouri| |40|(United-States) Montana| |41|(United-States) Nebraska| |42|(United-States) Nevada| |43|(United-States) New Hampshire| |44|(United-States) New Jersey| |45|(United-States) New Mexico| |46|(United-States) New York| |47|(United-States) North Carolina| |48|(United-States) North Dakota| |49|(United-States) Ohio| |50|(United-States) Oklahoma| |51|(United-States) Oregon| |52|(United-States) Pennsylvania| |53|(United-States) Rhode Island| |54|(United-States) South Carolina| |55|(United-States) South Dakota| |56|(United-States) Tennessee| |57|(United-States) Texas| |58|(United-States) Utah| |60|(United-States) Vermont| |59|(United-States) Virginia| |61|(United-States) Washington| |62|(United-States) West Virginia| |63|(United-States) Wisconsin| |64|(United-States) Wyoming|
   * minimum: 0
   * @return fkiProvinceID
   */
  @javax.annotation.Nonnull
  public Integer getFkiProvinceID() {
    return fkiProvinceID;
  }

  public void setFkiProvinceID(@javax.annotation.Nonnull Integer fkiProvinceID) {
    this.fkiProvinceID = fkiProvinceID;
  }


  public AddressResponseCompound sProvinceNameX(@javax.annotation.Nonnull String sProvinceNameX) {
    this.sProvinceNameX = sProvinceNameX;
    return this;
  }

  /**
   * The name of the Province in the language of the requester
   * @return sProvinceNameX
   */
  @javax.annotation.Nonnull
  public String getsProvinceNameX() {
    return sProvinceNameX;
  }

  public void setsProvinceNameX(@javax.annotation.Nonnull String sProvinceNameX) {
    this.sProvinceNameX = sProvinceNameX;
  }


  public AddressResponseCompound fkiCountryID(@javax.annotation.Nonnull Integer fkiCountryID) {
    this.fkiCountryID = fkiCountryID;
    return this;
  }

  /**
   * The unique ID of the Country.  Here are some common values (Complete list must be retrieved from API):  |Value|Description| |-|-| |1|Canada| |2|United-States|
   * minimum: 0
   * @return fkiCountryID
   */
  @javax.annotation.Nonnull
  public Integer getFkiCountryID() {
    return fkiCountryID;
  }

  public void setFkiCountryID(@javax.annotation.Nonnull Integer fkiCountryID) {
    this.fkiCountryID = fkiCountryID;
  }


  public AddressResponseCompound sCountryNameX(@javax.annotation.Nonnull String sCountryNameX) {
    this.sCountryNameX = sCountryNameX;
    return this;
  }

  /**
   * The name of the Country in the language of the requester
   * @return sCountryNameX
   */
  @javax.annotation.Nonnull
  public String getsCountryNameX() {
    return sCountryNameX;
  }

  public void setsCountryNameX(@javax.annotation.Nonnull String sCountryNameX) {
    this.sCountryNameX = sCountryNameX;
  }


  public AddressResponseCompound sAddressZip(@javax.annotation.Nonnull String sAddressZip) {
    this.sAddressZip = sAddressZip;
    return this;
  }

  /**
   * The Postal/Zip Code  The value must be entered without spaces
   * @return sAddressZip
   */
  @javax.annotation.Nonnull
  public String getsAddressZip() {
    return sAddressZip;
  }

  public void setsAddressZip(@javax.annotation.Nonnull String sAddressZip) {
    this.sAddressZip = sAddressZip;
  }


  public AddressResponseCompound fAddressLongitude(@javax.annotation.Nullable String fAddressLongitude) {
    this.fAddressLongitude = fAddressLongitude;
    return this;
  }

  /**
   * The Longitude of the Address
   * @return fAddressLongitude
   */
  @javax.annotation.Nullable
  public String getfAddressLongitude() {
    return fAddressLongitude;
  }

  public void setfAddressLongitude(@javax.annotation.Nullable String fAddressLongitude) {
    this.fAddressLongitude = fAddressLongitude;
  }


  public AddressResponseCompound fAddressLatitude(@javax.annotation.Nullable String fAddressLatitude) {
    this.fAddressLatitude = fAddressLatitude;
    return this;
  }

  /**
   * The Latitude of the Address
   * @return fAddressLatitude
   */
  @javax.annotation.Nullable
  public String getfAddressLatitude() {
    return fAddressLatitude;
  }

  public void setfAddressLatitude(@javax.annotation.Nullable String fAddressLatitude) {
    this.fAddressLatitude = fAddressLatitude;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressResponseCompound addressResponseCompound = (AddressResponseCompound) o;
    return Objects.equals(this.pkiAddressID, addressResponseCompound.pkiAddressID) &&
        Objects.equals(this.fkiAddresstypeID, addressResponseCompound.fkiAddresstypeID) &&
        Objects.equals(this.sAddressCivic, addressResponseCompound.sAddressCivic) &&
        Objects.equals(this.sAddressStreet, addressResponseCompound.sAddressStreet) &&
        Objects.equals(this.sAddressSuite, addressResponseCompound.sAddressSuite) &&
        Objects.equals(this.sAddressCity, addressResponseCompound.sAddressCity) &&
        Objects.equals(this.fkiProvinceID, addressResponseCompound.fkiProvinceID) &&
        Objects.equals(this.sProvinceNameX, addressResponseCompound.sProvinceNameX) &&
        Objects.equals(this.fkiCountryID, addressResponseCompound.fkiCountryID) &&
        Objects.equals(this.sCountryNameX, addressResponseCompound.sCountryNameX) &&
        Objects.equals(this.sAddressZip, addressResponseCompound.sAddressZip) &&
        Objects.equals(this.fAddressLongitude, addressResponseCompound.fAddressLongitude) &&
        Objects.equals(this.fAddressLatitude, addressResponseCompound.fAddressLatitude);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pkiAddressID, fkiAddresstypeID, sAddressCivic, sAddressStreet, sAddressSuite, sAddressCity, fkiProvinceID, sProvinceNameX, fkiCountryID, sCountryNameX, sAddressZip, fAddressLongitude, fAddressLatitude);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressResponseCompound {\n");
    sb.append("    pkiAddressID: ").append(toIndentedString(pkiAddressID)).append("\n");
    sb.append("    fkiAddresstypeID: ").append(toIndentedString(fkiAddresstypeID)).append("\n");
    sb.append("    sAddressCivic: ").append(toIndentedString(sAddressCivic)).append("\n");
    sb.append("    sAddressStreet: ").append(toIndentedString(sAddressStreet)).append("\n");
    sb.append("    sAddressSuite: ").append(toIndentedString(sAddressSuite)).append("\n");
    sb.append("    sAddressCity: ").append(toIndentedString(sAddressCity)).append("\n");
    sb.append("    fkiProvinceID: ").append(toIndentedString(fkiProvinceID)).append("\n");
    sb.append("    sProvinceNameX: ").append(toIndentedString(sProvinceNameX)).append("\n");
    sb.append("    fkiCountryID: ").append(toIndentedString(fkiCountryID)).append("\n");
    sb.append("    sCountryNameX: ").append(toIndentedString(sCountryNameX)).append("\n");
    sb.append("    sAddressZip: ").append(toIndentedString(sAddressZip)).append("\n");
    sb.append("    fAddressLongitude: ").append(toIndentedString(fAddressLongitude)).append("\n");
    sb.append("    fAddressLatitude: ").append(toIndentedString(fAddressLatitude)).append("\n");
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
    openapiFields.add("pkiAddressID");
    openapiFields.add("fkiAddresstypeID");
    openapiFields.add("sAddressCivic");
    openapiFields.add("sAddressStreet");
    openapiFields.add("sAddressSuite");
    openapiFields.add("sAddressCity");
    openapiFields.add("fkiProvinceID");
    openapiFields.add("sProvinceNameX");
    openapiFields.add("fkiCountryID");
    openapiFields.add("sCountryNameX");
    openapiFields.add("sAddressZip");
    openapiFields.add("fAddressLongitude");
    openapiFields.add("fAddressLatitude");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("pkiAddressID");
    openapiRequiredFields.add("fkiAddresstypeID");
    openapiRequiredFields.add("sAddressCivic");
    openapiRequiredFields.add("sAddressStreet");
    openapiRequiredFields.add("sAddressCity");
    openapiRequiredFields.add("fkiProvinceID");
    openapiRequiredFields.add("sProvinceNameX");
    openapiRequiredFields.add("fkiCountryID");
    openapiRequiredFields.add("sCountryNameX");
    openapiRequiredFields.add("sAddressZip");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AddressResponseCompound
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AddressResponseCompound.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AddressResponseCompound is not found in the empty JSON string", AddressResponseCompound.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AddressResponseCompound.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AddressResponseCompound` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AddressResponseCompound.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("sAddressCivic").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sAddressCivic` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sAddressCivic").toString()));
      }
      if (!jsonObj.get("sAddressStreet").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sAddressStreet` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sAddressStreet").toString()));
      }
      if ((jsonObj.get("sAddressSuite") != null && !jsonObj.get("sAddressSuite").isJsonNull()) && !jsonObj.get("sAddressSuite").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sAddressSuite` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sAddressSuite").toString()));
      }
      if (!jsonObj.get("sAddressCity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sAddressCity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sAddressCity").toString()));
      }
      if (!jsonObj.get("sProvinceNameX").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sProvinceNameX` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sProvinceNameX").toString()));
      }
      if (!jsonObj.get("sCountryNameX").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sCountryNameX` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sCountryNameX").toString()));
      }
      if (!jsonObj.get("sAddressZip").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sAddressZip` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sAddressZip").toString()));
      }
      if ((jsonObj.get("fAddressLongitude") != null && !jsonObj.get("fAddressLongitude").isJsonNull()) && !jsonObj.get("fAddressLongitude").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fAddressLongitude` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fAddressLongitude").toString()));
      }
      if ((jsonObj.get("fAddressLatitude") != null && !jsonObj.get("fAddressLatitude").isJsonNull()) && !jsonObj.get("fAddressLatitude").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fAddressLatitude` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fAddressLatitude").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AddressResponseCompound.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AddressResponseCompound' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AddressResponseCompound> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AddressResponseCompound.class));

       return (TypeAdapter<T>) new TypeAdapter<AddressResponseCompound>() {
           @Override
           public void write(JsonWriter out, AddressResponseCompound value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AddressResponseCompound read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AddressResponseCompound given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AddressResponseCompound
   * @throws IOException if the JSON string is invalid with respect to AddressResponseCompound
   */
  public static AddressResponseCompound fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AddressResponseCompound.class);
  }

  /**
   * Convert an instance of AddressResponseCompound to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

