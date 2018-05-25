package com.conan.dao.repository;

import com.conan.dao.entity.StudentInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentInfoRepositoty extends JpaRepository<StudentInfoEntity, Integer> {
    @Query("select t from StudentInfoEntity t where t.name = :name")
    StudentInfoEntity findByUserName(@Param("name") String name);
}
