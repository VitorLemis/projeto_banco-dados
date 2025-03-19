package Estudo_java;
import javax.swing.JFrame;

public class MainWindow {
	JFrame janelaFrame;
	MainWindow() {
		janelaFrame = new JFrame();
	}
	public void show() {
		janelaFrame.setTitle("Cadastro USER");
		janelaFrame.setVisible(true);
		janelaFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janelaFrame.setLocationRelativeTo(null);
		janelaFrame.setSize(700, 500);
	}
}
