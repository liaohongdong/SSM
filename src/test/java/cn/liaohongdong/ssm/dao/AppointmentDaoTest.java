package cn.liaohongdong.ssm.dao;

import cn.liaohongdong.ssm.BaseTest;
import cn.liaohongdong.ssm.entity.Appointment;
import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class AppointmentDaoTest extends BaseTest {
    @Autowired
    private AppointmentDao appointmentDao;

    @Test
    public void insertAppointment() {
        long bookId = 1001;
        long studentId = 12345678910L;
        int i = appointmentDao.insertAppointment(bookId, studentId);
        System.out.println(i);
    }

    @Test
    public void testQueryByWIthBook() {
        long bookId = 1001;
        long studentId = 12345678910L;
        Appointment appointment = appointmentDao.queryByKeyWithBook(bookId, studentId);
        System.out.println(appointment);
        System.out.println(appointment.getBook());
        System.out.println(JSON.toJSONString(appointment));
    }
}
