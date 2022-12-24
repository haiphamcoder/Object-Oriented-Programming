package Lesson7_Polymorphism;

import java.text.DecimalFormat;

public class TruongPhong extends NhanVienCoHuu {
    // attributes
    private double phuCap;
    private int soNamDuongChuc;

    // default constructor
    public TruongPhong() {

    }

    // parameterized constructor
    public TruongPhong(String tenNhanVien, double heSoLuong, double phuCap, int soNamDuongChuc) {
        setTenNhanVien(tenNhanVien);
        setHeSoLuong(heSoLuong);
        this.phuCap = phuCap;
        this.soNamDuongChuc = soNamDuongChuc;
    }

    // methods
    public double getPhuCap() {
        return phuCap;
    }

    public void setPhuCap(double phuCap) {
        this.phuCap = phuCap;
    }

    public int getSoNamDuongChuc() {
        return soNamDuongChuc;
    }

    public void setSoNamDuongChuc(int soNamDuongChuc) {
        this.soNamDuongChuc = soNamDuongChuc;
    }

    @Override
    public double tinhLuong() {
        return getLuongCoBan() * getHeSoLuong() + phuCap;
    }

    @Override
    public void inThongTin() {
        DecimalFormat df = new DecimalFormat("#,###");
        System.out.println("Truong Phong {");
        System.out.println("\t- Ten nhan vien: " + getTenNhanVien());
        System.out.println("\t- Luong co ban: " + df.format(getLuongCoBan()) + "VND");
        System.out.println("\t- He so luong: " + getHeSoLuong());
        System.out.println("\t- Phu cap: " + df.format(phuCap) + "VND");
        System.out.println("\t- So nam duong chuc: " + soNamDuongChuc);
        System.out.println("\t- Luong: " + df.format(tinhLuong()) + "VND");
        System.out.println("}\n");
    }
}
