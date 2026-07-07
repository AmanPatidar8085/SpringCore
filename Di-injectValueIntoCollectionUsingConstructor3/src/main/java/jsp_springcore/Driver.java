package jsp_springcore;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
public static void main(String[] args) {
	BeanFactory fac=new ClassPathXmlApplicationContext("myConfig.xml");
	College c=fac.getBean("myCollege",College.class);
	System.out.println(c);
	}
}
