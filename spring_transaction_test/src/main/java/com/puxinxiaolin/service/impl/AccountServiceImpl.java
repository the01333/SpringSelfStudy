package com.puxinxiaolin.service.impl;

import com.puxinxiaolin.mapper.AccountMapper;
import com.puxinxiaolin.service.AccountService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Resource
    private AccountMapper accountMapper;

    @Override
    @Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED)
    public void transferMoney(String outAccount, String inAccount, Integer money) {
        accountMapper.decreMoney(outAccount, money);
        int i = 1 / 0;
        accountMapper.increMoney(inAccount, money);
    }

    @Override
    public void registerAccount(String account, String password) {

    }
}
