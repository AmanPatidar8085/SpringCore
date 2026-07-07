package jsp.springcore;

public class Car {
private Engine engine;
public void run() {
	engine.start();
	System.out.println("car is running");
}
public Engine getEngine() {
	return engine;
}
public void setEngine(Engine engine) {
	this.engine = engine;
}

}
