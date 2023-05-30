import java.util.HashSet;
import java.util.Scanner;

public class TVH075Student {
    Scanner scanner = new Scanner(System.in);
    int n;
    String name;
    int tuoi;
    float diem;
    void NhapThongTin(){
        name=scanner.nextLine();
        tuoi=scanner.nextInt();
        diem= scanner.nextFloat();
    }
    void ThemThongTin(HashSet sHashSet, int n){
        for(int i=0;i<n;i++){
            TVH075Student student= new TVH075Student();
            System.out.print("Nhap vao sinh vien"+ (i+1)+": ");
            student.NhapThongTin();
            sHashSet.add(student);

        }
    }
    void HienThi(HashSet sHashSet){
        System.out.println("Danh sach la:");
        System.out.println(sHashSet);
    }
    void Xoa(HashSet sHashSet){
        sHashSet.removeAll(sHashSet);
    }
    void TimKiem(HashSet sHashSet){
        System.out.print("Nhap ten sinh vien can tim: ");
        String sinhvien=scanner.nextLine();
        if(sHashSet.contains(sinhvien)){
            System.out.printf("Danh sach da co %s",sinhvien);
            System.out.println();
        } 
    }
}