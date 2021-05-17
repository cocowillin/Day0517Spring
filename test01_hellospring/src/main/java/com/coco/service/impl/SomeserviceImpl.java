package com.coco.service.impl;

import com.coco.service.Someservice;

/**
 * @author cocoLin
 * @create 2021-05-17 3:18
 */
public class SomeserviceImpl implements Someservice {
    @Override
    public void doSome() {
        System.out.println("执行了someservice的doSome方法！");
        System.out.println("修改 2021年5月17日22:36:40 ");

    }
}
