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
 * TapiTopologyTopologyRef
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiTopologyTopologyRef   {
  @JsonProperty("topology-uuid")
  private String topologyUuid = null;

  public TapiTopologyTopologyRef topologyUuid(String topologyUuid) {
    this.topologyUuid = topologyUuid;
    return this;
  }

  /**
   * none
   * @return topologyUuid
  **/
  @ApiModelProperty(value = "none")

  public String getTopologyUuid() {
    return topologyUuid;
  }

  public void setTopologyUuid(String topologyUuid) {
    this.topologyUuid = topologyUuid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiTopologyTopologyRef tapiTopologyTopologyRef = (TapiTopologyTopologyRef) o;
    return Objects.equals(this.topologyUuid, tapiTopologyTopologyRef.topologyUuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(topologyUuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiTopologyTopologyRef {\n");
    
    sb.append("    topologyUuid: ").append(toIndentedString(topologyUuid)).append("\n");
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
