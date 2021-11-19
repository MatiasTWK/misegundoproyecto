package cl.twk.proyectos.ejemploscontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EjemplosController {
	
		@GetMapping(value = "/ejemplos")
		public String ejemplos() {
			return "ejemplos"; 
		}

}
