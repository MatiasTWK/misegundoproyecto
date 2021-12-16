package cl.twk.proyectos.polerasdcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PolerasDeportivasController {
	
	@GetMapping(value = "/polerasdeportivas")
	public String polerasdeportivas() {
		return "polerasdeportivas";
	}

}