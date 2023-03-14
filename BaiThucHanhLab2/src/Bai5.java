import java.util.Scanner;
/*Bài 5: (while)
Viết chương trình nhập vào các số nguyên và tính tổng các số đó, 
nếu tổng lớn hơn > 100 thì kết thúc vòng lặp và hiển thị thông báo tổng của các số đã nhập.
 */
public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);      
        int n;
        int total=0;
        System.out.println("Nhap cac so de tong >100:");
        do{  
            n=scanner.nextInt();   
            total+=n;
        }while(total<100);
        System.out.printf("Tong cac so vua nhap la: %d",total);

    }
}
