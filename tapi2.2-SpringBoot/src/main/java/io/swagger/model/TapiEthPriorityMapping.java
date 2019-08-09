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
 * TapiEthPriorityMapping
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiEthPriorityMapping   {
  @JsonProperty("priority-0")
  private Integer priority0 = null;

  @JsonProperty("priority-1")
  private Integer priority1 = 1;

  @JsonProperty("priority-2")
  private Integer priority2 = 2;

  @JsonProperty("priority-3")
  private Integer priority3 = 3;

  @JsonProperty("priority-4")
  private Integer priority4 = 4;

  @JsonProperty("priority-5")
  private Integer priority5 = 5;

  @JsonProperty("priority-6")
  private Integer priority6 = 6;

  @JsonProperty("priority-7")
  private Integer priority7 = 7;

  public TapiEthPriorityMapping priority0(Integer priority0) {
    this.priority0 = priority0;
    return this;
  }

  /**
   * This attribute defines the new priority value for the old priority value 0.
   * @return priority0
  **/
  @ApiModelProperty(value = "This attribute defines the new priority value for the old priority value 0.")

  public Integer getPriority0() {
    return priority0;
  }

  public void setPriority0(Integer priority0) {
    this.priority0 = priority0;
  }

  public TapiEthPriorityMapping priority1(Integer priority1) {
    this.priority1 = priority1;
    return this;
  }

  /**
   * This attribute defines the new priority value for the old priority value 1.
   * @return priority1
  **/
  @ApiModelProperty(value = "This attribute defines the new priority value for the old priority value 1.")

  public Integer getPriority1() {
    return priority1;
  }

  public void setPriority1(Integer priority1) {
    this.priority1 = priority1;
  }

  public TapiEthPriorityMapping priority2(Integer priority2) {
    this.priority2 = priority2;
    return this;
  }

  /**
   * This attribute defines the new priority value for the old priority value 2.
   * @return priority2
  **/
  @ApiModelProperty(value = "This attribute defines the new priority value for the old priority value 2.")

  public Integer getPriority2() {
    return priority2;
  }

  public void setPriority2(Integer priority2) {
    this.priority2 = priority2;
  }

  public TapiEthPriorityMapping priority3(Integer priority3) {
    this.priority3 = priority3;
    return this;
  }

  /**
   * This attribute defines the new priority value for the old priority value 3.
   * @return priority3
  **/
  @ApiModelProperty(value = "This attribute defines the new priority value for the old priority value 3.")

  public Integer getPriority3() {
    return priority3;
  }

  public void setPriority3(Integer priority3) {
    this.priority3 = priority3;
  }

  public TapiEthPriorityMapping priority4(Integer priority4) {
    this.priority4 = priority4;
    return this;
  }

  /**
   * This attribute defines the new priority value for the old priority value 4.
   * @return priority4
  **/
  @ApiModelProperty(value = "This attribute defines the new priority value for the old priority value 4.")

  public Integer getPriority4() {
    return priority4;
  }

  public void setPriority4(Integer priority4) {
    this.priority4 = priority4;
  }

  public TapiEthPriorityMapping priority5(Integer priority5) {
    this.priority5 = priority5;
    return this;
  }

  /**
   * This attribute defines the new priority value for the old priority value 5.
   * @return priority5
  **/
  @ApiModelProperty(value = "This attribute defines the new priority value for the old priority value 5.")

  public Integer getPriority5() {
    return priority5;
  }

  public void setPriority5(Integer priority5) {
    this.priority5 = priority5;
  }

  public TapiEthPriorityMapping priority6(Integer priority6) {
    this.priority6 = priority6;
    return this;
  }

  /**
   * This attribute defines the new priority value for the old priority value 6.
   * @return priority6
  **/
  @ApiModelProperty(value = "This attribute defines the new priority value for the old priority value 6.")

  public Integer getPriority6() {
    return priority6;
  }

  public void setPriority6(Integer priority6) {
    this.priority6 = priority6;
  }

  public TapiEthPriorityMapping priority7(Integer priority7) {
    this.priority7 = priority7;
    return this;
  }

  /**
   * This attribute defines the new priority value for the old priority value 7.
   * @return priority7
  **/
  @ApiModelProperty(value = "This attribute defines the new priority value for the old priority value 7.")

  public Integer getPriority7() {
    return priority7;
  }

  public void setPriority7(Integer priority7) {
    this.priority7 = priority7;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiEthPriorityMapping tapiEthPriorityMapping = (TapiEthPriorityMapping) o;
    return Objects.equals(this.priority0, tapiEthPriorityMapping.priority0) &&
        Objects.equals(this.priority1, tapiEthPriorityMapping.priority1) &&
        Objects.equals(this.priority2, tapiEthPriorityMapping.priority2) &&
        Objects.equals(this.priority3, tapiEthPriorityMapping.priority3) &&
        Objects.equals(this.priority4, tapiEthPriorityMapping.priority4) &&
        Objects.equals(this.priority5, tapiEthPriorityMapping.priority5) &&
        Objects.equals(this.priority6, tapiEthPriorityMapping.priority6) &&
        Objects.equals(this.priority7, tapiEthPriorityMapping.priority7);
  }

  @Override
  public int hashCode() {
    return Objects.hash(priority0, priority1, priority2, priority3, priority4, priority5, priority6, priority7);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiEthPriorityMapping {\n");
    
    sb.append("    priority0: ").append(toIndentedString(priority0)).append("\n");
    sb.append("    priority1: ").append(toIndentedString(priority1)).append("\n");
    sb.append("    priority2: ").append(toIndentedString(priority2)).append("\n");
    sb.append("    priority3: ").append(toIndentedString(priority3)).append("\n");
    sb.append("    priority4: ").append(toIndentedString(priority4)).append("\n");
    sb.append("    priority5: ").append(toIndentedString(priority5)).append("\n");
    sb.append("    priority6: ").append(toIndentedString(priority6)).append("\n");
    sb.append("    priority7: ").append(toIndentedString(priority7)).append("\n");
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
