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

package com.google.api.services.dfareporting.model;

/**
 * Represents fields that are compatible to be selected for a report of type
 * "CROSS_DIMENSION_REACH".
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the DCM/DFA Reporting And Trafficking API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CrossDimensionReachReportCompatibleFields extends com.google.api.client.json.GenericJson {

  /**
   * Dimensions which are compatible to be selected in the "breakdown" section of the report.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Dimension> breakdown;

  /**
   * Dimensions which are compatible to be selected in the "dimensionFilters" section of the report.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Dimension> dimensionFilters;

  /**
   * The kind of resource this is, in this case
   * dfareporting#crossDimensionReachReportCompatibleFields.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Metrics which are compatible to be selected in the "metricNames" section of the report.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Metric> metrics;

  /**
   * Metrics which are compatible to be selected in the "overlapMetricNames" section of the report.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Metric> overlapMetrics;

  /**
   * Dimensions which are compatible to be selected in the "breakdown" section of the report.
   * @return value or {@code null} for none
   */
  public java.util.List<Dimension> getBreakdown() {
    return breakdown;
  }

  /**
   * Dimensions which are compatible to be selected in the "breakdown" section of the report.
   * @param breakdown breakdown or {@code null} for none
   */
  public CrossDimensionReachReportCompatibleFields setBreakdown(java.util.List<Dimension> breakdown) {
    this.breakdown = breakdown;
    return this;
  }

  /**
   * Dimensions which are compatible to be selected in the "dimensionFilters" section of the report.
   * @return value or {@code null} for none
   */
  public java.util.List<Dimension> getDimensionFilters() {
    return dimensionFilters;
  }

  /**
   * Dimensions which are compatible to be selected in the "dimensionFilters" section of the report.
   * @param dimensionFilters dimensionFilters or {@code null} for none
   */
  public CrossDimensionReachReportCompatibleFields setDimensionFilters(java.util.List<Dimension> dimensionFilters) {
    this.dimensionFilters = dimensionFilters;
    return this;
  }

  /**
   * The kind of resource this is, in this case
   * dfareporting#crossDimensionReachReportCompatibleFields.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * The kind of resource this is, in this case
   * dfareporting#crossDimensionReachReportCompatibleFields.
   * @param kind kind or {@code null} for none
   */
  public CrossDimensionReachReportCompatibleFields setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Metrics which are compatible to be selected in the "metricNames" section of the report.
   * @return value or {@code null} for none
   */
  public java.util.List<Metric> getMetrics() {
    return metrics;
  }

  /**
   * Metrics which are compatible to be selected in the "metricNames" section of the report.
   * @param metrics metrics or {@code null} for none
   */
  public CrossDimensionReachReportCompatibleFields setMetrics(java.util.List<Metric> metrics) {
    this.metrics = metrics;
    return this;
  }

  /**
   * Metrics which are compatible to be selected in the "overlapMetricNames" section of the report.
   * @return value or {@code null} for none
   */
  public java.util.List<Metric> getOverlapMetrics() {
    return overlapMetrics;
  }

  /**
   * Metrics which are compatible to be selected in the "overlapMetricNames" section of the report.
   * @param overlapMetrics overlapMetrics or {@code null} for none
   */
  public CrossDimensionReachReportCompatibleFields setOverlapMetrics(java.util.List<Metric> overlapMetrics) {
    this.overlapMetrics = overlapMetrics;
    return this;
  }

  @Override
  public CrossDimensionReachReportCompatibleFields set(String fieldName, Object value) {
    return (CrossDimensionReachReportCompatibleFields) super.set(fieldName, value);
  }

  @Override
  public CrossDimensionReachReportCompatibleFields clone() {
    return (CrossDimensionReachReportCompatibleFields) super.clone();
  }

}
