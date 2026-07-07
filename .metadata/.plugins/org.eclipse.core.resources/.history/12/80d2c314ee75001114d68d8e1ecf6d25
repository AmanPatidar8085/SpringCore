package jsp_springcore;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
public static void main(String[] args) {
	BeanFactory fac=new ClassPathXmlApplicationContext("myConfig.xml");
	Student s=fac.getBean("myStudent",Student.class);
	System.out.println(s);
}
}
