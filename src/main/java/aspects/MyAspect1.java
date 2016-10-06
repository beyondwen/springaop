package aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * Created by lenovo on 2016/10/05.
 */

public class MyAspect1 {
    //前置通知
    public void before() {
        System.out.println("前置增强");
    }


}
