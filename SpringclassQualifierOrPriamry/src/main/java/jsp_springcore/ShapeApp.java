package jsp_springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ShapeApp {

@Qualifier(value="triange")
@Autowired
Shape shape;

public void display() {
	System.out.println("displaying the sides of the shape");
	shape.sides();
}
}
