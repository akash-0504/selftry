package selftry.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("selftry/autowire/Autoconfig.xml");
		 Emp emp = (Emp) context.getBean("e1");
		 System.out.println(emp);
	}
	

	
	

}