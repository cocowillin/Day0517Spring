package com.coco.service;

import com.coco.domain.Student;

import java.util.List;

/**
 * @author cocoLin
 * @create 2021-05-31 23:26
 */
public interface StudentService {
    int addStudent (Student student);
    List<Student> queryStudent();
}
