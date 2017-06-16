package fr.sopra.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import fr.sopra.model.Questionnaire;
import fr.sopra.model.Test;
import fr.spora.idao.IDAO;


@Controller
@RequestMapping("/tests")

public class TestController {
	
		@Autowired
		private IDAO<Test, Integer> TestDao;
		
		@Autowired
		private IDAO<Questionnaire, Integer> QuestionnaireDao;
		
		
		@RequestMapping("")
		public String getAll(Model model) {
			model.addAttribute("tests", this.TestDao.findAll());
			return "tests";
		}
		
		@RequestMapping(value={ "/edit", "/edit/{id}" }, method=RequestMethod.GET)
		public String edit(@PathVariable(value="id", required=false) Integer idTest, Model model) {
			if (idTest != null) {
				model.addAttribute("test", this.TestDao.find(idTest));
			}
			
			return (idTest != null) ? "editTest" : "addTest";
		}
		
		@RequestMapping(value={ "/edit", "/edit/{id}" }, method=RequestMethod.POST)
		public String edit(@PathVariable(value="id", required=false) Integer idTest, @Valid @ModelAttribute("test") Test test, BindingResult result) {
			test = this.TestDao.save(test);
			return "redirect:/tests/edit/" + test.getIdTest();
		}
}
