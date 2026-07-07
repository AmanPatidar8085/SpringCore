package jsp.springcore;

import java.util.List;

public class Students {
int id;
String name;
List<String>subject;
public Students(int id, String name, List<String> subject) {
	
	this.id = id;
	this.name = name;
	this.subject = subject;
}
@Override
public String toString() {
	return "Students [id=" + id + ", name=" + name + ", subject=" + subject + "]";
}


}
