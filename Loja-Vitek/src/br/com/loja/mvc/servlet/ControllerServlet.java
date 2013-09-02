package br.com.loja.mvc.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.loja.mvc.modelo.Logica;

	public class ControllerServlet extends HttpServlet{
		
		@Override
		protected void service(HttpServletRequest req, HttpServletResponse res)
				throws ServletException, IOException {
			
			String parametro = req.getParameter("logica");
			String nomedaClasse = "br.com.loja.mvc.modelo." + parametro;
			try{
				Class<?> classe = Class.forName(nomedaClasse);
				Logica log = (Logica)classe.newInstance();
				String url = log.executa(req, res);
				
				
				RequestDispatcher rd = req.getRequestDispatcher(url);
				rd.forward(req, res);
				
				
			}catch(Exception e){
				throw new ServletException("Erro na logica do sistema",e);
			}
			
		}

}
