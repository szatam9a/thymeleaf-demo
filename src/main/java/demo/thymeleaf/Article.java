package demo.thymeleaf;



import java.time.LocalDateTime;

public class Article {
    private String title;
    private LocalDateTime postedOn;
    private String content;
    private String sentBy;


    public Article(String title, LocalDateTime postedOn, String content, String sentBy) {
        this.title = title;
        this.postedOn = postedOn;
        this.content = content;
        this.sentBy = sentBy;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDateTime getPostedOn() {
        return postedOn;
    }

    public void setPostedOn(LocalDateTime postedOn) {
        this.postedOn = postedOn;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSentBy() {
        return sentBy;
    }

    public void setSentBy(String sentBy) {
        this.sentBy = sentBy;
    }
}
