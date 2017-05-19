package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.dao.DepartmanDAOImpl;
import com.dao.PersonelDAOImpl;
import com.dao.SeyehatDAOImpl;
import com.model.Departman;
import com.model.Personel;
import com.model.Seyehat;

@Controller
public class DefaultController {

	@Autowired
	private PersonelDAOImpl personelDAOImpl;
	
	@Autowired
	private SeyehatDAOImpl seyehatDAOImpl;
	
	@Autowired
	private DepartmanDAOImpl departmanDAOImpl;
	
	@RequestMapping("/")
	public String index(){	
		return "index";
	}
	
	
	@RequestMapping("/login")
	public String login(){	
		return "login";
	}
	
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String person(Model model) {		

		List<Departman> departmanList = departmanDAOImpl.depertmanListele();
		model.addAttribute("newPerson", new Personel());
		model.addAttribute("tumDepartmanlar", departmanList);
		
		return "register";
	}
	
	
	@RequestMapping(value = "/person.add", method = RequestMethod.POST)
	public String addPerson(@ModelAttribute("newPerson") Personel personel) {

		personelDAOImpl.personelEkle(personel);
		
		return "redirect:/person.list";
	}
	
	
	@RequestMapping(value = "/person.list", method = RequestMethod.GET)
	public String getPersonList(Model model) {

		List<Personel> personList = personelDAOImpl.personelListele();
		model.addAttribute("newPerson", new Personel());
		model.addAttribute("allPersons", personList);

		return "personelListesi";
	}
	
	
	@RequestMapping(value = "/person.delete{personId}", method = RequestMethod.GET)
	public String deletePerson(@RequestParam("personId") int id) {

		personelDAOImpl.personelSil(id);

		return "redirect:/person.list";
	}
	
	
	@RequestMapping(value = "/person.edit{personId}", method = RequestMethod.GET)
	public String editPerson(@RequestParam("personId") int id, Model model) {

		model.addAttribute("newPerson", personelDAOImpl.personelBul(id));
		model.addAttribute("allPersons", personelDAOImpl.personelListele());
		model.addAttribute("update", "update");

		return "register";
	}

	
	@RequestMapping(value = "/person.update", method = RequestMethod.POST)
	public String updatePerson(@ModelAttribute("newPerson") Personel personel, Model model) {

		personelDAOImpl.personelGuncelle(personel);

		return "redirect:/person.list";
	}
	
//****************************************************************************************
	
	@RequestMapping(value = "/seyehat.list", method = RequestMethod.GET)
	public String seyehatList(Model model) {

		List<Seyehat> seyehatList = seyehatDAOImpl.seyehatListele();
		model.addAttribute("newSeyehat", new Seyehat());
		model.addAttribute("tumSeyehatler", seyehatList);

		return "seyehatListesi";
	}
	
	@RequestMapping(value = "/seyehatAdd", method = RequestMethod.GET)
	public ModelAndView  seyehat() {		
		return new ModelAndView("seyehatEkle", "newSeyehat", new Seyehat());
	}
	@RequestMapping(value = "/seyehat.add", method = RequestMethod.POST)
	public String addSeyehat(@ModelAttribute("newSeyehat") Seyehat seyehat, Model model) {

		seyehatDAOImpl.seyehatEkle(seyehat);
		
		return "redirect:/seyehat.list";
	}
	
	@RequestMapping(value = "/seyehat.delete{seyehatId}", method = RequestMethod.GET)
	public String deleteSeyehat(@RequestParam("seyehatId") int id) {

		seyehatDAOImpl.seyehatSil(id);

		return "redirect:/seyehat.list";
	}
	
	@RequestMapping(value = "/seyehat.edit{seyehatId}", method = RequestMethod.GET)
	public String editSeyehat(@RequestParam("seyehatId") int id, Model model) {

		model.addAttribute("newSeyehat", seyehatDAOImpl.seyehatBul(id));
		model.addAttribute("tumSeyehatler", seyehatDAOImpl.seyehatListele());
		model.addAttribute("update", "update");

		return "seyehatEkle";
	}

	@RequestMapping(value = "/seyehat.update", method = RequestMethod.POST)
	public String updateSeyehat(@ModelAttribute("newSeyehat") Seyehat seyehat, Model model) {

		seyehatDAOImpl.seyehatGuncelle(seyehat);

		return "redirect:/seyehat.list";
	}
	
//********************************************************************************************
	
	@RequestMapping(value = "/departman.list", method = RequestMethod.GET)
	public String departmanList(Model model) {

		List<Departman> departmanList = departmanDAOImpl.depertmanListele();
		model.addAttribute("newDepartman", new Departman());
		model.addAttribute("tumDepartmanlar", departmanList);

		return "departmanListesi";
	}
	
	
	@RequestMapping(value = "/departmanAdd", method = RequestMethod.GET)
	public ModelAndView  departman() {		
		return new ModelAndView("departmanEkle", "newDepartman", new Departman());
	}
	
	@RequestMapping(value = "/departman.add", method = RequestMethod.POST)
	public String addDepartman(@ModelAttribute("newDepartman") Departman departman) {

		departmanDAOImpl.depertmanEkle(departman);
		
		return "redirect:/departman.list";
	}
	
	
	@RequestMapping(value = "/departman.delete{departmanId}", method = RequestMethod.GET)
	public String deleteDepartman(@RequestParam("departmanId") int id) {

		departmanDAOImpl.departmanSil(id);

		return "redirect:/departman.list";
	}
	
	@RequestMapping(value = "/departman.edit{departmanId}", method = RequestMethod.GET)
	public String editDepartman(@RequestParam("departmanId") int id, Model model) {

		model.addAttribute("newDepartman", departmanDAOImpl.departmanBul(id));
		model.addAttribute("tumDepartmanlar", departmanDAOImpl.depertmanListele());
		model.addAttribute("update", "update");

		return "departmanEkle";
	}
	
	@RequestMapping(value = "/departman.update", method = RequestMethod.POST)
	public String updateDepartman(@ModelAttribute("newDepartman") Departman departman) {

		departmanDAOImpl.departmanGuncelle(departman);

		return "redirect:/departman.list";
	}
	
}
