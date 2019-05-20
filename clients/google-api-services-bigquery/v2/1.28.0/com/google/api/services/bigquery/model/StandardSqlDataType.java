/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.bigquery.model;

/**
 * The type of a variable, e.g., a function argument. Examples: INT64: {type_kind="INT64"} ARRAY:
 * {type_kind="ARRAY", array_element_type="STRING"} STRUCT>:   {type_kind="STRUCT",
 * struct_type={fields=[      {name="x", type={type_kind="STRING"}},      {name="y",
 * type={type_kind="ARRAY", array_element_type="DATE"}}    ]}}
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the BigQuery API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class StandardSqlDataType extends com.google.api.client.json.GenericJson {

  /**
   * The type of the array's elements, if type_kind = "ARRAY".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private StandardSqlDataType arrayElementType;

  /**
   * The fields of this struct, in order, if type_kind = "STRUCT".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private StandardSqlStructType structType;

  /**
   * Required. The top level type of this field. Can be any standard SQL data type (e.g., "INT64",
   * "DATE", "ARRAY").
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String typeKind;

  /**
   * The type of the array's elements, if type_kind = "ARRAY".
   * @return value or {@code null} for none
   */
  public StandardSqlDataType getArrayElementType() {
    return arrayElementType;
  }

  /**
   * The type of the array's elements, if type_kind = "ARRAY".
   * @param arrayElementType arrayElementType or {@code null} for none
   */
  public StandardSqlDataType setArrayElementType(StandardSqlDataType arrayElementType) {
    this.arrayElementType = arrayElementType;
    return this;
  }

  /**
   * The fields of this struct, in order, if type_kind = "STRUCT".
   * @return value or {@code null} for none
   */
  public StandardSqlStructType getStructType() {
    return structType;
  }

  /**
   * The fields of this struct, in order, if type_kind = "STRUCT".
   * @param structType structType or {@code null} for none
   */
  public StandardSqlDataType setStructType(StandardSqlStructType structType) {
    this.structType = structType;
    return this;
  }

  /**
   * Required. The top level type of this field. Can be any standard SQL data type (e.g., "INT64",
   * "DATE", "ARRAY").
   * @return value or {@code null} for none
   */
  public java.lang.String getTypeKind() {
    return typeKind;
  }

  /**
   * Required. The top level type of this field. Can be any standard SQL data type (e.g., "INT64",
   * "DATE", "ARRAY").
   * @param typeKind typeKind or {@code null} for none
   */
  public StandardSqlDataType setTypeKind(java.lang.String typeKind) {
    this.typeKind = typeKind;
    return this;
  }

  @Override
  public StandardSqlDataType set(String fieldName, Object value) {
    return (StandardSqlDataType) super.set(fieldName, value);
  }

  @Override
  public StandardSqlDataType clone() {
    return (StandardSqlDataType) super.clone();
  }

}