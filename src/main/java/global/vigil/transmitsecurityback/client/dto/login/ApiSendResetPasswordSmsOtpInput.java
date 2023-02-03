package global.vigil.transmitsecurityback.client.dto.login;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;

import java.io.Serializable;
import java.util.Objects;

/**
 * ApiSendResetPasswordSmsOtpInput
 */
@lombok.Builder
@lombok.AllArgsConstructor(access=lombok.AccessLevel.PRIVATE)
@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)


public class ApiSendResetPasswordSmsOtpInput implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("phone_number")
  private String phoneNumber;

  public ApiSendResetPasswordSmsOtpInput phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

  /**
   * Phone number to send the SMS to, specified in E.164 format
   * @return phoneNumber
  */
  @NotNull 
  @Schema(name = "phone_number", example = "+16175551212", description = "Phone number to send the SMS to, specified in E.164 format", required = true)
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiSendResetPasswordSmsOtpInput apiSendResetPasswordSmsOtpInput = (ApiSendResetPasswordSmsOtpInput) o;
    return Objects.equals(this.phoneNumber, apiSendResetPasswordSmsOtpInput.phoneNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phoneNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiSendResetPasswordSmsOtpInput {\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
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

