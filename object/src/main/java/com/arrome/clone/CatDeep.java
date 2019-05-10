package com.arrome.clone;

/**
 * Created by Arrome on 2019/4/27.
 */
public class CatDeep implements Cloneable{
    private String name;

    public CatDeep(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
