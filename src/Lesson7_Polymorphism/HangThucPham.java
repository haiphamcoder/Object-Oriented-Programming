package Lesson7_Polymorphism;

import java.text.SimpleDateFormat;
import java.util.Date;

public class HangThucPham extends HangHoa {
    // attributes
    private Date ngaySanXuat;
    private Date ngayHetHanDung;

    // default constructor
    public HangThucPham() {
        super();
    }

    // parameterized constructor
    public HangThucPham(String maHang, String tenHang, String nhaSanXuat, double gia, Date ngaySanXuat,
                        Date ngayHetHanDung) {
        super(maHang, tenHang, nhaSanXuat, gia);
        this.ngaySanXuat = ngaySanXuat;
        this.ngayHetHanDung = ngayHetHanDung;
    }

    // methods
    @Override
    public void inThongTin() {
        System.out.println("Hang Thuc Pham {");
        super.inThongTin();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("\t- Ngay san xuat: " + sdf.format(ngaySanXuat));
        System.out.println("\t- Ngay het han: " + sdf.format(ngayHetHanDung));
        System.out.println("}\n");
    }
}
