package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.model.Seyehat;

@Repository("seyehatDAOImpl")
public class SeyehatDAOImpl implements SeyehatDAO {

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
	public void seyehatEkle(Seyehat seyehat) {
		Session session = getSession();
		Transaction transacion = session.beginTransaction();
		session.persist(seyehat);
		transacion.commit();
		session.close();
		
	}

	@Override
	@Transactional
	public Seyehat seyehatBul(int id) {
		Session session = getSession();
		Seyehat seyehat = (Seyehat) session.get(Seyehat.class, id);
		session.close();
		return seyehat;
	}
	
	@Override
	@Transactional
	public List<Seyehat> seyehatListele() {
		Session session = getSession();
		Query query = session.createQuery("Select e from Seyehat e");
		return query.list();
	}

	@Override
	@Transactional
	public void seyehatSil(int id) {
		Seyehat seyehat = seyehatBul(id);
		if (seyehat != null) {
			Session session = getSession();
			Transaction transacion = session.beginTransaction();
			session.delete(seyehat);
			transacion.commit();
			session.close();
		}				
	}

	@Override
	@Transactional
	public void seyehatGuncelle(Seyehat seyehat) {
		Session session = getSession();
		Transaction transacion = session.beginTransaction();
		session.update(seyehat);
		transacion.commit();
		session.close();		
		
	}

}
