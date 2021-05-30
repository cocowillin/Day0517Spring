package com.coco.ba02;

import com.coco.ba02.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

/**
 * @author cocoLin
 * @create 2021-05-17 3:20
 */
public class MyTest {

    @Test
    public void test01(){
        String config = "ba02/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        Student myStudent = (Student) ac.getBean("myStudent");
        System.out.println(myStudent);


    }

}
