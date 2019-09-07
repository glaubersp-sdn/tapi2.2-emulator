package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiTopologyCostCharacteristic
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiTopologyCostCharacteristic   {
  @JsonProperty("cost-algorithm")
  private String costAlgorithm = null;

  @JsonProperty("cost-name")
  private String costName = null;

  @JsonProperty("cost-value")
  private String costValue = null;

  public TapiTopologyCostCharacteristic costAlgorithm(String costAlgorithm) {
    this.costAlgorithm = costAlgorithm;
    return this;
  }

  /**
   * The cost may vary based upon some properties of the TopologicalEntity. The rules for the variation are conveyed by the costAlgorithm.
   * @return costAlgorithm
  **/
  @ApiModelProperty(value = "The cost may vary based upon some properties of the TopologicalEntity. The rules for the variation are conveyed by the costAlgorithm.")

  public String getCostAlgorithm() {
    return costAlgorithm;
  }

  public void setCostAlgorithm(String costAlgorithm) {
    this.costAlgorithm = costAlgorithm;
  }

  public TapiTopologyCostCharacteristic costName(String costName) {
    this.costName = costName;
    return this;
  }

  /**
   * The cost characteristic will related to some aspect of the TopologicalEntity (e.g. $ cost, routing weight). This aspect will be conveyed by the costName.
   * @return costName
  **/
  @ApiModelProperty(value = "The cost characteristic will related to some aspect of the TopologicalEntity (e.g. $ cost, routing weight). This aspect will be conveyed by the costName.")

  public String getCostName() {
    return costName;
  }

  public void setCostName(String costName) {
    this.costName = costName;
  }

  public TapiTopologyCostCharacteristic costValue(String costValue) {
    this.costValue = costValue;
    return this;
  }

  /**
   * The specific cost.
   * @return costValue
  **/
  @ApiModelProperty(value = "The specific cost.")

  public String getCostValue() {
    return costValue;
  }

  public void setCostValue(String costValue) {
    this.costValue = costValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiTopologyCostCharacteristic tapiTopologyCostCharacteristic = (TapiTopologyCostCharacteristic) o;
    return Objects.equals(this.costAlgorithm, tapiTopologyCostCharacteristic.costAlgorithm) &&
        Objects.equals(this.costName, tapiTopologyCostCharacteristic.costName) &&
        Objects.equals(this.costValue, tapiTopologyCostCharacteristic.costValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(costAlgorithm, costName, costValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiTopologyCostCharacteristic {\n");
    
    sb.append("    costAlgorithm: ").append(toIndentedString(costAlgorithm)).append("\n");
    sb.append("    costName: ").append(toIndentedString(costName)).append("\n");
    sb.append("    costValue: ").append(toIndentedString(costValue)).append("\n");
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
