package Lesson7_Polymorphism;

public class HangDienMay extends HangHoa {
    // attributes
    private double thoiGianBaoHanh;
    private double dienAp;
    private double congSuat;

    // defualt constructor
    public HangDienMay() {
    }

    // parameterized constructor
    public HangDienMay(String maHang, String tenHang, String nhaSanXuat, double gia, double thoiGianBaoHanh,
                       double dienAp, double congSuat) {
        super(maHang, tenHang, nhaSanXuat, gia);
        this.thoiGianBaoHanh = thoiGianBaoHanh;
        this.dienAp = dienAp;
        this.congSuat = congSuat;
    }

    // methods
    @Override
    public void inThongTin() {
        System.out.println("Hang Dien May {");
        super.inThongTin();
        System.out.println("\t- Thoi gian bao hanh: " + thoiGianBaoHanh + " nam");
        System.out.println("\t- Dien ap: " + dienAp + "V");
        System.out.println("\t- Cong suat: " + congSuat + "W");
        System.out.println("}\n");
    }
}
