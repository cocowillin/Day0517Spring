package com.coco;

import com.coco.dao.StudentDao;
import com.coco.domain.Student;
import com.coco.service.StudentService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author cocoLin
 * @create 2021-06-01 20:51
 */
public class MyTest {
    @Test
    public void test01(){
        String config="applicationContext.xml";
        ApplicationContext context=new ClassPathXmlApplicationContext(config);
        String[] names = context.getBeanDefinitionNames();
        for (String name:names){
            System.out.println("容器中对象名称"+name+"****"+context.getBean(name));
        }

    }
    @Test
    public void testDaoInsert(){
        String config="applicationContext.xml";
        ApplicationContext context=new ClassPathXmlApplicationContext(config);
        StudentDao dao= (StudentDao) context.getBean("studentDao");
        Student student=new Student();
        student.setId(1002);
        student.setName("张丽萍");
        student.setEmail("zhangliping@163.com");
        student.setAge(23);
        int nums = dao.insertStudent(student);
        System.out.println("添加的条数nums="+nums);


    }
    //service调用dao
    @Test
    public void testServiceInsert(){
        String config="applicationContext.xml";
        ApplicationContext context=new ClassPathXmlApplicationContext(config);
        StudentService dao= (StudentService) context.getBean("studentService");
        Student student=new Student();
        student.setId(1003);
        student.setName("小次郎");
        student.setEmail("xiaocilang@163.com");
        student.setAge(13);
        int nums = dao.addStudent(student);

        System.out.println("添加的条数nums="+nums);


    }
    @Test
    public void testServiceSelect(){
        String config="applicationContext.xml";
        ApplicationContext context=new ClassPathXmlApplicationContext(config);
        StudentService dao= (StudentService) context.getBean("studentService");
        List<Student> students = dao.queryStudent();
        for (Student stu:students){
            System.out.println("学生+"+stu);
        }
    }

}
