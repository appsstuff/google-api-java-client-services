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
 * Information about the products similar to a single product in a query image.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Vision API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudVisionV1p3beta1ProductSearchResultsGroupedResult extends com.google.api.client.json.GenericJson {

  /**
   * The bounding polygon around the product detected in the query image.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudVisionV1p3beta1BoundingPoly boundingPoly;

  /**
   * List of results, one for each product match.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudVisionV1p3beta1ProductSearchResultsResult> results;

  /**
   * The bounding polygon around the product detected in the query image.
   * @return value or {@code null} for none
   */
  public GoogleCloudVisionV1p3beta1BoundingPoly getBoundingPoly() {
    return boundingPoly;
  }

  /**
   * The bounding polygon around the product detected in the query image.
   * @param boundingPoly boundingPoly or {@code null} for none
   */
  public GoogleCloudVisionV1p3beta1ProductSearchResultsGroupedResult setBoundingPoly(GoogleCloudVisionV1p3beta1BoundingPoly boundingPoly) {
    this.boundingPoly = boundingPoly;
    return this;
  }

  /**
   * List of results, one for each product match.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudVisionV1p3beta1ProductSearchResultsResult> getResults() {
    return results;
  }

  /**
   * List of results, one for each product match.
   * @param results results or {@code null} for none
   */
  public GoogleCloudVisionV1p3beta1ProductSearchResultsGroupedResult setResults(java.util.List<GoogleCloudVisionV1p3beta1ProductSearchResultsResult> results) {
    this.results = results;
    return this;
  }

  @Override
  public GoogleCloudVisionV1p3beta1ProductSearchResultsGroupedResult set(String fieldName, Object value) {
    return (GoogleCloudVisionV1p3beta1ProductSearchResultsGroupedResult) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudVisionV1p3beta1ProductSearchResultsGroupedResult clone() {
    return (GoogleCloudVisionV1p3beta1ProductSearchResultsGroupedResult) super.clone();
  }

}
