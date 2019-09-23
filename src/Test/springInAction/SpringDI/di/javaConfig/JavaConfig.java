package springInAction.SpringDI.di.javaConfig;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springInAction.SpringDI.bean.School;
import springInAction.SpringDI.bean.Student;

/**
 *  JavaConfig创建Bean的细节
 *  Configuration :这是一个配置类，显示Bean的创建细节
 */
@Configuration
public class JavaConfig {
    /**
     * @Bean 告诉spring容器，该方法会返回一个对象，该对象要注册到Spring应用上下文中
     */
    @Bean
    public School getSchool(){
        return new School(getStudent());
    }
    @Bean
    public Student getStudent(){
        return new Student();
    }
}
