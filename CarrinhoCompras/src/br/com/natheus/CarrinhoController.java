package br.com.natheus;

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
	public String index(HttpServletRequest request) {
		return "index";
	}

	@RequestMapping(value = "/formAddProduto", method = RequestMethod.GET)
	public ModelAndView formularioProduto() {
		return new ModelAndView("adicionarProduto", "command", new Produto());
	}

	@RequestMapping(value = "/adicionarProduto", method = RequestMethod.POST)
	public String addProduto(@ModelAttribute("SpringWeb") Produto produto, ModelMap model, HttpServletRequest request) {

		Carrinho carrinho = (Carrinho) request.getSession().getAttribute("carrinho");
		if (carrinho == null) {
			carrinho = new Carrinho();
		}
		carrinho.adicionarProduto(produto);

		Frete frete = carrinho.getFrete();
		frete.setPrecoTotal(carrinho.calcularFrete(frete.getCepDestinatario()));
		carrinho.setFrete(frete);
		request.getSession().setAttribute("carrinho", carrinho);

		model.addAttribute("nome", produto.getNome());
		model.addAttribute("preco", produto.getPreco());
		model.addAttribute("quantidade", produto.getQuantidade());

		return "listarProdutos";
	}

	@RequestMapping(value = "/listarProdutos", method = RequestMethod.GET)
	public String listarProdutos() {
		return "listarProdutos";
	}

	@RequestMapping(value = "/formCalcularFrete", method = RequestMethod.GET)
	public ModelAndView formularioFrete() {
		return new ModelAndView("calcularFrete", "command", new Frete());
	}

	@RequestMapping(value = "/calcularFrete", method = RequestMethod.POST)
	public String calcularFrete(@ModelAttribute("SpringWeb") Frete frete, HttpServletRequest request) {
		Carrinho carrinho = (Carrinho) request.getSession().getAttribute("carrinho");
		frete.setPrecoTotal(carrinho.calcularFrete(frete.getCepDestinatario()));

		carrinho.setFrete(frete);

		request.getSession().setAttribute("carrinho", carrinho);

		return "listarProdutos";
	}

}