package jsp_springcore;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Driver {
public static void main(String[] args) {
	BeanFactory fac=new AnnotationConfigApplicationContext(MyConfig.class);
	Passenger e=fac.getBean("passenger",Passenger.class);
	System.out.println(e);
}
}
