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

package com.google.api.services.commentanalyzer.v1alpha1.model;

/**
 * The comment analysis response message.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Perspective Comment Analyzer API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AnalyzeCommentResponse extends com.google.api.client.json.GenericJson {

  /**
   * Scores for the requested attributes. The map keys are attribute names (same as the
   * requested_attribute field in AnalyzeCommentRequest, for example "ATTACK_ON_AUTHOR",
   * "INFLAMMATORY", etc).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, AttributeScores> attributeScores;

  /**
   * Same token from the original AnalyzeCommentRequest.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String clientToken;

  /**
   * Contains the languages detected from the text content, sorted in order of likelihood.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> detectedLanguages;

  /**
   * The language(s) used by CommentAnalyzer service to choose which Model to use when analyzing the
   * comment. Might better be called "effective_languages". The logic used to make the choice is as
   * follows:   if !Request.languages.empty()     effective_languages = Request.languages   else
   * effective_languages = detected_languages[0]
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> languages;

  /**
   * Scores for the requested attributes. The map keys are attribute names (same as the
   * requested_attribute field in AnalyzeCommentRequest, for example "ATTACK_ON_AUTHOR",
   * "INFLAMMATORY", etc).
   * @return value or {@code null} for none
   */
  public java.util.Map<String, AttributeScores> getAttributeScores() {
    return attributeScores;
  }

  /**
   * Scores for the requested attributes. The map keys are attribute names (same as the
   * requested_attribute field in AnalyzeCommentRequest, for example "ATTACK_ON_AUTHOR",
   * "INFLAMMATORY", etc).
   * @param attributeScores attributeScores or {@code null} for none
   */
  public AnalyzeCommentResponse setAttributeScores(java.util.Map<String, AttributeScores> attributeScores) {
    this.attributeScores = attributeScores;
    return this;
  }

  /**
   * Same token from the original AnalyzeCommentRequest.
   * @return value or {@code null} for none
   */
  public java.lang.String getClientToken() {
    return clientToken;
  }

  /**
   * Same token from the original AnalyzeCommentRequest.
   * @param clientToken clientToken or {@code null} for none
   */
  public AnalyzeCommentResponse setClientToken(java.lang.String clientToken) {
    this.clientToken = clientToken;
    return this;
  }

  /**
   * Contains the languages detected from the text content, sorted in order of likelihood.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getDetectedLanguages() {
    return detectedLanguages;
  }

  /**
   * Contains the languages detected from the text content, sorted in order of likelihood.
   * @param detectedLanguages detectedLanguages or {@code null} for none
   */
  public AnalyzeCommentResponse setDetectedLanguages(java.util.List<java.lang.String> detectedLanguages) {
    this.detectedLanguages = detectedLanguages;
    return this;
  }

  /**
   * The language(s) used by CommentAnalyzer service to choose which Model to use when analyzing the
   * comment. Might better be called "effective_languages". The logic used to make the choice is as
   * follows:   if !Request.languages.empty()     effective_languages = Request.languages   else
   * effective_languages = detected_languages[0]
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getLanguages() {
    return languages;
  }

  /**
   * The language(s) used by CommentAnalyzer service to choose which Model to use when analyzing the
   * comment. Might better be called "effective_languages". The logic used to make the choice is as
   * follows:   if !Request.languages.empty()     effective_languages = Request.languages   else
   * effective_languages = detected_languages[0]
   * @param languages languages or {@code null} for none
   */
  public AnalyzeCommentResponse setLanguages(java.util.List<java.lang.String> languages) {
    this.languages = languages;
    return this;
  }

  @Override
  public AnalyzeCommentResponse set(String fieldName, Object value) {
    return (AnalyzeCommentResponse) super.set(fieldName, value);
  }

  @Override
  public AnalyzeCommentResponse clone() {
    return (AnalyzeCommentResponse) super.clone();
  }

}
