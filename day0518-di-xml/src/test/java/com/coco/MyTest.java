package com.coco;

import com.coco.ba01.Student;
import com.coco.service.Someservice;
import com.coco.service.impl.SomeserviceImpl;
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
        String config = "ba01/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        Student myStudent = (Student) ac.getBean("myStudent");
        System.out.println(myStudent);
        Date myDate= (Date) ac.getBean("myDate");
        System.out.println(myDate);

    }

}
