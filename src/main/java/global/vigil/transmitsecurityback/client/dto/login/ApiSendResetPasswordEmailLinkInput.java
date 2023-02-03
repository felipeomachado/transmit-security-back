package global.vigil.transmitsecurityback.client.dto.login;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.io.Serializable;
import java.util.Objects;

/**
 * ApiSendResetPasswordEmailLinkInput
 */
@lombok.Builder
@lombok.AllArgsConstructor(access=lombok.AccessLevel.PRIVATE)
@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)


public class ApiSendResetPasswordEmailLinkInput implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("email")
  private String email;

  @JsonProperty("username")
  private String username;

  @JsonProperty("redirect_uri")
  private String redirectUri;

  @JsonProperty("email_content")
  private ApiSendResetPasswordEmailLinkInputEmailContent emailContent;

  public ApiSendResetPasswordEmailLinkInput email(String email) {
    this.email = email;
    return this;
  }

  /**
   * The user's primary email address. Pass either `username` or `email`, but not both.
   * @return email
  */
  
  @Schema(name = "email", description = "The user's primary email address. Pass either `username` or `email`, but not both.", required = false)
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public ApiSendResetPasswordEmailLinkInput username(String username) {
    this.username = username;
    return this;
  }

  /**
   * The username to send the magic link to. Pass either `username` or `email`, but not both.
   * @return username
  */
  
  @Schema(name = "username", description = "The username to send the magic link to. Pass either `username` or `email`, but not both.", required = false)
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public ApiSendResetPasswordEmailLinkInput redirectUri(String redirectUri) {
    this.redirectUri = redirectUri;
    return this;
  }

  /**
   * URI where the email link will redirect to. This is the server GET endpoint used to call the password reset endpoint, and should accept \"code\" as a query parameter. This URI must also be configured as an allowed redirect URI in the Transmit Admin Portal.
   * @return redirectUri
  */
  @NotNull 
  @Schema(name = "redirect_uri", example = "https://www.example.com/reset-password", description = "URI where the email link will redirect to. This is the server GET endpoint used to call the password reset endpoint, and should accept \"code\" as a query parameter. This URI must also be configured as an allowed redirect URI in the Transmit Admin Portal.", required = true)
  public String getRedirectUri() {
    return redirectUri;
  }

  public void setRedirectUri(String redirectUri) {
    this.redirectUri = redirectUri;
  }

  public ApiSendResetPasswordEmailLinkInput emailContent(ApiSendResetPasswordEmailLinkInputEmailContent emailContent) {
    this.emailContent = emailContent;
    return this;
  }

  /**
   * Get emailContent
   * @return emailContent
  */
  @Valid 
  @Schema(name = "email_content", required = false)
  public ApiSendResetPasswordEmailLinkInputEmailContent getEmailContent() {
    return emailContent;
  }

  public void setEmailContent(ApiSendResetPasswordEmailLinkInputEmailContent emailContent) {
    this.emailContent = emailContent;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiSendResetPasswordEmailLinkInput apiSendResetPasswordEmailLinkInput = (ApiSendResetPasswordEmailLinkInput) o;
    return Objects.equals(this.email, apiSendResetPasswordEmailLinkInput.email) &&
        Objects.equals(this.username, apiSendResetPasswordEmailLinkInput.username) &&
        Objects.equals(this.redirectUri, apiSendResetPasswordEmailLinkInput.redirectUri) &&
        Objects.equals(this.emailContent, apiSendResetPasswordEmailLinkInput.emailContent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, username, redirectUri, emailContent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiSendResetPasswordEmailLinkInput {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    redirectUri: ").append(toIndentedString(redirectUri)).append("\n");
    sb.append("    emailContent: ").append(toIndentedString(emailContent)).append("\n");
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

