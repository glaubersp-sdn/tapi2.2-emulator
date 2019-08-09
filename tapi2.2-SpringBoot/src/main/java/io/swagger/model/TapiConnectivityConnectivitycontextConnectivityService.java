package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * TapiConnectivityConnectivitycontextConnectivityService
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiConnectivityConnectivitycontextConnectivityService extends TapiCommonAdminStatePac  {
  @JsonProperty("name")
  @Valid
  private List<TapiCommonNameAndValue> name = null;

  @JsonProperty("uuid")
  private String uuid = null;

  @JsonProperty("eth-connectivity-service")
  private TapiEthEthConnectivityService ethConnectivityService = null;

  @JsonProperty("topology-constraint")
  @Valid
  private List<TapiPathComputationTopologyConstraint> topologyConstraint = null;

  @JsonProperty("end-point")
  @Valid
  private List<TapiConnectivityConnectivityServiceEndPoint> endPoint = null;

  @JsonProperty("resilience-constraint")
  private TapiConnectivityResilienceConstraint resilienceConstraint = null;

  @JsonProperty("layer-protocol-name")
  private TapiCommonLayerProtocolName layerProtocolName = null;

  @JsonProperty("routing-constraint")
  private TapiPathComputationRoutingConstraint routingConstraint = null;

  @JsonProperty("connection")
  @Valid
  private List<TapiConnectivityConnectionRef> connection = null;

  @JsonProperty("connectivity-constraint")
  private TapiConnectivityConnectivityConstraint connectivityConstraint = null;

  @JsonProperty("direction")
  private TapiCommonForwardingDirection direction = null;

  public TapiConnectivityConnectivitycontextConnectivityService name(List<TapiCommonNameAndValue> name) {
    this.name = name;
    return this;
  }

  public TapiConnectivityConnectivitycontextConnectivityService addNameItem(TapiCommonNameAndValue nameItem) {
    if (this.name == null) {
      this.name = new ArrayList<TapiCommonNameAndValue>();
    }
    this.name.add(nameItem);
    return this;
  }

  /**
   * List of names. This value is unique in some namespace but may change during the life of the entity.                  A name carries no semantics with respect to the purpose of the entity.
   * @return name
  **/
  @ApiModelProperty(value = "List of names. This value is unique in some namespace but may change during the life of the entity.                  A name carries no semantics with respect to the purpose of the entity.")
  @Valid
  public List<TapiCommonNameAndValue> getName() {
    return name;
  }

  public void setName(List<TapiCommonNameAndValue> name) {
    this.name = name;
  }

  public TapiConnectivityConnectivitycontextConnectivityService uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

  /**
   * UUID: An identifier that is universally unique within an identifier space, where the identifier space is itself globally unique, and immutable.                  An UUID carries no semantics with respect to the purpose or state of the entity.                  UUID here uses string representation as defined in RFC 4122.  The canonical representation uses lowercase characters.                  Pattern: [0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-' + '[0-9a-fA-F]{4}-[0-9a-fA-F]{12}                   Example of a UUID in string representation: f81d4fae-7dec-11d0-a765-00a0c91e6bf6
   * @return uuid
  **/
  @ApiModelProperty(value = "UUID: An identifier that is universally unique within an identifier space, where the identifier space is itself globally unique, and immutable.                  An UUID carries no semantics with respect to the purpose or state of the entity.                  UUID here uses string representation as defined in RFC 4122.  The canonical representation uses lowercase characters.                  Pattern: [0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-' + '[0-9a-fA-F]{4}-[0-9a-fA-F]{12}                   Example of a UUID in string representation: f81d4fae-7dec-11d0-a765-00a0c91e6bf6")

  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public TapiConnectivityConnectivitycontextConnectivityService ethConnectivityService(TapiEthEthConnectivityService ethConnectivityService) {
    this.ethConnectivityService = ethConnectivityService;
    return this;
  }

  /**
   * Get ethConnectivityService
   * @return ethConnectivityService
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEthEthConnectivityService getEthConnectivityService() {
    return ethConnectivityService;
  }

  public void setEthConnectivityService(TapiEthEthConnectivityService ethConnectivityService) {
    this.ethConnectivityService = ethConnectivityService;
  }

  public TapiConnectivityConnectivitycontextConnectivityService topologyConstraint(List<TapiPathComputationTopologyConstraint> topologyConstraint) {
    this.topologyConstraint = topologyConstraint;
    return this;
  }

  public TapiConnectivityConnectivitycontextConnectivityService addTopologyConstraintItem(TapiPathComputationTopologyConstraint topologyConstraintItem) {
    if (this.topologyConstraint == null) {
      this.topologyConstraint = new ArrayList<TapiPathComputationTopologyConstraint>();
    }
    this.topologyConstraint.add(topologyConstraintItem);
    return this;
  }

  /**
   * none
   * @return topologyConstraint
  **/
  @ApiModelProperty(value = "none")
  @Valid
  public List<TapiPathComputationTopologyConstraint> getTopologyConstraint() {
    return topologyConstraint;
  }

  public void setTopologyConstraint(List<TapiPathComputationTopologyConstraint> topologyConstraint) {
    this.topologyConstraint = topologyConstraint;
  }

  public TapiConnectivityConnectivitycontextConnectivityService endPoint(List<TapiConnectivityConnectivityServiceEndPoint> endPoint) {
    this.endPoint = endPoint;
    return this;
  }

  public TapiConnectivityConnectivitycontextConnectivityService addEndPointItem(
      TapiConnectivityConnectivityServiceEndPoint endPointItem) {
    if (this.endPoint == null) {
      this.endPoint = new ArrayList<TapiConnectivityConnectivityServiceEndPoint>();
    }
    this.endPoint.add(endPointItem);
    return this;
  }

  /**
   * none
   * @return endPoint
  **/
  @ApiModelProperty(value = "none")
  @Valid
  public List<TapiConnectivityConnectivityServiceEndPoint> getEndPoint() {
    return endPoint;
  }

  public void setEndPoint(List<TapiConnectivityConnectivityServiceEndPoint> endPoint) {
    this.endPoint = endPoint;
  }

  public TapiConnectivityConnectivitycontextConnectivityService resilienceConstraint(TapiConnectivityResilienceConstraint resilienceConstraint) {
    this.resilienceConstraint = resilienceConstraint;
    return this;
  }

  /**
   * Get resilienceConstraint
   * @return resilienceConstraint
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiConnectivityResilienceConstraint getResilienceConstraint() {
    return resilienceConstraint;
  }

  public void setResilienceConstraint(TapiConnectivityResilienceConstraint resilienceConstraint) {
    this.resilienceConstraint = resilienceConstraint;
  }

  public TapiConnectivityConnectivitycontextConnectivityService layerProtocolName(TapiCommonLayerProtocolName layerProtocolName) {
    this.layerProtocolName = layerProtocolName;
    return this;
  }

  /**
   * Get layerProtocolName
   * @return layerProtocolName
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiCommonLayerProtocolName getLayerProtocolName() {
    return layerProtocolName;
  }

  public void setLayerProtocolName(TapiCommonLayerProtocolName layerProtocolName) {
    this.layerProtocolName = layerProtocolName;
  }

  public TapiConnectivityConnectivitycontextConnectivityService routingConstraint(TapiPathComputationRoutingConstraint routingConstraint) {
    this.routingConstraint = routingConstraint;
    return this;
  }

  /**
   * Get routingConstraint
   * @return routingConstraint
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiPathComputationRoutingConstraint getRoutingConstraint() {
    return routingConstraint;
  }

  public void setRoutingConstraint(TapiPathComputationRoutingConstraint routingConstraint) {
    this.routingConstraint = routingConstraint;
  }

  public TapiConnectivityConnectivitycontextConnectivityService connection(List<TapiConnectivityConnectionRef> connection) {
    this.connection = connection;
    return this;
  }

  public TapiConnectivityConnectivitycontextConnectivityService addConnectionItem(TapiConnectivityConnectionRef connectionItem) {
    if (this.connection == null) {
      this.connection = new ArrayList<TapiConnectivityConnectionRef>();
    }
    this.connection.add(connectionItem);
    return this;
  }

  /**
   * none
   * @return connection
  **/
  @ApiModelProperty(value = "none")
  @Valid
  public List<TapiConnectivityConnectionRef> getConnection() {
    return connection;
  }

  public void setConnection(List<TapiConnectivityConnectionRef> connection) {
    this.connection = connection;
  }

  public TapiConnectivityConnectivitycontextConnectivityService connectivityConstraint(TapiConnectivityConnectivityConstraint connectivityConstraint) {
    this.connectivityConstraint = connectivityConstraint;
    return this;
  }

  /**
   * Get connectivityConstraint
   * @return connectivityConstraint
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiConnectivityConnectivityConstraint getConnectivityConstraint() {
    return connectivityConstraint;
  }

  public void setConnectivityConstraint(TapiConnectivityConnectivityConstraint connectivityConstraint) {
    this.connectivityConstraint = connectivityConstraint;
  }

  public TapiConnectivityConnectivitycontextConnectivityService direction(TapiCommonForwardingDirection direction) {
    this.direction = direction;
    return this;
  }

  /**
   * Get direction
   * @return direction
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiCommonForwardingDirection getDirection() {
    return direction;
  }

  public void setDirection(TapiCommonForwardingDirection direction) {
    this.direction = direction;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiConnectivityConnectivitycontextConnectivityService tapiConnectivityConnectivitycontextConnectivityService = (TapiConnectivityConnectivitycontextConnectivityService) o;
    return Objects.equals(this.name, tapiConnectivityConnectivitycontextConnectivityService.name) &&
        Objects.equals(this.uuid, tapiConnectivityConnectivitycontextConnectivityService.uuid) &&
        Objects.equals(this.ethConnectivityService, tapiConnectivityConnectivitycontextConnectivityService.ethConnectivityService) &&
        Objects.equals(this.topologyConstraint, tapiConnectivityConnectivitycontextConnectivityService.topologyConstraint) &&
        Objects.equals(this.endPoint, tapiConnectivityConnectivitycontextConnectivityService.endPoint) &&
        Objects.equals(this.resilienceConstraint, tapiConnectivityConnectivitycontextConnectivityService.resilienceConstraint) &&
        Objects.equals(this.layerProtocolName, tapiConnectivityConnectivitycontextConnectivityService.layerProtocolName) &&
        Objects.equals(this.routingConstraint, tapiConnectivityConnectivitycontextConnectivityService.routingConstraint) &&
        Objects.equals(this.connection, tapiConnectivityConnectivitycontextConnectivityService.connection) &&
        Objects.equals(this.connectivityConstraint, tapiConnectivityConnectivitycontextConnectivityService.connectivityConstraint) &&
        Objects.equals(this.direction, tapiConnectivityConnectivitycontextConnectivityService.direction) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, uuid, ethConnectivityService, topologyConstraint, endPoint, resilienceConstraint, layerProtocolName, routingConstraint, connection, connectivityConstraint, direction, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiConnectivityConnectivitycontextConnectivityService {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    ethConnectivityService: ").append(toIndentedString(ethConnectivityService)).append("\n");
    sb.append("    topologyConstraint: ").append(toIndentedString(topologyConstraint)).append("\n");
    sb.append("    endPoint: ").append(toIndentedString(endPoint)).append("\n");
    sb.append("    resilienceConstraint: ").append(toIndentedString(resilienceConstraint)).append("\n");
    sb.append("    layerProtocolName: ").append(toIndentedString(layerProtocolName)).append("\n");
    sb.append("    routingConstraint: ").append(toIndentedString(routingConstraint)).append("\n");
    sb.append("    connection: ").append(toIndentedString(connection)).append("\n");
    sb.append("    connectivityConstraint: ").append(toIndentedString(connectivityConstraint)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
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