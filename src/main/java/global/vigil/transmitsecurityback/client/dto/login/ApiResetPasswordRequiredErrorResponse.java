package global.vigil.transmitsecurityback.client.dto.login;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

/**
 * ApiResetPasswordRequiredErrorResponse
 */
@lombok.Builder
@lombok.AllArgsConstructor(access=lombok.AccessLevel.PRIVATE)
@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)


public class ApiResetPasswordRequiredErrorResponse implements Serializable {

  private static final long serialVersionUID = 1L;

  /**
   * Reason the password reset is required
   */
  public enum MessageEnum {
    PASSWORD_EXPIRED("password_expired"),
    
    TEMPORARY_PASSWORD("temporary_password");

    private String value;

    MessageEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static MessageEnum fromValue(String value) {
      for (MessageEnum b : MessageEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("message")
  private MessageEnum message;

  @JsonProperty("error_code")
  private BigDecimal errorCode;

  @JsonProperty("reset_token")
  private String resetToken;

  public ApiResetPasswordRequiredErrorResponse message(MessageEnum message) {
    this.message = message;
    return this;
  }

  /**
   * Reason the password reset is required
   * @return message
  */
  @NotNull 
  @Schema(name = "message", description = "Reason the password reset is required", required = true)
  public MessageEnum getMessage() {
    return message;
  }

  public void setMessage(MessageEnum message) {
    this.message = message;
  }

  public ApiResetPasswordRequiredErrorResponse errorCode(BigDecimal errorCode) {
    this.errorCode = errorCode;
    return this;
  }

  /**
   * Get errorCode
   * @return errorCode
  */
  @NotNull @Valid 
  @Schema(name = "error_code", example = "403", required = true)
  public BigDecimal getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(BigDecimal errorCode) {
    this.errorCode = errorCode;
  }

  public ApiResetPasswordRequiredErrorResponse resetToken(String resetToken) {
    this.resetToken = resetToken;
    return this;
  }

  /**
   * Reset token needed to authorize the password reset, if a password reset is required
   * @return resetToken
  */
  
  @Schema(name = "reset_token", accessMode = Schema.AccessMode.READ_ONLY, description = "Reset token needed to authorize the password reset, if a password reset is required", required = true)
  public String getResetToken() {
    return resetToken;
  }

  public void setResetToken(String resetToken) {
    this.resetToken = resetToken;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiResetPasswordRequiredErrorResponse apiResetPasswordRequiredErrorResponse = (ApiResetPasswordRequiredErrorResponse) o;
    return Objects.equals(this.message, apiResetPasswordRequiredErrorResponse.message) &&
        Objects.equals(this.errorCode, apiResetPasswordRequiredErrorResponse.errorCode) &&
        Objects.equals(this.resetToken, apiResetPasswordRequiredErrorResponse.resetToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, errorCode, resetToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResetPasswordRequiredErrorResponse {\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    resetToken: ").append(toIndentedString(resetToken)).append("\n");
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

