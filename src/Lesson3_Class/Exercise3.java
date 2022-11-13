package Lesson3_Class;

public class Exercise3 {
    public static void main(String[] args) {
        NhanVien nv1 = new NhanVien(5000);
        nv1.setTenNhanVien("Pham Ngoc Hai");
        nv1.setLuongCoBan(1000);
        nv1.setHeSoLuong(0.8);
        nv1.inTTin();

        NhanVien nv2 = new NhanVien();
        nv2.setTenNhanVien("Hai Pham Ngoc");
        nv2.setLuongCoBan(1000);
        nv2.setHeSoLuong(1.2);
        nv2.inTTin();
    }
}
