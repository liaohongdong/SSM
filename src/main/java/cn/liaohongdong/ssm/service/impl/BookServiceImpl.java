package cn.liaohongdong.ssm.service.impl;

import cn.liaohongdong.ssm.dao.AppointmentDao;
import cn.liaohongdong.ssm.dao.BookDao;
import cn.liaohongdong.ssm.dto.AppointExecution;
import cn.liaohongdong.ssm.entity.Appointment;
import cn.liaohongdong.ssm.entity.Book;
import cn.liaohongdong.ssm.enums.AppointStateEnum;
import cn.liaohongdong.ssm.exception.AppointException;
import cn.liaohongdong.ssm.exception.NoNumberException;
import cn.liaohongdong.ssm.exception.RepeatAppointException;
import cn.liaohongdong.ssm.service.BookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private BookDao bookDao;

    @Autowired
    private AppointmentDao appointmentDao;

    public Book getById(long bookId) {
        return bookDao.queryById(bookId);
    }

    public List<Book> getList() {
        return bookDao.queryAll(0, 1000);
    }

    @Transactional
    /**
     * 使用注解控制事务方法的优点： 1.开发团队达成一致约定，明确标注事务方法的编程风格
     * 2.保证事务方法的执行时间尽可能短，不要穿插其他网络操作，RPC/HTTP请求或者剥离到事务方法外部
     * 3.不是所有的方法都需要事务，如只有一条修改操作，只读操作不需要事务控制
     */
    public AppointExecution appoint(long bookId, long studentId) {
        try {
            // 减库存
            int update = bookDao.reduceNumber(bookId);
            if (update <= 0) {// 库存不足
                throw new NoNumberException("no number");
            } else {
                // 执行预约操作
                int insert = appointmentDao.insertAppointment(bookId, studentId);
                if (insert <= 0) {// 重复预约
                    throw new RepeatAppointException("repeat appoint");
                } else { // 预约成功
                    Appointment appointment = appointmentDao.queryByKeyWithBook(bookId, studentId);
                    return new AppointExecution(bookId, AppointStateEnum.SUCCESS, appointment);
                }
            }
        } catch (NoNumberException e1) {
            logger.error(e1.getMessage(), e1);
            throw e1;
        } catch (RepeatAppointException e2) {
            logger.error(e2.getMessage(), e2);
            throw e2;
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            throw new AppointException("appoint inner error: " + e.getMessage());
        }
    }
}
