package com.merciqiao.transaction.service;

import com.merciqiao.transaction.persistence.mysql.entity.TeacherEntity;

/**
 * Created by MMM on 2018/01/25.
 */
public interface ITeacherService {
    TeacherEntity add(TeacherEntity teacherEntity);
}
