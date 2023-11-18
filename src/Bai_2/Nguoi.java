package Bai_2;

import java.util.Scanner;

public class Nguoi {
    private String hoVaTen ;
    private String maSoThue ;
    private String soTaiKhoan ;
    private String diaChi ;

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public String getMaSoThue() {
        return maSoThue;
    }

    public void setMaSoThue(String maSoThue) {
        this.maSoThue = maSoThue;
    }

    public String getSoTaiKhoan() {
        return soTaiKhoan;
    }

    public void setSoTaiKhoan(String soTaiKhoan) {
        this.soTaiKhoan = soTaiKhoan;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }


    public Nguoi(){}
    public Nguoi(String hoVaTen, String maSoThue, String soTaiKhoan, String diaChi) {
        this.hoVaTen = hoVaTen;
        this.maSoThue = maSoThue;
        this.soTaiKhoan = soTaiKhoan;
        this.diaChi = diaChi;
    }
    Scanner Ip = new Scanner(System.in) ;
    public void Input(){
        System.out.printf("Họ và tên: ");
        hoVaTen = Ip.nextLine() ;
        System.out.printf("Mã số thuế: ");
        maSoThue =Ip.nextLine() ;
        System.out.printf("Số tài khoản: ");
        soTaiKhoan = Ip.nextLine() ;
        System.out.printf("Địa chỉ: ");
        diaChi = Ip.nextLine() ;
    }
}
