package com.merciqiao.transaction.service;

import com.merciqiao.transaction.persistence.mysql.entity.StudentEntity;

/**
 * Created by MMM on 2018/01/25.
 */
public interface IStudentService {
    StudentEntity add(StudentEntity studentEntity);
}
