package com.merciqiao.transaction.service;

import com.merciqiao.transaction.persistence.mysql.entity.StudentEntity;
import com.merciqiao.transaction.persistence.mysql.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by MMM on 2018/01/25.
 */
@Service
public class StudentService implements IStudentService{
    @Autowired
    StudentRepository studentRepository;
    @Override
    public StudentEntity add(StudentEntity studentEntity){
        return studentRepository.save(studentEntity);
    }
}
