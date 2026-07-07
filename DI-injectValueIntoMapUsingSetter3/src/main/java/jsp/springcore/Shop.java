package jsp.springcore;

import java.util.Map;

public class Shop {
private String name;
private String location;
private Map<Integer,String>products;
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
public Map<Integer, String> getProducts() {
	return products;
}
public void setProducts(Map<Integer, String> products) {
	this.products = products;
}
@Override
public String toString() {
	return "Shop [name=" + name + ", location=" + location + ", products=" + products + "]";
}



}
