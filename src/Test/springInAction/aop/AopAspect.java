package springInAction.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @program: inAction
 * @description: 编写切面
 * @author: Bardwu
 * @create: 2019-09-19 16:00
 **/
//@Aspect
//@Component
public class AopAspect {

    //@Before("execution(* springInAction.aop.*.*(..))")
    public void beforeAop(){
        System.out.println("i am a beforeAop");
    }

}
