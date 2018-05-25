package com.conan.dao.repository;

import com.conan.dao.entity.StudentInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentInfoRepositoty extends JpaRepository<StudentInfoEntity, Integer> {
    StudentInfoEntity findByName(String name);
}
