package com.application.interfaces;

import java.sql.Connection;
import java.sql.SQLException;

//Design Pattern de Cria��o -> Factory Method
public interface Conexao {
	
	Connection getConnection() throws SQLException;
	
}
