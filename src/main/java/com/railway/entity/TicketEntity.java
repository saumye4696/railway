package com.railway.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Ticket")
public class TicketEntity{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer ticketNumber;
	private String source;
	private String destination;
	private Integer noOfTickets;
	private Integer pnr;
	private Float costOfTicket;
	public Integer getTicketNumber() {
		return ticketNumber;
	}
	public void setTicketNumber(Integer ticketNumber) {
		this.ticketNumber = ticketNumber;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public Integer getNoOfTickets() {
		return noOfTickets;
	}
	public void setNoOfTickets(Integer noOfTickets) {
		this.noOfTickets = noOfTickets;
	}
	public Integer getPnr() {
		return pnr;
	}
	public void setPnr(Integer pnr) {
		this.pnr = pnr;
	}
	public Float getCostOfTicket() {
		return costOfTicket;
	}
	public void setCostOfTicket(Float costOfTicket) {
		this.costOfTicket = costOfTicket;
	}
}
