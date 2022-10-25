/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.197.3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.plaid.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * CreditRelayRemoveResponse defines the response schema for &#x60;/credit/relay/remove&#x60;
 */
@ApiModel(description = "CreditRelayRemoveResponse defines the response schema for `/credit/relay/remove`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-25T18:01:37.538604Z[Etc/UTC]")
public class CreditRelayRemoveResponse {
  public static final String SERIALIZED_NAME_REMOVED = "removed";
  @SerializedName(SERIALIZED_NAME_REMOVED)
  private Boolean removed;

  public static final String SERIALIZED_NAME_REQUEST_ID = "request_id";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;


  public CreditRelayRemoveResponse removed(Boolean removed) {
    
    this.removed = removed;
    return this;
  }

   /**
   * &#x60;true&#x60; if the Relay token was successfully removed.
   * @return removed
  **/
  @ApiModelProperty(required = true, value = "`true` if the Relay token was successfully removed.")

  public Boolean getRemoved() {
    return removed;
  }


  public void setRemoved(Boolean removed) {
    this.removed = removed;
  }


  public CreditRelayRemoveResponse requestId(String requestId) {
    
    this.requestId = requestId;
    return this;
  }

   /**
   * A unique identifier for the request, which can be used for troubleshooting. This identifier, like all Plaid identifiers, is case sensitive.
   * @return requestId
  **/
  @ApiModelProperty(required = true, value = "A unique identifier for the request, which can be used for troubleshooting. This identifier, like all Plaid identifiers, is case sensitive.")

  public String getRequestId() {
    return requestId;
  }


  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditRelayRemoveResponse creditRelayRemoveResponse = (CreditRelayRemoveResponse) o;
    return Objects.equals(this.removed, creditRelayRemoveResponse.removed) &&
        Objects.equals(this.requestId, creditRelayRemoveResponse.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(removed, requestId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditRelayRemoveResponse {\n");
    sb.append("    removed: ").append(toIndentedString(removed)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
