package cn.liaohongdong.ssm.service;

import cn.liaohongdong.ssm.BaseTest;
import cn.liaohongdong.ssm.dto.AppointExecution;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class BookServiceImplTest extends BaseTest {
    @Autowired
    private BookService bookService;

    @Test
    public void testAppoint() {
        long bookId = 1001;
        long studentId = 12345678910L;
        AppointExecution appoint = bookService.appoint(bookId, studentId);
        System.out.println(appoint);
    }
}
