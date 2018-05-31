package com.luyao.aop.aspectj;

import android.util.Log;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * 描述：
 *
 * @author luyao
 * @date 2018/3/6
 */
@Aspect
public class MethodAspect {

    @Pointcut("call(* com.luyao.aop.aspectj.Animal.fly(..))")
    public void callMethod(){
    }

    @Before("callMethod()")
    public void beforeMethodCall(JoinPoint joinPoint) {
        Log.e("luy", "before->" + joinPoint.getTarget().toString() + "#" + joinPoint.getSignature().getName());
    }
}
