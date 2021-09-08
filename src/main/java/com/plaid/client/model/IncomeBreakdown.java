/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.31.1
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
import java.math.BigDecimal;

/**
 * An object representing a breakdown of the different income types on the paystub.
 */
@ApiModel(description = "An object representing a breakdown of the different income types on the paystub.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-09-08T01:09:19.667Z[GMT]")
public class IncomeBreakdown {
  /**
   * The type of income. Possible values include:   &#x60;\&quot;regular\&quot;&#x60;: regular income   &#x60;\&quot;overtime\&quot;&#x60;: overtime income    &#x60;\&quot;bonus\&quot;&#x60;: bonus income
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    BONUS("bonus"),
    
    OVERTIME("overtime"),
    
    REGULAR("regular"),
    
    NULL("null");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public static final String SERIALIZED_NAME_RATE = "rate";
  @SerializedName(SERIALIZED_NAME_RATE)
  private Double rate;

  public static final String SERIALIZED_NAME_HOURS = "hours";
  @SerializedName(SERIALIZED_NAME_HOURS)
  private Double hours;

  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  private Double total;


  public IncomeBreakdown type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of income. Possible values include:   &#x60;\&quot;regular\&quot;&#x60;: regular income   &#x60;\&quot;overtime\&quot;&#x60;: overtime income    &#x60;\&quot;bonus\&quot;&#x60;: bonus income
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The type of income. Possible values include:   `\"regular\"`: regular income   `\"overtime\"`: overtime income    `\"bonus\"`: bonus income")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public IncomeBreakdown rate(Double rate) {
    
    this.rate = rate;
    return this;
  }

   /**
   * The hourly rate at which the income is paid.
   * @return rate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The hourly rate at which the income is paid.")

  public Double getRate() {
    return rate;
  }


  public void setRate(Double rate) {
    this.rate = rate;
  }


  public IncomeBreakdown hours(Double hours) {
    
    this.hours = hours;
    return this;
  }

   /**
   * The number of hours logged for this income for this pay period.
   * @return hours
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The number of hours logged for this income for this pay period.")

  public Double getHours() {
    return hours;
  }


  public void setHours(Double hours) {
    this.hours = hours;
  }


  public IncomeBreakdown total(Double total) {
    
    this.total = total;
    return this;
  }

   /**
   * The total pay for this pay period.
   * @return total
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The total pay for this pay period.")

  public Double getTotal() {
    return total;
  }


  public void setTotal(Double total) {
    this.total = total;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncomeBreakdown incomeBreakdown = (IncomeBreakdown) o;
    return Objects.equals(this.type, incomeBreakdown.type) &&
        Objects.equals(this.rate, incomeBreakdown.rate) &&
        Objects.equals(this.hours, incomeBreakdown.hours) &&
        Objects.equals(this.total, incomeBreakdown.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, rate, hours, total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncomeBreakdown {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    hours: ").append(toIndentedString(hours)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

