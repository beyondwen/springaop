package aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * Created by lenovo on 2016/10/05.
 */
@Aspect
public class MyAspect1 {
    //前置通知
    @Before("execution(* dao.UserDao.add(..))")
    public void before() {
        System.out.println("前置增强");
    }

    @AfterReturning(value = "execution(* dao.UserDao.delete(..))", returning = "returnvalue")
    public void afterReturning(Object returnvalue) {
        System.out.println("后置通知" + "返回参数" + returnvalue);
    }

    @Around(value = "execution(* dao.UserDao.update(..))")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕前置通知");
        Object o = proceedingJoinPoint.proceed();
        System.out.println("环绕后置通知");
    }

    @AfterThrowing(value = "execution(* dao.UserDao.get(..))", throwing = "e")
    public void afterThrowing(Throwable e) {
        System.out.println("抛出异常了");
    }

    @After("myPointCut()")
    public void after() {
        System.out.println("最终通知");
    }

    @Pointcut("execution(* dao.UserDao.*(..))")
    public void myPointCut() {

    }
}
