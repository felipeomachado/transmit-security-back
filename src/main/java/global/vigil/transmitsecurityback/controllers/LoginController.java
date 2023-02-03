package global.vigil.transmitsecurityback.controllers;

import global.vigil.transmitsecurityback.client.dto.login.*;
import global.vigil.transmitsecurityback.client.endpoint.LoginClientEndpoint;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(
        name = "payments",
        description = "Account Payments Operations"
)
@Slf4j
@RestController
@RequestMapping("/login")
//TODO implement integration between Transmit
public class LoginController implements LoginClientEndpoint {

    @Override
    public ResponseEntity<ApiOkResponseLogin> login(ApiPasswordLoginInput apiPasswordLoginInput) {
        return null;
    }

    @Override
    public ResponseEntity<ApiLogoutResponse> logout() {
        return null;
    }

    @Override
    public ResponseEntity<ApiRegisterPasswordResponse> registerPassword(ApiRegisterPasswordInput apiRegisterPasswordInput) {
        return null;
    }

    @Override
    public ResponseEntity<ApiResetPasswordResponse> resetPassword(ApiResetPasswordInput apiResetPasswordInput) {
        return null;
    }

    @Override
    public ResponseEntity<ApiSendResetPasswordEmailResponse> sendForgotPasswordEmail(ApiSendResetPasswordEmailLinkInput apiSendResetPasswordEmailLinkInput) {
        return null;
    }

    @Override
    public ResponseEntity<ApiSendResetPasswordSmsOtpResponse> sendResetPasswordSMSOTP(ApiSendResetPasswordSmsOtpInput apiSendResetPasswordSmsOtpInput) {
        return null;
    }

    @Override
    public ResponseEntity<ApiTokenExchangeResponse> tokenExchange(ApiTokenExchangeRequestInput apiTokenExchangeRequestInput) {
        return null;
    }

    @Override
    public ResponseEntity<ApiValidateResetPasswordResponse> validateOldPasswordSMSOTP(ApiResetPasswordByOldPasswordInput apiResetPasswordByOldPasswordInput) {
        return null;
    }

    @Override
    public ResponseEntity<ApiValidateResetPasswordResponse> validateResetPasswordSMSOTP(ApiVerifyResetSmsOtpInput apiVerifyResetSmsOtpInput) {
        return null;
    }
}
