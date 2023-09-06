package week1_course.lesson_03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Catalog implements Iterable<CatalogItem> {

    List<CatalogItem> catalogItems;

    public Catalog() {
        catalogItems = new ArrayList<>();
    }

    public void addItem(CatalogItem item) {
        catalogItems.add(item);
    }

    public void removeItem(CatalogItem item) {
        catalogItems.remove(item);
    }


    public CatalogItem getItem(String code) {
        for (CatalogItem item : catalogItems) {
            if (item.getCode().equals(code)) {
                return item;
            }
        }
        return null; // 如果未找到匹配项，返回null
    }

    public int getNumberOfItems() {
        return catalogItems.size();
    }

    public void displayCatalogItems() {
        for (CatalogItem item : catalogItems) {
            System.out.println(item);
        }
    }

    @Override
    public Iterator<CatalogItem> iterator() {
        return catalogItems.iterator();
    }
}

