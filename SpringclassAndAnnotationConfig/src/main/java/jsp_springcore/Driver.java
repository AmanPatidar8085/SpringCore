package jsp_springcore;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
public static void main(String[] args) {
	BeanFactory fac=new AnnotationConfigApplicationContext(MyConfig.class);
	Employee e=fac.getBean("employee",Employee.class);
	System.out.println(e);
}
}
