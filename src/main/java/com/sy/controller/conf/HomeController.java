package com.sy.controller.conf;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping(value = "/",produces = MediaType.ALL_VALUE)
    public String index(){
        return "redirect:/index.html";
    }
}
