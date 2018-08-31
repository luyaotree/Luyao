package com.luyao.aop.aspectj;

import android.util.Log;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;

/**
 * 描述：
 *
 * @author luyao
 * @date 2018/3/6
 */
@Aspect
public class AspectTest {

//    @Before("execution(* android.app.Activity.on**(..))")
//    public void onActivityMethodBefore(JoinPoint joinPoint) throws Throwable {
//        String key = joinPoint.getSignature().toLongString();
//        Log.e("luy", "onActivityMethodBefore : " + key);    // protected void com.luyao.aop.aspectj.AspectJActivity.onCreate(android.os.Bundle)
//    }

//    @Before("execution(* com.luyao.aop.aspectj.AspectJActivity.on*(android.os.Bundle))")
//    public void onActivityMethodBefore(JoinPoint joinPoint) throws Throwable {
//        String key = joinPoint.getSignature().toLongString();
//        Log.e("luy", "onActivityMethodBefore : " + key);    // protected void com.luyao.aop.aspectj.AspectJActivity.onCreate(android.os.Bundle)
//    }
//
//    @After("execution(* com.luyao.aop.aspectj.AspectJActivity.on**(android.os.Bundle))")
//    public void onActivityMethodAfter(JoinPoint joinPoint) throws Throwable {
//        String key = joinPoint.getSignature().toLongString();
//        Log.e("luy", "onActivityMethodAfter : " + key);    // protected void com.luyao.aop.aspectj.AspectJActivity.onCreate(android.os.Bundle)
//    }

//    @Around("execution(* com.luyao.aop.aspectj.AspectJActivity.testAOP())")
//    public void onActivityMethodAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
//        String key = proceedingJoinPoint.getSignature().toLongString();
//        Log.e("luy", "onActivityMethodAroundFirst: " + key);
//        proceedingJoinPoint.proceed();
//        Log.e("luy", "onActivityMethodAroundSecond: " + key);
//    }


    //-----------------------------------------------call--------------------------------------------------
//    @Before("call(* com.luyao.aop.aspectj.AspectJActivity.on**(android.os.Bundle))")
//    public void onActivityMethodBefore(JoinPoint joinPoint) throws Throwable {
//        String key = joinPoint.getSignature().toLongString();
//        Log.e("luy", "onActivityMethodBefore : " + key);    // protected void com.luyao.aop.aspectj.AspectJActivity.onCreate(android.os.Bundle)
//    }

    //-----------------------------------------------自定义切点--------------------------------------------------
//    @Pointcut("execution(@com.luyao.aop.aspectj.DebugTool * *(..))")
//    public void DebugToolMethod(){
//
//    }
//
//    @Before("DebugToolMethod()")
//    public void onDebugToolMethodBefore(JoinPoint joinPoint) {
//        String key = joinPoint.getSignature().toLongString();
//        Log.e("luy", "onDebugToolMethodBefore: " + key);
//    }


//    @Pointcut("withincode(* com.luyao.aop.aspectj.AspectJActivity.testAOP2(..))")
//    public void invokeAOP2() {
//
//    }
//
//    @Pointcut("call(* AspectJActivity.testAOP(..))")
//    public void invokeAOP() {
//        Log.e("luy", "invokeAOP");
//    }
//
//
//    @Pointcut("invokeAOP() && invokeAOP2()")
//    public void invokeAOPOnlyInAOP2() {
//    }

//    /**
//     * 在testAOP2()代码里面调用testAOP()之前
//     */
//    @Before("invokeAOPOnlyInAOP2()")
//    public void beforeInvokeAOPOnlyInAOP2(JoinPoint joinPoint) {
//        String key = joinPoint.getSignature().toLongString();
//        Log.e("luy", "beforeInvokeAOPOnlyInAOP2: " + key);
//    }

//    @Before("execution(* ITest.*( .. ))")
//    public void beforeInvokeITest() {
//        Log.e("luy", "beforeInvokeITest");
//    }

//    @Before("execution(* com.douyu.lib.utils.DYStrUtils.isEmpty(..))")
//    public void beforeInvokeisEmpty() {
//        Log.e("luy", "beforeInvokeisEmpty");
//    }

//    @Before("call(* com.douyu.lib.utils.DYFileUtils.createDirUnderDCIM(..))")
//    public void beforeInvokeisEmpty() {
//        Log.e("luy", "beforeInvokeisEmpty");
//    }


//    @Before("within(com.douyu.lib.utils.*)")
//    public void beforeInvokeisEmpty() {
//        Log.e("luy", "beforeInvokeisEmpty");
//    }

//    @Before("within(@com.luyao.aop.aspectj.BehavioClass *)")
//    public void beforeBehavioClass() {
//        Log.e("luy", "beforeBehavioClass");
//    }

//    @AfterReturning(pointcut = "call(* com.luyao.aop.aspectj.AspectJActivity.getHeight())", returning = "height")
//    public void getHeight(int height) {
//        Log.e("luy", "height:" + height);
//    }

//    @AfterThrowing(pointcut = "call(* *..*(..))", throwing = "throwable")
//    public void anyFuncThrows(Throwable throwable) {
//        Log.e("luy", "throwable--->" + throwable);
//    }

//    @Around("call(* com.luyao.aop.aspectj.AspectJActivity.setContentView(..))")
//    public void invokeSetContentView(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
//        Log.e("luy", "执行setContentView方法前:" + System.currentTimeMillis());
//        proceedingJoinPoint.proceed();
//        Log.e("luy", "执行setContentView方法后:" + System.currentTimeMillis());
//    }
//
//    @Before("execution(* *..Activity+.onCreate(..))")
//    public void invokeOnCreate() {
//        Log.e("luy", "invokeOnCreate---->");
//    }


    @After("execution(* AspectJActivity.testAOP(..))")
    public void invokeAOP() {
        Log.e("luy", "invokeAOP");
    }
}