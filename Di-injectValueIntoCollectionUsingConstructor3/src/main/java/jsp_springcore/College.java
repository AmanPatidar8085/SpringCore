package jsp_springcore;

import java.util.List;

public class College {
private String name;
private String location;
private List<String>dept;
public College(String name, String location, List<String> dept) {
	
	this.name = name;
	this.location = location;
	this.dept = dept;
}
@Override
public String toString() {
	return "College [name=" + name + ", location=" + location + ", dept=" + dept + "]";
}


}
