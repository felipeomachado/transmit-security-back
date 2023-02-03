package global.vigil.transmitsecurityback.controllers;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
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
public class LoginController {

    @GetMapping
    String test() {
        return "ok";
    }
}
