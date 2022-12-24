package Lesson7_Polymorphism;

import java.text.DecimalFormat;

public class TestNhanVien {
    public static void main(String[] args) {
        PhongBan phongBan = new PhongBan("Phong Ky Thuat");
        NhanVienHopDong nv1 = new NhanVienHopDong("Nguyen Van A", 7000000);
        NhanVienHopDong nv2 = new NhanVienHopDong("Tran Thi B", 7650000);
        NhanVienCoHuu nv3 = new NhanVienCoHuu("Pham Thanh C", 1.85);
        NhanVienCoHuu nv4 = new NhanVienCoHuu("Le Hoang D", 1.76);
        TruongPhong nv5 = new TruongPhong("Dao Hong H", 2.3, 5000000, 5);

        phongBan.themNV(nv1);
        phongBan.themNV(nv2);
        phongBan.themNV(nv3);
        phongBan.themNV(nv4);
        phongBan.themNV(nv5);

        phongBan.inThongTin();
        System.out.println("---------------------------------");
        DecimalFormat df = new DecimalFormat("#,###");
        System.out.println("Tong luong: " + df.format(phongBan.tinhTongLuong()) + "VND");
    }
}
