package com.ochotel.Beans;

import java.sql.Date;

public class Reservation { 
	private int Id;
	private int  R_id;
	private Date start_date;
	private Date  end_date;
	private int num_guests;
	
	public Reservation(int id, int r_id, Date start_date, Date end_date, int num_guests) {
		super();
		Id = id;
		R_id = r_id;
		this.start_date = start_date;
		this.end_date = end_date;
		this.num_guests = num_guests;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public int getR_id() {
		return R_id;
	}
	public void setR_id(int r_id) {
		R_id = r_id;
	}
	public Date getStart_date() {
		return start_date;
	}
	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}
	public Date getEnd_date() {
		return end_date;
	}
	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}
	public int getNum_guests() {
		return num_guests;
	}
	public void setNum_guests(int num_guests) {
		this.num_guests = num_guests;
	}
	
}
