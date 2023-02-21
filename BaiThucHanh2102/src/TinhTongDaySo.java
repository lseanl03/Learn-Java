import java.util.Scanner;
public class TinhTongDaySo {
    public static void main(String[] args) throws Exception {
        int a,soDu,sum=0;
        Scanner sc = new Scanner(System.in);
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
