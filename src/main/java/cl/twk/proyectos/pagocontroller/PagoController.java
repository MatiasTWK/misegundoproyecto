package cl.twk.proyectos.pagocontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PagoController {
	
	@GetMapping(value = "/pago")
	public String pago() {
		return "pago";
	}

}
