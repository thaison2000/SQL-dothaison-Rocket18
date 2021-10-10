package backend.ex6;

public class Contact {
    private String Number;
    private String Name;

    
    
    public Contact() {
    }

    public Contact(String number, String name) {
        Number = number;
        Name = name;
    }

    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        Number = number;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public String toString() {
        return "Contact [Name=" + Name + ", Number=" + Number + "]";
    }

    
}
