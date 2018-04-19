package cn.liaohongdong.ssm.dao;

import cn.liaohongdong.ssm.entity.Classes;
import cn.liaohongdong.ssm.entity.Teacher;

public interface ClassesDao {
    Classes getClasses(int cid);

    Teacher getTeacher(int tid);

    Classes getClasses2(int cid);
}
