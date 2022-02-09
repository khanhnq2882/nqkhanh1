package entities;

import java.util.Date;
import java.util.Comparator;

public class Student{
    private int id;
    private String name;
    private double mark;
    private Date dob;

    public Student(){ }

    public Student(int id, String name, double mark, Date dob){
        this.id = id;
        this.name = name;
        this.mark = mark;
        this.dob = dob;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Student with id: "+id+", name: "+name+", mark: "+mark+", dob:"+dob;
    }

}
