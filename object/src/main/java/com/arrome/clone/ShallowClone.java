package com.arrome.clone;

import java.util.Date;

/**
 * Created by Arrome on 2019/4/27.
 *
 * Object类clone()方法，默认为浅拷贝
 * 不会拷贝对象中的内部对象，两者还是同一对象引用
 *
 * clone对象不会调用构造器
 *
 * 无论深浅克隆：
 * 1. entity对象实现cloneable接口，重写成public clone()方法
 * 深clone：重写父级clone(),写入对象属性的clone
 */
public class ShallowClone {
    public static void main(String[] args) throws CloneNotSupportedException, InterruptedException {
        EmployeeShallow employeeShallow = new EmployeeShallow("Arrome",20000,new Date(),new CatShallow("keke"));

        System.out.println("clone前的对象：" + employeeShallow.getCatShallow().getName());

        EmployeeShallow employeeShallowClone = employeeShallow.clone();

        System.out.println("clone后的对象：" + employeeShallowClone.getCatShallow().getName());

        employeeShallowClone.getCatShallow().setName("gege");
        System.out.println("修改克隆后之前的对象：" + employeeShallowClone.getCatShallow().getName());
        System.out.println("修改克隆后的前对象：" + employeeShallow.getCatShallow().getName());
    }
}
