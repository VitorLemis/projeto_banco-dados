package DAO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Estudo_java.DadosUser;

public class AcessoMysql{
	private static final String sql_insert = "INSERT INTO USUARIOS (ID, NOME, IDADE, NACIONALIDADE) VALUES (DEFAULT, ?, ?, DEFAULT)";
	private static PreparedStatement statement;
	private static ResultSet resultSet;
	private static DadosUser dadosUser;
	private static String nome;
	private static int idade;
	public AcessoMysql() {
		
	}
	public static void setBancoDados(String nome, int idade) {
		AcessoMysql.nome = nome;
		AcessoMysql.idade = idade;
		try {
			statement = conexao.conexaoJDBC().prepareStatement(sql_insert);
			statement.setString(1, nome);
			statement.setInt(2, idade);
			statement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "erro esse nome de usuario ja existe !");
		}
	}
}
