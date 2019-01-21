package com.fuqiang.pattern.structural.bridge;

public class DepositAccount implements Account {
    public Account openAccount() {
        System.out.println("打开定期账号");
        return new SavingAccount();
    }

    public void showAccountType() {
        System.out.println("这是一个定期账号");
    }
}
