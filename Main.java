
package lab6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        NhanVien nv = new NhanVien();
        NhanVienPartTime nvpt = new NhanVienPartTime();
        NhanVienFullTime nvft = new NhanVienFullTime();
        System.out.println("Nhap ten nhan vien");
        nv.setTen(input.nextLine());
        System.out.println("Nhap luong");
        nv.setLuong(input.nextLong());
        nv.xuatThongTin();
        
        System.out.println("Nhap ten nhan vien");
        nvpt.setTen(input.nextLine());
        nvpt.setTen(input.nextLine());
        System.out.println("Nhap luong");
        nvpt.setLuong(input.nextLong());
        System.out.println("Nhap gio lam viec");
        nvpt.setGioLamViec(input.nextInt());
        nvpt.loaiNhanVien();
        nvpt.tinhLuong();
        
        
        System.out.println("Nhap ten nhan vien");
        nvft.setTen(input.nextLine());
        nvft.setTen(input.nextLine());
        System.out.println("Nhap luong");
        nvft.setLuong(input.nextLong());
        System.out.println("Nhap ngay lam viec");
        nvft.setNgayLamThem(input.nextInt());
        nvft.loaiNhanVien();
        nvft.tinhLuong();
        
        
        
    }
}
