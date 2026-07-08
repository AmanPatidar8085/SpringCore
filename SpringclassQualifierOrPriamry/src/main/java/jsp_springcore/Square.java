package jsp_springcore;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Primary
@Component
public class Square implements Shape {

	@Override
	public void sides() {
		System.out.print("4 sides");
		
	}

}
