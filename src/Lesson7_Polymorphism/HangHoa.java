package Lesson7_Polymorphism;

import java.text.DecimalFormat;

public class HangHoa {
    // attributes
    protected String maHang;
    protected String tenHang;
    protected String nhaSanXuat;
    protected double gia;

    // default constructor
    public HangHoa() {
    }

    ;

    // parameterized constructor
    public HangHoa(String maHang, String tenHang, String nhaSanXuat, double gia) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.nhaSanXuat = nhaSanXuat;
        this.gia = gia;
    }

    // methods
    public void inThongTin() {
        DecimalFormat df = new DecimalFormat("#,###");
        System.out.println("\t- Ma hang: " + maHang);
        System.out.println("\t- Ten hang: " + tenHang);
        System.out.println("\t- Nha san xuat: " + nhaSanXuat);
        System.out.println("\t- Gia: " + df.format(gia) + "VND");
    }
}
