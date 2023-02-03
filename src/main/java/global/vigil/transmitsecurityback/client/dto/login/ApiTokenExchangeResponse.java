package global.vigil.transmitsecurityback.client.dto.login;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;

import java.io.Serializable;
import java.util.Objects;

/**
 * ApiTokenExchangeResponse
 */
@lombok.Builder
@lombok.AllArgsConstructor(access=lombok.AccessLevel.PRIVATE)
@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)


public class ApiTokenExchangeResponse implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("id_token")
  private String idToken;

  @JsonProperty("access_token")
  private String accessToken;

  @JsonProperty("refresh_token")
  private String refreshToken;

  @JsonProperty("is_user_created")
  private Boolean isUserCreated;

  public ApiTokenExchangeResponse idToken(String idToken) {
    this.idToken = idToken;
    return this;
  }

  /**
   * Get idToken
   * @return idToken
  */
  @NotNull 
  @Schema(name = "id_token", required = true)
  public String getIdToken() {
    return idToken;
  }

  public void setIdToken(String idToken) {
    this.idToken = idToken;
  }

  public ApiTokenExchangeResponse accessToken(String accessToken) {
    this.accessToken = accessToken;
    return this;
  }

  /**
   * Get accessToken
   * @return accessToken
  */
  @NotNull 
  @Schema(name = "access_token", required = true)
  public String getAccessToken() {
    return accessToken;
  }

  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  public ApiTokenExchangeResponse refreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
    return this;
  }

  /**
   * Get refreshToken
   * @return refreshToken
  */
  @NotNull 
  @Schema(name = "refresh_token", required = true)
  public String getRefreshToken() {
    return refreshToken;
  }

  public void setRefreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
  }

  public ApiTokenExchangeResponse isUserCreated(Boolean isUserCreated) {
    this.isUserCreated = isUserCreated;
    return this;
  }

  /**
   * Indicates if this is a new user or not
   * @return isUserCreated
  */
  @NotNull 
  @Schema(name = "is_user_created", description = "Indicates if this is a new user or not", required = true)
  public Boolean getIsUserCreated() {
    return isUserCreated;
  }

  public void setIsUserCreated(Boolean isUserCreated) {
    this.isUserCreated = isUserCreated;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiTokenExchangeResponse apiTokenExchangeResponse = (ApiTokenExchangeResponse) o;
    return Objects.equals(this.idToken, apiTokenExchangeResponse.idToken) &&
        Objects.equals(this.accessToken, apiTokenExchangeResponse.accessToken) &&
        Objects.equals(this.refreshToken, apiTokenExchangeResponse.refreshToken) &&
        Objects.equals(this.isUserCreated, apiTokenExchangeResponse.isUserCreated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idToken, accessToken, refreshToken, isUserCreated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiTokenExchangeResponse {\n");
    sb.append("    idToken: ").append(toIndentedString(idToken)).append("\n");
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    refreshToken: ").append(toIndentedString(refreshToken)).append("\n");
    sb.append("    isUserCreated: ").append(toIndentedString(isUserCreated)).append("\n");
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

