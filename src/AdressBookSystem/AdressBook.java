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

            for ( int i =0; i <= items.size();i++){
                System.out.println("Contact Details are :" + i+1);
                System.out.println(items.get(i));
            }
            }
        }

    public void deletePerson(String FirstNameToDelete){
        while ()
    }
    public static void main(String[] args) {
        System.out.println("Welcome to AddressBook Program");
        PersonalDetails p = new PersonalDetails("Mayur","Patel","Olpad","Surat","Gujrat","123","00123456789","patelmayuraaa@gmail.com");
        PersonalDetails p1 = new PersonalDetails("Patel","Mayur"," "," "," ","098","09110911091","patelmayuraaa@gmail.com2");
        AdressBook B =new AdressBook();
        B.addNewContact(p);
        B.addNewContact(p1);
        B.displayAddedContact();
//        B.deletePerson("Patel");
    }
}
