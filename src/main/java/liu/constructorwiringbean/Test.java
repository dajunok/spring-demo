package liu.constructorwiringbean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("/liu/constructorwiringbean/spring-constructor.xml");
		ac.getBean("empService");

	}

}