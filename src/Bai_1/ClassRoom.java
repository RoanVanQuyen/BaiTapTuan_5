package Bai_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ClassRoom {
    public static ArrayList<Student>students = new ArrayList<>();
    public static void fakeData(){
        students.add(new Student("Roan Van Quyen" , 19 , new Address("Giao Long" , "Giao Thuy" , "Nam Dinh") , "KTPM01" , 3.53f)) ;
        students.add(new Student("Le Thi Linh" , 19 , new Address("Cong Hoa" , "Hung Ha" , "Thai Binh" ) , "KTKT10" , 3.51f)) ;
        students.add(new Student("Nguyen Van A" , 20 , new Address("Nam Tu Niem" , "Ha Noi" , "Ha Noi") , "IT01" ,3.6f )) ;
    }
    public static void sortGpa(){
        students.sort((o1,o2) ->{
            float ans = o1.getGpa() - o2.getGpa() ;
            return ans > 0 ? 1 : ans == 0 ?  0 : -1;
        });
    }
    public static void Title(){
        System.out.printf("%-20s %-20s %-20s" , "Commune" , "District"  , "City" );
        System.out.printf("%-20s %-20s" , "Name" ,  "Age");
        System.out.printf("%-10s %-20s %-20s\n" ,"Id" ,"Name class" ,"Gpa");
    }
    static  Scanner Ip = new Scanner(System.in) ;
    static Map<Integer , Integer> cnt  = new HashMap<>() ;
    public static void Input(){

        Integer id  = 0 ;
        while(true) {
            System.out.println("--------------------------------------------Next student------------------------------------");
            Student student = new Student();
            student.Input();
            id = student.getId() ;
            while(cnt.get(id)  != null){
                System.out.printf("Id again: ");
                student.setId(Ip.nextInt());
                id=student.getId() ;
            }
            if(id.equals(555)) return ;
            cnt.put(id , 1) ;
            students.add(student);
        }
    }
    public static void Out(){
        for(Student x: students){
            x.Out();
        }
    }
    public static boolean removeById(int id){
        for(Student x :students){
            if(x.getId() == id){
                students.remove(x) ;
                return  true ;
            }
        }
        return  false ;
    }
    public static void main(String[] args){
        fakeData();
        int choose = 0 ;
        do {
            System.out.printf("- Choose: ");
            choose = Ip.nextInt() ;
            if(choose == 1){
                Input();
            }
            if(choose == 2){
                Title();
                Out();
            }
            if(choose == 3){
                System.out.println("- 'Sorting by gpa was successful'");
                sortGpa();
            }
            if(choose == 4){
                System.out.printf("- Please ,'Id' you need remove: ");
                int id = Ip.nextInt();
                if(removeById(id) == true){
                    System.out.println("- 'Success'");
                }
                else{
                    System.out.println("- 'Cann't'");
                }
            }
        }while(choose < 5) ;
    }
}
