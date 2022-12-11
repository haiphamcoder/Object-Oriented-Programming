package Lesson6_AdvancedInheritance;

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

    //
    @Override
    public double tinhLuong() {
        return luongCoBan * heSoLuong + phuCap;
    }

    @Override
    public void inTTin() {
        System.out.println("Ten truong phong: " + tenNhanVien);
        System.out.println("\t- Luong co ban: " + luongCoBan + "$");
        System.out.println("\t- He so luong: " + heSoLuong);
        System.out.println("\t- Phu cap: " + phuCap);
        System.out.println("\t- So nam duong chuc: " + soNamDuongChuc);
        System.out.println("\t- Luong hien tai: " + tinhLuong() + "$");
        System.out.println("\t- Luong toi da: " + LUONG_MAX + "$\n");
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
