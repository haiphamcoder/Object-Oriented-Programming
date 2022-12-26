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

        HangHoa[] dsHangHoa = new HangHoa[3];
        dsHangHoa[0] = new HangDienMay("DM1011", "May loc khong khi", "Xiaomi", 5000000, 5, 220, 50);
        dsHangHoa[1] = new HangSanhSu("SS2132", "Khay mut tet", "Gom Su Viet", 2500000, "Dat nung");
        dsHangHoa[2] = new HangThucPham("TP3544", "Choco-Pie 20 cai", "Orion", 88000, nsx, hsd);

        for(HangHoa x:dsHangHoa){
            x.inThongTin();
        }
    }
}
