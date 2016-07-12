/**
 * 
 */
package br.com.superamedia.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Gerenciador de REQUISITOS
 * 
 * @author Rafael Martins
 * @since 08/08/2016
 * @version 1.0
 */
@Controller
public class RequisitoController {

	@RequestMapping("/home/")
	public String home() {
		return "index";
	}

}
