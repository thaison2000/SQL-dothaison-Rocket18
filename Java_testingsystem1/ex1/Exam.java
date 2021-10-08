package ex1;
public class Exam {
    private int examID;
    private String code;
    private String tittle;
    private int categoryID;
    private String duration;
    private int creatorID;
    private String createDate;
    
    public Exam(int examID, String code, String tittle, int categoryID, String duration, int creatorID,
            String createDate) {
        this.examID = examID;
        this.code = code;
        this.tittle = tittle;
        this.categoryID = categoryID;
        this.duration = duration;
        this.creatorID = creatorID;
        this.createDate = createDate;
    }

    public int getExamID() {
        return examID;
    }

    public void setExamID(int examID) {
        this.examID = examID;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public int getCreatorID() {
        return creatorID;
    }

    public void setCreatorID(int creatorID) {
        this.creatorID = creatorID;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "Exam [categoryID=" + categoryID + ", code=" + code + ", createDate=" + createDate + ", creatorID="
                + creatorID + ", duration=" + duration + ", examID=" + examID + ", tittle=" + tittle + "]";
    }

    
}
