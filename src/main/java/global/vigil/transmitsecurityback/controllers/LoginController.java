package global.vigil.transmitsecurityback.controllers;

import global.vigil.transmitsecurityback.client.dto.login.*;
import global.vigil.transmitsecurityback.client.endpoint.LoginClientEndpoint;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.NotImplementedException;
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
        throw new NotImplementedException();
    }

    @Override
    public ResponseEntity<ApiLogoutResponse> logout() {
        throw new NotImplementedException();
    }

    @Override
    public ResponseEntity<ApiRegisterPasswordResponse> registerPassword(ApiRegisterPasswordInput apiRegisterPasswordInput) {
        throw new NotImplementedException();
    }

    @Override
    public ResponseEntity<ApiResetPasswordResponse> resetPassword(ApiResetPasswordInput apiResetPasswordInput) {
        throw new NotImplementedException();
    }

    @Override
    public ResponseEntity<ApiSendResetPasswordEmailResponse> sendForgotPasswordEmail(ApiSendResetPasswordEmailLinkInput apiSendResetPasswordEmailLinkInput) {
        throw new NotImplementedException();
    }

    @Override
    public ResponseEntity<ApiSendResetPasswordSmsOtpResponse> sendResetPasswordSMSOTP(ApiSendResetPasswordSmsOtpInput apiSendResetPasswordSmsOtpInput) {
        throw new NotImplementedException();
    }

    @Override
    public ResponseEntity<ApiTokenExchangeResponse> tokenExchange(ApiTokenExchangeRequestInput apiTokenExchangeRequestInput) {
        throw new NotImplementedException();
    }

    @Override
    public ResponseEntity<ApiValidateResetPasswordResponse> validateOldPasswordSMSOTP(ApiResetPasswordByOldPasswordInput apiResetPasswordByOldPasswordInput) {
        throw new NotImplementedException();
    }

    @Override
    public ResponseEntity<ApiValidateResetPasswordResponse> validateResetPasswordSMSOTP(ApiVerifyResetSmsOtpInput apiVerifyResetSmsOtpInput) {
        throw new NotImplementedException();
    }
}
