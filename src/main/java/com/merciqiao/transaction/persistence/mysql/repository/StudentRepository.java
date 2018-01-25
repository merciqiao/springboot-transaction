package com.merciqiao.transaction.persistence.mysql.repository;

import com.merciqiao.transaction.persistence.mysql.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by MMM on 2018/01/25.
 */
@Repository
public interface StudentRepository extends JpaRepository<StudentEntity,Long>{
}
