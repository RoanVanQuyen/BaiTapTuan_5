package Bai_2;

import java.sql.Date;
import java.util.Scanner;

public class HoaDon {
    private String soHoaDon ;
    private Date ngayXuat ;
    private String hinhThucThanhToan ;
    private String loaiTienTe ;
    private NguoiBan nguoiBan  ;
    private Nguoi nguoiMua ;


    public NguoiBan getNguoiBan() {
        return nguoiBan;
    }

    public void setNguoiBan(NguoiBan nguoiBan) {
        this.nguoiBan = nguoiBan;
    }

    public Nguoi getNguoiMua() {
        return nguoiMua;
    }

    public void setNguoiMua(Nguoi nguoiMua) {
        this.nguoiMua = nguoiMua;
    }

    public String getSoHoaDon() {
        return soHoaDon;
    }

    public void setSoHoaDon(String soHoaDon) {
        this.soHoaDon = soHoaDon;
    }

    public Date getNgayXuat() {
        return ngayXuat;
    }

    public void setNgayXuat(Date ngayXuat) {
        this.ngayXuat = ngayXuat;
    }

    public String getHinhThucThanhToan() {
        return hinhThucThanhToan;
    }

    public void setHinhThucThanhToan(String hinhThucThanhToan) {
        this.hinhThucThanhToan = hinhThucThanhToan;
    }

    public String getLoaiTienTe() {
        return loaiTienTe;
    }

    public void setLoaiTienTe(String loaiTienTe) {
        this.loaiTienTe = loaiTienTe;
    }

    public HoaDon(){}

    public HoaDon(String soHoaDon,  String hinhThucThanhToan, String loaiTienTe, NguoiBan nguoiBan, Nguoi nguoiMua) {
        this.soHoaDon = soHoaDon;
        this.ngayXuat = Date.valueOf(java.time.LocalDate.now());
        this.hinhThucThanhToan = hinhThucThanhToan;
        this.loaiTienTe = loaiTienTe;
        this.nguoiBan = nguoiBan;
        this.nguoiMua = nguoiMua;
    }
    Scanner Ip=new Scanner(System.in) ;
    public void Input(){
        System.out.printf("Số hoá đơn: ");
        soHoaDon = Ip.nextLine() ;
        ngayXuat = Date.valueOf(java.time.LocalDate.now());
        NguoiBan nguoiBan1 = new NguoiBan() ;
        System.out.println("Thông tin người bán hàng");
        nguoiBan1.Input();
        nguoiBan = nguoiBan1  ;
        Nguoi nguoi = new Nguoi() ;
        System.out.println("Thông tin người mua hàng");
        nguoi.Input();
        nguoiMua = nguoi;
        System.out.printf("Hình thức thanh toán: ");
        hinhThucThanhToan = Ip.nextLine() ;
        System.out.printf("Loại tiền tệ: ");
        loaiTienTe= Ip.nextLine();
    }
}
