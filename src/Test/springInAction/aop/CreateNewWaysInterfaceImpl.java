package springInAction.aop;

import org.springframework.stereotype.Component;

/**
 * @program: inAction
 * @description:
 * @author: Bardwu
 * @create: 2019-09-19 16:15
 **/
@Component
public class CreateNewWaysInterfaceImpl implements CreateNewWaysInterface{


    @Override
    public void beforeAop() {

        System.out.println("i am a newWays");
    }
}
