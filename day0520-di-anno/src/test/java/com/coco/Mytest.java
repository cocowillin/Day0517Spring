package com.coco;

import com.coco.ba01.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

/**
 * @author cocoLin
 * @create 2021-05-20 22:50
 */
public class Mytest {
    @Test
    public void test01(){
        String config="applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(config);
        Student student = (Student) context.getBean("student");
        System.out.println(student);
        System.out.println(new Date());

    }
}
