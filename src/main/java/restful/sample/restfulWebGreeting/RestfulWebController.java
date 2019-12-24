package restful.sample.restfulWebGreeting;


import static org.springframework.web.bind.annotation.RequestMethod.GET;

import restful.sample.beanObject.Greeting;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestfulWebController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter =  new AtomicLong();

    @RequestMapping(value = "/restFulWebGreeting", method = GET)
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}
