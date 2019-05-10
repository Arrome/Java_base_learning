package com.arrome.synchronizedDemo;

/**
 * Created by Arrome on 2019/4/30.
 */
public class SyncBlock implements Runnable {

    private static int count;

    public SyncBlock(){
        count = 0;
    }

    public int getCount() {
        return count;
    }

    @Override
    public void run(){
        synchronized (this) {
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

    public static void main(String[] args){
        /*
         * 并发线程访问同一对象中的synchronized代码块，在同一时刻只能有一个线程得到执行，另外的阻塞等待当前线程执行完这个代码块后才执行。
         * 线程间时互斥的（synchronized代码块会锁定当前的对象，只有执行完该代码块才能释放该对象锁）
         */
        SyncBlock syncBlock = new SyncBlock();
        Thread thread1 = new Thread(syncBlock,"syncBlock1");
        Thread thread2 = new Thread(syncBlock,"syncBlock2");
        thread1.start();
        thread2.start();
        System.out.println("--------------------------------");

        /*
         * synchronized 锁定的是对象，两把锁互不干扰
         */
        SyncBlock syncBlock1 = new SyncBlock();
        SyncBlock syncBlock2 = new SyncBlock();
        Thread thread11 = new Thread(syncBlock1,"syncBlock1");
        Thread thread12 = new Thread(syncBlock2,"syncBlock2");
        thread11.start();
        thread12.start();
    }
}
