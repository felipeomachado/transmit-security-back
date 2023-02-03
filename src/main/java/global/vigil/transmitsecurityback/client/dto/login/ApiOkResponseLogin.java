package global.vigil.transmitsecurityback.client.dto.login;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.io.Serializable;
import java.util.Objects;

/**
 * The URL to start the authorization flow
 */
@lombok.Builder
@lombok.AllArgsConstructor(access=lombok.AccessLevel.PRIVATE)
@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)

@Schema(name = "ApiOkResponse_login", description = "The URL to start the authorization flow")
@JsonTypeName("ApiOkResponse_login")

public class ApiOkResponseLogin implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("result")
  private ApiPasswordLoginResponse result;

  public ApiOkResponseLogin result(ApiPasswordLoginResponse result) {
    this.result = result;
    return this;
  }

  /**
   * Get result
   * @return result
  */
  @NotNull @Valid 
  @Schema(name = "result", required = true)
  public ApiPasswordLoginResponse getResult() {
    return result;
  }

  public void setResult(ApiPasswordLoginResponse result) {
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
    ApiOkResponseLogin apiOkResponseLogin = (ApiOkResponseLogin) o;
    return Objects.equals(this.result, apiOkResponseLogin.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiOkResponseLogin {\n");
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

