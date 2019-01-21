package com.fuqiang.pattern.structural.bridge;

public class Test {

    public static void main(String[] args) {
        ICBCBank icbcBank = new ICBCBank(new DepositAccount());
        icbcBank.openAccount();
    }
}
