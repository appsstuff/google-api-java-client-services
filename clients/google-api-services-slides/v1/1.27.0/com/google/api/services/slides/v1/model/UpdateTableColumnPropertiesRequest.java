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

package com.google.api.services.slides.v1.model;

/**
 * Updates the properties of a Table column.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Slides API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class UpdateTableColumnPropertiesRequest extends com.google.api.client.json.GenericJson {

  /**
   * The list of zero-based indices specifying which columns to update. If no indices are provided,
   * all columns in the table will be updated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.Integer> columnIndices;

  /**
   * The fields that should be updated.
   *
   * At least one field must be specified. The root `tableColumnProperties` is implied and should
   * not be specified. A single `"*"` can be used as short-hand for listing every field.
   *
   * For example to update the column width, set `fields` to `"column_width"`.
   *
   * If '"column_width"' is included in the field mask but the property is left unset, the column
   * width will default to 406,400 EMU (32 points).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String fields;

  /**
   * The object ID of the table.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String objectId;

  /**
   * The table column properties to update.
   *
   * If the value of `table_column_properties#column_width` in the request is less than 406,400 EMU
   * (32 points), a 400 bad request error is returned.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TableColumnProperties tableColumnProperties;

  /**
   * The list of zero-based indices specifying which columns to update. If no indices are provided,
   * all columns in the table will be updated.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.Integer> getColumnIndices() {
    return columnIndices;
  }

  /**
   * The list of zero-based indices specifying which columns to update. If no indices are provided,
   * all columns in the table will be updated.
   * @param columnIndices columnIndices or {@code null} for none
   */
  public UpdateTableColumnPropertiesRequest setColumnIndices(java.util.List<java.lang.Integer> columnIndices) {
    this.columnIndices = columnIndices;
    return this;
  }

  /**
   * The fields that should be updated.
   *
   * At least one field must be specified. The root `tableColumnProperties` is implied and should
   * not be specified. A single `"*"` can be used as short-hand for listing every field.
   *
   * For example to update the column width, set `fields` to `"column_width"`.
   *
   * If '"column_width"' is included in the field mask but the property is left unset, the column
   * width will default to 406,400 EMU (32 points).
   * @return value or {@code null} for none
   */
  public String getFields() {
    return fields;
  }

  /**
   * The fields that should be updated.
   *
   * At least one field must be specified. The root `tableColumnProperties` is implied and should
   * not be specified. A single `"*"` can be used as short-hand for listing every field.
   *
   * For example to update the column width, set `fields` to `"column_width"`.
   *
   * If '"column_width"' is included in the field mask but the property is left unset, the column
   * width will default to 406,400 EMU (32 points).
   * @param fields fields or {@code null} for none
   */
  public UpdateTableColumnPropertiesRequest setFields(String fields) {
    this.fields = fields;
    return this;
  }

  /**
   * The object ID of the table.
   * @return value or {@code null} for none
   */
  public java.lang.String getObjectId() {
    return objectId;
  }

  /**
   * The object ID of the table.
   * @param objectId objectId or {@code null} for none
   */
  public UpdateTableColumnPropertiesRequest setObjectId(java.lang.String objectId) {
    this.objectId = objectId;
    return this;
  }

  /**
   * The table column properties to update.
   *
   * If the value of `table_column_properties#column_width` in the request is less than 406,400 EMU
   * (32 points), a 400 bad request error is returned.
   * @return value or {@code null} for none
   */
  public TableColumnProperties getTableColumnProperties() {
    return tableColumnProperties;
  }

  /**
   * The table column properties to update.
   *
   * If the value of `table_column_properties#column_width` in the request is less than 406,400 EMU
   * (32 points), a 400 bad request error is returned.
   * @param tableColumnProperties tableColumnProperties or {@code null} for none
   */
  public UpdateTableColumnPropertiesRequest setTableColumnProperties(TableColumnProperties tableColumnProperties) {
    this.tableColumnProperties = tableColumnProperties;
    return this;
  }

  @Override
  public UpdateTableColumnPropertiesRequest set(String fieldName, Object value) {
    return (UpdateTableColumnPropertiesRequest) super.set(fieldName, value);
  }

  @Override
  public UpdateTableColumnPropertiesRequest clone() {
    return (UpdateTableColumnPropertiesRequest) super.clone();
  }

}
