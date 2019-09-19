package springInAction.aop;

import org.springframework.stereotype.Component;

/**
 * @program: inAction
 * @description:
 * @author: Bardwu
 * @create: 2019-09-19 15:59
 **/
@Component
public class AopBeanInterfaceImpl implements AopBeanInterface {

    @Override
    public void performance() {
        System.out.println("i am  a AopBeanInterfaceImpl");
    }
}
