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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import eZmaxAPI.JSON;

/**
 * Request for POST /1/object/ezsigntemplatedocument/{pkiEzsigntemplatedocumentID}/getWordsPositions
 */
@ApiModel(description = "Request for POST /1/object/ezsigntemplatedocument/{pkiEzsigntemplatedocumentID}/getWordsPositions")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-20T16:59:39.826205Z[Etc/UTC]")
public class EzsigntemplatedocumentGetWordsPositionsV1Request {
  /**
   * Specify if you want to retrieve *All* words or specific *Words* from the document. If you specify *Words*, you must send the list of words to search for in *a_sWord*.
   */
  @JsonAdapter(EGetEnum.Adapter.class)
  public enum EGetEnum {
    ALL("All"),
    
    WORDS("Words");

    private String value;

    EGetEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EGetEnum fromValue(String value) {
      for (EGetEnum b : EGetEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<EGetEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EGetEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EGetEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return EGetEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_E_GET = "eGet";
  @SerializedName(SERIALIZED_NAME_E_GET)
  private EGetEnum eGet;

  public static final String SERIALIZED_NAME_B_WORD_CASE_SENSITIVE = "bWordCaseSensitive";
  @SerializedName(SERIALIZED_NAME_B_WORD_CASE_SENSITIVE)
  private Boolean bWordCaseSensitive;

  public static final String SERIALIZED_NAME_A_S_WORD = "a_sWord";
  @SerializedName(SERIALIZED_NAME_A_S_WORD)
  private List<String> aSWord = null;

  public EzsigntemplatedocumentGetWordsPositionsV1Request() { 
  }

  public EzsigntemplatedocumentGetWordsPositionsV1Request eGet(EGetEnum eGet) {
    
    this.eGet = eGet;
    return this;
  }

   /**
   * Specify if you want to retrieve *All* words or specific *Words* from the document. If you specify *Words*, you must send the list of words to search for in *a_sWord*.
   * @return eGet
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specify if you want to retrieve *All* words or specific *Words* from the document. If you specify *Words*, you must send the list of words to search for in *a_sWord*.")

  public EGetEnum geteGet() {
    return eGet;
  }


  public void seteGet(EGetEnum eGet) {
    this.eGet = eGet;
  }


  public EzsigntemplatedocumentGetWordsPositionsV1Request bWordCaseSensitive(Boolean bWordCaseSensitive) {
    
    this.bWordCaseSensitive = bWordCaseSensitive;
    return this;
  }

   /**
   * IF *true*, words will be searched case-sensitive and results will be returned case-sensitive. IF *false*, words will be searched case-insensitive and results will be returned case-insensitive.
   * @return bWordCaseSensitive
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "IF *true*, words will be searched case-sensitive and results will be returned case-sensitive. IF *false*, words will be searched case-insensitive and results will be returned case-insensitive.")

  public Boolean getbWordCaseSensitive() {
    return bWordCaseSensitive;
  }


  public void setbWordCaseSensitive(Boolean bWordCaseSensitive) {
    this.bWordCaseSensitive = bWordCaseSensitive;
  }


  public EzsigntemplatedocumentGetWordsPositionsV1Request aSWord(List<String> aSWord) {
    
    this.aSWord = aSWord;
    return this;
  }

  public EzsigntemplatedocumentGetWordsPositionsV1Request addASWordItem(String aSWordItem) {
    if (this.aSWord == null) {
      this.aSWord = new ArrayList<>();
    }
    this.aSWord.add(aSWordItem);
    return this;
  }

   /**
   * Array of words to find in the document
   * @return aSWord
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Array of words to find in the document")

  public List<String> getaSWord() {
    return aSWord;
  }


  public void setaSWord(List<String> aSWord) {
    this.aSWord = aSWord;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsigntemplatedocumentGetWordsPositionsV1Request ezsigntemplatedocumentGetWordsPositionsV1Request = (EzsigntemplatedocumentGetWordsPositionsV1Request) o;
    return Objects.equals(this.eGet, ezsigntemplatedocumentGetWordsPositionsV1Request.eGet) &&
        Objects.equals(this.bWordCaseSensitive, ezsigntemplatedocumentGetWordsPositionsV1Request.bWordCaseSensitive) &&
        Objects.equals(this.aSWord, ezsigntemplatedocumentGetWordsPositionsV1Request.aSWord);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eGet, bWordCaseSensitive, aSWord);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsigntemplatedocumentGetWordsPositionsV1Request {\n");
    sb.append("    eGet: ").append(toIndentedString(eGet)).append("\n");
    sb.append("    bWordCaseSensitive: ").append(toIndentedString(bWordCaseSensitive)).append("\n");
    sb.append("    aSWord: ").append(toIndentedString(aSWord)).append("\n");
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
    openapiFields.add("eGet");
    openapiFields.add("bWordCaseSensitive");
    openapiFields.add("a_sWord");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("eGet");
    openapiRequiredFields.add("bWordCaseSensitive");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EzsigntemplatedocumentGetWordsPositionsV1Request
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (EzsigntemplatedocumentGetWordsPositionsV1Request.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in EzsigntemplatedocumentGetWordsPositionsV1Request is not found in the empty JSON string", EzsigntemplatedocumentGetWordsPositionsV1Request.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!EzsigntemplatedocumentGetWordsPositionsV1Request.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EzsigntemplatedocumentGetWordsPositionsV1Request` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EzsigntemplatedocumentGetWordsPositionsV1Request.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("eGet") != null && !jsonObj.get("eGet").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `eGet` to be a primitive type in the JSON string but got `%s`", jsonObj.get("eGet").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("a_sWord") != null && !jsonObj.get("a_sWord").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `a_sWord` to be an array in the JSON string but got `%s`", jsonObj.get("a_sWord").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EzsigntemplatedocumentGetWordsPositionsV1Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EzsigntemplatedocumentGetWordsPositionsV1Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EzsigntemplatedocumentGetWordsPositionsV1Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EzsigntemplatedocumentGetWordsPositionsV1Request.class));

       return (TypeAdapter<T>) new TypeAdapter<EzsigntemplatedocumentGetWordsPositionsV1Request>() {
           @Override
           public void write(JsonWriter out, EzsigntemplatedocumentGetWordsPositionsV1Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EzsigntemplatedocumentGetWordsPositionsV1Request read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EzsigntemplatedocumentGetWordsPositionsV1Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EzsigntemplatedocumentGetWordsPositionsV1Request
  * @throws IOException if the JSON string is invalid with respect to EzsigntemplatedocumentGetWordsPositionsV1Request
  */
  public static EzsigntemplatedocumentGetWordsPositionsV1Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EzsigntemplatedocumentGetWordsPositionsV1Request.class);
  }

 /**
  * Convert an instance of EzsigntemplatedocumentGetWordsPositionsV1Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
