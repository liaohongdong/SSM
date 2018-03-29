package cn.liaohongdong.ssm.dao;

import cn.liaohongdong.ssm.BaseTest;
import cn.liaohongdong.ssm.entity.Book;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BookDaoTest extends BaseTest {
    @Autowired
    private BookDao bookDao;

    @Test
    public void testQueryById() {
        long bookId = 1000;
        Book book = bookDao.queryById(bookId);
        System.out.println(book);
    }

    @Test
    public void testQueryAll() {
        List<Book> books = bookDao.queryAll(0, 4);
        for (Book b : books) {
            System.out.println(b);
        }
    }

    @Test
    public void testReduceNumber(){
        long boodId = 1000;
        int i = bookDao.reduceNumber(boodId);
        System.out.println(i);
    }
}
