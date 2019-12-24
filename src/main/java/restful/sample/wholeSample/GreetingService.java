package restful.sample.wholeSample;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    public String greet() {
        return "Hello World!";
    }
}
