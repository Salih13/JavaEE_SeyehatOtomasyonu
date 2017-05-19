package com.dao;

import java.util.List;

import com.model.Departman;
import com.model.Personel;

public interface PersonelDAO {

	
	public void personelEkle(Personel personel);
	
	public Personel personelBul(int id);

	public List<Personel> personelListele();

	public void personelSil(int personel);
	
	public void personelGuncelle(Personel personel);
	
}
