package com.company;

public class Main {

    public static void main(String[] args) {
	ContactManager myContactManager = new ContactManager();

	Contact sophia = new Contact();
	sophia.name = "Sophia";
	sophia.email = "kutesophy01";
	sophia.phoneNumber = "09032484389";
	myContactManager.addContact(sophia);

    Contact sophy = new Contact();
    sophy.name = "Sophy";
    sophy.email = "kutesophy";
    sophy.phoneNumber = "09032484389";
    myContactManager.addContact(sophy);

    Contact sofi = new Contact();
    sofi.name = "Sofi";
    sofi.email = "kutesophy01";
    sofi.phoneNumber = "09032484389";
    myContactManager.addContact(sofi);


    Contact result = myContactManager.searchContact("Sofi");
    System.out.println(result.phoneNumber);
    }
}
