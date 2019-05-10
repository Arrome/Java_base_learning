package com.arrome.synchronizedDemo;

/**
 * Created by Arrome on 2019/4/30.
 */
public class SyncBlockDecObject {

    public static void main(String[] args){
        Account account = new Account("Arrome",10000.0f);
        AccountOperator accountOperator = new AccountOperator(account);
        final int THREAD_NUM = 5;
        Thread threads[] = new Thread[THREAD_NUM];
        for (int i = 0; i < THREAD_NUM; i++) {
            threads[i] = new Thread(accountOperator,"Thread"+i);
            threads[i].start();
        }
    }
}

class Account {
    String name;
    float amount;

    public Account(String name, float amount) {
        this.name = name;
        this.amount = amount;
    }

    public void deposit(float amt){
        amount += amt;
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void withdraw(float amt){
        amount -= amt;
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public float getBalance(){
        return amount;
    }
}

/**
 * 给对象加锁，当一个线程访问account对象时，其他试图访问该对象的线程被阻塞，直到该线程访问结束
 */
class AccountOperator implements Runnable{

    private Account account;

    public AccountOperator(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        synchronized (account){
            account.deposit(500);
            account.withdraw(500);
            System.out.println(Thread.currentThread().getName() + ":" + account.getBalance());
        }
    }
}