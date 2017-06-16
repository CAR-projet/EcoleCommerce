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


import fr.sopra.model.Candidat;
import fr.sopra.model.Questionnaire;
import fr.sopra.model.Test;
import fr.spora.idao.IDAO;
import fr.spora.idao.ITestDao;


@Controller
@RequestMapping("/tests")

public class TestController {
	
		@Autowired
		private ITestDao TestDao;
		
		@Autowired
		private IDAO<Candidat, Integer> CandidatDao;
		
		@Autowired
		private IDAO<Questionnaire, Integer> QuestionnaireDao;
		
		
		
		@RequestMapping("")
		public String getAll(Model model) {
			model.addAttribute("tests", this.TestDao.findAll());
			return "tests";
		}
		
		@RequestMapping(value={ "/edit", "/edit/{idTest}" }, method=RequestMethod.GET)
		public String edit(@PathVariable(value="idTest", required=false) Integer idTest, Model model) {
			if (idTest != null) {
				model.addAttribute("candidat", this.TestDao.findWithIdTest(idTest));
				model.addAttribute("test", this.TestDao.find(idTest));
				
			}
	
			return (idTest != null) ? "editTest" : "addTest";
		}
		
		@RequestMapping(value={ "/edit", "/edit/{id}" }, method=RequestMethod.POST)
		public String edit(@PathVariable(value="id", required=false) Integer idTest, @Valid @ModelAttribute("test") Test test, @ModelAttribute("candidat") Candidat candidat, BindingResult result) {
			candidat.setTest(test);
			candidat=this.CandidatDao.save(candidat);
			test = this.TestDao.save(test);
			return "redirect:/tests/" ;
		}
		
		
		@ModelAttribute("candidat")
		public Candidat initCandidat() {
			return new Candidat();
		}
		@ModelAttribute("test")
		public Test initTest() {
			return new Test();
		}
}
