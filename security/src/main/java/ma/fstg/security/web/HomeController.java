package ma.fstg.security.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "home"; // Cherche home.html
    }

    @GetMapping("/login")
    public String loginPage() {
        return "login"; // Cherche login.html
    }

    @GetMapping("/user/dashboard")
    public String userDashboard() {
        return "user-dashboard"; // Cherche user-dashboard.html
    }

    @GetMapping("/admin/dashboard")
    public String adminDashboard() {
        return "admin-dashboard"; // Cherche admin-dashboard.html
    }
}