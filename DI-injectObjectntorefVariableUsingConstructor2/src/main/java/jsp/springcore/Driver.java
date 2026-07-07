package jsp.springcore;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
public static void main(String[] args) {
	BeanFactory fac= new ClassPathXmlApplicationContext("myConfig.xml");
	Passenger s=fac.getBean("myPassenger",Passenger.class);
	System.out.println(s);
}
}
