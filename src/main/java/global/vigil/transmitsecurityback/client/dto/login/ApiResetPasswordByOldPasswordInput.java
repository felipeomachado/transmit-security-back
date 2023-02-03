package global.vigil.transmitsecurityback.client.dto.login;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;

import java.io.Serializable;
import java.util.Objects;

/**
 * ApiResetPasswordByOldPasswordInput
 */
@lombok.Builder
@lombok.AllArgsConstructor(access=lombok.AccessLevel.PRIVATE)
@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)


public class ApiResetPasswordByOldPasswordInput implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("username")
  private String username;

  @JsonProperty("email")
  private String email;

  @JsonProperty("password")
  private String password;

  @JsonProperty("client_id")
  private String clientId;

  public ApiResetPasswordByOldPasswordInput username(String username) {
    this.username = username;
    return this;
  }

  /**
   * The user's username. Pass either `username` or `email`, but not both.
   * @return username
  */
  
  @Schema(name = "username", description = "The user's username. Pass either `username` or `email`, but not both.", required = false)
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public ApiResetPasswordByOldPasswordInput email(String email) {
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

  public ApiResetPasswordByOldPasswordInput password(String password) {
    this.password = password;
    return this;
  }

  /**
   * The user's current password
   * @return password
  */
  @NotNull 
  @Schema(name = "password", description = "The user's current password", required = true)
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public ApiResetPasswordByOldPasswordInput clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

  /**
   * Get clientId
   * @return clientId
  */
  @NotNull 
  @Schema(name = "client_id", required = true)
  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiResetPasswordByOldPasswordInput apiResetPasswordByOldPasswordInput = (ApiResetPasswordByOldPasswordInput) o;
    return Objects.equals(this.username, apiResetPasswordByOldPasswordInput.username) &&
        Objects.equals(this.email, apiResetPasswordByOldPasswordInput.email) &&
        Objects.equals(this.password, apiResetPasswordByOldPasswordInput.password) &&
        Objects.equals(this.clientId, apiResetPasswordByOldPasswordInput.clientId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, email, password, clientId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResetPasswordByOldPasswordInput {\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
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

