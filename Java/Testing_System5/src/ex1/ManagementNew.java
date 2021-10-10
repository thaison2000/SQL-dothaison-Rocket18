package ex1;

import java.util.ArrayList;
import java.util.List;
public class ManagementNew {

    List<News> news;

    public ManagementNew() {
        this.news = new ArrayList<>();
    }
    
    public void addNew(News n){
        this.news.add(n);
    }

    public void showInfor(){
        this.news.forEach(news -> System.out.println(news.toString()));
    }
}
