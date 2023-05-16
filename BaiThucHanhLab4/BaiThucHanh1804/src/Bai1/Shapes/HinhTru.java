package Bai1.Shapes;

import java.util.Scanner;

public class HinhTru extends HinhTron {
    private float chieuCao;
    Scanner scanner=new Scanner(System.in);
    public HinhTru(){
        SetName("Hinh Tru");
    }

    public float GetChieuCao() {
        return chieuCao;
    }  

    public void SetChieuCao(float chieuCao) {
        this.chieuCao = chieuCao;
    }

    public float TinhTheTich(){
        SetBanKinh(10);
        return TinhDienTich()*chieuCao;
    }

}
