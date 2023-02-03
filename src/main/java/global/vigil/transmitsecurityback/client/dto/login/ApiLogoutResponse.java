package global.vigil.transmitsecurityback.client.dto.login;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

/**
 * ApiLogoutResponse
 */
@lombok.Builder
@lombok.AllArgsConstructor(access=lombok.AccessLevel.PRIVATE)
@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)


public class ApiLogoutResponse implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("sessions_count")
  private BigDecimal sessionsCount;

  public ApiLogoutResponse sessionsCount(BigDecimal sessionsCount) {
    this.sessionsCount = sessionsCount;
    return this;
  }

  /**
   * Number of logged out sessions
   * @return sessionsCount
  */
  @NotNull @Valid 
  @Schema(name = "sessions_count", description = "Number of logged out sessions", required = true)
  public BigDecimal getSessionsCount() {
    return sessionsCount;
  }

  public void setSessionsCount(BigDecimal sessionsCount) {
    this.sessionsCount = sessionsCount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiLogoutResponse apiLogoutResponse = (ApiLogoutResponse) o;
    return Objects.equals(this.sessionsCount, apiLogoutResponse.sessionsCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sessionsCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiLogoutResponse {\n");
    sb.append("    sessionsCount: ").append(toIndentedString(sessionsCount)).append("\n");
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

