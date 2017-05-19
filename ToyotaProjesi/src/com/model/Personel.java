package com.model;

import javax.persistence.CascadeType;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Personel {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column(nullable=false)
	private String isim;
	@Column(nullable=false)
	private String soyisim;
	@Column(nullable=false)
	private String kullaniciAdi;
	@Column(nullable=false)
	private String parola;	

	@ManyToOne(cascade = {CascadeType.ALL})
	private Seyehat seyehat;
	
	@ManyToOne(cascade = {CascadeType.PERSIST,CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH })
	private Departman departman;
	
	public Personel(String isim, String soyisim, String kullaniciAdi, String parola, Departman departman) {
		super();
		this.isim = isim;
		this.soyisim = soyisim;
		this.kullaniciAdi = kullaniciAdi;
		this.parola = parola;
		this.departman=departman;
	}
	
	public Personel() {
		super();
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}	
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public String getSoyisim() {
		return soyisim;
	}
	public void setSoyisim(String soyisim) {
		this.soyisim = soyisim;
	}
	public String getKullaniciAdi() {
		return kullaniciAdi;
	}
	public void setKullaniciAdi(String kullaniciAdi) {
		this.kullaniciAdi = kullaniciAdi;
	}
	public String getParola() {
		return parola;
	}
	public void setParola(String parola) {
		this.parola = parola;
	}
	
	public Departman getDepartman() {
		return departman;
	}
	public void setDepartman(Departman departman) {
		this.departman = departman;
	}
	
	public Seyehat getSeyehat() {
		return seyehat;
	}

	public void setSeyehat(Seyehat seyehat) {
		this.seyehat = seyehat;
	}

	@Override
	public String toString() {
		return "Personel [id=" + id + ", isim=" + isim + ", soyisim=" + soyisim + ", kullaniciAdi=" + kullaniciAdi
				+ ", parola=" + parola + ", departman=" + departman.getName() + "]";
	}
	
	
	
	
}
