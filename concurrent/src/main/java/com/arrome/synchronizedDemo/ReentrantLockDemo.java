package com.arrome.synchronizedDemo;

/**
 * Created by Arrome on 2019/4/30.
 */
public class ReentrantLockDemo {

    public static void main(String[] args) {
        final Phone phone = new Phone();
        new Thread(){
            @Override
            public void run() {
                phone.sendMessage();
            }
        }.start();
        new Thread(){
            @Override
            public void run() {
                phone.sendEmail();
            }
        }.start();
    }
}

class Phone{
    public synchronized void sendMessage(){
        System.out.println(Thread.currentThread().getId() + "-- sendMessage");
        sendEmail();
    }

    public synchronized void sendEmail(){
        System.out.println(Thread.currentThread().getId() + "-- sendEmail");
    }
}
