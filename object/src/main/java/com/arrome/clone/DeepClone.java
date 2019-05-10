package com.arrome.clone;

import java.util.Date;

/**
 * Created by Arrome on 2019/4/27.
 * 深克隆
 *
 */
public class DeepClone {

    public static void main(String[] args) throws CloneNotSupportedException {
        EmployeeDeep employeeDeep = new EmployeeDeep("Arrome",20000,new Date(),new CatDeep("keke"));

        System.out.println("clone前的对象：" + employeeDeep.getCatDeep().getName());

        EmployeeDeep employeeDeepClone = employeeDeep.clone();

        System.out.println("clone后的对象：" + employeeDeepClone.getCatDeep().getName());

        employeeDeepClone.getCatDeep().setName("gege");
        System.out.println("修改克隆后之前的对象：" + employeeDeepClone.getCatDeep().getName());
        System.out.println("修改克隆后的前对象：" + employeeDeep.getCatDeep().getName());
    }
}
