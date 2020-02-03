package com.company;

import java.util.ArrayList;

public class Teacher {
   private String name;
   private Subject teachesSubject;
   private int salary;

    public Teacher(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Subject getTeachesSubject() {
        return teachesSubject;
    }

    public void setTeachesSubject(Subject teachesSubject) {
        this.teachesSubject = teachesSubject;

    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
