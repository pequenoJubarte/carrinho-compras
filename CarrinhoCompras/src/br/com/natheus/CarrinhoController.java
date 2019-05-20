package br.com.natheus;

import java.util.ArrayList;
import java.util.TreeMap;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CarrinhoController {
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView inicio() {
		return new ModelAndView("addProduto", "command", new Produto());
	}

	@RequestMapping(value = "/adicionaProduto", method = RequestMethod.POST)
	public String addProduto(@ModelAttribute("SpringWeb") Produto produto, ModelMap model, HttpServletRequest request) {

		model.addAttribute("nome", produto.getNome());
		model.addAttribute("preco", produto.getQuantidade());
		model.addAttribute("quantidade", produto.getQuantidade());

		TreeMap<String, Produto> produtos = (TreeMap<String, Produto>) request.getSession().getAttribute("produtos");
		if (produtos == null) {
			produtos = new TreeMap<String, Produto>();
		}
		produtos.put(produto.getNome().toUpperCase(), produto);
		request.getSession().setAttribute("produtos", produtos);
		return "listaProdutos";
	}

	@RequestMapping(value = "/listarProdutos", method = RequestMethod.GET)
	public ModelAndView listarProdutos() {
		return new ModelAndView("listaProdutos");
	}
}
