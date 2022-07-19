package cn.stopyc.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @program: spring_01_quickstart
 * @description:
 * @author: stop.yc
 * @create: 2022-07-18 19:56
 **/
@Component
@Aspect
public class MyAdvice {

    @Pointcut("execution(* cn.stopyc.service.*Service.*(..))")
    private  void pt(){

    }
//    @Before("pt()")
//    public void method(){
//        System.out.println(System.currentTimeMillis());
//    }


    @Around("pt()")
    public Object calEffect (ProceedingJoinPoint pjp) throws Throwable {

        Signature signature = pjp.getSignature();
        String declaringTypeName = signature.getDeclaringTypeName();
        String name = signature.getName();


        long begin = System.currentTimeMillis();

        Object ret = null;
        for (int i = 0; i < 1; i++) {
             ret = pjp.proceed();
        }

        long end = System.currentTimeMillis() - begin;

//        System.out.println(declaringTypeName + name + "     "+end);

        return ret;
    }
}
