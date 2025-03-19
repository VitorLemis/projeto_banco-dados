package Estudo_java;
import javax.swing.SwingUtilities;

public class Main {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable () {
			public void run() {
				MainWindow mainWindow = new MainWindow();
				mainWindow.show();
			}
		});
	}

}
