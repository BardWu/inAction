package springInAction.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @program: inAction
 * @description:
 * @author: Bardwu
 * @create: 2019-09-19 16:16
 **/
@Aspect
@Component
public class AopAspectNew {

    @DeclareParents(value = "springInAction.aop.AopBeanInterface+",defaultImpl = CreateNewWaysInterfaceImpl.class)
    public static CreateNewWaysInterface createNewWaysInterface;

}
