package com.SpringReactJS;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by atretjak on 29.12.2016.
 */

@Controller
public class HomeController {

    @RequestMapping(value = "/")
    public String index(){
        return "index";
    }
}
