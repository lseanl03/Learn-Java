package HinhTruTron.HinhChuNhat;

import java.util.Scanner;

public class HinhChuNhat {
    Scanner scanner=new Scanner(System.in);
    float dai,rong,chuvi,dientich;
    public void Nhap(){
        System.out.println("Nhap chieu dai: ");
        dai=scanner.nextInt();
        System.out.println("Nhap chieu rong: ");
        rong=scanner.nextInt();
    }
    public float ChuVi(){
        chuvi=(dai+rong)*2;
        return chuvi;

    }
    public float DienTich(){
        dientich=dai*rong;
        return dientich;
    }
}
