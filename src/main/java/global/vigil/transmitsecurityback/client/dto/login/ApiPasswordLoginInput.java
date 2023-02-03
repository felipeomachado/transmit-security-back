package global.vigil.transmitsecurityback.client.dto.login;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;

import java.io.Serializable;
import java.util.Objects;

/**
 * ApiPasswordLoginInput
 */
@lombok.Builder
@lombok.AllArgsConstructor(access=lombok.AccessLevel.PRIVATE)
@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)


public class ApiPasswordLoginInput implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("username")
  private String username;

  @JsonProperty("email")
  private String email;

  @JsonProperty("password")
  private String password;

  @JsonProperty("client_id")
  private String clientId;

  @JsonProperty("redirect_uri")
  private String redirectUri;

  @JsonProperty("resource")
  private String resource;

  @JsonProperty("require_mfa")
  private Boolean requireMfa = false;

  @JsonProperty("claims")
  private Object claims;

  public ApiPasswordLoginInput username(String username) {
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

  public ApiPasswordLoginInput email(String email) {
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

  public ApiPasswordLoginInput password(String password) {
    this.password = password;
    return this;
  }

  /**
   * The user's password
   * @return password
  */
  @NotNull 
  @Schema(name = "password", description = "The user's password", required = true)
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public ApiPasswordLoginInput clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

  /**
   * Client ID of the application requesting authentication, retrieved from the Transmit Admin Portal
   * @return clientId
  */
  @NotNull 
  @Schema(name = "client_id", example = "client_id=c35ab2a.xVShlOVGsUMh3Cqk73K1O.transmit", description = "Client ID of the application requesting authentication, retrieved from the Transmit Admin Portal", required = true)
  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public ApiPasswordLoginInput redirectUri(String redirectUri) {
    this.redirectUri = redirectUri;
    return this;
  }

  /**
   * URI to redirect to upon completion of the IDP flow. This is the server GET endpoint used to call the token endpoint, and should accept \"code\" as a query parameter. This URI must also be configured as an allowed redirect URI in the Transmit Admin Portal.
   * @return redirectUri
  */
  @NotNull 
  @Schema(name = "redirect_uri", example = "https://domain.com/verify", description = "URI to redirect to upon completion of the IDP flow. This is the server GET endpoint used to call the token endpoint, and should accept \"code\" as a query parameter. This URI must also be configured as an allowed redirect URI in the Transmit Admin Portal.", required = true)
  public String getRedirectUri() {
    return redirectUri;
  }

  public void setRedirectUri(String redirectUri) {
    this.redirectUri = redirectUri;
  }

  public ApiPasswordLoginInput resource(String resource) {
    this.resource = resource;
    return this;
  }

  /**
   * Resource URI the login is attempting to access.
   * @return resource
  */
  
  @Schema(name = "resource", description = "Resource URI the login is attempting to access.", required = false)
  public String getResource() {
    return resource;
  }

  public void setResource(String resource) {
    this.resource = resource;
  }

  public ApiPasswordLoginInput requireMfa(Boolean requireMfa) {
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

  public ApiPasswordLoginInput claims(Object claims) {
    this.claims = claims;
    return this;
  }

  /**
   * Used to request additional claims in the ID token, such as roles and permissions. The structure is per the [OIDC Standard](https://openid.net/specs/openid-connect-core-1_0-final.html#ClaimsParameter). See [OIDC APIs](https://developer.transmitsecurity.com/openapi/user/oidc/#operation/oidcAuthenticate!in=query&path=claims&t=request) for the supported claims.
   * @return claims
  */
  
  @Schema(name = "claims", example = "{\"id_token\":{\"roles\":null}}", description = "Used to request additional claims in the ID token, such as roles and permissions. The structure is per the [OIDC Standard](https://openid.net/specs/openid-connect-core-1_0-final.html#ClaimsParameter). See [OIDC APIs](https://developer.transmitsecurity.com/openapi/user/oidc/#operation/oidcAuthenticate!in=query&path=claims&t=request) for the supported claims.", required = false)
  public Object getClaims() {
    return claims;
  }

  public void setClaims(Object claims) {
    this.claims = claims;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiPasswordLoginInput apiPasswordLoginInput = (ApiPasswordLoginInput) o;
    return Objects.equals(this.username, apiPasswordLoginInput.username) &&
        Objects.equals(this.email, apiPasswordLoginInput.email) &&
        Objects.equals(this.password, apiPasswordLoginInput.password) &&
        Objects.equals(this.clientId, apiPasswordLoginInput.clientId) &&
        Objects.equals(this.redirectUri, apiPasswordLoginInput.redirectUri) &&
        Objects.equals(this.resource, apiPasswordLoginInput.resource) &&
        Objects.equals(this.requireMfa, apiPasswordLoginInput.requireMfa) &&
        Objects.equals(this.claims, apiPasswordLoginInput.claims);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, email, password, clientId, redirectUri, resource, requireMfa, claims);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiPasswordLoginInput {\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    redirectUri: ").append(toIndentedString(redirectUri)).append("\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
    sb.append("    requireMfa: ").append(toIndentedString(requireMfa)).append("\n");
    sb.append("    claims: ").append(toIndentedString(claims)).append("\n");
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

