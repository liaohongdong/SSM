package cn.liaohongdong.ssm.dao;

import cn.liaohongdong.ssm.BaseTest;
import cn.liaohongdong.ssm.entity.Classes;
import cn.liaohongdong.ssm.entity.Teacher;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class ClassesDaoTest extends BaseTest {

    @Autowired
    private ClassesDao classesDao;

    @Test
    public void getClasses() {
        Classes classes = classesDao.getClasses(5);
        System.out.println(classes);
    }

    @Test
    public void getTeacher() {
        Teacher teacher = classesDao.getTeacher(8);
        System.out.println(teacher);
    }

    @Test
    public void getClasses2() {
        Classes classes2 = classesDao.getClasses2(5);
        System.out.println(classes2);

    }
}
