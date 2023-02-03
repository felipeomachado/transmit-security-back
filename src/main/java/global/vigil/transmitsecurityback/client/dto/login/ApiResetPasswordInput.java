package global.vigil.transmitsecurityback.client.dto.login;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;

import java.io.Serializable;
import java.util.Objects;

/**
 * ApiResetPasswordInput
 */
@lombok.Builder
@lombok.AllArgsConstructor(access=lombok.AccessLevel.PRIVATE)
@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)


public class ApiResetPasswordInput implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("reset_token")
  private String resetToken;

  @JsonProperty("new_password")
  private String newPassword;

  @JsonProperty("redirect_uri")
  private String redirectUri;

  @JsonProperty("resource")
  private String resource;

  @JsonProperty("require_mfa")
  private Boolean requireMfa = false;

  public ApiResetPasswordInput resetToken(String resetToken) {
    this.resetToken = resetToken;
    return this;
  }

  /**
   * Valid `reset_token` generated from the password login call or by initiating a password reset flow
   * @return resetToken
  */
  @NotNull 
  @Schema(name = "reset_token", description = "Valid `reset_token` generated from the password login call or by initiating a password reset flow", required = true)
  public String getResetToken() {
    return resetToken;
  }

  public void setResetToken(String resetToken) {
    this.resetToken = resetToken;
  }

  public ApiResetPasswordInput newPassword(String newPassword) {
    this.newPassword = newPassword;
    return this;
  }

  /**
   * The new password
   * @return newPassword
  */
  @NotNull 
  @Schema(name = "new_password", description = "The new password", required = true)
  public String getNewPassword() {
    return newPassword;
  }

  public void setNewPassword(String newPassword) {
    this.newPassword = newPassword;
  }

  public ApiResetPasswordInput redirectUri(String redirectUri) {
    this.redirectUri = redirectUri;
    return this;
  }

  /**
   * Redirect URI for redirecting the client after a successful password change
   * @return redirectUri
  */
  
  @Schema(name = "redirect_uri", description = "Redirect URI for redirecting the client after a successful password change", required = false)
  public String getRedirectUri() {
    return redirectUri;
  }

  public void setRedirectUri(String redirectUri) {
    this.redirectUri = redirectUri;
  }

  public ApiResetPasswordInput resource(String resource) {
    this.resource = resource;
    return this;
  }

  /**
   * Resource to access after successful password change
   * @return resource
  */
  
  @Schema(name = "resource", description = "Resource to access after successful password change", required = false)
  public String getResource() {
    return resource;
  }

  public void setResource(String resource) {
    this.resource = resource;
  }

  public ApiResetPasswordInput requireMfa(Boolean requireMfa) {
    this.requireMfa = requireMfa;
    return this;
  }

  /**
   * Require multi-factor authentication for this authentication request.
   * @return requireMfa
  */
  
  @Schema(name = "require_mfa", example = "true", description = "Require multi-factor authentication for this authentication request.", required = false)
  public Boolean getRequireMfa() {
    return requireMfa;
  }

  public void setRequireMfa(Boolean requireMfa) {
    this.requireMfa = requireMfa;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiResetPasswordInput apiResetPasswordInput = (ApiResetPasswordInput) o;
    return Objects.equals(this.resetToken, apiResetPasswordInput.resetToken) &&
        Objects.equals(this.newPassword, apiResetPasswordInput.newPassword) &&
        Objects.equals(this.redirectUri, apiResetPasswordInput.redirectUri) &&
        Objects.equals(this.resource, apiResetPasswordInput.resource) &&
        Objects.equals(this.requireMfa, apiResetPasswordInput.requireMfa);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resetToken, newPassword, redirectUri, resource, requireMfa);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResetPasswordInput {\n");
    sb.append("    resetToken: ").append(toIndentedString(resetToken)).append("\n");
    sb.append("    newPassword: ").append(toIndentedString(newPassword)).append("\n");
    sb.append("    redirectUri: ").append(toIndentedString(redirectUri)).append("\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
    sb.append("    requireMfa: ").append(toIndentedString(requireMfa)).append("\n");
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

