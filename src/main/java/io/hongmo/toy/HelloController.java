package io.hongmo.toy;

import io.micrometer.core.annotation.Timed;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HelloController {

    @GetMapping("/api/hello")
    @Timed(value = "hello", longTask = true)
    public String hello() {
        log.info("hello api");
        return "hello";
    }
}
