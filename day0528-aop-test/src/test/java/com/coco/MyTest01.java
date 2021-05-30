package com.coco;

import com.coco.ba01.service.SomeService;
import com.coco.ba01.service.impl.SomeServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.naming.Context;

/**
 * @author cocoLin
 * @create 2021-05-28 23:14
 */
public class MyTest01 {
    @Test
    public void test01(){
        String config="applicationContext.xml";
        ApplicationContext context=new ClassPathXmlApplicationContext(config);
        //从容器中获取目标对象；
        SomeService proxy = (SomeService) context.getBean("someService");
        System.out.println(proxy.getClass().getName());
        /*String doFirst = proxy.doFirst("zhangsan");*/
        proxy.doSecond();


    }

}
