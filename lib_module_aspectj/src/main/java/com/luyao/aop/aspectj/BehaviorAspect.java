package com.luyao.aop.aspectj;

import android.util.Log;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;

/**
 * 描述：
 *
 * @author luyao
 * @date 2018/3/5
 */
@Aspect // 此处一定要定义，否则不会该类不会参与编译
public class BehaviorAspect {

    @Pointcut("execution(@com.luyao.aop.aspectj.BehaviorTrace  * *(..))") // 定义切点
    public void annoBehavior() {
    }

    @Around("annoBehavior()") // 定义怎么切，也可以这么写 @Around("execution(@com.luyao.aop.aspectj.BehaviorTrace  * *(..))")
    public void dealPoint(ProceedingJoinPoint point) throws Throwable {
        //方法执行前
        MethodSignature methodSignature = (MethodSignature) point.getSignature();
        BehaviorTrace behaviorTrace = methodSignature.getMethod().getAnnotation(BehaviorTrace.class); // 拿到注解
        long begin = System.currentTimeMillis();
        Log.i("luy", "拿到需要切的方法啦，执行前");

        point.proceed(); // 执行被切的方法

        //方法执行完成
        long end = System.currentTimeMillis();
        Log.i("luy", behaviorTrace.value() + "(" + behaviorTrace.type() + ")" + " 耗时：" +  (end - begin) + "ms");
    }


}


