package Bai_1;

import java.util.Scanner;

public class Person {
    protected String name ;
    protected int age ;
    protected   Address address ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    public Person(){}

    public Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
    Scanner Ip = new Scanner(System.in) ;
    public void Input(){
        System.out.printf("Name: ");
        name = Ip.nextLine() ;
        System.out.printf("Age: ");
        age = Ip.nextInt();
        Ip.nextLine() ;
        Address one = new Address() ;
        one.Input();
        address = one;
    }

    public void Out(){
        address.Out();
        System.out.printf("%-20s %-20d" , name , age);
    }
}
