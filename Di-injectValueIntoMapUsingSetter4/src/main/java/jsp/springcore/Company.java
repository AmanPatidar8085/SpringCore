package jsp.springcore;

import java.util.Map;

public class Company {
private String name;
private String location;
private Map<Integer,String>employee;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public Map<Integer, String> getEmployee() {
	return employee;
}
public void setEmployee(Map<Integer, String> employee) {
	this.employee = employee;
}
@Override
public String toString() {
	return "Company [name=" + name + ", location=" + location + ", employee=" + employee + "]";
}


}
