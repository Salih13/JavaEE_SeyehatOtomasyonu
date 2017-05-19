package com.dao;

import java.util.List;

import com.model.Departman;
import com.model.Personel;

public interface DepartmanDAO {

	public void depertmanEkle(Departman departman);
	
	public List<Departman> depertmanListele();
	
	public void departmanGuncelle(Departman departman);
	
	public void departmanSil(int id);
	
	public Departman departmanBul(int id);
	
}
