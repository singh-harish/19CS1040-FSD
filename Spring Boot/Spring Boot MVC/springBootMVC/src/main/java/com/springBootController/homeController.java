package com.springBootController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springBootBean.Alien;

@Controller
public class homeController {
	
	@RequestMapping("home")
	public ModelAndView home(Alien alien) {
		ModelAndView mv= new ModelAndView();
		
		mv.addObject("alienObj", alien);
		mv.setViewName("home");
		
		return mv;
	}
}
