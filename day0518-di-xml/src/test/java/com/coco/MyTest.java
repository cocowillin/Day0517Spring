package com.coco;

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
    @Test /*主动方式创建对象和调用方法*/
    public void test01(){
        Someservice someservice = new SomeserviceImpl();
        someservice.doSome();
    }
    @Test
    public void test02(){
        String config="beans.xml";
        ApplicationContext ac=new ClassPathXmlApplicationContext(config);
        /*Someservice someService = (Someservice) ac.getBean("someService");
        Someservice someService1 = (Someservice) ac.getBean("someService1");
        someService.doSome();
        someService1.doSome();
*/
        /*验证 读取配置文件时候就创建了对象 无参数构造方法执行了*/

        int nums = ac.getBeanDefinitionCount();
        //获取容器中定义对象的数量
        System.out.println("容器中定义对象的数量是   "+nums);

        //容器中定义对象的名称
        System.out.println("***********************");
        String[] names = ac.getBeanDefinitionNames();
        for(String name:names){
            System.out.println(name);
        }


    }
    @Test//创建不是自己的对象 系统的对象 已经创建好的 或者别人的对象
    public void test03(){
        String config="beans.xml";
        ApplicationContext ac=new ClassPathXmlApplicationContext(config);

        Date myDate = (Date) ac.getBean("myDate");
        System.out.println(myDate);
    }
}
