package ex1;

public class Question {
    private int questionID;
    private String content;
    private int categoryID;
    private int typeID;
    private int creatorID;
    private String createTime;
   
    public Question(int questionID, String content, int categoryID, int typeID, int creatorID, String createTime) {
        this.questionID = questionID;
        this.content = content;
        this.categoryID = categoryID;
        this.typeID = typeID;
        this.creatorID = creatorID;
        this.createTime = createTime;
    }

    public int getQuestionID() {
        return questionID;
    }

    public void setQuestionID(int questionID) {
        this.questionID = questionID;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

    public int gettypeID() {
        return typeID;
    }

    public void setTypeID(int typeID) {
        this.typeID = typeID;
    }

    public int getCreatorID() {
        return creatorID;
    }

    public void setCreatorID(int creatorID) {
        this.creatorID = creatorID;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Question [categoryID=" + categoryID + ", content=" + content + ", createTime=" + createTime
                + ", creatorID=" + creatorID + ", questionID=" + questionID + ", typeID=" + typeID + "]";
    }

    
}
