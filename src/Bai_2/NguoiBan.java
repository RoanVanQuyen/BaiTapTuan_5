package Bai_2;

public class NguoiBan extends Nguoi{
    private String soDienThoai  ;

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public NguoiBan(){}
    public NguoiBan(String hoVaTen, String maSoThue, String soTaiKhoan, String diaChi, String soDienThoai) {
        super(hoVaTen, maSoThue, soTaiKhoan, diaChi);
        this.soDienThoai = soDienThoai;
    }

    @Override
    public void Input() {
        super.Input();
        System.out.printf("Số điện thoại: ");
        soDienThoai = Ip.nextLine() ;
    }
}
