package week1_course.lesson_03;


import java.util.Date;


abstract class CatalogItem {

    private String code;
    private String title;
    private Date publishDate;

    public CatalogItem(String code, String title, Date publishDate) {
        this.code = code;
        this.title = title;
        this.publishDate = publishDate;
    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    @Override
    public String toString() {
        return "CatalogItem{" +
                "code='" + code + '\'' +
                ", title='" + title + '\'' +
                ", publishDate=" + publishDate +
                '}';
    }
}
