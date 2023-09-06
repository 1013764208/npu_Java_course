package week1_course.lesson_03;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LibrarySystem {


    Catalog catalog;

    public LibrarySystem() {
        catalog = new Catalog();
    }

    public void loadCatalogFromFile(String fileName) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("_");
                if (parts.length >= 5) {
                    String type = parts[0];
                    String code = parts[1];
                    String title = parts[2];
                    Date publishDate = dateFormat.parse(parts[3]);

                    if (type.equals("Book")) {
                        String author = parts[4];
                        int numberOfPages = Integer.parseInt(parts[5]);
                        Book book = new Book(code, title, publishDate, author, numberOfPages);
                        catalog.addItem(book);
                    } else if (type.equals("Recording")) {
                        String performer = parts[4];
                        String format = parts[5];
                        Recording recording = new Recording(code, title, publishDate, performer, format);
                        catalog.addItem(recording);
                    }
                }
            }

            reader.close();
            System.out.println("Catalog loaded from file: " + fileName);
        } catch (IOException | ParseException e) {
            System.err.println("Error loading catalog from file: " + e.getMessage());
        }
    }

    public void saveCatalogToFile(String fileName) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

            for (CatalogItem item : catalog) {
                String type = item instanceof Book ? "Book" : "Recording";
                writer.write(type + "_");
                writer.write(item.getCode() + "_");
                writer.write(item.getTitle() + "_");
                writer.write(dateFormat.format(item.getPublishDate()) + "_");

                if (item instanceof Book) {
                    Book book = (Book) item;
                    writer.write(book.getAuthor() + "_");
                    writer.write(book.getNumberOfPages() + "\n");
                } else if (item instanceof Recording) {
                    Recording recording = (Recording) item;
                    writer.write(recording.getPerformer() + "_");
                    writer.write(recording.getFormat() + "\n");
                }
            }

            writer.close();
            System.out.println("Catalog saved to file: " + fileName);
        } catch (IOException e) {
            System.err.println("Error saving catalog to file: " + e.getMessage());
        }
    }


    public void displayCatalogItems() {
        for (CatalogItem item : catalog) {
            System.out.println(item.toString());
        }
    }

    public void addBookRecord(Book book) {
        catalog.addItem(book);
    }

    public void deleteBookRecord(String codeOrTitle) {
        List<CatalogItem> itemsToRemove = new ArrayList<>();

        for (CatalogItem item : catalog) {
            if (item.getCode().equals(codeOrTitle) || item.getTitle().equals(codeOrTitle)) {
                itemsToRemove.add(item);
            }
        }

        for (CatalogItem item : itemsToRemove) {
            catalog.removeItem(item);
        }

        if (itemsToRemove.isEmpty()) {
            System.out.println("No items found with the code or title: " + codeOrTitle);
        } else {
            System.out.println("Deleted " + itemsToRemove.size() + " items with the code or title: " + codeOrTitle);
        }
    }

    public static void main(String[] args) {
        LibrarySystem librarySystem = new LibrarySystem();

        // 加载图书馆目录数据
        librarySystem.loadCatalogFromFile("catalog.dat");

        // 显示所有目录项
        System.out.println("All Catalog Items:");
        librarySystem.displayCatalogItems();

        // 添加一本书
        Book newBook = new Book("C001", "Add Book1", new Date(), "zhang bo", 50);
        librarySystem.addBookRecord(newBook);

        System.out.println("All Catalog Items:");
        librarySystem.displayCatalogItems();


        // 删除一本书或记录
        librarySystem.deleteBookRecord("B002");

        // 保存图书馆目录数据
        librarySystem.saveCatalogToFile("catalog.dat");
    }
}
