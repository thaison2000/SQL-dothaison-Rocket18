import java.sql.Date;


public class Account {
    private int AccountID;
    private String fullName;
    private String userName;
    private Date createTime;
    private Position position;
    private Department department;
    
    public Account(int accountID, String fullName, String userName, Date createTime, Position position,
            Department department) {
        AccountID = accountID;
        this.fullName = fullName;
        this.userName = userName;
        this.createTime = createTime;
        this.position = position;
        this.department = department;
    }

    public int getAccountID() {
        return AccountID;
    }

    public void setAccountID(int accountID) {
        AccountID = accountID;
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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    
}
