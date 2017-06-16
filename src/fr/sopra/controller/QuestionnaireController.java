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
import fr.sopra.model.Matiere;
import fr.sopra.model.Questionnaire;
import fr.sopra.model.Test;
import fr.spora.idao.IDAO;

@Controller
@RequestMapping("/questionnaire")

public class QuestionnaireController {
	
	@Autowired
	private IDAO<Questionnaire, Integer> QuestionnaireDao;
	
	@Autowired
	private IDAO<Matiere, Integer> MatiereDao;
	
	@RequestMapping("")
	public String getAll(Model model) {
		model.addAttribute("questionnaires", this.QuestionnaireDao.findAll());
		return "questionnaire";
	}
	
	@RequestMapping(value={ "/edit", "/edit/{idQuestionnaire}" }, method=RequestMethod.GET)
	public String edit(@PathVariable(value="idQuestionnaire", required=false) Integer idQuestionnaire, Model model) {
		if (idQuestionnaire != null) {
			model.addAttribute("questionnaire", this.QuestionnaireDao.find(idQuestionnaire));
			
		}
		
		return (idQuestionnaire != null) ? "editQuestionnaire" : "addQuestionnaire";
	}
	
	@RequestMapping(value={ "/edit", "/edit/{id}" }, method=RequestMethod.POST)
	public String edit(@PathVariable(value="id", required=false) Integer idQuestionnaire, @Valid @ModelAttribute("questionnaire") Questionnaire questionnaire, @ModelAttribute("matiere") Matiere matiere, BindingResult result) {
		matiere.setQuestionnaires(questionnaire);
		matiere=this.MatiereDao.save(matiere);
		questionnaire = this.QuestionnaireDao.save(questionnaire);
		return "redirect:/questionnaires/" ;
	}
	
	
	@ModelAttribute("matiere")
	public Matiere initMatiere() {
		return new Matiere();
	}
	@ModelAttribute("questionnaire")
	public Questionnaire initQuestionnaire() {
		return new Questionnaire();
	}
}

	