package fr.sopra.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import fr.sopra.model.Test;
import fr.spora.idao.IDAO;


@Controller
@RequestMapping("/tests")

public class TestController {
	
		@Autowired
		private IDAO<Test, Integer> TestDao;
		
		
		@RequestMapping("")
		public String getAll(Model model) {
			model.addAttribute("tests", this.TestDao.findAll());
			return "tests";
		}
}
