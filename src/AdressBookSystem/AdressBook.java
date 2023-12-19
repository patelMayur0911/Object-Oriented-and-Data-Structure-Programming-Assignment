package AdressBookSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AdressBook {
    private List<PersonalDetails> items;
    public AdressBook(){
        this.items = new ArrayList<>();
    }
    public void addNewContact( PersonalDetails PDItems){
        items.add(PDItems);
//        System.out.println(PersonalDetails); // AdressBookSystem.PersonalDetails@5f184fc6
    }
    public void displayAddedContact(){
        if (items.isEmpty()){
            System.out.println("Address Book is Empty");
        }else{
            System.out.println("Hear is the Personal Details : ");
            for (PersonalDetails item : items) {
//                System.out.println(items.getFirst().getFirstName()+" "+items.getFirst().getLastName());
                System.out.println(items.getFirst().getFirstName()+" -- "+
                                items.getFirst().getLastName()+" -- "+
                                items.getFirst().getAddress()+" -- "+
                                items.getFirst().getCity()+" -- "+
                                items.getFirst().getState()+" -- "+
                                items.getFirst().getZipCode()+" -- "+
                                items.getFirst().getPhoneNumber()+" -- "+
                                items.getFirst().getEmail()
                );
            }
        }
    }
    public void deletePerson(String FirstNameToDelete){
        int n = items.removeIf(items.getFirst().getFirstName().equals(FirstNameToDelete));
    }
    public static void main(String[] args) {
        System.out.println("Welcome to AddressBook Program");
        PersonalDetails p = new PersonalDetails("Mayur","Patel","Olpad","Surat","Gujrat","123","00123456789","patelmayuraaa@gmail.com");
        PersonalDetails p1 = new PersonalDetails("Patel","Mayur"," "," "," ","098","09110911091","patelmayuraaa@gmail.com2");
        AdressBook B =new AdressBook();
        B.addNewContact(p);
        B.addNewContact(p1);
        B.displayAddedContact();
        B.deletePerson("Patel");
    }
}
