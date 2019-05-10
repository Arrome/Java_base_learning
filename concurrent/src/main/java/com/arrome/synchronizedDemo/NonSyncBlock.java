package com.arrome.synchronizedDemo;

/**
 * Created by Arrome on 2019/4/30.
 */
public class NonSyncBlock implements Runnable {

    private int count;

    public NonSyncBlock(){
        count = 0;
    }

    public void countAdd(){
        synchronized (this) {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + ":" + (count++));
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    //未对变量进行读写操作，可以不用synchronized代码块
    public void printCount(){
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " count:" + count);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        if (threadName.equals("A")) {
            countAdd();
        } else if (threadName.equals("B")) {
            printCount();
        }
    }

    public static void main(String[] args){
        NonSyncBlock nonSysBlock = new NonSyncBlock();
        Thread thread1 = new Thread(nonSysBlock,"A");
        Thread thread2 = new Thread(nonSysBlock,"B");
        thread1.start();
        thread2.start();
    }
}
