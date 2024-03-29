package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets tapi.common.PortRole
 */
public enum TapiCommonPortRole {
  SYMMETRIC("SYMMETRIC"),
    ROOT("ROOT"),
    LEAF("LEAF"),
    TRUNK("TRUNK"),
    UNKNOWN("UNKNOWN");

  private String value;

  TapiCommonPortRole(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static TapiCommonPortRole fromValue(String text) {
    for (TapiCommonPortRole b : TapiCommonPortRole.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
