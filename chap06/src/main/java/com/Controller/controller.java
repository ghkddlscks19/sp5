package com.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.annotation.RequestScope;

@Controller
public class controller {
    @RequestMapping("/")
    public String test() {
        return "index";
    }
}
