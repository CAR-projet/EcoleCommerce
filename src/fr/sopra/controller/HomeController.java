package fr.sopra.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class HomeController {
	@RequestMapping("/accueil")
	public String home() {
		return "home";
	}
}

