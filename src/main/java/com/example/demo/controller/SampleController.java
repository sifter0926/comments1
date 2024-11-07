package com.example.demo.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Log4j2
@RequiredArgsConstructor
public class SampleController {
    @GetMapping("/")
    public String home(){
        return "index";
    }
    //@GetMapping("/user/login")
    public void login(){
    }
    @GetMapping("/all")
    public void exAll(){
        log.info("exAll..........");
    }
    @GetMapping("/member")
    public void exMember(){
        log.info("exMember..........");
    }
    @GetMapping("/admin")
    public void exAdmin(){
        log.info("exAdmin..........");
    }
}
