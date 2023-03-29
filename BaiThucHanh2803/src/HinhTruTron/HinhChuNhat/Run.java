package HinhTruTron.HinhChuNhat;

public class Run {
    public static void main(String[] args) {
        HinhChuNhat hcn=new HinhChuNhat();
        hcn.Nhap();
        System.out.println("Chu vi hinh chu nhat la: "+hcn.ChuVi());
        System.out.println("Dien tich hinh chu nhat la: "+hcn.DienTich());

    }
}
