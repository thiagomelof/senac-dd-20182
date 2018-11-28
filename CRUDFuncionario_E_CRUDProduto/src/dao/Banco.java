package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Banco {

	private static final String driver = "com.mysql.cj.jdbc.Driver";
	private static final String banco = "dbproduto";
	private static final String conexao = "jdbc:mysql://localhost:3306/" + banco +"?useTimezone=true&serverTimezone=UTC&useSSL=false";
	private static final String user = "root";
	private static final String password = ""; 
	
	public static Connection getConnection(){
		try {
			Connection conn = null;
			Class.forName(driver);
			conn = DriverManager.getConnection(conexao, user, password);
			return conn;
		} catch (ClassNotFoundException e) {
			System.out.println("Classe do Driver n�o foi encontrada." + e);
			return null;
		} catch (SQLException e) {
			System.out.println("Erro ao obter a Connection." + e);
			return null;
		}
	}
	
	public static void closeConnection(Connection conn){
		try {
			if(conn != null){
				conn.close();
			}
		} catch (SQLException e) {
			System.out.println("Problema no fechamento da conex�o.");
		}	
	}
	
	public static Statement getStatement(Connection conn){
		try {
			Statement stmt = conn.createStatement();
			return stmt;
		} catch (SQLException e) {
			System.out.println("Erro ao obter o Statement.");
			return null;
		}
	}
		
	public static void closeStatement(Statement stmt){
		try {
			if(stmt != null){
				stmt.close();
			}
		} catch (SQLException e) {
			System.out.println("Problema no fechamento do Statement.");
		}	
	}
	
	
	public static PreparedStatement getPreparedStatement(Connection conn, String sql) {
		try {
			PreparedStatement stmt = conn.prepareStatement(sql);
			return stmt;
		} catch (Exception e) {
			System.out.println("Erro ao obter o PreparedStatement.");
			return null;
		}
	}
	
	public static PreparedStatement getPreparedStatement(Connection conn, String sql, int tipoRetorno) {
		try {
			PreparedStatement stmt = conn.prepareStatement(sql, tipoRetorno);
			return stmt;
		} catch (Exception e) {
			System.out.println("Erro ao obter o PreparedStatement.");
 			return null;
 		}
 	}
	 

	public static void closePreparedStatement(Statement stmt){
		try {
			if(stmt != null){
				stmt.close();
			}
		} catch (SQLException e) {
			System.out.println("Problema no fechamento do PreparedStatement.");
		}	
	}
	
	public static void closeResultSet(ResultSet result){
		try {
			if(result != null){
				result.close();
			}
		} catch (SQLException e) {
			System.out.println("Problema no fechamento do ResultSet");
		}
	}
}
