package com.dao;

import java.util.List;

import com.model.Seyehat;

public interface SeyehatDAO {

	public void seyehatEkle(Seyehat seyehat);

	public Seyehat seyehatBul(int id);
	
	public List<Seyehat> seyehatListele();

	public void seyehatSil(int id);
	
	public void seyehatGuncelle(Seyehat seyehat);
	
}
