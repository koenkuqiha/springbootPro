package com.design.ams.service;

import com.design.ams.entity.Account;
import com.design.ams.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements  IAccountService{

    @Autowired
    private AccountRepository repository;

    public List<Account> findAll(){
        List<Account> list = repository.findAll();
        return  list;
    }


}
