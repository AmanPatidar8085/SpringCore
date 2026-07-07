package jsp_springcore;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
public static void main(String[] args) {
	BeanFactory fac=new ClassPathXmlApplicationContext("myConfig.xml");
	Employee e=fac.getBean("myEmployee",Employee.class);
	System.out.println(e);
}
}
