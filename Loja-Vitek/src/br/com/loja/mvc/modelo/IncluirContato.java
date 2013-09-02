package br.com.loja.mvc.modelo;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class IncluirContato implements Logica {

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse res) {
		Produto p = new Produto();
		
		p.setNome(req.getParameter("nome"));
		String preco = req.getParameter("preco");
		p.setPreco(Double.parseDouble(preco));
		p.setDtCadastro(Calendar.getInstance());
		
		
		
		return "/produto-adiciona.jsp";
	}

}
