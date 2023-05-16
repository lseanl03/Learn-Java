import java.util.Scanner;
/*Bài 10 (string)
Viết chương trình nhập từ bàn phím một chuỗi không quá 80 ký tự và một ký tự bất kỳ. 
Đếm và in ra màn hình số lần xuất hiện của ký tự đó trong chuỗi vừa nhập.
 */
public class Bai10 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int count=0;
        System.out.println("Nhap vao mot chuoi khong qua 80 ky tu:");
        String chuoi=scanner.nextLine();
        System.out.println("Nhap ki tu can dem trong chuoi:");
        char ky_tu=scanner.nextLine().charAt(0);//đọc chuỗi nhập vào từ bàn phím và lấy kí tự đầu của chuỗi
        for(int i=0;i<chuoi.length();i++){
            char lay_ky_tu=chuoi.charAt(i);
            if(lay_ky_tu==ky_tu){
                count++;
            }
        }
        System.out.printf("So lan xuat hien ky tu %c trong '%s' la: %d",ky_tu,chuoi,count);
    }
}
