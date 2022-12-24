package Lesson7_Polymorphism;

public class HangSanhSu extends HangHoa {
    // attrubutes
    private String loaiNguyenLieu;

    // default constructor
    public HangSanhSu() {
        super();
    }

    // parameterized constructor
    public HangSanhSu(String maHang, String tenHang, String nhaSanXuat, double gia, String loaiNguyenLieu) {
        super(maHang, tenHang, nhaSanXuat, gia);
        this.loaiNguyenLieu = loaiNguyenLieu;
    }

    // methods
    @Override
    public void inThongTin() {
        System.out.println("Hang Sanh Su {");
        super.inThongTin();
        System.out.println("\t- Loai nguyen lieu: " + loaiNguyenLieu);
        System.out.println("}\n");
    }
}
