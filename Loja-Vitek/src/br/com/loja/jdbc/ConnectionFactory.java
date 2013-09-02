package br.com.loja.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;


public class ConnectionFactory  {
	
	public Connection getConnection (){
		try {
			return DriverManager.getConnection("jdbc:mysql://localhost/contato", "root", "root");

			
		} catch (Exception e) {
			throw new RuntimeException("Erro ao conectar no BD", e);
		}
	}

}
