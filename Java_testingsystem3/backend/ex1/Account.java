package backend.ex1;

public class Account {
    private int accountID;
    private String firstName;
    private String lastName;
    private String fullName;
    private String userName;
    private String email;
    private String createDate;
    private int departmentID;
    private int positionID;
    
    public Account() {
    }

    public Account(int accountID, String firstName, String lastName, String userName, String email) {
        this.accountID = accountID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.email = email;
        this.fullName = firstName + lastName;
    }

    public Account(int accountID, String firstName, String lastName, String userName, String email, int positionID) {
        this.accountID = accountID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.email = email;
        this.positionID = positionID;
        this.fullName = firstName + lastName;
        this.createDate = "now";
    }

    public Account(int accountID, String firstName, String lastName, String userName, String email, String createDate,
            int positionID) {
        this.accountID = accountID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.email = email;
        this.createDate = createDate;
        this.positionID = positionID;
    }

    
}
