package Lesson7_Polymorphism;

import java.text.DecimalFormat;

public class NhanVienHopDong extends NhanVien {
    // attributes
    private double luongHopDong;

    // default constructor
    public NhanVienHopDong() {

    }

    // parameterized constructor
    public NhanVienHopDong(String tenNhanVien, double luongHopDong) {
        setTenNhanVien(tenNhanVien);
        this.luongHopDong = luongHopDong;
    }

    // methods
    public double getLuongHopDong() {
        return luongHopDong;
    }

    public void setLuongHopDong(double luongHopDong) {
        this.luongHopDong = luongHopDong;
    }

    @Override
    public double tinhLuong() {
        return luongHopDong;
    }

    @Override
    public void inThongTin() {
        DecimalFormat df = new DecimalFormat("#,###");
        System.out.println("Nhan Vien Hop Dong {");
        System.out.println("\t- Ten nhan vien: " + getTenNhanVien());
        System.out.println("\t- Luong hop dong: " + df.format(luongHopDong) + "VND");
        System.out.println("}\n");
    }
}
