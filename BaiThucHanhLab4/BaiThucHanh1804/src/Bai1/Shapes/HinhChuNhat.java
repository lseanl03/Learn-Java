package Bai1.Shapes;

public class HinhChuNhat extends HinhHoc{
    private float dai;
    private float rong;
    public HinhChuNhat(){
        SetName("Hinh Chu Nhat");
    }
    public float GetDai(){
        return dai;
    }
    public float GetRong(){
        return rong;
    }
    public void SetDaiRong(float dai, float rong){
        this.dai=dai;
        this.rong=rong;
    }
    public float TinhChuVi(){
        return (dai+rong)*2;
    }
    public float TinhDienTich(){
        return dai*rong;
    }
}
