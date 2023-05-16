package Bai1.Shapes;
public class HinhHoc {
    protected static final float PI=3.14f;

    private String name;
    private float chuVi;
    private float dienTich;
    private float theTich;

    public String GetName(){
        return name;
    }

    public void SetName(String name){
        this.name=name;
    }

    public void inChuVi(){
        System.out.println("Chu Vi:"+ chuVi);
    }

    public void InDienTich(){
        System.out.println("Dien tich:"+ dienTich);
    }

    public void inTheTich(){
        System.out.println("The Tich:"+ theTich);
    }
}
