package springInAction.aop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

/**
 * @program: inAction
 * @description:
 * @author: Bardwu
 * @create: 2019-09-19 16:04
 **/
@Configuration
//@EnableAspectJAutoProxy
@ComponentScan
public class AopConfig {

    @Bean
    public MyAspect getMyAspect(){
       return MyAspect.aspectOf();
    }
}
