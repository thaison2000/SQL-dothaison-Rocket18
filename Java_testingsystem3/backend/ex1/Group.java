package backend.ex1;

public class Group {
    private int GroupID;
    private String GroupName;
    private int creatorID;
    private Account A[];
    private String S[];
    private String createDate;
    
    public Group() {
    }

    public Group(int groupID, String groupName, int creatorID, Account[] a, String createDate) {
        GroupID = groupID;
        GroupName = groupName;
        this.creatorID = creatorID;
        A = a;
        this.createDate = createDate;
    }

    public Group(int groupID, String groupName, int creatorID, String[] s, String createDate) {
        GroupID = groupID;
        GroupName = groupName;
        this.creatorID = creatorID;
        S = s;
        this.createDate = createDate;
    }

    
}
