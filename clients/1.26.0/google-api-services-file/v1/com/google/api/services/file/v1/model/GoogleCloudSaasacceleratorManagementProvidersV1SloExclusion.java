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

package com.google.api.services.file.v1.model;

/**
 * A temporal SLO exclusion specification.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Filestore API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudSaasacceleratorManagementProvidersV1SloExclusion extends com.google.api.client.json.GenericJson {

  /**
   * Exclusion duration. No restrictions on the possible values.
   *
   * When an ongoing operation is taking longer than initially expected, an existing entry in the
   * exclusion list can be updated by extending the duration. This is supported by the subsystem
   * exporting eligibility data as long as such extension is committed at least 10 minutes before
   * the original exclusion expiration - otherwise it is possible that there will be "gaps" in the
   * exclusion application in the exported timeseries.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String exclusionDuration;

  /**
   * Start time of the exclusion. No alignment (e.g. to a full minute) needed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String exclusionStartTime;

  /**
   * Human-readable reason for the exclusion. This should be a static string (e.g. "Disruptive
   * update in progress") and should not contain dynamically generated data (e.g. instance name).
   * Can be left empty.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String reason;

  /**
   * Name of an SLI/SLO that this exclusion applies to. Can be left empty, signaling that the
   * instance should be excluded from all SLI/SLOs defined in the service SLO configuration.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sloName;

  /**
   * Exclusion duration. No restrictions on the possible values.
   *
   * When an ongoing operation is taking longer than initially expected, an existing entry in the
   * exclusion list can be updated by extending the duration. This is supported by the subsystem
   * exporting eligibility data as long as such extension is committed at least 10 minutes before
   * the original exclusion expiration - otherwise it is possible that there will be "gaps" in the
   * exclusion application in the exported timeseries.
   * @return value or {@code null} for none
   */
  public String getExclusionDuration() {
    return exclusionDuration;
  }

  /**
   * Exclusion duration. No restrictions on the possible values.
   *
   * When an ongoing operation is taking longer than initially expected, an existing entry in the
   * exclusion list can be updated by extending the duration. This is supported by the subsystem
   * exporting eligibility data as long as such extension is committed at least 10 minutes before
   * the original exclusion expiration - otherwise it is possible that there will be "gaps" in the
   * exclusion application in the exported timeseries.
   * @param exclusionDuration exclusionDuration or {@code null} for none
   */
  public GoogleCloudSaasacceleratorManagementProvidersV1SloExclusion setExclusionDuration(String exclusionDuration) {
    this.exclusionDuration = exclusionDuration;
    return this;
  }

  /**
   * Start time of the exclusion. No alignment (e.g. to a full minute) needed.
   * @return value or {@code null} for none
   */
  public String getExclusionStartTime() {
    return exclusionStartTime;
  }

  /**
   * Start time of the exclusion. No alignment (e.g. to a full minute) needed.
   * @param exclusionStartTime exclusionStartTime or {@code null} for none
   */
  public GoogleCloudSaasacceleratorManagementProvidersV1SloExclusion setExclusionStartTime(String exclusionStartTime) {
    this.exclusionStartTime = exclusionStartTime;
    return this;
  }

  /**
   * Human-readable reason for the exclusion. This should be a static string (e.g. "Disruptive
   * update in progress") and should not contain dynamically generated data (e.g. instance name).
   * Can be left empty.
   * @return value or {@code null} for none
   */
  public java.lang.String getReason() {
    return reason;
  }

  /**
   * Human-readable reason for the exclusion. This should be a static string (e.g. "Disruptive
   * update in progress") and should not contain dynamically generated data (e.g. instance name).
   * Can be left empty.
   * @param reason reason or {@code null} for none
   */
  public GoogleCloudSaasacceleratorManagementProvidersV1SloExclusion setReason(java.lang.String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * Name of an SLI/SLO that this exclusion applies to. Can be left empty, signaling that the
   * instance should be excluded from all SLI/SLOs defined in the service SLO configuration.
   * @return value or {@code null} for none
   */
  public java.lang.String getSloName() {
    return sloName;
  }

  /**
   * Name of an SLI/SLO that this exclusion applies to. Can be left empty, signaling that the
   * instance should be excluded from all SLI/SLOs defined in the service SLO configuration.
   * @param sloName sloName or {@code null} for none
   */
  public GoogleCloudSaasacceleratorManagementProvidersV1SloExclusion setSloName(java.lang.String sloName) {
    this.sloName = sloName;
    return this;
  }

  @Override
  public GoogleCloudSaasacceleratorManagementProvidersV1SloExclusion set(String fieldName, Object value) {
    return (GoogleCloudSaasacceleratorManagementProvidersV1SloExclusion) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudSaasacceleratorManagementProvidersV1SloExclusion clone() {
    return (GoogleCloudSaasacceleratorManagementProvidersV1SloExclusion) super.clone();
  }

}