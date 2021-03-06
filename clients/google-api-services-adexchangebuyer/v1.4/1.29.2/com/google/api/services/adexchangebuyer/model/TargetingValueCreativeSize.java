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

package com.google.api.services.adexchangebuyer.model;

/**
 * Next Id: 7
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Ad Exchange Buyer API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TargetingValueCreativeSize extends com.google.api.client.json.GenericJson {

  /**
   * The formats allowed by the publisher.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> allowedFormats;

  /**
   * For video size type, the list of companion sizes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<TargetingValueSize> companionSizes;

  /**
   * The Creative size type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String creativeSizeType;

  /**
   * The native template for native ad.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nativeTemplate;

  /**
   * For regular or video creative size type, specifies the size of the creative.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TargetingValueSize size;

  /**
   * The skippable ad type for video size.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String skippableAdType;

  /**
   * The formats allowed by the publisher.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getAllowedFormats() {
    return allowedFormats;
  }

  /**
   * The formats allowed by the publisher.
   * @param allowedFormats allowedFormats or {@code null} for none
   */
  public TargetingValueCreativeSize setAllowedFormats(java.util.List<java.lang.String> allowedFormats) {
    this.allowedFormats = allowedFormats;
    return this;
  }

  /**
   * For video size type, the list of companion sizes.
   * @return value or {@code null} for none
   */
  public java.util.List<TargetingValueSize> getCompanionSizes() {
    return companionSizes;
  }

  /**
   * For video size type, the list of companion sizes.
   * @param companionSizes companionSizes or {@code null} for none
   */
  public TargetingValueCreativeSize setCompanionSizes(java.util.List<TargetingValueSize> companionSizes) {
    this.companionSizes = companionSizes;
    return this;
  }

  /**
   * The Creative size type.
   * @return value or {@code null} for none
   */
  public java.lang.String getCreativeSizeType() {
    return creativeSizeType;
  }

  /**
   * The Creative size type.
   * @param creativeSizeType creativeSizeType or {@code null} for none
   */
  public TargetingValueCreativeSize setCreativeSizeType(java.lang.String creativeSizeType) {
    this.creativeSizeType = creativeSizeType;
    return this;
  }

  /**
   * The native template for native ad.
   * @return value or {@code null} for none
   */
  public java.lang.String getNativeTemplate() {
    return nativeTemplate;
  }

  /**
   * The native template for native ad.
   * @param nativeTemplate nativeTemplate or {@code null} for none
   */
  public TargetingValueCreativeSize setNativeTemplate(java.lang.String nativeTemplate) {
    this.nativeTemplate = nativeTemplate;
    return this;
  }

  /**
   * For regular or video creative size type, specifies the size of the creative.
   * @return value or {@code null} for none
   */
  public TargetingValueSize getSize() {
    return size;
  }

  /**
   * For regular or video creative size type, specifies the size of the creative.
   * @param size size or {@code null} for none
   */
  public TargetingValueCreativeSize setSize(TargetingValueSize size) {
    this.size = size;
    return this;
  }

  /**
   * The skippable ad type for video size.
   * @return value or {@code null} for none
   */
  public java.lang.String getSkippableAdType() {
    return skippableAdType;
  }

  /**
   * The skippable ad type for video size.
   * @param skippableAdType skippableAdType or {@code null} for none
   */
  public TargetingValueCreativeSize setSkippableAdType(java.lang.String skippableAdType) {
    this.skippableAdType = skippableAdType;
    return this;
  }

  @Override
  public TargetingValueCreativeSize set(String fieldName, Object value) {
    return (TargetingValueCreativeSize) super.set(fieldName, value);
  }

  @Override
  public TargetingValueCreativeSize clone() {
    return (TargetingValueCreativeSize) super.clone();
  }

}
