package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiVirtualNetworkVirtualNetworkService;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiVirtualNetworkGetvirtualnetworkservicedetailsOutput
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiVirtualNetworkGetvirtualnetworkservicedetailsOutput   {
  @JsonProperty("service")
  private TapiVirtualNetworkVirtualNetworkService service = null;

  public TapiVirtualNetworkGetvirtualnetworkservicedetailsOutput service(TapiVirtualNetworkVirtualNetworkService service) {
    this.service = service;
    return this;
  }

  /**
   * Get service
   * @return service
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiVirtualNetworkVirtualNetworkService getService() {
    return service;
  }

  public void setService(TapiVirtualNetworkVirtualNetworkService service) {
    this.service = service;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiVirtualNetworkGetvirtualnetworkservicedetailsOutput tapiVirtualNetworkGetvirtualnetworkservicedetailsOutput = (TapiVirtualNetworkGetvirtualnetworkservicedetailsOutput) o;
    return Objects.equals(this.service, tapiVirtualNetworkGetvirtualnetworkservicedetailsOutput.service);
  }

  @Override
  public int hashCode() {
    return Objects.hash(service);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiVirtualNetworkGetvirtualnetworkservicedetailsOutput {\n");
    
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
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
