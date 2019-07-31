package com.griren.card;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {
    @RequestMapping("/")
    public String welcome() {
        return "welcome";
    }

    @RequestMapping("/ok")
    public String ok() {
        return "ok";
    }
}
