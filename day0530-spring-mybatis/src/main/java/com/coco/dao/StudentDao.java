package com.coco.dao;

import com.coco.domain.Student;

import java.util.List;

/**
 * @author cocoLin
 * @create 2021-05-31 22:03
 */
public interface StudentDao {
    int insertStudent(Student student);
    List<Student> selectStudents();
}
