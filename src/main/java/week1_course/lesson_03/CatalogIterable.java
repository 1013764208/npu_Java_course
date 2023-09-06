package week1_course.lesson_03;


import java.util.Iterator;

public interface CatalogIterable<CatalogItem> extends Iterable<CatalogItem> {

    // 这是Iterable接口要求的方法，返回一个迭代器
    @Override
    Iterator<CatalogItem> iterator();
}
