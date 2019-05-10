package com.arrome.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

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

    Lock lock = new ReentrantLock();

    public void sendMessage(){
        try{
            lock.lock();
            System.out.println(Thread.currentThread().getId() + "-- sendMessage");
            sendEmail();
        } finally {
            lock.unlock();
        }

    }

    /*public synchronized void sendEmail(){
        try {
            lock.lock();
            System.out.println(Thread.currentThread().getId() + "-- sendEmail");
        } finally {
            lock.unlock();
        }

    }*/
    public void sendEmail(){
        try {
            lock.lock();
            System.out.println(Thread.currentThread().getId() + "-- sendEmail");
        } finally {
            lock.unlock();
        }

    }
}
