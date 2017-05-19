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

@Repository("departmanDAOImpl")
public class DepartmanDAOImpl implements DepartmanDAO {

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
	public void depertmanEkle(Departman departman) {
		Session session = getSession();
		Transaction transacion = session.beginTransaction();
		session.persist(departman);
		transacion.commit();
		session.close();	
	}

	@Override
	@Transactional
	public void departmanGuncelle(Departman departman) {
		Session session = getSession();
		Transaction transacion = session.beginTransaction();
		session.update(departman);
		transacion.commit();
		session.close();	
		
	}

	@Override
	@Transactional
	public List<Departman> depertmanListele() {
		Session session = getSession();
		Query query = session.createQuery("Select e from Departman e");

		return query.list();
	}

	@Override
	@Transactional
	public void departmanSil(int id) {
		Departman departman = departmanBul(id);
		if (departman != null) {
			Session session = getSession();
			Transaction transacion = session.beginTransaction();
			session.delete(departman);
			transacion.commit();
			session.close();
		}		
		
	}

	@Override
	@Transactional
	public Departman departmanBul(int id) {
		Session session = getSession();
		Departman departman = (Departman) session.get(Departman.class, id);
		session.close();
		return departman;
	}

}
