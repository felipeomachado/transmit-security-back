package global.vigil.transmitsecurityback.client.dto.login;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;

import java.io.Serializable;
import java.util.Objects;

/**
 * Texts, logo and color to render email template with
 */
@lombok.Builder
@lombok.AllArgsConstructor(access=lombok.AccessLevel.PRIVATE)
@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)

@Schema(name = "ApiSendResetPasswordEmailLinkInput_email_content", description = "Texts, logo and color to render email template with")
@JsonTypeName("ApiSendResetPasswordEmailLinkInput_email_content")

public class ApiSendResetPasswordEmailLinkInputEmailContent implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("subject")
  private String subject;

  @JsonProperty("primaryColor")
  private String primaryColor;

  @JsonProperty("base64logo")
  private String base64logo;

  @JsonProperty("headerText")
  private String headerText;

  @JsonProperty("bodyText")
  private String bodyText;

  @JsonProperty("linkText")
  private String linkText;

  @JsonProperty("infoText")
  private String infoText;

  @JsonProperty("footerText")
  private String footerText;

  public ApiSendResetPasswordEmailLinkInputEmailContent subject(String subject) {
    this.subject = subject;
    return this;
  }

  /**
   * The subject of the email
   * @return subject
  */
  @NotNull 
  @Schema(name = "subject", description = "The subject of the email", required = true)
  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public ApiSendResetPasswordEmailLinkInputEmailContent primaryColor(String primaryColor) {
    this.primaryColor = primaryColor;
    return this;
  }

  /**
   * Primary color of the email, specified as a Hex color
   * @return primaryColor
  */
  
  @Schema(name = "primaryColor", example = "#6981FF", description = "Primary color of the email, specified as a Hex color", required = false)
  public String getPrimaryColor() {
    return primaryColor;
  }

  public void setPrimaryColor(String primaryColor) {
    this.primaryColor = primaryColor;
  }

  public ApiSendResetPasswordEmailLinkInputEmailContent base64logo(String base64logo) {
    this.base64logo = base64logo;
    return this;
  }

  /**
   * Base64 encoded image for email logo
   * @return base64logo
  */
  
  @Schema(name = "base64logo", description = "Base64 encoded image for email logo", required = false)
  public String getBase64logo() {
    return base64logo;
  }

  public void setBase64logo(String base64logo) {
    this.base64logo = base64logo;
  }

  public ApiSendResetPasswordEmailLinkInputEmailContent headerText(String headerText) {
    this.headerText = headerText;
    return this;
  }

  /**
   * The header of the email
   * @return headerText
  */
  
  @Schema(name = "headerText", description = "The header of the email", required = false)
  public String getHeaderText() {
    return headerText;
  }

  public void setHeaderText(String headerText) {
    this.headerText = headerText;
  }

  public ApiSendResetPasswordEmailLinkInputEmailContent bodyText(String bodyText) {
    this.bodyText = bodyText;
    return this;
  }

  /**
   * The body of the email
   * @return bodyText
  */
  
  @Schema(name = "bodyText", description = "The body of the email", required = false)
  public String getBodyText() {
    return bodyText;
  }

  public void setBodyText(String bodyText) {
    this.bodyText = bodyText;
  }

  public ApiSendResetPasswordEmailLinkInputEmailContent linkText(String linkText) {
    this.linkText = linkText;
    return this;
  }

  /**
   * The text of the link button in the email
   * @return linkText
  */
  
  @Schema(name = "linkText", description = "The text of the link button in the email", required = false)
  public String getLinkText() {
    return linkText;
  }

  public void setLinkText(String linkText) {
    this.linkText = linkText;
  }

  public ApiSendResetPasswordEmailLinkInputEmailContent infoText(String infoText) {
    this.infoText = infoText;
    return this;
  }

  /**
   * Any extra information in the email
   * @return infoText
  */
  
  @Schema(name = "infoText", description = "Any extra information in the email", required = false)
  public String getInfoText() {
    return infoText;
  }

  public void setInfoText(String infoText) {
    this.infoText = infoText;
  }

  public ApiSendResetPasswordEmailLinkInputEmailContent footerText(String footerText) {
    this.footerText = footerText;
    return this;
  }

  /**
   * The footer of the email
   * @return footerText
  */
  
  @Schema(name = "footerText", example = "If you didn't request this email, you can safely ignore it.", description = "The footer of the email", required = false)
  public String getFooterText() {
    return footerText;
  }

  public void setFooterText(String footerText) {
    this.footerText = footerText;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiSendResetPasswordEmailLinkInputEmailContent apiSendResetPasswordEmailLinkInputEmailContent = (ApiSendResetPasswordEmailLinkInputEmailContent) o;
    return Objects.equals(this.subject, apiSendResetPasswordEmailLinkInputEmailContent.subject) &&
        Objects.equals(this.primaryColor, apiSendResetPasswordEmailLinkInputEmailContent.primaryColor) &&
        Objects.equals(this.base64logo, apiSendResetPasswordEmailLinkInputEmailContent.base64logo) &&
        Objects.equals(this.headerText, apiSendResetPasswordEmailLinkInputEmailContent.headerText) &&
        Objects.equals(this.bodyText, apiSendResetPasswordEmailLinkInputEmailContent.bodyText) &&
        Objects.equals(this.linkText, apiSendResetPasswordEmailLinkInputEmailContent.linkText) &&
        Objects.equals(this.infoText, apiSendResetPasswordEmailLinkInputEmailContent.infoText) &&
        Objects.equals(this.footerText, apiSendResetPasswordEmailLinkInputEmailContent.footerText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subject, primaryColor, base64logo, headerText, bodyText, linkText, infoText, footerText);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiSendResetPasswordEmailLinkInputEmailContent {\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    primaryColor: ").append(toIndentedString(primaryColor)).append("\n");
    sb.append("    base64logo: ").append(toIndentedString(base64logo)).append("\n");
    sb.append("    headerText: ").append(toIndentedString(headerText)).append("\n");
    sb.append("    bodyText: ").append(toIndentedString(bodyText)).append("\n");
    sb.append("    linkText: ").append(toIndentedString(linkText)).append("\n");
    sb.append("    infoText: ").append(toIndentedString(infoText)).append("\n");
    sb.append("    footerText: ").append(toIndentedString(footerText)).append("\n");
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

