package Lesson5_AggregationAndInheritance;

public class TruongPhong extends NhanVien {
    // attributes
    private double phuCap;
    private int soNamDuongChuc;

    // default constructor
    public TruongPhong() {
        super();
    }

    // parameterized constructor
    public TruongPhong(String tenNhanVien, double luongCoBan, double heSoLuong, double phuCap, int soNamDuongChuc) {
        super(tenNhanVien, luongCoBan, heSoLuong, 5000);
        this.phuCap = phuCap;
        this.soNamDuongChuc = soNamDuongChuc;
    }

    // accesor and mutator methods
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
}
