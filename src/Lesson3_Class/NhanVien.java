package Lesson3_Class;

public class NhanVien {
    // attributes
    private String tenNhanVien;
    private double luongCoBan;
    private double heSoLuong;

    public final double LUONG_MAX;

    // default constructor
    public NhanVien() {
        this.LUONG_MAX = Double.MAX_VALUE;
    }

    // parameterized constructor
    public NhanVien(double LUONG_MAX) {
        this.LUONG_MAX = LUONG_MAX;
    }

    public NhanVien(String tenNhanVien, double luongCoBan, double heSoLuong, double LUONG_MAX) {
        this.tenNhanVien = tenNhanVien;
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
        this.LUONG_MAX = LUONG_MAX;
    }

    // accessor and mutator methods
    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public boolean tangLuong(double tang) {
        if (this.luongCoBan * (this.heSoLuong + tang) > this.LUONG_MAX) {
            System.out.println("Khong the tang luong!");
            return false;
        }
        this.heSoLuong = this.heSoLuong + tang;
        System.out.println("Duoc tang luong");
        return true;
    }

    public double tinhLuong() {
        return luongCoBan * heSoLuong;
    }

    public void inTTin() {
        System.out.println("Ten nhan vien: " + this.tenNhanVien);
        System.out.println("\t- Luong co ban: " + this.luongCoBan + "$");
        System.out.println("\t- He so luong: " + this.heSoLuong);
        System.out.println("\t- Luong hien tai: " + tinhLuong() + "$");
        System.out.println("\t- Luong toi da: " + this.LUONG_MAX + "$\n");
    }
}
