package le.viet.com.spring5dependenciesinjection.model;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by associate on 3/8/18.
 */
@Component
public class BeanLifeCycleDemo implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware{
    public BeanLifeCycleDemo() {
        System.out.println("------BeanLiftCycelDemo constructor-----");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("------afterPropertiesSet------");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("------destroy-----");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("------setBeanName-----");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("------setBeanFactory------");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("------setApplicationContext------");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("------postConstruct------");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("------preDestroy------");
    }

    public void beforeInit() {
        System.out.println("------beforeInit------");
    }

    public void aferInit() {
        System.out.println("------afterInit------");
    }
}
