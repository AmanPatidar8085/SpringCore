package jsp_springcore;

import org.springframework.stereotype.Component;

@Component
public class Realme implements Mobile{
@Override

 public void ring() {
	System.out.println("relame is ringing");
}
}
