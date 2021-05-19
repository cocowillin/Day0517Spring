package com.coco.ba02;

/**
 * @author cocoLin
 * @create 2021-05-18 22:21
 */
public class Student {
    private String name;
    private  int age;
    private School school;

    public void setName(String name) {
        this.name = name.toUpperCase();
    }

    public void setAge(int age) {
        System.out.println("set age方法执行了！！！");
        this.age = age;

    }

    public void setSchool(School school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }
}
