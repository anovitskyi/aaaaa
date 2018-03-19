package com.anovitskyi.instaspringboot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author anovitskyi
 */
@Controller
public class IndexController {

    @RequestMapping("/")
    public String hello(){
        return "index";
    }

}
