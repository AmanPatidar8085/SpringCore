package jsp_springcore;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	
@Value(value="101")
int id;

@Value(value="Aman")
String name;

@Value(value="50000")
double salary;

@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
}

}



