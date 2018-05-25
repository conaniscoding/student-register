package com.conan.service.demo;

import com.conan.dao.entity.StudentInfoEntity;

public interface IStudentInfoService {
    public StudentInfoEntity getStudentByName(String name);
}
