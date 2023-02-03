package global.vigil.transmitsecurityback.client.dto.login;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.io.Serializable;
import java.util.Objects;

/**
 * ApiTokenExchangeRequestInput
 */
@lombok.Builder
@lombok.AllArgsConstructor(access=lombok.AccessLevel.PRIVATE)
@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)


public class ApiTokenExchangeRequestInput implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("code")
  private String code;

  @JsonProperty("client_id")
  private String clientId;

  @JsonProperty("client_secret")
  private String clientSecret;

  public ApiTokenExchangeRequestInput code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Authorization code returned in the redirect URI as a query parameter upon successful authentication
   * @return code
  */
  @NotNull 
  @Schema(name = "code", example = "GZxLFKTDCnlANVTxNvaWz7AIGPpXqZYSXdAwjiWRuOH", description = "Authorization code returned in the redirect URI as a query parameter upon successful authentication", required = true)
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public ApiTokenExchangeRequestInput clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

  /**
   * Client ID of the application requesting the token
   * @return clientId
  */
  @NotNull @Size(max = 50) 
  @Schema(name = "client_id", example = "DgsdfhSDsdfhtSDFXCCXBVMKPws345yscv2345XCZV", description = "Client ID of the application requesting the token", required = true)
  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public ApiTokenExchangeRequestInput clientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
    return this;
  }

  /**
   * Client Secret of the application requesting the token
   * @return clientSecret
  */
  @NotNull @Size(max = 50) 
  @Schema(name = "client_secret", example = "FzxvdDMbvxnc45sdfb789XCVGEW6usazxcvbw3KPsb23", description = "Client Secret of the application requesting the token", required = true)
  public String getClientSecret() {
    return clientSecret;
  }

  public void setClientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiTokenExchangeRequestInput apiTokenExchangeRequestInput = (ApiTokenExchangeRequestInput) o;
    return Objects.equals(this.code, apiTokenExchangeRequestInput.code) &&
        Objects.equals(this.clientId, apiTokenExchangeRequestInput.clientId) &&
        Objects.equals(this.clientSecret, apiTokenExchangeRequestInput.clientSecret);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, clientId, clientSecret);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiTokenExchangeRequestInput {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
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

