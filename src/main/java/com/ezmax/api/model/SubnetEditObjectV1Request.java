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
import com.ezmax.api.model.SubnetRequestCompound;
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
 * Request for PUT /1/object/subnet/{pkiSubnetID}
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-07T19:20:13.445471985Z[Etc/UTC]", comments = "Generator version: 7.12.0")
public class SubnetEditObjectV1Request {
  public static final String SERIALIZED_NAME_OBJ_SUBNET = "objSubnet";
  @SerializedName(SERIALIZED_NAME_OBJ_SUBNET)
  @javax.annotation.Nonnull
  private SubnetRequestCompound objSubnet;

  public SubnetEditObjectV1Request() {
  }

  public SubnetEditObjectV1Request objSubnet(@javax.annotation.Nonnull SubnetRequestCompound objSubnet) {
    this.objSubnet = objSubnet;
    return this;
  }

  /**
   * Get objSubnet
   * @return objSubnet
   */
  @javax.annotation.Nonnull
  public SubnetRequestCompound getObjSubnet() {
    return objSubnet;
  }

  public void setObjSubnet(@javax.annotation.Nonnull SubnetRequestCompound objSubnet) {
    this.objSubnet = objSubnet;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubnetEditObjectV1Request subnetEditObjectV1Request = (SubnetEditObjectV1Request) o;
    return Objects.equals(this.objSubnet, subnetEditObjectV1Request.objSubnet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objSubnet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubnetEditObjectV1Request {\n");
    sb.append("    objSubnet: ").append(toIndentedString(objSubnet)).append("\n");
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
    openapiFields.add("objSubnet");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("objSubnet");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SubnetEditObjectV1Request
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SubnetEditObjectV1Request.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SubnetEditObjectV1Request is not found in the empty JSON string", SubnetEditObjectV1Request.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SubnetEditObjectV1Request.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SubnetEditObjectV1Request` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SubnetEditObjectV1Request.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `objSubnet`
      SubnetRequestCompound.validateJsonElement(jsonObj.get("objSubnet"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SubnetEditObjectV1Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SubnetEditObjectV1Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SubnetEditObjectV1Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SubnetEditObjectV1Request.class));

       return (TypeAdapter<T>) new TypeAdapter<SubnetEditObjectV1Request>() {
           @Override
           public void write(JsonWriter out, SubnetEditObjectV1Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SubnetEditObjectV1Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of SubnetEditObjectV1Request given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SubnetEditObjectV1Request
   * @throws IOException if the JSON string is invalid with respect to SubnetEditObjectV1Request
   */
  public static SubnetEditObjectV1Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SubnetEditObjectV1Request.class);
  }

  /**
   * Convert an instance of SubnetEditObjectV1Request to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

