package mvc;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.RequestMapping;

/***/
@Controller
public class ControladorDemo {
	@RequestMapping
	public String miPagina() {
		return "paginaEjemplo";
	}
}
