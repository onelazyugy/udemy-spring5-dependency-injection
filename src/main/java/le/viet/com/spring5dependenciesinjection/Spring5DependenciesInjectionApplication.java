package le.viet.com.spring5dependenciesinjection;

import le.viet.com.spring5dependenciesinjection.controllers.ConstructorInjectedController;
import le.viet.com.spring5dependenciesinjection.controllers.DemoController;
import le.viet.com.spring5dependenciesinjection.controllers.PropertyInjectedController;
import le.viet.com.spring5dependenciesinjection.controllers.SetterInjectionController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring5DependenciesInjectionApplication {

	public static void main(String[] args) {
		//ctx hold all spring bean
		ApplicationContext ctx =  SpringApplication.run(Spring5DependenciesInjectionApplication.class, args);
		DemoController demoController = (DemoController) ctx.getBean("demoController");

		demoController.hello();

		System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
		System.out.println(ctx.getBean(SetterInjectionController.class).sayHello());
		System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
	}
}
