package app.facebook;

import org.springframework.social.facebook.api.Facebook;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.inject.Inject;

@Controller
@RequestMapping("/login/facebook")
public class LoginController {
    private Facebook facebook;

    @Inject
    public LoginController(Facebook facebook) {
        this.facebook = facebook;
    }

    @RequestMapping(method= RequestMethod.GET)
    public String helloFacebook(Model model) {
        if (!facebook.isAuthorized()) {
            return "redirect:/connect/facebook";
        }

        model.addAttribute(facebook.userOperations().getUserProfile());

//        PagedList<FacebookProfile> friends = facebook.friendOperations().getFriendProfiles();
//        model.addAttribute("friends", friends);

        return "authhome";
    }

}
