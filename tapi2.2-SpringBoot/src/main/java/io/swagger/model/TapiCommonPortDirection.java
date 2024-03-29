package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets tapi.common.PortDirection
 */
public enum TapiCommonPortDirection {
  BIDIRECTIONAL("BIDIRECTIONAL"),
    INPUT("INPUT"),
    OUTPUT("OUTPUT"),
    UNIDENTIFIED_OR_UNKNOWN("UNIDENTIFIED_OR_UNKNOWN");

  private String value;

  TapiCommonPortDirection(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static TapiCommonPortDirection fromValue(String text) {
    for (TapiCommonPortDirection b : TapiCommonPortDirection.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
