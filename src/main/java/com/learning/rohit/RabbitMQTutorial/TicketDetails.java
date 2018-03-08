package com.learning.rohit.RabbitMQTutorial;

public class TicketDetails {
	
	private String ticketId;
	private String name;
	private String vendor;
	public String getTicketId() {
		return ticketId;
	}
	public void setTicketId(String ticketId) {
		this.ticketId = ticketId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getVendor() {
		return vendor;
	}
	public void setVendor(String vendor) {
		this.vendor = vendor;
	}
	@Override
	public String toString() {
		return "TicketDetails [ticketId=" + ticketId + ", name=" + name + ", vendor=" + vendor + "]";
	}
	

}


