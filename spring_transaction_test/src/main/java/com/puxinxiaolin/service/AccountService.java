package com.puxinxiaolin.service;

public interface AccountService {

    void transferMoney(String outAccount, String inAccount, Integer money);

    void registerAccount(String account, String password);

}
