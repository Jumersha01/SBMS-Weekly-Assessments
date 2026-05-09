package com.nt.sbean;

public class Passenger {
int passengerId;
String name;
Ticket ticket;

public Passenger(Ticket ticket) {
	this.ticket=ticket;
}

public void setPassengerId(int passengerId) {
	this.passengerId = passengerId;
}

public void setName(String name) {
	this.name = name;
}

public String showPassengerDetails() {
	return "Passenger name: "+this.name+"\n Passenger id: "+this.passengerId+"\n Ticket id: "+this.ticket.ticketId+"\n Passenger source: "+this.ticket.source+"\n Passenger destination: "+this.ticket.destination;
}

}
