package com.arrome.synchronizedDemo;

import org.junit.Test;

/**
 * Created by Arrome on 2019/4/30.
 */
public class SyncBlockApp {

    /**
     * 当测试主线程执行结束后，不管子线程是否结束，都会回调TestResult的wasSuccessful方法，
     * 然后判断结果是成功还是失败，最后调用相应的System.exit()方法。
     */
    @Test
    public void test(){
        SyncBlock syncBlock = new SyncBlock();
        Thread thread1 = new Thread(syncBlock,"syncBlock1");
        Thread thread2 = new Thread(syncBlock,"syncBlock2");
        thread1.start();
        thread2.start();
        /*try {
            Thread.currentThread().sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
    }

    @Test
    public void test2(){
        SyncBlock syncBlock1 = new SyncBlock();
        SyncBlock syncBlock2 = new SyncBlock();
        Thread thread1 = new Thread(syncBlock1,"syncBlock1");
        Thread thread2 = new Thread(syncBlock2,"syncBlock2");
        thread1.start();
        thread2.start();
    }
}
