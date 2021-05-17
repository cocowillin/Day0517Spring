package com.coco;

import com.coco.service.Someservice;
import com.coco.service.impl.SomeserviceImpl;
import org.junit.Test;

/**
 * @author cocoLin
 * @create 2021-05-17 3:20
 */
public class MyTest {
    @Test/*主动方式创建对象和调用方法*/
    public void test01(){
        Someservice someservice = new SomeserviceImpl();
        someservice.doSome();

    }
    @Test
    public void test02(){

    }
}
