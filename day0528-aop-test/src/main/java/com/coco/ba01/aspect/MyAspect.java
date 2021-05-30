package com.coco.ba01.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

import java.util.Date;

/**
 * @author cocoLin
 * @create 2021-05-28 22:47
 * 表示当前类 是切面类;
 */
@Aspect
public class MyAspect {
    @Before(value = "execution(* do111*(..))")
    public void myBefore(JoinPoint jp){
        System.out.println("前置通知,切面方法功能，在目标方法执行之前输出时间"+new Date());
        System.out.println("获取方法的定义，签名===="+jp.getSignature());
        System.out.println("方法的名称===="+jp.getSignature().getName());
        Object[] args = jp.getArgs();
        for (Object arg:args){
            System.out.println(arg);
        }
    }
    @AfterReturning(value = "execution(* *..service.impl.SomeServiceImpl.do111*(..))",returning = "res")
    public void myBefore1(Object res){

        System.out.println("后置通知1,切面方法功能，在目标方法执行之前输出时间"+new Date());
        System.out.println(res);
        res="111";
        System.out.println(res);
    }
    @Around(value = "execution(* do1122*(..))")
    public  Object myAround(ProceedingJoinPoint pjp) throws Throwable {
        Object result=null;
        String name="";
        Object[] args = pjp.getArgs();
        if(args!=null&&args.length>=1){
            name= (String) args[0];
        }

        //执行目标方法
        System.out.println("前置通知1222");
        if ("zhangsan".equals(name)){
            result=pjp.proceed();
        }

        System.out.println("后置通知后置111");
        if (result!=null){
            result="hello, aspectj,aop";
        }

        return result;
    }
    @AfterThrowing(value = "execution(* doSec*(..))",throwing = "ex")
    public void myAfterThrowing(Exception ex){
        System.out.println("方法发生异常时，来执行"+ex.getMessage());

    }
}
