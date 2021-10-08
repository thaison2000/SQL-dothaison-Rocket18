package entity;

public class Group {
    private int groupID;
    private String groupName;
    private String createTime;
    private int creatorID;
    
    public Group(int groupID, String groupName, String createTime, int creatorID) {
        this.groupID = groupID;
        this.groupName = groupName;
        this.createTime = createTime;
        this.creatorID = creatorID;
    }

    public int getGroupID() {
        return groupID;
    }

    public void setGroupID(int groupID) {
        this.groupID = groupID;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public int getCreatorID() {
        return creatorID;
    }

    public void setCreatorID(int creatorID) {
        this.creatorID = creatorID;
    }

    @Override
    public String toString() {
        return "Group [createTime=" + createTime + ", creatorID=" + creatorID + ", groupID=" + groupID + ", groupName="
                + groupName + "]";
    }
}
