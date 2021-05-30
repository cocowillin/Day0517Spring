package com.coco;

import com.coco.ba04.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author cocoLin
 * @create 2021-05-17 3:20
 */
public class MyTest04 {

    @Test
    public void test01(){
        String config = "ba04/spring-total.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        Student myStudent = (Student) ac.getBean("myStudent");
        System.out.println(myStudent);


    }

}
