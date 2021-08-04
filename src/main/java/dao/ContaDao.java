package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import dominio.Conta;
import factory.ConnectionFactory;

public class ContaDao {
	Connection conexao;
	
	public ContaDao() throws SQLException {
		conexao = ConnectionFactory.getConnection();
	}
	
	public void save(Conta conta) throws SQLException {
		Statement comando = conexao.createStatement();
		
		comando.execute(
				"insert into conta (numeroConta,numeroAgencia) values( '" 
			    + conta.getNumeroConta() + "','" 
			    + conta.getNumeroAgencia() +"');"
			);
		
	}
	

}
