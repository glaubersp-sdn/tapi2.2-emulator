package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiCommonTimePeriod;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiCommonTimeInterval
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiCommonTimeInterval   {
  @JsonProperty("period")
  @Valid
  private List<TapiCommonTimePeriod> period = null;

  public TapiCommonTimeInterval period(List<TapiCommonTimePeriod> period) {
    this.period = period;
    return this;
  }

  public TapiCommonTimeInterval addPeriodItem(TapiCommonTimePeriod periodItem) {
    if (this.period == null) {
      this.period = new ArrayList<>();
    }
    this.period.add(periodItem);
    return this;
  }

  /**
   * none
   * @return period
  **/
  @ApiModelProperty(value = "none")
  @Valid
  public List<TapiCommonTimePeriod> getPeriod() {
    return period;
  }

  public void setPeriod(List<TapiCommonTimePeriod> period) {
    this.period = period;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiCommonTimeInterval tapiCommonTimeInterval = (TapiCommonTimeInterval) o;
    return Objects.equals(this.period, tapiCommonTimeInterval.period);
  }

  @Override
  public int hashCode() {
    return Objects.hash(period);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiCommonTimeInterval {\n");
    
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
