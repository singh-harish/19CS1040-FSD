package com.springBootController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.springBootBean.Alien;
import com.springBootDAO.AlienRepo;

@Controller
public class homeController {
		
	@Autowired
	AlienRepo repo;
	
	@RequestMapping("home")
	public String home() {
		return "home.jsp";
	}
	
	@RequestMapping("addAlien")
	public String addAlien(Alien alien) {
		repo.save(alien);
		return "home.jsp";
	}
	
	@RequestMapping("getAlien")
	public ModelAndView getAlien(@RequestParam Integer id) {
		ModelAndView mv= new ModelAndView("showAlien.jsp");
		
		Alien alien= repo.findById(id).orElse(new Alien());
		mv.addObject(alien);
		return mv;
	}
	
	@RequestMapping("updateAlien")
	public String updateAlien(Alien alien) {
		repo.save(alien);
		return "home.jsp";
	}
	
	@RequestMapping("deleteAlien")
	public String deleteAlien(@RequestParam Integer id) {
		repo.deleteById(id);
		return "home.jsp";
	}
}
