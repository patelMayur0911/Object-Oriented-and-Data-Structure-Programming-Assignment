package AdressBookSystem;

import javax.swing.*;
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
    }
    public void displayAddedContact(){
        if (items.isEmpty()){
            System.out.println("Address Book is Empty");
        }else{
            System.out.println("Hear is the Personal Details : \n");
            for ( int i =0; i < items.size();i++){
                System.out.println("Contact Details are :" + i+1);
                System.out.println(items.get(i));
            }
        }
    }

    public void editFirstName(String input, String output){
        for ( PersonalDetails contact : items){
            if (contact.getFirstName().toLowerCase().equals(input.toLowerCase())){
                contact.setFirstName(output);
            }
        }
    }

    public void deleteContact(int index){
        items.remove(index);
    }

    public static void main(String[] args) {
        Scanner sysInput= new Scanner(System.in);
        System.out.println("Welcome to AddressBook Program");
        PersonalDetails p = new PersonalDetails("Dev","Patel","Olpad","Surat","Gujrat","123","00123456789","patelmayuraaa@gmail.com",1);
        PersonalDetails p1 = new PersonalDetails("Jenish","Tata"," "," "," ","098","09110911091","patelmayuraaa@gmail.com2",2);
        AdressBook B =new AdressBook();
        B.addNewContact(p);
        B.addNewContact(p1);
        B.displayAddedContact();

        System.out.println("Enter First Name to edit : ");
        String inputString = sysInput.next();
        System.out.println("Enter Name :");
        String editString = sysInput.next();

        B.editFirstName(inputString,editString);
        System.out.println(B);
        B.displayAddedContact();

        System.out.println("Enter index Number to delete");
        int toDelete = sysInput.nextInt();

        B.deleteContact(toDelete-1);
        B.displayAddedContact();
    }

}

