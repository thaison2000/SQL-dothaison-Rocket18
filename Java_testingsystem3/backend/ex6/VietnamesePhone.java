package backend.ex6;

import java.util.LinkedList;

public class VietnamesePhone extends Phone{

    
    public VietnamesePhone() {
    }

    public void insertContact(String name, String phone){
        Contact c1 = new Contact(phone, name);
        contact.add(c1);
    }

    public void removeContact(String name){
        int size = contact.size();
        for(int i= 0;i< size;i++){
            if(contact.get(i).getName()== name){
                contact.remove(i);
            }
        }
    }

    public void updateContact(String name, String newPhone){
        int size = contact.size();
        for(int i= 0;i< size;i++){
            if(contact.get(i).getName()== name){
                contact.get(i).setNumber(newPhone);
            }
        }
    }

    public void searchContact(String name){
        int size = contact.size();
        for(int i= 0;i< size;i++){
            if(contact.get(i).getName()== name){
                System.out.println("Ten:" +contact.get(i).toString());
            }
        }
    }
}
