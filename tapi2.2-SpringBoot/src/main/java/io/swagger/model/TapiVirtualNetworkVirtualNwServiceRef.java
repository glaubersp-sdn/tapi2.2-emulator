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
 * TapiVirtualNetworkVirtualNwServiceRef
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiVirtualNetworkVirtualNwServiceRef   {
  @JsonProperty("virtual-nw-service-uuid")
  private String virtualNwServiceUuid = null;

  public TapiVirtualNetworkVirtualNwServiceRef virtualNwServiceUuid(String virtualNwServiceUuid) {
    this.virtualNwServiceUuid = virtualNwServiceUuid;
    return this;
  }

  /**
   * none
   * @return virtualNwServiceUuid
  **/
  @ApiModelProperty(value = "none")

  public String getVirtualNwServiceUuid() {
    return virtualNwServiceUuid;
  }

  public void setVirtualNwServiceUuid(String virtualNwServiceUuid) {
    this.virtualNwServiceUuid = virtualNwServiceUuid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiVirtualNetworkVirtualNwServiceRef tapiVirtualNetworkVirtualNwServiceRef = (TapiVirtualNetworkVirtualNwServiceRef) o;
    return Objects.equals(this.virtualNwServiceUuid, tapiVirtualNetworkVirtualNwServiceRef.virtualNwServiceUuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(virtualNwServiceUuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiVirtualNetworkVirtualNwServiceRef {\n");
    
    sb.append("    virtualNwServiceUuid: ").append(toIndentedString(virtualNwServiceUuid)).append("\n");
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
