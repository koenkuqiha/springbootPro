package com.design.ams.controller;

import com.design.ams.entity.Account;
import com.design.ams.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@RequestMapping("/account")
@Controller
public class AccountController {

    @Autowired
    IAccountService accountService;

    @RequestMapping("/list")
    @ResponseBody
    public List<Account> accountList(Model model){

        List<Account> accountList = accountService.findAll();
        System.out.println(accountList);
        return accountList;
    }
}
