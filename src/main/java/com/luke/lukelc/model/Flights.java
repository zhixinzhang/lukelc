package com.luke.lukelc.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;


@Entity // This tells Hibernate to make a table out of this class
@Table(name = "flights")
public class Flights {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "source")
	@NotEmpty
	private String source;

    @Column(name = "destination")
	@NotEmpty
	private String destination;

	@Column(name = "departure")
	@NotEmpty
	private java.sql.Timestamp departure;

	@Column(name = "arrival")
	@NotEmpty
	private java.sql.Timestamp arrival;

	@Column(name = "tickets_count")
	@NotEmpty
	private int tickets_count;


	@Column(name = "price")
	@NotEmpty
	private int price;

	@Column(name = "carrier")
	@NotEmpty
	private String carrier;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public java.sql.Timestamp getDeparture() {
		return departure;
	}

	public void setDeparture(java.sql.Timestamp departure) {
		this.departure = departure;
	}

	public java.sql.Timestamp getArrival() {
		return arrival;
	}

	public void setArrival(java.sql.Timestamp arrival) {
		this.arrival = arrival;
	}

	public int getTickets_count() {
		return tickets_count;
	}

	public void setTickets_count(int tickets_count) {
		this.tickets_count = tickets_count;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getCarrier() {
		return carrier;
	}

	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}
}
