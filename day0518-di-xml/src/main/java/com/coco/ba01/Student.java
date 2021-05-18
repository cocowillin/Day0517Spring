package com.coco.ba01;

/**
 * @author cocoLin
 * @create 2021-05-18 22:21
 */
public class Student {
    private String name;
    private  int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
