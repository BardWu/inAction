package springInAction.aop;

import org.springframework.stereotype.Component;

/**
 * @program: inAction
 * @description:
 * @author: wh
 * @create: 2019-09-23 21:50
 */
@Component
public class MyAspectBean {

    public void doBean(){
        System.out.println("MyAspectBean doBean()");
    }

}
