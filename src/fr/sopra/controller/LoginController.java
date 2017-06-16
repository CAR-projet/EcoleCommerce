package fr.sopra.controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import fr.sopra.model.Admin;
import fr.sopra.model.Personne;
import fr.spora.idao.IDAO;

@Controller
@RequestMapping("/login")
public class LoginController {

	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String login() {
		return "login";
	}
//	@RequestMapping(value="/login", method=RequestMethod.POST)
//	public String login(@Valid @ModelAttribute("user") Personne personne, BindingResult result, Model model, HttpSession session) {
//		if ((!result.hasErrors()) || (result.getErrorCount() == 2)) {
//			try {
//				Admin admin=(Admin)personne;
//				personne = this.personneDAO.auth(admin.getUsername(), admin.getPassword());
//				
//				if (admin != null) {
//					session.setAttribute("utilisateur", admin);
//					session.setAttribute("username", admin.getUsername());
//					return "redirect:/accueil";
//				}
//			}
//			
//			catch (WrongUsernameOrPasswordException ex) {
//				result.rejectValue("password", ex.getCode(), ex.getMessage());
//			}
//		}
//		
//		return "login";
//	}
	
}
