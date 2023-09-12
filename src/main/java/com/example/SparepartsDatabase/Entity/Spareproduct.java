package com.example.SparepartsDatabase.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Spareproduct {

	@Id
	private String prodname;
	private String proddesc;
	private String prodlink;
	public String getProdname() {
		return prodname;
	}
	public void setProdname(String prodname) {
		this.prodname = prodname;
	}
	public String getProddesc() {
		return proddesc;
	}
	public void setProddesc(String proddesc) {
		this.proddesc = proddesc;
	}
	public String getProdlink() {
		return prodlink;
	}
	public void setProdlink(String prodlink) {
		this.prodlink = prodlink;
	}
	
}
