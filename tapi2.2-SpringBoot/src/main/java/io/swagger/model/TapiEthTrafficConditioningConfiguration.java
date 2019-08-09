package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiEthColourMode;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiEthTrafficConditioningConfiguration
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiEthTrafficConditioningConfiguration   {
  @JsonProperty("queue-id")
  private Integer queueId = null;

  @JsonProperty("coupling-flag")
  private Boolean couplingFlag = false;

  @JsonProperty("cbs")
  private Integer cbs = null;

  @JsonProperty("ebs")
  private Integer ebs = null;

  @JsonProperty("colour-mode")
  private TapiEthColourMode colourMode = null;

  @JsonProperty("cir")
  private Integer cir = null;

  @JsonProperty("eir")
  private Integer eir = null;

  public TapiEthTrafficConditioningConfiguration queueId(Integer queueId) {
    this.queueId = queueId;
    return this;
  }

  /**
   * This attribute indicates the queue id.
   * @return queueId
  **/
  @ApiModelProperty(value = "This attribute indicates the queue id.")

  public Integer getQueueId() {
    return queueId;
  }

  public void setQueueId(Integer queueId) {
    this.queueId = queueId;
  }

  public TapiEthTrafficConditioningConfiguration couplingFlag(Boolean couplingFlag) {
    this.couplingFlag = couplingFlag;
    return this;
  }

  /**
   * This attribute indicates the coupling flag.
   * @return couplingFlag
  **/
  @ApiModelProperty(value = "This attribute indicates the coupling flag.")

  public Boolean isCouplingFlag() {
    return couplingFlag;
  }

  public void setCouplingFlag(Boolean couplingFlag) {
    this.couplingFlag = couplingFlag;
  }

  public TapiEthTrafficConditioningConfiguration cbs(Integer cbs) {
    this.cbs = cbs;
    return this;
  }

  /**
   * This attribute indicates the Committed Burst Size in bytes.
   * @return cbs
  **/
  @ApiModelProperty(value = "This attribute indicates the Committed Burst Size in bytes.")

  public Integer getCbs() {
    return cbs;
  }

  public void setCbs(Integer cbs) {
    this.cbs = cbs;
  }

  public TapiEthTrafficConditioningConfiguration ebs(Integer ebs) {
    this.ebs = ebs;
    return this;
  }

  /**
   * This attribute indicates the Excess Burst Size in bytes.
   * @return ebs
  **/
  @ApiModelProperty(value = "This attribute indicates the Excess Burst Size in bytes.")

  public Integer getEbs() {
    return ebs;
  }

  public void setEbs(Integer ebs) {
    this.ebs = ebs;
  }

  public TapiEthTrafficConditioningConfiguration colourMode(TapiEthColourMode colourMode) {
    this.colourMode = colourMode;
    return this;
  }

  /**
   * Get colourMode
   * @return colourMode
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEthColourMode getColourMode() {
    return colourMode;
  }

  public void setColourMode(TapiEthColourMode colourMode) {
    this.colourMode = colourMode;
  }

  public TapiEthTrafficConditioningConfiguration cir(Integer cir) {
    this.cir = cir;
    return this;
  }

  /**
   * This attribute indicates the Committed Information Rate in bits/s.
   * @return cir
  **/
  @ApiModelProperty(value = "This attribute indicates the Committed Information Rate in bits/s.")

  public Integer getCir() {
    return cir;
  }

  public void setCir(Integer cir) {
    this.cir = cir;
  }

  public TapiEthTrafficConditioningConfiguration eir(Integer eir) {
    this.eir = eir;
    return this;
  }

  /**
   * This attribute indicates the Excess Information Rate in bits/s.
   * @return eir
  **/
  @ApiModelProperty(value = "This attribute indicates the Excess Information Rate in bits/s.")

  public Integer getEir() {
    return eir;
  }

  public void setEir(Integer eir) {
    this.eir = eir;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiEthTrafficConditioningConfiguration tapiEthTrafficConditioningConfiguration = (TapiEthTrafficConditioningConfiguration) o;
    return Objects.equals(this.queueId, tapiEthTrafficConditioningConfiguration.queueId) &&
        Objects.equals(this.couplingFlag, tapiEthTrafficConditioningConfiguration.couplingFlag) &&
        Objects.equals(this.cbs, tapiEthTrafficConditioningConfiguration.cbs) &&
        Objects.equals(this.ebs, tapiEthTrafficConditioningConfiguration.ebs) &&
        Objects.equals(this.colourMode, tapiEthTrafficConditioningConfiguration.colourMode) &&
        Objects.equals(this.cir, tapiEthTrafficConditioningConfiguration.cir) &&
        Objects.equals(this.eir, tapiEthTrafficConditioningConfiguration.eir);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queueId, couplingFlag, cbs, ebs, colourMode, cir, eir);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiEthTrafficConditioningConfiguration {\n");
    
    sb.append("    queueId: ").append(toIndentedString(queueId)).append("\n");
    sb.append("    couplingFlag: ").append(toIndentedString(couplingFlag)).append("\n");
    sb.append("    cbs: ").append(toIndentedString(cbs)).append("\n");
    sb.append("    ebs: ").append(toIndentedString(ebs)).append("\n");
    sb.append("    colourMode: ").append(toIndentedString(colourMode)).append("\n");
    sb.append("    cir: ").append(toIndentedString(cir)).append("\n");
    sb.append("    eir: ").append(toIndentedString(eir)).append("\n");
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
