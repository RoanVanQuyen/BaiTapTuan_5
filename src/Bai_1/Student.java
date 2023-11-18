package Bai_1;

import java.util.HashMap;
import java.util.Map;

public class Student extends Person{
    private Integer id ;
    private static int ID = 0;
    private String nameClass ;
    private Float gpa;
    private final  float criteria = 2 ;

    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    public Float getGpa() {
        return gpa;
    }

    public void setGpa(Float gpa) {
        this.gpa = gpa;
    }

    public float getCriteria() {
        return criteria;
    }
    public Student(){
        id = ID;
        ID++ ;
    }
    public Student(String nameClass, Float gpa) {
        this.nameClass = nameClass;
        this.gpa = gpa;
    }

    public Student(String name, int age, Address address, String nameClass, Float gpa) {
        super(name, age, address);
        id = ID ;
        ID++ ;
        this.nameClass = nameClass;
        this.gpa = gpa;
    }

    @Override
    public void Input() {
        super.Input();
        System.out.printf("Id: ");
        id = Ip.nextInt() ;
        Ip.nextLine();
        System.out.printf("Name class: ");
        nameClass = Ip.nextLine() ;
        System.out.printf("Jpa: ");
        gpa = Ip.nextFloat() ;
    }

    @Override
    public void Out() {
        super.Out();
        System.out.printf("%-10d %-20s %-20f\n" ,id ,nameClass , gpa);
    }

    public boolean checkFall(){
        if(gpa < criteria) return  false;
        return  true ;
    }
}
