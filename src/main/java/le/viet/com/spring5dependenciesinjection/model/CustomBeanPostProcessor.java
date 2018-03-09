package le.viet.com.spring5dependenciesinjection.model;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * Created by associate on 3/8/18.
 */
@Component
public class CustomBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if(bean instanceof BeanLifeCycleDemo) {
            ((BeanLifeCycleDemo) bean).beforeInit();
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if(bean instanceof BeanLifeCycleDemo) {
            ((BeanLifeCycleDemo) bean).aferInit();
        }
        return bean;
    }
}
