package com.coco.ba01.service.impl;

import com.coco.ba01.service.SomeService;

/**
 * @author cocoLin
 * @create 2021-05-28 22:18
 */

public class SomeServiceImpl implements SomeService {




    @Override
    public void doSome(String name, Integer age) {
    //输出方法的执行时间
        System.out.println("执行目标方法doSome方法11");
    }

    @Override
    public String doOther() {
        System.out.println("执行doOther方法"
        );
        return "abcd111";

    }

    @Override
    public String doFirst(String name) {
        System.out.println("执行了doFirst方法了");
        return "doFirst";
    }

    @Override
    public void doSecond() {
        System.out.println("执行second方法"+(10/0));
    }


}
