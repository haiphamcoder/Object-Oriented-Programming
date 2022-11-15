package Lesson4_CreationAndUsingClass;

import Lesson3_Class.NhanVien;

public class TestNV {
    public static void main(String[] args) {
        NhanVien nv1 = new NhanVien("Pham Ngoc Hai", 1000, 2, 5000);
        NhanVien nv2 = new NhanVien("Hai Pham Ngoc", 800, 3, 4000);
        System.out.println("# Truoc khi tang luong: ");
        nv1.inTTin();
        nv2.inTTin();

        System.out.println("# Tang luong");
        int bonus = 3;
        System.out.print("\t- Nhan vien " + nv1.getTenNhanVien() + ": ");
        nv1.tangLuong(bonus);
        System.out.print("\t- Nhan vien " + nv2.getTenNhanVien() + ": ");
        nv2.tangLuong(bonus);

        System.out.println("\n# Sau khi tang luong:");
        nv1.inTTin();
        nv2.inTTin();

        NhanVien[] nhanViens = new NhanVien[2];
        nhanViens[0] = nv1;
        nhanViens[1] = nv2;
        System.out.println("Tong luong phai chi tra: " + totalSalary(nhanViens) + "$");
    }

    public static double totalSalary(NhanVien[] nhanViens){
        double result = 0;
        for(NhanVien nhanVien:nhanViens){
            result += nhanVien.tinhLuong();
        }
        return result;
    }
}
