package Bai1.MainClass;

import Bai1.Shapes.HinhChuNhat;
import Bai1.Shapes.HinhTron;
import Bai1.Shapes.HinhTru;
import Bai1.Shapes.HinhVuong;
public class MainClass {
    public static void main(String[] args) {
        HinhTron hinhTron=new HinhTron();
        System.out.println(hinhTron.GetName());
        hinhTron.SetBanKinh(10);
        System.out.println("Chu Vi: "+hinhTron.TinhChuVi());
        System.out.println("Dien Tich: "+hinhTron.TinhDienTich());

        HinhTru hinhTru=new HinhTru();
        System.out.println(hinhTru.GetName());
        hinhTru.SetChieuCao(10);
        hinhTru.TinhDienTich();
        System.out.println("The tich: "+hinhTru.TinhTheTich());

        HinhChuNhat hinhChuNhat=new HinhChuNhat();
        System.out.println(hinhChuNhat.GetName());
        hinhChuNhat.SetDaiRong(10,5);
        System.out.println("Chu Vi: "+hinhChuNhat.TinhChuVi());
        System.out.println("Dien Tich: "+hinhChuNhat.TinhDienTich());

        HinhVuong hinhVuong=new HinhVuong();
        System.out.println(hinhVuong.GetName());
        hinhVuong.SetCanh(10);
        System.out.println("Chu Vi: "+hinhVuong.TinhChuVi());
        System.out.println("Dien Tich: "+hinhVuong.TinhDienTich());
    }
}
