package ex1;

interface INews{
    void Display();

    float Caculate(int a1, int a2, int a3);
}

public class News implements INews {
    private int id;
    private String tittle;
    private String PublishDate;
    private String Author;
    private String Content;
    private float AverageRate;
    
    public News(int id, String tittle, String publishDate, String author, String content) {
        this.id = id;
        this.tittle = tittle;
        PublishDate = publishDate;
        Author = author;
        Content = content;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getPublishDate() {
        return PublishDate;
    }

    public void setPublishDate(String publishDate) {
        PublishDate = publishDate;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public float getAverageRate() {
        return AverageRate;
    }

    public void Display(){
        System.out.println("tittle: "+ this.tittle);
        System.out.println("PublishDate: "+ this.PublishDate);
        System.out.println("Author: "+ this.Author);
        System.out.println("Content: "+ this.Content);
        System.out.println("AverageRate: "+ this.AverageRate);
    }

    public float Caculate(int a1, int a2, int a3){
        int Rates[] = {a1,a2,a3};
        this.AverageRate = (Rates[0]+Rates[1]+Rates[2])/3;
        return this.AverageRate;
    }

    @Override
    public String toString() {
        return "News [Author=" + Author + ", AverageRate=" + AverageRate + ", Content=" + Content + ", PublishDate="
                + PublishDate + ", id=" + id + ", tittle=" + tittle + "]";
    }
    
    
}
