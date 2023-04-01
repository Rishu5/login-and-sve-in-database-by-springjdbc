package com.rishu.modelrequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.rishu.entity.Stu;
import com.rishu.service.Student_service;

@Controller
public class Controler {
	
	@Autowired
	private Student_service serviceuser;
	
	@RequestMapping(path = "/student", method = RequestMethod.GET)
	public String index(Model m) {
		m.addAttribute("Name", "Rishu");
		m.addAttribute("age", "24");
		return "student";
	}

	@RequestMapping(path = "/login", method = RequestMethod.POST)
	public String student(@ModelAttribute Stu stu, Model model) {
		System.out.println(stu);
		this.serviceuser.createstudent(stu);
		model.addAttribute("student", stu);
		return "views";
	}

}
