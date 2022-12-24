package Lesson7_Polymorphism;

import java.text.DecimalFormat;

public class NhanVienCoHuu extends NhanVien {
    // attributes
    private static double luongCoBan = 5000000;
    private double heSoLuong;

    // default constructor
    public NhanVienCoHuu() {

    }

    // parameterized constructor
    public NhanVienCoHuu(String tenNhanVien, double heSoLuong) {
        setTenNhanVien(tenNhanVien);
        this.heSoLuong = heSoLuong;
    }

    // methods
    public static double getLuongCoBan() {
        return luongCoBan;
    }

    public static void setLuongCoBan(double luongCoBan) {
        NhanVienCoHuu.luongCoBan = luongCoBan;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public boolean tangHeSoLuong(double tang) {
        return true;
    }

    @Override
    public double tinhLuong() {
        return luongCoBan * heSoLuong;
    }

    @Override
    public void inThongTin() {
        DecimalFormat df = new DecimalFormat("#,###");
        System.out.println("Nhan Vien Co Huu {");
        System.out.println("\t- Ten nhan vien: " + getTenNhanVien());
        System.out.println("\t- Luong co ban: " + df.format(luongCoBan) + "VND");
        System.out.println("\t- He so luong: " + heSoLuong);
        System.out.println("\t- Luong: " + df.format(tinhLuong()) + "VND");
        System.out.println("}\n");
    }
}
