package week1_course.lesson_03;


import java.text.SimpleDateFormat;
import java.util.Date;


public class Recording extends CatalogItem{

    String performer;

    String format;

    public Recording(String code, String title, Date publishDate, String performer, String format) {
        super(code, title, publishDate);
        this.performer = performer;
        this.format = format;
    }


    public String getPerformer() {
        return performer;
    }

    public void setPerformer(String performer) {
        this.performer = performer;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return "Recording_" + getCode() + "_" + getTitle() + "_" + dateFormat.format(getPublishDate()) + "_" + getPerformer() + "_" + getFormat();
    }
}
