package Bai_2;

import java.util.Scanner;

public class HangHoa {
    private String maHang ;

    private String tenHang ;
    private String donViTinh ;
    private int soLuong ;
    private double donGia ;

    public String getMaHang() {
        return maHang;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public String getDonViTinh() {
        return donViTinh;
    }

    public void setDonViTinh(String donViTinh) {
        this.donViTinh = donViTinh;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
    public HangHoa(){}
    public HangHoa(String maHang, String tenHang, String donViTinh, int soLuong, double donGia) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.donViTinh = donViTinh;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }
    Scanner Ip = new Scanner(System.in)  ;
    public void Input(){
        System.out.printf("Mã hàng: ");
        maHang = Ip.nextLine() ;
        System.out.printf("Tên hàng: ");
        tenHang = Ip.nextLine() ;
        System.out.printf("Đơn vị tính: ");
        donViTinh = Ip.nextLine() ;
        System.out.printf("Số lượng: ");
        soLuong = Ip.nextInt() ;
        System.out.printf("Đơn gía: ");
        donGia=Ip.nextDouble() ;
    }
    public double thanhTien(){
        return (double) soLuong * donGia ;
    }
}
