package com.myapp.demo.controllers;

import com.myapp.demo.services.DemoServices;
import com.myapp.demo.enums.SchoolSet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/getaccess")
public class RoleController {

    @Autowired
    private DemoServices demoServices;


    @GetMapping("/Hello")
    public String getHello(){

        return "hello, my test program works";

    }
    @GetMapping("/set")
    public List < SchoolSet > getSchoolSet(){
        return demoServices.getSchoolSet();

    }

}
