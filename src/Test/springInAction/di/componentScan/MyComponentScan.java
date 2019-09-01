package springInAction.di.componentScan;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import springInAction.di.javaConfig.JavaConfig;

/**
 * Configuration :这是一个配置类，显示Bean的创建细节
 * ComponentScan:自动创建 basePackages下 带有@Componet注解类的对象
 */
@Configuration
@ComponentScan(basePackages = "springInAction.bean")
//@Import(JavaConfig.class)
public class MyComponentScan {
}
