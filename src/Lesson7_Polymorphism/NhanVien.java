package Lesson7_Polymorphism;

public abstract class NhanVien {
    // attributes
    private String tenNhanVien;
    public static final double LUONG_MAX = 100000000;

    // methods
    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public abstract double tinhLuong();

    public abstract void inThongTin();
}
