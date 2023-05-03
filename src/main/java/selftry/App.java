package selftry;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
    	         ApplicationContext context = new ClassPathXmlApplicationContext("selftry/config.xml");
    	         Person person = (Person) context.getBean("p1");
    	         System.out.println(person);
    	
    	
                 
    }
}
