package le.viet.com.spring5dependenciesinjection;

import le.viet.com.spring5dependenciesinjection.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
public class Spring5DependenciesInjectionApplication {
    public static void main(String[] args) {
		//ctx hold all spring bean
		ApplicationContext ctx =  SpringApplication.run(Spring5DependenciesInjectionApplication.class, args);
		DemoController demoController = (DemoController) ctx.getBean("demoController");

		System.out.println(demoController.hello());

		System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
		System.out.println(ctx.getBean(SetterInjectionController.class).sayHello());
		System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());

        ProfileDemoController profileDemoController = (ProfileDemoController) ctx.getBean("profileDemoController");
        System.out.println(profileDemoController.getProfile());

	}

	@Bean(name = "sayBye")
    @Profile("vn")
    public String sayByeInVn() {
        return "tam biet!";
    }

    @Bean(name = "sayBye")
    @Profile("es")
    public String sayByeInSpanish() {
        return "adiós!";
    }
}
