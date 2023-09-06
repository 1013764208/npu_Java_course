package week1_course.lesson_03;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Book extends CatalogItem{

    String author;
    int numberOfPages;


    public Book(String code, String title, Date publishDate, String author, int numberOfPages) {
        super(code, title, publishDate);
        this.author = author;
        this.numberOfPages = numberOfPages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return "Book_" + getCode() + "_" + getTitle() + "_" + dateFormat.format(getPublishDate()) + "_" + getAuthor() + "_" + getNumberOfPages();
    }
}
