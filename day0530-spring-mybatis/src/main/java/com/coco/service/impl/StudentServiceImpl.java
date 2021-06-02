package com.coco.service.impl;

import com.coco.dao.StudentDao;
import com.coco.domain.Student;
import com.coco.service.StudentService;

import java.util.List;

/**
 * @author cocoLin
 * @create 2021-05-31 23:27
 */
public class StudentServiceImpl implements StudentService {
    private StudentDao studentDao;
    //使用set注入来赋值；
    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public int addStudent(Student student) {
        int nums = studentDao.insertStudent(student);
        return nums;
    }

    @Override
    public List<Student> queryStudent() {
        List<Student> students = studentDao.selectStudents();
        return students;

    }
}
