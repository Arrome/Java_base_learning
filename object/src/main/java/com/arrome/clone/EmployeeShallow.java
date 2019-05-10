package com.arrome.clone;

import java.util.Date;

/**
 * Created by Arrome on 2019/4/27.
 */
public class EmployeeShallow implements Cloneable{

    private String name;
    private double salary;
    private Date hireDay;
    private CatShallow catShallow;

    public EmployeeShallow(String name, double salary, Date hireDay, CatShallow catShallow) {
        this.name = name;
        this.salary = salary;
        this.hireDay = hireDay;
        this.catShallow = catShallow;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getHireDay() {
        return hireDay;
    }

    public void setHireDay(Date hireDay) {
        this.hireDay = hireDay;
    }

    public CatShallow getCatShallow() {
        return catShallow;
    }

    public void setCatShallow(CatShallow catShallow) {
        this.catShallow = catShallow;
    }

    //Object.clone()方法是protected，只能子类调用，重新定义Clone方法
    @Override
    public EmployeeShallow clone() throws CloneNotSupportedException {
        return (EmployeeShallow)super.clone();
    }
}
