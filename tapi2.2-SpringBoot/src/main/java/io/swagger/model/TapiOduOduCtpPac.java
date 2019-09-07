package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiOduOduCtpPac
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiOduOduCtpPac   {
  @JsonProperty("accepted-msi")
  private String acceptedMsi = null;

  @JsonProperty("tributary-port-number")
  private Integer tributaryPortNumber = null;

  @JsonProperty("tributary-slot-list")
  @Valid
  private List<Integer> tributarySlotList = null;

  public TapiOduOduCtpPac acceptedMsi(String acceptedMsi) {
    this.acceptedMsi = acceptedMsi;
    return this;
  }

  /**
   * This attribute is applicable when the ODU CTP object instance represents a lower order ODU1 or ODU2 CTP Sink at the client layer of the ODU3P/ODU12 adaptation function or represents a lower order ODUj CTP Sink at the client layer of the ODUP/ODUj-21 adaptation function. This attribute is a 1-byte field that represents the accepted multiplex structure of the adaptation function. 
   * @return acceptedMsi
  **/
  @ApiModelProperty(value = "This attribute is applicable when the ODU CTP object instance represents a lower order ODU1 or ODU2 CTP Sink at the client layer of the ODU3P/ODU12 adaptation function or represents a lower order ODUj CTP Sink at the client layer of the ODUP/ODUj-21 adaptation function. This attribute is a 1-byte field that represents the accepted multiplex structure of the adaptation function. ")

  public String getAcceptedMsi() {
    return acceptedMsi;
  }

  public void setAcceptedMsi(String acceptedMsi) {
    this.acceptedMsi = acceptedMsi;
  }

  public TapiOduOduCtpPac tributaryPortNumber(Integer tributaryPortNumber) {
    this.tributaryPortNumber = tributaryPortNumber;
    return this;
  }

  /**
   * This attribute identifies the tributary port number that is associated with the ODU CTP.                  range of type : The value range depends on the size of the Tributary Port Number (TPN) field used which depends on th server-layer ODU or OTU.                  In case of ODUk mapping into OTUk, there is no TPN field, so the tributaryPortNumber shall be zero.                  In case of LO ODUj mapping over ODU1, ODU2 or ODU3, the TPN is encoded in a 6-bit field so the value range is 0-63. See clause 14.4.1/G.709-2016.                  In case of LO ODUj mapping over ODU4, the TPN is encoded in a 7-bit field so the value range is 0-127. See clause 14.4.1.4/G.709-2016.                  In case of ODUk mapping over ODUCn, the TPN is encoded in a 14-bit field so the value range is 0-16383. See clause 20.4.1.1/G.709-2016.                  
   * @return tributaryPortNumber
  **/
  @ApiModelProperty(value = "This attribute identifies the tributary port number that is associated with the ODU CTP.                  range of type : The value range depends on the size of the Tributary Port Number (TPN) field used which depends on th server-layer ODU or OTU.                  In case of ODUk mapping into OTUk, there is no TPN field, so the tributaryPortNumber shall be zero.                  In case of LO ODUj mapping over ODU1, ODU2 or ODU3, the TPN is encoded in a 6-bit field so the value range is 0-63. See clause 14.4.1/G.709-2016.                  In case of LO ODUj mapping over ODU4, the TPN is encoded in a 7-bit field so the value range is 0-127. See clause 14.4.1.4/G.709-2016.                  In case of ODUk mapping over ODUCn, the TPN is encoded in a 14-bit field so the value range is 0-16383. See clause 20.4.1.1/G.709-2016.                  ")

  public Integer getTributaryPortNumber() {
    return tributaryPortNumber;
  }

  public void setTributaryPortNumber(Integer tributaryPortNumber) {
    this.tributaryPortNumber = tributaryPortNumber;
  }

  public TapiOduOduCtpPac tributarySlotList(List<Integer> tributarySlotList) {
    this.tributarySlotList = tributarySlotList;
    return this;
  }

  public TapiOduOduCtpPac addTributarySlotListItem(Integer tributarySlotListItem) {
    if (this.tributarySlotList == null) {
      this.tributarySlotList = new ArrayList<>();
    }
    this.tributarySlotList.add(tributarySlotListItem);
    return this;
  }

  /**
   * This attribute contains a set of distinct (i.e. unique) integers (e.g. 2, 3, 5, 9, 15 representing the tributary slots TS2, TS3, TS5, TS9 and TS15) which represents the resources occupied by the Low Order ODU Link Connection (e.g. carrying an ODUflex with a bit rate of 6.25G).                   This attribute applies when the LO ODU_ ConnectionTerminationPoint connects with an HO ODU_TrailTerminationPoint object.                   It will not apply if this ODU_ ConnectionTerminationPoint object directly connects to an OTU_TrailTerminationPoint object (i.e. OTU has no trib slots).                   The upper bound of the integer allowed in this set is a function of the HO-ODU server layer to which the ODU connection has been mapped (adapted).                   Thus, for example, M=8/32/80 for ODU2/ODU3/ODU4 server layers (respectively). Note that the value of this attribute can be changed only in the case of ODUflex and has to be through specific operations (i.e. not be changing the attribute tributarySlotList directly).
   * @return tributarySlotList
  **/
  @ApiModelProperty(value = "This attribute contains a set of distinct (i.e. unique) integers (e.g. 2, 3, 5, 9, 15 representing the tributary slots TS2, TS3, TS5, TS9 and TS15) which represents the resources occupied by the Low Order ODU Link Connection (e.g. carrying an ODUflex with a bit rate of 6.25G).                   This attribute applies when the LO ODU_ ConnectionTerminationPoint connects with an HO ODU_TrailTerminationPoint object.                   It will not apply if this ODU_ ConnectionTerminationPoint object directly connects to an OTU_TrailTerminationPoint object (i.e. OTU has no trib slots).                   The upper bound of the integer allowed in this set is a function of the HO-ODU server layer to which the ODU connection has been mapped (adapted).                   Thus, for example, M=8/32/80 for ODU2/ODU3/ODU4 server layers (respectively). Note that the value of this attribute can be changed only in the case of ODUflex and has to be through specific operations (i.e. not be changing the attribute tributarySlotList directly).")

  public List<Integer> getTributarySlotList() {
    return tributarySlotList;
  }

  public void setTributarySlotList(List<Integer> tributarySlotList) {
    this.tributarySlotList = tributarySlotList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiOduOduCtpPac tapiOduOduCtpPac = (TapiOduOduCtpPac) o;
    return Objects.equals(this.acceptedMsi, tapiOduOduCtpPac.acceptedMsi) &&
        Objects.equals(this.tributaryPortNumber, tapiOduOduCtpPac.tributaryPortNumber) &&
        Objects.equals(this.tributarySlotList, tapiOduOduCtpPac.tributarySlotList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acceptedMsi, tributaryPortNumber, tributarySlotList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiOduOduCtpPac {\n");
    
    sb.append("    acceptedMsi: ").append(toIndentedString(acceptedMsi)).append("\n");
    sb.append("    tributaryPortNumber: ").append(toIndentedString(tributaryPortNumber)).append("\n");
    sb.append("    tributarySlotList: ").append(toIndentedString(tributarySlotList)).append("\n");
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
