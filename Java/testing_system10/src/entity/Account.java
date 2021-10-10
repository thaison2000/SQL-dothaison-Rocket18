package entity;

public class Account {
    private int accountID;
    private String fullName;
    private String userName;
    private String createDate;
    private int departmentID;
    private int positionID;

    
    public Account(int accountID, String fullName, String userName, String createDate, int departmentID,
            int positionID) {
        this.accountID = accountID;
        this.fullName = fullName;
        this.userName = userName;
        this.createDate = createDate;
        this.departmentID = departmentID;
        this.positionID = positionID;
    }
    
    public int getAccountID() {
        return accountID;
    }
    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getCreateDate() {
        return createDate;
    }
    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }
    public int getDepartmentID() {
        return departmentID;
    }
    public void setDepartmentID(int departmentID) {
        this.departmentID = departmentID;
    }
    public int getPositionID() {
        return positionID;
    }
    public void setPositionID(int positionID) {
        this.positionID = positionID;
    }

    @Override
    public String toString() {
        return "Account [accountID=" + accountID + ", createDate=" + createDate + ", departmentID=" + departmentID
                + ", fullName=" + fullName + ", positionID=" + positionID + ", userName=" + userName + "]";
    }
    
    
}