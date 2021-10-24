package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.sql.Connection;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		/* We bring up a web application with no Web Context.
		 * this starts and then stops because there's no web server configured.
		 * This is very very light lightweight Spring application but we see on the council just as we expected we did get a bean.
		 * the bean is being brought up and we are seeing that controller.
		 * we execute the say a Hello method and that method says Hello World but it also returns back the string.
		 */

		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		PetController petController = ctx.getBean("petController", PetController.class);
		System.out.println("--- The Best Pet is ---");
		System.out.println(petController.whichPetIsTheBest());

		// use Springframework to create object for us by using getBean()
		I18nController i18nController = (I18nController) ctx.getBean("i18nController"); //same name with class but first letter is lower
		System.out.println("----- Profile");
		System.out.println(i18nController.sayHello());

		// use Springframework to create object for us by using getBean()
		MyController myController = (MyController) ctx.getBean("myController"); //same name with class but first letter is lower

		String greeting = myController.sayHello();

		System.out.println(greeting);
		System.out.println("----- Primary");
		System.out.println(myController.getGreeting());

		System.out.println("----- Property");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("----- Setter");
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("----- Contructor");
		ContructorInjectedController contructorInjectedController = (ContructorInjectedController) ctx.getBean("contructorInjectedController");
		System.out.println(contructorInjectedController.getGreeting());
	}

}
