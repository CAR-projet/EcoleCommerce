package fr.sopra.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.sopra.model.Questionnaire;
import fr.spora.idao.IDAO;

@Controller
@RequestMapping("/questionnaire")

public class QuestionnaireController {
	
	@Autowired
	private IDAO<Questionnaire, Integer> QuestionnaireDao;
	
	@RequestMapping("")
	public String getAll(Model model) {
		model.addAttribute("questionnaires", this.QuestionnaireDao.findAll());
		return "questionnaire";
	}
	
}

	