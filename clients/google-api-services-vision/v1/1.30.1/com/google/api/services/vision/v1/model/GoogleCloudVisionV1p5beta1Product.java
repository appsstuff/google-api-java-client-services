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

package com.google.api.services.vision.v1.model;

/**
 * A Product contains ReferenceImages.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Vision API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudVisionV1p5beta1Product extends com.google.api.client.json.GenericJson {

  /**
   * User-provided metadata to be stored with this product. Must be at most 4096 characters long.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * The user-provided name for this Product. Must not be empty. Must be at most 4096 characters
   * long.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * The resource name of the product.
   *
   * Format is: `projects/PROJECT_ID/locations/LOC_ID/products/PRODUCT_ID`.
   *
   * This field is ignored when creating a product.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The category for the product identified by the reference image. This should be either
   * "homegoods-v2", "apparel-v2", or "toys-v2". The legacy categories "homegoods", "apparel", and
   * "toys" are still supported, but these should not be used for new products.
   *
   * This field is immutable.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String productCategory;

  /**
   * Key-value pairs that can be attached to a product. At query time, constraints can be specified
   * based on the product_labels.
   *
   * Note that integer values can be provided as strings, e.g. "1199". Only strings with integer
   * values can match a range-based restriction which is to be supported soon.
   *
   * Multiple values can be assigned to the same key. One product may have up to 100 product_labels.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudVisionV1p5beta1ProductKeyValue> productLabels;

  /**
   * User-provided metadata to be stored with this product. Must be at most 4096 characters long.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * User-provided metadata to be stored with this product. Must be at most 4096 characters long.
   * @param description description or {@code null} for none
   */
  public GoogleCloudVisionV1p5beta1Product setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * The user-provided name for this Product. Must not be empty. Must be at most 4096 characters
   * long.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * The user-provided name for this Product. Must not be empty. Must be at most 4096 characters
   * long.
   * @param displayName displayName or {@code null} for none
   */
  public GoogleCloudVisionV1p5beta1Product setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * The resource name of the product.
   *
   * Format is: `projects/PROJECT_ID/locations/LOC_ID/products/PRODUCT_ID`.
   *
   * This field is ignored when creating a product.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The resource name of the product.
   *
   * Format is: `projects/PROJECT_ID/locations/LOC_ID/products/PRODUCT_ID`.
   *
   * This field is ignored when creating a product.
   * @param name name or {@code null} for none
   */
  public GoogleCloudVisionV1p5beta1Product setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The category for the product identified by the reference image. This should be either
   * "homegoods-v2", "apparel-v2", or "toys-v2". The legacy categories "homegoods", "apparel", and
   * "toys" are still supported, but these should not be used for new products.
   *
   * This field is immutable.
   * @return value or {@code null} for none
   */
  public java.lang.String getProductCategory() {
    return productCategory;
  }

  /**
   * The category for the product identified by the reference image. This should be either
   * "homegoods-v2", "apparel-v2", or "toys-v2". The legacy categories "homegoods", "apparel", and
   * "toys" are still supported, but these should not be used for new products.
   *
   * This field is immutable.
   * @param productCategory productCategory or {@code null} for none
   */
  public GoogleCloudVisionV1p5beta1Product setProductCategory(java.lang.String productCategory) {
    this.productCategory = productCategory;
    return this;
  }

  /**
   * Key-value pairs that can be attached to a product. At query time, constraints can be specified
   * based on the product_labels.
   *
   * Note that integer values can be provided as strings, e.g. "1199". Only strings with integer
   * values can match a range-based restriction which is to be supported soon.
   *
   * Multiple values can be assigned to the same key. One product may have up to 100 product_labels.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudVisionV1p5beta1ProductKeyValue> getProductLabels() {
    return productLabels;
  }

  /**
   * Key-value pairs that can be attached to a product. At query time, constraints can be specified
   * based on the product_labels.
   *
   * Note that integer values can be provided as strings, e.g. "1199". Only strings with integer
   * values can match a range-based restriction which is to be supported soon.
   *
   * Multiple values can be assigned to the same key. One product may have up to 100 product_labels.
   * @param productLabels productLabels or {@code null} for none
   */
  public GoogleCloudVisionV1p5beta1Product setProductLabels(java.util.List<GoogleCloudVisionV1p5beta1ProductKeyValue> productLabels) {
    this.productLabels = productLabels;
    return this;
  }

  @Override
  public GoogleCloudVisionV1p5beta1Product set(String fieldName, Object value) {
    return (GoogleCloudVisionV1p5beta1Product) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudVisionV1p5beta1Product clone() {
    return (GoogleCloudVisionV1p5beta1Product) super.clone();
  }

}
