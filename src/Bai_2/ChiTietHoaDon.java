package Bai_2;

import java.text.DecimalFormat;
import java.util.*;

public class ChiTietHoaDon {
    private static HoaDon hoaDon ;
    private static ArrayList<HangHoa>hangHoas = new ArrayList<>();
    static Scanner Ip = new Scanner(System.in) ;
    static  Map<String , Integer> cnt = new HashMap<>()  ;
    public static void nhapHangHoa(){
        hangHoas.add(new HangHoa("BP01" , "Bàn phím keychon" , "Chiếc" , 1 , 1000000.5123231)) ; cnt.put("BP01" , 1) ;
        hangHoas.add(new HangHoa("C01" , "Balo bảo hộ laptop" , "Chiếc" , 2 , 460000.32132)) ; cnt.put("C01" , 1) ;
        hangHoas.add(new HangHoa("G01" , "Giày gucci" , "Đôi" , 2 , 12000000)) ;         cnt.put("G01" , 1) ;
        while(true){
            System.out.println("- Nhập id = 'Hh555' nếu bạn muốn dừng quá trình nhập hàng hoá");
            HangHoa one = new HangHoa() ;
            one.Input();
            String Id = one.getMaHang() ;
            Id = Id.trim() ;
            while(cnt.get(Id) != null){
                System.out.printf("Nhập lại mã hàng , do mã hàng đã tồn tại trước đó: ");
                Id = Ip.nextLine() ;
                Id = Id.trim();
            }
            if(Id.equals("Hh555")) return;
            cnt.put(Id , 1) ;
            hangHoas.add(one)  ;
        }
    }

    public static void nhapThongTinHoaDon(){
        HoaDon one = new HoaDon("Hd101","Chuyển khoản" , "VND" , new NguoiBan("Roãn Văn Quyền","T565" , "6665333333" ,"Giao Long, Giao Thuỷ, Nam Định" , "0379715226") , new Nguoi("Lê Thị Linh" , "T998" , "321978321312" ,"Cộng Hoà, Hưng Hà, Thái Bình")) ;
//        HoaDon one = new HoaDon() ;
//        one.Input();
        hoaDon = one ;
    }

    public static void sortByPrice(){
        hangHoas.sort((o1,o2)->{
            double ans = o2.getDonGia() - o1.getDonGia() ;
            return ans > 0 ? 1: ans == 0 ? 0 : -1 ;
        });
    }

    public static HangHoa maxOfQuantity(){
        return Collections.max(hangHoas, new Comparator<HangHoa>() {
            @Override
            public int compare(HangHoa o1, HangHoa o2) {
                int ans =  o1.getSoLuong() - o2.getSoLuong();
                if(ans == 0) {
                    Double ans1 = o1.thanhTien() - o2.thanhTien()  ;
                    return ans1 > 0 ? 1 : ans1 == 0 ? 0 : -1 ;
                }
                return ans ;
            }
        }) ;
    }

    public static void Out(){
        System.out.printf("%70s\n" , "HOÁ ĐƠN BÁN HÀNG");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("%123s %-5s\n" , "Số: " ,  hoaDon.getSoHoaDon());
        System.out.printf("%65s\n" , hoaDon.getNgayXuat());
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Tên người bán: " + hoaDon.getNguoiBan().getHoVaTen());
        System.out.println("Mã số thuế: " + hoaDon.getNguoiBan().getMaSoThue());
        System.out.println("Địa chỉ: " + hoaDon.getNguoiBan().getDiaChi());
        System.out.println("Số tài khoản: "+ hoaDon.getNguoiBan().getSoTaiKhoan());
        System.out.println("Điện thoại: "+ hoaDon.getNguoiBan().getSoDienThoai());

        System.out.println("----------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Tên người mua: " + hoaDon.getNguoiMua().getHoVaTen());
        System.out.printf("%1s %-90s %-5s %-1s\n", "Địa chỉ: " , hoaDon.getNguoiMua().getDiaChi() , "Số tài khoản: " , hoaDon.getNguoiMua().getSoTaiKhoan());
        System.out.println("Hình thức thanh toán: " + hoaDon.getHinhThucThanhToan());
        System.out.println("Mã số thuế: " + hoaDon.getHinhThucThanhToan());
        System.out.println("Loại tiền tệ: "+ hoaDon.getLoaiTienTe());
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("%-15s %-35s %-20s %-20s %-20s %-43s\n" , "STT" ,"Tên hàng hoá, dịch vụ" , "Đơn vị tính" , "Số lượng" , "Đơn giá" , "Thành tiền");
        Double tongTien = 0.0 ;
        sortByPrice();
        for(int i = 0 ; i < hangHoas.size(); i++){
            System.out.printf("%-15d %-35s %-20s %-20d %-20f %-43f\n" , i+1  , hangHoas.get(i).getTenHang() , hangHoas.get(i).getDonViTinh() , hangHoas.get(i).getSoLuong()
            , hangHoas.get(i).getDonGia() ,  hangHoas.get(i).thanhTien()) ;
            tongTien+= hangHoas.get(i).thanhTien() ;
        }
        DecimalFormat decimalFormat = new DecimalFormat("#,###.#") ;
        System.out.println("Tổng tiền cần thanh toán: " + (decimalFormat.format(tongTien)) + hoaDon.getLoaiTienTe()) ;
        System.out.println("Hàng hoá có số lượng lớn nhất là: " + maxOfQuantity().getTenHang());
    }

    public static void main(String[] args){
        /// Thông tin về hoá đơn em Quyền đã nhập sẵn , nếu mà anh muốn nhập lại thì anh hãy comment dòng số 29,30 và hãy bỏ comment dòng 28 ạ !
        nhapThongTinHoaDon();
        /// Hàng hoá em Quyền cũng đã nhập sẵn một số hàng hoá
        nhapHangHoa();
        Out();

    }

}
