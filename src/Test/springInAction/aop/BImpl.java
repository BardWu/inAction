package springInAction.aop;

import org.springframework.stereotype.Component;

/**
 * @program: inAction
 * @description:
 * @author: Bardwu
 * @create: 2019-09-19 17:42
 **/
@Component
public class BImpl implements B {

    @Override
    public void b() {
        System.out.println(" b ");
    }

    @Override
    public void a() {
        System.out.println("  b  a ");
    }
}
