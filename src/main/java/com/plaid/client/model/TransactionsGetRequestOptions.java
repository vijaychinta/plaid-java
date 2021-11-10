/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.46.1
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
import java.util.ArrayList;
import java.util.List;

/**
 * An optional object to be used with the request. If specified, &#x60;options&#x60; must not be &#x60;null&#x60;.
 */
@ApiModel(description = "An optional object to be used with the request. If specified, `options` must not be `null`.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-10T01:11:28.812Z[GMT]")
public class TransactionsGetRequestOptions {
  public static final String SERIALIZED_NAME_ACCOUNT_IDS = "account_ids";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_IDS)
  private List<String> accountIds = null;

  public static final String SERIALIZED_NAME_COUNT = "count";
  @SerializedName(SERIALIZED_NAME_COUNT)
  private Integer count = 100;

  public static final String SERIALIZED_NAME_OFFSET = "offset";
  @SerializedName(SERIALIZED_NAME_OFFSET)
  private Integer offset = 0;

  public static final String SERIALIZED_NAME_INCLUDE_ORIGINAL_DESCRIPTION = "include_original_description";
  @SerializedName(SERIALIZED_NAME_INCLUDE_ORIGINAL_DESCRIPTION)
  private Boolean includeOriginalDescription = false;

  public static final String SERIALIZED_NAME_INCLUDE_PERSONAL_FINANCE_CATEGORY_BETA = "include_personal_finance_category_beta";
  @SerializedName(SERIALIZED_NAME_INCLUDE_PERSONAL_FINANCE_CATEGORY_BETA)
  private Boolean includePersonalFinanceCategoryBeta = false;


  public TransactionsGetRequestOptions accountIds(List<String> accountIds) {
    
    this.accountIds = accountIds;
    return this;
  }

  public TransactionsGetRequestOptions addAccountIdsItem(String accountIdsItem) {
    if (this.accountIds == null) {
      this.accountIds = new ArrayList<>();
    }
    this.accountIds.add(accountIdsItem);
    return this;
  }

   /**
   * A list of &#x60;account_ids&#x60; to retrieve for the Item  Note: An error will be returned if a provided &#x60;account_id&#x60; is not associated with the Item.
   * @return accountIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of `account_ids` to retrieve for the Item  Note: An error will be returned if a provided `account_id` is not associated with the Item.")

  public List<String> getAccountIds() {
    return accountIds;
  }


  public void setAccountIds(List<String> accountIds) {
    this.accountIds = accountIds;
  }


  public TransactionsGetRequestOptions count(Integer count) {
    
    this.count = count;
    return this;
  }

   /**
   * The number of transactions to fetch.
   * minimum: 1
   * maximum: 500
   * @return count
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of transactions to fetch.")

  public Integer getCount() {
    return count;
  }


  public void setCount(Integer count) {
    this.count = count;
  }


  public TransactionsGetRequestOptions offset(Integer offset) {
    
    this.offset = offset;
    return this;
  }

   /**
   * The number of transactions to skip. The default value is 0.
   * minimum: 0
   * @return offset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of transactions to skip. The default value is 0.")

  public Integer getOffset() {
    return offset;
  }


  public void setOffset(Integer offset) {
    this.offset = offset;
  }


  public TransactionsGetRequestOptions includeOriginalDescription(Boolean includeOriginalDescription) {
    
    this.includeOriginalDescription = includeOriginalDescription;
    return this;
  }

   /**
   * Include the raw unparsed transaction description from the financial institution. This field is disabled by default. If you need this information in addition to the parsed data provided, contact your Plaid Account Manager.
   * @return includeOriginalDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Include the raw unparsed transaction description from the financial institution. This field is disabled by default. If you need this information in addition to the parsed data provided, contact your Plaid Account Manager.")

  public Boolean getIncludeOriginalDescription() {
    return includeOriginalDescription;
  }


  public void setIncludeOriginalDescription(Boolean includeOriginalDescription) {
    this.includeOriginalDescription = includeOriginalDescription;
  }


  public TransactionsGetRequestOptions includePersonalFinanceCategoryBeta(Boolean includePersonalFinanceCategoryBeta) {
    
    this.includePersonalFinanceCategoryBeta = includePersonalFinanceCategoryBeta;
    return this;
  }

   /**
   * Include the &#x60;personal_finance_category&#x60; object in the response. This feature is currently in beta – to request access, contact transactions-feedback@plaid.com.
   * @return includePersonalFinanceCategoryBeta
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Include the `personal_finance_category` object in the response. This feature is currently in beta – to request access, contact transactions-feedback@plaid.com.")

  public Boolean getIncludePersonalFinanceCategoryBeta() {
    return includePersonalFinanceCategoryBeta;
  }


  public void setIncludePersonalFinanceCategoryBeta(Boolean includePersonalFinanceCategoryBeta) {
    this.includePersonalFinanceCategoryBeta = includePersonalFinanceCategoryBeta;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionsGetRequestOptions transactionsGetRequestOptions = (TransactionsGetRequestOptions) o;
    return Objects.equals(this.accountIds, transactionsGetRequestOptions.accountIds) &&
        Objects.equals(this.count, transactionsGetRequestOptions.count) &&
        Objects.equals(this.offset, transactionsGetRequestOptions.offset) &&
        Objects.equals(this.includeOriginalDescription, transactionsGetRequestOptions.includeOriginalDescription) &&
        Objects.equals(this.includePersonalFinanceCategoryBeta, transactionsGetRequestOptions.includePersonalFinanceCategoryBeta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountIds, count, offset, includeOriginalDescription, includePersonalFinanceCategoryBeta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionsGetRequestOptions {\n");
    sb.append("    accountIds: ").append(toIndentedString(accountIds)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    includeOriginalDescription: ").append(toIndentedString(includeOriginalDescription)).append("\n");
    sb.append("    includePersonalFinanceCategoryBeta: ").append(toIndentedString(includePersonalFinanceCategoryBeta)).append("\n");
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

