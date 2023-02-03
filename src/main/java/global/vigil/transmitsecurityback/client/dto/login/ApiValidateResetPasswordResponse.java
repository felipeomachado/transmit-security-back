package global.vigil.transmitsecurityback.client.dto.login;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;

import java.io.Serializable;
import java.util.Objects;

/**
 * ApiValidateResetPasswordResponse
 */
@lombok.Builder
@lombok.AllArgsConstructor(access=lombok.AccessLevel.PRIVATE)
@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)


public class ApiValidateResetPasswordResponse implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("result")
  private String result;

  public ApiValidateResetPasswordResponse result(String result) {
    this.result = result;
    return this;
  }

  /**
   * Reset token to be used when sending a reset request (`/auth/password/reset`)
   * @return result
  */
  @NotNull 
  @Schema(name = "result", description = "Reset token to be used when sending a reset request (`/auth/password/reset`)", required = true)
  public String getResult() {
    return result;
  }

  public void setResult(String result) {
    this.result = result;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiValidateResetPasswordResponse apiValidateResetPasswordResponse = (ApiValidateResetPasswordResponse) o;
    return Objects.equals(this.result, apiValidateResetPasswordResponse.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiValidateResetPasswordResponse {\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
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

