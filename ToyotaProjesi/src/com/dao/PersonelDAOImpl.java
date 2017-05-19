package com.dao;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.model.Departman;
import com.model.Personel;
@Repository("personelDAOImpl")
public class PersonelDAOImpl implements PersonelDAO {
	
	private DepartmanDAOImpl departmanDAOImpl;
	private SessionFactory sessionFactory;

	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public Session getSession() {
		return sessionFactory.openSession();
	}
	
	
	@Override
	@Transactional
	public void personelEkle(Personel personel) {
		Session session = getSession();
		Transaction transacion = session.beginTransaction();
		
		int departmanId;		
		departmanId =  Integer.parseInt(personel.getDepartman().getName());
		personel.setDepartman(session.get(Departman.class, departmanId));
		session.saveOrUpdate(personel);			
		
		transacion.commit();
		session.close();
	}

	@Override
	@Transactional
	public Personel personelBul(int id) {
		Session session = getSession();
		Personel personel = (Personel) session.get(Personel.class, id);
		session.close();
		return personel;
	}

	@Override
	@Transactional
	public List<Personel> personelListele() {
		Session session = getSession();
		Query query = session.createQuery("Select e from Personel e");

		return query.list();
	}

	@Override
	@Transactional
	public void personelSil(int id) {
		Personel personel = personelBul(id);
		if (personel != null) {
			Session session = getSession();
			Transaction transacion = session.beginTransaction();
			session.delete(personel);
			transacion.commit();
			session.close();
		}		
	}

	@Override
	@Transactional
	public void personelGuncelle(Personel personel) {
		Session session = getSession();
		Transaction transacion = session.beginTransaction();
		session.update(personel);
		transacion.commit();
		session.close();		
	}

	
}
