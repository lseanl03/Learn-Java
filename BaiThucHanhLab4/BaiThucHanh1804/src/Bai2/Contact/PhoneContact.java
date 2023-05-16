package Bai2.Contact;

import java.net.Socket;
import java.util.Scanner;

public class PhoneContact implements Contact {
    Scanner scanner=new Scanner(System.in);
    public Contact[]contacts=new Contact[];
    public void AddContact(String name, int phone){
        System.out.print("Nhap Ten: ");
        name=scanner.nextLine();
        System.out.print("Nhap phone: ");
        phone=scanner.nextInt();
    }
    public void UpdatePhone( String name, int phone ){
        if()
        
    }
}
