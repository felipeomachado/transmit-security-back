package global.vigil.transmitsecurityback.client.dto.login;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serializable;
import java.util.Objects;

/**
 * ApiResetPasswordResponse
 */
@lombok.Builder
@lombok.AllArgsConstructor(access=lombok.AccessLevel.PRIVATE)
@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)


public class ApiResetPasswordResponse implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("message")
  private String message;

  @JsonProperty("url")
  private String url;

  public ApiResetPasswordResponse message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
  */
  
  @Schema(name = "message", accessMode = Schema.AccessMode.READ_ONLY, example = "Password changed successfully", required = true)
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public ApiResetPasswordResponse url(String url) {
    this.url = url;
    return this;
  }

  /**
   * URL to start the authorization flow with the new password
   * @return url
  */
  
  @Schema(name = "url", accessMode = Schema.AccessMode.READ_ONLY, description = "URL to start the authorization flow with the new password", required = true)
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiResetPasswordResponse apiResetPasswordResponse = (ApiResetPasswordResponse) o;
    return Objects.equals(this.message, apiResetPasswordResponse.message) &&
        Objects.equals(this.url, apiResetPasswordResponse.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResetPasswordResponse {\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

