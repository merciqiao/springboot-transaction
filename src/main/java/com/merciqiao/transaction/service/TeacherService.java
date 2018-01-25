package com.merciqiao.transaction.service;

import com.merciqiao.transaction.persistence.mysql.entity.TeacherEntity;
import com.merciqiao.transaction.persistence.mysql.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by MMM on 2018/01/25.
 */
@Service
public class TeacherService implements ITeacherService{
    @Autowired
    TeacherRepository teacherRepository;
    @Override
    public TeacherEntity add(TeacherEntity teacherEntity){
        return teacherRepository.save(teacherEntity);
    }
}
