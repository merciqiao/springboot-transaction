package com.merciqiao.transaction;

import com.merciqiao.transaction.persistence.mysql.entity.StudentEntity;
import com.merciqiao.transaction.persistence.mysql.entity.TeacherEntity;
import com.merciqiao.transaction.service.StudentService;
import com.merciqiao.transaction.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

/**
 * Created by MMM on 2018/01/25.
 */
@Component
public class test {
    @Autowired
    StudentService studentService;
    @Autowired
    TeacherService teacherService;


    @PostConstruct
    @Transactional
    public void main(){
        try {
            StudentEntity studentEntity = new StudentEntity();
            studentEntity.setName("张三");
            studentEntity.setAge(18);
            studentEntity.setCity("北京");

            TeacherEntity teacherEntity = new TeacherEntity();
            teacherEntity.setName("李四1111111111");
            teacherEntity.setAge(11);
            studentService.add(studentEntity);
            teacherService.add(teacherEntity);
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
            //一定要throw异常,否则事务不起作用
            throw ex;
        }

    }
}
