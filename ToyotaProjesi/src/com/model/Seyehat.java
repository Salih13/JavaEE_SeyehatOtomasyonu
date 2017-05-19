package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Seyehat {
		// tarihler date türünden sonra değiştirilecektir.
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String seyehatBaslangici;
	private String seyehatSonu;
	private String seyehatYeri;
	private String gidisAmaci;
	private String projeKodu;
	
	public Seyehat() {
		super();
	}

	public Seyehat(String seyehatBaslangici, String seyehatSonu, String seyehatYeri, String gidisAmaci,
			String projeKodu) {
		super();
		this.seyehatBaslangici = seyehatBaslangici;
		this.seyehatSonu = seyehatSonu;
		this.seyehatYeri = seyehatYeri;
		this.gidisAmaci = gidisAmaci;
		this.projeKodu = projeKodu;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSeyehatBaslangici() {
		return seyehatBaslangici;
	}

	public void setSeyehatBaslangici(String seyehatBaslangici) {
		this.seyehatBaslangici = seyehatBaslangici;
	}

	public String getSeyehatSonu() {
		return seyehatSonu;
	}

	public void setSeyehatSonu(String seyehatSonu) {
		this.seyehatSonu = seyehatSonu;
	}

	public String getSeyehatYeri() {
		return seyehatYeri;
	}

	public void setSeyehatYeri(String seyehatYeri) {
		this.seyehatYeri = seyehatYeri;
	}

	public String getGidisAmaci() {
		return gidisAmaci;
	}

	public void setGidisAmaci(String gidisAmaci) {
		this.gidisAmaci = gidisAmaci;
	}

	public String getProjeKodu() {
		return projeKodu;
	}

	public void setProjeKodu(String projeKodu) {
		this.projeKodu = projeKodu;
	}

	@Override
	public String toString() {
		return "Seyehat [id=" + id + ", seyehatBaslangici=" + seyehatBaslangici + ", seyehatSonu=" + seyehatSonu
				+ ", seyehatYeri=" + seyehatYeri + ", gidisAmaci=" + gidisAmaci + ", projeKodu=" + projeKodu + "]";
	}
	
	
	
}
