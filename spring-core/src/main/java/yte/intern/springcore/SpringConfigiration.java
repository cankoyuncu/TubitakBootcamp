package yte.intern.springcore;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfigiration {
    @Bean
    public BeanTest beanTest(){
        return new BeanTest();
    }
}
