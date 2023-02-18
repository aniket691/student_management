package com.xadmin.SpringBootCrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.xadmin.SpringBootCrud.bean.Student;
import com.xadmin.SpringBootCrud.service.StudentService;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping("/student")
    public List<Student> getAllStudent() {
        return studentService.getAllStudent();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/student")
    public void addStudent(@RequestBody Student student) {
        studentService.addStudent(student);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/student/{id}")
    public void updateStudent(@PathVariable String id, @RequestBody Student student) {
        studentService.updateStudent(id, student);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/student/{id}")
    public void deleteStudent(@PathVariable String id) {
        studentService.deleteStudent(id);
    }


}
