package br.com.loja.mvc.modelo;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import sun.awt.windows.ThemeReader;


import br.com.loja.jdbc.ConnectionFactory;

public class ContatoDao {
	
	private Connection connection;
	
	public ContatoDao() {
	 this.connection = new ConnectionFactory().getConnection();
	}
	
	public void adicona (Produto produto){
		
		String sql = "insert into contato" + "(nome,preco,data)" + "values (?,?,?)";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, produto.getNome());
			stmt.setDouble(2, produto.getPreco());
			stmt.setDate(4, new Date(produto.getDtCadastro().getTimeInMillis()));
			
			//executa
			stmt.execute();
			stmt.close();
			
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		
	}

}
