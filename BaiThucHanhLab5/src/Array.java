import java.util.Scanner;

public class Array {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        try{
            try{
                System.out.println("Nhap so luong phan tu trong mang: ");
                int n = scanner.nextInt();
                int a[] = new int [n];
                for(int i=0;i<n;i++){
                    System.out.print("Nhap phan tu thu "+ (i+1)+": ");
                    a[i]= scanner.nextInt();
                }
                for(int i=0;i<a.length;i++){
                    System.out.print("Phan tu thu "+ (i+1) +" la : "+ a[i]);
                    System.out.println();
                }
            }
            catch(Exception ex){
                System.out.println("So luong khong dung dinh dang");
            }
        }
        finally{
            System.out.println("End Code");                
        }
    }
}
