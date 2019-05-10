package com.arrome.threadLocal;

/**
 * Created by Arrome on 2019/4/29.
 */
public class Test {

    public static void main(String[] args) throws InterruptedException {
        Bank bank = new Bank();
        Transfer transfer = new Transfer(bank);
        Thread thread1 = new Thread(transfer);
        thread1.start();
        Thread thread2 = new Thread(transfer);
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(Thread.currentThread() + " " + bank.get());
    }
}
