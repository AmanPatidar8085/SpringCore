package jsp_springcore;

import org.springframework.stereotype.Component;

@Component
public class Triange  implements Shape{

	@Override
	public void sides() {
		System.out.println("3 sides");
		
	}

}
