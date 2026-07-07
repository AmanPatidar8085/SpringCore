package jsp_springcore;

public class Car {
private Engine engine;

void start() {
	engine.run();
	System.out.println("car is running");
	
}

public Engine getEngine() {
	return engine;
}

public void setEngine(Engine engine) {
	this.engine = engine;
}

@Override
public String toString() {
	return "Car [engine=" + engine + "]";
}

}
