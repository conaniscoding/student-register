package com.conan.controller.student;

import com.conan.dao.entity.StudentInfoEntity;
import com.conan.service.demo.IStudentInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/stu")
public class StudentController {

    @Autowired
    private IStudentInfoService iStudentInfoService;

    @RequestMapping("/index")
    public String index(){
        return "student/student_detail";
    }

    @ResponseBody
    @RequestMapping("/detail")
    public String getStudentByName(@RequestParam(value = "name")String name){
        StudentInfoEntity studentInfoEntity = iStudentInfoService.getStudentByName(name);
        if(null == studentInfoEntity){
            return null;
        }else{
            System.out.print(studentInfoEntity.toString());
            return studentInfoEntity.toString();
        }
    }
}
