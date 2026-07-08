package jsp_springcore;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Driver {
public static void main(String[] args) {
	BeanFactory fac=new AnnotationConfigApplicationContext(myConfig.class);
	ShapeApp e=fac.getBean("shapeApp",ShapeApp.class);
	e.display();
}
}
