package executavel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import dao.ContaDao;
import dominio.Conta;
import factory.ConnectionFactory;

public class TestaConexao {

	

	public static void main(String[] args) {
		try {
//		
//			Connection con = ConnectionFactory.getConnection();
//			
//			 Statement comando = con.createStatement();
//			  
//			 ResultSet resultado = comando.getResultSet();
//			 
//			 while(resultado.next()) {
//				 
//				 String numeroConta = resultado.getString("numeroConta");
//				 System.out.println( numeroConta);
//			 }
//	
//
//			 con.close();
			
			
			ContaDao contaDao = new ContaDao();
			
			
			
			Conta conta = new Conta("002","0006");
			contaDao.save(conta);
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
}
