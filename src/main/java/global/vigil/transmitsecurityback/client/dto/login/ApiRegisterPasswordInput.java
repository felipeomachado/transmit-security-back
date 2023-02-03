package global.vigil.transmitsecurityback.client.dto.login;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;

import java.io.Serializable;
import java.util.Objects;

/**
 * ApiRegisterPasswordInput
 */
@lombok.Builder
@lombok.AllArgsConstructor(access=lombok.AccessLevel.PRIVATE)
@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)


public class ApiRegisterPasswordInput implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("username")
  private String username;

  @JsonProperty("password")
  private String password;

  public ApiRegisterPasswordInput username(String username) {
    this.username = username;
    return this;
  }

  /**
   * The new user's username. This will be the identifier the user will use to authenticate.
   * @return username
  */
  @NotNull 
  @Schema(name = "username", description = "The new user's username. This will be the identifier the user will use to authenticate.", required = true)
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public ApiRegisterPasswordInput password(String password) {
    this.password = password;
    return this;
  }

  /**
   * The new user's temporary password
   * @return password
  */
  @NotNull 
  @Schema(name = "password", description = "The new user's temporary password", required = true)
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiRegisterPasswordInput apiRegisterPasswordInput = (ApiRegisterPasswordInput) o;
    return Objects.equals(this.username, apiRegisterPasswordInput.username) &&
        Objects.equals(this.password, apiRegisterPasswordInput.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, password);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiRegisterPasswordInput {\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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

