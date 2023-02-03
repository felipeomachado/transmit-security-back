package global.vigil.transmitsecurityback.client.dto.login;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * BadRequestHttpError
 */
@lombok.Builder
@lombok.AllArgsConstructor(access=lombok.AccessLevel.PRIVATE)
@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)


public class BadRequestHttpError implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("message")
  @Valid
  private List<String> message = new ArrayList<>();

  @JsonProperty("error_code")
  private BigDecimal errorCode;

  public BadRequestHttpError message(List<String> message) {
    this.message = message;
    return this;
  }

  public BadRequestHttpError addMessageItem(String messageItem) {
    this.message.add(messageItem);
    return this;
  }

  /**
   * Get message
   * @return message
  */
  @NotNull 
  @Schema(name = "message", example = "Bad request", required = true)
  public List<String> getMessage() {
    return message;
  }

  public void setMessage(List<String> message) {
    this.message = message;
  }

  public BadRequestHttpError errorCode(BigDecimal errorCode) {
    this.errorCode = errorCode;
    return this;
  }

  /**
   * Get errorCode
   * @return errorCode
  */
  @NotNull @Valid 
  @Schema(name = "error_code", example = "400", required = true)
  public BigDecimal getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(BigDecimal errorCode) {
    this.errorCode = errorCode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BadRequestHttpError badRequestHttpError = (BadRequestHttpError) o;
    return Objects.equals(this.message, badRequestHttpError.message) &&
        Objects.equals(this.errorCode, badRequestHttpError.errorCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, errorCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BadRequestHttpError {\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

