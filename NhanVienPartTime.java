
package lab6;
public class NhanVienPartTime extends NhanVien{ 
    private int gioLamViec;
    
    public NhanVienPartTime() {}

    public NhanVienPartTime(int gioLamViec, String ten) {
        super();
        this.gioLamViec = gioLamViec;
    }

    public int getGioLamViec() {
        return gioLamViec;
    }

    public void setGioLamViec(int gioLamViec) {
        this.gioLamViec = gioLamViec;
    }

    @Override
    public String getTen() {
        return ten;
    }

    @Override
    public void setTen(String ten) {
        this.ten = ten;
    }

    @Override
    public long getLuong() {
        return luong;
    }

    @Override
    public void setLuong(long luong) {
        this.luong = luong;
    }
    
    
    
    @Override
    public String loaiNhanVien () {
        System.out.println("Parttime");
        return "partime";
    }
    
    @Override
    public void tinhLuong() {
        float Luong = this.luong*this.gioLamViec;
        System.out.println("Luong cua nhan vien PartTime la : " + Luong);
    }
}
