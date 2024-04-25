package com.telusko.springmvc;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.telusko.springmvc.dao.AlienDao;
import com.telusko.springmvc.model.Alien;

@Controller
public class HomeController {

	@Autowired
	private AlienDao dao;
	
	@ModelAttribute("course")
	public void modelData(Model m)
	{
		m.addAttribute("name","Aliens");
	}
	
	
	
	
	@RequestMapping("/")
	public String home() {
		// System.out.println("Home method called");
		return "index";
	}

	
	
	
	/*@RequestMapping("add")
	public String add(@RequestParam("num1") int i, @RequestParam("num2") int j, Model m) {

		int num3 = i + j;
		m.addAttribute("Num3", num3);
		
		return "result";
	}*/
	
	@GetMapping("getAlines")
	public String getAliens(Model m) {
		m.addAttribute("result", dao.getAliens());
		return "showAliens";
	}
	

	@RequestMapping("addAlien")
	public String addAlien(Alien alien) {
	//public String addAlien(@ModelAttribute("alien1") Alien alien) {
       
		return "result";
	}

}

