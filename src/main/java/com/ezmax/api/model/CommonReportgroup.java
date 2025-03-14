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
import com.ezmax.api.model.CommonReport;
import com.ezmax.api.model.CommonReportcellstyle;
import com.ezmax.api.model.CommonReportgroupParameter;
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
 * A group of reports  Each Reportgroup is for a specific recipient or for a specific context.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-07T19:20:13.445471985Z[Etc/UTC]", comments = "Generator version: 7.12.0")
public class CommonReportgroup {
  public static final String SERIALIZED_NAME_A_OBJ_REPORT = "a_objReport";
  @SerializedName(SERIALIZED_NAME_A_OBJ_REPORT)
  @javax.annotation.Nonnull
  private List<CommonReport> aObjReport = new ArrayList<>();

  public static final String SERIALIZED_NAME_A_OBJ_REPORTCELLSTYLE_CUSTOM = "a_objReportcellstyleCustom";
  @SerializedName(SERIALIZED_NAME_A_OBJ_REPORTCELLSTYLE_CUSTOM)
  @javax.annotation.Nonnull
  private List<CommonReportcellstyle> aObjReportcellstyleCustom = new ArrayList<>();

  public static final String SERIALIZED_NAME_A_OBJ_REPORTGROUP_PARAMETER = "a_objReportgroupParameter";
  @SerializedName(SERIALIZED_NAME_A_OBJ_REPORTGROUP_PARAMETER)
  @javax.annotation.Nonnull
  private List<CommonReportgroupParameter> aObjReportgroupParameter = new ArrayList<>();

  public static final String SERIALIZED_NAME_S_REPORTGROUP_FILENAME = "sReportgroupFilename";
  @SerializedName(SERIALIZED_NAME_S_REPORTGROUP_FILENAME)
  @javax.annotation.Nonnull
  private String sReportgroupFilename;

  public CommonReportgroup() {
  }

  public CommonReportgroup aObjReport(@javax.annotation.Nonnull List<CommonReport> aObjReport) {
    this.aObjReport = aObjReport;
    return this;
  }

  public CommonReportgroup addAObjReportItem(CommonReport aObjReportItem) {
    if (this.aObjReport == null) {
      this.aObjReport = new ArrayList<>();
    }
    this.aObjReport.add(aObjReportItem);
    return this;
  }

  /**
   * Get aObjReport
   * @return aObjReport
   */
  @javax.annotation.Nonnull
  public List<CommonReport> getaObjReport() {
    return aObjReport;
  }

  public void setaObjReport(@javax.annotation.Nonnull List<CommonReport> aObjReport) {
    this.aObjReport = aObjReport;
  }


  public CommonReportgroup aObjReportcellstyleCustom(@javax.annotation.Nonnull List<CommonReportcellstyle> aObjReportcellstyleCustom) {
    this.aObjReportcellstyleCustom = aObjReportcellstyleCustom;
    return this;
  }

  public CommonReportgroup addAObjReportcellstyleCustomItem(CommonReportcellstyle aObjReportcellstyleCustomItem) {
    if (this.aObjReportcellstyleCustom == null) {
      this.aObjReportcellstyleCustom = new ArrayList<>();
    }
    this.aObjReportcellstyleCustom.add(aObjReportcellstyleCustomItem);
    return this;
  }

  /**
   * Get aObjReportcellstyleCustom
   * @return aObjReportcellstyleCustom
   */
  @javax.annotation.Nonnull
  public List<CommonReportcellstyle> getaObjReportcellstyleCustom() {
    return aObjReportcellstyleCustom;
  }

  public void setaObjReportcellstyleCustom(@javax.annotation.Nonnull List<CommonReportcellstyle> aObjReportcellstyleCustom) {
    this.aObjReportcellstyleCustom = aObjReportcellstyleCustom;
  }


  public CommonReportgroup aObjReportgroupParameter(@javax.annotation.Nonnull List<CommonReportgroupParameter> aObjReportgroupParameter) {
    this.aObjReportgroupParameter = aObjReportgroupParameter;
    return this;
  }

  public CommonReportgroup addAObjReportgroupParameterItem(CommonReportgroupParameter aObjReportgroupParameterItem) {
    if (this.aObjReportgroupParameter == null) {
      this.aObjReportgroupParameter = new ArrayList<>();
    }
    this.aObjReportgroupParameter.add(aObjReportgroupParameterItem);
    return this;
  }

  /**
   * Get aObjReportgroupParameter
   * @return aObjReportgroupParameter
   */
  @javax.annotation.Nonnull
  public List<CommonReportgroupParameter> getaObjReportgroupParameter() {
    return aObjReportgroupParameter;
  }

  public void setaObjReportgroupParameter(@javax.annotation.Nonnull List<CommonReportgroupParameter> aObjReportgroupParameter) {
    this.aObjReportgroupParameter = aObjReportgroupParameter;
  }


  public CommonReportgroup sReportgroupFilename(@javax.annotation.Nonnull String sReportgroupFilename) {
    this.sReportgroupFilename = sReportgroupFilename;
    return this;
  }

  /**
   * The name of the file
   * @return sReportgroupFilename
   */
  @javax.annotation.Nonnull
  public String getsReportgroupFilename() {
    return sReportgroupFilename;
  }

  public void setsReportgroupFilename(@javax.annotation.Nonnull String sReportgroupFilename) {
    this.sReportgroupFilename = sReportgroupFilename;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommonReportgroup commonReportgroup = (CommonReportgroup) o;
    return Objects.equals(this.aObjReport, commonReportgroup.aObjReport) &&
        Objects.equals(this.aObjReportcellstyleCustom, commonReportgroup.aObjReportcellstyleCustom) &&
        Objects.equals(this.aObjReportgroupParameter, commonReportgroup.aObjReportgroupParameter) &&
        Objects.equals(this.sReportgroupFilename, commonReportgroup.sReportgroupFilename);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aObjReport, aObjReportcellstyleCustom, aObjReportgroupParameter, sReportgroupFilename);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommonReportgroup {\n");
    sb.append("    aObjReport: ").append(toIndentedString(aObjReport)).append("\n");
    sb.append("    aObjReportcellstyleCustom: ").append(toIndentedString(aObjReportcellstyleCustom)).append("\n");
    sb.append("    aObjReportgroupParameter: ").append(toIndentedString(aObjReportgroupParameter)).append("\n");
    sb.append("    sReportgroupFilename: ").append(toIndentedString(sReportgroupFilename)).append("\n");
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
    openapiFields.add("a_objReport");
    openapiFields.add("a_objReportcellstyleCustom");
    openapiFields.add("a_objReportgroupParameter");
    openapiFields.add("sReportgroupFilename");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("a_objReport");
    openapiRequiredFields.add("a_objReportcellstyleCustom");
    openapiRequiredFields.add("a_objReportgroupParameter");
    openapiRequiredFields.add("sReportgroupFilename");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CommonReportgroup
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CommonReportgroup.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CommonReportgroup is not found in the empty JSON string", CommonReportgroup.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CommonReportgroup.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CommonReportgroup` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CommonReportgroup.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("a_objReport").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `a_objReport` to be an array in the JSON string but got `%s`", jsonObj.get("a_objReport").toString()));
      }

      JsonArray jsonArrayaObjReport = jsonObj.getAsJsonArray("a_objReport");
      // validate the required field `a_objReport` (array)
      for (int i = 0; i < jsonArrayaObjReport.size(); i++) {
        CommonReport.validateJsonElement(jsonArrayaObjReport.get(i));
      };
      // ensure the json data is an array
      if (!jsonObj.get("a_objReportcellstyleCustom").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `a_objReportcellstyleCustom` to be an array in the JSON string but got `%s`", jsonObj.get("a_objReportcellstyleCustom").toString()));
      }

      JsonArray jsonArrayaObjReportcellstyleCustom = jsonObj.getAsJsonArray("a_objReportcellstyleCustom");
      // validate the required field `a_objReportcellstyleCustom` (array)
      for (int i = 0; i < jsonArrayaObjReportcellstyleCustom.size(); i++) {
        CommonReportcellstyle.validateJsonElement(jsonArrayaObjReportcellstyleCustom.get(i));
      };
      // ensure the json data is an array
      if (!jsonObj.get("a_objReportgroupParameter").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `a_objReportgroupParameter` to be an array in the JSON string but got `%s`", jsonObj.get("a_objReportgroupParameter").toString()));
      }

      JsonArray jsonArrayaObjReportgroupParameter = jsonObj.getAsJsonArray("a_objReportgroupParameter");
      // validate the required field `a_objReportgroupParameter` (array)
      for (int i = 0; i < jsonArrayaObjReportgroupParameter.size(); i++) {
        CommonReportgroupParameter.validateJsonElement(jsonArrayaObjReportgroupParameter.get(i));
      };
      if (!jsonObj.get("sReportgroupFilename").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sReportgroupFilename` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sReportgroupFilename").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CommonReportgroup.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CommonReportgroup' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CommonReportgroup> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CommonReportgroup.class));

       return (TypeAdapter<T>) new TypeAdapter<CommonReportgroup>() {
           @Override
           public void write(JsonWriter out, CommonReportgroup value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CommonReportgroup read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CommonReportgroup given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CommonReportgroup
   * @throws IOException if the JSON string is invalid with respect to CommonReportgroup
   */
  public static CommonReportgroup fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CommonReportgroup.class);
  }

  /**
   * Convert an instance of CommonReportgroup to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

