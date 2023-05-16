package HinhTruTron.HinhTruTron;

import java.util.Scanner;

public class HinhTruTron {
    //pi*(r*r)*h;
    Scanner scanner=new Scanner(System.in);
    final float pi=3.14f;
    float h,r,the_tich;
    public void Nhap(){
        System.out.println("Nhap chieu cao: ");
        h=scanner.nextInt();
        System.out.println("Nhap ban kinh: ");
        r=scanner.nextInt();
    }
    public float The_Tich(){
        the_tich=pi*(r*r)*h;
        return the_tich;    
    }
}
