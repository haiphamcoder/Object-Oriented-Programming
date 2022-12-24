package Lesson7_Polymorphism;

public class PhongBan {
    // attributes
    private String tenPhongBan;
    private int soNhanVien;
    public static final int SO_NV_MAX = 1000;
    private NhanVien[] dsNhanVien = new NhanVien[1000];

    // default constructor
    public PhongBan() {

    }

    // parameterized constructor
    public PhongBan(String tenPhongBan) {
        this.tenPhongBan = tenPhongBan;
        soNhanVien = 0;
    }

    // methods
    public String getTenPhongBan() {
        return tenPhongBan;
    }

    public void setTenPhongBan(String tenPhongBan) {
        this.tenPhongBan = tenPhongBan;
    }

    public int getSoNhanVien() {
        return soNhanVien;
    }

    public void setSoNhanVien(int soNhanVien) {
        this.soNhanVien = soNhanVien;
    }

    public NhanVien[] getDsNhanVien() {
        return dsNhanVien;
    }

    public void setDsNhanVien(NhanVien[] dsNhanVien) {
        this.dsNhanVien = dsNhanVien;
    }

    public boolean themNV(NhanVien nhanVien) {
        if (soNhanVien == SO_NV_MAX) {
            return false;
        }
        dsNhanVien[soNhanVien++] = nhanVien;
        return true;
    }

    public NhanVien xoaNV() {
        return null;
    }

    public double tinhTongLuong() {
        double tongLuong = 0;
        for (int i = 0; i < soNhanVien; i++) {
            tongLuong += dsNhanVien[i].tinhLuong();
        }
        return tongLuong;
    }

    public void inThongTin() {
        System.out.println("- Ten phong ban: " + tenPhongBan);
        System.out.println("- So nhan vien: " + soNhanVien);
        if (soNhanVien > 0) {
            System.out.println("Danh sach nhan vien: ");
            for (int i = 0; i < soNhanVien; i++) {
                dsNhanVien[i].inThongTin();
            }
        }
    }
}
