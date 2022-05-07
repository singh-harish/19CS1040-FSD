package springAppSetup;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	private static ApplicationContext ac;
    public static void main( String[] args )
    {
    	ac = new ClassPathXmlApplicationContext("bean.xml");
    	Student s = (Student) ac.getBean("studentbean");
        s.displayInfo();
    }
}
