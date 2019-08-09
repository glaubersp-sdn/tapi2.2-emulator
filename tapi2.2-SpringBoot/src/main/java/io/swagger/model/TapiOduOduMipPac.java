package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiOduDegThr;
import io.swagger.model.TapiOduTimDetMo;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiOduOduMipPac
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiOduOduMipPac   {
  @JsonProperty("tim-det-mode")
  private TapiOduTimDetMo timDetMode = null;

  @JsonProperty("ex-dapi")
  private String exDapi = null;

  @JsonProperty("deg-m")
  private Integer degM = null;

  @JsonProperty("acti")
  private String acti = null;

  @JsonProperty("ex-sapi")
  private String exSapi = null;

  @JsonProperty("deg-thr")
  private TapiOduDegThr degThr = null;

  @JsonProperty("tim-act-disabled")
  private Boolean timActDisabled = true;

  public TapiOduOduMipPac timDetMode(TapiOduTimDetMo timDetMode) {
    this.timDetMode = timDetMode;
    return this;
  }

  /**
   * Get timDetMode
   * @return timDetMode
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiOduTimDetMo getTimDetMode() {
    return timDetMode;
  }

  public void setTimDetMode(TapiOduTimDetMo timDetMode) {
    this.timDetMode = timDetMode;
  }

  public TapiOduOduMipPac exDapi(String exDapi) {
    this.exDapi = exDapi;
    return this;
  }

  /**
   * The Expected Destination Access Point Identifier (ExDAPI), provisioned by the managing system, to be compared with the TTI accepted at the overhead position of the sink for the purpose of checking the integrity of connectivity.
   * @return exDapi
  **/
  @ApiModelProperty(value = "The Expected Destination Access Point Identifier (ExDAPI), provisioned by the managing system, to be compared with the TTI accepted at the overhead position of the sink for the purpose of checking the integrity of connectivity.")

  public String getExDapi() {
    return exDapi;
  }

  public void setExDapi(String exDapi) {
    this.exDapi = exDapi;
  }

  public TapiOduOduMipPac degM(Integer degM) {
    this.degM = degM;
    return this;
  }

  /**
   * This attribute indicates the threshold level for declaring a Degraded Signal defect (dDEG). A dDEG shall be declared if DegM consecutive bad PM Seconds are detected.
   * @return degM
  **/
  @ApiModelProperty(value = "This attribute indicates the threshold level for declaring a Degraded Signal defect (dDEG). A dDEG shall be declared if DegM consecutive bad PM Seconds are detected.")

  public Integer getDegM() {
    return degM;
  }

  public void setDegM(Integer degM) {
    this.degM = degM;
  }

  public TapiOduOduMipPac acti(String acti) {
    this.acti = acti;
    return this;
  }

  /**
   * The Trail Trace Identifier (TTI) information recovered (Accepted) from the TTI overhead position at the sink of a trail.
   * @return acti
  **/
  @ApiModelProperty(value = "The Trail Trace Identifier (TTI) information recovered (Accepted) from the TTI overhead position at the sink of a trail.")

  public String getActi() {
    return acti;
  }

  public void setActi(String acti) {
    this.acti = acti;
  }

  public TapiOduOduMipPac exSapi(String exSapi) {
    this.exSapi = exSapi;
    return this;
  }

  /**
   * The Expected Source Access Point Identifier (ExSAPI), provisioned by the managing system, to be compared with the TTI accepted at the overhead position of the sink for the purpose of checking the integrity of connectivity.                  
   * @return exSapi
  **/
  @ApiModelProperty(value = "The Expected Source Access Point Identifier (ExSAPI), provisioned by the managing system, to be compared with the TTI accepted at the overhead position of the sink for the purpose of checking the integrity of connectivity.                  ")

  public String getExSapi() {
    return exSapi;
  }

  public void setExSapi(String exSapi) {
    this.exSapi = exSapi;
  }

  public TapiOduOduMipPac degThr(TapiOduDegThr degThr) {
    this.degThr = degThr;
    return this;
  }

  /**
   * Get degThr
   * @return degThr
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiOduDegThr getDegThr() {
    return degThr;
  }

  public void setDegThr(TapiOduDegThr degThr) {
    this.degThr = degThr;
  }

  public TapiOduOduMipPac timActDisabled(Boolean timActDisabled) {
    this.timActDisabled = timActDisabled;
    return this;
  }

  /**
   * This attribute provides the control capability for the managing system to enable or disable the Consequent Action function when detecting Trace Identifier Mismatch (TIM) at the trail termination sink.
   * @return timActDisabled
  **/
  @ApiModelProperty(value = "This attribute provides the control capability for the managing system to enable or disable the Consequent Action function when detecting Trace Identifier Mismatch (TIM) at the trail termination sink.")

  public Boolean isTimActDisabled() {
    return timActDisabled;
  }

  public void setTimActDisabled(Boolean timActDisabled) {
    this.timActDisabled = timActDisabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiOduOduMipPac tapiOduOduMipPac = (TapiOduOduMipPac) o;
    return Objects.equals(this.timDetMode, tapiOduOduMipPac.timDetMode) &&
        Objects.equals(this.exDapi, tapiOduOduMipPac.exDapi) &&
        Objects.equals(this.degM, tapiOduOduMipPac.degM) &&
        Objects.equals(this.acti, tapiOduOduMipPac.acti) &&
        Objects.equals(this.exSapi, tapiOduOduMipPac.exSapi) &&
        Objects.equals(this.degThr, tapiOduOduMipPac.degThr) &&
        Objects.equals(this.timActDisabled, tapiOduOduMipPac.timActDisabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timDetMode, exDapi, degM, acti, exSapi, degThr, timActDisabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiOduOduMipPac {\n");
    
    sb.append("    timDetMode: ").append(toIndentedString(timDetMode)).append("\n");
    sb.append("    exDapi: ").append(toIndentedString(exDapi)).append("\n");
    sb.append("    degM: ").append(toIndentedString(degM)).append("\n");
    sb.append("    acti: ").append(toIndentedString(acti)).append("\n");
    sb.append("    exSapi: ").append(toIndentedString(exSapi)).append("\n");
    sb.append("    degThr: ").append(toIndentedString(degThr)).append("\n");
    sb.append("    timActDisabled: ").append(toIndentedString(timActDisabled)).append("\n");
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
