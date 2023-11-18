package Bai_1;

import java.util.Scanner;

public class Address {
    private String commune ;
    private String district ;
    private String city ;

    public String getCommune() {
        return commune;
    }

    public void setCommune(String commune) {
        this.commune = commune;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    public Address(){}

    public Address(String commune, String district, String city) {
        this.commune = commune;
        this.district = district;
        this.city = city;
    }
    Scanner Ip = new Scanner(System.in) ;
    public void Input(){
        System.out.printf("Commune: ");
        commune = Ip.nextLine()  ;
        System.out.printf("District: ");
        district = Ip.nextLine() ;
        System.out.printf("City: ");
        city = Ip.nextLine();
    }

    public void Out(){
        System.out.printf("%-20s %-20s %-20s" , commune , district , city);
    }

}
