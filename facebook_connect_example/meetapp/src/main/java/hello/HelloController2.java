package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController2 {

    @RequestMapping("/hello")
    public String index() {
        return "Hello!";
    }

}
