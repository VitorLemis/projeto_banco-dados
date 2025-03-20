package DAO;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;

public class conexao {
	private static String url = "jdbc:mysql://localhost:3306/PESSOAS";
	private static String user = "root";
	private static String root = "root1234";
	private static Connection connection;
	public static Connection conexaoJDBC() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			if (connection == null) {
				connection = DriverManager.getConnection(url, user, root);
			}
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			return connection;
		}
	}
}
