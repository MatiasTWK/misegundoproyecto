package cl.twk.proyectos.equiposcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PolerasEquiposController {
	
	@GetMapping(value = "/polerasequipos")
	public String polerasequipos() {
		return "polerasequipos";
	}

}
