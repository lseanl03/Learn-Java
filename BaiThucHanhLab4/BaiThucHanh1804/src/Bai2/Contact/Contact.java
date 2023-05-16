package Bai2.Contact;

public interface Contact {
    void AddContact(String name, int phone);

    void UpdatePhone( String name, int phone );

    void RemoveContact(String name);

    void SearchPhone(String name);

}
