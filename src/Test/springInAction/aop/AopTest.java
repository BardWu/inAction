package springInAction.aop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @program: inAction
 * @description: 通过注解给Spring bean添加新的方法
 * @author: Bardwu
 * @create: 2019-09-19 15:57
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AopConfig.class)
public class AopTest {
    @Autowired
    public AopBeanInterface aopBeanInterface;
  /*  @Autowired
    public CreateNewWaysInterface createNewWaysInterface;*/
    @Autowired
    public B b;
 /*  @Autowired
    public A a;*/
    @Autowired
    public MyAspectBean aspectBean;

    @Test
    public void test(){
        aspectBean.doBean();
    }
}
