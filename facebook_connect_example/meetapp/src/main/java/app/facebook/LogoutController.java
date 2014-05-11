package app.facebook;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/logout")
public class LogoutController {
    @RequestMapping(method= RequestMethod.GET)
    public String home(HttpServletRequest request){
        request.getSession().invalidate();
        return "redirect:/connect/facebook";
    }
}
