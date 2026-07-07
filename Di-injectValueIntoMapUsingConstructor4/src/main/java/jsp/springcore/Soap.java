package jsp.springcore;

import java.util.Map;

public class Soap {
private String name;
private String location;
private Map<Integer,String>produts;
public Soap(String name, String location, Map<Integer, String> produts) {
	super();
	this.name = name;
	this.location = location;
	this.produts = produts;
}
@Override
public String toString() {
	return "Soap [name=" + name + ", location=" + location + ", produts=" + produts + "]";
}

}
