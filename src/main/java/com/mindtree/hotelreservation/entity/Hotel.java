package com.mindtree.hotelreservation.entity;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "hotels")
public class Hotel {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String name;
	private String area;
	private String city;
	private String state;
	private String country;
	private Double cost;
	private BigDecimal zip;
	private BigDecimal pin;
	//@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	//List<Reservation> reservations;

	public Hotel() {
		super();
	}

	public Hotel(String name, String area, String city, String state, String country, double cost, BigDecimal zip, BigDecimal pin) {
		super();
		this.name = name;
		this.area = area;
		this.city = city;
		this.state = state;
		this.country = country;
		this.cost = cost;
		this.zip = zip;
		this.pin = pin;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getcity() {
		return city;
	}

	public void setcity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public BigDecimal getZip() {
		return zip;
	}

	public void setZip(BigDecimal zip) {
		this.zip = zip;
	}

	public BigDecimal getPin() {
		return pin;
	}

	public void setPin(BigDecimal pin) {
		this.pin = pin;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

}
