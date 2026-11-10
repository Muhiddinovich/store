package com.fred.home_controller.Home_Controller_Artifact;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping
    public String index(){
        System.out.println("Hello world");
        return "Hello world";
    }
}
