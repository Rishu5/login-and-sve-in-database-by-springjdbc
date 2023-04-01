package com.rishu.modelrequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Controler {

	@RequestMapping(path = "/student", method = RequestMethod.GET)
	public String index(Model m) {

		m.addAttribute("Name", "Rishu");
		m.addAttribute("age", "24");
		return "student";

	}

	@RequestMapping(path = "/login", method = RequestMethod.POST)
	public String student(@ModelAttribute Stu stu, Model model) {
		System.out.println(stu);

		model.addAttribute("student", stu);

		return "views";
	}

}
