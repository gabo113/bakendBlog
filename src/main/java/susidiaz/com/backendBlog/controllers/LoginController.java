package susidiaz.com.backendBlog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String login() {
        return "login"; // Debe corresponder al nombre de la plantilla de tu página de inicio de sesión
    }
}
