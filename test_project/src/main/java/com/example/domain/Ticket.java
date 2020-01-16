package com.example.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Ticket {


	private Integer id;

	private String passangerName;

	private Date bookingDate;

	private String sourceStation;

	private String destStation;

	private String email;
	
	
//
//	public Ticket() {
//		super();
//	}
//	
//
//	public Ticket(Integer id, String passangerName, Date bookingDate, String sourceStation, String destStation,
//			String email) {
//		super();
//		this.id = id;
//		this.passangerName = passangerName;
//		this.bookingDate = bookingDate;
//		this.sourceStation = sourceStation;
//		this.destStation = destStation;
//		this.email = email;
//	}
//
//
//	public String getPassangerName() {
//		return passangerName;
//	}
//
//	public void setPassangerName(String passangerName) {
//		this.passangerName = passangerName;
//	}
//
//	public Date getBookingDate() {
//		return bookingDate;
//	}
//
//	public void setBookingDate(Date bookingDate) {
//		this.bookingDate = bookingDate;
//	}
//
//	public String getSourceStation() {
//		return sourceStation;
//	}
//
//	public void setSourceStation(String sourceStation) {
//		this.sourceStation = sourceStation;
//	}
//
//	public String getDestStation() {
//		return destStation;
//	}
//
//	public void setDestStation(String destStation) {
//		this.destStation = destStation;
//	}
//
//	public String getEmail() {
//		return email;
//	}
//
//	public void setEmail(String email) {
//		this.email = email;
//	}

	public static void main(String[] args) {
	
	}
}
