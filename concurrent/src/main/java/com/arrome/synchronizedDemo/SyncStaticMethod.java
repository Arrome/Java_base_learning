package com.arrome.synchronizedDemo;

/**
 * Created by Arrome on 2019/4/30.
 *
 * 静态方法不属于对象。而synchronized修饰的静态方法锁定的是这个类的所有对象。
 */
public class SyncStaticMethod implements Runnable {
    private static int count;

    public SyncStaticMethod(){
        count = 0;
    }

    /*public synchronized static void method(){
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println(Thread.currentThread().getName() + ":" + (count++));
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }*/

    //synchronized给类加锁和给静态方法加锁--效果相同
    public void method(){
        synchronized (SyncStaticMethod.class){
            for (int i = 0; i < 5; i++) {
                try {
                    System.out.println(Thread.currentThread().getName() + ":" + (count++));
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    public void run() {
        method();
    }

    public static void main(String[] args){
        SyncStaticMethod syncStaticMethod1 = new SyncStaticMethod();
        SyncStaticMethod syncStaticMethod2 = new SyncStaticMethod();
        Thread thread1 = new Thread(syncStaticMethod1,"syncStaticMethod1");
        Thread thread2 = new Thread(syncStaticMethod2,"syncStaticMethod2");
        thread1.start();
        thread2.start();
    }
}
