package jsp.springcore;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
public static void main(String[] args) {
	BeanFactory fac= new ClassPathXmlApplicationContext("myConfig.xml");
	Employee s=fac.getBean("myEmployee",Employee.class);
	System.out.println(s);
}
}
