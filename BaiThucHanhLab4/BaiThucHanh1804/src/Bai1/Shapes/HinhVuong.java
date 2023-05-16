package Bai1.Shapes;
//extends mở rộng

import java.util.Scanner;

public class HinhVuong extends HinhChuNhat  {
    //Constructor
    private float canh;
    Scanner scanner=new Scanner(System.in);
    public  HinhVuong(){
        SetName("Hinh Vuong");
    }
    public float GetCanh(){
        return canh;
    }
    public void SetCanh(float canh){
        this.canh=canh;
    }
    public float TinhChuVi(){
        return canh*4;
    }
    public float TinhDienTich(){
        return canh*canh;
    }
}
