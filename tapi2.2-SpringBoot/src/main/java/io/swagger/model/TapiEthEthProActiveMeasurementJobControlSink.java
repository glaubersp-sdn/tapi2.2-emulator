package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiEthEthMeasurementJobControlCommon;
import io.swagger.model.TapiEthRepetitionPeriod;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiEthEthProActiveMeasurementJobControlSink
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiEthEthProActiveMeasurementJobControlSink extends TapiEthEthMeasurementJobControlCommon  {
  @JsonProperty("is-enabled")
  private Boolean isEnabled = true;

  @JsonProperty("sink-mep-id")
  private Integer sinkMepId = null;

  @JsonProperty("source-address")
  private String sourceAddress = null;

  public TapiEthEthProActiveMeasurementJobControlSink isEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
    return this;
  }

  /**
   * This attribute identifies the state of the measurement job. If set to TRUE, the MEP performs proactive Performance Measurement.
   * @return isEnabled
  **/
  @ApiModelProperty(value = "This attribute identifies the state of the measurement job. If set to TRUE, the MEP performs proactive Performance Measurement.")

  public Boolean isIsEnabled() {
    return isEnabled;
  }

  public void setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }

  public TapiEthEthProActiveMeasurementJobControlSink sinkMepId(Integer sinkMepId) {
    this.sinkMepId = sinkMepId;
    return this;
  }

  /**
   * none
   * @return sinkMepId
  **/
  @ApiModelProperty(value = "none")

  public Integer getSinkMepId() {
    return sinkMepId;
  }

  public void setSinkMepId(Integer sinkMepId) {
    this.sinkMepId = sinkMepId;
  }

  public TapiEthEthProActiveMeasurementJobControlSink sourceAddress(String sourceAddress) {
    this.sourceAddress = sourceAddress;
    return this;
  }

  /**
   * This attribute contains the MAC address of the peer MEP. See G.8013 for details.
   * @return sourceAddress
  **/
  @ApiModelProperty(value = "This attribute contains the MAC address of the peer MEP. See G.8013 for details.")

  public String getSourceAddress() {
    return sourceAddress;
  }

  public void setSourceAddress(String sourceAddress) {
    this.sourceAddress = sourceAddress;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiEthEthProActiveMeasurementJobControlSink tapiEthEthProActiveMeasurementJobControlSink = (TapiEthEthProActiveMeasurementJobControlSink) o;
    return Objects.equals(this.isEnabled, tapiEthEthProActiveMeasurementJobControlSink.isEnabled) &&
        Objects.equals(this.sinkMepId, tapiEthEthProActiveMeasurementJobControlSink.sinkMepId) &&
        Objects.equals(this.sourceAddress, tapiEthEthProActiveMeasurementJobControlSink.sourceAddress) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isEnabled, sinkMepId, sourceAddress, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiEthEthProActiveMeasurementJobControlSink {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    sinkMepId: ").append(toIndentedString(sinkMepId)).append("\n");
    sb.append("    sourceAddress: ").append(toIndentedString(sourceAddress)).append("\n");
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
