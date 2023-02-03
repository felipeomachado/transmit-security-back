package global.vigil.transmitsecurityback.client.dto.login;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;

import java.io.Serializable;
import java.util.Objects;

/**
 * ApiVerifyResetSmsOtpInput
 */
@lombok.Builder
@lombok.AllArgsConstructor(access=lombok.AccessLevel.PRIVATE)
@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)


public class ApiVerifyResetSmsOtpInput implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("phone_number")
  private String phoneNumber;

  @JsonProperty("passcode")
  private String passcode;

  public ApiVerifyResetSmsOtpInput phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

  /**
   * Phone number that the SMS OTP was sent to
   * @return phoneNumber
  */
  @NotNull 
  @Schema(name = "phone_number", description = "Phone number that the SMS OTP was sent to", required = true)
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public ApiVerifyResetSmsOtpInput passcode(String passcode) {
    this.passcode = passcode;
    return this;
  }

  /**
   * SMS code to validate
   * @return passcode
  */
  @NotNull 
  @Schema(name = "passcode", description = "SMS code to validate", required = true)
  public String getPasscode() {
    return passcode;
  }

  public void setPasscode(String passcode) {
    this.passcode = passcode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiVerifyResetSmsOtpInput apiVerifyResetSmsOtpInput = (ApiVerifyResetSmsOtpInput) o;
    return Objects.equals(this.phoneNumber, apiVerifyResetSmsOtpInput.phoneNumber) &&
        Objects.equals(this.passcode, apiVerifyResetSmsOtpInput.passcode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phoneNumber, passcode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiVerifyResetSmsOtpInput {\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    passcode: ").append(toIndentedString(passcode)).append("\n");
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

