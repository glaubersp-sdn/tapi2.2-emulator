package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets tapi.path.computation.DiversityPolicy
 */
public enum TapiPathComputationDiversityPolicy {
  SRLG("SRLG"),
    SRNG("SRNG"),
    SNG("SNG"),
    NODE("NODE"),
    LINK("LINK");

  private String value;

  TapiPathComputationDiversityPolicy(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static TapiPathComputationDiversityPolicy fromValue(String text) {
    for (TapiPathComputationDiversityPolicy b : TapiPathComputationDiversityPolicy.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
