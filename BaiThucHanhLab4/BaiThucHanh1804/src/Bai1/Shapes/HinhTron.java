package Bai1.Shapes;

import java.util.Scanner;

public class HinhTron extends HinhHoc {
    private float banKinh;
    Scanner scanner=new Scanner(System.in);
    public HinhTron(){
        SetName("Hinh Tron");
    }
    public float GetBanKinh() {
        return banKinh;
    }   

    public void SetBanKinh(float banKinh) {
        this.banKinh = banKinh;
    }

    public float TinhChuVi() {
        return 2*PI*banKinh;
    }

    public float TinhDienTich() {
        return PI*banKinh*banKinh;
    }
}





