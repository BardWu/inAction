package springInAction.springApplication;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import springInAction.bean.Company;
import springInAction.bean.School;
import springInAction.bean.Student;
import springInAction.di.componentScan.MyComponentScan;
import springInAction.di.javaConfig.JavaConfig;

/**
 * SpringJUnit4ClassRunner.class:在测试开始的时候自动创建Spring的应用上下文(创建Spring容器)
 * @ContextConfiguration会告诉它需要加载Configuration。Configuration中包含Spring应用上下文中如何创建bean的细节
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {MyComponentScan.class,JavaConfig.class})
public class TestSpringApplication {
    @Autowired(required = false)
    private Company company;

    @Test
    public void test(){
        System.out.println(company);

    }
}
