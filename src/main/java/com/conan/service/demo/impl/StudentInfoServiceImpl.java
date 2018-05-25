package com.conan.service.demo.impl;

import com.conan.dao.entity.StudentInfoEntity;
import com.conan.dao.repository.StudentInfoRepositoty;
import com.conan.service.demo.IStudentInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentInfoServiceImpl implements IStudentInfoService {

    @Autowired
    private StudentInfoRepositoty studentInfoRepositoty;

    @Override
    public StudentInfoEntity getStudentByName(String name) {
        return studentInfoRepositoty.findByUserName(name);
    }
}
