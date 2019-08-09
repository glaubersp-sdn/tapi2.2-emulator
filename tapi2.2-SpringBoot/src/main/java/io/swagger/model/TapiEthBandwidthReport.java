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
 * TapiEthBandwidthReport
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiEthBandwidthReport   {
  @JsonProperty("port-id")
  private Integer portId = null;

  @JsonProperty("source-mac-address")
  private String sourceMacAddress = null;

  @JsonProperty("current-bandwidth")
  private Integer currentBandwidth = null;

  @JsonProperty("nominal-bandwidth")
  private Integer nominalBandwidth = null;

  public TapiEthBandwidthReport portId(Integer portId) {
    this.portId = portId;
    return this;
  }

  /**
   * This attribute returns the far end port identifier.
   * @return portId
  **/
  @ApiModelProperty(value = "This attribute returns the far end port identifier.")

  public Integer getPortId() {
    return portId;
  }

  public void setPortId(Integer portId) {
    this.portId = portId;
  }

  public TapiEthBandwidthReport sourceMacAddress(String sourceMacAddress) {
    this.sourceMacAddress = sourceMacAddress;
    return this;
  }

  /**
   * The sourceMacAddress is the address from the far end.
   * @return sourceMacAddress
  **/
  @ApiModelProperty(value = "The sourceMacAddress is the address from the far end.")

  public String getSourceMacAddress() {
    return sourceMacAddress;
  }

  public void setSourceMacAddress(String sourceMacAddress) {
    this.sourceMacAddress = sourceMacAddress;
  }

  public TapiEthBandwidthReport currentBandwidth(Integer currentBandwidth) {
    this.currentBandwidth = currentBandwidth;
    return this;
  }

  /**
   * This attribute returns the current bandwidth.
   * @return currentBandwidth
  **/
  @ApiModelProperty(value = "This attribute returns the current bandwidth.")

  public Integer getCurrentBandwidth() {
    return currentBandwidth;
  }

  public void setCurrentBandwidth(Integer currentBandwidth) {
    this.currentBandwidth = currentBandwidth;
  }

  public TapiEthBandwidthReport nominalBandwidth(Integer nominalBandwidth) {
    this.nominalBandwidth = nominalBandwidth;
    return this;
  }

  /**
   * This attribute returns the configured bandwidth
   * @return nominalBandwidth
  **/
  @ApiModelProperty(value = "This attribute returns the configured bandwidth")

  public Integer getNominalBandwidth() {
    return nominalBandwidth;
  }

  public void setNominalBandwidth(Integer nominalBandwidth) {
    this.nominalBandwidth = nominalBandwidth;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiEthBandwidthReport tapiEthBandwidthReport = (TapiEthBandwidthReport) o;
    return Objects.equals(this.portId, tapiEthBandwidthReport.portId) &&
        Objects.equals(this.sourceMacAddress, tapiEthBandwidthReport.sourceMacAddress) &&
        Objects.equals(this.currentBandwidth, tapiEthBandwidthReport.currentBandwidth) &&
        Objects.equals(this.nominalBandwidth, tapiEthBandwidthReport.nominalBandwidth);
  }

  @Override
  public int hashCode() {
    return Objects.hash(portId, sourceMacAddress, currentBandwidth, nominalBandwidth);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiEthBandwidthReport {\n");
    
    sb.append("    portId: ").append(toIndentedString(portId)).append("\n");
    sb.append("    sourceMacAddress: ").append(toIndentedString(sourceMacAddress)).append("\n");
    sb.append("    currentBandwidth: ").append(toIndentedString(currentBandwidth)).append("\n");
    sb.append("    nominalBandwidth: ").append(toIndentedString(nominalBandwidth)).append("\n");
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
