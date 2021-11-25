package cl.twk.proyectos.webpaycontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebpayController {
	@GetMapping(value = "/webpay")
	public String webpay() {
		return "webpay";
	}

}
