package com.arrome.threadLocal;

/**
 * Created by Arrome on 2019/4/29.
 *
 * 概念：为变量在每个线程中都创建了一个副本，每个线程可以访问自己内部的副本变量
 * 常见应用场景：数据库连接、session管理 等
 *
 * 注意：由于每个线程都创建了副本，要考虑对资源的消耗，比如内存占用会比不使用ThreadLocal要大
 * 一般都声明在静态变量中，如果创建ThreadLocal而没有调用remove方法，会导致内存泄露
 * 例如：线程池中对线程管理都是采用线程复制的方法，所以线程甚至永远不会结束。而ThreadLocal事实上是和线程绑定的一个变量
 *
 * Thread 内部通过 ThreadLocal.ThreadLocalMap 来维护 ThreadLocal 变量表，存储每个线程的变量副本。
 */
public class Bank {
    ThreadLocal<Integer> threadLocal = new ThreadLocal<Integer>(){

        @Override
        protected Integer initialValue() {
            return 100;
        }
    };

    public int get(){
        return threadLocal.get();
    }

    public void set(){
        threadLocal.set(threadLocal.get() + 10);
    }
}
