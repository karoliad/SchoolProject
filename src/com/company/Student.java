package com.company;

import java.util.ArrayList;

public class Student {
   private String name;
   private ArrayList<Subject> subjects = new ArrayList<>();
   private long studentId;

    public Student(String name, Long studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student:\n" +
                "name='" + name + "\n" +
                ", subjects=" + subjects +
                "\n";
    }

    public Long getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(ArrayList<Subject> subjects) {
        this.subjects = subjects;
    }

//    Tar inn et subject, og legger til ett nytt fag i subjects-listen
    public void setSubject(Subject sub){
        this.subjects.add(sub);

    }
}
