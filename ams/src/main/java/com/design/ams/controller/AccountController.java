package com.design.ams.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/account")
@Controller
public class AccountController {

    @RequestMapping("/list")
    public String accountList(){

        return "/accountList";
    }
}
