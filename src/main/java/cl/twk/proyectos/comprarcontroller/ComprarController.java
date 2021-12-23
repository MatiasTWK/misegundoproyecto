package cl.twk.proyectos.comprarcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ComprarController {
	
	@GetMapping(value = "/comprarpolera")
	public String comprarpolera() {
		return "comprarpolera";
	}

}
