package Lesson7_Polymorphism;

import java.util.Calendar;
import java.util.Date;

public class TestHangHoa {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.set(2022, Calendar.OCTOBER, 15);
        Date nsx = cal.getTime();
        cal.set(2023, Calendar.APRIL, 15);
        Date hsd = cal.getTime();

        HangDienMay hangDienMay = new HangDienMay("DM1011", "May loc khong khi", "Xiaomi", 5000000, 5, 220, 50);
        HangHoa hangSanhSu = new HangSanhSu("SS2132", "Khay mut tet", "Gom Su Viet", 2500000, "Dat nung");
        HangHoa hangThucPham1 = new HangThucPham("TP3544", "Choco-Pie 20 cai", "Orion", 88000, nsx, hsd);
        HangThucPham hangThucPham2 = (HangThucPham) hangThucPham1;

        hangDienMay.inThongTin();
        hangSanhSu.inThongTin();
        hangThucPham2.inThongTin();
    }
}
