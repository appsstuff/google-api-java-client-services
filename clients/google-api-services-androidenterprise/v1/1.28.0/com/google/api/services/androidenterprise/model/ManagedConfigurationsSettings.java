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

package com.google.api.services.androidenterprise.model;

/**
 * A managed configurations settings resource contains the set of managed properties that have been
 * configured for an Android app to be applied to a set of users. The app's developer would have
 * defined configurable properties in the managed configurations schema.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Play EMM API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ManagedConfigurationsSettings extends com.google.api.client.json.GenericJson {

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * "androidenterprise#managedConfigurationsSettings".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The last updated time of the managed configuration settings in milliseconds since
   * 1970-01-01T00:00:00Z.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long lastUpdatedTimestampMillis;

  /**
   * The ID of the managed configurations settings.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String mcmId;

  /**
   * The name of the managed configurations settings.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * "androidenterprise#managedConfigurationsSettings".
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * "androidenterprise#managedConfigurationsSettings".
   * @param kind kind or {@code null} for none
   */
  public ManagedConfigurationsSettings setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The last updated time of the managed configuration settings in milliseconds since
   * 1970-01-01T00:00:00Z.
   * @return value or {@code null} for none
   */
  public java.lang.Long getLastUpdatedTimestampMillis() {
    return lastUpdatedTimestampMillis;
  }

  /**
   * The last updated time of the managed configuration settings in milliseconds since
   * 1970-01-01T00:00:00Z.
   * @param lastUpdatedTimestampMillis lastUpdatedTimestampMillis or {@code null} for none
   */
  public ManagedConfigurationsSettings setLastUpdatedTimestampMillis(java.lang.Long lastUpdatedTimestampMillis) {
    this.lastUpdatedTimestampMillis = lastUpdatedTimestampMillis;
    return this;
  }

  /**
   * The ID of the managed configurations settings.
   * @return value or {@code null} for none
   */
  public java.lang.String getMcmId() {
    return mcmId;
  }

  /**
   * The ID of the managed configurations settings.
   * @param mcmId mcmId or {@code null} for none
   */
  public ManagedConfigurationsSettings setMcmId(java.lang.String mcmId) {
    this.mcmId = mcmId;
    return this;
  }

  /**
   * The name of the managed configurations settings.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The name of the managed configurations settings.
   * @param name name or {@code null} for none
   */
  public ManagedConfigurationsSettings setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  @Override
  public ManagedConfigurationsSettings set(String fieldName, Object value) {
    return (ManagedConfigurationsSettings) super.set(fieldName, value);
  }

  @Override
  public ManagedConfigurationsSettings clone() {
    return (ManagedConfigurationsSettings) super.clone();
  }

}
