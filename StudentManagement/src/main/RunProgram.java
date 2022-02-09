package main;

import entities.Student;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class RunProgram {

    public static void findStudentById(List<Student> listStudents, int id){
        boolean check = false;
        for(int i=0; i<listStudents.size(); i++){
            if(listStudents.get(i).getId() == id){
                check = true;
                System.out.println(listStudents.get(i).toString());
            }
        }
        if(check == false){
            System.out.println("Not found");
        }
    }

    public static void main(String[] args) throws Exception{
        List<Student> listStudents = new ArrayList<>();
        Student s1 = new Student(1,"Adam",7.5, new SimpleDateFormat("dd/MM/yyyy").parse("31/12/1998"));
        Student s2 = new Student(4,"Jack",8.5, new SimpleDateFormat("dd/MM/yyyy").parse("13/02/1995"));
        Student s3 = new Student(2,"Tom",8, new SimpleDateFormat("dd/MM/yyyy").parse("18/10/2000"));
        listStudents.add(s1);
        listStudents.add(s2);
        listStudents.add(s3);
        System.out.println("------------List of student------------");
        for(int i=0; i<listStudents.size(); i++){
            System.out.println(listStudents.get(i).toString());
        }

        System.out.println("------------Find student------------");
        findStudentById(listStudents, 4);

        System.out.println("------------Sort student------------");
        Collections.sort(listStudents, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.getName().compareTo(s2.getName());
            }
        });

        Collections.sort(listStudents, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return Double.compare(s1.getMark(), s2.getMark());
            }
        });

        for(int i=0; i<listStudents.size(); i++){
            System.out.println(listStudents.get(i).toString());
        }


    }
}
