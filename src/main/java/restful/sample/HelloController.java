package restful.sample;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/heartbeat")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}
