package com.ty.onetoonebai;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Charcey {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String charceyNumber;
	private String type;
	
	@OneToOne(mappedBy = "charcey",cascade = CascadeType.ALL)
	private Vehicl vehicl;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCharceyNumber() {
		return charceyNumber;
	}

	public void setCharceyNumber(String charceyNumber) {
		this.charceyNumber = charceyNumber;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Vehicl getVehicl() {
		return vehicl;
	}

	public void setVehicl(Vehicl vehicl) {
		this.vehicl = vehicl;
	}
}
