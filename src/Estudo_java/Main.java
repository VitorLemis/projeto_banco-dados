package Estudo_java;
import javax.swing.SwingUtilities;

import DAO.conexao;

public class Main {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable () {
			public void run() {
				MainWindow mainWindow = new MainWindow();
				mainWindow.show();
			}
		});
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				conexao.conexaoJDBC();
			}
		});
		thread.start();
	}

}
