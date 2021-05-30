package com.coco.ba01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author cocoLin
 * @create 2021-05-20 22:39
 */
/*不指定value 就是默认 类名的首字母小写的创建对象*/
@Component
public class Student {
    @Value("${myname}")
    private String name;
    @Value("${myage}")
    private int age;
    @Resource()
    private  School school;

    public Student() {
        System.out.println("无参构造执行了");
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Value("001")
    public void setAge(int age) {
        this.age = age;
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
