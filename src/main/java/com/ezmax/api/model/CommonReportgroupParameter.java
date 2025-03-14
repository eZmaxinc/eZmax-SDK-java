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
 * A parameter of Reportgroup 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-07T19:20:13.445471985Z[Etc/UTC]", comments = "Generator version: 7.12.0")
public class CommonReportgroupParameter {
  public static final String SERIALIZED_NAME_S_REPORTGROUP_PARAMETER_NAME = "sReportgroupParameterName";
  @SerializedName(SERIALIZED_NAME_S_REPORTGROUP_PARAMETER_NAME)
  @javax.annotation.Nonnull
  private String sReportgroupParameterName;

  public static final String SERIALIZED_NAME_S_REPORTGROUP_PARAMETER_VALUE = "sReportgroupParameterValue";
  @SerializedName(SERIALIZED_NAME_S_REPORTGROUP_PARAMETER_VALUE)
  @javax.annotation.Nullable
  private String sReportgroupParameterValue;

  public static final String SERIALIZED_NAME_A_S_REPORTGROUP_PARAMETER_VALUE = "a_sReportgroupParameterValue";
  @SerializedName(SERIALIZED_NAME_A_S_REPORTGROUP_PARAMETER_VALUE)
  @javax.annotation.Nullable
  private List<String> aSReportgroupParameterValue = new ArrayList<>();

  public CommonReportgroupParameter() {
  }

  public CommonReportgroupParameter sReportgroupParameterName(@javax.annotation.Nonnull String sReportgroupParameterName) {
    this.sReportgroupParameterName = sReportgroupParameterName;
    return this;
  }

  /**
   * The Reportparameter name
   * @return sReportgroupParameterName
   */
  @javax.annotation.Nonnull
  public String getsReportgroupParameterName() {
    return sReportgroupParameterName;
  }

  public void setsReportgroupParameterName(@javax.annotation.Nonnull String sReportgroupParameterName) {
    this.sReportgroupParameterName = sReportgroupParameterName;
  }


  public CommonReportgroupParameter sReportgroupParameterValue(@javax.annotation.Nullable String sReportgroupParameterValue) {
    this.sReportgroupParameterValue = sReportgroupParameterValue;
    return this;
  }

  /**
   * The Reportparameter value
   * @return sReportgroupParameterValue
   */
  @javax.annotation.Nullable
  public String getsReportgroupParameterValue() {
    return sReportgroupParameterValue;
  }

  public void setsReportgroupParameterValue(@javax.annotation.Nullable String sReportgroupParameterValue) {
    this.sReportgroupParameterValue = sReportgroupParameterValue;
  }


  public CommonReportgroupParameter aSReportgroupParameterValue(@javax.annotation.Nullable List<String> aSReportgroupParameterValue) {
    this.aSReportgroupParameterValue = aSReportgroupParameterValue;
    return this;
  }

  public CommonReportgroupParameter addASReportgroupParameterValueItem(String aSReportgroupParameterValueItem) {
    if (this.aSReportgroupParameterValue == null) {
      this.aSReportgroupParameterValue = new ArrayList<>();
    }
    this.aSReportgroupParameterValue.add(aSReportgroupParameterValueItem);
    return this;
  }

  /**
   * Get aSReportgroupParameterValue
   * @return aSReportgroupParameterValue
   */
  @javax.annotation.Nullable
  public List<String> getaSReportgroupParameterValue() {
    return aSReportgroupParameterValue;
  }

  public void setaSReportgroupParameterValue(@javax.annotation.Nullable List<String> aSReportgroupParameterValue) {
    this.aSReportgroupParameterValue = aSReportgroupParameterValue;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommonReportgroupParameter commonReportgroupParameter = (CommonReportgroupParameter) o;
    return Objects.equals(this.sReportgroupParameterName, commonReportgroupParameter.sReportgroupParameterName) &&
        Objects.equals(this.sReportgroupParameterValue, commonReportgroupParameter.sReportgroupParameterValue) &&
        Objects.equals(this.aSReportgroupParameterValue, commonReportgroupParameter.aSReportgroupParameterValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sReportgroupParameterName, sReportgroupParameterValue, aSReportgroupParameterValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommonReportgroupParameter {\n");
    sb.append("    sReportgroupParameterName: ").append(toIndentedString(sReportgroupParameterName)).append("\n");
    sb.append("    sReportgroupParameterValue: ").append(toIndentedString(sReportgroupParameterValue)).append("\n");
    sb.append("    aSReportgroupParameterValue: ").append(toIndentedString(aSReportgroupParameterValue)).append("\n");
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
    openapiFields.add("sReportgroupParameterName");
    openapiFields.add("sReportgroupParameterValue");
    openapiFields.add("a_sReportgroupParameterValue");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("sReportgroupParameterName");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CommonReportgroupParameter
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CommonReportgroupParameter.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CommonReportgroupParameter is not found in the empty JSON string", CommonReportgroupParameter.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CommonReportgroupParameter.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CommonReportgroupParameter` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CommonReportgroupParameter.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("sReportgroupParameterName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sReportgroupParameterName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sReportgroupParameterName").toString()));
      }
      if ((jsonObj.get("sReportgroupParameterValue") != null && !jsonObj.get("sReportgroupParameterValue").isJsonNull()) && !jsonObj.get("sReportgroupParameterValue").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sReportgroupParameterValue` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sReportgroupParameterValue").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("a_sReportgroupParameterValue") != null && !jsonObj.get("a_sReportgroupParameterValue").isJsonNull() && !jsonObj.get("a_sReportgroupParameterValue").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `a_sReportgroupParameterValue` to be an array in the JSON string but got `%s`", jsonObj.get("a_sReportgroupParameterValue").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CommonReportgroupParameter.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CommonReportgroupParameter' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CommonReportgroupParameter> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CommonReportgroupParameter.class));

       return (TypeAdapter<T>) new TypeAdapter<CommonReportgroupParameter>() {
           @Override
           public void write(JsonWriter out, CommonReportgroupParameter value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CommonReportgroupParameter read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CommonReportgroupParameter given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CommonReportgroupParameter
   * @throws IOException if the JSON string is invalid with respect to CommonReportgroupParameter
   */
  public static CommonReportgroupParameter fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CommonReportgroupParameter.class);
  }

  /**
   * Convert an instance of CommonReportgroupParameter to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

