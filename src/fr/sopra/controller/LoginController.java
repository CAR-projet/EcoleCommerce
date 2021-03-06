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

import fr.sopra.exception.WrongUsernameOrPasswordException;
import fr.sopra.model.Admin;
import fr.sopra.model.Personne;
import fr.spora.idao.IPersonneDao;

@Controller
@RequestMapping("/login")
public class LoginController {

	@Autowired
	private IPersonneDao personneDao;
	
	@RequestMapping(value="", method=RequestMethod.GET)
	public String login() {
		return "login";
	}
	
	@RequestMapping(value="", method=RequestMethod.POST)
	public String login(@Valid @ModelAttribute("admin") Admin administrateur, BindingResult result, Model model, HttpSession session) {

			try {
				administrateur =  this.personneDao.auth(administrateur.getUsername(), administrateur.getPassword());
				
				if (administrateur!= null) {
					session.setAttribute("utilisateur", administrateur);
					session.setAttribute("username", administrateur.getUsername());
					return "redirect:/accueil";
				}
			}
			
			catch (WrongUsernameOrPasswordException ex) {
				result.rejectValue("password", ex.getCode(), ex.getMessage());
				return "login";

			}
		
		return "login";
	
	}
	@ModelAttribute("admin")
	public Admin initUtilisateur() {
		return new Admin();
	}

	
}

