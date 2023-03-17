
package lab6b;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        HocSinh hs = new HocSinh();
        HocSinhChuyenToan  hst = new HocSinhChuyenToan();
        System.out.println("Nhap ten hoc sinh");
        hs.setHoTen(input.nextLine());
        System.out.println("Nhap lop");
        hs.setLop(input.nextInt());
        System.out.println("Nhap diem mon toan");
        hs.setToan(input.nextFloat());
        System.out.println("Nhap diem mon ly");
        hs.setLy(input.nextFloat());
        System.out.println("Nhap diem mon hoa");
        hs.setHoa(input.nextFloat());
        hs.diemTrungBinh();
        
        System.out.println("\nNhap ten hoc sinh");
        hst.setHoTen(input.nextLine());
        hst.setHoTen(input.nextLine());
        System.out.println("Nhap lop");
        hst.setLop(input.nextInt());
        System.out.println("Nhap diem mon toan");
        hst.setToan(input.nextFloat());
        System.out.println("Nhap diem mon ly");
        hst.setLy(input.nextFloat());
        System.out.println("Nhap diem mon hoa");
        hst.setHoa(input.nextFloat());
        hst.diemTrungBinh();
        
        
    }
}
