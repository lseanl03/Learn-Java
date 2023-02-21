import java.util.Scanner;
public class TongDaySo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        int a,soDu,sum=0;         
        System.out.println("Nhap mot so nguyen:");    
        a=sc.nextInt();  
        while(a>0){
            soDu=a%10;
            a=a/10;
            sum+=soDu;
        }
        System.out.println(sum);
    }
}
