package cn.liaohongdong.ssm.dao;

import cn.liaohongdong.ssm.BaseTest;
import cn.liaohongdong.ssm.entity.Person;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PersonDaoTest extends BaseTest {

    @Autowired
    private PersonDao personDao;

    @Test
    public void selectPersonById() {
        System.out.println(personDao.selectPersonById(2, "liao1"));
    }

    @Test
    public void selectPersonByIdAnnotation() {
        System.out.println(personDao.selectPersonById(3, "liao2"));
    }

    @Test
    public void getAllPerson() {
        List<Person> allPerson = personDao.getAllPerson();
        for (Person a : allPerson)
            System.out.println(a);
    }

    @Test
    public void updatePersonById() {
        Person person = new Person();
        person.setPid(1);
        person.setName("liao");
        person.setPage(0);

        int i = personDao.updatePersonById(person);
        System.out.println(i);
    }

    @Test
    public void addPerson() {
        Person person = new Person();
        person.setName("hongd");
        person.setPage(22);

        int i = personDao.addPerson(person);
        System.out.println(i);
    }

    @Test
    public void deletePersonById() {
        int i = personDao.deletePersonById(8);
        System.out.println(i);
    }

}
