package cl.twk.proyectos.controladorcomprar;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Comprar {
	
	@GetMapping(value = "/comprar")
	public String comprar() {
		return "comprar";
	}

}