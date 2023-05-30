import java.util.HashSet;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        TVH075Student student = new TVH075Student();
        HashSet <TVH075Student> studentSet= new HashSet<>();
        System.out.println("Nhap so luong sinh vien muon them:");
        n=scanner.nextInt();
        //them
        student.ThemThongTin(studentSet, n);
        // for(int i=0;i<n;i++){
        //     TVH075Student std = new TVH075Student();
        //     System.out.println("Nhap sinh vien thu "+ (i+1)+":");
        //     std.NhapThongTin();
        //     studentSet.add(std);
        // }
        //hien thi
        student.HienThi(studentSet);
        student.Xoa(studentSet);
        student.TimKiem(studentSet);
        student.HienThi(studentSet);
    }
}
