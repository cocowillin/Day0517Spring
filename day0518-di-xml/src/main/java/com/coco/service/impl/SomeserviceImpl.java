package com.coco.service.impl;

import com.coco.service.Someservice;

/**
 * @author cocoLin
 * @create 2021-05-17 3:18
 */
public class SomeserviceImpl implements Someservice {
    public SomeserviceImpl() {
        System.out.println("SomeserviceImpl的无参数构造方法执行了");
    }

    @Override
    public void doSome() {
        System.out.println("执行了someservice的doSome方法！");


    }
}
