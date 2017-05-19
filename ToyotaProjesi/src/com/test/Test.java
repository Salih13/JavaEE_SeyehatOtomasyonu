package com.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.DepartmanDAO;
import com.dao.DepartmanDAOImpl;
import com.dao.PersonelDAO;
import com.dao.PersonelDAOImpl;
import com.model.Departman;
import com.model.Personel;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("/com/config/hibernate-config.xml");

		PersonelDAO personelDAO = ctx.getBean(PersonelDAOImpl.class);
		DepartmanDAO departmanDAO = ctx.getBean(DepartmanDAOImpl.class);

//		Departman it = new Departman("IT Department");
//		Departman management = new Departman("Management");
//		departmanDAO.depertmanEkle(it);
//		departmanDAO.depertmanEkle(management);
		
		// create person object
//		Personel person1 = new Personel("sad", "sad", "sad","parola", it);
//		Personel person2 = new Personel("oldName", "oldSurname", "kullanıcı", "132", management);

//		person1.setIsim("oldName");
//		person1.setSoyisim("oldd");
//		person1.setKullaniciAdi("kullanıcı");
//		person1.setParola("parolaa");
//		person1.setDepartman(it);
		
		// insert
//		personelDAO.personelEkle(person1);
//		personelDAO.personelEkle(person2);
		
//		// find
//		Personel foundPerson = personelDAO.personelBul(1);
//		System.out.println("Found ... " + foundPerson);
//
//		// update
//		person1.setIsim("Levent");
//		person1.setSoyisim("Erguder");
//		personelDAO.personelGuncelle(person1);
//		System.out.println("After Update...");
//
//		// find
//		foundPerson = personelDAO.personelBul(1);
//		System.out.println("Found ... " + foundPerson);
//
//		Personel person2 = new Personel("Salih","Güngör","salih","1234");
//		Personel person3 = new Personel("Salih","Güngör","salih","1234");
//
//		personelDAO.personelEkle(person2);
//		personelDAO.personelEkle(person3);
//
//		// delete
//		personelDAO.personelSil(1);
//
//		// list
//		List<Personel> personelList = personelDAO.personelListele();
//		System.out.println("Listing...");
//		for (Personel p : personelList) {
//			System.out.println(p);
//		}
//		
//		Departman it = new Departman("IT Department");
//		Departman management = new Departman("Management");
//		
////		personelDAO.depertmanEkle(it);
////		personelDAO.depertmanEkle(management);
////		
////		personelDAO.departmanGuncelle(person1, it);
////		personelDAO.departmanGuncelle(person2, it);
////		personelDAO.departmanGuncelle(person3, management);
//		
//		personelDAO.personelGuncelle(person3);
//		
//		
//		Personel person4 = new Personel();
//		person4.setIsim("asd");
//		person4.setKullaniciAdi("asd");
//		person4.setSoyisim("sdfsdf");
//		person4.setParola("2343424");
//		person4.setDepartman(it);
//		personelDAO.personelEkle(person4);
//		
		
		List<Personel> personelList2 = personelDAO.personelListele();
		System.out.println("Listing...");
		for (Personel p : personelList2) {
			System.out.println(p);
		}
		
		
		
		((ClassPathXmlApplicationContext) ctx).close();

	}

}
