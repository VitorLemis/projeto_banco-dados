package DAO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import Estudo_java.MainWindow;

public class AcessoMysql{
	private static final String sql_insert = "INSERT INTO USUARIOS (ID, NOME, IDADE, NACIONALIDADE) VALUES (DEFAULT, ?, ?, DEFAULT)";
	private static final String sql_select = "SELECT * FROM USUARIOS";
	private static PreparedStatement preparedStatement;
	private static Statement statement;
	private static ResultSet resultSet;
	private static int linha;
	public AcessoMysql() {
		linha = 0;
	}
	@SuppressWarnings("finally")
	public static int setBancoDados(String nome, int idade) {
		try {
			preparedStatement = conexao.conexaoJDBC().prepareStatement(sql_insert);
			preparedStatement.setString(1, nome);
			preparedStatement.setInt(2, idade);
			linha = preparedStatement.executeUpdate();
			//preparedStatement.close();
		} catch (SQLException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Esse nome de usuario ja existe !");
		}finally {
			return linha;
		}
	}
	public static boolean getBancoDados() {
		try {
			statement = conexao.conexaoJDBC().createStatement();
			resultSet = statement.executeQuery(sql_select);
			ResultSetMetaData metaData = resultSet.getMetaData();
		    int columnCount = metaData.getColumnCount();

		    while (resultSet.next()) {
		    	for (int c = 1; c <= columnCount; c++) { // Loop através de todas as colunas
		    		try {
		    			String valorColuna = resultSet.getString(c);
		    			if (valorColuna != null && valorColuna.equals(MainWindow.fieldCadastrarNome.getText())) {
		    				System.out.println("nome encontrado no banco dados / posição da coluna na tabela: " + c);
		                    return true;
		    			} else {
		                    System.out.println("nome não encontrado na coluna " + c + " da linha atual");
		    			}
		                } catch (SQLException columnException) {
		                    System.err.println("Erro ao acessar a coluna " + c + ": " + columnException.getMessage());
		                }
		            }
		        }
			//statement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
}
