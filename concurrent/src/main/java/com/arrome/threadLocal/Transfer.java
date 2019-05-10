package com.arrome.threadLocal;

/**
 * Created by Arrome on 2019/4/29.
 */
public class Transfer implements Runnable {

    Bank bank;

    public Transfer(Bank bank){
        this.bank = bank;
    }

    @Override
    public void run() {
        for(int i = 0; i < 10; i++){
            bank.set();
            System.out.println(Thread.currentThread() + " " + bank.get());
        }
    }
}
