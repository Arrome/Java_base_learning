package com.arrome.entity;

/**
 * Created by Arrome on 2019/4/27.
 */
public class Box<T> {

    private T data;

    public Box() {

    }

    public Box(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }
}
