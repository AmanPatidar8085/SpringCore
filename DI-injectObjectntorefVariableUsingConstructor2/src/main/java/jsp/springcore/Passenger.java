package jsp.springcore;

public class Passenger {
Ticket ticket;
public void travel() {
	Ticket bookticket;
	System.out.println("passeger is  travel");
}
public Passenger(Ticket ticket) {

	this.ticket = ticket;
}
@Override
public String toString() {
	return "Passenger [ticket=" + ticket + "]";
}


}
