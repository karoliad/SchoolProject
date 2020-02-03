package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Subject {
   private String subjectName;
   private int points;
   private Teacher teacher;
   private Map<Long,Student> students = new HashMap();

    public Subject(String subjectName, int points) {
        this.subjectName = subjectName;
        this.points = points;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subjectName='" + subjectName + '\'' +
                ", points=" + points +
                ", teacher=" + teacher +
                ", students=" + students +
                "\n";
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Map<Long, Student> getStudents() {
        return students;
    }

    public void setStudents(Map<Long, Student> students) {
        this.students = students;
    }


    //    Tar inn et subject, og legger til ett nytt fag i subjects-listen
    public void setStudent(Long studentId, Student std){
        this.students.put(studentId, std);

    }
}
