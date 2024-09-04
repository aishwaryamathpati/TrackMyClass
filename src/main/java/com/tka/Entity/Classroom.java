package com.tka.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GeneratorType;
import org.springframework.stereotype.Component;

@Entity
@Component
public class Classroom {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	int ClsId;
	String ClsName;
	String clsLocation;
	int clscapacity;
	public Classroom() {
		super();
	}
	public Classroom(String clsName, String clsLocation, int clscapacity) {
		super();
		this.ClsName = clsName;
		this.clsLocation = clsLocation;
		this.clscapacity = clscapacity;
	}
	public int getClsId() {
		return ClsId;
	}
	public void setClsId(int clsId) {
		ClsId = clsId;
	}
	public String getClsName() {
		return ClsName;
	}
	public void setClsName(String clsName) {
		this.ClsName = clsName;
	}
	public String getClsLocation() {
		return clsLocation;
	}
	public void setClsLocation(String clsLocation) {
		this.clsLocation = clsLocation;
	}
	public int getClscapacity() {
		return clscapacity;
	}
	public void setClscapacity(int clscapacity) {
		this.clscapacity = clscapacity;
	}
	
	
	

}
