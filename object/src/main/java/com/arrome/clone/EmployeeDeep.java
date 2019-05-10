package com.arrome.clone;

import java.util.Date;

/**
 * Created by Arrome on 2019/4/27.
 */
public class EmployeeDeep implements Cloneable{

    private String name;
    private double salary;
    private Date hireDay;
    private CatDeep catDeep;

    public EmployeeDeep(String name, double salary, Date hireDay, CatDeep catDeep) {
        this.name = name;
        this.salary = salary;
        this.hireDay = hireDay;
        this.catDeep = catDeep;
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

    public CatDeep getCatDeep() {
        return catDeep;
    }

    public void setCatDeep(CatDeep catDeep) {
        this.catDeep = catDeep;
    }

    //Object.clone()方法是protected，只能子类调用，重新定义Clone方法
    @Override
    public EmployeeDeep clone() throws CloneNotSupportedException {
        EmployeeDeep employeeDeep = (EmployeeDeep)super.clone();
        employeeDeep.catDeep = (CatDeep) catDeep.clone();
        return employeeDeep;
    }
}
