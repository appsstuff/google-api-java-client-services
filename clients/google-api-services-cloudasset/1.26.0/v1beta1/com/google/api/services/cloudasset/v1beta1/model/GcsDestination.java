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

package com.google.api.services.cloudasset.v1beta1.model;

/**
 * A Cloud Storage location.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Asset API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GcsDestination extends com.google.api.client.json.GenericJson {

  /**
   * The uri of the Cloud Storage object. It's the same uri that is used by gsutil. For example:
   * "gs://bucket_name/object_name". See [Viewing and Editing Object
   * Metadata](https://cloud.google.com/storage/docs/viewing-editing-metadata) for more information.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String uri;

  /**
   * The uri prefix of all generated Cloud Storage objects. For example:
   * "gs://bucket_name/object_name_prefix". Each object uri is in format:
   * "gs://bucket_name/object_name_prefix// and only contains assets for that type.  starts from 0.
   * For example: "gs://bucket_name/object_name_prefix/google.compute.disk/0" is the first shard of
   * output objects containing all google.compute.disk assets. An INVALID_ARGUMENT error will be
   * returned if file with the same name "gs://bucket_name/object_name_prefix" already exists.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String uriPrefix;

  /**
   * The uri of the Cloud Storage object. It's the same uri that is used by gsutil. For example:
   * "gs://bucket_name/object_name". See [Viewing and Editing Object
   * Metadata](https://cloud.google.com/storage/docs/viewing-editing-metadata) for more information.
   * @return value or {@code null} for none
   */
  public java.lang.String getUri() {
    return uri;
  }

  /**
   * The uri of the Cloud Storage object. It's the same uri that is used by gsutil. For example:
   * "gs://bucket_name/object_name". See [Viewing and Editing Object
   * Metadata](https://cloud.google.com/storage/docs/viewing-editing-metadata) for more information.
   * @param uri uri or {@code null} for none
   */
  public GcsDestination setUri(java.lang.String uri) {
    this.uri = uri;
    return this;
  }

  /**
   * The uri prefix of all generated Cloud Storage objects. For example:
   * "gs://bucket_name/object_name_prefix". Each object uri is in format:
   * "gs://bucket_name/object_name_prefix// and only contains assets for that type.  starts from 0.
   * For example: "gs://bucket_name/object_name_prefix/google.compute.disk/0" is the first shard of
   * output objects containing all google.compute.disk assets. An INVALID_ARGUMENT error will be
   * returned if file with the same name "gs://bucket_name/object_name_prefix" already exists.
   * @return value or {@code null} for none
   */
  public java.lang.String getUriPrefix() {
    return uriPrefix;
  }

  /**
   * The uri prefix of all generated Cloud Storage objects. For example:
   * "gs://bucket_name/object_name_prefix". Each object uri is in format:
   * "gs://bucket_name/object_name_prefix// and only contains assets for that type.  starts from 0.
   * For example: "gs://bucket_name/object_name_prefix/google.compute.disk/0" is the first shard of
   * output objects containing all google.compute.disk assets. An INVALID_ARGUMENT error will be
   * returned if file with the same name "gs://bucket_name/object_name_prefix" already exists.
   * @param uriPrefix uriPrefix or {@code null} for none
   */
  public GcsDestination setUriPrefix(java.lang.String uriPrefix) {
    this.uriPrefix = uriPrefix;
    return this;
  }

  @Override
  public GcsDestination set(String fieldName, Object value) {
    return (GcsDestination) super.set(fieldName, value);
  }

  @Override
  public GcsDestination clone() {
    return (GcsDestination) super.clone();
  }

}