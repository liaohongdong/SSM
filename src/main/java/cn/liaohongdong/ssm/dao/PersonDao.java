package cn.liaohongdong.ssm.dao;

import cn.liaohongdong.ssm.entity.Person;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PersonDao {
    Person selectPersonById(int pid, String name);

    Person selectPersonByIdAnnotation(@Param("pid") int pid, @Param("name") String name);

    List<Person> getAllPerson();

    int updatePersonById(Person person);

    int addPerson(Person person);

    int deletePersonById(int id);
}
