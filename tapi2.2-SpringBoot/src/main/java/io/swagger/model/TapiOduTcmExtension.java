package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets tapi.odu.TcmExtension
 */
public enum TapiOduTcmExtension {
  NORMAL("NORMAL"),
    PASS_THROUGH("PASS-THROUGH"),
    ERASE("ERASE");

  private String value;

  TapiOduTcmExtension(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static TapiOduTcmExtension fromValue(String text) {
    for (TapiOduTcmExtension b : TapiOduTcmExtension.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
