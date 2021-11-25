package cl.twk.proyectos.retirocontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RetiroController {
	
	@GetMapping(value = "/retirotienda")
	public String retirotienda() {
		return "retirotienda";
	}
	

}
