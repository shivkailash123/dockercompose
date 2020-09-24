package com.mindtree.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MindtreeMinds {

	@Id
	private long mid;
	private String name;
	private double ctc;
	public MindtreeMinds() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "MindtreeMinds [mid=" + mid + ", name=" + name + ", ctc=" + ctc + "]";
	}
	public MindtreeMinds(long mid, String name, double ctc) {
		super();
		this.mid = mid;
		this.name = name;
		this.ctc = ctc;
	}
	public long getMid() {
		return mid;
	}
	public void setMid(long mid) {
		this.mid = mid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCtc() {
		return ctc;
	}
	public void setCtc(double ctc) {
		this.ctc = ctc;
	}
	
	
}
