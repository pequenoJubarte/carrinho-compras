package br.com.natheus;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CarrinhoController {
	@RequestMapping(value ="/addProduto", method = RequestMethod.POST)
	public ModelAndView addProduto() {
		String message = "Hello World";
		return new ModelAndView("addProduto", "message", message);
	}

}
