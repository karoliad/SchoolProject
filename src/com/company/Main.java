package com.company;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

//tar inn elever og lærere

//lærere i arraylist
//elever i hashMap
// skal kunne definere skolefag
    // navn på fag, lærer, elever
// Printe ut liste med lærere
// printe ut liste med elever
// metode for å legge til lærer/ elever i et fag
//printe liste med lærere og elever i et fag


 //Opprette arraylist for lærere

        ArrayList<Teacher> teachersList = new ArrayList();
        teachersList.add( new Teacher("Arne Garborg", 50000));
        teachersList.add( new Teacher("Titten Tei",  350000));
        teachersList.add( new Teacher(" Arild Birkeland", 800000));

        Map <Long,Student> students = new HashMap();
        students.put(1L, new Student("Billy Bob", 1L));
        students.put(2L, new Student("Trine Lise", 2L));
        students.put(3L, new Student("Olav Thon", 3L));

        ArrayList<Subject> listOfSubjects = new ArrayList<>();
        listOfSubjects.add(new Subject("Math", 10));
        listOfSubjects.add(new Subject("Computer Science", 10));
        listOfSubjects.add(new Subject("Geography", 10));

//        System.out.println(listOfSubjects.get(1));
//        System.out.println(teachersList.get(2));
        listOfSubjects.get(1).setTeacher(teachersList.get(2));

        teachersList.get(2).setTeachesSubject(listOfSubjects.get(1));

//        System.out.println(listOfSubjects.get(1));

        String mathClass = "Math & Trine Lise & Olav Thon";
        String [] split = mathClass.split("&");
//        System.out.println(Arrays.toString(split));
//        System.out.println(split[0]);
        String subjectMath = split[0];
        String trineLise = split[1];
        String olav = split[2];

        Subject subjectFound = null;
        for (Subject subject:listOfSubjects) {
           String s =  subjectMath.trim();
                if (s.equals(subject.getSubjectName())){
                    System.out.println(subject.getSubjectName());

                   subjectFound = subject;
                }
         }



        Student trineLiseFound;
        Student olavThonFound;
        for (Student student:students.values()) {
                String s = olav.trim();
                String b = trineLise.trim();

            System.out.println(student.getName());

                if(s.equals(student.getName())){
                    System.out.println(student.getName());
                    System.out.println(student.getStudentId());
                    if (subjectFound != null) {
                        subjectFound.setStudent(student.getStudentId(), student);
                    }
                }else if( b.equals(student.getName())) {
                    System.out.println(student.getName());
                    System.out.println(student.getStudentId());
                    if (subjectFound != null) {
                        subjectFound.setStudent(student.getStudentId(), student);
                    }
                }else
                    System.out.println("no student found");

            }

        System.out.println(subjectFound);


        System.out.println( students.get(2L));
        students.get(2L).setSubjects(listOfSubjects);
        System.out.println( students.get(2L));

        listOfSubjects.add(new Subject("Chemestry", 10));
        System.out.println(listOfSubjects);

        System.out.println(students.get(3L));
        students.get(3L).setSubject(listOfSubjects.get(3));
        System.out.println(students.get(3L));





    }

}
