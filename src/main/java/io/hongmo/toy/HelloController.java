package io.hongmo.toy;

import io.micrometer.core.annotation.Timed;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/api/hello")
    @Timed(value = "hello", longTask = true)
    public String hello() {
        return "hello";
    }
}
