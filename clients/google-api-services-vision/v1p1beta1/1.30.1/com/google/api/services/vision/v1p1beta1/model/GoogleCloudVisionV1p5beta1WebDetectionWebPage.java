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

package com.google.api.services.vision.v1p1beta1.model;

/**
 * Metadata for web pages.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Vision API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudVisionV1p5beta1WebDetectionWebPage extends com.google.api.client.json.GenericJson {

  /**
   * Fully matching images on the page. Can include resized copies of the query image.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudVisionV1p5beta1WebDetectionWebImage> fullMatchingImages;

  static {
    // hack to force ProGuard to consider GoogleCloudVisionV1p5beta1WebDetectionWebImage used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudVisionV1p5beta1WebDetectionWebImage.class);
  }

  /**
   * Title for the web page, may contain HTML markups.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String pageTitle;

  /**
   * Partial matching images on the page. Those images are similar enough to share some key-point
   * features. For example an original image will likely have partial matching for its crops.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudVisionV1p5beta1WebDetectionWebImage> partialMatchingImages;

  static {
    // hack to force ProGuard to consider GoogleCloudVisionV1p5beta1WebDetectionWebImage used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudVisionV1p5beta1WebDetectionWebImage.class);
  }

  /**
   * (Deprecated) Overall relevancy score for the web page.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float score;

  /**
   * The result web page URL.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String url;

  /**
   * Fully matching images on the page. Can include resized copies of the query image.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudVisionV1p5beta1WebDetectionWebImage> getFullMatchingImages() {
    return fullMatchingImages;
  }

  /**
   * Fully matching images on the page. Can include resized copies of the query image.
   * @param fullMatchingImages fullMatchingImages or {@code null} for none
   */
  public GoogleCloudVisionV1p5beta1WebDetectionWebPage setFullMatchingImages(java.util.List<GoogleCloudVisionV1p5beta1WebDetectionWebImage> fullMatchingImages) {
    this.fullMatchingImages = fullMatchingImages;
    return this;
  }

  /**
   * Title for the web page, may contain HTML markups.
   * @return value or {@code null} for none
   */
  public java.lang.String getPageTitle() {
    return pageTitle;
  }

  /**
   * Title for the web page, may contain HTML markups.
   * @param pageTitle pageTitle or {@code null} for none
   */
  public GoogleCloudVisionV1p5beta1WebDetectionWebPage setPageTitle(java.lang.String pageTitle) {
    this.pageTitle = pageTitle;
    return this;
  }

  /**
   * Partial matching images on the page. Those images are similar enough to share some key-point
   * features. For example an original image will likely have partial matching for its crops.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudVisionV1p5beta1WebDetectionWebImage> getPartialMatchingImages() {
    return partialMatchingImages;
  }

  /**
   * Partial matching images on the page. Those images are similar enough to share some key-point
   * features. For example an original image will likely have partial matching for its crops.
   * @param partialMatchingImages partialMatchingImages or {@code null} for none
   */
  public GoogleCloudVisionV1p5beta1WebDetectionWebPage setPartialMatchingImages(java.util.List<GoogleCloudVisionV1p5beta1WebDetectionWebImage> partialMatchingImages) {
    this.partialMatchingImages = partialMatchingImages;
    return this;
  }

  /**
   * (Deprecated) Overall relevancy score for the web page.
   * @return value or {@code null} for none
   */
  public java.lang.Float getScore() {
    return score;
  }

  /**
   * (Deprecated) Overall relevancy score for the web page.
   * @param score score or {@code null} for none
   */
  public GoogleCloudVisionV1p5beta1WebDetectionWebPage setScore(java.lang.Float score) {
    this.score = score;
    return this;
  }

  /**
   * The result web page URL.
   * @return value or {@code null} for none
   */
  public java.lang.String getUrl() {
    return url;
  }

  /**
   * The result web page URL.
   * @param url url or {@code null} for none
   */
  public GoogleCloudVisionV1p5beta1WebDetectionWebPage setUrl(java.lang.String url) {
    this.url = url;
    return this;
  }

  @Override
  public GoogleCloudVisionV1p5beta1WebDetectionWebPage set(String fieldName, Object value) {
    return (GoogleCloudVisionV1p5beta1WebDetectionWebPage) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudVisionV1p5beta1WebDetectionWebPage clone() {
    return (GoogleCloudVisionV1p5beta1WebDetectionWebPage) super.clone();
  }

}
