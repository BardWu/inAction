package springInAction.aop;

import org.springframework.stereotype.Component;

/**
 * @program: inAction
 * @description:
 * @author: Bardwu
 * @create: 2019-09-19 17:43
 **/
@Component
public class AImpl implements A {

    @Override
    public void a() {
        System.out.println(" a ");
    }
}
