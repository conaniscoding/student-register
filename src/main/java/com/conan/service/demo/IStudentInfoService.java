package com.conan.service.demo;

import com.conan.DAO.entity.StudentInfoEntity;

public interface IStudentInfoService {
    public StudentInfoEntity getStudentByName(String name);
}
