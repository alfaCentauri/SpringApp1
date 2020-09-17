package mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Ejemplo de petición y respuesta a un formulario.
 * @author Ricardo Presilla.
 * @version 1.0.
 */
@Controller
public class HolaAlumnosControlador {
	/**
	 * Proporciona el formulario.
	 **/
	@RequestMapping("/muestraFormulario")
	public String muestraFormulario() {
		return "HolaAlumnoFormulario";
	}
	
	/**
	 * Proporciona la respuesta al formulario.
	 **/
	@RequestMapping("/procesarFormulario")
	public String procesarFormulario() {
		return "HolaAlumnosSpring";
	}
}
