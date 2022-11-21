package Lesson5_AggregationAndInheritance;

public class NhanVien {
    // attributes
    protected String tenNhanVien;
    protected double luongCoBan;
    protected double heSoLuong;

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

    public boolean tangLuong(double tang) {
        if (luongCoBan * (heSoLuong + tang) > LUONG_MAX) {
            System.out.println("Khong the tang luong!");
            return false;
        }
        heSoLuong = heSoLuong + tang;
        System.out.println("Duoc tang luong");
        return true;
    }

    public double tinhLuong() {
        return luongCoBan * heSoLuong;
    }

    public void inTTin() {
        System.out.println("Ten nhan vien: " + tenNhanVien);
        System.out.println("\t- Luong co ban: " + luongCoBan + "$");
        System.out.println("\t- He so luong: " + heSoLuong);
        System.out.println("\t- Luong hien tai: " + tinhLuong() + "$");
        System.out.println("\t- Luong toi da: " + LUONG_MAX + "$\n");
    }
}
